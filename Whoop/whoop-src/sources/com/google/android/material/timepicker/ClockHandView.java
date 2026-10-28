package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.whoop.android.R;
import cr.AbstractC11075m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p184h5.AbstractC16901p0;
import p257jq.AbstractC21885a;
import p287kq.AbstractC22766a;
import p558vp.AbstractC36259c;

/* JADX INFO: loaded from: classes6.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: E */
    public final float f21343E;

    /* JADX INFO: renamed from: F */
    public final Paint f21344F;

    /* JADX INFO: renamed from: G */
    public final RectF f21345G;

    /* JADX INFO: renamed from: H */
    public final int f21346H;

    /* JADX INFO: renamed from: I */
    public float f21347I;

    /* JADX INFO: renamed from: J */
    public boolean f21348J;

    /* JADX INFO: renamed from: K */
    public double f21349K;

    /* JADX INFO: renamed from: L */
    public int f21350L;

    /* JADX INFO: renamed from: M */
    public int f21351M;

    /* JADX INFO: renamed from: w */
    public final ValueAnimator f21352w;

    /* JADX INFO: renamed from: x */
    public boolean f21353x;

    /* JADX INFO: renamed from: y */
    public final ArrayList f21354y;

    /* JADX INFO: renamed from: z */
    public final int f21355z;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f21352w = new ValueAnimator();
        this.f21354y = new ArrayList();
        Paint paint = new Paint();
        this.f21344F = paint;
        this.f21345G = new RectF();
        this.f21351M = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC21885a.f84551k, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        AbstractC36259c.m115697k0(context, R.attr.motionDurationLong2, 200);
        AbstractC36259c.m115699l0(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC22766a.f89673b);
        this.f21350L = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f21355z = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f21346H = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f21343E = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m15916b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final int m15915a(int i13) {
        return i13 == 2 ? Math.round(this.f21350L * 0.66f) : this.f21350L;
    }

    /* JADX INFO: renamed from: b */
    public final void m15916b(float f13) {
        ValueAnimator valueAnimator = this.f21352w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f14 = f13 % 360.0f;
        this.f21347I = f14;
        this.f21349K = Math.toRadians(f14 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM15915a = m15915a(this.f21351M);
        float fCos = (((float) Math.cos(this.f21349K)) * fM15915a) + width;
        float fSin = (fM15915a * ((float) Math.sin(this.f21349K))) + height;
        float f15 = this.f21355z;
        this.f21345G.set(fCos - f15, fSin - f15, fCos + f15, fSin + f15);
        Iterator it = this.f21354y.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((InterfaceC5071d) it.next());
            if (Math.abs(clockFaceView.f21340Q - f14) > 0.001f) {
                clockFaceView.f21340Q = f14;
                clockFaceView.m15914j();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iM15915a = m15915a(this.f21351M);
        float f13 = width;
        float f14 = iM15915a;
        float fCos = (((float) Math.cos(this.f21349K)) * f14) + f13;
        float f15 = height;
        float fSin = (f14 * ((float) Math.sin(this.f21349K))) + f15;
        Paint paint = this.f21344F;
        paint.setStrokeWidth(0.0f);
        int i13 = this.f21355z;
        canvas.drawCircle(fCos, fSin, i13, paint);
        double dSin = Math.sin(this.f21349K);
        double d3 = iM15915a - i13;
        paint.setStrokeWidth(this.f21346H);
        canvas.drawLine(f13, f15, width + ((int) (Math.cos(this.f21349K) * d3)), height + ((int) (d3 * dSin)), paint);
        canvas.drawCircle(f13, f15, this.f21343E, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i13, int i14, int i15, int i16) {
        super.onLayout(z4, i13, i14, i15, i16);
        if (this.f21352w.isRunning()) {
            return;
        }
        m15916b(this.f21347I);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z13;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y13 = motionEvent.getY();
        boolean z14 = false;
        if (actionMasked == 0) {
            this.f21348J = false;
            z4 = true;
            z13 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z13 = this.f21348J;
            if (this.f21353x) {
                this.f21351M = ((float) Math.hypot((double) (x3 - ((float) (getWidth() / 2))), (double) (y13 - ((float) (getHeight() / 2))))) <= ((float) m15915a(2)) + AbstractC11075m.m29870d(getContext(), 12) ? 2 : 1;
            }
            z4 = false;
        } else {
            z13 = false;
            z4 = false;
        }
        boolean z15 = this.f21348J;
        int degrees = (int) Math.toDegrees(Math.atan2(y13 - (getHeight() / 2), x3 - (getWidth() / 2)));
        int i13 = degrees + 90;
        if (i13 < 0) {
            i13 = degrees + 450;
        }
        float f13 = i13;
        boolean z16 = this.f21347I != f13;
        if (z4 && z16) {
            z14 = true;
        } else if (z16 || z13) {
            m15916b(f13);
            z14 = true;
        }
        this.f21348J = z15 | z14;
        return true;
    }
}
