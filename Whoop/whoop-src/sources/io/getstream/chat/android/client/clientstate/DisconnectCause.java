package io.getstream.chat.android.client.clientstate;

import n23.C26200c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/DisconnectCause;", "", "<init>", "()V", "NetworkNotAvailable", "WebSocketNotAvailable", "Error", "UnrecoverableError", "ConnectionReleased", "Lio/getstream/chat/android/client/clientstate/DisconnectCause$ConnectionReleased;", "Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;", "Lio/getstream/chat/android/client/clientstate/DisconnectCause$NetworkNotAvailable;", "Lio/getstream/chat/android/client/clientstate/DisconnectCause$UnrecoverableError;", "Lio/getstream/chat/android/client/clientstate/DisconnectCause$WebSocketNotAvailable;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class DisconnectCause {

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/DisconnectCause$ConnectionReleased;", "Lio/getstream/chat/android/client/clientstate/DisconnectCause;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class ConnectionReleased extends DisconnectCause {
        public static final ConnectionReleased INSTANCE = new ConnectionReleased();

        private ConnectionReleased() {
        }

        public final String toString() {
            return "ConnectionReleased";
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;", "Lio/getstream/chat/android/client/clientstate/DisconnectCause;", "Ln23/c;", "error", "<init>", "(Ln23/c;)V", "component1", "()Ln23/c;", "copy", "(Ln23/c;)Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/c;", "getError", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class Error extends DisconnectCause {
        private final C26200c error;

        public Error(C26200c c26200c) {
            this.error = c26200c;
        }

        public static Error copy$default(Error error, C26200c c26200c, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c26200c = error.error;
            }
            error.getClass();
            return new Error(c26200c);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final C26200c getError() {
            return this.error;
        }

        public final Error copy(C26200c error) {
            return new Error(error);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && AbstractC22676k.m65745e(this.error, ((Error) other).error);
        }

        public final C26200c getError() {
            return this.error;
        }

        public final int hashCode() {
            C26200c c26200c = this.error;
            if (c26200c == null) {
                return 0;
            }
            return c26200c.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.error + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/DisconnectCause$NetworkNotAvailable;", "Lio/getstream/chat/android/client/clientstate/DisconnectCause;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class NetworkNotAvailable extends DisconnectCause {
        public static final NetworkNotAvailable INSTANCE = new NetworkNotAvailable();

        private NetworkNotAvailable() {
        }

        public final String toString() {
            return "NetworkNotAvailable";
        }
    }

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/DisconnectCause$UnrecoverableError;", "Lio/getstream/chat/android/client/clientstate/DisconnectCause;", "Ln23/c;", "error", "<init>", "(Ln23/c;)V", "component1", "()Ln23/c;", "copy", "(Ln23/c;)Lio/getstream/chat/android/client/clientstate/DisconnectCause$UnrecoverableError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/c;", "getError", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class UnrecoverableError extends DisconnectCause {
        private final C26200c error;

        public UnrecoverableError(C26200c c26200c) {
            this.error = c26200c;
        }

        public static UnrecoverableError copy$default(UnrecoverableError unrecoverableError, C26200c c26200c, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                c26200c = unrecoverableError.error;
            }
            unrecoverableError.getClass();
            return new UnrecoverableError(c26200c);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final C26200c getError() {
            return this.error;
        }

        public final UnrecoverableError copy(C26200c error) {
            return new UnrecoverableError(error);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnrecoverableError) && AbstractC22676k.m65745e(this.error, ((UnrecoverableError) other).error);
        }

        public final C26200c getError() {
            return this.error;
        }

        public final int hashCode() {
            C26200c c26200c = this.error;
            if (c26200c == null) {
                return 0;
            }
            return c26200c.hashCode();
        }

        public final String toString() {
            return "UnrecoverableError(error=" + this.error + ")";
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/clientstate/DisconnectCause$WebSocketNotAvailable;", "Lio/getstream/chat/android/client/clientstate/DisconnectCause;", "<init>", "()V", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class WebSocketNotAvailable extends DisconnectCause {
        public static final WebSocketNotAvailable INSTANCE = new WebSocketNotAvailable();

        private WebSocketNotAvailable() {
        }

        public final String toString() {
            return "WebSocketNotAvailable";
        }
    }

    private DisconnectCause() {
    }

    public DisconnectCause(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
