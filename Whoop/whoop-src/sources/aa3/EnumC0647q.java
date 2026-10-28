package aa3;

import ba3.C2910h;
import ge3.AbstractC15751g;
import p715kotlin.jvm.internal.AbstractC22676k;
import sa3.AbstractC32330d;
import sa3.C32329c;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 aa3.q[], still in use, count: 1, list:
  (r0v1 aa3.q[]) from 0x004c: INVOKE (r0v1 aa3.q[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: aa3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC0647q {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    OBJECT(5),
    COMPANION_OBJECT(6);


    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ C33617b f2268J;

    /* JADX INFO: renamed from: w */
    public final C2910h f2272w;

    static {
        f2268J = AbstractC15751g.m44468u(enumC0647qArr);
    }

    public EnumC0647q(int i13) {
        super(str, i);
        C32329c CLASS_KIND = AbstractC32330d.f133806f;
        AbstractC22676k.m65749i(CLASS_KIND, "CLASS_KIND");
        this.f2272w = new C2910h(CLASS_KIND, i13);
    }

    public static EnumC0647q valueOf(String str) {
        return (EnumC0647q) Enum.valueOf(EnumC0647q.class, str);
    }

    public static EnumC0647q[] values() {
        return (EnumC0647q[]) f2267I.clone();
    }
}
