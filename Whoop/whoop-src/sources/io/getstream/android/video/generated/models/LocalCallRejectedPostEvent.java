package io.getstream.android.video.generated.models;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import com.whoop.service.network.model.UserState;
import jg3.C21682i;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0010JN\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b.\u0010\u0010R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b/\u0010\u0010¨\u00060"}, m65681d2 = {"Lio/getstream/android/video/generated/models/LocalCallRejectedPostEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "Lio/getstream/android/video/generated/models/CallResponse;", NotificationCompat.CATEGORY_CALL, "Lio/getstream/android/video/generated/models/UserResponse;", UserState.Sources.USER, "type", "reason", "<init>", "(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "()Lio/getstream/android/video/generated/models/CallResponse;", "component4", "()Lio/getstream/android/video/generated/models/UserResponse;", "component5", "component6", "copy", "(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Lio/getstream/android/video/generated/models/UserResponse;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/android/video/generated/models/LocalCallRejectedPostEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "Lio/getstream/android/video/generated/models/CallResponse;", "getCall", "Lio/getstream/android/video/generated/models/UserResponse;", "getUser", "getType", "getReason", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class LocalCallRejectedPostEvent extends VideoEvent implements WSCallEvent {
    private final CallResponse call;
    private final String callCid;
    private final C21682i createdAt;
    private final String reason;
    private final String type;
    private final UserResponse user;

    public /* synthetic */ LocalCallRejectedPostEvent(String str, C21682i c21682i, CallResponse callResponse, UserResponse userResponse, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c21682i, callResponse, userResponse, str2, (i13 & 32) != 0 ? null : str3);
    }

    public static /* synthetic */ LocalCallRejectedPostEvent copy$default(LocalCallRejectedPostEvent localCallRejectedPostEvent, String str, C21682i c21682i, CallResponse callResponse, UserResponse userResponse, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = localCallRejectedPostEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = localCallRejectedPostEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            callResponse = localCallRejectedPostEvent.call;
        }
        if ((i13 & 8) != 0) {
            userResponse = localCallRejectedPostEvent.user;
        }
        if ((i13 & 16) != 0) {
            str2 = localCallRejectedPostEvent.type;
        }
        if ((i13 & 32) != 0) {
            str3 = localCallRejectedPostEvent.reason;
        }
        String str4 = str2;
        String str5 = str3;
        return localCallRejectedPostEvent.copy(str, c21682i, callResponse, userResponse, str4, str5);
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
    public final UserResponse getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final LocalCallRejectedPostEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "reason") String reason) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        return new LocalCallRejectedPostEvent(callCid, createdAt, call, user, type, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalCallRejectedPostEvent)) {
            return false;
        }
        LocalCallRejectedPostEvent localCallRejectedPostEvent = (LocalCallRejectedPostEvent) other;
        return AbstractC22676k.m65745e(this.callCid, localCallRejectedPostEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, localCallRejectedPostEvent.createdAt) && AbstractC22676k.m65745e(this.call, localCallRejectedPostEvent.call) && AbstractC22676k.m65745e(this.user, localCallRejectedPostEvent.user) && AbstractC22676k.m65745e(this.type, localCallRejectedPostEvent.type) && AbstractC22676k.m65745e(this.reason, localCallRejectedPostEvent.reason);
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
        int iM30450d = AbstractC11266d.m30450d((this.user.hashCode() + AbstractC3855a.m11818b(this.call, AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31)) * 31, 31, this.type);
        String str = this.reason;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        CallResponse callResponse = this.call;
        UserResponse userResponse = this.user;
        String str2 = this.type;
        String str3 = this.reason;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("LocalCallRejectedPostEvent(callCid=", c21682i, str, ", createdAt=", ", call=");
        sbM94767p.append(callResponse);
        sbM94767p.append(", user=");
        sbM94767p.append(userResponse);
        sbM94767p.append(", type=");
        return AbstractC11266d.m30464r(sbM94767p, str2, ", reason=", str3, ")");
    }

    public LocalCallRejectedPostEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = UserState.Sources.USER) UserResponse user, @InterfaceC30731q(name = "type") String type, @InterfaceC30731q(name = "reason") String str) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.call = call;
        this.user = user;
        this.type = type;
        this.reason = str;
    }
}
