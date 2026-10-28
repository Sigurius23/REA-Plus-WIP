package b30;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 b30.d6[], still in use, count: 1, list:
  (r0v1 b30.d6[]) from 0x0024: INVOKE (r0v1 b30.d6[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: b30.d6 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC2505d6 {
    Idle(false),
    Updating(true),
    Removing(true);


    /* JADX INFO: renamed from: w */
    public final boolean f9760w;

    static {
        AbstractC15751g.m44468u(enumC2505d6Arr);
    }

    public EnumC2505d6(boolean z4) {
        super(str, i);
        this.f9760w = z4;
    }

    public static EnumC2505d6 valueOf(String str) {
        return (EnumC2505d6) Enum.valueOf(EnumC2505d6.class, str);
    }

    public static EnumC2505d6[] values() {
        return (EnumC2505d6[]) f9756E.clone();
    }
}
