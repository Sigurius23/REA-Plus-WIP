package sz;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 sz.g[], still in use, count: 1, list:
  (r0v1 sz.g[]) from 0x001b: INVOKE (r0v1 sz.g[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: sz.g */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC33131g {
    Production(1),
    Test(3);


    /* JADX INFO: renamed from: w */
    public final int f138197w;

    static {
        AbstractC15751g.m44468u(enumC33131gArr);
    }

    public EnumC33131g(int i13) {
        super(str, i);
        this.f138197w = i13;
    }

    public static EnumC33131g valueOf(String str) {
        return (EnumC33131g) Enum.valueOf(EnumC33131g.class, str);
    }

    public static EnumC33131g[] values() {
        return (EnumC33131g[]) f138196z.clone();
    }
}
