package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import jg3.C21682i;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJ8\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\"\u0010\fR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b#\u0010\f¨\u0006$"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallRtmpBroadcastFailedEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "name", "type", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "component4", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallRtmpBroadcastFailedEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "getName", "getType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallRtmpBroadcastFailedEvent extends VideoEvent implements WSCallEvent {
    private final String callCid;
    private final C21682i createdAt;
    private final String name;
    private final String type;

    public CallRtmpBroadcastFailedEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.name = name;
        this.type = type;
    }

    public static /* synthetic */ CallRtmpBroadcastFailedEvent copy$default(CallRtmpBroadcastFailedEvent callRtmpBroadcastFailedEvent, String str, C21682i c21682i, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callRtmpBroadcastFailedEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = callRtmpBroadcastFailedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = callRtmpBroadcastFailedEvent.name;
        }
        if ((i13 & 8) != 0) {
            str3 = callRtmpBroadcastFailedEvent.type;
        }
        return callRtmpBroadcastFailedEvent.copy(str, c21682i, str2, str3);
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
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final CallRtmpBroadcastFailedEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "name") String name, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(type, "type");
        return new CallRtmpBroadcastFailedEvent(callCid, createdAt, name, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallRtmpBroadcastFailedEvent)) {
            return false;
        }
        CallRtmpBroadcastFailedEvent callRtmpBroadcastFailedEvent = (CallRtmpBroadcastFailedEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callRtmpBroadcastFailedEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, callRtmpBroadcastFailedEvent.createdAt) && AbstractC22676k.m65745e(this.name, callRtmpBroadcastFailedEvent.name) && AbstractC22676k.m65745e(this.type, callRtmpBroadcastFailedEvent.type);
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

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + AbstractC11266d.m30450d(AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31), 31, this.name);
    }

    public String toString() {
        String str = this.callCid;
        C21682i c21682i = this.createdAt;
        return AbstractC11266d.m30464r(AbstractC30802r.m94767p("CallRtmpBroadcastFailedEvent(callCid=", c21682i, str, ", createdAt=", ", name="), this.name, ", type=", this.type, ")");
    }
}
