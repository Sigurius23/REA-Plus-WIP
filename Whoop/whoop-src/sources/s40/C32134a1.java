package s40;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.whoop.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import p235iz.C21041e;
import p479s4.AbstractC32122c;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38870j6;

/* JADX INFO: renamed from: s40.a1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32134a1 extends RelativeLayout {

    /* JADX INFO: renamed from: w */
    public final int f133158w;

    /* JADX INFO: renamed from: x */
    public final int f133159x;

    /* JADX INFO: renamed from: y */
    public final int f133160y;

    /* JADX INFO: renamed from: z */
    public final C21041e f133161z;

    public C32134a1(Context context) {
        super(context, null, 0);
        C32137b1 c32137b1 = new C32137b1(context);
        LayoutInflater.from(context).inflate(R.layout.stripe_shipping_method_view, this);
        int i13 = R.id.description;
        TextView textView = (TextView) AbstractC34235f.m108203J(this, R.id.description);
        if (textView != null) {
            i13 = R.id.name;
            TextView textView2 = (TextView) AbstractC34235f.m108203J(this, R.id.name);
            if (textView2 != null) {
                i13 = R.id.price;
                TextView textView3 = (TextView) AbstractC34235f.m108203J(this, R.id.price);
                if (textView3 != null) {
                    i13 = R.id.selected_icon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC34235f.m108203J(this, R.id.selected_icon);
                    if (appCompatImageView != null) {
                        this.f133161z = new C21041e(this, textView, textView2, textView3, appCompatImageView);
                        int i14 = c32137b1.f133166b;
                        this.f133158w = Color.alpha(i14) < 16 ? AbstractC32122c.getColor(context, R.color.stripe_accent_color_default) : i14;
                        int i15 = c32137b1.f133168d;
                        this.f133160y = Color.alpha(i15) < 16 ? AbstractC32122c.getColor(context, R.color.stripe_color_text_unselected_primary_default) : i15;
                        int i16 = c32137b1.f133169e;
                        this.f133159x = Color.alpha(i16) < 16 ? AbstractC32122c.getColor(context, R.color.stripe_color_text_unselected_secondary_default) : i16;
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i13)));
    }

    @Override // android.view.View
    public void setSelected(boolean z4) {
        C21041e c21041e = this.f133161z;
        if (z4) {
            TextView textView = c21041e.f79780c;
            int i13 = this.f133158w;
            textView.setTextColor(i13);
            c21041e.f79779b.setTextColor(i13);
            c21041e.f79781d.setTextColor(i13);
            c21041e.f79782e.setVisibility(0);
            return;
        }
        TextView textView2 = c21041e.f79780c;
        int i14 = this.f133160y;
        textView2.setTextColor(i14);
        c21041e.f79779b.setTextColor(this.f133159x);
        c21041e.f79781d.setTextColor(i14);
        c21041e.f79782e.setVisibility(4);
    }

    public final void setShippingMethod(C38870j6 shippingMethod) {
        AbstractC22676k.m65750j(shippingMethod, "shippingMethod");
        C21041e c21041e = this.f133161z;
        c21041e.f79780c.setText(shippingMethod.f167314w);
        c21041e.f79779b.setText(shippingMethod.f167313E);
        TextView textView = c21041e.f79781d;
        long j7 = shippingMethod.f167316y;
        Currency currency = shippingMethod.f167317z;
        String string = getContext().getString(R.string.stripe_price_free);
        AbstractC22676k.m65749i(string, "getString(...)");
        AbstractC22676k.m65750j(currency, "currency");
        if (j7 != 0) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            AbstractC22676k.m65748h(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
            DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(Locale.getDefault()));
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            double dPow = j7 / Math.pow(10.0d, currency.getDefaultFractionDigits());
            NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance();
            try {
                AbstractC22676k.m65748h(currencyInstance2, "null cannot be cast to non-null type java.text.DecimalFormat");
                DecimalFormatSymbols decimalFormatSymbols2 = ((DecimalFormat) currencyInstance2).getDecimalFormatSymbols();
                decimalFormatSymbols2.setCurrencySymbol(currency.getSymbol(Locale.getDefault()));
                ((DecimalFormat) currencyInstance2).setDecimalFormatSymbols(decimalFormatSymbols2);
                String str = ((DecimalFormat) currencyInstance2).format(dPow);
                AbstractC22676k.m65747g(str);
                string = str;
            } catch (ClassCastException unused) {
                string = currencyInstance2.format(dPow);
                AbstractC22676k.m65747g(string);
            }
        }
        textView.setText(string);
    }
}
