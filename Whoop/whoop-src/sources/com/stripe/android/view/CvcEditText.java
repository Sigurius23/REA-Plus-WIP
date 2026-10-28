package com.stripe.android.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import c93.InterfaceC4339a;
import com.google.android.material.textfield.TextInputLayout;
import com.whoop.android.R;
import java.util.Set;
import m83.AbstractC25260n;
import p695zx.C41189k;
import p695zx.C41190l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rq0.ViewOnFocusChangeListenerC31661e0;
import rx0.C31901f;
import s40.AbstractC32160j0;
import s40.C32138c;
import y00.EnumC38853i;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m65681d2 = {"Lcom/stripe/android/view/CvcEditText;", "Lcom/stripe/android/view/StripeEditText;", "Lkotlin/Function0;", "Ll83/a0;", "W", "Lc93/a;", "getCompletionCallback$payments_core_release", "()Lc93/a;", "setCompletionCallback$payments_core_release", "(Lc93/a;)V", "completionCallback", "Lzx/k;", "getUnvalidatedCvc", "()Lzx/k;", "unvalidatedCvc", "Lzx/l;", "getCvc$payments_core_release", "()Lzx/l;", "cvc", "", "getAccessibilityText", "()Ljava/lang/String;", "accessibilityText", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CvcEditText extends StripeEditText {

    /* JADX INFO: renamed from: a0 */
    public static final /* synthetic */ int f22536a0 = 0;

    /* JADX INFO: renamed from: V */
    public EnumC38853i f22537V;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public /* synthetic */ InterfaceC4339a completionCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC22676k.m65750j(context, "context");
        EnumC38853i enumC38853i = EnumC38853i.Unknown;
        this.f22537V = enumC38853i;
        this.completionCallback = new C31901f(23);
        setErrorMessage(getResources().getString(R.string.stripe_invalid_cvc));
        setHint(R.string.stripe_cvc_number_hint);
        setMaxLines(1);
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(enumC38853i.m124353b())});
        m16927c();
        setAutofillHints("creditCardSecurityCode");
        addTextChangedListener(new C32138c(this, 2));
        getInternalFocusChangeListeners().add(new ViewOnFocusChangeListenerC31661e0(this, 3));
        setLayoutDirection(0);
    }

    /* JADX INFO: renamed from: d */
    public static void m16913d(CvcEditText cvcEditText, boolean z4) {
        if (z4) {
            return;
        }
        C41189k unvalidatedCvc = cvcEditText.getUnvalidatedCvc();
        int iM124353b = cvcEditText.f22537V.m124353b();
        if (AbstractC39414r.m125890i0(unvalidatedCvc.f177706x) || AbstractC25260n.m74059b1(new Integer[]{3, Integer.valueOf(iM124353b)}).contains(Integer.valueOf(unvalidatedCvc.f177706x.length()))) {
            return;
        }
        cvcEditText.setShouldShowError(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C41189k getUnvalidatedCvc() {
        return new C41189k(getFieldText$payments_core_release());
    }

    /* JADX INFO: renamed from: f */
    public final void m16915f(EnumC38853i cardBrand, String str, String str2, TextInputLayout textInputLayout) {
        AbstractC22676k.m65750j(cardBrand, "cardBrand");
        this.f22537V = cardBrand;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(cardBrand.m124353b())});
        if (str == null) {
            str = cardBrand == EnumC38853i.AmericanExpress ? getResources().getString(R.string.stripe_cvc_amex_hint) : getResources().getString(R.string.stripe_cvc_number_hint);
            AbstractC22676k.m65747g(str);
        }
        if (getUnvalidatedCvc().f177706x.length() > 0) {
            C41189k unvalidatedCvc = getUnvalidatedCvc();
            int iM124353b = cardBrand.m124353b();
            unvalidatedCvc.getClass();
            Set setM74059b1 = AbstractC25260n.m74059b1(new Integer[]{3, Integer.valueOf(iM124353b)});
            String str3 = unvalidatedCvc.f177706x;
            setShouldShowError((setM74059b1.contains(Integer.valueOf(str3.length())) ? new C41190l(str3) : null) == null);
        }
        if (textInputLayout == null) {
            setHint(str);
            return;
        }
        textInputLayout.setHint(str);
        if (str2 == null) {
            str2 = getResources().getString(AbstractC32160j0.f133220a[cardBrand.ordinal()] == 1 ? R.string.stripe_cvc_multiline_helper_amex : R.string.stripe_cvc_multiline_helper);
            AbstractC22676k.m65749i(str2, "getString(...)");
        }
        textInputLayout.setPlaceholderText(str2);
    }

    @Override // com.stripe.android.view.StripeEditText
    public String getAccessibilityText() {
        String string = getResources().getString(R.string.stripe_acc_label_cvc_node, getText());
        AbstractC22676k.m65749i(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: getCompletionCallback$payments_core_release, reason: from getter */
    public final InterfaceC4339a getCompletionCallback() {
        return this.completionCallback;
    }

    public final C41190l getCvc$payments_core_release() {
        C41189k unvalidatedCvc = getUnvalidatedCvc();
        int iM124353b = this.f22537V.m124353b();
        unvalidatedCvc.getClass();
        Set setM74059b1 = AbstractC25260n.m74059b1(new Integer[]{3, Integer.valueOf(iM124353b)});
        String str = unvalidatedCvc.f177706x;
        if (setM74059b1.contains(Integer.valueOf(str.length()))) {
            return new C41190l(str);
        }
        return null;
    }

    public final void setCompletionCallback$payments_core_release(InterfaceC4339a interfaceC4339a) {
        AbstractC22676k.m65750j(interfaceC4339a, "<set-?>");
        this.completionCallback = interfaceC4339a;
    }
}
