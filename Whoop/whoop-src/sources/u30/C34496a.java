package u30;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Map;
import k40.AbstractC22186a;
import m83.C25271y;
import p314m.AbstractC24858q;
import p479s4.AbstractC32128i;
import p486sp.C32854e;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p696zy.C41210b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C34496a implements Parcelable {
    public static final Parcelable.Creator<C34496a> CREATOR = new C32854e(17);

    /* JADX INFO: renamed from: w */
    public final long f144988w;

    /* JADX INFO: renamed from: x */
    public final String f144989x;

    public C34496a(long j7, String currencyCode) {
        AbstractC22676k.m65750j(currencyCode, "currencyCode");
        this.f144988w = j7;
        this.f144989x = currencyCode;
    }

    /* JADX INFO: renamed from: b */
    public final C41210b m109035b() {
        Map map = AbstractC22186a.f86059a;
        Locale localeM7700b = AbstractC24858q.m72880d().m7700b(0);
        if (localeM7700b == null) {
            localeM7700b = Locale.getDefault();
        }
        AbstractC22676k.m65747g(localeM7700b);
        String amountCurrencyCode = this.f144989x;
        AbstractC22676k.m65750j(amountCurrencyCode, "amountCurrencyCode");
        String upperCase = amountCurrencyCode.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        Currency currency = Currency.getInstance(upperCase);
        AbstractC22676k.m65749i(currency, "getInstance(...)");
        int iM63530a = AbstractC22186a.m63530a(currency);
        double dPow = this.f144988w / Math.pow(10.0d, iM63530a);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(localeM7700b);
        try {
            AbstractC22676k.m65748h(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrency(currency);
            decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(localeM7700b));
            ((DecimalFormat) currencyInstance).setMinimumFractionDigits(iM63530a);
            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
        String str = currencyInstance.format(dPow);
        AbstractC22676k.m65749i(str, "format(...)");
        return AbstractC32128i.m100064s(R.string.stripe_pay_button_amount, new Object[]{str}, C25271y.f99162w);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34496a)) {
            return false;
        }
        C34496a c34496a = (C34496a) obj;
        return this.f144988w == c34496a.f144988w && AbstractC22676k.m65745e(this.f144989x, c34496a.f144989x);
    }

    public final int hashCode() {
        return this.f144989x.hashCode() + (Long.hashCode(this.f144988w) * 31);
    }

    public final String toString() {
        StringBuilder sbM114685m = AbstractC36095b.m114685m("Amount(value=", ", currencyCode=", this.f144988w, this.f144989x);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeLong(this.f144988w);
        dest.writeString(this.f144989x);
    }
}
