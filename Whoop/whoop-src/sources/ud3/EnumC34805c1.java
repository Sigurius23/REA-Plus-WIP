package ud3;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ud3.c1[], still in use, count: 1, list:
  (r0v1 ud3.c1[]) from 0x0042: INVOKE (r0v1 ud3.c1[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: ud3.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC34805c1 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: x */
    public static final C34841t f146539x;

    /* JADX INFO: renamed from: w */
    public final String f146542w;

    static {
        AbstractC15751g.m44468u(enumC34805c1Arr);
        f146539x = new C34841t();
    }

    public EnumC34805c1(String str) {
        super(str, i);
        this.f146542w = str;
    }

    public static EnumC34805c1 valueOf(String str) {
        return (EnumC34805c1) Enum.valueOf(EnumC34805c1.class, str);
    }

    public static EnumC34805c1[] values() {
        return (EnumC34805c1[]) f146538H.clone();
    }
}
