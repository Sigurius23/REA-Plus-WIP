package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import d13.AbstractC11478a;
import io.getstream.chat.android.models.User;
import java.util.Date;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\""}, m65681d2 = {"Lio/getstream/chat/android/client/events/ConnectedEvent;", "Lio/getstream/chat/android/client/events/ChatEvent;", "Lio/getstream/chat/android/client/events/HasOwnUser;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "me", "Lio/getstream/chat/android/models/User;", "connectionId", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getMe", "()Lio/getstream/chat/android/models/User;", "getConnectionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ConnectedEvent extends ChatEvent implements HasOwnUser {
    private final String connectionId;
    private final Date createdAt;
    private final User me;
    private final String rawCreatedAt;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectedEvent(String type, Date createdAt, String rawCreatedAt, User me4, String connectionId) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(me4, "me");
        AbstractC22676k.m65750j(connectionId, "connectionId");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.me = me4;
        this.connectionId = connectionId;
    }

    public static /* synthetic */ ConnectedEvent copy$default(ConnectedEvent connectedEvent, String str, Date date, String str2, User user, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = connectedEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = connectedEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = connectedEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            user = connectedEvent.me;
        }
        if ((i13 & 16) != 0) {
            str3 = connectedEvent.connectionId;
        }
        String str4 = str3;
        String str5 = str2;
        return connectedEvent.copy(str, date, str5, user, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final User getMe() {
        return this.me;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getConnectionId() {
        return this.connectionId;
    }

    public final ConnectedEvent copy(String type, Date createdAt, String rawCreatedAt, User me4, String connectionId) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(me4, "me");
        AbstractC22676k.m65750j(connectionId, "connectionId");
        return new ConnectedEvent(type, createdAt, rawCreatedAt, me4, connectionId);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectedEvent)) {
            return false;
        }
        ConnectedEvent connectedEvent = (ConnectedEvent) other;
        return AbstractC22676k.m65745e(this.type, connectedEvent.type) && AbstractC22676k.m65745e(this.createdAt, connectedEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, connectedEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.me, connectedEvent.me) && AbstractC22676k.m65745e(this.connectionId, connectedEvent.connectionId);
    }

    public final String getConnectionId() {
        return this.connectionId;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.getstream.chat.android.client.events.HasOwnUser
    public final User getMe() {
        return this.me;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getRawCreatedAt() {
        return this.rawCreatedAt;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.connectionId.hashCode() + AbstractC11478a.m30850b(this.me, AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        User user = this.me;
        String str3 = this.connectionId;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("ConnectedEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11478a.m30866r(sbM11830n, str2, ", me=", user, ", connectionId=");
        return AbstractC25012a.m73376i(str3, ")", sbM11830n);
    }
}
