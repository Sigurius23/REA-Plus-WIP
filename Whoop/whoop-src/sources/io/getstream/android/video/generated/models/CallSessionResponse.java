package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import ih0.AbstractC18489d0;
import java.util.List;
import java.util.Map;
import jg3.C21682i;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\b\u0003\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\b\u0003\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t\u0012\u0014\b\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u001c\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010\"JÈ\u0001\u0010'\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0003\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0003\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0003\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t2\u0014\b\u0003\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0017J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u0019R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010\u001bR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010\u001dR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b7\u0010\u001dR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b8\u0010\u001dR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b9\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010\"R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b<\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\b=\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010:\u001a\u0004\b>\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\b?\u0010\"¨\u0006@"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallSessionResponse;", "", "", "anonymousParticipantCount", "", "id", "", "Lio/getstream/android/video/generated/models/CallParticipantResponse;", "participants", "", "Ljg3/i;", "acceptedBy", "missedBy", "participantsCountByRole", "rejectedBy", "endedAt", "liveEndedAt", "liveStartedAt", "startedAt", "timerEndsAt", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "()Ljava/util/Map;", "component5", "component6", "component7", "component8", "()Ljg3/i;", "component9", "component10", "component11", "component12", "copy", "(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;Ljg3/i;)Lio/getstream/android/video/generated/models/CallSessionResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAnonymousParticipantCount", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getParticipants", "Ljava/util/Map;", "getAcceptedBy", "getMissedBy", "getParticipantsCountByRole", "getRejectedBy", "Ljg3/i;", "getEndedAt", "getLiveEndedAt", "getLiveStartedAt", "getStartedAt", "getTimerEndsAt", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallSessionResponse {
    private final Map<String, C21682i> acceptedBy;
    private final int anonymousParticipantCount;
    private final C21682i endedAt;
    private final String id;
    private final C21682i liveEndedAt;
    private final C21682i liveStartedAt;
    private final Map<String, C21682i> missedBy;
    private final List<CallParticipantResponse> participants;
    private final Map<String, Integer> participantsCountByRole;
    private final Map<String, C21682i> rejectedBy;
    private final C21682i startedAt;
    private final C21682i timerEndsAt;

    public CallSessionResponse(@InterfaceC30731q(name = "anonymous_participant_count") int i13, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "participants") List<CallParticipantResponse> participants, @InterfaceC30731q(name = "accepted_by") Map<String, C21682i> acceptedBy, @InterfaceC30731q(name = "missed_by") Map<String, C21682i> missedBy, @InterfaceC30731q(name = "participants_count_by_role") Map<String, Integer> participantsCountByRole, @InterfaceC30731q(name = "rejected_by") Map<String, C21682i> rejectedBy, @InterfaceC30731q(name = "ended_at") C21682i c21682i, @InterfaceC30731q(name = "live_ended_at") C21682i c21682i2, @InterfaceC30731q(name = "live_started_at") C21682i c21682i3, @InterfaceC30731q(name = "started_at") C21682i c21682i4, @InterfaceC30731q(name = "timer_ends_at") C21682i c21682i5) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(acceptedBy, "acceptedBy");
        AbstractC22676k.m65750j(missedBy, "missedBy");
        AbstractC22676k.m65750j(participantsCountByRole, "participantsCountByRole");
        AbstractC22676k.m65750j(rejectedBy, "rejectedBy");
        this.anonymousParticipantCount = i13;
        this.id = id4;
        this.participants = participants;
        this.acceptedBy = acceptedBy;
        this.missedBy = missedBy;
        this.participantsCountByRole = participantsCountByRole;
        this.rejectedBy = rejectedBy;
        this.endedAt = c21682i;
        this.liveEndedAt = c21682i2;
        this.liveStartedAt = c21682i3;
        this.startedAt = c21682i4;
        this.timerEndsAt = c21682i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallSessionResponse copy$default(CallSessionResponse callSessionResponse, int i13, String str, List list, Map map, Map map2, Map map3, Map map4, C21682i c21682i, C21682i c21682i2, C21682i c21682i3, C21682i c21682i4, C21682i c21682i5, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = callSessionResponse.anonymousParticipantCount;
        }
        if ((i14 & 2) != 0) {
            str = callSessionResponse.id;
        }
        if ((i14 & 4) != 0) {
            list = callSessionResponse.participants;
        }
        if ((i14 & 8) != 0) {
            map = callSessionResponse.acceptedBy;
        }
        if ((i14 & 16) != 0) {
            map2 = callSessionResponse.missedBy;
        }
        if ((i14 & 32) != 0) {
            map3 = callSessionResponse.participantsCountByRole;
        }
        if ((i14 & 64) != 0) {
            map4 = callSessionResponse.rejectedBy;
        }
        if ((i14 & 128) != 0) {
            c21682i = callSessionResponse.endedAt;
        }
        if ((i14 & 256) != 0) {
            c21682i2 = callSessionResponse.liveEndedAt;
        }
        if ((i14 & 512) != 0) {
            c21682i3 = callSessionResponse.liveStartedAt;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c21682i4 = callSessionResponse.startedAt;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            c21682i5 = callSessionResponse.timerEndsAt;
        }
        C21682i c21682i6 = c21682i4;
        C21682i c21682i7 = c21682i5;
        C21682i c21682i8 = c21682i2;
        C21682i c21682i9 = c21682i3;
        Map map5 = map4;
        C21682i c21682i10 = c21682i;
        Map map6 = map2;
        Map map7 = map3;
        return callSessionResponse.copy(i13, str, list, map, map6, map7, map5, c21682i10, c21682i8, c21682i9, c21682i6, c21682i7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAnonymousParticipantCount() {
        return this.anonymousParticipantCount;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final C21682i getLiveStartedAt() {
        return this.liveStartedAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final C21682i getStartedAt() {
        return this.startedAt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final C21682i getTimerEndsAt() {
        return this.timerEndsAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<CallParticipantResponse> component3() {
        return this.participants;
    }

    public final Map<String, C21682i> component4() {
        return this.acceptedBy;
    }

    public final Map<String, C21682i> component5() {
        return this.missedBy;
    }

    public final Map<String, Integer> component6() {
        return this.participantsCountByRole;
    }

    public final Map<String, C21682i> component7() {
        return this.rejectedBy;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final C21682i getEndedAt() {
        return this.endedAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C21682i getLiveEndedAt() {
        return this.liveEndedAt;
    }

    public final CallSessionResponse copy(@InterfaceC30731q(name = "anonymous_participant_count") int anonymousParticipantCount, @InterfaceC30731q(name = "id") String id4, @InterfaceC30731q(name = "participants") List<CallParticipantResponse> participants, @InterfaceC30731q(name = "accepted_by") Map<String, C21682i> acceptedBy, @InterfaceC30731q(name = "missed_by") Map<String, C21682i> missedBy, @InterfaceC30731q(name = "participants_count_by_role") Map<String, Integer> participantsCountByRole, @InterfaceC30731q(name = "rejected_by") Map<String, C21682i> rejectedBy, @InterfaceC30731q(name = "ended_at") C21682i endedAt, @InterfaceC30731q(name = "live_ended_at") C21682i liveEndedAt, @InterfaceC30731q(name = "live_started_at") C21682i liveStartedAt, @InterfaceC30731q(name = "started_at") C21682i startedAt, @InterfaceC30731q(name = "timer_ends_at") C21682i timerEndsAt) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(acceptedBy, "acceptedBy");
        AbstractC22676k.m65750j(missedBy, "missedBy");
        AbstractC22676k.m65750j(participantsCountByRole, "participantsCountByRole");
        AbstractC22676k.m65750j(rejectedBy, "rejectedBy");
        return new CallSessionResponse(anonymousParticipantCount, id4, participants, acceptedBy, missedBy, participantsCountByRole, rejectedBy, endedAt, liveEndedAt, liveStartedAt, startedAt, timerEndsAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallSessionResponse)) {
            return false;
        }
        CallSessionResponse callSessionResponse = (CallSessionResponse) other;
        return this.anonymousParticipantCount == callSessionResponse.anonymousParticipantCount && AbstractC22676k.m65745e(this.id, callSessionResponse.id) && AbstractC22676k.m65745e(this.participants, callSessionResponse.participants) && AbstractC22676k.m65745e(this.acceptedBy, callSessionResponse.acceptedBy) && AbstractC22676k.m65745e(this.missedBy, callSessionResponse.missedBy) && AbstractC22676k.m65745e(this.participantsCountByRole, callSessionResponse.participantsCountByRole) && AbstractC22676k.m65745e(this.rejectedBy, callSessionResponse.rejectedBy) && AbstractC22676k.m65745e(this.endedAt, callSessionResponse.endedAt) && AbstractC22676k.m65745e(this.liveEndedAt, callSessionResponse.liveEndedAt) && AbstractC22676k.m65745e(this.liveStartedAt, callSessionResponse.liveStartedAt) && AbstractC22676k.m65745e(this.startedAt, callSessionResponse.startedAt) && AbstractC22676k.m65745e(this.timerEndsAt, callSessionResponse.timerEndsAt);
    }

    public final Map<String, C21682i> getAcceptedBy() {
        return this.acceptedBy;
    }

    public final int getAnonymousParticipantCount() {
        return this.anonymousParticipantCount;
    }

    public final C21682i getEndedAt() {
        return this.endedAt;
    }

    public final String getId() {
        return this.id;
    }

    public final C21682i getLiveEndedAt() {
        return this.liveEndedAt;
    }

    public final C21682i getLiveStartedAt() {
        return this.liveStartedAt;
    }

    public final Map<String, C21682i> getMissedBy() {
        return this.missedBy;
    }

    public final List<CallParticipantResponse> getParticipants() {
        return this.participants;
    }

    public final Map<String, Integer> getParticipantsCountByRole() {
        return this.participantsCountByRole;
    }

    public final Map<String, C21682i> getRejectedBy() {
        return this.rejectedBy;
    }

    public final C21682i getStartedAt() {
        return this.startedAt;
    }

    public final C21682i getTimerEndsAt() {
        return this.timerEndsAt;
    }

    public int hashCode() {
        int iM11821e = AbstractC3855a.m11821e(this.rejectedBy, AbstractC3855a.m11821e(this.participantsCountByRole, AbstractC3855a.m11821e(this.missedBy, AbstractC3855a.m11821e(this.acceptedBy, AbstractC11895b.m31983b(AbstractC11266d.m30450d(Integer.hashCode(this.anonymousParticipantCount) * 31, 31, this.id), 31, this.participants), 31), 31), 31), 31);
        C21682i c21682i = this.endedAt;
        int iHashCode = (iM11821e + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        C21682i c21682i2 = this.liveEndedAt;
        int iHashCode2 = (iHashCode + (c21682i2 == null ? 0 : c21682i2.hashCode())) * 31;
        C21682i c21682i3 = this.liveStartedAt;
        int iHashCode3 = (iHashCode2 + (c21682i3 == null ? 0 : c21682i3.hashCode())) * 31;
        C21682i c21682i4 = this.startedAt;
        int iHashCode4 = (iHashCode3 + (c21682i4 == null ? 0 : c21682i4.hashCode())) * 31;
        C21682i c21682i5 = this.timerEndsAt;
        return iHashCode4 + (c21682i5 != null ? c21682i5.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.anonymousParticipantCount;
        String str = this.id;
        List<CallParticipantResponse> list = this.participants;
        Map<String, C21682i> map = this.acceptedBy;
        Map<String, C21682i> map2 = this.missedBy;
        Map<String, Integer> map3 = this.participantsCountByRole;
        Map<String, C21682i> map4 = this.rejectedBy;
        C21682i c21682i = this.endedAt;
        C21682i c21682i2 = this.liveEndedAt;
        C21682i c21682i3 = this.liveStartedAt;
        C21682i c21682i4 = this.startedAt;
        C21682i c21682i5 = this.timerEndsAt;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "CallSessionResponse(anonymousParticipantCount=", ", id=", str, ", participants=");
        sbM53373n.append(list);
        sbM53373n.append(", acceptedBy=");
        sbM53373n.append(map);
        sbM53373n.append(", missedBy=");
        AbstractC3855a.m11840x(sbM53373n, map2, ", participantsCountByRole=", map3, ", rejectedBy=");
        sbM53373n.append(map4);
        sbM53373n.append(", endedAt=");
        sbM53373n.append(c21682i);
        sbM53373n.append(", liveEndedAt=");
        sbM53373n.append(c21682i2);
        sbM53373n.append(", liveStartedAt=");
        sbM53373n.append(c21682i3);
        sbM53373n.append(", startedAt=");
        sbM53373n.append(c21682i4);
        sbM53373n.append(", timerEndsAt=");
        sbM53373n.append(c21682i5);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CallSessionResponse(int i13, String str, List list, Map map, Map map2, Map map3, Map map4, C21682i c21682i, C21682i c21682i2, C21682i c21682i3, C21682i c21682i4, C21682i c21682i5, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        List list2 = (i14 & 4) != 0 ? C25271y.f99162w : list;
        int i15 = i14 & 8;
        C25272z c25272z = C25272z.f99163w;
        this(i13, str, list2, i15 != 0 ? c25272z : map, (i14 & 16) != 0 ? c25272z : map2, (i14 & 32) != 0 ? c25272z : map3, (i14 & 64) != 0 ? c25272z : map4, (i14 & 128) != 0 ? null : c21682i, (i14 & 256) != 0 ? null : c21682i2, (i14 & 512) != 0 ? null : c21682i3, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c21682i4, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c21682i5);
    }
}
