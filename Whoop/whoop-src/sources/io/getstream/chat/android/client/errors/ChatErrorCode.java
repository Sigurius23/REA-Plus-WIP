package io.getstream.chat.android.client.errors;

import ge3.AbstractC15751g;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.Set;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001f"}, m65681d2 = {"Lio/getstream/chat/android/client/errors/ChatErrorCode;", "", "code", "", "description", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getDescription", "()Ljava/lang/String;", "NETWORK_FAILED", "PARSER_ERROR", "SOCKET_CLOSED", "SOCKET_FAILURE", "CANT_PARSE_CONNECTION_EVENT", "CANT_PARSE_EVENT", "INVALID_TOKEN", "UNDEFINED_TOKEN", "UNABLE_TO_PARSE_SOCKET_EVENT", "NO_ERROR_BODY", "VALIDATION_ERROR", "AUTHENTICATION_ERROR", "DUPLICATE_USERNAME_ERROR", "TOKEN_EXPIRED", "TOKEN_NOT_VALID", "TOKEN_DATE_INCORRECT", "TOKEN_SIGNATURE_INCORRECT", "API_KEY_NOT_FOUND", "Companion", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public enum ChatErrorCode {
    NETWORK_FAILED(1000, "Response is failed. See cause"),
    PARSER_ERROR(1001, "Unable to parse error"),
    SOCKET_CLOSED(1002, "Server closed connection"),
    SOCKET_FAILURE(1003, "See stack trace in logs. Intercept error in error handler of setUser"),
    CANT_PARSE_CONNECTION_EVENT(MessageListItemViewType.CUSTOM_ATTACHMENTS, "Unable to parse connection event"),
    CANT_PARSE_EVENT(MessageListItemViewType.LOADING_INDICATOR, "Unable to parse event"),
    INVALID_TOKEN(MessageListItemViewType.THREAD_SEPARATOR, "Invalid token"),
    UNDEFINED_TOKEN(MessageListItemViewType.TYPING_INDICATOR, "No defined token. Check if client.setUser was called and finished"),
    UNABLE_TO_PARSE_SOCKET_EVENT(MessageListItemViewType.GIPHY, "Socket event payload either invalid or null"),
    NO_ERROR_BODY(MessageListItemViewType.SYSTEM_MESSAGE, "No error body. See http status code"),
    VALIDATION_ERROR(4, "Validation error, check your credentials"),
    AUTHENTICATION_ERROR(5, "Unauthenticated, problem with authentication"),
    DUPLICATE_USERNAME_ERROR(6, "Username(s) already exists."),
    TOKEN_EXPIRED(40, "Token expired, new one must be requested."),
    TOKEN_NOT_VALID(41, "Unauthenticated, token not valid yet"),
    TOKEN_DATE_INCORRECT(42, "Unauthenticated, token date incorrect"),
    TOKEN_SIGNATURE_INCORRECT(43, "Unauthenticated, token signature invalid"),
    API_KEY_NOT_FOUND(2, "Api key is not found, verify it if it's correct or was created.");

    private final int code;
    private final String description;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final Set<Integer> authenticationErrors = AbstractC25260n.m74059b1(new Integer[]{5, 40, 41, 42, 43});

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/errors/ChatErrorCode$Companion;", "", "<init>", "()V", "authenticationErrors", "", "", "isAuthenticationError", "", "code", "stream-chat-android-core"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isAuthenticationError(int code) {
            return ChatErrorCode.authenticationErrors.contains(Integer.valueOf(code));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    ChatErrorCode(int i13, String str) {
        this.code = i13;
        this.description = str;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }
}
