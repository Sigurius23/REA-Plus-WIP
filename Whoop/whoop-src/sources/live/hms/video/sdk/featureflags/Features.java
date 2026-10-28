package live.hms.video.sdk.featureflags;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m65681d2 = {"Llive/hms/video/sdk/featureflags/Features;", "", "serverName", "", "<init>", "(Ljava/lang/String;)V", "getServerName", "()Ljava/lang/String;", "SERVER_SIDE_SUBSCRIBE_DEGRADATION", "NON_WEBRTC_DISABLE_OFFER", "SIMULCAST", "EFFECTS_SDK_ENABLED", "PUBLISH_STATS", "SUBSCRIBER_STATS", "SOFTWARE_ECHO_CANCELLATION_ENABLED", "HIPPA_ROOM", "NOISE_CANCELLATION", "Llive/hms/video/sdk/featureflags/Features$EFFECTS_SDK_ENABLED;", "Llive/hms/video/sdk/featureflags/Features$HIPPA_ROOM;", "Llive/hms/video/sdk/featureflags/Features$NOISE_CANCELLATION;", "Llive/hms/video/sdk/featureflags/Features$NON_WEBRTC_DISABLE_OFFER;", "Llive/hms/video/sdk/featureflags/Features$PUBLISH_STATS;", "Llive/hms/video/sdk/featureflags/Features$SERVER_SIDE_SUBSCRIBE_DEGRADATION;", "Llive/hms/video/sdk/featureflags/Features$SIMULCAST;", "Llive/hms/video/sdk/featureflags/Features$SOFTWARE_ECHO_CANCELLATION_ENABLED;", "Llive/hms/video/sdk/featureflags/Features$SUBSCRIBER_STATS;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class Features {
    private final String serverName;

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/sdk/featureflags/Features$EFFECTS_SDK_ENABLED;", "Llive/hms/video/sdk/featureflags/Features;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class EFFECTS_SDK_ENABLED extends Features {
        public static final EFFECTS_SDK_ENABLED INSTANCE = new EFFECTS_SDK_ENABLED();

        private EFFECTS_SDK_ENABLED() {
            super("effectsSDKEnabled", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/sdk/featureflags/Features$HIPPA_ROOM;", "Llive/hms/video/sdk/featureflags/Features;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class HIPPA_ROOM extends Features {
        public static final HIPPA_ROOM INSTANCE = new HIPPA_ROOM();

        private HIPPA_ROOM() {
            super("hipaa", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/sdk/featureflags/Features$NOISE_CANCELLATION;", "Llive/hms/video/sdk/featureflags/Features;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class NOISE_CANCELLATION extends Features {
        public static final NOISE_CANCELLATION INSTANCE = new NOISE_CANCELLATION();

        private NOISE_CANCELLATION() {
            super("noiseCancellation", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/sdk/featureflags/Features$NON_WEBRTC_DISABLE_OFFER;", "Llive/hms/video/sdk/featureflags/Features;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class NON_WEBRTC_DISABLE_OFFER extends Features {
        public static final NON_WEBRTC_DISABLE_OFFER INSTANCE = new NON_WEBRTC_DISABLE_OFFER();

        private NON_WEBRTC_DISABLE_OFFER() {
            super("nonWebRTCDisableOffer", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/sdk/featureflags/Features$PUBLISH_STATS;", "Llive/hms/video/sdk/featureflags/Features;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class PUBLISH_STATS extends Features {
        public static final PUBLISH_STATS INSTANCE = new PUBLISH_STATS();

        private PUBLISH_STATS() {
            super("publishStats", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/sdk/featureflags/Features$SERVER_SIDE_SUBSCRIBE_DEGRADATION;", "Llive/hms/video/sdk/featureflags/Features;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class SERVER_SIDE_SUBSCRIBE_DEGRADATION extends Features {
        public static final SERVER_SIDE_SUBSCRIBE_DEGRADATION INSTANCE = new SERVER_SIDE_SUBSCRIBE_DEGRADATION();

        private SERVER_SIDE_SUBSCRIBE_DEGRADATION() {
            super("subscribeDegradation", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/sdk/featureflags/Features$SIMULCAST;", "Llive/hms/video/sdk/featureflags/Features;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class SIMULCAST extends Features {
        public static final SIMULCAST INSTANCE = new SIMULCAST();

        private SIMULCAST() {
            super("simulcast", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/sdk/featureflags/Features$SOFTWARE_ECHO_CANCELLATION_ENABLED;", "Llive/hms/video/sdk/featureflags/Features;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class SOFTWARE_ECHO_CANCELLATION_ENABLED extends Features {
        public static final SOFTWARE_ECHO_CANCELLATION_ENABLED INSTANCE = new SOFTWARE_ECHO_CANCELLATION_ENABLED();

        private SOFTWARE_ECHO_CANCELLATION_ENABLED() {
            super("softwareEchoCancellationEnabled", null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Llive/hms/video/sdk/featureflags/Features$SUBSCRIBER_STATS;", "Llive/hms/video/sdk/featureflags/Features;", "<init>", "()V", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class SUBSCRIBER_STATS extends Features {
        public static final SUBSCRIBER_STATS INSTANCE = new SUBSCRIBER_STATS();

        private SUBSCRIBER_STATS() {
            super("subscribeStats", null);
        }
    }

    public /* synthetic */ Features(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getServerName() {
        return this.serverName;
    }

    private Features(String str) {
        this.serverName = str;
    }
}
