package io.observa.api.constants;

public final class MetricNames {
  public static final String HTTP_SERVER_REQUESTS = "http.server.requests";
  public static final String HTTP_CLIENT_REQUESTS = "http.client.requests";
  public static final String DB_OPERATIONS = "db.operations";
  public static final String KAFKA_CONSUMER_BATCH = "kafka.consumer.batch";
  public static final String JDBC_QUERY_TIME = "jdbc.query.time";
  public static final String ERRORS = "errors";

  private MetricNames() {}
}
