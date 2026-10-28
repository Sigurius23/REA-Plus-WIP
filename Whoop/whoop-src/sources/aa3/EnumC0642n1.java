package aa3;

import ba3.C2910h;
import ge3.AbstractC15751g;
import p715kotlin.jvm.internal.AbstractC22676k;
import sa3.AbstractC32330d;
import sa3.C32329c;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 aa3.n1[], still in use, count: 1, list:
  (r0v1 aa3.n1[]) from 0x0038: INVOKE (r0v1 aa3.n1[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: aa3.n1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC0642n1 {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);


    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ C33617b f2246z;

    /* JADX INFO: renamed from: w */
    public final C2910h f2247w;

    static {
        f2246z = AbstractC15751g.m44468u(enumC0642n1Arr);
    }

    public EnumC0642n1(int i13) {
        super(str, i);
        C32329c VISIBILITY = AbstractC32330d.f133804d;
        AbstractC22676k.m65749i(VISIBILITY, "VISIBILITY");
        this.f2247w = new C2910h(VISIBILITY, i13);
    }

    public static EnumC0642n1 valueOf(String str) {
        return (EnumC0642n1) Enum.valueOf(EnumC0642n1.class, str);
    }

    public static EnumC0642n1[] values() {
        return (EnumC0642n1[]) f2245y.clone();
    }
}
