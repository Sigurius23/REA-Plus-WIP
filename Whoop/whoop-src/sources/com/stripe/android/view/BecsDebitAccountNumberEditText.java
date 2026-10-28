package com.stripe.android.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import com.whoop.android.R;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import s40.C32138c;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Lcom/stripe/android/view/BecsDebitAccountNumberEditText;", "Lcom/stripe/android/view/StripeEditText;", "", "V", "I", "getMinLength", "()I", "setMinLength", "(I)V", "minLength", "", "getAccountNumber", "()Ljava/lang/String;", "accountNumber", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class BecsDebitAccountNumberEditText extends StripeEditText {

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public int minLength;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC22676k.m65750j(context, "context");
        this.minLength = 5;
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(9)});
        setInputType(2);
        addTextChangedListener(new C32138c(this, 0));
    }

    public final String getAccountNumber() {
        String string;
        if (AbstractC39414r.m125890i0(getFieldText$payments_core_release())) {
            string = getResources().getString(R.string.stripe_becs_widget_account_number_required);
        } else {
            string = getFieldText$payments_core_release().length() < this.minLength ? getResources().getString(R.string.stripe_becs_widget_account_number_incomplete) : null;
        }
        setErrorMessage$payments_core_release(string);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        if (getErrorMessage() == null) {
            return fieldText$payments_core_release;
        }
        return null;
    }

    public final int getMinLength() {
        return this.minLength;
    }

    public final void setMinLength(int i13) {
        this.minLength = i13;
    }
}
