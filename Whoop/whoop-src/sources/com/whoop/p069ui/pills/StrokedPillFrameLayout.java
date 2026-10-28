package com.whoop.p069ui.pills;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import cn2.C4852a;
import gn2.C16008d;
import in2.AbstractC18738j;
import vu1.AbstractC36510a;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
public class StrokedPillFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: w */
    private C16008d f32245w;

    public StrokedPillFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156199i0);
        m27363a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private void m27363a(TypedArray typedArray) {
        C16008d c16008d = new C16008d(getContext());
        this.f32245w = c16008d;
        setBackground(c16008d);
        setStrokeWidth(C4852a.m15490a(getContext(), 2));
        setPillColor(AbstractC18738j.m54485c(getContext(), AbstractC36510a.f156026e));
        if (typedArray != null) {
            if (typedArray.hasValue(AbstractC36519j.f156207m0)) {
                setStrokeWidth(typedArray.getDimensionPixelSize(AbstractC36519j.f156207m0, 0));
            }
            if (typedArray.hasValue(AbstractC36519j.f156201j0)) {
                setPillColor(typedArray.getColor(AbstractC36519j.f156201j0, -1));
            }
            if (typedArray.hasValue(AbstractC36519j.f156209n0)) {
                this.f32245w.m45321i(typedArray.getBoolean(AbstractC36519j.f156209n0, true));
            }
            if (typedArray.hasValue(AbstractC36519j.f156205l0)) {
                this.f32245w.m45319g(typedArray.getBoolean(AbstractC36519j.f156205l0, false));
            }
            if (typedArray.hasValue(AbstractC36519j.f156203k0)) {
                this.f32245w.m45318f(typedArray.getColor(AbstractC36519j.f156203k0, 0));
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f32245w.m45315b(i14);
    }

    public void setPillColor(int i13) {
        this.f32245w.m45317d(i13);
    }

    public void setPillStrokeColor(int i13) {
        this.f32245w.m45318f(i13);
        super.refreshDrawableState();
    }

    public void setStrokeWidth(float f13) {
        this.f32245w.m45320h(f13);
    }
}
