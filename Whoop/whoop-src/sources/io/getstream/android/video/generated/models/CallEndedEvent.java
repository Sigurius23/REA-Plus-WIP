package io.getstream.android.video.generated.models;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api.models.QueryChannelRequest;
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
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJb\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00032\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b1\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b2\u0010\u0013R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00105\u001a\u0004\b6\u0010\u001f¨\u00067"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallEndedEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "Lio/getstream/android/video/generated/models/CallResponse;", NotificationCompat.CATEGORY_CALL, "type", "reason", "", "Lio/getstream/android/video/generated/models/MemberResponse;", QueryChannelRequest.KEY_MEMBERS, "Lio/getstream/android/video/generated/models/UserResponse;", UserState.Sources.USER, "<init>", "(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "()Lio/getstream/android/video/generated/models/CallResponse;", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Lio/getstream/android/video/generated/models/UserResponse;", "copy", "(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/UserResponse;)Lio/getstream/android/video/generated/models/CallEndedEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "Lio/getstream/android/video/generated/models/CallResponse;", "getCall", "getType", "getReason", "Ljava/util/List;", "getMembers", "Lio/getstream/android/video/generated/models/UserResponse;", "getUser", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallEndedEvent extends VideoEvent implements WSCallEvent {
    private final CallResponse call;
    private final String callCid;
    private final C21682i createdAt;
    private final List<MemberResponse> members;
    private final String reason;
    private final String type;
    private final UserResponse user;

    public /* synthetic */ CallEndedEvent(String str, C21682i c21682i, CallResponse callResponse, String str2, String str3, List list, UserResponse userResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, callResponse, str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? C25271y.f99162w : list, (i13 & 64) != 0 ? null : userResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallEndedEvent copy$default(CallEndedEvent callEndedEvent, String str, C21682i c21682i, CallResponse callResponse, String str2, String str3, List list, UserResponse userResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callEndedEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = callEndedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            callResponse = callEndedEvent.call;
        }
        if ((i13 & 8) != 0) {
            str2 = callEndedEvent.type;
        }
        if ((i13 & 16) != 0) {
            str3 = callEndedEvent.reason;
        }
        if ((i13 & 32) != 0) {
            list = callEndedEvent.members;
        }
        if ((i13 & 64) != 0) {
            userResponse = callEndedEvent.user;
        }
        List list2 = list;
        UserResponse userResponse2 = userResponse;
        String str4 = str3;
        CallResponse callResponse2 = callResponse;
        return callEndedEvent.copy(str, c21682i, callResponse2, str2, str4, list2, userResponse2);
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
    public final CallResponse getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final List<MemberResponse> component6() {
        return this.members;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final UserResponse getUser() {
        return this.user;
    }

    public final CallEndedEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "reason") String reason, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(type, "type");
        return new CallEndedEvent(callCid, createdAt, call, type, reason, members, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallEndedEvent)) {
            return false;
        }
        CallEndedEvent callEndedEvent = (CallEndedEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callEndedEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, callEndedEvent.createdAt) && AbstractC22676k.m65745e(this.call, callEndedEvent.call) && AbstractC22676k.m65745e(this.type, callEndedEvent.type) && AbstractC22676k.m65745e(this.reason, callEndedEvent.reason) && AbstractC22676k.m65745e(this.members, callEndedEvent.members) && AbstractC22676k.m65745e(this.user, callEndedEvent.user);
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

    public final String getReason() {
        return this.reason;
    }

    public final String getType() {
        return this.type;
    }

    public final UserResponse getUser() {
        return this.user;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC3855a.m11818b(this.call, AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31), 31, this.type);
        String str = this.reason;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        List<MemberResponse> list = this.members;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        UserResponse userResponse = this.user;
        return iHashCode2 + (userResponse != null ? userResponse.hashCode() : 0);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        CallResponse callResponse = this.call;
        String str2 = this.type;
        String str3 = this.reason;
        List<MemberResponse> list = this.members;
        UserResponse userResponse = this.user;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CallEndedEvent(callCid=", c21682i, str, ", createdAt=", ", call=");
        sbM94767p.append(callResponse);
        sbM94767p.append(", type=");
        sbM94767p.append(str2);
        sbM94767p.append(", reason=");
        AbstractC36095b.m114694v(str3, ", members=", ", user=", sbM94767p, list);
        sbM94767p.append(userResponse);
        sbM94767p.append(")");
        return sbM94767p.toString();
    }

    public CallEndedEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "reason") String str, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> list, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse userResponse) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.call = call;
        this.type = type;
        this.reason = str;
        this.members = list;
        this.user = userResponse;
    }
}
