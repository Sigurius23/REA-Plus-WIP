package live.hms.video.sdk.models;

import live.hms.video.error.HMSException;
import live.hms.video.sdk.models.enums.HMSRecordingState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSServerRecordingState;", "", "running", "", "error", "Llive/hms/video/error/HMSException;", "startedAt", "", "state", "Llive/hms/video/sdk/models/enums/HMSRecordingState;", "<init>", "(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSRecordingState;)V", "getRunning", "()Z", "getError", "()Llive/hms/video/error/HMSException;", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getState", "()Llive/hms/video/sdk/models/enums/HMSRecordingState;", "component1", "component2", "component3", "component4", "copy", "(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSRecordingState;)Llive/hms/video/sdk/models/HMSServerRecordingState;", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSServerRecordingState {
    private final HMSException error;
    private final boolean running;
    private final Long startedAt;
    private final HMSRecordingState state;

    public HMSServerRecordingState(boolean z4, HMSException hMSException, Long l7, HMSRecordingState state) {
        AbstractC22676k.m65750j(state, "state");
        this.running = z4;
        this.error = hMSException;
        this.startedAt = l7;
        this.state = state;
    }

    public static /* synthetic */ HMSServerRecordingState copy$default(HMSServerRecordingState hMSServerRecordingState, boolean z4, HMSException hMSException, Long l7, HMSRecordingState hMSRecordingState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = hMSServerRecordingState.running;
        }
        if ((i13 & 2) != 0) {
            hMSException = hMSServerRecordingState.error;
        }
        if ((i13 & 4) != 0) {
            l7 = hMSServerRecordingState.startedAt;
        }
        if ((i13 & 8) != 0) {
            hMSRecordingState = hMSServerRecordingState.state;
        }
        return hMSServerRecordingState.copy(z4, hMSException, l7, hMSRecordingState);
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
    public final HMSRecordingState getState() {
        return this.state;
    }

    public final HMSServerRecordingState copy(boolean running, HMSException error, Long startedAt, HMSRecordingState state) {
        AbstractC22676k.m65750j(state, "state");
        return new HMSServerRecordingState(running, error, startedAt, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSServerRecordingState)) {
            return false;
        }
        HMSServerRecordingState hMSServerRecordingState = (HMSServerRecordingState) other;
        return this.running == hMSServerRecordingState.running && AbstractC22676k.m65745e(this.error, hMSServerRecordingState.error) && AbstractC22676k.m65745e(this.startedAt, hMSServerRecordingState.startedAt) && this.state == hMSServerRecordingState.state;
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

    public final HMSRecordingState getState() {
        return this.state;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.running) * 31;
        HMSException hMSException = this.error;
        int iHashCode2 = (iHashCode + (hMSException == null ? 0 : hMSException.hashCode())) * 31;
        Long l7 = this.startedAt;
        return this.state.hashCode() + ((iHashCode2 + (l7 != null ? l7.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "HMSServerRecordingState(running=" + this.running + ", error=" + this.error + ", startedAt=" + this.startedAt + ", state=" + this.state + ')';
    }
}
