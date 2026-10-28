package live.hms.video.sdk.models;

import live.hms.video.error.HMSException;
import live.hms.video.sdk.models.enums.HMSRecordingState;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JP\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, m65681d2 = {"Llive/hms/video/sdk/models/HMSBrowserRecordingState;", "", "running", "", "error", "Llive/hms/video/error/HMSException;", "startedAt", "", "stoppedAt", "initialising", "state", "Llive/hms/video/sdk/models/enums/HMSRecordingState;", "<init>", "(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;ZLlive/hms/video/sdk/models/enums/HMSRecordingState;)V", "getRunning", "()Z", "getError", "()Llive/hms/video/error/HMSException;", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStoppedAt", "getInitialising", "getState", "()Llive/hms/video/sdk/models/enums/HMSRecordingState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;ZLlive/hms/video/sdk/models/enums/HMSRecordingState;)Llive/hms/video/sdk/models/HMSBrowserRecordingState;", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HMSBrowserRecordingState {
    private final HMSException error;
    private final boolean initialising;
    private final boolean running;
    private final Long startedAt;
    private final HMSRecordingState state;
    private final Long stoppedAt;

    public HMSBrowserRecordingState(boolean z4, HMSException hMSException, Long l7, Long l12, boolean z13, HMSRecordingState state) {
        AbstractC22676k.m65750j(state, "state");
        this.running = z4;
        this.error = hMSException;
        this.startedAt = l7;
        this.stoppedAt = l12;
        this.initialising = z13;
        this.state = state;
    }

    public static /* synthetic */ HMSBrowserRecordingState copy$default(HMSBrowserRecordingState hMSBrowserRecordingState, boolean z4, HMSException hMSException, Long l7, Long l12, boolean z13, HMSRecordingState hMSRecordingState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = hMSBrowserRecordingState.running;
        }
        if ((i13 & 2) != 0) {
            hMSException = hMSBrowserRecordingState.error;
        }
        if ((i13 & 4) != 0) {
            l7 = hMSBrowserRecordingState.startedAt;
        }
        if ((i13 & 8) != 0) {
            l12 = hMSBrowserRecordingState.stoppedAt;
        }
        if ((i13 & 16) != 0) {
            z13 = hMSBrowserRecordingState.initialising;
        }
        if ((i13 & 32) != 0) {
            hMSRecordingState = hMSBrowserRecordingState.state;
        }
        boolean z14 = z13;
        HMSRecordingState hMSRecordingState2 = hMSRecordingState;
        return hMSBrowserRecordingState.copy(z4, hMSException, l7, l12, z14, hMSRecordingState2);
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
    public final boolean getInitialising() {
        return this.initialising;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HMSRecordingState getState() {
        return this.state;
    }

    public final HMSBrowserRecordingState copy(boolean running, HMSException error, Long startedAt, Long stoppedAt, boolean initialising, HMSRecordingState state) {
        AbstractC22676k.m65750j(state, "state");
        return new HMSBrowserRecordingState(running, error, startedAt, stoppedAt, initialising, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMSBrowserRecordingState)) {
            return false;
        }
        HMSBrowserRecordingState hMSBrowserRecordingState = (HMSBrowserRecordingState) other;
        return this.running == hMSBrowserRecordingState.running && AbstractC22676k.m65745e(this.error, hMSBrowserRecordingState.error) && AbstractC22676k.m65745e(this.startedAt, hMSBrowserRecordingState.startedAt) && AbstractC22676k.m65745e(this.stoppedAt, hMSBrowserRecordingState.stoppedAt) && this.initialising == hMSBrowserRecordingState.initialising && this.state == hMSBrowserRecordingState.state;
    }

    public final HMSException getError() {
        return this.error;
    }

    public final boolean getInitialising() {
        return this.initialising;
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
        return this.state.hashCode() + AbstractC2875y.m8289b((iHashCode3 + (l12 != null ? l12.hashCode() : 0)) * 31, 31, this.initialising);
    }

    public String toString() {
        return "HMSBrowserRecordingState(running=" + this.running + ", error=" + this.error + ", startedAt=" + this.startedAt + ", stoppedAt=" + this.stoppedAt + ", initialising=" + this.initialising + ", state=" + this.state + ')';
    }

    public /* synthetic */ HMSBrowserRecordingState(boolean z4, HMSException hMSException, Long l7, Long l12, boolean z13, HMSRecordingState hMSRecordingState, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, hMSException, l7, l12, (i13 & 16) != 0 ? false : z13, hMSRecordingState);
    }
}
