package net.xmeter;

public interface Constants {
	public static final String SERVER = "mqtt.server";
	public static final String PORT = "mqtt.port";
	public static final String CONN_TIMEOUT = "mqtt.conn_timeout";
	
	public static final String PROTOCOL = "mqtt.protocol";
	public static final String DUAL_AUTH = "mqtt.dual_ssl_authentication";
	public static final String CERT_FILE_PATH1 = "mqtt.cert_file_path1";
	public static final String CERT_FILE_PATH2 = "mqtt.cert_file_path2";
	public static final String KEY_FILE_USR_NAME = "mqtt.key_file_usr_name";
	public static final String KEY_FILE_PWD = "mqtt.key_file_password";
	
	public static final String CONN_KEEP_TIME = "mqtt.keep_time";
	public static final String CONN_CLIENT_ID_PREFIX = "mqtt.client_id_prefix";

	public static final String CONN_ELAPSED_TIME = "mqtt.conn_elapsed_time";
	public static final String CONN_CLIENT_AUTH = "mqtt.conn_client_auth";
	public static final String CONN_ATTAMPT_MAX = "mqtt.conn_attampt_max";
	public static final String CONN_KEEP_ALIVE = "mqtt.conn_keep_alive";
	public static final String CONN_RECONN_ATTAMPT_MAX = "mqtt.reconn_attampt_max";
	
	public static final String TOPIC_NAME = "mqtt.topic_name";
	public static final String QOS_LEVEL = "mqtt.qos_level";
	public static final String PAYLOAD_SIZE = "mqtt.payload_size";
	
	public static final String TIME_STAMP = "mqtt.time_stamp";
	public static final String TIME_STAMP_SEP_FLAG = "mqtt.ts_sep_flag";
	
	public static final String DEBUG_RESPONSE = "DEBUG_RESPONSE";
	
	public static final int QOS_0 = 0;
	public static final int QOS_1 = 1;
	public static final int QOS_2 = 2;
	
	public static final int MAX_CLIENT_ID_LENGTH = 23;
	
	public static final String DEFAULT_SERVER = "127.0.0.1";
	public static final int DEFAULT_PORT = 1883;
	public static final int DEFAULT_CONN_TIME_OUT = 10;
	public static final String DEFAULT_PROTOCOL = "TCP";
	public static final String DEFAULT_CONN_PREFIX = "conn_";
	public static final int DEFAULT_CONN_KEEP_ALIVE = 300;
	public static final int DEFAULT_CONN_KEEP_TIME = 1800;
	public static final int DEFAULT_CONN_ATTAMPT_MAX = 0;
	public static final int DEFAULT_CONN_RECONN_ATTAMPT_MAX = 0;
}