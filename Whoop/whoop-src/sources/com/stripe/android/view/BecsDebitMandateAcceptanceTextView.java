package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import gm.C15982j;
import j93.InterfaceC21493z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import s40.C32150g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "<set-?>", "x", "Lf93/d;", "getCompanyName", "()Ljava/lang/String;", "setCompanyName", "(Ljava/lang/String;)V", "companyName", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class BecsDebitMandateAcceptanceTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ InterfaceC21493z[] f22470y = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(BecsDebitMandateAcceptanceTextView.class, "companyName", "getCompanyName()Ljava/lang/String;", 0))};

    /* JADX INFO: renamed from: w */
    public final C15982j f22471w;

    /* JADX INFO: renamed from: x */
    public final C32150g f22472x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        AbstractC22676k.m65750j(context, "context");
        this.f22471w = new C15982j(context, (byte) 0);
        setMovementMethod(LinkMovementMethod.getInstance());
        this.f22472x = new C32150g(this);
    }

    public final String getCompanyName() {
        return (String) this.f22472x.getValue(this, f22470y[0]);
    }

    public final void setCompanyName(String str) {
        AbstractC22676k.m65750j(str, "<set-?>");
        this.f22472x.setValue(this, f22470y[0], str);
    }
}
