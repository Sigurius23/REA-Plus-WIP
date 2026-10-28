package b33;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 b33.g[], still in use, count: 1, list:
  (r0v1 b33.g[]) from 0x001e: INVOKE (r0v1 b33.g[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: b33.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2686g {
    INITIATED("initiated"),
    COMPLETED("completed");


    /* JADX INFO: renamed from: w */
    public final String f10571w;

    static {
        AbstractC15751g.m44468u(enumC2686gArr);
    }

    public EnumC2686g(String str) {
        super(str, i);
        this.f10571w = str;
    }

    public static EnumC2686g valueOf(String str) {
        return (EnumC2686g) Enum.valueOf(EnumC2686g.class, str);
    }

    public static EnumC2686g[] values() {
        return (EnumC2686g[]) f10570z.clone();
    }
}
