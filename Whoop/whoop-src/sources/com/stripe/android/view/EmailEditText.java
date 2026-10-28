package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Patterns;
import androidx.core.app.NotificationCompat;
import com.whoop.android.R;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"Lcom/stripe/android/view/EmailEditText;", "Lcom/stripe/android/view/StripeEditText;", "", "getEmail", "()Ljava/lang/String;", NotificationCompat.CATEGORY_EMAIL, "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class EmailEditText extends StripeEditText {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC22676k.m65750j(context, "context");
    }

    public final String getEmail() {
        String string;
        if (AbstractC39414r.m125890i0(getFieldText$payments_core_release())) {
            string = getResources().getString(R.string.stripe_becs_widget_email_required);
        } else {
            string = !Patterns.EMAIL_ADDRESS.matcher(getFieldText$payments_core_release()).matches() ? getResources().getString(R.string.stripe_becs_widget_email_invalid) : null;
        }
        setErrorMessage$payments_core_release(string);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        if (getErrorMessage() == null) {
            return fieldText$payments_core_release;
        }
        return null;
    }
}
