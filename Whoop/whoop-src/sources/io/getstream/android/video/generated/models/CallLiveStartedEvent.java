package io.getstream.android.video.generated.models;

import androidx.core.app.NotificationCompat;
import c13.AbstractC3855a;
import jg3.C21682i;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\rJ8\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b&\u0010\r¨\u0006'"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallLiveStartedEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "Lio/getstream/android/video/generated/models/CallResponse;", NotificationCompat.CATEGORY_CALL, "type", "<init>", "(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "()Lio/getstream/android/video/generated/models/CallResponse;", "component4", "copy", "(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/CallResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallLiveStartedEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "Lio/getstream/android/video/generated/models/CallResponse;", "getCall", "getType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallLiveStartedEvent extends VideoEvent implements WSCallEvent {
    private final CallResponse call;
    private final String callCid;
    private final C21682i createdAt;
    private final String type;

    public CallLiveStartedEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.call = call;
        this.type = type;
    }

    public static /* synthetic */ CallLiveStartedEvent copy$default(CallLiveStartedEvent callLiveStartedEvent, String str, C21682i c21682i, CallResponse callResponse, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callLiveStartedEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = callLiveStartedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            callResponse = callLiveStartedEvent.call;
        }
        if ((i13 & 8) != 0) {
            str2 = callLiveStartedEvent.type;
        }
        return callLiveStartedEvent.copy(str, c21682i, callResponse, str2);
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

    public final CallLiveStartedEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = NotificationCompat.CATEGORY_CALL) CallResponse call, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(call, "call");
        AbstractC22676k.m65750j(type, "type");
        return new CallLiveStartedEvent(callCid, createdAt, call, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallLiveStartedEvent)) {
            return false;
        }
        CallLiveStartedEvent callLiveStartedEvent = (CallLiveStartedEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callLiveStartedEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, callLiveStartedEvent.createdAt) && AbstractC22676k.m65745e(this.call, callLiveStartedEvent.call) && AbstractC22676k.m65745e(this.type, callLiveStartedEvent.type);
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

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + AbstractC3855a.m11818b(this.call, AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        CallResponse callResponse = this.call;
        String str2 = this.type;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("CallLiveStartedEvent(callCid=", c21682i, str, ", createdAt=", ", call=");
        sbM94767p.append(callResponse);
        sbM94767p.append(", type=");
        sbM94767p.append(str2);
        sbM94767p.append(")");
        return sbM94767p.toString();
    }
}
