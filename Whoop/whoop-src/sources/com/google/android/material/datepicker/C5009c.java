package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.whoop.android.R;
import io.sentry.config.AbstractC20301a;
import kr.C22786e;
import p257jq.AbstractC21885a;
import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C5009c {

    /* JADX INFO: renamed from: a */
    public final C22786e f20899a;

    /* JADX INFO: renamed from: b */
    public final C22786e f20900b;

    public C5009c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC20301a.m56325X(context, R.attr.materialCalendarStyle, C5019m.class.getCanonicalName()).data, AbstractC21885a.f84562v);
        C22786e.m65996c(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        C22786e.m65996c(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        C22786e.m65996c(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        C22786e.m65996c(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListM65695C = AbstractC22674j.m65695C(typedArrayObtainStyledAttributes, context, 7);
        this.f20899a = C22786e.m65996c(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        C22786e.m65996c(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f20900b = C22786e.m65996c(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListM65695C.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
