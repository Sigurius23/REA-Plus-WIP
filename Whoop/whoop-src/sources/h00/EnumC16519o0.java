package h00;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 h00.o0[], still in use, count: 1, list:
  (r0v1 h00.o0[]) from 0x002c: INVOKE (r0v1 h00.o0[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: h00.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC16519o0 {
    Enabled(false),
    Disabled(false),
    Processing(true),
    /* JADX INFO: Fake field, exist only in values array */
    Completed(true);


    /* JADX INFO: renamed from: w */
    public final boolean f63514w;

    static {
        AbstractC15751g.m44468u(enumC16519o0Arr);
    }

    public EnumC16519o0(boolean z4) {
        super(str, i);
        this.f63514w = z4;
    }

    public static EnumC16519o0 valueOf(String str) {
        return (EnumC16519o0) Enum.valueOf(EnumC16519o0.class, str);
    }

    public static EnumC16519o0[] values() {
        return (EnumC16519o0[]) f63510E.clone();
    }
}
