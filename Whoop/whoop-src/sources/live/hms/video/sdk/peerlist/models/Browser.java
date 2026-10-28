package live.hms.video.sdk.peerlist.models;

import com.google.gson.annotations.SerializedName;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JJ\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, m65681d2 = {"Llive/hms/video/sdk/peerlist/models/Browser;", "", "enabled", "", "startedAt", "", "stoppedAt", "initialisedAt", "state", "Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStoppedAt", "getInitialisedAt", "getState", "()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;)Llive/hms/video/sdk/peerlist/models/Browser;", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class Browser {

    @SerializedName("enabled")
    private final Boolean enabled;

    @SerializedName("initialised_at")
    private final Long initialisedAt;

    @SerializedName("started_at")
    private final Long startedAt;

    @SerializedName("state")
    private final BeamRecordingStates state;

    @SerializedName("stopped_at")
    private final Long stoppedAt;

    public Browser(Boolean bool, Long l7, Long l12, Long l13, BeamRecordingStates beamRecordingStates) {
        this.enabled = bool;
        this.startedAt = l7;
        this.stoppedAt = l12;
        this.initialisedAt = l13;
        this.state = beamRecordingStates;
    }

    public static /* synthetic */ Browser copy$default(Browser browser, Boolean bool, Long l7, Long l12, Long l13, BeamRecordingStates beamRecordingStates, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = browser.enabled;
        }
        if ((i13 & 2) != 0) {
            l7 = browser.startedAt;
        }
        if ((i13 & 4) != 0) {
            l12 = browser.stoppedAt;
        }
        if ((i13 & 8) != 0) {
            l13 = browser.initialisedAt;
        }
        if ((i13 & 16) != 0) {
            beamRecordingStates = browser.state;
        }
        BeamRecordingStates beamRecordingStates2 = beamRecordingStates;
        Long l14 = l12;
        return browser.copy(bool, l7, l14, l13, beamRecordingStates2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getStoppedAt() {
        return this.stoppedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getInitialisedAt() {
        return this.initialisedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BeamRecordingStates getState() {
        return this.state;
    }

    public final Browser copy(Boolean enabled, Long startedAt, Long stoppedAt, Long initialisedAt, BeamRecordingStates state) {
        return new Browser(enabled, startedAt, stoppedAt, initialisedAt, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Browser)) {
            return false;
        }
        Browser browser = (Browser) other;
        return AbstractC22676k.m65745e(this.enabled, browser.enabled) && AbstractC22676k.m65745e(this.startedAt, browser.startedAt) && AbstractC22676k.m65745e(this.stoppedAt, browser.stoppedAt) && AbstractC22676k.m65745e(this.initialisedAt, browser.initialisedAt) && this.state == browser.state;
    }

    public final Boolean getEnabled() {
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

    public final Long getStoppedAt() {
        return this.stoppedAt;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l7 = this.startedAt;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.stoppedAt;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.initialisedAt;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        BeamRecordingStates beamRecordingStates = this.state;
        return iHashCode4 + (beamRecordingStates != null ? beamRecordingStates.hashCode() : 0);
    }

    public String toString() {
        return "Browser(enabled=" + this.enabled + ", startedAt=" + this.startedAt + ", stoppedAt=" + this.stoppedAt + ", initialisedAt=" + this.initialisedAt + ", state=" + this.state + ')';
    }
}
