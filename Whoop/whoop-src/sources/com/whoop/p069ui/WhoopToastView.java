package com.whoop.p069ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;
import in2.AbstractC18738j;
import nf1.AbstractC26662c;

/* JADX INFO: loaded from: classes10.dex */
public class WhoopToastView extends TextView {

    /* JADX INFO: renamed from: w */
    private GradientDrawable f31586w;

    /* JADX INFO: renamed from: x */
    private boolean f31587x;

    public WhoopToastView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26694a();
    }

    /* JADX INFO: renamed from: a */
    private void m26694a() {
        GradientDrawable gradientDrawable = (GradientDrawable) AbstractC18738j.m54486d(getContext(), AbstractC26662c.f105979a);
        this.f31586w = gradientDrawable;
        setBackground(gradientDrawable);
    }

    public void setBackgroundColorResource(int i13) {
        if (!this.f31587x) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.f31586w.mutate();
            this.f31586w = gradientDrawable;
            setBackground(gradientDrawable);
        }
        this.f31586w.setColor(AbstractC18738j.m54485c(getContext(), i13));
    }
}
