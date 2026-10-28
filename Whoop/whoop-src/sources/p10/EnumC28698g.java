package p10;

import ge3.AbstractC15751g;
import y00.EnumC38910o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 p10.g[], still in use, count: 1, list:
  (r0v1 p10.g[]) from 0x0029: INVOKE (r0v1 p10.g[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: p10.g */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC28698g {
    f116083x(EnumC38910o.OffSession),
    f116084y(EnumC38910o.Blank),
    f116085z(null);


    /* JADX INFO: renamed from: w */
    public final EnumC38910o f116086w;

    static {
        AbstractC15751g.m44468u(enumC28698gArr);
    }

    public EnumC28698g(EnumC38910o enumC38910o) {
        super(str, i);
        this.f116086w = enumC38910o;
    }

    public static EnumC28698g valueOf(String str) {
        return (EnumC28698g) Enum.valueOf(EnumC28698g.class, str);
    }

    public static EnumC28698g[] values() {
        return (EnumC28698g[]) f116082E.clone();
    }
}
