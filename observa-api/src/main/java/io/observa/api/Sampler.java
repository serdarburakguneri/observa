package io.observa.api;

import java.util.Map;

public interface Sampler {
  SamplingDecision shouldSample(String traceId, String operation, Map<String, String> attributes);
}
