package io.getstream.chat.android.models;

import com.whoop.service.network.model.UserState;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/models/ConnectionData;", "", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "connectionId", "", "<init>", "(Lio/getstream/chat/android/models/User;Ljava/lang/String;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getConnectionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ConnectionData {
    private final String connectionId;
    private final User user;

    public ConnectionData(User user, String connectionId) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(connectionId, "connectionId");
        this.user = user;
        this.connectionId = connectionId;
    }

    public static /* synthetic */ ConnectionData copy$default(ConnectionData connectionData, User user, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            user = connectionData.user;
        }
        if ((i13 & 2) != 0) {
            str = connectionData.connectionId;
        }
        return connectionData.copy(user, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConnectionId() {
        return this.connectionId;
    }

    public final ConnectionData copy(User user, String connectionId) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(connectionId, "connectionId");
        return new ConnectionData(user, connectionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectionData)) {
            return false;
        }
        ConnectionData connectionData = (ConnectionData) other;
        return AbstractC22676k.m65745e(this.user, connectionData.user) && AbstractC22676k.m65745e(this.connectionId, connectionData.connectionId);
    }

    public final String getConnectionId() {
        return this.connectionId;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.connectionId.hashCode() + (this.user.hashCode() * 31);
    }

    public String toString() {
        return "ConnectionData(user=" + this.user + ", connectionId=" + this.connectionId + ")";
    }
}
