package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputLayout;
import com.whoop.android.R;
import j93.InterfaceC21493z;
import p376oq.ViewOnLayoutChangeListenerC28103a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import s40.C32133a0;
import s40.C32150g;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001R+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/stripe/android/view/CardNumberTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "", "<set-?>", "f1", "Lf93/d;", "isLoading$payments_core_release", "()Z", "setLoading$payments_core_release", "(Z)V", "isLoading", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class CardNumberTextInputLayout extends TextInputLayout {

    /* JADX INFO: renamed from: g1 */
    public static final /* synthetic */ InterfaceC21493z[] f22525g1 = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(CardNumberTextInputLayout.class, "isLoading", "isLoading$payments_core_release()Z", 0))};

    /* JADX INFO: renamed from: e1 */
    public final C32133a0 f22526e1;

    /* JADX INFO: renamed from: f1 */
    public final C32150g f22527f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textInputStyle);
        AbstractC22676k.m65750j(context, "context");
        this.f22526e1 = new C32133a0(context, attributeSet);
        this.f22527f1 = new C32150g(this);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC28103a(this, 1));
        setPlaceholderText(getResources().getString(R.string.stripe_card_number_hint));
    }

    public final void setLoading$payments_core_release(boolean z4) {
        this.f22527f1.setValue(this, f22525g1[0], Boolean.valueOf(z4));
    }
}
