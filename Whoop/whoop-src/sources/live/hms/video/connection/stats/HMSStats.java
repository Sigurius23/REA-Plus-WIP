package live.hms.video.connection.stats;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Llive/hms/video/connection/stats/HMSStats;", "", "<init>", "()V", "HMSLocalStats", "HMSRemoteStats", "Llive/hms/video/connection/stats/HMSStats$HMSLocalStats;", "Llive/hms/video/connection/stats/HMSStats$HMSRemoteStats;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class HMSStats {

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m65681d2 = {"Llive/hms/video/connection/stats/HMSStats$HMSLocalStats;", "Llive/hms/video/connection/stats/HMSStats;", "<init>", "()V", "Llive/hms/video/connection/stats/HMSLocalAudioStats;", "Llive/hms/video/connection/stats/HMSLocalVideoStats;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static abstract class HMSLocalStats extends HMSStats {
        public /* synthetic */ HMSLocalStats(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private HMSLocalStats() {
            super(null);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m65681d2 = {"Llive/hms/video/connection/stats/HMSStats$HMSRemoteStats;", "Llive/hms/video/connection/stats/HMSStats;", "<init>", "()V", "Llive/hms/video/connection/stats/HMSRemoteAudioStats;", "Llive/hms/video/connection/stats/HMSRemoteVideoStats;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static abstract class HMSRemoteStats extends HMSStats {
        public /* synthetic */ HMSRemoteStats(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private HMSRemoteStats() {
            super(null);
        }
    }

    public /* synthetic */ HMSStats(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HMSStats() {
    }
}
