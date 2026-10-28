package io.getstream.android.video.generated.models;

import d13.AbstractC11478a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b-\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u009c\u0001\u0010.\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b \u0010\u0012¨\u00066"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;", "", "liveSessions", "", "participants", "peakConcurrentSessions", "peakConcurrentUsers", "publishers", "sessions", "sfusUsed", "averageJitterMs", "averageLatencyMs", "callEventCount", "cqScore", "maxFreezesDurationMs", "totalParticipantDuration", "(IIIIIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAverageJitterMs", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAverageLatencyMs", "getCallEventCount", "getCqScore", "getLiveSessions", "()I", "getMaxFreezesDurationMs", "getParticipants", "getPeakConcurrentSessions", "getPeakConcurrentUsers", "getPublishers", "getSessions", "getSfusUsed", "getTotalParticipantDuration", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IIIIIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;", "equals", "", "other", "hashCode", "toString", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallStatsParticipantCounts {
    private final Integer averageJitterMs;
    private final Integer averageLatencyMs;
    private final Integer callEventCount;
    private final Integer cqScore;
    private final int liveSessions;
    private final Integer maxFreezesDurationMs;
    private final int participants;
    private final int peakConcurrentSessions;
    private final int peakConcurrentUsers;
    private final int publishers;
    private final int sessions;
    private final int sfusUsed;
    private final Integer totalParticipantDuration;

    public CallStatsParticipantCounts(@InterfaceC30731q(name = "live_sessions") int i13, @InterfaceC30731q(name = "participants") int i14, @InterfaceC30731q(name = "peak_concurrent_sessions") int i15, @InterfaceC30731q(name = "peak_concurrent_users") int i16, @InterfaceC30731q(name = "publishers") int i17, @InterfaceC30731q(name = "sessions") int i18, @InterfaceC30731q(name = "sfus_used") int i19, @InterfaceC30731q(name = "average_jitter_ms") Integer num, @InterfaceC30731q(name = "average_latency_ms") Integer num2, @InterfaceC30731q(name = "call_event_count") Integer num3, @InterfaceC30731q(name = "cq_score") Integer num4, @InterfaceC30731q(name = "max_freezes_duration_ms") Integer num5, @InterfaceC30731q(name = "total_participant_duration") Integer num6) {
        this.liveSessions = i13;
        this.participants = i14;
        this.peakConcurrentSessions = i15;
        this.peakConcurrentUsers = i16;
        this.publishers = i17;
        this.sessions = i18;
        this.sfusUsed = i19;
        this.averageJitterMs = num;
        this.averageLatencyMs = num2;
        this.callEventCount = num3;
        this.cqScore = num4;
        this.maxFreezesDurationMs = num5;
        this.totalParticipantDuration = num6;
    }

    public static /* synthetic */ CallStatsParticipantCounts copy$default(CallStatsParticipantCounts callStatsParticipantCounts, int i13, int i14, int i15, int i16, int i17, int i18, int i19, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i24, Object obj) {
        if ((i24 & 1) != 0) {
            i13 = callStatsParticipantCounts.liveSessions;
        }
        return callStatsParticipantCounts.copy(i13, (i24 & 2) != 0 ? callStatsParticipantCounts.participants : i14, (i24 & 4) != 0 ? callStatsParticipantCounts.peakConcurrentSessions : i15, (i24 & 8) != 0 ? callStatsParticipantCounts.peakConcurrentUsers : i16, (i24 & 16) != 0 ? callStatsParticipantCounts.publishers : i17, (i24 & 32) != 0 ? callStatsParticipantCounts.sessions : i18, (i24 & 64) != 0 ? callStatsParticipantCounts.sfusUsed : i19, (i24 & 128) != 0 ? callStatsParticipantCounts.averageJitterMs : num, (i24 & 256) != 0 ? callStatsParticipantCounts.averageLatencyMs : num2, (i24 & 512) != 0 ? callStatsParticipantCounts.callEventCount : num3, (i24 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? callStatsParticipantCounts.cqScore : num4, (i24 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? callStatsParticipantCounts.maxFreezesDurationMs : num5, (i24 & 4096) != 0 ? callStatsParticipantCounts.totalParticipantDuration : num6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getLiveSessions() {
        return this.liveSessions;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getCallEventCount() {
        return this.callEventCount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getCqScore() {
        return this.cqScore;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getMaxFreezesDurationMs() {
        return this.maxFreezesDurationMs;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getTotalParticipantDuration() {
        return this.totalParticipantDuration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getParticipants() {
        return this.participants;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPeakConcurrentSessions() {
        return this.peakConcurrentSessions;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPeakConcurrentUsers() {
        return this.peakConcurrentUsers;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPublishers() {
        return this.publishers;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSessions() {
        return this.sessions;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSfusUsed() {
        return this.sfusUsed;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getAverageJitterMs() {
        return this.averageJitterMs;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getAverageLatencyMs() {
        return this.averageLatencyMs;
    }

    public final CallStatsParticipantCounts copy(@InterfaceC30731q(name = "live_sessions") int liveSessions, @InterfaceC30731q(name = "participants") int participants, @InterfaceC30731q(name = "peak_concurrent_sessions") int peakConcurrentSessions, @InterfaceC30731q(name = "peak_concurrent_users") int peakConcurrentUsers, @InterfaceC30731q(name = "publishers") int publishers, @InterfaceC30731q(name = "sessions") int sessions, @InterfaceC30731q(name = "sfus_used") int sfusUsed, @InterfaceC30731q(name = "average_jitter_ms") Integer averageJitterMs, @InterfaceC30731q(name = "average_latency_ms") Integer averageLatencyMs, @InterfaceC30731q(name = "call_event_count") Integer callEventCount, @InterfaceC30731q(name = "cq_score") Integer cqScore, @InterfaceC30731q(name = "max_freezes_duration_ms") Integer maxFreezesDurationMs, @InterfaceC30731q(name = "total_participant_duration") Integer totalParticipantDuration) {
        return new CallStatsParticipantCounts(liveSessions, participants, peakConcurrentSessions, peakConcurrentUsers, publishers, sessions, sfusUsed, averageJitterMs, averageLatencyMs, callEventCount, cqScore, maxFreezesDurationMs, totalParticipantDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallStatsParticipantCounts)) {
            return false;
        }
        CallStatsParticipantCounts callStatsParticipantCounts = (CallStatsParticipantCounts) other;
        return this.liveSessions == callStatsParticipantCounts.liveSessions && this.participants == callStatsParticipantCounts.participants && this.peakConcurrentSessions == callStatsParticipantCounts.peakConcurrentSessions && this.peakConcurrentUsers == callStatsParticipantCounts.peakConcurrentUsers && this.publishers == callStatsParticipantCounts.publishers && this.sessions == callStatsParticipantCounts.sessions && this.sfusUsed == callStatsParticipantCounts.sfusUsed && AbstractC22676k.m65745e(this.averageJitterMs, callStatsParticipantCounts.averageJitterMs) && AbstractC22676k.m65745e(this.averageLatencyMs, callStatsParticipantCounts.averageLatencyMs) && AbstractC22676k.m65745e(this.callEventCount, callStatsParticipantCounts.callEventCount) && AbstractC22676k.m65745e(this.cqScore, callStatsParticipantCounts.cqScore) && AbstractC22676k.m65745e(this.maxFreezesDurationMs, callStatsParticipantCounts.maxFreezesDurationMs) && AbstractC22676k.m65745e(this.totalParticipantDuration, callStatsParticipantCounts.totalParticipantDuration);
    }

    public final Integer getAverageJitterMs() {
        return this.averageJitterMs;
    }

    public final Integer getAverageLatencyMs() {
        return this.averageLatencyMs;
    }

    public final Integer getCallEventCount() {
        return this.callEventCount;
    }

    public final Integer getCqScore() {
        return this.cqScore;
    }

    public final int getLiveSessions() {
        return this.liveSessions;
    }

    public final Integer getMaxFreezesDurationMs() {
        return this.maxFreezesDurationMs;
    }

    public final int getParticipants() {
        return this.participants;
    }

    public final int getPeakConcurrentSessions() {
        return this.peakConcurrentSessions;
    }

    public final int getPeakConcurrentUsers() {
        return this.peakConcurrentUsers;
    }

    public final int getPublishers() {
        return this.publishers;
    }

    public final int getSessions() {
        return this.sessions;
    }

    public final int getSfusUsed() {
        return this.sfusUsed;
    }

    public final Integer getTotalParticipantDuration() {
        return this.totalParticipantDuration;
    }

    public int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.sfusUsed, AbstractC11266d.m30448b(this.sessions, AbstractC11266d.m30448b(this.publishers, AbstractC11266d.m30448b(this.peakConcurrentUsers, AbstractC11266d.m30448b(this.peakConcurrentSessions, AbstractC11266d.m30448b(this.participants, Integer.hashCode(this.liveSessions) * 31, 31), 31), 31), 31), 31), 31);
        Integer num = this.averageJitterMs;
        int iHashCode = (iM30448b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.averageLatencyMs;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.callEventCount;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.cqScore;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.maxFreezesDurationMs;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.totalParticipantDuration;
        return iHashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.liveSessions;
        int i14 = this.participants;
        int i15 = this.peakConcurrentSessions;
        int i16 = this.peakConcurrentUsers;
        int i17 = this.publishers;
        int i18 = this.sessions;
        int i19 = this.sfusUsed;
        Integer num = this.averageJitterMs;
        Integer num2 = this.averageLatencyMs;
        Integer num3 = this.callEventCount;
        Integer num4 = this.cqScore;
        Integer num5 = this.maxFreezesDurationMs;
        Integer num6 = this.totalParticipantDuration;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "CallStatsParticipantCounts(liveSessions=", ", participants=", ", peakConcurrentSessions=");
        AbstractC30802r.m94773v(sbM30465s, i15, ", peakConcurrentUsers=", i16, ", publishers=");
        AbstractC30802r.m94773v(sbM30465s, i17, ", sessions=", i18, ", sfusUsed=");
        sbM30465s.append(i19);
        sbM30465s.append(", averageJitterMs=");
        sbM30465s.append(num);
        sbM30465s.append(", averageLatencyMs=");
        AbstractC31061c.m95621A(sbM30465s, num2, ", callEventCount=", num3, ", cqScore=");
        AbstractC31061c.m95621A(sbM30465s, num4, ", maxFreezesDurationMs=", num5, ", totalParticipantDuration=");
        return AbstractC11478a.m30859k(sbM30465s, num6, ")");
    }

    public /* synthetic */ CallStatsParticipantCounts(int i13, int i14, int i15, int i16, int i17, int i18, int i19, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i24, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, i14, i15, i16, i17, i18, i19, (i24 & 128) != 0 ? null : num, (i24 & 256) != 0 ? null : num2, (i24 & 512) != 0 ? null : num3, (i24 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : num4, (i24 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : num5, (i24 & 4096) != 0 ? null : num6);
    }
}
