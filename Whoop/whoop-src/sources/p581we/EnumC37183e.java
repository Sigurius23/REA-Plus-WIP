package p581we;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 we.e[], still in use, count: 1, list:
  (r0v1 we.e[]) from 0x001e: INVOKE (r0v1 we.e[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: we.e */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC37183e {
    SIGV4("AWS4-HMAC-SHA256"),
    SIGV4_ASYMMETRIC("AWS4-ECDSA-P256-SHA256");


    /* JADX INFO: renamed from: w */
    public final String f158986w;

    static {
        AbstractC15751g.m44468u(enumC37183eArr);
    }

    public EnumC37183e(String str) {
        super(str, i);
        this.f158986w = str;
    }

    public static EnumC37183e valueOf(String str) {
        return (EnumC37183e) Enum.valueOf(EnumC37183e.class, str);
    }

    public static EnumC37183e[] values() {
        return (EnumC37183e[]) f158985z.clone();
    }
}
