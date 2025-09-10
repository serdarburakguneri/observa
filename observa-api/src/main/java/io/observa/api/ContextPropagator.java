package io.observa.api;

import java.util.Map;

public interface ContextPropagator {
  void inject(Span span, Map<String, String> carrier);

  Span extract(Map<String, String> carrier);
}
