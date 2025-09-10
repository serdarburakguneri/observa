package io.observa.api.constants;

public final class ErrorCodes {
  public static final String TIMEOUT = "timeout";
  public static final String CANCELLED = "cancelled";
  public static final String IO = "io";
  public static final String HTTP_4XX = "http_4xx";
  public static final String HTTP_5XX = "http_5xx";
  public static final String DB = "db";
  public static final String KAFKA = "kafka";

  private ErrorCodes() {}
}
