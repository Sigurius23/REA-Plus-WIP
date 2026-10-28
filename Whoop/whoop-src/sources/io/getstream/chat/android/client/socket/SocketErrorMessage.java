package io.getstream.chat.android.client.socket;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m65681d2 = {"Lio/getstream/chat/android/client/socket/SocketErrorMessage;", "", "error", "Lio/getstream/chat/android/client/socket/ErrorResponse;", "<init>", "(Lio/getstream/chat/android/client/socket/ErrorResponse;)V", "getError", "()Lio/getstream/chat/android/client/socket/ErrorResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class SocketErrorMessage {
    private final ErrorResponse error;

    /* JADX WARN: Multi-variable type inference failed */
    public SocketErrorMessage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static SocketErrorMessage copy$default(SocketErrorMessage socketErrorMessage, ErrorResponse errorResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            errorResponse = socketErrorMessage.error;
        }
        socketErrorMessage.getClass();
        return new SocketErrorMessage(errorResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ErrorResponse getError() {
        return this.error;
    }

    public final SocketErrorMessage copy(ErrorResponse error) {
        return new SocketErrorMessage(error);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SocketErrorMessage) && AbstractC22676k.m65745e(this.error, ((SocketErrorMessage) other).error);
    }

    public final ErrorResponse getError() {
        return this.error;
    }

    public final int hashCode() {
        ErrorResponse errorResponse = this.error;
        if (errorResponse == null) {
            return 0;
        }
        return errorResponse.hashCode();
    }

    public final String toString() {
        return "SocketErrorMessage(error=" + this.error + ")";
    }

    public SocketErrorMessage(ErrorResponse errorResponse) {
        this.error = errorResponse;
    }

    public /* synthetic */ SocketErrorMessage(ErrorResponse errorResponse, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : errorResponse);
    }
}
