package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import m30.C24989e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "3ds2sdk_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class ThreeDS2HeaderTextView extends ThreeDS2TextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    @Override // com.stripe.android.stripe3ds2.views.ThreeDS2TextView
    /* JADX INFO: renamed from: d */
    public final void mo16881d(String str, C24989e c24989e) {
        setText(str);
        if (c24989e != null) {
            String str2 = c24989e.f97789z;
            if (str2 != null) {
                setTextColor(Color.parseColor(str2));
            }
            Integer numValueOf = Integer.valueOf(c24989e.f97788F);
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                setTextSize(2, numValueOf.intValue());
            }
            String str3 = c24989e.f97787E;
            if (str3 != null) {
                setTypeface(Typeface.create(str3, 0));
            }
        }
    }
}
