package r30;

import ge3.AbstractC15751g;
import ng3.C26702o;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 r30.j[], still in use, count: 1, list:
  (r0v1 r30.j[]) from 0x0042: INVOKE (r0v1 r30.j[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: r30.j */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC30905j {
    Text("01", true),
    SingleSelect("02", true),
    MultiSelect("03", true),
    OutOfBand("04", false),
    Html("05", false);


    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ C33617b f127460J;

    /* JADX INFO: renamed from: y */
    public static final C26702o f127461y = new C26702o(19, false);

    /* JADX INFO: renamed from: w */
    public final String f127463w;

    /* JADX INFO: renamed from: x */
    public final boolean f127464x;

    static {
        f127460J = AbstractC15751g.m44468u(new EnumC30905j[]{r0, r1, r3, r4, r5});
    }

    public EnumC30905j(String str, boolean z4) {
        super(str, i);
        this.f127463w = str;
        this.f127464x = z4;
    }

    public static EnumC30905j valueOf(String str) {
        return (EnumC30905j) Enum.valueOf(EnumC30905j.class, str);
    }

    public static EnumC30905j[] values() {
        return (EnumC30905j[]) f127459I.clone();
    }
}
