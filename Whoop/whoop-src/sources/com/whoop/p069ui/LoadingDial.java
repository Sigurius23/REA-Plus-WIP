package com.whoop.p069ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import nf1.AbstractC26663d;
import nf1.AbstractC26665f;
import nf1.AbstractC26667h;

/* JADX INFO: loaded from: classes10.dex */
public final class LoadingDial extends FrameLayout {

    /* JADX INFO: renamed from: w */
    ProgressDialLayout f31527w;

    /* JADX INFO: renamed from: x */
    TextView f31528x;

    /* JADX INFO: renamed from: y */
    TextView f31529y;

    public LoadingDial(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC26667h.f106021a);
        m26648a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private void m26648a(TypedArray typedArray) {
        LayoutInflater.from(getContext()).inflate(AbstractC26665f.f106008c, (ViewGroup) this, true);
        this.f31527w = (ProgressDialLayout) findViewById(AbstractC26663d.f105997p);
        this.f31528x = (TextView) findViewById(AbstractC26663d.f105999r);
        this.f31529y = (TextView) findViewById(AbstractC26663d.f105998q);
        if (typedArray != null) {
            CharSequence text = typedArray.getText(AbstractC26667h.f106024d);
            CharSequence text2 = typedArray.getText(AbstractC26667h.f106022b);
            if (typedArray.hasValue(AbstractC26667h.f106023c)) {
                ProgressDial progressDial = this.f31527w.getProgressDial();
                progressDial.setThickness(typedArray.getDimension(AbstractC26667h.f106023c, progressDial.getThickness()));
            }
            m26649b(text, text2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m26649b(CharSequence charSequence, CharSequence charSequence2) {
        this.f31528x.setText(charSequence);
        if (TextUtils.isEmpty(charSequence2)) {
            this.f31529y.setVisibility(8);
        } else {
            this.f31529y.setVisibility(0);
            this.f31529y.setText(charSequence2);
        }
    }

    @Keep
    public void setProgress(float f13) {
        this.f31527w.setProgress(f13);
    }
}
