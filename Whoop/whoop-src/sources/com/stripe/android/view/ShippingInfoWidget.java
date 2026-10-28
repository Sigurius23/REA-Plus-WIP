package com.stripe.android.view;

import android.content.Context;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.whoop.android.R;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l83.C23470p;
import m83.C25271y;
import p235iz.C21038b;
import p565vy.AbstractC36561a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30599e;
import q00.C29718h0;
import q83.AbstractC30060g;
import s40.C32162k0;
import s40.C32186w0;
import s40.EnumC32188x0;
import y00.C38793c;
import y00.C38860i6;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fJ\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006\""}, m65681d2 = {"Lcom/stripe/android/view/ShippingInfoWidget;", "Landroid/widget/LinearLayout;", "", "", "allowedCountryCodes", "Ll83/a0;", "setAllowedCountryCodes", "(Ljava/util/Set;)V", "Liz/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "getViewBinding", "()Liz/b;", "viewBinding", "", "Ls40/x0;", "value", "y", "Ljava/util/List;", "getOptionalFields", "()Ljava/util/List;", "setOptionalFields", "(Ljava/util/List;)V", "optionalFields", "z", "getHiddenFields", "setHiddenFields", "hiddenFields", "Ly00/i6;", "getShippingInformation", "()Ly00/i6;", "shippingInformation", "getRawShippingInformation", "rawShippingInformation", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ShippingInfoWidget extends LinearLayout {

    /* JADX INFO: renamed from: T */
    public static final /* synthetic */ int f22560T = 0;

    /* JADX INFO: renamed from: E */
    public final CountryTextInputLayout f22561E;

    /* JADX INFO: renamed from: F */
    public final TextInputLayout f22562F;

    /* JADX INFO: renamed from: G */
    public final TextInputLayout f22563G;

    /* JADX INFO: renamed from: H */
    public final TextInputLayout f22564H;

    /* JADX INFO: renamed from: I */
    public final TextInputLayout f22565I;

    /* JADX INFO: renamed from: J */
    public final TextInputLayout f22566J;

    /* JADX INFO: renamed from: K */
    public final TextInputLayout f22567K;

    /* JADX INFO: renamed from: L */
    public final TextInputLayout f22568L;

    /* JADX INFO: renamed from: M */
    public final StripeEditText f22569M;

    /* JADX INFO: renamed from: N */
    public final StripeEditText f22570N;

    /* JADX INFO: renamed from: O */
    public final StripeEditText f22571O;

    /* JADX INFO: renamed from: P */
    public final StripeEditText f22572P;

    /* JADX INFO: renamed from: Q */
    public final StripeEditText f22573Q;

    /* JADX INFO: renamed from: R */
    public final StripeEditText f22574R;

    /* JADX INFO: renamed from: S */
    public final StripeEditText f22575S;

    /* JADX INFO: renamed from: w */
    public final C23470p f22576w;

    /* JADX INFO: renamed from: x */
    public final C32186w0 f22577x;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public List optionalFields;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public List hiddenFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
        this.f22576w = AbstractC30060g.m92088H(new C30599e(29, context, this));
        this.f22577x = new C32186w0();
        C25271y c25271y = C25271y.f99162w;
        this.optionalFields = c25271y;
        this.hiddenFields = c25271y;
        CountryTextInputLayout countryTextInputLayout = getViewBinding().f79754b;
        this.f22561E = countryTextInputLayout;
        TextInputLayout textInputLayout = getViewBinding().f79762j;
        this.f22562F = textInputLayout;
        this.f22563G = getViewBinding().f79763k;
        TextInputLayout textInputLayout2 = getViewBinding().f79764l;
        this.f22564H = textInputLayout2;
        TextInputLayout textInputLayout3 = getViewBinding().f79765m;
        this.f22565I = textInputLayout3;
        TextInputLayout textInputLayout4 = getViewBinding().f79767o;
        this.f22566J = textInputLayout4;
        TextInputLayout textInputLayout5 = getViewBinding().f79768p;
        this.f22567K = textInputLayout5;
        TextInputLayout textInputLayout6 = getViewBinding().f79766n;
        this.f22568L = textInputLayout6;
        StripeEditText stripeEditText = getViewBinding().f79755c;
        this.f22569M = stripeEditText;
        this.f22570N = getViewBinding().f79756d;
        StripeEditText stripeEditText2 = getViewBinding().f79757e;
        this.f22571O = stripeEditText2;
        StripeEditText stripeEditText3 = getViewBinding().f79758f;
        this.f22572P = stripeEditText3;
        StripeEditText stripeEditText4 = getViewBinding().f79760h;
        this.f22573Q = stripeEditText4;
        StripeEditText stripeEditText5 = getViewBinding().f79761i;
        this.f22574R = stripeEditText5;
        StripeEditText stripeEditText6 = getViewBinding().f79759g;
        this.f22575S = stripeEditText6;
        setOrientation(1);
        stripeEditText3.setAutofillHints("name");
        textInputLayout.setAutofillHints("postalAddress");
        stripeEditText4.setAutofillHints("postalCode");
        stripeEditText6.setAutofillHints("phone");
        countryTextInputLayout.setCountryChangeCallback$payments_core_release(new C29718h0(1, this, ShippingInfoWidget.class, "updateConfigForCountry", "updateConfigForCountry(Lcom/stripe/android/core/model/Country;)V", 0, 8));
        stripeEditText6.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        stripeEditText.setErrorMessageListener(new C32162k0(textInputLayout));
        stripeEditText2.setErrorMessageListener(new C32162k0(textInputLayout2));
        stripeEditText3.setErrorMessageListener(new C32162k0(textInputLayout3));
        stripeEditText4.setErrorMessageListener(new C32162k0(textInputLayout4));
        stripeEditText5.setErrorMessageListener(new C32162k0(textInputLayout5));
        stripeEditText6.setErrorMessageListener(new C32162k0(textInputLayout6));
        stripeEditText.setErrorMessage(getResources().getString(R.string.stripe_address_required));
        stripeEditText2.setErrorMessage(getResources().getString(R.string.stripe_address_city_required));
        stripeEditText3.setErrorMessage(getResources().getString(R.string.stripe_address_name_required));
        stripeEditText6.setErrorMessage(getResources().getString(R.string.stripe_address_phone_number_required));
        m16924b();
        Country selectedCountry$payments_core_release = countryTextInputLayout.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            m16925c(selectedCountry$payments_core_release);
        }
    }

    private final C38860i6 getRawShippingInformation() {
        String fieldText$payments_core_release = this.f22571O.getFieldText$payments_core_release();
        Country selectedCountry$payments_core_release = this.f22561E.getSelectedCountry$payments_core_release();
        CountryCode code = selectedCountry$payments_core_release != null ? selectedCountry$payments_core_release.getCode() : null;
        return new C38860i6(new C38793c(fieldText$payments_core_release, code != null ? code.getValue() : null, this.f22569M.getFieldText$payments_core_release(), this.f22570N.getFieldText$payments_core_release(), this.f22573Q.getFieldText$payments_core_release(), this.f22574R.getFieldText$payments_core_release()), this.f22572P.getFieldText$payments_core_release(), this.f22575S.getFieldText$payments_core_release());
    }

    private final C21038b getViewBinding() {
        return (C21038b) this.f22576w.getValue();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16923a(EnumC32188x0 enumC32188x0) {
        return (this.optionalFields.contains(enumC32188x0) || this.hiddenFields.contains(enumC32188x0)) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m16924b() {
        this.f22565I.setHint(getResources().getString(R.string.stripe_address_label_full_name));
        EnumC32188x0 enumC32188x0 = EnumC32188x0.f133310y;
        String string = this.optionalFields.contains(enumC32188x0) ? getResources().getString(R.string.stripe_address_label_city_optional) : getResources().getString(R.string.stripe_address_label_city);
        TextInputLayout textInputLayout = this.f22564H;
        textInputLayout.setHint(string);
        EnumC32188x0 enumC32188x1 = EnumC32188x0.f133306F;
        String string2 = this.optionalFields.contains(enumC32188x1) ? getResources().getString(R.string.stripe_address_label_phone_number_optional) : getResources().getString(R.string.stripe_address_label_phone_number);
        TextInputLayout textInputLayout2 = this.f22568L;
        textInputLayout2.setHint(string2);
        if (this.hiddenFields.contains(EnumC32188x0.f133308w)) {
            this.f22562F.setVisibility(8);
        }
        if (this.hiddenFields.contains(EnumC32188x0.f133309x)) {
            this.f22563G.setVisibility(8);
        }
        if (this.hiddenFields.contains(EnumC32188x0.f133305E)) {
            this.f22567K.setVisibility(8);
        }
        if (this.hiddenFields.contains(enumC32188x0)) {
            textInputLayout.setVisibility(8);
        }
        if (this.hiddenFields.contains(EnumC32188x0.f133311z)) {
            this.f22566J.setVisibility(8);
        }
        if (this.hiddenFields.contains(enumC32188x1)) {
            textInputLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16925c(Country country) {
        String value = country.getCode().getValue();
        boolean zM65745e = AbstractC22676k.m65745e(value, Locale.US.getCountry());
        StripeEditText stripeEditText = this.f22574R;
        TextInputLayout textInputLayout = this.f22567K;
        TextInputLayout textInputLayout2 = this.f22563G;
        TextInputLayout textInputLayout3 = this.f22562F;
        StripeEditText stripeEditText2 = this.f22573Q;
        TextInputLayout textInputLayout4 = this.f22566J;
        if (zM65745e) {
            textInputLayout3.setHint(this.optionalFields.contains(EnumC32188x0.f133308w) ? getResources().getString(R.string.stripe_address_label_address_optional) : getResources().getString(R.string.stripe_address_label_address));
            textInputLayout2.setHint(getResources().getString(R.string.stripe_address_label_apt_optional));
            textInputLayout4.setHint(this.optionalFields.contains(EnumC32188x0.f133311z) ? getResources().getString(R.string.stripe_address_label_zip_code_optional) : getResources().getString(R.string.stripe_address_label_zip_code));
            textInputLayout.setHint(this.optionalFields.contains(EnumC32188x0.f133305E) ? getResources().getString(R.string.stripe_address_label_state_optional) : getResources().getString(R.string.stripe_address_label_state));
            stripeEditText2.setErrorMessage(getResources().getString(R.string.stripe_address_zip_invalid));
            stripeEditText.setErrorMessage(getResources().getString(R.string.stripe_address_state_required));
        } else if (AbstractC22676k.m65745e(value, Locale.UK.getCountry())) {
            textInputLayout3.setHint(this.optionalFields.contains(EnumC32188x0.f133308w) ? getResources().getString(R.string.stripe_address_label_address_line1_optional) : getResources().getString(R.string.stripe_address_label_address_line1));
            textInputLayout2.setHint(getResources().getString(R.string.stripe_address_label_address_line2_optional));
            textInputLayout4.setHint(this.optionalFields.contains(EnumC32188x0.f133311z) ? getResources().getString(R.string.stripe_address_label_postcode_optional) : getResources().getString(R.string.stripe_address_label_postcode));
            textInputLayout.setHint(this.optionalFields.contains(EnumC32188x0.f133305E) ? getResources().getString(R.string.stripe_address_label_county_optional) : getResources().getString(R.string.stripe_address_label_county));
            stripeEditText2.setErrorMessage(getResources().getString(R.string.stripe_address_postcode_invalid));
            stripeEditText.setErrorMessage(getResources().getString(R.string.stripe_address_county_required));
        } else if (AbstractC22676k.m65745e(value, Locale.CANADA.getCountry())) {
            textInputLayout3.setHint(this.optionalFields.contains(EnumC32188x0.f133308w) ? getResources().getString(R.string.stripe_address_label_address_optional) : getResources().getString(R.string.stripe_address_label_address));
            textInputLayout2.setHint(getResources().getString(R.string.stripe_address_label_apt_optional));
            textInputLayout4.setHint(this.optionalFields.contains(EnumC32188x0.f133311z) ? getResources().getString(R.string.stripe_address_label_postal_code_optional) : getResources().getString(R.string.stripe_address_label_postal_code));
            textInputLayout.setHint(this.optionalFields.contains(EnumC32188x0.f133305E) ? getResources().getString(R.string.stripe_address_label_province_optional) : getResources().getString(R.string.stripe_address_label_province));
            stripeEditText2.setErrorMessage(getResources().getString(R.string.stripe_address_postal_code_invalid));
            stripeEditText.setErrorMessage(getResources().getString(R.string.stripe_address_province_required));
        } else {
            textInputLayout3.setHint(this.optionalFields.contains(EnumC32188x0.f133308w) ? getResources().getString(R.string.stripe_address_label_address_line1_optional) : getResources().getString(R.string.stripe_address_label_address_line1));
            textInputLayout2.setHint(getResources().getString(R.string.stripe_address_label_address_line2_optional));
            textInputLayout4.setHint(this.optionalFields.contains(EnumC32188x0.f133311z) ? getResources().getString(R.string.stripe_address_label_zip_postal_code_optional) : getResources().getString(R.string.stripe_address_label_zip_postal_code));
            textInputLayout.setHint(this.optionalFields.contains(EnumC32188x0.f133305E) ? getResources().getString(R.string.stripe_address_label_region_generic_optional) : getResources().getString(R.string.stripe_address_label_region_generic));
            stripeEditText2.setErrorMessage(getResources().getString(R.string.stripe_address_zip_or_postal_invalid));
            stripeEditText.setErrorMessage(getResources().getString(R.string.stripe_address_region_generic_required));
        }
        stripeEditText2.setFilters(AbstractC22676k.m65745e(country.getCode().getValue(), Locale.CANADA.getCountry()) ? new InputFilter[]{new InputFilter.AllCaps()} : new InputFilter[0]);
        Set set = AbstractC36561a.f156562a;
        CountryCode countryCode = country.getCode();
        AbstractC22676k.m65750j(countryCode, "countryCode");
        textInputLayout4.setVisibility((!AbstractC36561a.f156563b.contains(countryCode.getValue()) || this.hiddenFields.contains(EnumC32188x0.f133311z)) ? 8 : 0);
    }

    public final List<EnumC32188x0> getHiddenFields() {
        return this.hiddenFields;
    }

    public final List<EnumC32188x0> getOptionalFields() {
        return this.optionalFields;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    public final C38860i6 getShippingInformation() {
        String string;
        StripeEditText stripeEditText;
        Editable text;
        String string2;
        StripeEditText stripeEditText2;
        Editable text2;
        String string3;
        StripeEditText stripeEditText3;
        Editable text3;
        String string4;
        StripeEditText stripeEditText4;
        Editable text4;
        String string5;
        StripeEditText stripeEditText5;
        Editable text5;
        String string6;
        Pattern pattern;
        Set set;
        String upperCase;
        Matcher matcher;
        boolean zMatches;
        CountryCode code;
        StripeEditText stripeEditText6 = this.f22569M;
        Editable text6 = stripeEditText6.getText();
        if (text6 == null || (string = text6.toString()) == null || (text = (stripeEditText = this.f22572P).getText()) == null || (string2 = text.toString()) == null || (text2 = (stripeEditText2 = this.f22571O).getText()) == null || (string3 = text2.toString()) == null || (text3 = (stripeEditText3 = this.f22574R).getText()) == null || (string4 = text3.toString()) == null || (text4 = (stripeEditText4 = this.f22573Q).getText()) == null || (string5 = text4.toString()) == null || (text5 = (stripeEditText5 = this.f22575S).getText()) == null || (string6 = text5.toString()) == null) {
            return null;
        }
        CountryTextInputLayout countryTextInputLayout = this.f22561E;
        countryTextInputLayout.countryAutocomplete.performValidation();
        Country selectedCountry$payments_core_release = countryTextInputLayout.getSelectedCountry$payments_core_release();
        String value = (selectedCountry$payments_core_release == null || (code = selectedCountry$payments_core_release.getCode()) == null) ? null : code.getValue();
        List optionalShippingInfoFields = this.optionalFields;
        List hiddenShippingInfoFields = this.hiddenFields;
        this.f22577x.getClass();
        AbstractC22676k.m65750j(optionalShippingInfoFields, "optionalShippingInfoFields");
        AbstractC22676k.m65750j(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        if (value == null) {
            zMatches = false;
        } else if (AbstractC39414r.m125890i0(string5)) {
            EnumC32188x0 enumC32188x0 = EnumC32188x0.f133311z;
            if (optionalShippingInfoFields.contains(enumC32188x0) || hiddenShippingInfoFields.contains(enumC32188x0)) {
                zMatches = true;
            } else {
                pattern = (Pattern) C32186w0.f133299a.get(value);
                if (pattern != null || (matcher = pattern.matcher(string5)) == null) {
                    set = AbstractC36561a.f156563b;
                    upperCase = value.toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                    if (set.contains(upperCase) || !AbstractC39414r.m125890i0(string5)) {
                        zMatches = true;
                    } else {
                        zMatches = false;
                    }
                } else {
                    zMatches = matcher.matches();
                }
            }
        } else {
            pattern = (Pattern) C32186w0.f133299a.get(value);
            if (pattern != null) {
            }
            set = AbstractC36561a.f156563b;
            upperCase = value.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            if (set.contains(upperCase)) {
            }
            zMatches = true;
        }
        stripeEditText4.setShouldShowError(!zMatches);
        boolean z4 = AbstractC39414r.m125890i0(string) && m16923a(EnumC32188x0.f133308w);
        stripeEditText6.setShouldShowError(z4);
        boolean z13 = AbstractC39414r.m125890i0(string3) && m16923a(EnumC32188x0.f133310y);
        stripeEditText2.setShouldShowError(z13);
        boolean zM125890i0 = AbstractC39414r.m125890i0(string2);
        stripeEditText.setShouldShowError(zM125890i0);
        boolean z14 = AbstractC39414r.m125890i0(string4) && m16923a(EnumC32188x0.f133305E);
        stripeEditText3.setShouldShowError(z14);
        boolean z15 = AbstractC39414r.m125890i0(string6) && m16923a(EnumC32188x0.f133306F);
        stripeEditText5.setShouldShowError(z15);
        if (!zMatches || z4 || z13 || z14 || zM125890i0 || z15 || selectedCountry$payments_core_release == null) {
            return null;
        }
        return getRawShippingInformation();
    }

    public final void setAllowedCountryCodes(Set<String> allowedCountryCodes) {
        AbstractC22676k.m65750j(allowedCountryCodes, "allowedCountryCodes");
        this.f22561E.setAllowedCountryCodes$payments_core_release(allowedCountryCodes);
    }

    public final void setHiddenFields(List<? extends EnumC32188x0> value) {
        AbstractC22676k.m65750j(value, "value");
        this.hiddenFields = value;
        m16924b();
        Country selectedCountry$payments_core_release = this.f22561E.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            m16925c(selectedCountry$payments_core_release);
        }
    }

    public final void setOptionalFields(List<? extends EnumC32188x0> value) {
        AbstractC22676k.m65750j(value, "value");
        this.optionalFields = value;
        m16924b();
        Country selectedCountry$payments_core_release = this.f22561E.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            m16925c(selectedCountry$payments_core_release);
        }
    }
}
