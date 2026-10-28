package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.api.QueryParams;
import jg3.C21682i;
import p000.AbstractC30802r;
import p441qx.InterfaceC30731q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJ8\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\f¨\u0006%"}, m65681d2 = {"Lio/getstream/android/video/generated/models/ConnectedEvent;", "Lio/getstream/android/video/generated/models/VideoEvent;", "", "connectionId", "Ljg3/i;", "createdAt", "Lio/getstream/android/video/generated/models/OwnUserResponse;", "me", "type", "<init>", "(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/OwnUserResponse;Ljava/lang/String;)V", "getEventType", "()Ljava/lang/String;", "component1", "component2", "()Ljg3/i;", "component3", "()Lio/getstream/android/video/generated/models/OwnUserResponse;", "component4", "copy", "(Ljava/lang/String;Ljg3/i;Lio/getstream/android/video/generated/models/OwnUserResponse;Ljava/lang/String;)Lio/getstream/android/video/generated/models/ConnectedEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConnectionId", "Ljg3/i;", "getCreatedAt", "Lio/getstream/android/video/generated/models/OwnUserResponse;", "getMe", "getType", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class ConnectedEvent extends VideoEvent {
    private final String connectionId;
    private final C21682i createdAt;
    private final OwnUserResponse me;
    private final String type;

    public ConnectedEvent(@InterfaceC30731q(name = QueryParams.CONNECTION_ID) String connectionId, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "me") OwnUserResponse me4, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(connectionId, "connectionId");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(me4, "me");
        AbstractC22676k.m65750j(type, "type");
        this.connectionId = connectionId;
        this.createdAt = createdAt;
        this.me = me4;
        this.type = type;
    }

    public static /* synthetic */ ConnectedEvent copy$default(ConnectedEvent connectedEvent, String str, C21682i c21682i, OwnUserResponse ownUserResponse, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = connectedEvent.connectionId;
        }
        if ((i13 & 2) != 0) {
            c21682i = connectedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            ownUserResponse = connectedEvent.me;
        }
        if ((i13 & 8) != 0) {
            str2 = connectedEvent.type;
        }
        return connectedEvent.copy(str, c21682i, ownUserResponse, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConnectionId() {
        return this.connectionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final OwnUserResponse getMe() {
        return this.me;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final ConnectedEvent copy(@InterfaceC30731q(name = QueryParams.CONNECTION_ID) String connectionId, @InterfaceC30731q(name = "created_at") C21682i createdAt, @InterfaceC30731q(name = "me") OwnUserResponse me4, @InterfaceC30731q(name = "type") String type) {
        AbstractC22676k.m65750j(connectionId, "connectionId");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(me4, "me");
        AbstractC22676k.m65750j(type, "type");
        return new ConnectedEvent(connectionId, createdAt, me4, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectedEvent)) {
            return false;
        }
        ConnectedEvent connectedEvent = (ConnectedEvent) other;
        return AbstractC22676k.m65745e(this.connectionId, connectedEvent.connectionId) && AbstractC22676k.m65745e(this.createdAt, connectedEvent.createdAt) && AbstractC22676k.m65745e(this.me, connectedEvent.me) && AbstractC22676k.m65745e(this.type, connectedEvent.type);
    }

    public final String getConnectionId() {
        return this.connectionId;
    }

    public final C21682i getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.getstream.android.video.generated.models.VideoEvent
    /* JADX INFO: renamed from: getEventType */
    public String getType() {
        return this.type;
    }

    public final OwnUserResponse getMe() {
        return this.me;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + ((this.me.hashCode() + AbstractC3855a.m11822f(this.createdAt, this.connectionId.hashCode() * 31, 31)) * 31);
    }

    public String toString() {
        String str = this.connectionId;
        C21682i c21682i = this.createdAt;
        OwnUserResponse ownUserResponse = this.me;
        String str2 = this.type;
        StringBuilder sbM94767p = AbstractC30802r.m94767p("ConnectedEvent(connectionId=", c21682i, str, ", createdAt=", ", me=");
        sbM94767p.append(ownUserResponse);
        sbM94767p.append(", type=");
        sbM94767p.append(str2);
        sbM94767p.append(")");
        return sbM94767p.toString();
    }
}
