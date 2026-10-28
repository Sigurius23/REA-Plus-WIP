package ob3;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ob3.p[], still in use, count: 1, list:
  (r0v1 ob3.p[]) from 0x002a: INVOKE (r0v1 ob3.p[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: ob3.p */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC27806p {
    IN("in"),
    OUT("out"),
    INV("");


    /* JADX INFO: renamed from: w */
    public final String f112049w;

    static {
        AbstractC15751g.m44468u(enumC27806pArr);
    }

    public EnumC27806p(String str) {
        super(str, i);
        this.f112049w = str;
    }

    public static EnumC27806p valueOf(String str) {
        return (EnumC27806p) Enum.valueOf(EnumC27806p.class, str);
    }

    public static EnumC27806p[] values() {
        return (EnumC27806p[]) f112045E.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f112049w;
    }
}
