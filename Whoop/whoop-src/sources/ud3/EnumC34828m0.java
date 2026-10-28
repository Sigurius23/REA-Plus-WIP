package ud3;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ud3.m0[], still in use, count: 1, list:
  (r0v1 ud3.m0[]) from 0x005a: INVOKE (r0v1 ud3.m0[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: ud3.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC34828m0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");


    /* JADX INFO: renamed from: x */
    public static final C34841t f146683x;

    /* JADX INFO: renamed from: w */
    public final String f146686w;

    static {
        AbstractC15751g.m44468u(enumC34828m0Arr);
        f146683x = new C34841t();
    }

    public EnumC34828m0(String str) {
        super(str, i);
        this.f146686w = str;
    }

    public static EnumC34828m0 valueOf(String str) {
        return (EnumC34828m0) Enum.valueOf(EnumC34828m0.class, str);
    }

    public static EnumC34828m0[] values() {
        return (EnumC34828m0[]) f146682J.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f146686w;
    }
}
