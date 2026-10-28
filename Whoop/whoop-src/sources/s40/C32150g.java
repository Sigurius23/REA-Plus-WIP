package s40;

import android.text.Html;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.text.method.TextKeyListener;
import android.view.View;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.view.BecsDebitMandateAcceptanceTextView;
import com.stripe.android.view.CardNumberTextInputLayout;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import com.whoop.android.R;
import f93.AbstractC14290b;
import gm.C15982j;
import j93.InterfaceC21493z;
import java.util.Set;
import p565vy.AbstractC36561a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: s40.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C32150g extends AbstractC14290b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133196w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ View f133197x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32150g(BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView) {
        super("");
        this.f133197x = becsDebitMandateAcceptanceTextView;
    }

    @Override // f93.AbstractC14290b
    public final void afterChange(InterfaceC21493z property, Object obj, Object obj2) {
        CharSequence charSequenceFromHtml;
        int i13 = this.f133196w;
        View view = this.f133197x;
        switch (i13) {
            case 0:
                AbstractC22676k.m65750j(property, "property");
                String str = (String) obj2;
                BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView = (BecsDebitMandateAcceptanceTextView) view;
                if (AbstractC39414r.m125890i0(str)) {
                    str = null;
                }
                if (str != null) {
                    C15982j c15982j = becsDebitMandateAcceptanceTextView.f22471w;
                    c15982j.getClass();
                    String string = c15982j.f60491w.getString(R.string.stripe_becs_mandate_acceptance, str);
                    AbstractC22676k.m65749i(string, "getString(...)");
                    charSequenceFromHtml = Html.fromHtml(string, 0);
                    AbstractC22676k.m65747g(charSequenceFromHtml);
                } else {
                    charSequenceFromHtml = "";
                }
                becsDebitMandateAcceptanceTextView.setText(charSequenceFromHtml);
                return;
            case 1:
                CardNumberTextInputLayout cardNumberTextInputLayout = (CardNumberTextInputLayout) view;
                AbstractC22676k.m65750j(property, "property");
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != zBooleanValue) {
                    if (zBooleanValue) {
                        C32133a0 c32133a0 = cardNumberTextInputLayout.f22526e1;
                        c32133a0.startAnimation(c32133a0.f133156w);
                        return;
                    } else {
                        C32133a0 c32133a1 = cardNumberTextInputLayout.f22526e1;
                        c32133a1.startAnimation(c32133a1.f133157x);
                        return;
                    }
                }
                return;
            case 2:
                CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) view;
                AbstractC22676k.m65750j(property, "property");
                CountryCode countryCode = (CountryCode) obj2;
                if (countryCode != null) {
                    countryTextInputLayout.getCountryCodeChangeCallback().invoke(countryCode);
                    Set set = AbstractC36561a.f156562a;
                    Country countryM117288a = AbstractC36561a.m117288a(countryCode, countryTextInputLayout.getLocale());
                    if (countryM117288a != null) {
                        countryTextInputLayout.getCountryChangeCallback().invoke(countryM117288a);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                AbstractC22676k.m65750j(property, "property");
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                InterfaceC21493z[] interfaceC21493zArr = ExpiryDateEditText.f22539d0;
                ((ExpiryDateEditText) view).m16916d(zBooleanValue2);
                return;
            default:
                PostalCodeEditText postalCodeEditText = (PostalCodeEditText) view;
                AbstractC22676k.m65750j(property, "property");
                int iOrdinal = ((EnumC32184v0) obj2).ordinal();
                if (iOrdinal == 0) {
                    InterfaceC21493z[] interfaceC21493zArr2 = PostalCodeEditText.f22556W;
                    postalCodeEditText.m16922d(R.string.stripe_address_label_postal_code);
                    postalCodeEditText.setKeyListener(TextKeyListener.getInstance());
                    postalCodeEditText.setInputType(112);
                    postalCodeEditText.setFilters(new InputFilter[0]);
                    return;
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC21493z[] interfaceC21493zArr3 = PostalCodeEditText.f22556W;
                postalCodeEditText.m16922d(R.string.stripe_address_label_zip_code);
                postalCodeEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
                postalCodeEditText.setKeyListener(DigitsKeyListener.getInstance(false, true));
                postalCodeEditText.m16927c();
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C32150g(CardNumberTextInputLayout cardNumberTextInputLayout) {
        Boolean bool = Boolean.FALSE;
        this.f133197x = cardNumberTextInputLayout;
        super(bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32150g(CountryTextInputLayout countryTextInputLayout) {
        super(null);
        this.f133197x = countryTextInputLayout;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C32150g(ExpiryDateEditText expiryDateEditText) {
        Boolean bool = Boolean.FALSE;
        this.f133197x = expiryDateEditText;
        super(bool);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C32150g(PostalCodeEditText postalCodeEditText) {
        EnumC32184v0 enumC32184v0 = EnumC32184v0.f133294w;
        this.f133197x = postalCodeEditText;
        super(enumC32184v0);
    }
}
