package r30;

import ge3.AbstractC15751g;
import ng3.C26701n;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 r30.f[], still in use, count: 1, list:
  (r0v1 r30.f[]) from 0x0030: INVOKE (r0v1 r30.f[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: r30.f */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC30901f {
    ThreeDsSdk("C"),
    /* JADX INFO: Fake field, exist only in values array */
    ThreeDsServer("S"),
    /* JADX INFO: Fake field, exist only in values array */
    DirectoryServer("D"),
    /* JADX INFO: Fake field, exist only in values array */
    Acs("A");


    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ C33617b f127431E;

    /* JADX INFO: renamed from: x */
    public static final C26701n f127432x = new C26701n(19);

    /* JADX INFO: renamed from: w */
    public final String f127435w;

    static {
        f127431E = AbstractC15751g.m44468u(new EnumC30901f[]{r0, new EnumC30901f("S"), new EnumC30901f("D"), new EnumC30901f("A")});
    }

    public EnumC30901f(String str) {
        super(str, i);
        this.f127435w = str;
    }

    public static EnumC30901f valueOf(String str) {
        return (EnumC30901f) Enum.valueOf(EnumC30901f.class, str);
    }

    public static EnumC30901f[] values() {
        return (EnumC30901f[]) f127434z.clone();
    }
}
