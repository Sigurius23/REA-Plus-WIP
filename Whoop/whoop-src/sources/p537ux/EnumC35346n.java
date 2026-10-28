package p537ux;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ux.n[], still in use, count: 1, list:
  (r0v1 ux.n[]) from 0x001e: INVOKE (r0v1 ux.n[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: ux.n */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC35346n {
    Default("DEFAULT"),
    CompleteImmediatePurchase("COMPLETE_IMMEDIATE_PURCHASE");


    /* JADX INFO: renamed from: w */
    public final String f150569w;

    static {
        AbstractC15751g.m44468u(enumC35346nArr);
    }

    public EnumC35346n(String str) {
        super(str, i);
        this.f150569w = str;
    }

    public static EnumC35346n valueOf(String str) {
        return (EnumC35346n) Enum.valueOf(EnumC35346n.class, str);
    }

    public static EnumC35346n[] values() {
        return (EnumC35346n[]) f150568z.clone();
    }
}
