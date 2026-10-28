package ed3;

import ge3.AbstractC15751g;
import kr.C22786e;
import p002a0.C0030i1;
import p088dc.AbstractC11895b;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ed3.l[], still in use, count: 1, list:
  (r0v1 ed3.l[]) from 0x003a: INVOKE (r0v1 ed3.l[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: ed3.l */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC13128l {
    INVALID(-1),
    VARINT(0),
    i64(1),
    SIZE_DELIMITED(2),
    i32(5);


    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ C33617b f45403J;

    /* JADX INFO: renamed from: x */
    public static final C22786e f45404x = new C22786e(26);

    /* JADX INFO: renamed from: y */
    public static final EnumC13128l[] f45405y;

    /* JADX INFO: renamed from: w */
    public final int f45407w;

    static {
        Object next;
        f45403J = AbstractC15751g.m44468u(new EnumC13128l[]{r0, r1, r2, r4, r5});
        EnumC13128l[] enumC13128lArr = new EnumC13128l[8];
        for (int i13 = 0; i13 < 8; i13++) {
            C33617b c33617b = f45403J;
            c33617b.getClass();
            C0030i1 c0030i1 = new C0030i1(c33617b, 2);
            do {
                if (!c0030i1.hasNext()) {
                    next = null;
                    break;
                }
                next = c0030i1.next();
            } while (((EnumC13128l) next).f45407w != i13);
            EnumC13128l enumC13128l = (EnumC13128l) next;
            if (enumC13128l == null) {
                enumC13128l = INVALID;
            }
            enumC13128lArr[i13] = enumC13128l;
        }
        f45405y = enumC13128lArr;
    }

    public EnumC13128l(int i13) {
        super(str, i);
        this.f45407w = i13;
    }

    public static EnumC13128l valueOf(String str) {
        return (EnumC13128l) Enum.valueOf(EnumC13128l.class, str);
    }

    public static EnumC13128l[] values() {
        return (EnumC13128l[]) f45402I.clone();
    }

    /* JADX INFO: renamed from: a */
    public final int m36726a(int i13) {
        return (i13 << 3) | this.f45407w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(name());
        sb4.append('(');
        return AbstractC11895b.m31999r(sb4, this.f45407w, ')');
    }
}
