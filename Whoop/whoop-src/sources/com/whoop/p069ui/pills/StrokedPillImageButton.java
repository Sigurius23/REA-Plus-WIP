package com.whoop.p069ui.pills;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageButton;
import cn2.C4852a;
import gn2.C16008d;
import in2.AbstractC18738j;
import vu1.AbstractC36510a;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
public class StrokedPillImageButton extends ImageButton {

    /* JADX INFO: renamed from: w */
    private C16008d f32246w;

    public StrokedPillImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156211o0);
        m27364a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private void m27364a(TypedArray typedArray) {
        C16008d c16008d = new C16008d(getContext());
        this.f32246w = c16008d;
        setBackground(c16008d);
        setStrokeWidth(C4852a.m15490a(getContext(), 2));
        setPillColor(AbstractC18738j.m54485c(getContext(), AbstractC36510a.f156026e));
        if (typedArray != null) {
            if (typedArray.hasValue(AbstractC36519j.f156193f0)) {
                setStrokeWidth(typedArray.getDimensionPixelSize(AbstractC36519j.f156219s0, 0));
            }
            if (typedArray.hasValue(AbstractC36519j.f156187c0)) {
                setPillColor(typedArray.getColor(AbstractC36519j.f156215q0, -1));
            }
            if (typedArray.hasValue(AbstractC36519j.f156189d0)) {
                this.f32246w.m45316c(typedArray.getFloat(AbstractC36519j.f156217r0, 0.0f));
            }
            if (typedArray.hasValue(AbstractC36519j.f156195g0)) {
                this.f32246w.m45321i(typedArray.getBoolean(AbstractC36519j.f156221t0, true));
            }
            if (typedArray.hasValue(AbstractC36519j.f156213p0)) {
                setBackgroundColor(typedArray.getColor(AbstractC36519j.f156213p0, getSolidColor()));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f32246w.m45315b(i14);
    }

    public void setPillColor(int i13) {
        this.f32246w.m45317d(i13);
    }

    public void setStrokeWidth(float f13) {
        this.f32246w.m45320h(f13);
    }
}
