package io.observa.api;

import java.util.Map;

public interface Redactor {
  Map<String, String> redact(Map<String, String> input);

  String redactValue(String key, String value);
}
