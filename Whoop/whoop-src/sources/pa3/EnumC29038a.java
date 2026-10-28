package pa3;

import ge3.AbstractC15751g;
import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import p249jc.C21565a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 pa3.a[], still in use, count: 1, list:
  (r0v1 pa3.a[]) from 0x0042: INVOKE (r0v1 pa3.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: pa3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC29038a {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);


    /* JADX INFO: renamed from: x */
    public static final C21565a f117518x;

    /* JADX INFO: renamed from: y */
    public static final LinkedHashMap f117519y;

    /* JADX INFO: renamed from: w */
    public final int f117521w;

    static {
        AbstractC15751g.m44468u(new EnumC29038a[]{r0, r1, r2, r3, r4, r5});
        f117518x = new C21565a(18);
        EnumC29038a[] enumC29038aArrValues = values();
        int iM73988W = AbstractC25247g0.m73988W(enumC29038aArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W < 16 ? 16 : iM73988W);
        for (EnumC29038a enumC29038a : enumC29038aArrValues) {
            linkedHashMap.put(Integer.valueOf(enumC29038a.f117521w), enumC29038a);
        }
        f117519y = linkedHashMap;
    }

    public EnumC29038a(int i13) {
        super(str, i);
        this.f117521w = i13;
    }

    public static EnumC29038a valueOf(String str) {
        return (EnumC29038a) Enum.valueOf(EnumC29038a.class, str);
    }

    public static EnumC29038a[] values() {
        return (EnumC29038a[]) f117517J.clone();
    }
}
