package live.hms.video.utils;

import java.util.concurrent.TimeUnit;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0006\n\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\b\"\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\b\"\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0018\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u000e\u0010\u001a\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u001dX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u001dX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010*\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010+\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010,\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006-"}, m65681d2 = {"cJsonRpcVersion", "", "cApiDataChannelLabel", "cMaxTransportRetryDelay", "", "cMaxTransportRetryDelayUnit", "Ljava/util/concurrent/TimeUnit;", "getCMaxTransportRetryDelayUnit", "()Ljava/util/concurrent/TimeUnit;", "cMaxTransportRetries", "", "cMaxTransportRetryTimeMillis", "cMaxJoinAPIRetryTimeMillis", "cDefaultInitEndpoint", "cDefaultDiagnosticEndpoint", "cPublishRenegotiationCallback", "cSubscribeRenegotiationCallback", "cSubscribeIceRestartWaitTimeout", "cSubscribeIceRestartWaitTimeoutUnit", "getCSubscribeIceRestartWaitTimeoutUnit", "cInconsistencyDetectTimerDelay", "cInconsistencyDetectTimerDelayTimeUnit", "getCInconsistencyDetectTimerDelayTimeUnit", "cInconsistencyDetectBufferDelay", "cInconsistencyDetectBufferDelayTimeUnit", "getCInconsistencyDetectBufferDelayTimeUnit", "WEBRTC_STATS_LOOP_DELAY_PERIOD", "SCREEN_SHARE_NOTIFICATION_INTENT_NAME", "BYTES_IN_A_KILOBYTE", "", "MILLISECONDS_IN_A_SECOND", "SPEEDTEST_DOWNLOAD_CHUNK_SIZE", "TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS", "TIMEOUT_FOR_PREFER_LAYER_RESPONSE", "CHECK_WHETHER_TIMESTAMP_OR_INTERVAL", "EVENT_PROD_URL", "EVENT_NON_PROD_URL", "TOKEN_URL", "LAYOUT_URL", "WHITE_BOARD_URL", "WHITE_BOARD_QA_URL", "RPC_MAX_RETRY", "DEFAULT_MAX_PEER_COUNT", "DEFAULT_SESSION_METADATA_KEY", "CAPTIONS_BROADCAST_MESSAGE_TYPE", "lib_release"}, m65682k = 2, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSConstantsKt {
    public static final double BYTES_IN_A_KILOBYTE = 1024.0d;
    public static final String CAPTIONS_BROADCAST_MESSAGE_TYPE = "hms_transcript";
    public static final int CHECK_WHETHER_TIMESTAMP_OR_INTERVAL = 1000000000;
    public static final long DEFAULT_MAX_PEER_COUNT = 1;
    public static final String DEFAULT_SESSION_METADATA_KEY = "default";
    public static final String EVENT_NON_PROD_URL = "https://event-nonprod.100ms.live/v2/client/report";
    public static final String EVENT_PROD_URL = "https://event.100ms.live/v2/client/report";
    public static final String LAYOUT_URL = "https://api.100ms.live";
    public static final double MILLISECONDS_IN_A_SECOND = 1000.0d;
    public static final int RPC_MAX_RETRY = 2;
    public static final String SCREEN_SHARE_NOTIFICATION_INTENT_NAME = "hms_screenshare_notification_extra";
    public static final long SPEEDTEST_DOWNLOAD_CHUNK_SIZE = 8192;
    public static final long TIMEOUT_FOR_LOW_SPEED_INDICATOR_MILLIS = 3000;
    public static final long TIMEOUT_FOR_PREFER_LAYER_RESPONSE = 60000;
    public static final String TOKEN_URL = "https://auth.100ms.live";
    public static final long WEBRTC_STATS_LOOP_DELAY_PERIOD = 1000;
    public static final String WHITE_BOARD_QA_URL = "https://whiteboard-qa.100ms.live";
    public static final String WHITE_BOARD_URL = "https://whiteboard.100ms.live";
    public static final String cApiDataChannelLabel = "ion-sfu";
    public static final String cDefaultDiagnosticEndpoint = "https://api.100ms.live/v2/diagnostics/token";
    public static final String cDefaultInitEndpoint = "https://prod-init.100ms.live/init";
    public static final long cInconsistencyDetectBufferDelay = 5000;
    private static final TimeUnit cInconsistencyDetectBufferDelayTimeUnit;
    public static final long cInconsistencyDetectTimerDelay = 1000;
    private static final TimeUnit cInconsistencyDetectTimerDelayTimeUnit;
    public static final String cJsonRpcVersion = "2.0";
    public static final long cMaxJoinAPIRetryTimeMillis = 500;
    public static final int cMaxTransportRetries = 5;
    public static final long cMaxTransportRetryDelay = 60000;
    private static final TimeUnit cMaxTransportRetryDelayUnit;
    public static final long cMaxTransportRetryTimeMillis = 60000;
    public static final String cPublishRenegotiationCallback = "publish-renegotiation-callback";
    public static final long cSubscribeIceRestartWaitTimeout = 60000;
    private static final TimeUnit cSubscribeIceRestartWaitTimeoutUnit;
    public static final String cSubscribeRenegotiationCallback = "subscribe-renegotiation-callback";

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        cMaxTransportRetryDelayUnit = timeUnit;
        cSubscribeIceRestartWaitTimeoutUnit = timeUnit;
        cInconsistencyDetectTimerDelayTimeUnit = timeUnit;
        cInconsistencyDetectBufferDelayTimeUnit = timeUnit;
    }

    public static final TimeUnit getCInconsistencyDetectBufferDelayTimeUnit() {
        return cInconsistencyDetectBufferDelayTimeUnit;
    }

    public static final TimeUnit getCInconsistencyDetectTimerDelayTimeUnit() {
        return cInconsistencyDetectTimerDelayTimeUnit;
    }

    public static final TimeUnit getCMaxTransportRetryDelayUnit() {
        return cMaxTransportRetryDelayUnit;
    }

    public static final TimeUnit getCSubscribeIceRestartWaitTimeoutUnit() {
        return cSubscribeIceRestartWaitTimeoutUnit;
    }
}
