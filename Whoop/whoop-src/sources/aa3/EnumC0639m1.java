package aa3;

import ba3.C2910h;
import ge3.AbstractC15751g;
import p715kotlin.jvm.internal.AbstractC22676k;
import sa3.AbstractC32330d;
import sa3.C32329c;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 aa3.m1[], still in use, count: 1, list:
  (r0v1 aa3.m1[]) from 0x002e: INVOKE (r0v1 aa3.m1[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: aa3.m1 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC0639m1 {
    FINAL(0),
    OPEN(1),
    ABSTRACT(2),
    SEALED(3);


    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ C33617b f2221G;

    /* JADX INFO: renamed from: w */
    public final C2910h f2225w;

    static {
        f2221G = AbstractC15751g.m44468u(enumC0639m1Arr);
    }

    public EnumC0639m1(int i13) {
        super(str, i);
        C32329c MODALITY = AbstractC32330d.f133805e;
        AbstractC22676k.m65749i(MODALITY, "MODALITY");
        this.f2225w = new C2910h(MODALITY, i13);
    }

    public static EnumC0639m1 valueOf(String str) {
        return (EnumC0639m1) Enum.valueOf(EnumC0639m1.class, str);
    }

    public static EnumC0639m1[] values() {
        return (EnumC0639m1[]) f2220F.clone();
    }
}
