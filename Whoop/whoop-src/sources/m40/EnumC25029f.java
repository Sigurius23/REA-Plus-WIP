package m40;

import ge3.AbstractC15751g;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 m40.f[], still in use, count: 1, list:
  (r0v1 m40.f[]) from 0x002a: INVOKE (r0v1 m40.f[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: m40.f */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC25029f implements InterfaceC25031h {
    Jpeg("image/jpeg"),
    Png("image/png"),
    Webp("image/webp");


    /* JADX INFO: renamed from: F */
    public static final /* synthetic */ C33617b f98046F;

    /* JADX INFO: renamed from: w */
    public final String f98050w;

    static {
        f98046F = AbstractC15751g.m44468u(enumC25029fArr);
    }

    public EnumC25029f(String str) {
        super(str, i);
        this.f98050w = str;
    }

    public static EnumC25029f valueOf(String str) {
        return (EnumC25029f) Enum.valueOf(EnumC25029f.class, str);
    }

    public static EnumC25029f[] values() {
        return (EnumC25029f[]) f98045E.clone();
    }

    @Override // m40.InterfaceC25031h
    public final String getValue() {
        return this.f98050w;
    }
}
