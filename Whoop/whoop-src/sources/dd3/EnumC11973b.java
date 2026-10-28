package dd3;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 dd3.b[], still in use, count: 1, list:
  (r0v1 dd3.b[]) from 0x0030: INVOKE (r0v1 dd3.b[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: dd3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC11973b {
    DEFAULT(0L),
    SIGNED(8589934592L),
    FIXED(17179869184L);


    /* JADX INFO: renamed from: w */
    public final long f39321w;

    static {
        AbstractC15751g.m44468u(enumC11973bArr);
    }

    public EnumC11973b(long j7) {
        super(str, i);
        this.f39321w = j7;
    }

    public static EnumC11973b valueOf(String str) {
        return (EnumC11973b) Enum.valueOf(EnumC11973b.class, str);
    }

    public static EnumC11973b[] values() {
        return (EnumC11973b[]) f39317E.clone();
    }
}
