package io.observa.api;

import java.time.Duration;

public interface Timer {
  void record(Duration duration);
}
