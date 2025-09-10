package io.observa.api;

import static org.assertj.core.api.Assertions.assertThat;

import io.observa.api.constants.ConfigKeys;
import io.observa.api.constants.ErrorCodes;
import io.observa.api.constants.HeaderNames;
import io.observa.api.constants.MdcKeys;
import io.observa.api.constants.MetricNames;
import io.observa.api.constants.TagKeys;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;

class ApiDefaultsTest {
  @Test
  void observaFacadeNoopContracts() {
    Tracer tracer = Observa.tracer();
    Span span = tracer.startSpan("test");
    assertThat(span.getTraceId()).isEmpty();
    assertThat(span.getSpanId()).isEmpty();
    try (SpanScope ignored = tracer.withSpan(span)) {
      span.setAttribute("k", "v").setAttribute("l", 1L).setAttribute("b", true);
      span.addEvent("e", Map.of());
      span.recordException(new RuntimeException("x"));
    }
    span.end();
    assertThat(Observa.meter().counter("c")).isNotNull();
    assertThat(Observa.meter().timer("t")).isNotNull();
    assertThat(Observa.meter().histogram("h")).isNotNull();
    assertThat(Observa.loggerEnricher().currentContext()).isEmpty();
  }

  @Test
  void constantsAreNonEmptyAndUnique() throws Exception {
    assertUniqueNonEmptyConstants(ConfigKeys.class);
    assertUniqueNonEmptyConstants(HeaderNames.class);
    assertUniqueNonEmptyConstants(TagKeys.class);
    assertUniqueNonEmptyConstants(MdcKeys.class);
    assertUniqueNonEmptyConstants(MetricNames.class);
    assertUniqueNonEmptyConstants(ErrorCodes.class);
  }

  private static void assertUniqueNonEmptyConstants(Class<?> type) throws Exception {
    Set<String> values = new HashSet<>();
    for (var f : type.getDeclaredFields()) {
      if (!java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
        continue;
      }
      String v = (String) f.get(null);
      assertThat(v).isNotNull();
      assertThat(v).isNotEmpty();
      assertThat(values.add(v)).isTrue();
    }
  }
}
