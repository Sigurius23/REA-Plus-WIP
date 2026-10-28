package o93;

import ge3.AbstractC15751g;
import va3.AbstractC35844b;
import va3.C35845c;
import va3.C35850h;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o93.q[], still in use, count: 1, list:
  (r0v1 o93.q[]) from 0x003e: INVOKE (r0v1 o93.q[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: o93.q */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC27745q {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(AbstractC35844b.m113763d("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(AbstractC35844b.m113763d("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(AbstractC35844b.m113763d("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(AbstractC35844b.m113763d("kotlin/ULong", false));


    /* JADX INFO: renamed from: w */
    public final C35845c f111901w;

    /* JADX INFO: renamed from: x */
    public final C35850h f111902x;

    /* JADX INFO: renamed from: y */
    public final C35845c f111903y;

    static {
        AbstractC15751g.m44468u(enumC27745qArr);
    }

    public EnumC27745q(C35845c c35845c) {
        super(str, i);
        this.f111901w = c35845c;
        C35850h c35850hM113777f = c35845c.m113777f();
        this.f111902x = c35850hM113777f;
        this.f111903y = new C35845c(c35845c.f152609a, C35850h.m113814e(c35850hM113777f.m113817b() + "Array"));
    }

    public static EnumC27745q valueOf(String str) {
        return (EnumC27745q) Enum.valueOf(EnumC27745q.class, str);
    }

    public static EnumC27745q[] values() {
        return (EnumC27745q[]) f111900z.clone();
    }
}
