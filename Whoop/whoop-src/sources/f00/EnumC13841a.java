package f00;

import ge3.AbstractC15751g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 f00.a[], still in use, count: 1, list:
  (r0v1 f00.a[]) from 0x001e: INVOKE (r0v1 f00.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: f00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC13841a {
    Payment("payment"),
    Setup("setup");


    /* JADX INFO: renamed from: w */
    public final String f49381w;

    static {
        AbstractC15751g.m44468u(enumC13841aArr);
    }

    public EnumC13841a(String str) {
        super(str, i);
        this.f49381w = str;
    }

    public static EnumC13841a valueOf(String str) {
        return (EnumC13841a) Enum.valueOf(EnumC13841a.class, str);
    }

    public static EnumC13841a[] values() {
        return (EnumC13841a[]) f49380z.clone();
    }
}
