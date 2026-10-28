package io.getstream.android.video.generated.models;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
import java.util.List;
import java.util.Map;
import jg3.C21682i;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u001a\b\u0003\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012Jd\u0010\u001e\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\u000b\u001a\u00020\n2\u001a\b\u0003\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\f2\b\b\u0003\u0010\u000e\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0016R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001aR)\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b3\u0010\u0012¨\u00064"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallMemberUpdatedPermissionEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "", "Lio/getstream/android/video/generated/models/MemberResponse;", QueryChannelRequest.KEY_MEMBERS, "Lio/getstream/android/video/generated/models/CallResponse;", NotificationCompat.CATEGORY_CALL, "", "capabilitiesByRole", "type", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Ljava/util/Map;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "()Ljava/util/List;", "component4", "()Lio/getstream/android/video/generated/models/CallResponse;", "component5", "()Ljava/util/Map;", "component6", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Ljava/util/Map;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallMemberUpdatedPermissionEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "Ljava/util/List;", "getMembers", "Lio/getstream/android/video/generated/models/CallResponse;", "getCall", "Ljava/util/Map;", "getCapabilitiesByRole", "getType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallMemberUpdatedPermissionEvent extends VideoEvent implements WSCallEvent {
    private final CallResponse call;
    private final String callCid;
    private final Map<String, List<String>> capabilitiesByRole;
    private final C21682i createdAt;
    private final List<MemberResponse> members;
    private final String type;

    public /* synthetic */ CallMemberUpdatedPermissionEvent(String str, C21682i c21682i, List list, CallResponse callResponse, Map map, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, (i13 & 4) != 0 ? C25271y.f99162w : list, callResponse, (i13 & 16) != 0 ? C25272z.f99163w : map, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallMemberUpdatedPermissionEvent copy$default(CallMemberUpdatedPermissionEvent callMemberUpdatedPermissionEvent, String str, C21682i c21682i, List list, CallResponse callResponse, Map map, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callMemberUpdatedPermissionEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = callMemberUpdatedPermissionEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            list = callMemberUpdatedPermissionEvent.members;
        }
        if ((i13 & 8) != 0) {
            callResponse = callMemberUpdatedPermissionEvent.call;
        }
        if ((i13 & 16) != 0) {
            map = callMemberUpdatedPermissionEvent.capabilitiesByRole;
        }
        if ((i13 & 32) != 0) {
            str2 = callMemberUpdatedPermissionEvent.type;
        }
        Map map2 = map;
        String str3 = str2;
        return callMemberUpdatedPermissionEvent.copy(str, c21682i, list, callResponse, map2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCallCid() {
        return this.callCid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    public final List<MemberResponse> component3() {
        return this.members;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CallResponse getCall() {
        return this.call;
    }

    public final Map<String, List<String>> component5() {
        return this.capabilitiesByRole;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final CallMemberUpdatedPermissionEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "capabilities_by_role") Map<String, ? extends List<String>> capabilitiesByRole, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(capabilitiesByRole, "capabilitiesByRole");
        AbstractC22676k.m65750j(type, "type");
        return new CallMemberUpdatedPermissionEvent(callCid, createdAt, members, call, capabilitiesByRole, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallMemberUpdatedPermissionEvent)) {
            return false;
        }
        CallMemberUpdatedPermissionEvent callMemberUpdatedPermissionEvent = (CallMemberUpdatedPermissionEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callMemberUpdatedPermissionEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, callMemberUpdatedPermissionEvent.createdAt) && AbstractC22676k.m65745e(this.members, callMemberUpdatedPermissionEvent.members) && AbstractC22676k.m65745e(this.call, callMemberUpdatedPermissionEvent.call) && AbstractC22676k.m65745e(this.capabilitiesByRole, callMemberUpdatedPermissionEvent.capabilitiesByRole) && AbstractC22676k.m65745e(this.type, callMemberUpdatedPermissionEvent.type);
    }

    public final CallResponse getCall() {
        return this.call;
    }

    @Override // io.getstream.android.video.generated.models.WSCallEvent
    public String getCallCID() {
        return this.callCid;
    }

    public final String getCallCid() {
        return this.callCid;
    }

    public final Map<String, List<String>> getCapabilitiesByRole() {
        return this.capabilitiesByRole;
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return this.type;
    }

    public final List<MemberResponse> getMembers() {
        return this.members;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + AbstractC3855a.m11821e(this.capabilitiesByRole, AbstractC3855a.m11818b(this.call, AbstractC11895b.m31983b(AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31, this.members), 31), 31);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        List<MemberResponse> list = this.members;
        CallResponse callResponse = this.call;
        Map<String, List<String>> map = this.capabilitiesByRole;
        String str2 = this.type;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CallMemberUpdatedPermissionEvent(callCid=", c21682i, str, ", createdAt=", ", members=");
        sbM94767p.append(list);
        sbM94767p.append(", call=");
        sbM94767p.append(callResponse);
        sbM94767p.append(", capabilitiesByRole=");
        sbM94767p.append(map);
        sbM94767p.append(", type=");
        sbM94767p.append(str2);
        sbM94767p.append(")");
        return sbM94767p.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallMemberUpdatedPermissionEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "capabilities_by_role") Map<String, ? extends List<String>> capabilitiesByRole, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(capabilitiesByRole, "capabilitiesByRole");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.members = members;
        this.call = call;
        this.capabilitiesByRole = capabilitiesByRole;
        this.type = type;
    }
}
