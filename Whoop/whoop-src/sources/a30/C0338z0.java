package a30;

/* JADX INFO: renamed from: a30.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0338z0 extends AbstractC0287e1 {

    /* JADX INFO: renamed from: w */
    public static final C0338z0 f1189w = new C0338z0();

    /* JADX INFO: renamed from: x */
    public static final String f1190x = "missingAmountOrCurrency";

    /* JADX INFO: renamed from: y */
    public static final String f1191y = "PaymentIntent must contain amount and currency.";

    @Override // a30.AbstractC0287e1
    /* JADX INFO: renamed from: a */
    public final String mo816a() {
        return f1190x;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return f1191y;
    }
}
