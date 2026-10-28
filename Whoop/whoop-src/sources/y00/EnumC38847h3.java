package y00;

import ge3.AbstractC15751g;
import p499t9.C33647p;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.h3[], still in use, count: 1, list:
  (r0v1 y00.h3[]) from 0x004c: INVOKE (r0v1 y00.h3[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.h3 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38847h3 {
    /* JADX INFO: Fake field, exist only in values array */
    ApiConnectionError("api_connection_error"),
    /* JADX INFO: Fake field, exist only in values array */
    ApiError("api_error"),
    /* JADX INFO: Fake field, exist only in values array */
    AuthenticationError("authentication_error"),
    /* JADX INFO: Fake field, exist only in values array */
    CardError("card_error"),
    /* JADX INFO: Fake field, exist only in values array */
    IdempotencyError("idempotency_error"),
    /* JADX INFO: Fake field, exist only in values array */
    InvalidRequestError("invalid_request_error"),
    /* JADX INFO: Fake field, exist only in values array */
    RateLimitError("rate_limit_error");


    /* JADX INFO: renamed from: x */
    public static final C33647p f167218x = new C33647p(21);

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ C33617b f167220z = AbstractC15751g.m44468u(new EnumC38847h3[]{new EnumC38847h3("api_connection_error"), new EnumC38847h3("api_error"), new EnumC38847h3("authentication_error"), new EnumC38847h3("card_error"), new EnumC38847h3("idempotency_error"), new EnumC38847h3("invalid_request_error"), new EnumC38847h3("rate_limit_error")});

    /* JADX INFO: renamed from: w */
    public final String f167221w;

    static {
    }

    public EnumC38847h3(String str) {
        super(str, i);
        this.f167221w = str;
    }

    public static EnumC38847h3 valueOf(String str) {
        return (EnumC38847h3) Enum.valueOf(EnumC38847h3.class, str);
    }

    public static EnumC38847h3[] values() {
        return (EnumC38847h3[]) f167219y.clone();
    }
}
