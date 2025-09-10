package io.observa.api;

import java.util.Map;

public interface LoggerEnricher {
  Map<String, String> currentContext();
}
