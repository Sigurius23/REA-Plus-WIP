package dz;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 dz.a[], still in use, count: 1, list:
  (r0v1 dz.a[]) from 0x001c: INVOKE (r0v1 dz.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: dz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC12454a {
    Edit("edit"),
    /* JADX INFO: Fake field, exist only in values array */
    Add("add");


    /* JADX INFO: renamed from: w */
    public final String f42523w;

    static {
        AbstractC15751g.m44468u(enumC12454aArr);
    }

    public EnumC12454a(String str) {
        super(str, i);
        this.f42523w = str;
    }

    public static EnumC12454a valueOf(String str) {
        return (EnumC12454a) Enum.valueOf(EnumC12454a.class, str);
    }

    public static EnumC12454a[] values() {
        return (EnumC12454a[]) f42522y.clone();
    }
}
