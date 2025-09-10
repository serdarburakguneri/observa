package io.observa.api;

public interface SamplingDecision {
  boolean isSampled();

  String getReason();
}
