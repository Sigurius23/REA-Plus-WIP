package y00;

import ge3.AbstractC15751g;
import java.util.Set;
import m83.AbstractC25260n;
import p098dt.AbstractC12350b;
import p499t9.C33623c0;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.h8[], still in use, count: 1, list:
  (r0v1 y00.h8[]) from 0x0046: INVOKE (r0v1 y00.h8[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.h8 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38852h8 {
    ApplePay(AbstractC12350b.m34570S("apple_pay")),
    /* JADX INFO: Fake field, exist only in values array */
    GooglePay(AbstractC25260n.m74059b1(new String[]{"android_pay", "google"})),
    /* JADX INFO: Fake field, exist only in values array */
    Masterpass(AbstractC12350b.m34570S("masterpass")),
    /* JADX INFO: Fake field, exist only in values array */
    VisaCheckout(AbstractC12350b.m34570S("visa_checkout"));


    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ C33617b f167233E;

    /* JADX INFO: renamed from: x */
    public static final C33623c0 f167234x = new C33623c0();

    /* JADX INFO: renamed from: w */
    public final Set f167237w;

    static {
        f167233E = AbstractC15751g.m44468u(new EnumC38852h8[]{r0, new EnumC38852h8(AbstractC25260n.m74059b1(new String[]{"android_pay", "google"})), new EnumC38852h8(AbstractC12350b.m34570S("masterpass")), new EnumC38852h8(AbstractC12350b.m34570S("visa_checkout"))});
    }

    public EnumC38852h8(Set set) {
        super(str, i);
        this.f167237w = set;
    }

    public static EnumC38852h8 valueOf(String str) {
        return (EnumC38852h8) Enum.valueOf(EnumC38852h8.class, str);
    }

    public static EnumC38852h8[] values() {
        return (EnumC38852h8[]) f167236z.clone();
    }
}
