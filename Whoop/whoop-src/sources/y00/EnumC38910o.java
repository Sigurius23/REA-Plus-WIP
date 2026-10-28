package y00;

import ge3.AbstractC15751g;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.o[], still in use, count: 1, list:
  (r0v1 y00.o[]) from 0x0036: INVOKE (r0v1 y00.o[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.o */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38910o {
    OnSession("on_session"),
    OffSession("off_session"),
    Blank(""),
    None("none");


    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ C33617b f167488G;

    /* JADX INFO: renamed from: w */
    public final String f167492w;

    static {
        f167488G = AbstractC15751g.m44468u(enumC38910oArr);
    }

    public EnumC38910o(String str) {
        super(str, i);
        this.f167492w = str;
    }

    public static EnumC38910o valueOf(String str) {
        return (EnumC38910o) Enum.valueOf(EnumC38910o.class, str);
    }

    public static EnumC38910o[] values() {
        return (EnumC38910o[]) f167487F.clone();
    }
}
