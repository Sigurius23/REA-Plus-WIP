package com.whoop.coaching.sleepcoach.harvard.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import in2.AbstractC18738j;
import qe2.AbstractC30310c;
import qe2.AbstractC30315h;
import vu1.AbstractC36510a;

/* JADX INFO: loaded from: classes7.dex */
public class DashedLineView extends View {

    /* JADX INFO: renamed from: E */
    private float f24417E;

    /* JADX INFO: renamed from: F */
    private int f24418F;

    /* JADX INFO: renamed from: G */
    private int f24419G;

    /* JADX INFO: renamed from: H */
    private int f24420H;

    /* JADX INFO: renamed from: I */
    private int f24421I;

    /* JADX INFO: renamed from: J */
    private boolean f24422J;

    /* JADX INFO: renamed from: w */
    private Paint f24423w;

    /* JADX INFO: renamed from: x */
    private final float[] f24424x;

    /* JADX INFO: renamed from: y */
    private int f24425y;

    /* JADX INFO: renamed from: z */
    private float f24426z;

    public DashedLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24424x = new float[2];
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC30315h.f124371a);
        m18527a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private void m18527a(TypedArray typedArray) {
        setLayerType(1, null);
        Paint paint = new Paint();
        this.f24423w = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f24422J = false;
        if (isInEditMode()) {
            this.f24425y = -256;
            this.f24426z = 6.0f;
            this.f24417E = 6.0f;
        } else {
            this.f24425y = AbstractC18738j.m54485c(getContext(), AbstractC36510a.f156025d0);
            this.f24426z = getResources().getDimension(AbstractC30310c.f124026b);
            this.f24417E = getResources().getDimension(AbstractC30310c.f124025a);
        }
        if (typedArray != null) {
            this.f24425y = typedArray.getColor(AbstractC30315h.f124372b, this.f24425y);
            this.f24426z = typedArray.getDimension(AbstractC30315h.f124375e, this.f24426z);
            this.f24417E = typedArray.getDimension(AbstractC30315h.f124373c, this.f24417E);
            this.f24422J = typedArray.getBoolean(AbstractC30315h.f124374d, this.f24422J);
        }
        m18528b();
    }

    /* JADX INFO: renamed from: b */
    private void m18528b() {
        float[] fArr = this.f24424x;
        fArr[0] = this.f24426z;
        fArr[1] = this.f24417E;
        this.f24423w.setStrokeWidth(this.f24422J ? getWidth() : getHeight());
        this.f24423w.setPathEffect(new DashPathEffect(this.f24424x, 0.0f));
        this.f24423w.setColor(this.f24425y);
        if (this.f24422J) {
            int width = getWidth() / 2;
            this.f24419G = width;
            this.f24418F = width;
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f13 = this.f24426z;
            if (height > f13) {
                float f14 = this.f24417E + f13;
                float f15 = height - f13;
                float fFloor = (f15 - (((int) Math.floor(f15 / f14)) * f14)) / 2.0f;
                this.f24420H = (int) (getPaddingTop() + fFloor);
                this.f24421I = (int) ((getHeight() - getPaddingBottom()) - fFloor);
            } else {
                this.f24420H = getPaddingTop();
                this.f24421I = getHeight() - getPaddingBottom();
            }
        } else {
            int height2 = getHeight() / 2;
            this.f24421I = height2;
            this.f24420H = height2;
            float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float f16 = this.f24426z;
            if (width2 > f16) {
                float f17 = this.f24417E + f16;
                float f18 = width2 - f16;
                float fFloor2 = (f18 - (((int) Math.floor(f18 / f17)) * f17)) / 2.0f;
                this.f24418F = (int) (getPaddingLeft() + fFloor2);
                this.f24419G = (int) ((getWidth() - getPaddingRight()) - fFloor2);
            } else {
                this.f24418F = getPaddingLeft();
                this.f24419G = getWidth() - getPaddingRight();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(this.f24418F, this.f24420H, this.f24419G, this.f24421I, this.f24423w);
    }

    @Override // android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        m18528b();
    }

    public void setLineColor(int i13) {
        this.f24425y = i13;
        m18528b();
    }

    public void setLineColorResource(int i13) {
        setLineColor(getResources().getColor(i13));
    }
}
