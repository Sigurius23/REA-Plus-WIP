package io.getstream.android.video.generated.models;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.List;
import jg3.C21682i;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0017J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0017J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ \u0001\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0017J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u0017R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010 R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b;\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b<\u0010\u0017R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00100\u001a\u0004\b=\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00100\u001a\u0004\b>\u0010\u0017R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b?\u0010\u001c¨\u0006@"}, m65681d2 = {"Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;", "", "", "callId", "callSessionId", "callType", AttachmentExtensionsKt.EXTRA_DURATION, "", "Lio/getstream/android/video/generated/models/CallStatsParticipant;", "participants", "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;", "counts", "Ljg3/i;", "callEndedAt", "callStartedAt", "next", "prev", "tmpDataSource", "Lio/getstream/android/video/generated/models/CallLevelEventPayload;", "callEvents", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;", "component7", "()Ljg3/i;", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljg3/i;Ljg3/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lio/getstream/android/video/generated/models/QueryCallSessionParticipantStatsResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "getCallSessionId", "getCallType", "getDuration", "Ljava/util/List;", "getParticipants", "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;", "getCounts", "Ljg3/i;", "getCallEndedAt", "getCallStartedAt", "getNext", "getPrev", "getTmpDataSource", "getCallEvents", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class QueryCallSessionParticipantStatsResponse {
    private final C21682i callEndedAt;
    private final List<CallLevelEventPayload> callEvents;
    private final String callId;
    private final String callSessionId;
    private final C21682i callStartedAt;
    private final String callType;
    private final CallStatsParticipantCounts counts;
    private final String duration;
    private final String next;
    private final List<CallStatsParticipant> participants;
    private final String prev;
    private final String tmpDataSource;

    public QueryCallSessionParticipantStatsResponse(@InterfaceC30731q(name = "call_id") String callId, @InterfaceC30731q(name = "call_session_id") String callSessionId, @InterfaceC30731q(name = "call_type") String callType, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "participants") List<CallStatsParticipant> participants, @InterfaceC30731q(name = "counts") CallStatsParticipantCounts counts, @InterfaceC30731q(name = "call_ended_at") C21682i c21682i, @InterfaceC30731q(name = "call_started_at") C21682i c21682i2, @InterfaceC30731q(name = "next") String str, @InterfaceC30731q(name = "prev") String str2, @InterfaceC30731q(name = "tmp_data_source") String str3, @InterfaceC30731q(name = "call_events") List<CallLevelEventPayload> list) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callSessionId, "callSessionId");
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(counts, "counts");
        this.callId = callId;
        this.callSessionId = callSessionId;
        this.callType = callType;
        this.duration = duration;
        this.participants = participants;
        this.counts = counts;
        this.callEndedAt = c21682i;
        this.callStartedAt = c21682i2;
        this.next = str;
        this.prev = str2;
        this.tmpDataSource = str3;
        this.callEvents = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QueryCallSessionParticipantStatsResponse copy$default(QueryCallSessionParticipantStatsResponse queryCallSessionParticipantStatsResponse, String str, String str2, String str3, String str4, List list, CallStatsParticipantCounts callStatsParticipantCounts, C21682i c21682i, C21682i c21682i2, String str5, String str6, String str7, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = queryCallSessionParticipantStatsResponse.callId;
        }
        if ((i13 & 2) != 0) {
            str2 = queryCallSessionParticipantStatsResponse.callSessionId;
        }
        if ((i13 & 4) != 0) {
            str3 = queryCallSessionParticipantStatsResponse.callType;
        }
        if ((i13 & 8) != 0) {
            str4 = queryCallSessionParticipantStatsResponse.duration;
        }
        if ((i13 & 16) != 0) {
            list = queryCallSessionParticipantStatsResponse.participants;
        }
        if ((i13 & 32) != 0) {
            callStatsParticipantCounts = queryCallSessionParticipantStatsResponse.counts;
        }
        if ((i13 & 64) != 0) {
            c21682i = queryCallSessionParticipantStatsResponse.callEndedAt;
        }
        if ((i13 & 128) != 0) {
            c21682i2 = queryCallSessionParticipantStatsResponse.callStartedAt;
        }
        if ((i13 & 256) != 0) {
            str5 = queryCallSessionParticipantStatsResponse.next;
        }
        if ((i13 & 512) != 0) {
            str6 = queryCallSessionParticipantStatsResponse.prev;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str7 = queryCallSessionParticipantStatsResponse.tmpDataSource;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            list2 = queryCallSessionParticipantStatsResponse.callEvents;
        }
        String str8 = str7;
        List list3 = list2;
        String str9 = str5;
        String str10 = str6;
        C21682i c21682i3 = c21682i;
        C21682i c21682i4 = c21682i2;
        List list4 = list;
        CallStatsParticipantCounts callStatsParticipantCounts2 = callStatsParticipantCounts;
        return queryCallSessionParticipantStatsResponse.copy(str, str2, str3, str4, list4, callStatsParticipantCounts2, c21682i3, c21682i4, str9, str10, str8, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPrev() {
        return this.prev;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTmpDataSource() {
        return this.tmpDataSource;
    }

    public final List<CallLevelEventPayload> component12() {
        return this.callEvents;
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
    public final String getDuration() {
        return this.duration;
    }

    public final List<CallStatsParticipant> component5() {
        return this.participants;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CallStatsParticipantCounts getCounts() {
        return this.counts;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final C21682i getCallEndedAt() {
        return this.callEndedAt;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final C21682i getCallStartedAt() {
        return this.callStartedAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getNext() {
        return this.next;
    }

    public final QueryCallSessionParticipantStatsResponse copy(@InterfaceC30731q(name = "call_id") String callId, @InterfaceC30731q(name = "call_session_id") String callSessionId, @InterfaceC30731q(name = "call_type") String callType, @InterfaceC30731q(name = AttachmentExtensionsKt.EXTRA_DURATION) String duration, @InterfaceC30731q(name = "participants") List<CallStatsParticipant> participants, @InterfaceC30731q(name = "counts") CallStatsParticipantCounts counts, @InterfaceC30731q(name = "call_ended_at") C21682i callEndedAt, @InterfaceC30731q(name = "call_started_at") C21682i callStartedAt, @InterfaceC30731q(name = "next") String next, @InterfaceC30731q(name = "prev") String prev, @InterfaceC30731q(name = "tmp_data_source") String tmpDataSource, @InterfaceC30731q(name = "call_events") List<CallLevelEventPayload> callEvents) {
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callSessionId, "callSessionId");
        AbstractC22676k.m65750j(callType, "callType");
        AbstractC22676k.m65750j(duration, "duration");
        AbstractC22676k.m65750j(participants, "participants");
        AbstractC22676k.m65750j(counts, "counts");
        return new QueryCallSessionParticipantStatsResponse(callId, callSessionId, callType, duration, participants, counts, callEndedAt, callStartedAt, next, prev, tmpDataSource, callEvents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryCallSessionParticipantStatsResponse)) {
            return false;
        }
        QueryCallSessionParticipantStatsResponse queryCallSessionParticipantStatsResponse = (QueryCallSessionParticipantStatsResponse) other;
        return AbstractC22676k.m65745e(this.callId, queryCallSessionParticipantStatsResponse.callId) && AbstractC22676k.m65745e(this.callSessionId, queryCallSessionParticipantStatsResponse.callSessionId) && AbstractC22676k.m65745e(this.callType, queryCallSessionParticipantStatsResponse.callType) && AbstractC22676k.m65745e(this.duration, queryCallSessionParticipantStatsResponse.duration) && AbstractC22676k.m65745e(this.participants, queryCallSessionParticipantStatsResponse.participants) && AbstractC22676k.m65745e(this.counts, queryCallSessionParticipantStatsResponse.counts) && AbstractC22676k.m65745e(this.callEndedAt, queryCallSessionParticipantStatsResponse.callEndedAt) && AbstractC22676k.m65745e(this.callStartedAt, queryCallSessionParticipantStatsResponse.callStartedAt) && AbstractC22676k.m65745e(this.next, queryCallSessionParticipantStatsResponse.next) && AbstractC22676k.m65745e(this.prev, queryCallSessionParticipantStatsResponse.prev) && AbstractC22676k.m65745e(this.tmpDataSource, queryCallSessionParticipantStatsResponse.tmpDataSource) && AbstractC22676k.m65745e(this.callEvents, queryCallSessionParticipantStatsResponse.callEvents);
    }

    public final C21682i getCallEndedAt() {
        return this.callEndedAt;
    }

    public final List<CallLevelEventPayload> getCallEvents() {
        return this.callEvents;
    }

    public final String getCallId() {
        return this.callId;
    }

    public final String getCallSessionId() {
        return this.callSessionId;
    }

    public final C21682i getCallStartedAt() {
        return this.callStartedAt;
    }

    public final String getCallType() {
        return this.callType;
    }

    public final CallStatsParticipantCounts getCounts() {
        return this.counts;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getNext() {
        return this.next;
    }

    public final List<CallStatsParticipant> getParticipants() {
        return this.participants;
    }

    public final String getPrev() {
        return this.prev;
    }

    public final String getTmpDataSource() {
        return this.tmpDataSource;
    }

    public int hashCode() {
        int iHashCode = (this.counts.hashCode() + AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.callId.hashCode() * 31, 31, this.callSessionId), 31, this.callType), 31, this.duration), 31, this.participants)) * 31;
        C21682i c21682i = this.callEndedAt;
        int iHashCode2 = (iHashCode + (c21682i == null ? 0 : c21682i.hashCode())) * 31;
        C21682i c21682i2 = this.callStartedAt;
        int iHashCode3 = (iHashCode2 + (c21682i2 == null ? 0 : c21682i2.hashCode())) * 31;
        String str = this.next;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prev;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tmpDataSource;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<CallLevelEventPayload> list = this.callEvents;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.callId;
        String str2 = this.callSessionId;
        String str3 = this.callType;
        String str4 = this.duration;
        List<CallStatsParticipant> list = this.participants;
        CallStatsParticipantCounts callStatsParticipantCounts = this.counts;
        C21682i c21682i = this.callEndedAt;
        C21682i c21682i2 = this.callStartedAt;
        String str5 = this.next;
        String str6 = this.prev;
        String str7 = this.tmpDataSource;
        List<CallLevelEventPayload> list2 = this.callEvents;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("QueryCallSessionParticipantStatsResponse(callId=", str, ", callSessionId=", str2, ", callType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", duration=", str4, ", participants=");
        sbM32001t.append(list);
        sbM32001t.append(", counts=");
        sbM32001t.append(callStatsParticipantCounts);
        sbM32001t.append(", callEndedAt=");
        sbM32001t.append(c21682i);
        sbM32001t.append(", callStartedAt=");
        sbM32001t.append(c21682i2);
        sbM32001t.append(", next=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", prev=", str6, ", tmpDataSource=");
        return AbstractC30007c.m91840j(str7, ", callEvents=", ")", sbM32001t, list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ QueryCallSessionParticipantStatsResponse(String str, String str2, String str3, String str4, List list, CallStatsParticipantCounts callStatsParticipantCounts, C21682i c21682i, C21682i c21682i2, String str5, String str6, String str7, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 16;
        C25271y c25271y = C25271y.f99162w;
        this(str, str2, str3, str4, i14 != 0 ? c25271y : list, callStatsParticipantCounts, (i13 & 64) != 0 ? null : c21682i, (i13 & 128) != 0 ? null : c21682i2, (i13 & 256) != 0 ? null : str5, (i13 & 512) != 0 ? null : str6, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str7, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c25271y : list2);
    }
}
