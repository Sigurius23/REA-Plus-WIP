package y00;

import ge3.AbstractC15751g;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.p2[], still in use, count: 1, list:
  (r0v1 y00.p2[]) from 0x0026: INVOKE (r0v1 y00.p2[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.p2 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38922p2 {
    /* JADX INFO: Fake field, exist only in values array */
    Passthrough("PASSTHROUGH"),
    /* JADX INFO: Fake field, exist only in values array */
    LinkPaymentMethod("LINK_PAYMENT_METHOD"),
    LinkCardBrand("LINK_CARD_BRAND");


    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ C33617b f167548z;

    /* JADX INFO: renamed from: w */
    public final String f167549w;

    static {
        f167548z = AbstractC15751g.m44468u(enumC38922p2Arr);
    }

    public EnumC38922p2(String str) {
        super(str, i);
        this.f167549w = str;
    }

    public static EnumC38922p2 valueOf(String str) {
        return (EnumC38922p2) Enum.valueOf(EnumC38922p2.class, str);
    }

    public static EnumC38922p2[] values() {
        return (EnumC38922p2[]) f167547y.clone();
    }
}
