package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.LocaleList;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.core.model.C5597b;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.whoop.android.R;
import j93.InterfaceC21493z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import l83.InterfaceC23457c;
import p029b5.C2728g;
import p537ux.AbstractC35333g0;
import p565vy.AbstractC36561a;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import q11.C29793c;
import rq0.ViewOnFocusChangeListenerC31661e0;
import s32.C32112d;
import s40.C32148f0;
import s40.C32150g;
import s40.C32151g0;
import s40.C32153h;
import s40.C32154h0;
import s40.C32156i;
import s40.ViewOnLayoutChangeListenerC32157i0;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u00019J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0013\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R \u0010 \u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR5\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00028@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u001f\u001a\u0004\b$\u0010\u0004\"\u0004\b%\u0010\bR4\u00101\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00060(8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u0010\u001f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R.\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060(8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-\"\u0004\b4\u0010/R\u0016\u00108\u001a\u0004\u0018\u00010)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, m65681d2 = {"Lcom/stripe/android/view/CountryTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/stripe/android/core/model/CountryCode;", "getSelectedCountryCode", "()Lcom/stripe/android/core/model/CountryCode;", "countryCode", "Ll83/a0;", "setSelectedCountryCode", "(Lcom/stripe/android/core/model/CountryCode;)V", "", "enabled", "setEnabled", "(Z)V", "", "", "allowedCountryCodes", "setAllowedCountryCodes$payments_core_release", "(Ljava/util/Set;)V", "setAllowedCountryCodes", "setCountrySelected$payments_core_release", "setCountrySelected", "(Ljava/lang/String;)V", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "Landroid/widget/AutoCompleteTextView;", "f1", "Landroid/widget/AutoCompleteTextView;", "getCountryAutocomplete", "()Landroid/widget/AutoCompleteTextView;", "getCountryAutocomplete$annotations", "()V", "countryAutocomplete", "<set-?>", "g1", "Lf93/d;", "getSelectedCountryCode$payments_core_release", "setSelectedCountryCode$payments_core_release", "getSelectedCountryCode$payments_core_release$annotations", "selectedCountryCode", "Lkotlin/Function1;", "Lcom/stripe/android/core/model/Country;", "h1", "Lkotlin/jvm/functions/Function1;", "getCountryChangeCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setCountryChangeCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "getCountryChangeCallback$payments_core_release$annotations", "countryChangeCallback", "i1", "getCountryCodeChangeCallback", "setCountryCodeChangeCallback", "countryCodeChangeCallback", "getSelectedCountry$payments_core_release", "()Lcom/stripe/android/core/model/Country;", "selectedCountry", "s40/h0", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CountryTextInputLayout extends TextInputLayout {

    /* JADX INFO: renamed from: k1 */
    public static final /* synthetic */ InterfaceC21493z[] f22528k1 = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(CountryTextInputLayout.class, "selectedCountryCode", "getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;", 0))};

    /* JADX INFO: renamed from: l1 */
    public static final int f22529l1 = R.layout.stripe_country_text_view;

    /* JADX INFO: renamed from: e1 */
    public final int f22530e1;

    /* JADX INFO: renamed from: f1, reason: from kotlin metadata */
    public final AutoCompleteTextView countryAutocomplete;

    /* JADX INFO: renamed from: g1 */
    public final C32150g f22532g1;

    /* JADX INFO: renamed from: h1, reason: from kotlin metadata */
    public /* synthetic */ Function1 countryChangeCallback;

    /* JADX INFO: renamed from: i1, reason: from kotlin metadata */
    public /* synthetic */ Function1 countryCodeChangeCallback;

    /* JADX INFO: renamed from: j1 */
    public final C32153h f22535j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textInputStyle);
        AbstractC22676k.m65750j(context, "context");
        int i13 = f22529l1;
        this.f22530e1 = i13;
        this.f22532g1 = new C32150g(this);
        this.countryChangeCallback = new C32112d(6);
        this.countryCodeChangeCallback = new C32112d(7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC35333g0.f150536b, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int i14 = 1;
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, i13);
        this.f22530e1 = resourceId2;
        typedArrayObtainStyledAttributes.recycle();
        AutoCompleteTextView autoCompleteTextView = resourceId == 0 ? new AutoCompleteTextView(getContext(), null, R.attr.autoCompleteTextViewStyle) : new AutoCompleteTextView(getContext(), null, 0, resourceId);
        this.countryAutocomplete = autoCompleteTextView;
        addView(autoCompleteTextView, new LinearLayout.LayoutParams(-1, -2));
        Set set = AbstractC36561a.f156562a;
        Locale currentLocale = getLocale();
        AbstractC22676k.m65750j(currentLocale, "currentLocale");
        C32153h c32153h = new C32153h(context, AbstractC36561a.m117289b(currentLocale), resourceId2, new C29793c(26, context, this));
        this.f22535j1 = c32153h;
        autoCompleteTextView.setThreshold(0);
        autoCompleteTextView.setAdapter(c32153h);
        autoCompleteTextView.setOnItemClickListener(new C32156i(this, i14));
        autoCompleteTextView.setOnFocusChangeListener(new ViewOnFocusChangeListenerC31661e0(this, 2));
        setSelectedCountryCode$payments_core_release(c32153h.m100105a(0).getCode());
        Country countryM100105a = c32153h.m100105a(0);
        autoCompleteTextView.setText(countryM100105a.getName());
        setSelectedCountryCode$payments_core_release(countryM100105a.getCode());
        String string = getResources().getString(R.string.stripe_address_country_invalid);
        AbstractC22676k.m65749i(string, "getString(...)");
        autoCompleteTextView.setValidator(new C32151g0(c32153h, new C29793c(27, this, string)));
    }

    /* JADX INFO: renamed from: O */
    public static void m16909O(CountryTextInputLayout countryTextInputLayout, boolean z4) {
        Object next;
        AutoCompleteTextView autoCompleteTextView = countryTextInputLayout.countryAutocomplete;
        if (z4) {
            autoCompleteTextView.showDropDown();
            return;
        }
        String countryName = autoCompleteTextView.getText().toString();
        Set set = AbstractC36561a.f156562a;
        Locale currentLocale = countryTextInputLayout.getLocale();
        AbstractC22676k.m65750j(countryName, "countryName");
        AbstractC22676k.m65750j(currentLocale, "currentLocale");
        Iterator it = AbstractC36561a.m117289b(currentLocale).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((Country) next).getName(), countryName));
        Country country = (Country) next;
        CountryCode code = country != null ? country.getCode() : null;
        if (code != null) {
            countryTextInputLayout.m16911Q(code);
            return;
        }
        Set set2 = AbstractC36561a.f156562a;
        CountryCode.Companion.getClass();
        if (AbstractC36561a.m117288a(C5597b.m16833a(countryName), countryTextInputLayout.getLocale()) != null) {
            countryTextInputLayout.m16911Q(C5597b.m16833a(countryName));
        }
    }

    public static /* synthetic */ void getCountryAutocomplete$annotations() {
    }

    @InterfaceC23457c
    public static /* synthetic */ void getCountryChangeCallback$payments_core_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Locale getLocale() {
        C2728g c2728g = C2728g.f10738b;
        Locale localeM7700b = C2728g.m7699f(LocaleList.getAdjustedDefault()).m7700b(0);
        AbstractC22676k.m65747g(localeM7700b);
        return localeM7700b;
    }

    public static /* synthetic */ void getSelectedCountryCode$payments_core_release$annotations() {
    }

    /* JADX INFO: renamed from: Q */
    public final void m16911Q(CountryCode countryCode) {
        AbstractC22676k.m65750j(countryCode, "countryCode");
        Set set = AbstractC36561a.f156562a;
        Country countryM117288a = AbstractC36561a.m117288a(countryCode, getLocale());
        if (countryM117288a != null) {
            m16912R(countryCode);
        } else {
            countryM117288a = AbstractC36561a.m117288a(getSelectedCountryCode$payments_core_release(), getLocale());
        }
        this.countryAutocomplete.setText(countryM117288a != null ? countryM117288a.getName() : null);
    }

    /* JADX INFO: renamed from: R */
    public final void m16912R(CountryCode countryCode) {
        AbstractC22676k.m65750j(countryCode, "countryCode");
        setError(null);
        setErrorEnabled(false);
        if (AbstractC22676k.m65745e(getSelectedCountryCode$payments_core_release(), countryCode)) {
            return;
        }
        setSelectedCountryCode$payments_core_release(countryCode);
    }

    public final AutoCompleteTextView getCountryAutocomplete() {
        return this.countryAutocomplete;
    }

    /* JADX INFO: renamed from: getCountryChangeCallback$payments_core_release, reason: from getter */
    public final Function1 getCountryChangeCallback() {
        return this.countryChangeCallback;
    }

    public final Function1 getCountryCodeChangeCallback() {
        return this.countryCodeChangeCallback;
    }

    public final Country getSelectedCountry$payments_core_release() {
        CountryCode selectedCountryCode$payments_core_release = getSelectedCountryCode$payments_core_release();
        if (selectedCountryCode$payments_core_release == null) {
            return null;
        }
        Set set = AbstractC36561a.f156562a;
        return AbstractC36561a.m117288a(selectedCountryCode$payments_core_release, getLocale());
    }

    public final CountryCode getSelectedCountryCode() {
        return getSelectedCountryCode$payments_core_release();
    }

    public final CountryCode getSelectedCountryCode$payments_core_release() {
        return (CountryCode) this.f22532g1.getValue(this, f22528k1[0]);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C32154h0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C32154h0 c32154h0 = (C32154h0) parcelable;
        super.onRestoreInstanceState(c32154h0.f133209x);
        CountryCode countryCode = c32154h0.f133208w;
        m16912R(countryCode);
        m16911Q(countryCode);
        requestLayout();
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public final Parcelable onSaveInstanceState() {
        Country selectedCountry$payments_core_release = getSelectedCountry$payments_core_release();
        return selectedCountry$payments_core_release != null ? new C32154h0(selectedCountry$payments_core_release.getCode(), super.onSaveInstanceState()) : super.onSaveInstanceState();
    }

    public final void setAllowedCountryCodes$payments_core_release(Set<String> allowedCountryCodes) {
        AbstractC22676k.m65750j(allowedCountryCodes, "allowedCountryCodes");
        C32153h c32153h = this.f22535j1;
        c32153h.getClass();
        if (allowedCountryCodes.isEmpty()) {
            return;
        }
        List list = c32153h.f133204b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            CountryCode code = ((Country) obj).getCode();
            Set<String> set = allowedCountryCodes;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (AbstractC39421y.m125921F((String) it.next(), code.getValue(), true)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        c32153h.f133204b = arrayList;
        C32148f0 c32148f0 = (C32148f0) c32153h.f133206d;
        c32148f0.getClass();
        c32148f0.f133193a = arrayList;
        c32153h.f133207e = c32153h.f133204b;
        c32153h.notifyDataSetChanged();
        Country countryM100105a = c32153h.m100105a(0);
        this.countryAutocomplete.setText(countryM100105a.getName());
        setSelectedCountryCode$payments_core_release(countryM100105a.getCode());
    }

    public final void setCountryChangeCallback$payments_core_release(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.countryChangeCallback = function1;
    }

    public final void setCountryCodeChangeCallback(Function1 function1) {
        AbstractC22676k.m65750j(function1, "<set-?>");
        this.countryCodeChangeCallback = function1;
    }

    public final void setCountrySelected$payments_core_release(CountryCode countryCode) {
        AbstractC22676k.m65750j(countryCode, "countryCode");
        m16911Q(countryCode);
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC32157i0(this, enabled));
    }

    public final void setSelectedCountryCode(CountryCode countryCode) {
        setSelectedCountryCode$payments_core_release(countryCode);
    }

    public final void setSelectedCountryCode$payments_core_release(CountryCode countryCode) {
        this.f22532g1.setValue(this, f22528k1[0], countryCode);
    }

    @InterfaceC23457c
    public final void setCountrySelected$payments_core_release(String countryCode) {
        AbstractC22676k.m65750j(countryCode, "countryCode");
        CountryCode.Companion.getClass();
        m16911Q(C5597b.m16833a(countryCode));
    }
}
