package t30;

import com.whoop.android.R;
import ge3.AbstractC15751g;
import ng3.C26701n;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 t30.a[], still in use, count: 1, list:
  (r0v1 t30.a[]) from 0x0095: INVOKE (r0v1 t30.a[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: t30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC33499a {
    /* JADX INFO: Fake field, exist only in values array */
    Visa("visa", R.drawable.stripe_3ds2_ic_visa, Integer.valueOf(R.string.stripe_3ds2_brand_visa), false),
    /* JADX INFO: Fake field, exist only in values array */
    Mastercard("mastercard", R.drawable.stripe_3ds2_ic_mastercard, Integer.valueOf(R.string.stripe_3ds2_brand_mastercard), false),
    /* JADX INFO: Fake field, exist only in values array */
    Amex("american_express", R.drawable.stripe_3ds2_ic_amex, Integer.valueOf(R.string.stripe_3ds2_brand_amex), false),
    /* JADX INFO: Fake field, exist only in values array */
    Discover("discover", R.drawable.stripe_3ds2_ic_discover, Integer.valueOf(R.string.stripe_3ds2_brand_discover), false),
    /* JADX INFO: Fake field, exist only in values array */
    CartesBancaires("cartes_bancaires", R.drawable.stripe_3ds2_ic_cartesbancaires, Integer.valueOf(R.string.stripe_3ds2_brand_cartesbancaires), true),
    /* JADX INFO: Fake field, exist only in values array */
    UnionPay("unionpay", R.drawable.stripe_3ds2_ic_unionpay, Integer.valueOf(R.string.stripe_3ds2_brand_unionpay), false),
    Unknown("unknown", R.drawable.stripe_3ds2_ic_unknown, null, false);


    /* JADX INFO: renamed from: E */
    public static final C26701n f139847E = new C26701n(29);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ C33617b f139850H;

    /* JADX INFO: renamed from: w */
    public final String f139851w;

    /* JADX INFO: renamed from: x */
    public final int f139852x;

    /* JADX INFO: renamed from: y */
    public final Integer f139853y;

    /* JADX INFO: renamed from: z */
    public final boolean f139854z;

    static {
        f139850H = AbstractC15751g.m44468u(new EnumC33499a[]{r0, r1, r2, r3, r4, r5, r6});
    }

    public EnumC33499a(String str, int i13, Integer num, boolean z4) {
        super(str, i);
        this.f139851w = str;
        this.f139852x = i13;
        this.f139853y = num;
        this.f139854z = z4;
    }

    public static EnumC33499a valueOf(String str) {
        return (EnumC33499a) Enum.valueOf(EnumC33499a.class, str);
    }

    public static EnumC33499a[] values() {
        return (EnumC33499a[]) f139849G.clone();
    }
}
