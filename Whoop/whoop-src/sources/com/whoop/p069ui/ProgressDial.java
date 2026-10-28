package com.whoop.p069ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.Keep;
import in2.AbstractC18738j;
import vu1.AbstractC36510a;
import vu1.AbstractC36511b;
import vu1.AbstractC36515f;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
public class ProgressDial extends View {

    /* JADX INFO: renamed from: E */
    private Paint f31541E;

    /* JADX INFO: renamed from: F */
    private int f31542F;

    /* JADX INFO: renamed from: G */
    private int f31543G;

    /* JADX INFO: renamed from: H */
    private boolean f31544H;

    /* JADX INFO: renamed from: I */
    private boolean f31545I;

    /* JADX INFO: renamed from: J */
    protected RectF f31546J;

    /* JADX INFO: renamed from: K */
    protected float f31547K;

    /* JADX INFO: renamed from: L */
    private float f31548L;

    /* JADX INFO: renamed from: M */
    private float f31549M;

    /* JADX INFO: renamed from: N */
    protected float f31550N;

    /* JADX INFO: renamed from: O */
    private float f31551O;

    /* JADX INFO: renamed from: P */
    private Matrix f31552P;

    /* JADX INFO: renamed from: Q */
    private boolean f31553Q;

    /* JADX INFO: renamed from: R */
    private Paint f31554R;

    /* JADX INFO: renamed from: w */
    private Paint f31555w;

    /* JADX INFO: renamed from: x */
    private Paint f31556x;

    /* JADX INFO: renamed from: y */
    private Paint f31557y;

    /* JADX INFO: renamed from: z */
    private Paint f31558z;

    public ProgressDial(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31544H = true;
        this.f31545I = false;
        this.f31553Q = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156230y);
        m26655a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    private void m26655a(TypedArray typedArray) {
        this.f31546J = new RectF();
        Paint paint = new Paint();
        this.f31555w = paint;
        paint.setFlags(1);
        Paint paint2 = this.f31555w;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f31556x = paint3;
        paint3.setFlags(1);
        this.f31556x.setStyle(style);
        Paint paint4 = new Paint();
        this.f31541E = paint4;
        paint4.setFlags(1);
        this.f31541E.setStyle(style);
        Paint paint5 = new Paint();
        this.f31558z = paint5;
        paint5.setFlags(1);
        this.f31558z.setStyle(style);
        this.f31558z.setColor(getResources().getColor(AbstractC36510a.f156042u));
        this.f31558z.setStrokeWidth(10.0f);
        Paint paint6 = new Paint();
        this.f31554R = paint6;
        paint6.setFlags(1);
        this.f31554R.setStyle(style);
        this.f31554R.setColor(getResources().getColor(AbstractC36510a.f156046y));
        this.f31554R.setStrokeWidth(10.0f);
        this.f31552P = new Matrix();
        if (isInEditMode()) {
            this.f31549M = 0.63f;
            this.f31550N = 0.7f;
            setFillColor(Color.rgb(0, 147, 231));
            setEmptyColor(Color.rgb(39, 51, 58));
            setThickness(TypedValue.applyDimension(1, 3.0f, getResources().getDisplayMetrics()));
            setGapLength(5.0f);
        } else {
            setThickness(getResources().getDimension(AbstractC36511b.f156055h));
            setGapLength(getResources().getInteger(AbstractC36515f.f156110b));
            setFillColor(AbstractC18738j.m54485c(getContext(), AbstractC36510a.f156001J));
            setEmptyColor(AbstractC18738j.m54485c(getContext(), AbstractC36510a.f156002K));
        }
        if (typedArray != null) {
            setFillColor(typedArray.getColor(AbstractC36519j.f156129A, getFillColor()));
            setFillStartColor(typedArray.getColor(AbstractC36519j.f156141G, getFillColor()));
            setFillEndColor(typedArray.getColor(AbstractC36519j.f156135D, getFillColor()));
            setEmptyColor(typedArray.getColor(AbstractC36519j.f156133C, getEmptyColor()));
            setDrawEmptyArc(typedArray.getBoolean(AbstractC36519j.f156131B, this.f31544H));
            setThickness(typedArray.getDimension(AbstractC36519j.f156143H, getThickness()));
            setGapLength(typedArray.getFloat(AbstractC36519j.f156137E, getGapLength()));
            setEmptyGoalColor(typedArray.getColor(AbstractC36519j.f156145I, getEmptyGoalColor()));
            if (typedArray.hasValue(AbstractC36519j.f156232z)) {
                setBackgroundColor(typedArray.getColor(AbstractC36519j.f156232z, 0));
            }
            if (typedArray.hasValue(AbstractC36519j.f156139F)) {
                this.f31549M = typedArray.getFloat(AbstractC36519j.f156139F, 0.0f);
            }
        }
        setLayerType(1, null);
    }

