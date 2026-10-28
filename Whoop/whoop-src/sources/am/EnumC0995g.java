package am;

import ge3.AbstractC15751g;
import p291l0.AbstractC22977m;
import p291l0.InterfaceC22974l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 am.g[], still in use, count: 1, list:
  (r0v1 am.g[]) from 0x0044: INVOKE (r0v1 am.g[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: am.g */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC0995g {
    /* JADX INFO: Fake field, exist only in values array */
    Center(AbstractC22977m.f90654e),
    Start(AbstractC22977m.f90652c),
    /* JADX INFO: Fake field, exist only in values array */
    End(AbstractC22977m.f90653d),
    /* JADX INFO: Fake field, exist only in values array */
    SpaceEvenly(AbstractC22977m.f90655f),
    /* JADX INFO: Fake field, exist only in values array */
    SpaceBetween(AbstractC22977m.f90656g),
    /* JADX INFO: Fake field, exist only in values array */
    SpaceAround(AbstractC22977m.f90657h);


    /* JADX INFO: renamed from: w */
    public final InterfaceC22974l f3747w;

    static {
        AbstractC15751g.m44468u(enumC0995gArr);
    }

    public EnumC0995g(InterfaceC22974l interfaceC22974l) {
        super(str, i);
        this.f3747w = interfaceC22974l;
    }

    public static EnumC0995g valueOf(String str) {
        return (EnumC0995g) Enum.valueOf(EnumC0995g.class, str);
    }

    public static EnumC0995g[] values() {
        return (EnumC0995g[]) f3746y.clone();
    }
}
