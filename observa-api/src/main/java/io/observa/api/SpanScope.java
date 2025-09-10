package io.observa.api;

public interface SpanScope extends AutoCloseable {
  @Override
  void close();
}
