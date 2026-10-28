package b30;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 b30.p[], still in use, count: 1, list:
  (r0v1 b30.p[]) from 0x0058: INVOKE (r0v1 b30.p[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: b30.p */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2594p {
    Book(2),
    Buy(1),
    Checkout(3),
    Donate(4),
    Order(5),
    Pay(6),
    Plain(8),
    Subscribe(7);


    /* JADX INFO: renamed from: w */
    public final int f10089w;

    static {
        AbstractC15751g.m44468u(enumC2594pArr);
    }

    public EnumC2594p(int i13) {
        super(str, i);
        this.f10089w = i13;
    }

    public static EnumC2594p valueOf(String str) {
        return (EnumC2594p) Enum.valueOf(EnumC2594p.class, str);
    }

    public static EnumC2594p[] values() {
        return (EnumC2594p[]) f10085J.clone();
    }
}