    /* JADX INFO: renamed from: b */
    public void m26656b() {
        int i13 = this.f31542F;
        if (i13 == this.f31543G) {
            this.f31555w.setColor(i13);
            this.f31555w.setShader(null);
            return;
        }
        SweepGradient sweepGradient = new SweepGradient(0.0f, 0.0f, this.f31542F, this.f31543G);
        this.f31552P.reset();
        sweepGradient.getLocalMatrix(this.f31552P);
        this.f31552P.postRotate(-90.0f);
        this.f31552P.postTranslate(this.f31546J.centerX(), this.f31546J.centerY());
        sweepGradient.setLocalMatrix(this.f31552P);
        this.f31555w.setShader(sweepGradient);
    }

    /* JADX INFO: renamed from: c */
    public void m26657c() {
        if (m26658d() || this.f31553Q) {
            float f13 = this.f31547K / 2.0f;
            this.f31546J.left = getPaddingLeft() + f13 + this.f31551O;
            this.f31546J.top = getPaddingTop() + f13 + this.f31551O;
            this.f31546J.right = ((getWidth() - f13) - getPaddingRight()) - this.f31551O;
            this.f31546J.bottom = ((getHeight() - f13) - getPaddingBottom()) - this.f31551O;
        } else {
            float f14 = this.f31547K / 2.0f;
            this.f31546J.left = getPaddingLeft() + f14;
            this.f31546J.top = getPaddingTop() + f14;
            this.f31546J.right = (getWidth() - f14) - getPaddingRight();
            this.f31546J.bottom = (getHeight() - f14) - getPaddingBottom();
        }
        m26656b();
        invalidate();
    }

    /* JADX INFO: renamed from: d */
    public boolean m26658d() {
        return this.f31545I;
    }

    public boolean getDrawEmptyArc() {
        return this.f31544H;
    }

    public RectF getDrawRect() {
        return this.f31546J;
    }

    public int getEmptyColor() {
        return this.f31556x.getColor();
    }

    public int getEmptyGoalColor() {
        return this.f31541E.getColor();
    }

    public int getFillColor() {
        return this.f31555w.getColor();
    }

    public int getFillEndColor() {
        return this.f31543G;
    }

    public int getFillStartColor() {
        return this.f31542F;
    }

    public float getGapLength() {
        return this.f31548L;
    }

    public float getMeasuredInnerDiameter() {
        return ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - (this.f31547K * 2.0f);
    }

    public float getProgress() {
        return this.f31549M;
    }

