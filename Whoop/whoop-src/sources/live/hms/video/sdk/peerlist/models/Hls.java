package live.hms.video.sdk.peerlist.models;

import com.google.gson.annotations.SerializedName;
import live.hms.video.sdk.models.HMSHlsRecordingConfig;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J<\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m65681d2 = {"Llive/hms/video/sdk/peerlist/models/Hls;", "", "enabled", "", "startedAt", "", "hlsRecordingConfig", "Llive/hms/video/sdk/models/HMSHlsRecordingConfig;", "state", "Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;", "<init>", "(ZLjava/lang/Long;Llive/hms/video/sdk/models/HMSHlsRecordingConfig;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;)V", "getEnabled", "()Z", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHlsRecordingConfig", "()Llive/hms/video/sdk/models/HMSHlsRecordingConfig;", "getState", "()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Long;Llive/hms/video/sdk/models/HMSHlsRecordingConfig;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;)Llive/hms/video/sdk/peerlist/models/Hls;", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class Hls {

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("config")
    private final HMSHlsRecordingConfig hlsRecordingConfig;

    @SerializedName("started_at")
    private final Long startedAt;

    @SerializedName("state")
    private final BeamRecordingStates state;

    public Hls(boolean z4, Long l7, HMSHlsRecordingConfig hMSHlsRecordingConfig, BeamRecordingStates beamRecordingStates) {
        this.enabled = z4;
        this.startedAt = l7;
        this.hlsRecordingConfig = hMSHlsRecordingConfig;
        this.state = beamRecordingStates;
    }

    public static /* synthetic */ Hls copy$default(Hls hls, boolean z4, Long l7, HMSHlsRecordingConfig hMSHlsRecordingConfig, BeamRecordingStates beamRecordingStates, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = hls.enabled;
        }
        if ((i13 & 2) != 0) {
            l7 = hls.startedAt;
        }
        if ((i13 & 4) != 0) {
            hMSHlsRecordingConfig = hls.hlsRecordingConfig;
        }
        if ((i13 & 8) != 0) {
            beamRecordingStates = hls.state;
        }
        return hls.copy(z4, l7, hMSHlsRecordingConfig, beamRecordingStates);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HMSHlsRecordingConfig getHlsRecordingConfig() {
        return this.hlsRecordingConfig;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BeamRecordingStates getState() {
        return this.state;
    }

    public final Hls copy(boolean enabled, Long startedAt, HMSHlsRecordingConfig hlsRecordingConfig, BeamRecordingStates state) {
        return new Hls(enabled, startedAt, hlsRecordingConfig, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Hls)) {
            return false;
        }
        Hls hls = (Hls) other;
        return this.enabled == hls.enabled && AbstractC22676k.m65745e(this.startedAt, hls.startedAt) && AbstractC22676k.m65745e(this.hlsRecordingConfig, hls.hlsRecordingConfig) && this.state == hls.state;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final HMSHlsRecordingConfig getHlsRecordingConfig() {
        return this.hlsRecordingConfig;
    }

    public final Long getStartedAt() {
        return this.startedAt;
    }

    public final BeamRecordingStates getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        Long l7 = this.startedAt;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        HMSHlsRecordingConfig hMSHlsRecordingConfig = this.hlsRecordingConfig;
        int iHashCode3 = (iHashCode2 + (hMSHlsRecordingConfig == null ? 0 : hMSHlsRecordingConfig.hashCode())) * 31;
        BeamRecordingStates beamRecordingStates = this.state;
        return iHashCode3 + (beamRecordingStates != null ? beamRecordingStates.hashCode() : 0);
    }

    public String toString() {
        return "Hls(enabled=" + this.enabled + ", startedAt=" + this.startedAt + ", hlsRecordingConfig=" + this.hlsRecordingConfig + ", state=" + this.state + ')';
    }
}
