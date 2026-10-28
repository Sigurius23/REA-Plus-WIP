package q20;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 q20.u[], still in use, count: 1, list:
  (r0v1 q20.u[]) from 0x0021: INVOKE (r0v1 q20.u[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: q20.u */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC29836u {
    /* JADX INFO: Fake field, exist only in values array */
    GooglePay(C29824j.f121906x),
    Link(new C29828m(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));


    /* JADX INFO: renamed from: w */
    public final AbstractC29840y f121953w;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        AbstractC15751g.m44468u(enumC29836uArr);
    }

    public EnumC29836u(AbstractC29840y abstractC29840y) {
        super(str, i);
        this.f121953w = abstractC29840y;
    }

    public static EnumC29836u valueOf(String str) {
        return (EnumC29836u) Enum.valueOf(EnumC29836u.class, str);
    }

    public static EnumC29836u[] values() {
        return (EnumC29836u[]) f121952y.clone();
    }
}
