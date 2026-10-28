package u33;

import ge3.AbstractC15751g;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.util.Set;
import m83.AbstractC25260n;
import p499t9.C33647p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v6 u33.e[], still in use, count: 1, list:
  (r1v6 u33.e[]) from 0x0102: INVOKE (r1v6 u33.e[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: u33.e */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC34512e {
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_FAILED(1000, "Response is failed. See cause"),
    /* JADX INFO: Fake field, exist only in values array */
    PARSER_ERROR(1001, "Unable to parse error"),
    SOCKET_CLOSED(1002, "Server closed connection"),
    SOCKET_FAILURE(1003, "See stack trace in logs. Intercept error in error handler of setUser"),
    /* JADX INFO: Fake field, exist only in values array */
    CANT_PARSE_CONNECTION_EVENT(MessageListItemViewType.CUSTOM_ATTACHMENTS, "Unable to parse connection event"),
    CANT_PARSE_EVENT(MessageListItemViewType.LOADING_INDICATOR, "Unable to parse event"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_TOKEN(MessageListItemViewType.THREAD_SEPARATOR, "Invalid token"),
    /* JADX INFO: Fake field, exist only in values array */
    UNDEFINED_TOKEN(MessageListItemViewType.TYPING_INDICATOR, "No defined token. Check if client.setUser was called and finished"),
    UNABLE_TO_PARSE_SOCKET_EVENT(MessageListItemViewType.GIPHY, "Socket event payload either invalid or null"),
    NO_ERROR_BODY(MessageListItemViewType.SYSTEM_MESSAGE, "No error body. See http status code"),
    /* JADX INFO: Fake field, exist only in values array */
    VALIDATION_ERROR(4, "Validation error, check your credentials"),
    /* JADX INFO: Fake field, exist only in values array */
    AUTHENTICATION_ERROR(5, "Unauthenticated, problem with authentication"),
    /* JADX INFO: Fake field, exist only in values array */
    TOKEN_EXPIRED(40, "Token expired, new one must be requested."),
    /* JADX INFO: Fake field, exist only in values array */
    TOKEN_NOT_VALID(41, "Unauthenticated, token not valid yet"),
    /* JADX INFO: Fake field, exist only in values array */
    TOKEN_DATE_INCORRECT(42, "Unauthenticated, token date incorrect"),
    /* JADX INFO: Fake field, exist only in values array */
    TOKEN_SIGNATURE_INCORRECT(43, "Unauthenticated, token signature invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    API_KEY_NOT_FOUND(2, "Api key is not found, verify it if it's correct or was created.");


    /* JADX INFO: renamed from: y */
    public static final C33647p f145082y;

    /* JADX INFO: renamed from: z */
    public static final Set f145083z;

    /* JADX INFO: renamed from: w */
    public final int f145084w;

    /* JADX INFO: renamed from: x */
    public final String f145085x;

    static {
        AbstractC15751g.m44468u(enumC34512eArr);
        f145082y = new C33647p(3);
        f145083z = AbstractC25260n.m74059b1(new Integer[]{5, 40, 41, 42, 43});
    }

    public EnumC34512e(int i13, String str) {
        super(str, i);
        this.f145084w = i13;
        this.f145085x = str;
    }

    public static EnumC34512e valueOf(String str) {
        return (EnumC34512e) Enum.valueOf(EnumC34512e.class, str);
    }

    public static EnumC34512e[] values() {
        return (EnumC34512e[]) f145081J.clone();
    }
}
