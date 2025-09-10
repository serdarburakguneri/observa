package io.observa.api.constants;

public final class ConfigKeys {
  public static final String PREFIX = "observa.";
  public static final String SERVICE_NAME = PREFIX + "service.name";
  public static final String SAMPLING_RATIO = PREFIX + "sampling.ratio";
  public static final String SAMPLING_RULES = PREFIX + "sampling.rules";
  public static final String REDACTION_KEYS = PREFIX + "redaction.keys";
  public static final String REDACTION_VALUE_MAX_BYTES = PREFIX + "redaction.value.max_bytes";
  public static final String EXPORTER_OTLP_ENABLED = PREFIX + "exporter.otlp.enabled";
  public static final String EXPORTER_OTLP_ENDPOINT = PREFIX + "exporter.otlp.endpoint";
  public static final String EXPORTER_PROM_ENABLED = PREFIX + "exporter.prom.enabled";
  public static final String EXPORTER_PROM_PORT = PREFIX + "exporter.prom.port";
  public static final String EXPORTER_LOGBACK_ENABLED = PREFIX + "exporter.logback.enabled";
  public static final String CONTEXT_PROPAGATORS = PREFIX + "context.propagators";
  public static final String HTTP_SERVER_ENABLED = PREFIX + "http.server.enabled";
  public static final String HTTP_CLIENT_ENABLED = PREFIX + "http.client.enabled";
  public static final String KAFKA_ENABLED = PREFIX + "kafka.enabled";
  public static final String JDBC_ENABLED = PREFIX + "jdbc.enabled";

  private ConfigKeys() {}
}
