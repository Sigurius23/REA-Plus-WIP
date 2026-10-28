package y00;

import ge3.AbstractC15751g;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 y00.a[], still in use, count: 1, list:
  (r0v1 y00.a[]) from 0x0074: INVOKE (r0v1 y00.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: y00.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC38773a {
    Visa("VISA", EnumC38853i.Visa),
    Mastercard("MASTERCARD", EnumC38853i.MasterCard),
    AmericanExpress("AMERICAN_EXPRESS", EnumC38853i.AmericanExpress),
    JCB("JCB", EnumC38853i.JCB),
    DinersClub("DINERS_CLUB", EnumC38853i.DinersClub),
    Discover("DISCOVER", EnumC38853i.Discover),
    UnionPay("UNIONPAY", EnumC38853i.UnionPay),
    CartesBancaires("CARTES_BANCAIRES", EnumC38853i.CartesBancaires);


    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ C33617b f166881L;

    /* JADX INFO: renamed from: w */
    public final String f166884w;

    /* JADX INFO: renamed from: x */
    public final EnumC38853i f166885x;

    static {
        f166881L = AbstractC15751g.m44468u(enumC38773aArr);
    }

    public EnumC38773a(String str, EnumC38853i enumC38853i) {
        super(str, i);
        this.f166884w = str;
        this.f166885x = enumC38853i;
    }

    public static EnumC38773a valueOf(String str) {
        return (EnumC38773a) Enum.valueOf(EnumC38773a.class, str);
    }

    public static EnumC38773a[] values() {
        return (EnumC38773a[]) f166880K.clone();
    }
}
