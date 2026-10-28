package live.hms.video.sdk.models;

import live.hms.video.error.HMSException;
import live.hms.video.sdk.models.enums.HMSRecordingState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JH\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m65681d2 = {"Llive/hms/video/sdk/models/HmsHlsRecordingState;", "", "running", "", "startedAt", "", "hlsRecordingConfig", "Llive/hms/video/sdk/models/HMSHlsRecordingConfig;", "error", "Llive/hms/video/error/HMSException;", "state", "Llive/hms/video/sdk/models/enums/HMSRecordingState;", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Llive/hms/video/sdk/models/HMSHlsRecordingConfig;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSRecordingState;)V", "getRunning", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStartedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHlsRecordingConfig", "()Llive/hms/video/sdk/models/HMSHlsRecordingConfig;", "getError", "()Llive/hms/video/error/HMSException;", "getState", "()Llive/hms/video/sdk/models/enums/HMSRecordingState;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Llive/hms/video/sdk/models/HMSHlsRecordingConfig;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSRecordingState;)Llive/hms/video/sdk/models/HmsHlsRecordingState;", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class HmsHlsRecordingState {
    private final HMSException error;
    private final HMSHlsRecordingConfig hlsRecordingConfig;
    private final Boolean running;
    private final Long startedAt;
    private final HMSRecordingState state;

    public HmsHlsRecordingState(Boolean bool, Long l7, HMSHlsRecordingConfig hMSHlsRecordingConfig, HMSException hMSException, HMSRecordingState state) {
        AbstractC22676k.m65750j(state, "state");
        this.running = bool;
        this.startedAt = l7;
        this.hlsRecordingConfig = hMSHlsRecordingConfig;
        this.error = hMSException;
        this.state = state;
    }

    public static /* synthetic */ HmsHlsRecordingState copy$default(HmsHlsRecordingState hmsHlsRecordingState, Boolean bool, Long l7, HMSHlsRecordingConfig hMSHlsRecordingConfig, HMSException hMSException, HMSRecordingState hMSRecordingState, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = hmsHlsRecordingState.running;
        }
        if ((i13 & 2) != 0) {
            l7 = hmsHlsRecordingState.startedAt;
        }
        if ((i13 & 4) != 0) {
            hMSHlsRecordingConfig = hmsHlsRecordingState.hlsRecordingConfig;
        }
        if ((i13 & 8) != 0) {
            hMSException = hmsHlsRecordingState.error;
        }
        if ((i13 & 16) != 0) {
            hMSRecordingState = hmsHlsRecordingState.state;
        }
        HMSRecordingState hMSRecordingState2 = hMSRecordingState;
        HMSHlsRecordingConfig hMSHlsRecordingConfig2 = hMSHlsRecordingConfig;
        return hmsHlsRecordingState.copy(bool, l7, hMSHlsRecordingConfig2, hMSException, hMSRecordingState2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getRunning() {
        return this.running;
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
    public final HMSException getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HMSRecordingState getState() {
        return this.state;
    }

    public final HmsHlsRecordingState copy(Boolean running, Long startedAt, HMSHlsRecordingConfig hlsRecordingConfig, HMSException error, HMSRecordingState state) {
        AbstractC22676k.m65750j(state, "state");
        return new HmsHlsRecordingState(running, startedAt, hlsRecordingConfig, error, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HmsHlsRecordingState)) {
            return false;
        }
        HmsHlsRecordingState hmsHlsRecordingState = (HmsHlsRecordingState) other;
        return AbstractC22676k.m65745e(this.running, hmsHlsRecordingState.running) && AbstractC22676k.m65745e(this.startedAt, hmsHlsRecordingState.startedAt) && AbstractC22676k.m65745e(this.hlsRecordingConfig, hmsHlsRecordingState.hlsRecordingConfig) && AbstractC22676k.m65745e(this.error, hmsHlsRecordingState.error) && this.state == hmsHlsRecordingState.state;
    }

    public final HMSException getError() {
        return this.error;
    }

    public final HMSHlsRecordingConfig getHlsRecordingConfig() {
        return this.hlsRecordingConfig;
    }

    public final Boolean getRunning() {
        return this.running;
    }

    public final Long getStartedAt() {
        return this.startedAt;
    }

    public final HMSRecordingState getState() {
        return this.state;
    }

    public int hashCode() {
        Boolean bool = this.running;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l7 = this.startedAt;
        int iHashCode2 = (iHashCode + (l7 == null ? 0 : l7.hashCode())) * 31;
        HMSHlsRecordingConfig hMSHlsRecordingConfig = this.hlsRecordingConfig;
        int iHashCode3 = (iHashCode2 + (hMSHlsRecordingConfig == null ? 0 : hMSHlsRecordingConfig.hashCode())) * 31;
        HMSException hMSException = this.error;
        return this.state.hashCode() + ((iHashCode3 + (hMSException != null ? hMSException.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "HmsHlsRecordingState(running=" + this.running + ", startedAt=" + this.startedAt + ", hlsRecordingConfig=" + this.hlsRecordingConfig + ", error=" + this.error + ", state=" + this.state + ')';
    }
}
