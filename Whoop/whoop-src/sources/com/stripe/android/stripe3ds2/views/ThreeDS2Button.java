package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import m30.AbstractC24985a;
import m30.C24988d;
import m30.InterfaceC24986b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "Lcom/google/android/material/button/MaterialButton;", "Lm30/b;", "buttonCustomization", "Ll83/a0;", "setButtonCustomization", "(Lm30/b;)V", "3ds2sdk_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public class ThreeDS2Button extends MaterialButton {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreeDS2Button(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setButtonCustomization(InterfaceC24986b buttonCustomization) {
        if (buttonCustomization == 0) {
            return;
        }
        AbstractC24985a abstractC24985a = (AbstractC24985a) buttonCustomization;
        String str = abstractC24985a.f97783x;
        if (str != null) {
            setTextColor(Color.parseColor(str));
        }
        C24988d c24988d = (C24988d) buttonCustomization;
        String str2 = c24988d.f97786z;
        if (str2 != null) {
            setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(str2)));
        }
        Integer numValueOf = Integer.valueOf(c24988d.f97785E);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            setCornerRadius(numValueOf.intValue());
        }
        Integer numValueOf2 = Integer.valueOf(abstractC24985a.f97784y);
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        if (num != null) {
            setTextSize(2, num.intValue());
        }
        String str3 = abstractC24985a.f97782w;
        if (str3 != null) {
            setTypeface(Typeface.create(str3, 0));
        }
    }

    public ThreeDS2Button(Context context, AttributeSet attributeSet, int i13) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }
}
