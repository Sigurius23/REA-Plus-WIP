package io.getstream.android.video.generated.models;

import jg3.C21682i;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\f¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallReportResponse;", "", "", "score", "Ljg3/i;", "endedAt", "startedAt", "<init>", "(FLjg3/i;Ljg3/i;)V", "component1", "()F", "component2", "()Ljg3/i;", "component3", "copy", "(FLjg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/CallReportResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getScore", "Ljg3/i;", "getEndedAt", "getStartedAt", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallReportResponse {
    private final C21682i endedAt;
    private final float score;
    private final C21682i startedAt;

    public CallReportResponse(@InterfaceC30731q(name = "score") float f13, @InterfaceC30731q(name = "ended_at") C21682i c21682i, @InterfaceC30731q(name = "started_at") C21682i c21682i2) {
        this.score = f13;
        this.endedAt = c21682i;
        this.startedAt = c21682i2;
    }

    public static /* synthetic */ CallReportResponse copy$default(CallReportResponse callReportResponse, float f13, C21682i c21682i, C21682i c21682i2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = callReportResponse.score;
        }
        if ((i13 & 2) != 0) {
            c21682i = callReportResponse.endedAt;
        }
        if ((i13 & 4) != 0) {
            c21682i2 = callReportResponse.startedAt;
        }
        return callReportResponse.copy(f13, c21682i, c21682i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getEndedAt() {
        return this.endedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C21682i getStartedAt() {
        return this.startedAt;
    }

    public final CallReportResponse copy(@InterfaceC30731q(name = "score") float score, @InterfaceC30731q(name = "ended_at") C21682i endedAt, @InterfaceC30731q(name = "started_at") C21682i startedAt) {
        return new CallReportResponse(score, endedAt, startedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallReportResponse)) {
            return false;
        }
        CallReportResponse callReportResponse = (CallReportResponse) other;
        return Float.compare(this.score, callReportResponse.score) == 0 && AbstractC22676k.m65745e(this.endedAt, callReportResponse.endedAt) && AbstractC22676k.m65745e(this.startedAt, callReportResponse.startedAt);
    }

    public final C21682i getEndedAt() {
        return this.endedAt;
    }

    public final float getScore() {
        return this.score;
    }

    public final C21682i getStartedAt() {
        return this.startedAt;
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(this.score) * 31;
        C21682i c21682i = this.endedAt;
        int iHashCode2 = (iHashCode + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        C21682i c21682i2 = this.startedAt;
        return iHashCode2 + (c21682i2 != null ? c21682i2.hashCode() : 0);
    }

    public String toString() {
        return "CallReportResponse(score=" + this.score + ", endedAt=" + this.endedAt + ", startedAt=" + this.startedAt + ")";
    }

    public /* synthetic */ CallReportResponse(float f13, C21682i c21682i, C21682i c21682i2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, (i13 & 2) != 0 ? null : c21682i, (i13 & 4) != 0 ? null : c21682i2);
    }
}
