package io.observa.api;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class Observa {
  private static final AtomicReference<Tracer> TRACER =
      new AtomicReference<>(new impl.NoopTracer());
  private static final AtomicReference<Meter> METER = new AtomicReference<>(new impl.NoopMeter());
  private static final AtomicReference<LoggerEnricher> LOGGER_ENRICHER =
      new AtomicReference<>(new impl.NoopLoggerEnricher());

  public static Tracer tracer() {
    return TRACER.get();
  }

  public static Meter meter() {
    return METER.get();
  }

  public static LoggerEnricher loggerEnricher() {
    return LOGGER_ENRICHER.get();
  }

  public static void setTracer(Tracer tracer) {
    TRACER.set(tracer);
  }

  public static void setMeter(Meter meter) {
    METER.set(meter);
  }

  public static void setLoggerEnricher(LoggerEnricher enricher) {
    LOGGER_ENRICHER.set(enricher);
  }

  private Observa() {}

  public static final class impl {
    public static final class NoopSpan implements Span {
      public String getTraceId() {
        return "";
      }

      public String getSpanId() {
        return "";
      }

      public Span setAttribute(String key, String value) {
        return this;
      }

      public Span setAttribute(String key, long value) {
        return this;
      }

      public Span setAttribute(String key, boolean value) {
        return this;
      }

      public Span addEvent(String name, Map<String, String> attributes) {
        return this;
      }

      public Span recordException(Throwable error) {
        return this;
      }

      public void end() {}

      public void close() {}
    }

    public static final class NoopSpanScope implements SpanScope {
      public void close() {}
    }

    public static final class NoopTracer implements Tracer {
      public Span startSpan(String name) {
        return new NoopSpan();
      }

      public Span startSpan(String name, SpanKind kind) {
        return new NoopSpan();
      }

      public Span startSpan(String name, SpanKind kind, Map<String, String> attributes) {
        return new NoopSpan();
      }

      public SpanScope withSpan(Span span) {
        return new NoopSpanScope();
      }
    }

    public static final class NoopCounter implements Counter {
      public void increment() {}

      public void increment(long amount) {}
    }

    public static final class NoopTimer implements Timer {
      public void record(java.time.Duration duration) {}
    }

    public static final class NoopHistogram implements Histogram {
      public void record(long value) {}
    }

    public static final class NoopMeter implements Meter {
      public Counter counter(String name) {
        return new NoopCounter();
      }

      public Timer timer(String name) {
        return new NoopTimer();
      }

      public Histogram histogram(String name) {
        return new NoopHistogram();
      }
    }

    public static final class NoopLoggerEnricher implements LoggerEnricher {
      public Map<String, String> currentContext() {
        return Collections.emptyMap();
      }
    }
  }
}
