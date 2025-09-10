package io.observa.api;

public interface Meter {
  Counter counter(String name);

  Timer timer(String name);

  Histogram histogram(String name);
}
