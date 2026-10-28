package o30;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o30.a[], still in use, count: 1, list:
  (r0v1 o30.a[]) from 0x0016: INVOKE (r0v1 o30.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: o30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC27503a {
    /* JADX INFO: Fake field, exist only in values array */
    EC("EC"),
    /* JADX INFO: Fake field, exist only in values array */
    RSA("RSA");


    /* JADX INFO: renamed from: w */
    public final String f110769w;

    static {
        AbstractC15751g.m44468u(enumC27503aArr);
    }

    public EnumC27503a(String str) {
        super(str, i);
        this.f110769w = str;
    }

    public static EnumC27503a valueOf(String str) {
        return (EnumC27503a) Enum.valueOf(EnumC27503a.class, str);
    }

    public static EnumC27503a[] values() {
        return (EnumC27503a[]) f110768x.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f110769w;
    }
}
