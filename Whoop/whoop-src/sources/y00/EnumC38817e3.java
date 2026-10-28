package y00;

import ge3.AbstractC15751g;
import p499t9.C33647p;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.e3[], still in use, count: 1, list:
  (r0v1 y00.e3[]) from 0x002a: INVOKE (r0v1 y00.e3[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.e3 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38817e3 {
    Automatic("automatic"),
    AutomaticAsync("automatic_async"),
    Manual("manual");


    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ C33617b f167061G;

    /* JADX INFO: renamed from: x */
    public static final C33647p f167062x = new C33647p(20);

    /* JADX INFO: renamed from: w */
    public final String f167065w;

    static {
        f167061G = AbstractC15751g.m44468u(new EnumC38817e3[]{r0, r1, r2});
    }

    public EnumC38817e3(String str) {
        super(str, i);
        this.f167065w = str;
    }

    public static EnumC38817e3 valueOf(String str) {
        return (EnumC38817e3) Enum.valueOf(EnumC38817e3.class, str);
    }

    public static EnumC38817e3[] values() {
        return (EnumC38817e3[]) f167060F.clone();
    }
}
