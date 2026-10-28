package v00;

import ge3.AbstractC15751g;
import p499t9.C33623c0;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 v00.s0[], still in use, count: 1, list:
  (r0v1 v00.s0[]) from 0x002a: INVOKE (r0v1 v00.s0[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: v00.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC35491s0 {
    GooglePay("google_pay"),
    Link("link"),
    ShopPay("shop_pay");


    /* JADX INFO: renamed from: G */
    public static final /* synthetic */ C33617b f151074G;

    /* JADX INFO: renamed from: x */
    public static final C33623c0 f151075x = new C33623c0();

    /* JADX INFO: renamed from: w */
    public final String f151078w;

    static {
        f151074G = AbstractC15751g.m44468u(new EnumC35491s0[]{r0, r1, r2});
    }

    public EnumC35491s0(String str) {
        super(str, i);
        this.f151078w = str;
    }

    public static EnumC35491s0 valueOf(String str) {
        return (EnumC35491s0) Enum.valueOf(EnumC35491s0.class, str);
    }

    public static EnumC35491s0[] values() {
        return (EnumC35491s0[]) f151073F.clone();
    }
}
