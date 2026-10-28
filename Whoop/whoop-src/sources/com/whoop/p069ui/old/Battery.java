package com.whoop.p069ui.old;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import cn2.C4852a;
import kk0.C22538a;
import p479s4.AbstractC32122c;
import vu1.AbstractC36510a;
import vu1.AbstractC36519j;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes10.dex */
public class Battery extends View {

    /* JADX INFO: renamed from: E */
    private int f32221E;

    /* JADX INFO: renamed from: F */
    private int f32222F;

    /* JADX INFO: renamed from: G */
    private Paint f32223G;

    /* JADX INFO: renamed from: H */
    private Paint f32224H;

    /* JADX INFO: renamed from: I */
    private Paint f32225I;

    /* JADX INFO: renamed from: J */
    private RectF f32226J;

    /* JADX INFO: renamed from: K */
    private RectF f32227K;

    /* JADX INFO: renamed from: L */
    private RectF f32228L;

    /* JADX INFO: renamed from: M */
    private int f32229M;

    /* JADX INFO: renamed from: N */
    private byte f32230N;

    /* JADX INFO: renamed from: O */
    private int f32231O;

    /* JADX INFO: renamed from: P */
    private int f32232P;

    /* JADX INFO: renamed from: Q */
    private boolean f32233Q;

    /* JADX INFO: renamed from: w */
    private int f32234w;

    /* JADX INFO: renamed from: x */
    private int f32235x;

    /* JADX INFO: renamed from: y */
    private int f32236y;

    /* JADX INFO: renamed from: z */
    private float f32237z;

    public Battery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32223G = new Paint();
        this.f32224H = new Paint();
        this.f32225I = new Paint();
        this.f32226J = new RectF();
        this.f32227K = new RectF();
        this.f32228L = new RectF();
        this.f32230N = (byte) -1;
        this.f32221E = C4852a.m15490a(context, 56);
        this.f32222F = C4852a.m15490a(context, 18);
        int iM15490a = C4852a.m15490a(context, 2);
        this.f32236y = iM15490a;
        this.f32237z = iM15490a / 2.0f;
        this.f32223G.setStyle(Paint.Style.STROKE);
        this.f32223G.setStrokeWidth(this.f32236y);
        this.f32223G.setFlags(1);
        Paint paint = this.f32224H;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f32225I.setStyle(style);
        this.f32225I.setFlags(1);
        if (isInEditMode()) {
            setOutlineColor(-1);
            this.f32231O = -16776961;
            this.f32232P = -65536;
        } else {
            setOutlineColor(AbstractC32122c.getColor(context, AbstractC36510a.f156006O));
            this.f32231O = AbstractC32122c.getColor(context, AbstractC36510a.f156045x);
            this.f32232P = AbstractC32122c.getColor(context, AbstractC36510a.f156044w);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156181a);
        this.f32233Q = typedArrayObtainStyledAttributes.getBoolean(AbstractC36519j.f156190e, false);
        for (int i13 = 0; i13 < typedArrayObtainStyledAttributes.getIndexCount(); i13++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i13);
            if (index == AbstractC36519j.f156188d) {
                setOutlineColor(typedArrayObtainStyledAttributes.getColor(index, getOutlineColor()));
            } else if (index == AbstractC36519j.f156184b) {
                setBatteryColorBad(typedArrayObtainStyledAttributes.getColor(index, this.f32232P));
            } else if (index == AbstractC36519j.f156186c) {
                setBatteryColorGood(typedArrayObtainStyledAttributes.getColor(index, this.f32231O));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            setBatteryLevelPct((byte) 50);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m27350a() {
        RectF rectF = this.f32226J;
        float f13 = this.f32237z;
        rectF.set(f13, f13, (float) (((double) this.f32235x) - (((double) this.f32236y) * 1.5d)), this.f32234w - f13);
        RectF rectF2 = this.f32227K;
        RectF rectF3 = this.f32226J;
        rectF2.set(rectF3.right + this.f32237z, rectF3.centerY() - (this.f32234w / 10), this.f32235x, this.f32226J.centerY() + (this.f32234w / 10));
        RectF rectF4 = this.f32228L;
        RectF rectF5 = this.f32226J;
        float f14 = rectF5.left;
        float f15 = this.f32237z;
        rectF4.set((f14 + f15) - 1.0f, (rectF5.top + f15) - 1.0f, (rectF5.right - f15) + 2.0f, (rectF5.bottom - f15) + 2.0f);
        RectF rectF6 = this.f32228L;
        rectF6.right = AbstractC37978j.m121630M(rectF6.left, rectF6.right, this.f32230N / 100.0f);
    }

    private int getOutlineColor() {
        return this.f32223G.getColor();
    }

    private void setIsGoodLevel(boolean z4) {
        int i13 = z4 ? this.f32231O : this.f32232P;
        this.f32225I.setColor(i13);
        if (this.f32233Q) {
            setOutlineColor(i13);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f32230N >= 0) {
            canvas.drawRect(this.f32228L, this.f32225I);
        }
        RectF rectF = this.f32226J;
        int i13 = this.f32229M;
        canvas.drawRoundRect(rectF, i13, i13, this.f32223G);
        canvas.drawRect(this.f32227K, this.f32223G);
    }

    @Override // android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        this.f32235x = i15 - i13;
        int i17 = i16 - i14;
        this.f32234w = i17;
        this.f32229M = i17 / 8;
        m27350a();
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i13);
        int size = View.MeasureSpec.getSize(i13);
        int mode2 = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i14);
        if (mode == 1073741824) {
            this.f32235x = size;
        } else if (mode == Integer.MIN_VALUE) {
            this.f32235x = Math.min(this.f32221E, size);
        } else {
            this.f32235x = this.f32221E;
        }
        if (mode2 == 1073741824) {
            this.f32234w = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            this.f32234w = Math.min(this.f32222F, size2);
        } else {
            this.f32234w = this.f32222F;
        }
        setMeasuredDimension(this.f32235x, this.f32234w);
    }

    public void setBatteryColorBad(int i13) {
        this.f32232P = i13;
        setBatteryLevelPct(Byte.valueOf(this.f32230N));
    }

    public void setBatteryColorGood(int i13) {
        this.f32231O = i13;
        setBatteryLevelPct(Byte.valueOf(this.f32230N));
    }

    public void setBatteryLevelPct(Byte b) {
        setIsGoodLevel(!C22538a.m65131i(b.byteValue()));
        this.f32230N = b.byteValue();
        m27350a();
        invalidate();
    }

    public void setOutlineColor(int i13) {
        this.f32223G.setColor(i13);
        this.f32224H.setColor(i13);
    }

    public void setOutlineColorResource(int i13) {
        setOutlineColor(AbstractC32122c.getColor(getContext(), i13));
    }

    public void setOutlineWithFillColor(boolean z4) {
        this.f32233Q = z4;
        setBatteryLevelPct(Byte.valueOf(this.f32230N));
    }
}
