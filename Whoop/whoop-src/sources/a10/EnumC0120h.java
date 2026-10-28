package a10;

import ge3.AbstractC15751g;
import kr.C22786e;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a10.h[], still in use, count: 1, list:
  (r0v1 a10.h[]) from 0x005a: INVOKE (r0v1 a10.h[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: a10.h */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC0120h {
    AmexExpressCheckout("amex_express_checkout"),
    ApplePay("apple_pay"),
    GooglePay("google_pay"),
    Masterpass("master_pass"),
    SamsungPay("samsung_pay"),
    VisaCheckout("visa_checkout"),
    Link("link");


    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ C33617b f369K;

    /* JADX INFO: renamed from: x */
    public static final C22786e f370x = new C22786e(1);

    /* JADX INFO: renamed from: w */
    public final String f373w;

    static {
        f369K = AbstractC15751g.m44468u(new EnumC0120h[]{r0, r1, r2, r3, r4, r5, r6});
    }

    public EnumC0120h(String str) {
        super(str, i);
        this.f373w = str;
    }

    public static EnumC0120h valueOf(String str) {
        return (EnumC0120h) Enum.valueOf(EnumC0120h.class, str);
    }

    public static EnumC0120h[] values() {
        return (EnumC0120h[]) f368J.clone();
    }
}
