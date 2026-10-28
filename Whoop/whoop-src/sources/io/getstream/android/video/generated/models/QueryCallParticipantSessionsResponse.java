package io.getstream.android.video.generated.models;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jy\u0010*\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0007HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u00060"}, m65681d2 = {"Lio/getstream/android/video/generated/models/QueryCallParticipantSessionsResponse;", "", "callId", "", "callSessionId", "callType", AttachmentExtensionsKt.EXTRA_DURATION, "", "totalParticipantDuration", "totalParticipantSessions", "participantsSessions", "", "Lio/getstream/android/video/generated/models/ParticipantSessionDetails;", "next", "prev", "session", "Lio/getstream/android/video/generated/models/CallSessionResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallSessionResponse;)V", "getCallId", "()Ljava/lang/String;", "getCallSessionId", "getCallType", "getDuration", "()I", "getNext", "getParticipantsSessions", "()Ljava/util/List;", "getPrev", "getSession", "()Lio/getstream/android/video/generated/models/CallSessionResponse;", "getTotalParticipantDuration", "getTotalParticipantSessions", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class QueryCallParticipantSessionsResponse {
    private final String callId;
    private final String callSessionId;
    private final String callType;
    private final int duration;
    private final String next;
    private final List<ParticipantSessionDetails> participantsSessions;
    private final String prev;
    private final CallSessionResponse session;
    private final int totalParticipantDuration;
    private final int totalParticipantSessions;

    public QueryCallParticipantSessionsResponse(@InterfaceC30731q(name = "call_id") String callId, @InterfaceC30731q(name = "call_session_id") String callSessionId, @InterfaceC30731q(name = "call_type") String callType, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) int i13, @InterfaceC30731q(name = "total_participant_duration") int i14, @InterfaceC30731q(name = "total_participant_sessions") int i15, @InterfaceC30731q(name = "participants_sessions") List<ParticipantSessionDetails> participantsSessions, @InterfaceC30731q(name = "next") String str, @InterfaceC30731q(name = "prev") String str2, @InterfaceC30731q(name = "session") CallSessionResponse callSessionResponse) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callSessionId, "callSessionId");
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(participantsSessions, "participantsSessions");
        this.callId = callId;
        this.callSessionId = callSessionId;
        this.callType = callType;
        this.duration = i13;
        this.totalParticipantDuration = i14;
        this.totalParticipantSessions = i15;
        this.participantsSessions = participantsSessions;
        this.next = str;
        this.prev = str2;
        this.session = callSessionResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryCallParticipantSessionsResponse copy$default(QueryCallParticipantSessionsResponse queryCallParticipantSessionsResponse, String str, String str2, String str3, int i13, int i14, int i15, List list, String str4, String str5, CallSessionResponse callSessionResponse, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = queryCallParticipantSessionsResponse.callId;
        }
        if ((i16 & 2) != 0) {
            str2 = queryCallParticipantSessionsResponse.callSessionId;
        }
        if ((i16 & 4) != 0) {
            str3 = queryCallParticipantSessionsResponse.callType;
        }
        if ((i16 & 8) != 0) {
            i13 = queryCallParticipantSessionsResponse.duration;
        }
        if ((i16 & 16) != 0) {
            i14 = queryCallParticipantSessionsResponse.totalParticipantDuration;
        }
        if ((i16 & 32) != 0) {
            i15 = queryCallParticipantSessionsResponse.totalParticipantSessions;
        }
        if ((i16 & 64) != 0) {
            list = queryCallParticipantSessionsResponse.participantsSessions;
        }
        if ((i16 & 128) != 0) {
            str4 = queryCallParticipantSessionsResponse.next;
        }
        if ((i16 & 256) != 0) {
            str5 = queryCallParticipantSessionsResponse.prev;
        }
        if ((i16 & 512) != 0) {
            callSessionResponse = queryCallParticipantSessionsResponse.session;
        }
        String str6 = str5;
        CallSessionResponse callSessionResponse2 = callSessionResponse;
        List list2 = list;
        String str7 = str4;
        int i17 = i14;
        int i18 = i15;
        return queryCallParticipantSessionsResponse.copy(str, str2, str3, i13, i17, i18, list2, str7, str6, callSessionResponse2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CallSessionResponse getSession() {
        return this.session;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCallSessionId() {
        return this.callSessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCallType() {
        return this.callType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalParticipantDuration() {
        return this.totalParticipantDuration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTotalParticipantSessions() {
        return this.totalParticipantSessions;
    }

    public final List<ParticipantSessionDetails> component7() {
        return this.participantsSessions;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    public final QueryCallParticipantSessionsResponse copy(@InterfaceC30731q(name = "call_id") String callId, @InterfaceC30731q(name = "call_session_id") String callSessionId, @InterfaceC30731q(name = "call_type") String callType, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) int duration, @InterfaceC30731q(name = "total_participant_duration") int totalParticipantDuration, @InterfaceC30731q(name = "total_participant_sessions") int totalParticipantSessions, @InterfaceC30731q(name = "participants_sessions") List<ParticipantSessionDetails> participantsSessions, @InterfaceC30731q(name = "next") String next, @InterfaceC30731q(name = "prev") String prev, @InterfaceC30731q(name = "session") CallSessionResponse session) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callSessionId, "callSessionId");
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(participantsSessions, "participantsSessions");
        return new QueryCallParticipantSessionsResponse(callId, callSessionId, callType, duration, totalParticipantDuration, totalParticipantSessions, participantsSessions, next, prev, session);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryCallParticipantSessionsResponse)) {
            return false;
        }
        QueryCallParticipantSessionsResponse queryCallParticipantSessionsResponse = (QueryCallParticipantSessionsResponse) other;
        return AbstractC22676k.m65745e(this.callId, queryCallParticipantSessionsResponse.callId) && AbstractC22676k.m65745e(this.callSessionId, queryCallParticipantSessionsResponse.callSessionId) && AbstractC22676k.m65745e(this.callType, queryCallParticipantSessionsResponse.callType) && this.duration == queryCallParticipantSessionsResponse.duration && this.totalParticipantDuration == queryCallParticipantSessionsResponse.totalParticipantDuration && this.totalParticipantSessions == queryCallParticipantSessionsResponse.totalParticipantSessions && AbstractC22676k.m65745e(this.participantsSessions, queryCallParticipantSessionsResponse.participantsSessions) && AbstractC22676k.m65745e(this.next, queryCallParticipantSessionsResponse.next) && AbstractC22676k.m65745e(this.prev, queryCallParticipantSessionsResponse.prev) && AbstractC22676k.m65745e(this.session, queryCallParticipantSessionsResponse.session);
    }

    public final String getCallId() {
        return this.callId;
    }

    public final String getCallSessionId() {
        return this.callSessionId;
    }

    public final String getCallType() {
        return this.callType;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getNext() {
        return this.next;
    }

    public final List<ParticipantSessionDetails> getParticipantsSessions() {
        return this.participantsSessions;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final CallSessionResponse getSession() {
        return this.session;
    }

    public final int getTotalParticipantDuration() {
        return this.totalParticipantDuration;
    }

    public final int getTotalParticipantSessions() {
        return this.totalParticipantSessions;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30448b(this.totalParticipantSessions, AbstractC11266d.m30448b(this.totalParticipantDuration, AbstractC11266d.m30448b(this.duration, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.callId.hashCode() * 31, 31, this.callSessionId), 31, this.callType), 31), 31), 31), 31, this.participantsSessions);
        String str = this.next;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prev;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CallSessionResponse callSessionResponse = this.session;
        return iHashCode2 + (callSessionResponse != null ? callSessionResponse.hashCode() : 0);
    }

    public String toString() {
        String str = this.callId;
        String str2 = this.callSessionId;
        String str3 = this.callType;
        int i13 = this.duration;
        int i14 = this.totalParticipantDuration;
        int i15 = this.totalParticipantSessions;
        List<ParticipantSessionDetails> list = this.participantsSessions;
        String str4 = this.next;
        String str5 = this.prev;
        CallSessionResponse callSessionResponse = this.session;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("QueryCallParticipantSessionsResponse(callId=", str, ", callSessionId=", str2, ", callType=");
        AbstractC11266d.m30470x(i13, str3, ", duration=", ", totalParticipantDuration=", sbM32001t);
        AbstractC30802r.m94773v(sbM32001t, i14, ", totalParticipantSessions=", i15, ", participantsSessions=");
        AbstractC17176i.m48511m(", next=", str4, ", prev=", sbM32001t, list);
        sbM32001t.append(str5);
        sbM32001t.append(", session=");
        sbM32001t.append(callSessionResponse);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public /* synthetic */ QueryCallParticipantSessionsResponse(String str, String str2, String str3, int i13, int i14, int i15, List list, String str4, String str5, CallSessionResponse callSessionResponse, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i13, i14, i15, (i16 & 64) != 0 ? C25271y.f99162w : list, (i16 & 128) != 0 ? null : str4, (i16 & 256) != 0 ? null : str5, (i16 & 512) != 0 ? null : callSessionResponse);
    }
}
