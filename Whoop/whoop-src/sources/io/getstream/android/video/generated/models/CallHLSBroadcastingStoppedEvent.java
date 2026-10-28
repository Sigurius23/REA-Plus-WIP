package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import jg3.C21682i;
import p000.AbstractC30802r;
import p319m4.AbstractC25012a;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000bJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b \u0010\u000b¨\u0006!"}, m65681d2 = {"Lio/getstream/android/video/generated/models/CallHLSBroadcastingStoppedEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "Lio/getstream/android/video/generated/models/WSCallEvent;", "", "callCid", "Ljg3/i;", "createdAt", "type", "<init>", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "getCallCID", "component1", "component2", "()Ljg3/i;", "component3", "copy", "(Ljava/lang/String;Ljg3/i;Ljava/lang/String;)Lio/getstream/android/video/generated/models/CallHLSBroadcastingStoppedEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallCid", "Ljg3/i;", "getCreatedAt", "getType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class CallHLSBroadcastingStoppedEvent extends VideoEvent implements WSCallEvent {
    private final String callCid;
    private final C21682i createdAt;
    private final String type;

    public CallHLSBroadcastingStoppedEvent(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(type, "type");
        this.callCid = callCid;
        this.createdAt = createdAt;
        this.type = type;
    }

    public static /* synthetic */ CallHLSBroadcastingStoppedEvent copy$default(CallHLSBroadcastingStoppedEvent callHLSBroadcastingStoppedEvent, String str, C21682i c21682i, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = callHLSBroadcastingStoppedEvent.callCid;
        }
        if ((i13 & 2) != 0) {
            c21682i = callHLSBroadcastingStoppedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = callHLSBroadcastingStoppedEvent.type;
        }
        return callHLSBroadcastingStoppedEvent.copy(str, c21682i, str2);
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
    public final String getType() {
        return this.type;
    }

    public final CallHLSBroadcastingStoppedEvent copy(@InterfaceC30731q(name = "call_cid") String callCid, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(callCid, "callCid");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(type, "type");
        return new CallHLSBroadcastingStoppedEvent(callCid, createdAt, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallHLSBroadcastingStoppedEvent)) {
            return false;
        }
        CallHLSBroadcastingStoppedEvent callHLSBroadcastingStoppedEvent = (CallHLSBroadcastingStoppedEvent) other;
        return AbstractC22676k.m65745e(this.callCid, callHLSBroadcastingStoppedEvent.callCid) && AbstractC22676k.m65745e(this.createdAt, callHLSBroadcastingStoppedEvent.createdAt) && AbstractC22676k.m65745e(this.type, callHLSBroadcastingStoppedEvent.type);
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
        return this.type.hashCode() + AbstractC3855a.m11822f(this.createdAt, this.callCid.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.callCid;
        return AbstractC25012a.m73376i(this.type, ")", AbstractC30802r.m94767p("CallHLSBroadcastingStoppedEvent(callCid=", this.createdAt, str, ", createdAt=", ", type="));
    }
}
