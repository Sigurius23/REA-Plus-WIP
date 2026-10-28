package live.hms.video.sdk.peerlist.models;

import com.google.gson.annotations.SerializedName;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JH\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, m65681d2 = {"Llive/hms/video/sdk/peerlist/models/Sfu;", "", "enabled", "", "startedAt", "", "initialisedAt", "updatedAt", "state", "Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;", "<init>", "(ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;)V", "getEnabled", "()Z", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInitialisedAt", "getUpdatedAt", "getState", "()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;)Llive/hms/video/sdk/peerlist/models/Sfu;", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class Sfu {

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("initialised_at")
    private final Long initialisedAt;

    @SerializedName("started_at")
    private final Long startedAt;

    @SerializedName("state")
    private final BeamRecordingStates state;

    @SerializedName("updated_at")
    private final Long updatedAt;

    public Sfu(boolean z4, Long l7, Long l12, Long l13, BeamRecordingStates beamRecordingStates) {
        this.enabled = z4;
        this.startedAt = l7;
        this.initialisedAt = l12;
        this.updatedAt = l13;
        this.state = beamRecordingStates;
    }

    public static /* synthetic */ Sfu copy$default(Sfu sfu, boolean z4, Long l7, Long l12, Long l13, BeamRecordingStates beamRecordingStates, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = sfu.enabled;
        }
        if ((i13 & 2) != 0) {
            l7 = sfu.startedAt;
        }
        if ((i13 & 4) != 0) {
            l12 = sfu.initialisedAt;
        }
        if ((i13 & 8) != 0) {
            l13 = sfu.updatedAt;
        }
        if ((i13 & 16) != 0) {
            beamRecordingStates = sfu.state;
        }
        BeamRecordingStates beamRecordingStates2 = beamRecordingStates;
        Long l14 = l12;
        return sfu.copy(z4, l7, l14, l13, beamRecordingStates2);
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
    public final Long getInitialisedAt() {
        return this.initialisedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BeamRecordingStates getState() {
        return this.state;
    }

    public final Sfu copy(boolean enabled, Long startedAt, Long initialisedAt, Long updatedAt, BeamRecordingStates state) {
        return new Sfu(enabled, startedAt, initialisedAt, updatedAt, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sfu)) {
            return false;
        }
        Sfu sfu = (Sfu) other;
        return this.enabled == sfu.enabled && AbstractC22676k.m65745e(this.startedAt, sfu.startedAt) && AbstractC22676k.m65745e(this.initialisedAt, sfu.initialisedAt) && AbstractC22676k.m65745e(this.updatedAt, sfu.updatedAt) && this.state == sfu.state;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Long getInitialisedAt() {
        return this.initialisedAt;
    }

    public final Long getStartedAt() {
        return this.startedAt;
    }

    public final BeamRecordingStates getState() {
        return this.state;
    }

    public final Long getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        Long l7 = this.startedAt;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.initialisedAt;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.updatedAt;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        BeamRecordingStates beamRecordingStates = this.state;
        return iHashCode4 + (beamRecordingStates != null ? beamRecordingStates.hashCode() : 0);
    }

    public String toString() {
        return "Sfu(enabled=" + this.enabled + ", startedAt=" + this.startedAt + ", initialisedAt=" + this.initialisedAt + ", updatedAt=" + this.updatedAt + ", state=" + this.state + ')';
    }
}
