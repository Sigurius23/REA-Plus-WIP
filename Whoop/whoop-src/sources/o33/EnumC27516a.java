package o33;

import ge3.AbstractC15751g;
import ng3.C26701n;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o33.a[], still in use, count: 1, list:
  (r0v1 o33.a[]) from 0x0026: INVOKE (r0v1 o33.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: o33.a */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC27516a {
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO("audio"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEO("video"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: x */
    public static final C26701n f110798x;

    /* JADX INFO: renamed from: w */
    public final String f110801w;

    static {
        AbstractC15751g.m44468u(enumC27516aArr);
        f110798x = new C26701n(7);
    }

    public EnumC27516a(String str) {
        super(str, i);
        this.f110801w = str;
    }

    public static EnumC27516a valueOf(String str) {
        return (EnumC27516a) Enum.valueOf(EnumC27516a.class, str);
    }

    public static EnumC27516a[] values() {
        return (EnumC27516a[]) f110800z.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f110801w;
    }
}
