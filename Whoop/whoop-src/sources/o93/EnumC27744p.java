package o93;

import ge3.AbstractC15751g;
import va3.AbstractC35844b;
import va3.C35845c;
import va3.C35850h;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o93.p[], still in use, count: 1, list:
  (r0v1 o93.p[]) from 0x0046: INVOKE (r0v1 o93.p[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: o93.p */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC27744p {
    UBYTEARRAY(AbstractC35844b.m113763d("kotlin/UByteArray", false)),
    USHORTARRAY(AbstractC35844b.m113763d("kotlin/UShortArray", false)),
    UINTARRAY(AbstractC35844b.m113763d("kotlin/UIntArray", false)),
    ULONGARRAY(AbstractC35844b.m113763d("kotlin/ULongArray", false));


    /* JADX INFO: renamed from: w */
    public final C35850h f111899w;

    static {
        AbstractC15751g.m44468u(enumC27744pArr);
    }

    public EnumC27744p(C35845c c35845c) {
        super(str, i);
        this.f111899w = c35845c.m113777f();
    }

    public static EnumC27744p valueOf(String str) {
        return (EnumC27744p) Enum.valueOf(EnumC27744p.class, str);
    }

    public static EnumC27744p[] values() {
        return (EnumC27744p[]) f111895F.clone();
    }
}
