package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import m30.C24989e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pr.C29485a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m65681d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "Lpr/a;", "3ds2sdk_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public class ThreeDS2TextView extends C29485a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDS2TextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
    }

    /* JADX INFO: renamed from: d */
    public void mo16881d(String str, C24989e c24989e) {
        String str2;
        String str3;
        setText(str);
        if (c24989e != null && (str3 = c24989e.f97783x) != null) {
            setTextColor(Color.parseColor(str3));
        }
        if (c24989e != null) {
            int i13 = c24989e.f97784y;
            Integer numValueOf = Integer.valueOf(i13);
            if (i13 <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                setTextSize(2, numValueOf.intValue());
            }
        }
        if (c24989e == null || (str2 = c24989e.f97782w) == null) {
            return;
        }
        setTypeface(Typeface.create(str2, 0));
    }
}
