package bd3;

import ge3.AbstractC15751g;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 bd3.l0[], still in use, count: 1, list:
  (r0v1 bd3.l0[]) from 0x0036: INVOKE (r0v1 bd3.l0[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: bd3.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3133l0 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ C33617b f12284H;

    /* JADX INFO: renamed from: w */
    public final char f12287w;

    /* JADX INFO: renamed from: x */
    public final char f12288x;

    static {
        f12284H = AbstractC15751g.m44468u(enumC3133l0Arr);
    }

    public EnumC3133l0(char c3, char c7) {
        super(str, i);
        this.f12287w = c3;
        this.f12288x = c7;
    }

    public static EnumC3133l0 valueOf(String str) {
        return (EnumC3133l0) Enum.valueOf(EnumC3133l0.class, str);
    }

    public static EnumC3133l0[] values() {
        return (EnumC3133l0[]) f12283G.clone();
    }
}
