package io.observa.api.constants;

public final class TagKeys {
  public static final String SERVICE_NAME = "service.name";
  public static final String OPERATION = "operation";
  public static final String HTTP_METHOD = "http.method";
  public static final String HTTP_ROUTE = "http.route";
  public static final String HTTP_STATUS = "http.status_code";
  public static final String PEER_SERVICE = "peer.service";
  public static final String DB_SYSTEM = "db.system";
  public static final String DB_OPERATION = "db.operation";
  public static final String MESSAGING_SYSTEM = "messaging.system";
  public static final String MESSAGING_TOPIC = "messaging.topic";
  public static final String ERROR = "error";
  public static final String ERROR_CODE = "error.code";
  public static final String RETRY_COUNT = "retry.count";

  private TagKeys() {}
}
