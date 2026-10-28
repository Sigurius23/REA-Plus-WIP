package live.hms.video.sdk.models;

import live.hms.video.error.HMSException;
import live.hms.video.sdk.models.enums.HMSStreamingState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JF\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006&"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSRtmpStreamingState;", "", "running", "", "error", "Llive/hms/video/error/HMSException;", "startedAt", "", "stoppedAt", "state", "Llive/hms/video/sdk/models/enums/HMSStreamingState;", "<init>", "(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSStreamingState;)V", "getRunning", "()Z", "getError", "()Llive/hms/video/error/HMSException;", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStoppedAt", "getState", "()Llive/hms/video/sdk/models/enums/HMSStreamingState;", "setState", "(Llive/hms/video/sdk/models/enums/HMSStreamingState;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSStreamingState;)Llive/hms/video/sdk/models/HMSRtmpStreamingState;", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSRtmpStreamingState {
    private final HMSException error;
    private final boolean running;
    private final Long startedAt;
    private HMSStreamingState state;
    private final Long stoppedAt;

    public HMSRtmpStreamingState(boolean z4, HMSException hMSException, Long l7, Long l12, HMSStreamingState state) {
        AbstractC22676k.m65750j(state, "state");
        this.running = z4;
        this.error = hMSException;
        this.startedAt = l7;
        this.stoppedAt = l12;
        this.state = state;
    }

    public static /* synthetic */ HMSRtmpStreamingState copy$default(HMSRtmpStreamingState hMSRtmpStreamingState, boolean z4, HMSException hMSException, Long l7, Long l12, HMSStreamingState hMSStreamingState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = hMSRtmpStreamingState.running;
        }
        if ((i13 & 2) != 0) {
            hMSException = hMSRtmpStreamingState.error;
        }
        if ((i13 & 4) != 0) {
            l7 = hMSRtmpStreamingState.startedAt;
        }
        if ((i13 & 8) != 0) {
            l12 = hMSRtmpStreamingState.stoppedAt;
        }
        if ((i13 & 16) != 0) {
            hMSStreamingState = hMSRtmpStreamingState.state;
        }
        HMSStreamingState hMSStreamingState2 = hMSStreamingState;
        Long l13 = l7;
        return hMSRtmpStreamingState.copy(z4, hMSException, l13, l12, hMSStreamingState2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getRunning() {
        return this.running;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HMSException getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getStoppedAt() {
        return this.stoppedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HMSStreamingState getState() {
        return this.state;
    }

    public final HMSRtmpStreamingState copy(boolean running, HMSException error, Long startedAt, Long stoppedAt, HMSStreamingState state) {
        AbstractC22676k.m65750j(state, "state");
        return new HMSRtmpStreamingState(running, error, startedAt, stoppedAt, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSRtmpStreamingState)) {
            return false;
        }
        HMSRtmpStreamingState hMSRtmpStreamingState = (HMSRtmpStreamingState) other;
        return this.running == hMSRtmpStreamingState.running && AbstractC22676k.m65745e(this.error, hMSRtmpStreamingState.error) && AbstractC22676k.m65745e(this.startedAt, hMSRtmpStreamingState.startedAt) && AbstractC22676k.m65745e(this.stoppedAt, hMSRtmpStreamingState.stoppedAt) && this.state == hMSRtmpStreamingState.state;
    }

    public final HMSException getError() {
        return this.error;
    }

    public final boolean getRunning() {
        return this.running;
    }

    public final Long getStartedAt() {
        return this.startedAt;
    }

    public final HMSStreamingState getState() {
        return this.state;
    }

    public final Long getStoppedAt() {
        return this.stoppedAt;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.running) * 31;
        HMSException hMSException = this.error;
        int iHashCode2 = (iHashCode + (hMSException == null ? 0 : hMSException.hashCode())) * 31;
        Long l7 = this.startedAt;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        Long l12 = this.stoppedAt;
        return this.state.hashCode() + ((iHashCode3 + (l12 != null ? l12.hashCode() : 0)) * 31);
    }

    public final void setState(HMSStreamingState hMSStreamingState) {
        AbstractC22676k.m65750j(hMSStreamingState, "<set-?>");
        this.state = hMSStreamingState;
    }

    public String toString() {
        return "HMSRtmpStreamingState(running=" + this.running + ", error=" + this.error + ", startedAt=" + this.startedAt + ", stoppedAt=" + this.stoppedAt + ", state=" + this.state + ')';
    }
}
