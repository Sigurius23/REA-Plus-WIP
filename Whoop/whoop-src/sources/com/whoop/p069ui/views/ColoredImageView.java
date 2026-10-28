package com.whoop.p069ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import in2.AbstractC18738j;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
public class ColoredImageView extends AppCompatImageView {
    public ColoredImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156192f);
        m27395c(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: c */
    private void m27395c(TypedArray typedArray) {
        if (typedArray == null || !typedArray.hasValue(AbstractC36519j.f156194g)) {
            return;
        }
        setColor(typedArray.getColor(AbstractC36519j.f156194g, -1));
    }

    public void setColor(int i13) {
        setColorFilter(i13);
    }

    public void setColorResource(int i13) {
        setColorFilter(AbstractC18738j.m54485c(getContext(), i13));
    }
}