    public float getThickness() {
        return this.f31547K;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f13 = this.f31550N * 360.0f;
        Paint paint = this.f31557y;
        if (paint != null) {
            canvas.drawArc(this.f31546J, 0.0f, 360.0f, true, paint);
        }
        if (this.f31549M == 0.0f) {
            if (this.f31544H) {
                canvas.drawArc(this.f31546J, -90.0f, 360.0f, false, this.f31556x);
            }
            if (m26658d()) {
                canvas.drawArc(this.f31546J, -90.0f, f13, false, this.f31541E);
            }
        } else {
            if (m26658d()) {
                canvas.drawArc(this.f31546J, -90.0f, f13, false, this.f31541E);
            }
            float f14 = this.f31549M * 360.0f;
            canvas.drawArc(this.f31546J, -90.0f, f14, false, this.f31555w);
            if (this.f31544H && !m26658d()) {
                float f15 = (1.0f - this.f31549M) * 360.0f;
                float f16 = this.f31548L;
                float f17 = f15 - (f16 * 2.0f);
                if (f17 > 0.0f) {
                    canvas.drawArc(this.f31546J, (f14 - 90.0f) + f16, f17, false, this.f31556x);
                }
            }
        }
        if (m26658d()) {
            float f18 = this.f31550N;
            float f19 = f18 * 360.0f;
            float f24 = (1.0f - f18) * 360.0f;
            float f25 = this.f31548L;
            float f26 = f24 - (2.0f * f25);
            if (f26 > 0.0f) {
                canvas.drawArc(this.f31546J, (f19 - 90.0f) + f25, f26, false, this.f31556x);
            }
            canvas.drawArc(this.f31546J, f13 - 90.0f, 1.0f, false, this.f31558z);
            if (this.f31553Q) {
                canvas.drawArc(this.f31546J, (this.f31549M * 360.0f) - 90.0f, 1.0f, false, this.f31554R);
            }
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        m26657c();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i13) {
        if (this.f31557y == null) {
            Paint paint = new Paint();
            this.f31557y = paint;
            paint.setFlags(1);
            this.f31557y.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f31557y.setStrokeWidth(this.f31547K);
        }
        this.f31557y.setColor(i13);
        invalidate();
    }

    public void setBackgroundColorResource(int i13) {
        if (i13 != 0) {
            setBackgroundColor(AbstractC18738j.m54485c(getContext(), i13));
        }
    }

    public void setDrawEmptyArc(boolean z4) {
        this.f31544H = z4;
        invalidate();
    }

    public void setDrawGoalLine(boolean z4) {
        this.f31545I = z4;
    }

    public void setEmptyColor(int i13) {
        this.f31556x.setColor(i13);
        invalidate();
    }

    public void setEmptyGoalColor(int i13) {
        this.f31541E.setColor(i13);
        invalidate();
    }

    public void setFillColor(int i13) {
        this.f31542F = i13;
        this.f31543G = i13;
        m26656b();
        invalidate();
    }

    public void setFillColorResource(int i13) {
        setFillColor(AbstractC18738j.m54485c(getContext(), i13));
    }

    public void setFillEndColor(int i13) {
        this.f31543G = i13;
        m26656b();
        invalidate();
    }

    public void setFillStartColor(int i13) {
        this.f31542F = i13;
        m26656b();
        invalidate();
    }

    public void setGapLength(float f13) {
        this.f31548L = f13;
        m26657c();
    }

    public void setGoalMargin(float f13) {
        this.f31551O = f13;
    }

    @Keep
    public void setGoalPct(float f13) {
        this.f31550N = f13;
    }

    @Keep
    public void setProgress(float f13) {
        this.f31549M = f13;
        invalidate();
    }

    public void setThickness(float f13) {
        this.f31547K = f13;
        this.f31555w.setStrokeWidth(f13);
        this.f31556x.setStrokeWidth(f13);
        this.f31558z.setStrokeWidth(f13);
        this.f31554R.setStrokeWidth(f13);
        this.f31541E.setStrokeWidth(f13);
        Paint paint = this.f31557y;
        if (paint != null) {
            paint.setStrokeWidth(f13);
        }
        m26657c();
    }

    public ProgressDial(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f31544H = true;
        this.f31545I = false;
        this.f31553Q = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156230y, i13, 0);
        m26655a(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
