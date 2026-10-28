package o33;

import ge3.AbstractC15751g;
import ng3.C26702o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o33.b[], still in use, count: 1, list:
  (r0v1 o33.b[]) from 0x003a: INVOKE (r0v1 o33.b[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: o33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC27517b {
    /* JADX INFO: Fake field, exist only in values array */
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    CPU("cpu"),
    /* JADX INFO: Fake field, exist only in values array */
    BANDWIDTH("bandwidth"),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER("other"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: x */
    public static final C26702o f110802x;

    /* JADX INFO: renamed from: w */
    public final String f110805w;

    static {
        AbstractC15751g.m44468u(enumC27517bArr);
        f110802x = new C26702o(7, false);
    }

    public EnumC27517b(String str) {
        super(str, i);
        this.f110805w = str;
    }

    public static EnumC27517b valueOf(String str) {
        return (EnumC27517b) Enum.valueOf(EnumC27517b.class, str);
    }

    public static EnumC27517b[] values() {
        return (EnumC27517b[]) f110804z.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f110805w;
    }
}
