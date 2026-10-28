package io.getstream.chat.android.client.events;

import c13.AbstractC3855a;
import io.getstream.chat.android.client.errors.ChatError;
import java.util.Date;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m65681d2 = {"Lio/getstream/chat/android/client/events/ConnectionErrorEvent;", "Lio/getstream/chat/android/client/events/ChatEvent;", "type", "", "createdAt", "Ljava/util/Date;", "rawCreatedAt", "connectionId", "error", "Lio/getstream/chat/android/client/errors/ChatError;", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/errors/ChatError;)V", "getType", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/util/Date;", "getRawCreatedAt", "getConnectionId", "getError", "()Lio/getstream/chat/android/client/errors/ChatError;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ConnectionErrorEvent extends ChatEvent {
    private final String connectionId;
    private final Date createdAt;
    private final ChatError error;
    private final String rawCreatedAt;
    private final String type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionErrorEvent(String type, Date createdAt, String rawCreatedAt, String connectionId, ChatError error) {
        super(null);
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(connectionId, "connectionId");
        AbstractC22676k.m65750j(error, "error");
        this.type = type;
        this.createdAt = createdAt;
        this.rawCreatedAt = rawCreatedAt;
        this.connectionId = connectionId;
        this.error = error;
    }

    public static /* synthetic */ ConnectionErrorEvent copy$default(ConnectionErrorEvent connectionErrorEvent, String str, Date date, String str2, String str3, ChatError chatError, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = connectionErrorEvent.type;
        }
        if ((i13 & 2) != 0) {
            date = connectionErrorEvent.createdAt;
        }
        if ((i13 & 4) != 0) {
            str2 = connectionErrorEvent.rawCreatedAt;
        }
        if ((i13 & 8) != 0) {
            str3 = connectionErrorEvent.connectionId;
        }
        if ((i13 & 16) != 0) {
            chatError = connectionErrorEvent.error;
        }
        ChatError chatError2 = chatError;
        String str4 = str2;
        return connectionErrorEvent.copy(str, date, str4, str3, chatError2);
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
    public final String getConnectionId() {
        return this.connectionId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChatError getError() {
        return this.error;
    }

    public final ConnectionErrorEvent copy(String type, Date createdAt, String rawCreatedAt, String connectionId, ChatError error) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(createdAt, "createdAt");
        AbstractC22676k.m65750j(rawCreatedAt, "rawCreatedAt");
        AbstractC22676k.m65750j(connectionId, "connectionId");
        AbstractC22676k.m65750j(error, "error");
        return new ConnectionErrorEvent(type, createdAt, rawCreatedAt, connectionId, error);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionErrorEvent)) {
            return false;
        }
        ConnectionErrorEvent connectionErrorEvent = (ConnectionErrorEvent) other;
        return AbstractC22676k.m65745e(this.type, connectionErrorEvent.type) && AbstractC22676k.m65745e(this.createdAt, connectionErrorEvent.createdAt) && AbstractC22676k.m65745e(this.rawCreatedAt, connectionErrorEvent.rawCreatedAt) && AbstractC22676k.m65745e(this.connectionId, connectionErrorEvent.connectionId) && AbstractC22676k.m65745e(this.error, connectionErrorEvent.error);
    }

    public final String getConnectionId() {
        return this.connectionId;
    }

    @Override // io.getstream.chat.android.client.events.ChatEvent
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    public final ChatError getError() {
        return this.error;
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
        return this.error.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC38963t7.m124373c(this.createdAt, this.type.hashCode() * 31, 31), 31, this.rawCreatedAt), 31, this.connectionId);
    }

    public final String toString() {
        String str = this.type;
        Date date = this.createdAt;
        String str2 = this.rawCreatedAt;
        String str3 = this.connectionId;
        ChatError chatError = this.error;
        StringBuilder sbM11830n = AbstractC3855a.m11830n("ConnectionErrorEvent(type=", str, ", createdAt=", date, ", rawCreatedAt=");
        AbstractC11266d.m30444B(sbM11830n, str2, ", connectionId=", str3, ", error=");
        sbM11830n.append(chatError);
        sbM11830n.append(")");
        return sbM11830n.toString();
    }
}
