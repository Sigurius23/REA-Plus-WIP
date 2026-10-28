package com.whoop.p069ui;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import nf1.AbstractC26667h;
import x43.AbstractC37978j;

/* JADX INFO: loaded from: classes10.dex */
public class ProgressBar extends View {

    /* JADX INFO: renamed from: E */
    private RectF f31532E;

    /* JADX INFO: renamed from: F */
    private RectF f31533F;

    /* JADX INFO: renamed from: G */
    private RectF f31534G;

    /* JADX INFO: renamed from: H */
    private float f31535H;

    /* JADX INFO: renamed from: I */
    private Animator f31536I;

    /* JADX INFO: renamed from: w */
    private Paint f31537w;

    /* JADX INFO: renamed from: x */
    private Paint f31538x;

    /* JADX INFO: renamed from: y */
    private RectF f31539y;

    /* JADX INFO: renamed from: z */
    private RectF f31540z;

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC26667h.f106025e);
        m26650b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    private void m26650b(TypedArray typedArray) {
        setWillNotDraw(false);
        this.f31539y = new RectF();
        this.f31540z = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        this.f31532E = new RectF();
        this.f31533F = new RectF();
        this.f31534G = new RectF();
        RectF rectF = this.f31533F;
        rectF.top = 0.0f;
        rectF.bottom = 1.0f;
        Paint paint = new Paint();
        this.f31537w = paint;
        paint.setColor(-7829368);
        Paint paint2 = new Paint();
        this.f31538x = paint2;
        paint2.setColor(-16776961);
        this.f31535H = 1.25f;
        if (typedArray != null) {
            Paint paint3 = this.f31537w;
            paint3.setColor(typedArray.getColor(AbstractC26667h.f106026f, paint3.getColor()));
            Paint paint4 = this.f31538x;
            paint4.setColor(typedArray.getColor(AbstractC26667h.f106027g, paint4.getColor()));
        }
        if (isInEditMode()) {
            setLeftPercent(0.75f);
            setRightPercent(1.35f);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m26651c() {
        RectF rectF = this.f31532E;
        RectF rectF2 = this.f31539y;
        rectF.left = AbstractC37978j.m121630M(rectF2.left, rectF2.right, this.f31540z.left);
        RectF rectF3 = this.f31532E;
        RectF rectF4 = this.f31539y;
        rectF3.right = AbstractC37978j.m121630M(rectF4.left, rectF4.right, this.f31540z.right);
        RectF rectF5 = this.f31532E;
        RectF rectF6 = this.f31539y;
        rectF5.top = AbstractC37978j.m121630M(rectF6.top, rectF6.bottom, this.f31540z.top);
        RectF rectF7 = this.f31532E;
        RectF rectF8 = this.f31539y;
        rectF7.bottom = AbstractC37978j.m121630M(rectF8.top, rectF8.bottom, this.f31540z.bottom);
        m26652d();
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    private void m26652d() {
        RectF rectF = this.f31534G;
        RectF rectF2 = this.f31532E;
        rectF.left = AbstractC37978j.m121630M(rectF2.left, rectF2.right, this.f31533F.left);
        RectF rectF3 = this.f31534G;
        RectF rectF4 = this.f31532E;
        rectF3.right = AbstractC37978j.m121630M(rectF4.left, rectF4.right, this.f31533F.right);
        RectF rectF5 = this.f31534G;
        RectF rectF6 = this.f31532E;
        rectF5.top = AbstractC37978j.m121630M(rectF6.top, rectF6.bottom, this.f31533F.top);
        RectF rectF7 = this.f31534G;
        RectF rectF8 = this.f31532E;
        rectF7.bottom = AbstractC37978j.m121630M(rectF8.top, rectF8.bottom, this.f31533F.bottom);
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    private void m26653e() {
        Animator animator = this.f31536I;
        if (animator != null) {
            animator.cancel();
            this.f31536I = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m26654a() {
        setHiddenPercent(1.0f);
        m26653e();
    }

    public float getHiddenPercent() {
        return this.f31540z.top;
    }

    public float getRolloverPercent() {
        return this.f31535H;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(this.f31532E, this.f31537w);
        RectF rectF = this.f31534G;
        float f13 = rectF.left;
        float f14 = rectF.right;
        if (f13 < f14) {
            canvas.drawRect(rectF, this.f31538x);
            return;
        }
        canvas.drawRect(this.f31532E.left, rectF.top, f14, rectF.bottom, this.f31538x);
        RectF rectF2 = this.f31534G;
        canvas.drawRect(rectF2.left, rectF2.top, this.f31532E.right, rectF2.bottom, this.f31538x);
    }

    @Override // android.view.View
    public void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        this.f31539y.left = getPaddingLeft();
        this.f31539y.right = getWidth() - getPaddingRight();
        this.f31539y.top = getPaddingTop();
        this.f31539y.bottom = getHeight() - getPaddingBottom();
        m26651c();
    }

    public void setHiddenPercent(float f13) {
        this.f31540z.top = f13;
        m26651c();
    }

    public void setLeftPercent(float f13) {
        this.f31533F.left = f13 % this.f31535H;
        m26652d();
    }

    public void setRightPercent(float f13) {
        this.f31533F.right = f13 % this.f31535H;
        m26652d();
    }
}
