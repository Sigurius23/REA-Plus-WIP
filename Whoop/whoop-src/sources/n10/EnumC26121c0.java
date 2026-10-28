package n10;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 n10.c0[], still in use, count: 1, list:
  (r0v1 n10.c0[]) from 0x002a: INVOKE (r0v1 n10.c0[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: n10.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC26121c0 {
    Client("client"),
    Server("server"),
    None("none");


    /* JADX INFO: renamed from: w */
    public final String f103492w;

    static {
        AbstractC15751g.m44468u(enumC26121c0Arr);
    }

    public EnumC26121c0(String str) {
        super(str, i);
        this.f103492w = str;
    }

    public static EnumC26121c0 valueOf(String str) {
        return (EnumC26121c0) Enum.valueOf(EnumC26121c0.class, str);
    }

    public static EnumC26121c0[] values() {
        return (EnumC26121c0[]) f103488E.clone();
    }
}
