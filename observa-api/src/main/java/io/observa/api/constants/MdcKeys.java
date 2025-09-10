package io.observa.api.constants;

public final class MdcKeys {
  public static final String TRACE_ID = "trace_id";
  public static final String SPAN_ID = "span_id";
  public static final String PARENT_SPAN_ID = "parent_span_id";
  public static final String SAMPLED = "sampled";

  private MdcKeys() {}
}
