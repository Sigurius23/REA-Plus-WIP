package r53;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 r53.g[], still in use, count: 1, list:
  (r0v1 r53.g[]) from 0x0034: INVOKE (r0v1 r53.g[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: r53.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC30946g {
    ROTATE_0(0),
    ROTATE_90(90),
    ROTATE_180(180),
    ROTATE_270(270);


    /* JADX INFO: renamed from: w */
    public final int f127685w;

    static {
        AbstractC15751g.m44468u(enumC30946gArr);
    }

    public EnumC30946g(int i13) {
        super(str, i);
        this.f127685w = i13;
    }

    public static EnumC30946g valueOf(String str) {
        return (EnumC30946g) Enum.valueOf(EnumC30946g.class, str);
    }

    public static EnumC30946g[] values() {
        return (EnumC30946g[]) f127681F.clone();
    }
}
