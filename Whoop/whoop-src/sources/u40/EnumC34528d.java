package u40;

import ge3.AbstractC15751g;
import java.io.Serializable;
import p499t9.C33623c0;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 u40.d[], still in use, count: 1, list:
  (r0v1 u40.d[]) from 0x0095: INVOKE (r0v1 u40.d[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: u40.d */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC34528d implements Serializable {
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(7, "No internet connection"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_DATA(8, "Invalid data is not accepted by endpoints"),
    /* JADX INFO: Fake field, exist only in values array */
    CHALLENGE_ERROR(9, "Challenge encountered error on setup"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL_ERROR(10, "hCaptcha client encountered an internal error"),
    SESSION_TIMEOUT(15, "Session Timeout"),
    TOKEN_TIMEOUT(16, "Token Timeout"),
    CHALLENGE_CLOSED(30, "Challenge Closed"),
    /* JADX INFO: Fake field, exist only in values array */
    RATE_LIMITED(31, "Rate Limited"),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_CUSTOM_THEME(32, "Invalid custom theme"),
    INSECURE_HTTP_REQUEST_ERROR(33, "Insecure resource requested"),
    ERROR(29, "Unknown error");


    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ C33617b f145143J;

    /* JADX INFO: renamed from: y */
    public static final C33623c0 f145144y = new C33623c0();

    /* JADX INFO: renamed from: w */
    public final int f145146w;

    /* JADX INFO: renamed from: x */
    public final String f145147x;

    static {
        f145143J = AbstractC15751g.m44468u(new EnumC34528d[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10});
    }

    public EnumC34528d(int i13, String str) {
        super(str, i);
        this.f145146w = i13;
        this.f145147x = str;
    }

    public static EnumC34528d valueOf(String str) {
        return (EnumC34528d) Enum.valueOf(EnumC34528d.class, str);
    }

    public static EnumC34528d[] values() {
        return (EnumC34528d[]) f145142I.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f145147x;
    }
}
