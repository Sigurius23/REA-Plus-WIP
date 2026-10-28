package o93;

import ge3.AbstractC15751g;
import java.util.Set;
import l83.EnumC23463i;
import m83.AbstractC25260n;
import q83.AbstractC30060g;
import va3.C35850h;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 o93.j[], still in use, count: 1, list:
  (r0v1 o93.j[]) from 0x0066: INVOKE (r0v1 o93.j[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: o93.j */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC27738j {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: E */
    public static final Set f111796E;

    /* JADX INFO: renamed from: w */
    public final C35850h f111806w;

    /* JADX INFO: renamed from: x */
    public final C35850h f111807x;

    /* JADX INFO: renamed from: y */
    public final Object f111808y;

    /* JADX INFO: renamed from: z */
    public final Object f111809z;

    static {
        EnumC27738j enumC27738j = CHAR;
        EnumC27738j enumC27738j2 = BYTE;
        EnumC27738j enumC27738j3 = SHORT;
        EnumC27738j enumC27738j4 = INT;
        EnumC27738j enumC27738j5 = FLOAT;
        EnumC27738j enumC27738j6 = LONG;
        EnumC27738j enumC27738j7 = DOUBLE;
        AbstractC15751g.m44468u(enumC27738jArr);
        f111796E = AbstractC25260n.m74059b1(new EnumC27738j[]{enumC27738j, enumC27738j2, enumC27738j3, enumC27738j4, enumC27738j5, enumC27738j6, enumC27738j7});
    }

    public EnumC27738j(String str) {
        super(str, i);
        this.f111806w = C35850h.m113814e(str);
        this.f111807x = C35850h.m113814e(str.concat("Array"));
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        this.f111808y = AbstractC30060g.m92087G(enumC23463i, new C27737i(this, 0));
        this.f111809z = AbstractC30060g.m92087G(enumC23463i, new C27737i(this, 1));
    }

    public static EnumC27738j valueOf(String str) {
        return (EnumC27738j) Enum.valueOf(EnumC27738j.class, str);
    }

    public static EnumC27738j[] values() {
        return (EnumC27738j[]) f111805N.clone();
    }
}
