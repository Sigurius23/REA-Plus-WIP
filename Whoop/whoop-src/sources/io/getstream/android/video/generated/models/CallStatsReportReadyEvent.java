package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import java.util.List;
import jg3.C21682i;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ`\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b.\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b1\u0010\u0013R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b\f\u0010\u001dR\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u0010\u001f¨\u00065"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "sessionId", "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;", "counts", "type", "", "isTrimmed", "", "Lio/getstream/android/video/generated/models/CallStatsParticipant;", "participantsOverview", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "component4", "()Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lio/getstream/android/video/generated/models/CallStatsReportReadyEvent;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "getSessionId", "Lio/getstream/android/video/generated/models/CallStatsParticipantCounts;", "getCounts", "getType", "Ljava/lang/Boolean;", "Ljava/util/List;", "getParticipantsOverview", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallStatsReportReadyEvent extends VideoEvent implements WSCallEvent {
    private final String callCid;
    private final CallStatsParticipantCounts counts;
    private final C21682i createdAt;
    private final Boolean isTrimmed;
    private final List<CallStatsParticipant> participantsOverview;
    private final String sessionId;
    private final String type;

    public /* synthetic */ CallStatsReportReadyEvent(String str, C21682i c21682i, String str2, CallStatsParticipantCounts callStatsParticipantCounts, String str3, Boolean bool, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, str2, callStatsParticipantCounts, str3, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? C25271y.f99162w : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallStatsReportReadyEvent copy$default(CallStatsReportReadyEvent callStatsReportReadyEvent, String str, C21682i c21682i, String str2, CallStatsParticipantCounts callStatsParticipantCounts, String str3, Boolean bool, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callStatsReportReadyEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = callStatsReportReadyEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = callStatsReportReadyEvent.sessionId;
        }
        if ((i13 & 8) != 0) {
            callStatsParticipantCounts = callStatsReportReadyEvent.counts;
        }
        if ((i13 & 16) != 0) {
            str3 = callStatsReportReadyEvent.type;
        }
        if ((i13 & 32) != 0) {
            bool = callStatsReportReadyEvent.isTrimmed;
        }
        if ((i13 & 64) != 0) {
            list = callStatsReportReadyEvent.participantsOverview;
        }
        Boolean bool2 = bool;
        List list2 = list;
        String str4 = str3;
        String str5 = str2;
        return callStatsReportReadyEvent.copy(str, c21682i, str5, callStatsParticipantCounts, str4, bool2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallCid() {
        return this.callCid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CallStatsParticipantCounts getCounts() {
        return this.counts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsTrimmed() {
        return this.isTrimmed;
    }

    public final List<CallStatsParticipant> component7() {
        return this.participantsOverview;
    }

    public final CallStatsReportReadyEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "session_id") String sessionId, @InterfaceC30731q(name = "counts") CallStatsParticipantCounts counts, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "is_trimmed") Boolean isTrimmed, @InterfaceC30731q(name = "participants_overview") List<CallStatsParticipant> participantsOverview) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(counts, "counts");
        AbstractC22676k.m65750j(type, "type");
        return new CallStatsReportReadyEvent(callCid, createdAt, sessionId, counts, type, isTrimmed, participantsOverview);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallStatsReportReadyEvent)) {
            return false;
        }
        CallStatsReportReadyEvent callStatsReportReadyEvent = (CallStatsReportReadyEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callStatsReportReadyEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, callStatsReportReadyEvent.createdAt) && AbstractC22676k.m65745e(this.sessionId, callStatsReportReadyEvent.sessionId) && AbstractC22676k.m65745e(this.counts, callStatsReportReadyEvent.counts) && AbstractC22676k.m65745e(this.type, callStatsReportReadyEvent.type) && AbstractC22676k.m65745e(this.isTrimmed, callStatsReportReadyEvent.isTrimmed) && AbstractC22676k.m65745e(this.participantsOverview, callStatsReportReadyEvent.participantsOverview);
    }

    @Override // io.getstream.android.video.generated.models.WSCallEvent
    public String getCallCID() {
        return this.callCid;
    }

    public final String getCallCid() {
        return this.callCid;
    }

    public final CallStatsParticipantCounts getCounts() {
        return this.counts;
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return this.type;
    }

    public final List<CallStatsParticipant> getParticipantsOverview() {
        return this.participantsOverview;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.counts.hashCode() + AbstractC11266d.m30450d(AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31, this.sessionId)) * 31, 31, this.type);
        Boolean bool = this.isTrimmed;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        List<CallStatsParticipant> list = this.participantsOverview;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final Boolean isTrimmed() {
        return this.isTrimmed;
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        String str2 = this.sessionId;
        CallStatsParticipantCounts callStatsParticipantCounts = this.counts;
        String str3 = this.type;
        Boolean bool = this.isTrimmed;
        List<CallStatsParticipant> list = this.participantsOverview;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CallStatsReportReadyEvent(callCid=", c21682i, str, ", createdAt=", ", sessionId=");
        sbM94767p.append(str2);
        sbM94767p.append(", counts=");
        sbM94767p.append(callStatsParticipantCounts);
        sbM94767p.append(", type=");
        AbstractC36095b.m114692t(bool, str3, ", isTrimmed=", ", participantsOverview=", sbM94767p);
        return AbstractC3855a.m11829m(sbM94767p, list, ")");
    }

    public CallStatsReportReadyEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "session_id") String sessionId, @InterfaceC30731q(name = "counts") CallStatsParticipantCounts counts, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "is_trimmed") Boolean bool, @InterfaceC30731q(name = "participants_overview") List<CallStatsParticipant> list) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(counts, "counts");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.sessionId = sessionId;
        this.counts = counts;
        this.type = type;
        this.isTrimmed = bool;
        this.participantsOverview = list;
    }
}
