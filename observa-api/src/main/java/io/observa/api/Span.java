package io.observa.api;

import java.util.Map;

public interface Span extends AutoCloseable {
  String getTraceId();

  String getSpanId();

  Span setAttribute(String key, String value);

  Span setAttribute(String key, long value);

  Span setAttribute(String key, boolean value);

  Span addEvent(String name, Map<String, String> attributes);

  Span recordException(Throwable error);

  void end();

  @Override
  void close();
}
