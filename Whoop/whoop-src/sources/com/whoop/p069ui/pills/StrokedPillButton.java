package com.whoop.p069ui.pills;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import cn2.C4852a;
import gn2.C16008d;
import in2.AbstractC18738j;
import vu1.AbstractC36510a;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
public class StrokedPillButton extends Button {

    /* JADX INFO: renamed from: w */
    private C16008d f32243w;

    /* JADX INFO: renamed from: x */
    private boolean f32244x;

    public StrokedPillButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32244x = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156185b0);
        m27361a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private void m27361a(TypedArray typedArray) {
        C16008d c16008d = new C16008d(getContext());
        this.f32243w = c16008d;
        setBackground(c16008d);
        setStrokeWidth(C4852a.m15490a(getContext(), 2));
        setPillColor(AbstractC18738j.m54485c(getContext(), AbstractC36510a.f156026e));
        if (typedArray != null) {
            if (typedArray.hasValue(AbstractC36519j.f156193f0)) {
                setStrokeWidth(typedArray.getDimensionPixelSize(AbstractC36519j.f156193f0, 0));
            }
            if (typedArray.hasValue(AbstractC36519j.f156187c0)) {
                setPillColor(typedArray.getColor(AbstractC36519j.f156187c0, -1));
            }
            if (typedArray.hasValue(AbstractC36519j.f156189d0)) {
                this.f32243w.m45316c(typedArray.getFloat(AbstractC36519j.f156189d0, 0.0f));
            }
            if (typedArray.hasValue(AbstractC36519j.f156195g0)) {
                this.f32243w.m45321i(typedArray.getBoolean(AbstractC36519j.f156195g0, true));
            }
            if (typedArray.hasValue(AbstractC36519j.f156191e0)) {
                setStrokeColor(typedArray.getColor(AbstractC36519j.f156191e0, -16777216));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m27362b(Boolean bool, int i13, int i14) {
        if (bool.booleanValue()) {
            this.f32244x = true;
            setClickable(true);
        } else {
            this.f32244x = false;
            setClickable(false);
        }
        setTextColor(getContext().getColor(i13));
        setPillColor(getContext().getColor(i14));
        this.f32243w.m45318f(getContext().getColor(i13));
    }

    @Override // android.view.View
    public void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f32243w.m45315b(i14);
    }

    public void setPillColor(int i13) {
        this.f32243w.m45317d(i13);
    }

    public void setStrokeColor(int i13) {
        this.f32243w.m45318f(i13);
    }

    public void setStrokeWidth(float f13) {
        this.f32243w.m45320h(f13);
    }
}
