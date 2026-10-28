package live.hms.video.sdk.models;

import java.util.List;
import live.hms.video.media.settings.HMSRtmpVideoResolution;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSRecordingConfig;", "", "meetingUrl", "", "rtmpUrls", "", "record", "", "resolution", "Llive/hms/video/media/settings/HMSRtmpVideoResolution;", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLlive/hms/video/media/settings/HMSRtmpVideoResolution;)V", "getMeetingUrl", "()Ljava/lang/String;", "getRtmpUrls", "()Ljava/util/List;", "getRecord", "()Z", "getResolution", "()Llive/hms/video/media/settings/HMSRtmpVideoResolution;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSRecordingConfig {
    private final String meetingUrl;
    private final boolean record;
    private final HMSRtmpVideoResolution resolution;
    private final List<String> rtmpUrls;

    public HMSRecordingConfig(String str, List<String> rtmpUrls, boolean z4, HMSRtmpVideoResolution hMSRtmpVideoResolution) {
        AbstractC22676k.m65750j(rtmpUrls, "rtmpUrls");
        this.meetingUrl = str;
        this.rtmpUrls = rtmpUrls;
        this.record = z4;
        this.resolution = hMSRtmpVideoResolution;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HMSRecordingConfig copy$default(HMSRecordingConfig hMSRecordingConfig, String str, List list, boolean z4, HMSRtmpVideoResolution hMSRtmpVideoResolution, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hMSRecordingConfig.meetingUrl;
        }
        if ((i13 & 2) != 0) {
            list = hMSRecordingConfig.rtmpUrls;
        }
        if ((i13 & 4) != 0) {
            z4 = hMSRecordingConfig.record;
        }
        if ((i13 & 8) != 0) {
            hMSRtmpVideoResolution = hMSRecordingConfig.resolution;
        }
        return hMSRecordingConfig.copy(str, list, z4, hMSRtmpVideoResolution);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMeetingUrl() {
        return this.meetingUrl;
    }

    public final List<String> component2() {
        return this.rtmpUrls;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getRecord() {
        return this.record;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HMSRtmpVideoResolution getResolution() {
        return this.resolution;
    }

    public final HMSRecordingConfig copy(String meetingUrl, List<String> rtmpUrls, boolean record, HMSRtmpVideoResolution resolution) {
        AbstractC22676k.m65750j(rtmpUrls, "rtmpUrls");
        return new HMSRecordingConfig(meetingUrl, rtmpUrls, record, resolution);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSRecordingConfig)) {
            return false;
        }
        HMSRecordingConfig hMSRecordingConfig = (HMSRecordingConfig) other;
        return AbstractC22676k.m65745e(this.meetingUrl, hMSRecordingConfig.meetingUrl) && AbstractC22676k.m65745e(this.rtmpUrls, hMSRecordingConfig.rtmpUrls) && this.record == hMSRecordingConfig.record && AbstractC22676k.m65745e(this.resolution, hMSRecordingConfig.resolution);
    }

    public final String getMeetingUrl() {
        return this.meetingUrl;
    }

    public final boolean getRecord() {
        return this.record;
    }

    public final HMSRtmpVideoResolution getResolution() {
        return this.resolution;
    }

    public final List<String> getRtmpUrls() {
        return this.rtmpUrls;
    }

    public int hashCode() {
        String str = this.meetingUrl;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.rtmpUrls), 31, this.record);
        HMSRtmpVideoResolution hMSRtmpVideoResolution = this.resolution;
        return iM8289b + (hMSRtmpVideoResolution != null ? hMSRtmpVideoResolution.hashCode() : 0);
    }

    public String toString() {
        return "HMSRecordingConfig(meetingUrl=" + this.meetingUrl + ", rtmpUrls=" + this.rtmpUrls + ", record=" + this.record + ", resolution=" + this.resolution + ')';
    }

    public /* synthetic */ HMSRecordingConfig(String str, List list, boolean z4, HMSRtmpVideoResolution hMSRtmpVideoResolution, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, list, z4, (i13 & 8) != 0 ? null : hMSRtmpVideoResolution);
    }
}
