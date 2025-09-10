package io.observa.api;

import java.util.Map;

public interface Tracer {
  Span startSpan(String name);

  Span startSpan(String name, SpanKind kind);

  Span startSpan(String name, SpanKind kind, Map<String, String> attributes);

  SpanScope withSpan(Span span);
}
