package io.getstream.chat.android.client.clientstate;

import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/SocketState;", "", "<init>", "()V", "connectionIdOrError", "", "connectionIdOrError$stream_chat_android_client_release", "Idle", "Pending", "Connected", "Disconnected", "Lio/getstream/chat/android/client/clientstate/SocketState$Connected;", "Lio/getstream/chat/android/client/clientstate/SocketState$Disconnected;", "Lio/getstream/chat/android/client/clientstate/SocketState$Idle;", "Lio/getstream/chat/android/client/clientstate/SocketState$Pending;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class SocketState {

    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/SocketState$Connected;", "Lio/getstream/chat/android/client/clientstate/SocketState;", "connectionId", "", "<init>", "(Ljava/lang/String;)V", "getConnectionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Connected extends SocketState {
        private final String connectionId;

        public Connected(String connectionId) {
            AbstractC22676k.m65750j(connectionId, "connectionId");
            this.connectionId = connectionId;
        }

        public static /* synthetic */ Connected copy$default(Connected connected, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = connected.connectionId;
            }
            return connected.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConnectionId() {
            return this.connectionId;
        }

        public final Connected copy(String connectionId) {
            AbstractC22676k.m65750j(connectionId, "connectionId");
            return new Connected(connectionId);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Connected) && AbstractC22676k.m65745e(this.connectionId, ((Connected) other).connectionId);
        }

        public final String getConnectionId() {
            return this.connectionId;
        }

        public final int hashCode() {
            return this.connectionId.hashCode();
        }

        public final String toString() {
            return AbstractC11895b.m31996o("Connected(connectionId=", this.connectionId, ")");
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/SocketState$Disconnected;", "Lio/getstream/chat/android/client/clientstate/SocketState;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Disconnected extends SocketState {
        public static final Disconnected INSTANCE = new Disconnected();

        private Disconnected() {
        }

        public final String toString() {
            return "Disconnected";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/SocketState$Idle;", "Lio/getstream/chat/android/client/clientstate/SocketState;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Idle extends SocketState {
        public static final Idle INSTANCE = new Idle();

        private Idle() {
        }

        public final String toString() {
            return "Idle";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/SocketState$Pending;", "Lio/getstream/chat/android/client/clientstate/SocketState;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Pending extends SocketState {
        public static final Pending INSTANCE = new Pending();

        private Pending() {
        }

        public final String toString() {
            return "Pending";
        }
    }

    private SocketState() {
    }

    public final String connectionIdOrError$stream_chat_android_client_release() {
        if (this instanceof Connected) {
            return ((Connected) this).getConnectionId();
        }
        throw new IllegalStateException("This state doesn't contain connectionId");
    }

    public SocketState(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
