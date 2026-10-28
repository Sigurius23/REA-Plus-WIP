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
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J\\\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b/\u0010\u0013R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b6\u0010\u0013¨\u00067"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallNotificationEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "sessionId", "", "Lio/getstream/android/video/generated/models/MemberResponse;", QueryChannelRequest.KEY_MEMBERS, "Lio/getstream/android/video/generated/models/CallResponse;", NotificationCompat.CATEGORY_CALL, "Lio/getstream/android/video/generated/models/UserResponse;", UserState.Sources.USER, "type", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lio/getstream/android/video/generated/models/CallResponse;", "component6", "()Lio/getstream/android/video/generated/models/UserResponse;", "component7", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/util/List;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallNotificationEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "getSessionId", "Ljava/util/List;", "getMembers", "Lio/getstream/android/video/generated/models/CallResponse;", "getCall", "Lio/getstream/android/video/generated/models/UserResponse;", "getUser", "getType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallNotificationEvent extends VideoEvent implements WSCallEvent {
    private final CallResponse call;
    private final String callCid;
    private final C21682i createdAt;
    private final List<MemberResponse> members;
    private final String sessionId;
    private final String type;
    private final UserResponse user;

    public /* synthetic */ CallNotificationEvent(String str, C21682i c21682i, String str2, List list, CallResponse callResponse, UserResponse userResponse, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, str2, (i13 & 8) != 0 ? C25271y.f99162w : list, callResponse, userResponse, str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CallNotificationEvent copy$default(CallNotificationEvent callNotificationEvent, String str, C21682i c21682i, String str2, List list, CallResponse callResponse, UserResponse userResponse, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callNotificationEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = callNotificationEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = callNotificationEvent.sessionId;
        }
        if ((i13 & 8) != 0) {
            list = callNotificationEvent.members;
        }
        if ((i13 & 16) != 0) {
            callResponse = callNotificationEvent.call;
        }
        if ((i13 & 32) != 0) {
            userResponse = callNotificationEvent.user;
        }
        if ((i13 & 64) != 0) {
            str3 = callNotificationEvent.type;
        }
        UserResponse userResponse2 = userResponse;
        String str4 = str3;
        CallResponse callResponse2 = callResponse;
        String str5 = str2;
        return callNotificationEvent.copy(str, c21682i, str5, list, callResponse2, userResponse2, str4);
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

    public final List<MemberResponse> component4() {
        return this.members;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CallResponse getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserResponse getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final CallNotificationEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "session_id") String sessionId, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        return new CallNotificationEvent(callCid, createdAt, sessionId, members, call, user, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallNotificationEvent)) {
            return false;
        }
        CallNotificationEvent callNotificationEvent = (CallNotificationEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callNotificationEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, callNotificationEvent.createdAt) && AbstractC22676k.m65745e(this.sessionId, callNotificationEvent.sessionId) && AbstractC22676k.m65745e(this.members, callNotificationEvent.members) && AbstractC22676k.m65745e(this.call, callNotificationEvent.call) && AbstractC22676k.m65745e(this.user, callNotificationEvent.user) && AbstractC22676k.m65745e(this.type, callNotificationEvent.type);
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

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getType() {
        return this.type;
    }

    public final UserResponse getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.type.hashCode() + ((this.user.hashCode() + AbstractC3855a.m11818b(this.call, AbstractC11895b.m31983b(AbstractC11266d.m30450d(AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31, this.sessionId), 31, this.members), 31)) * 31);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        String str2 = this.sessionId;
        List<MemberResponse> list = this.members;
        CallResponse callResponse = this.call;
        UserResponse userResponse = this.user;
        String str3 = this.type;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CallNotificationEvent(callCid=", c21682i, str, ", createdAt=", ", sessionId=");
        AbstractC36095b.m114694v(str2, ", members=", ", call=", sbM94767p, list);
        sbM94767p.append(callResponse);
        sbM94767p.append(", user=");
        sbM94767p.append(userResponse);
        sbM94767p.append(", type=");
        return AbstractC25012a.m73376i(str3, ")", sbM94767p);
    }

    public CallNotificationEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "session_id") String sessionId, @InterfaceC30731q(name = QueryChannelRequest.KEY_MEMBERS) List<MemberResponse> members, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(members, "members");
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.sessionId = sessionId;
        this.members = members;
        this.call = call;
        this.user = user;
        this.type = type;
    }
}
