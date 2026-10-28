package com.stripe.android.view;

import android.content.Context;
import android.text.InputFilter;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import com.whoop.android.R;
import j93.InterfaceC21493z;
import java.util.regex.Pattern;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import s40.C32138c;
import s40.C32150g;
import s40.EnumC32184v0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004R+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m65681d2 = {"Lcom/stripe/android/view/PostalCodeEditText;", "Lcom/stripe/android/view/StripeEditText;", "Lcom/google/android/material/textfield/TextInputLayout;", "getTextInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "Ls40/v0;", "<set-?>", "V", "Lf93/d;", "getConfig$payments_core_release", "()Ls40/v0;", "setConfig$payments_core_release", "(Ls40/v0;)V", "config", "", "getPostalCode$payments_core_release", "()Ljava/lang/String;", "postalCode", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class PostalCodeEditText extends StripeEditText {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ InterfaceC21493z[] f22556W = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(PostalCodeEditText.class, "config", "getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;", 0))};

    /* JADX INFO: renamed from: a0 */
    public static final Pattern f22557a0 = Pattern.compile("^[0-9]{5}$");

    /* JADX INFO: renamed from: V */
    public final C32150g f22558V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC22676k.m65750j(context, "context");
        EnumC32184v0 enumC32184v0 = EnumC32184v0.f133294w;
        this.f22558V = new C32150g(this);
        setErrorMessage(getResources().getString(R.string.stripe_invalid_zip));
        setMaxLines(1);
        addTextChangedListener(new C32138c(this, 3));
        setAutofillHints("postalCode");
    }

    private final TextInputLayout getTextInputLayout() {
        for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m16922d(int i13) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            if (textInputLayout.m15829s()) {
                textInputLayout.setHint(getResources().getString(i13));
            } else {
                setHint(i13);
            }
        }
    }

    public final EnumC32184v0 getConfig$payments_core_release() {
        return (EnumC32184v0) this.f22558V.getValue(this, f22556W[0]);
    }

    public final String getPostalCode$payments_core_release() {
        if (getConfig$payments_core_release() != EnumC32184v0.f133295x) {
            return getFieldText$payments_core_release();
        }
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        if (f22557a0.matcher(getFieldText$payments_core_release()).matches()) {
            return fieldText$payments_core_release;
        }
        return null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        m16922d(R.string.stripe_address_label_postal_code);
        setKeyListener(TextKeyListener.getInstance());
        setInputType(112);
        setFilters(new InputFilter[0]);
    }

    public final void setConfig$payments_core_release(EnumC32184v0 enumC32184v0) {
        AbstractC22676k.m65750j(enumC32184v0, "<set-?>");
        this.f22558V.setValue(this, f22556W[0], enumC32184v0);
    }
}
