package live.hms.video.sdk.models;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSHLSConfig;", "", "meetingURLVariants", "", "Llive/hms/video/sdk/models/HMSHLSMeetingURLVariant;", "hmsHlsRecordingConfig", "Llive/hms/video/sdk/models/HMSHlsRecordingConfig;", "<init>", "(Ljava/util/List;Llive/hms/video/sdk/models/HMSHlsRecordingConfig;)V", "getMeetingURLVariants", "()Ljava/util/List;", "getHmsHlsRecordingConfig", "()Llive/hms/video/sdk/models/HMSHlsRecordingConfig;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSHLSConfig {
    private final HMSHlsRecordingConfig hmsHlsRecordingConfig;
    private final List<HMSHLSMeetingURLVariant> meetingURLVariants;

    /* JADX WARN: Multi-variable type inference failed */
    public HMSHLSConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMSHLSConfig copy$default(HMSHLSConfig hMSHLSConfig, List list, HMSHlsRecordingConfig hMSHlsRecordingConfig, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = hMSHLSConfig.meetingURLVariants;
        }
        if ((i13 & 2) != 0) {
            hMSHlsRecordingConfig = hMSHLSConfig.hmsHlsRecordingConfig;
        }
        return hMSHLSConfig.copy(list, hMSHlsRecordingConfig);
    }

    public final List<HMSHLSMeetingURLVariant> component1() {
        return this.meetingURLVariants;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSHlsRecordingConfig getHmsHlsRecordingConfig() {
        return this.hmsHlsRecordingConfig;
    }

    public final HMSHLSConfig copy(List<HMSHLSMeetingURLVariant> meetingURLVariants, HMSHlsRecordingConfig hmsHlsRecordingConfig) {
        return new HMSHLSConfig(meetingURLVariants, hmsHlsRecordingConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSHLSConfig)) {
            return false;
        }
        HMSHLSConfig hMSHLSConfig = (HMSHLSConfig) other;
        return AbstractC22676k.m65745e(this.meetingURLVariants, hMSHLSConfig.meetingURLVariants) && AbstractC22676k.m65745e(this.hmsHlsRecordingConfig, hMSHLSConfig.hmsHlsRecordingConfig);
    }

    public final HMSHlsRecordingConfig getHmsHlsRecordingConfig() {
        return this.hmsHlsRecordingConfig;
    }

    public final List<HMSHLSMeetingURLVariant> getMeetingURLVariants() {
        return this.meetingURLVariants;
    }

    public int hashCode() {
        List<HMSHLSMeetingURLVariant> list = this.meetingURLVariants;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        HMSHlsRecordingConfig hMSHlsRecordingConfig = this.hmsHlsRecordingConfig;
        return iHashCode + (hMSHlsRecordingConfig != null ? hMSHlsRecordingConfig.hashCode() : 0);
    }

    public String toString() {
        return "HMSHLSConfig(meetingURLVariants=" + this.meetingURLVariants + ", hmsHlsRecordingConfig=" + this.hmsHlsRecordingConfig + ')';
    }

    public HMSHLSConfig(List<HMSHLSMeetingURLVariant> list, HMSHlsRecordingConfig hMSHlsRecordingConfig) {
        this.meetingURLVariants = list;
        this.hmsHlsRecordingConfig = hMSHlsRecordingConfig;
    }

    public /* synthetic */ HMSHLSConfig(List list, HMSHlsRecordingConfig hMSHlsRecordingConfig, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : hMSHlsRecordingConfig);
    }
}
