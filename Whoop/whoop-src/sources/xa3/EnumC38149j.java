package xa3;

import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 xa3.j[], still in use, count: 1, list:
  (r0v3 xa3.j[]) from 0x00a8: INVOKE (r0v3 xa3.j[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m)]
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
/* JADX INFO: renamed from: xa3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC38149j {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);


    /* JADX INFO: renamed from: x */
    public static final Set f163337x;

    /* JADX INFO: renamed from: y */
    public static final Set f163338y;

    /* JADX INFO: renamed from: w */
    public final boolean f163340w;

    static {
        AbstractC15751g.m44468u(new EnumC38149j[]{r0, r1, r3, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13});
        EnumC38149j[] enumC38149jArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (EnumC38149j enumC38149j : enumC38149jArrValues) {
            if (enumC38149j.f163340w) {
                arrayList.add(enumC38149j);
            }
        }
        f163337x = AbstractC25265s.m74103I1(arrayList);
        f163338y = AbstractC25260n.m74059b1(values());
    }

    public EnumC38149j(boolean z4) {
        super(str, i);
        this.f163340w = z4;
    }

    public static EnumC38149j valueOf(String str) {
        return (EnumC38149j) Enum.valueOf(EnumC38149j.class, str);
    }

    public static EnumC38149j[] values() {
        return (EnumC38149j[]) f163336R.clone();
    }
}
