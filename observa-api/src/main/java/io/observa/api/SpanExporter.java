package io.observa.api;

import java.util.Collection;

public interface SpanExporter {
  void export(Collection<Span> spans);
}
