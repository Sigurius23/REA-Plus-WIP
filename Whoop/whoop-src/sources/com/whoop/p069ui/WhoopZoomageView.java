package com.whoop.p069ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import p031b9.AbstractC2875y;
import vu1.AbstractC36519j;

/* JADX INFO: loaded from: classes10.dex */
public class WhoopZoomageView extends AppCompatImageView implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: E */
    private float[] f31589E;

    /* JADX INFO: renamed from: F */
    private float[] f31590F;

    /* JADX INFO: renamed from: G */
    private float f31591G;

    /* JADX INFO: renamed from: H */
    private float f31592H;

    /* JADX INFO: renamed from: I */
    private float f31593I;

    /* JADX INFO: renamed from: J */
    private float f31594J;

    /* JADX INFO: renamed from: K */
    private final RectF f31595K;

    /* JADX INFO: renamed from: L */
    private boolean f31596L;

    /* JADX INFO: renamed from: M */
    private boolean f31597M;

    /* JADX INFO: renamed from: N */
    private boolean f31598N;

    /* JADX INFO: renamed from: O */
    private boolean f31599O;

    /* JADX INFO: renamed from: P */
    private boolean f31600P;

    /* JADX INFO: renamed from: Q */
    private boolean f31601Q;

    /* JADX INFO: renamed from: R */
    private float f31602R;

    /* JADX INFO: renamed from: S */
    private EnumC10458f f31603S;

    /* JADX INFO: renamed from: T */
    private PointF f31604T;

    /* JADX INFO: renamed from: U */
    private float f31605U;

    /* JADX INFO: renamed from: V */
    private float f31606V;

    /* JADX INFO: renamed from: W */
    private float f31607W;

    /* JADX INFO: renamed from: a0 */
    private int f31608a0;

    /* JADX INFO: renamed from: b0 */
    private ScaleGestureDetector f31609b0;

    /* JADX INFO: renamed from: c0 */
    private GestureDetector f31610c0;

    /* JADX INFO: renamed from: d0 */
    private boolean f31611d0;

    /* JADX INFO: renamed from: e0 */
    private boolean f31612e0;

    /* JADX INFO: renamed from: f0 */
    private Path f31613f0;

    /* JADX INFO: renamed from: g0 */
    private boolean f31614g0;

    /* JADX INFO: renamed from: h0 */
    private final GestureDetector.OnGestureListener f31615h0;

    /* JADX INFO: renamed from: w */
    private final int f31616w;

    /* JADX INFO: renamed from: x */
    private ImageView.ScaleType f31617x;

    /* JADX INFO: renamed from: y */
    private Matrix f31618y;

    /* JADX INFO: renamed from: z */
    private Matrix f31619z;

    /* JADX INFO: renamed from: com.whoop.ui.WhoopZoomageView$a */
    public class C10453a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final Matrix f31620a;

        /* JADX INFO: renamed from: b */
        final float[] f31621b = new float[9];

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Matrix f31622c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ float f31623d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ float f31624e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ float f31625f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ float f31626g;

        public C10453a(Matrix matrix, float f13, float f14, float f15, float f16) {
            this.f31622c = matrix;
            this.f31623d = f13;
            this.f31624e = f14;
            this.f31625f = f15;
            this.f31626g = f16;
            this.f31620a = new Matrix(WhoopZoomageView.this.getImageMatrix());
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f31620a.set(this.f31622c);
            this.f31620a.getValues(this.f31621b);
            float[] fArr = this.f31621b;
            fArr[2] = (this.f31623d * fFloatValue) + fArr[2];
            fArr[5] = (this.f31624e * fFloatValue) + fArr[5];
            fArr[0] = (this.f31625f * fFloatValue) + fArr[0];
            fArr[4] = (this.f31626g * fFloatValue) + fArr[4];
            this.f31620a.setValues(fArr);
            WhoopZoomageView.this.setImageMatrix(this.f31620a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.WhoopZoomageView$b */
    public class C10454b extends C10459g {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Matrix f31628b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10454b(Matrix matrix) {
            super(WhoopZoomageView.this, 0);
            this.f31628b = matrix;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            WhoopZoomageView.this.setImageMatrix(this.f31628b);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.WhoopZoomageView$c */
    public class C10455c implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        final float[] f31630a = new float[9];

        /* JADX INFO: renamed from: b */
        Matrix f31631b = new Matrix();

        /* JADX INFO: renamed from: c */
        final /* synthetic */ int f31632c;

        public C10455c(int i13) {
            this.f31632c = i13;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f31631b.set(WhoopZoomageView.this.getImageMatrix());
            this.f31631b.getValues(this.f31630a);
            this.f31630a[this.f31632c] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f31631b.setValues(this.f31630a);
            WhoopZoomageView.this.setImageMatrix(this.f31631b);
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.WhoopZoomageView$d */
    public class C10456d extends GestureDetector.SimpleOnGestureListener {
        public C10456d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            WhoopZoomageView.this.f31611d0 = true;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            WhoopZoomageView.this.f31612e0 = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            WhoopZoomageView.this.f31612e0 = true;
            return false;
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.WhoopZoomageView$e */
    public static /* synthetic */ class C10457e {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f31635a;

        static {
            int[] iArr = new int[EnumC10458f.values().length];
            f31635a = iArr;
            try {
                iArr[EnumC10458f.UNDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31635a[EnumC10458f.OVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31635a[EnumC10458f.ALWAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31635a[EnumC10458f.NEVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.WhoopZoomageView$f */
    public enum EnumC10458f {
        UNDER(0),
        OVER(1),
        ALWAYS(2),
        NEVER(3);


        /* JADX INFO: renamed from: id */
        final int f31636id;

        EnumC10458f(int i13) {
            this.f31636id = i13;
        }

        public static EnumC10458f fromValue(int i13) {
            for (EnumC10458f enumC10458f : values()) {
                if (enumC10458f.f31636id == i13) {
                    return enumC10458f;
                }
            }
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "unknown AutoResetMode value "));
        }
    }

    /* JADX INFO: renamed from: com.whoop.ui.WhoopZoomageView$g */
    public class C10459g implements Animator.AnimatorListener {
        public /* synthetic */ C10459g(WhoopZoomageView whoopZoomageView, int i13) {
            this();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        private C10459g() {
        }
    }

    public WhoopZoomageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31616w = 200;
        this.f31618y = new Matrix();
        this.f31619z = new Matrix();
        this.f31589E = new float[9];
        this.f31590F = null;
        this.f31591G = 0.6f;
        this.f31592H = 8.0f;
        this.f31593I = 0.6f;
        this.f31594J = 8.0f;
        this.f31595K = new RectF();
        this.f31604T = new PointF(0.0f, 0.0f);
        this.f31605U = 1.0f;
        this.f31606V = 1.0f;
        this.f31607W = 1.0f;
        this.f31608a0 = 1;
        this.f31611d0 = false;
        this.f31612e0 = false;
        this.f31613f0 = new Path();
        this.f31615h0 = new C10456d();
        init(context, attributeSet);
    }

    /* JADX INFO: renamed from: e */
    private void m26698e(int i13, float f13) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f31589E[i13], f13);
        valueAnimatorOfFloat.addUpdateListener(new C10455c(i13));
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: f */
    private void m26699f(Matrix matrix, int i13) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        Matrix matrix2 = new Matrix(getImageMatrix());
        matrix2.getValues(this.f31589E);
        float f13 = fArr[0];
        float[] fArr2 = this.f31589E;
        float f14 = f13 - fArr2[0];
        float f15 = fArr[4] - fArr2[4];
        float f16 = fArr[2] - fArr2[2];
        float f17 = fArr[5] - fArr2[5];
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C10453a(matrix2, f16, f17, f14, f15));
        valueAnimatorOfFloat.addListener(new C10454b(matrix));
        valueAnimatorOfFloat.setDuration(i13);
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: g */
    private void m26700g() {
        m26699f(this.f31619z, 200);
    }

    private float getCurrentDisplayedHeight() {
        if (getDrawable() != null) {
            return getDrawable().getIntrinsicHeight() * this.f31589E[4];
        }
        return 0.0f;
    }

    private float getCurrentDisplayedWidth() {
        if (getDrawable() != null) {
            return getDrawable().getIntrinsicWidth() * this.f31589E[0];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    private void m26701h() {
        if (getCurrentDisplayedWidth() > getWidth()) {
            RectF rectF = this.f31595K;
            if (rectF.left > 0.0f) {
                m26698e(2, 0.0f);
                return;
            } else {
                if (rectF.right < getWidth()) {
                    m26698e(2, (this.f31595K.left + getWidth()) - this.f31595K.right);
                    return;
                }
                return;
            }
        }
        RectF rectF2 = this.f31595K;
        if (rectF2.left < 0.0f) {
            m26698e(2, 0.0f);
        } else if (rectF2.right > getWidth()) {
            m26698e(2, (this.f31595K.left + getWidth()) - this.f31595K.right);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m26702i() {
        if (getCurrentDisplayedHeight() > getHeight()) {
            RectF rectF = this.f31595K;
            if (rectF.top > 0.0f) {
                m26698e(5, 0.0f);
                return;
            } else {
                if (rectF.bottom < getHeight()) {
                    m26698e(5, (this.f31595K.top + getHeight()) - this.f31595K.bottom);
                    return;
                }
                return;
            }
        }
        RectF rectF2 = this.f31595K;
        if (rectF2.top < 0.0f) {
            m26698e(5, 0.0f);
        } else if (rectF2.bottom > getHeight()) {
            m26698e(5, (this.f31595K.top + getHeight()) - this.f31595K.bottom);
        }
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.f31609b0 = new ScaleGestureDetector(context, this);
        this.f31610c0 = new GestureDetector(context, this.f31615h0);
        this.f31609b0.setQuickScaleEnabled(false);
        this.f31617x = getScaleType();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156160P0);
        this.f31597M = typedArrayObtainStyledAttributes.getBoolean(AbstractC36519j.f156183a1, true);
        this.f31596L = typedArrayObtainStyledAttributes.getBoolean(AbstractC36519j.f156180Z0, true);
        this.f31600P = typedArrayObtainStyledAttributes.getBoolean(AbstractC36519j.f156162Q0, true);
        this.f31601Q = typedArrayObtainStyledAttributes.getBoolean(AbstractC36519j.f156164R0, true);
        this.f31599O = typedArrayObtainStyledAttributes.getBoolean(AbstractC36519j.f156178Y0, false);
        this.f31598N = typedArrayObtainStyledAttributes.getBoolean(AbstractC36519j.f156170U0, true);
        this.f31591G = typedArrayObtainStyledAttributes.getFloat(AbstractC36519j.f156176X0, 0.6f);
        this.f31592H = typedArrayObtainStyledAttributes.getFloat(AbstractC36519j.f156174W0, 8.0f);
        this.f31602R = typedArrayObtainStyledAttributes.getFloat(AbstractC36519j.f156172V0, 3.0f);
        this.f31603S = EnumC10458f.fromValue(typedArrayObtainStyledAttributes.getInt(AbstractC36519j.f156166S0, EnumC10458f.UNDER.f31636id));
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC36519j.f156160P0);
        this.f31614g0 = typedArrayObtainStyledAttributes2.getBoolean(AbstractC36519j.f156168T0, false);
        m26711u();
        typedArrayObtainStyledAttributes.recycle();
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: j */
    private void m26703j() {
        if (this.f31601Q) {
            m26701h();
            m26702i();
        }
    }

    /* JADX INFO: renamed from: k */
    private float m26704k(float f13) {
        if (getCurrentDisplayedWidth() >= getWidth()) {
            float f14 = this.f31595K.left;
            if (f14 > 0.0f || f14 + f13 <= 0.0f || this.f31609b0.isInProgress()) {
                return (this.f31595K.right < ((float) getWidth()) || this.f31595K.right + f13 >= ((float) getWidth()) || this.f31609b0.isInProgress()) ? f13 : getWidth() - this.f31595K.right;
            }
            return -this.f31595K.left;
        }
        if (this.f31609b0.isInProgress()) {
            return f13;
        }
        RectF rectF = this.f31595K;
        float f15 = rectF.left;
        if (f15 < 0.0f || f15 + f13 >= 0.0f) {
            return (rectF.right > ((float) getWidth()) || this.f31595K.right + f13 <= ((float) getWidth())) ? f13 : getWidth() - this.f31595K.right;
        }
        return -f15;
    }

    /* JADX INFO: renamed from: l */
    private float m26705l(float f13) {
        if (getCurrentDisplayedHeight() >= getHeight()) {
            float f14 = this.f31595K.top;
            if (f14 > 0.0f || f14 + f13 <= 0.0f || this.f31609b0.isInProgress()) {
                return (this.f31595K.bottom < ((float) getHeight()) || this.f31595K.bottom + f13 >= ((float) getHeight()) || this.f31609b0.isInProgress()) ? f13 : getHeight() - this.f31595K.bottom;
            }
            return -this.f31595K.top;
        }
        if (this.f31609b0.isInProgress()) {
            return f13;
        }
        RectF rectF = this.f31595K;
        float f15 = rectF.top;
        if (f15 < 0.0f || f15 + f13 >= 0.0f) {
            return (rectF.bottom > ((float) getHeight()) || this.f31595K.bottom + f13 <= ((float) getHeight())) ? f13 : getHeight() - this.f31595K.bottom;
        }
        return -f15;
    }

    /* JADX INFO: renamed from: m */
    private float m26706m(float f13, float f14) {
        float fM26704k = f13 - f14;
        if (this.f31599O) {
            fM26704k = m26704k(fM26704k);
        }
        RectF rectF = this.f31595K;
        float f15 = rectF.right;
        if (f15 + fM26704k < 0.0f) {
            return -f15;
        }
        return rectF.left + fM26704k > ((float) getWidth()) ? getWidth() - this.f31595K.left : fM26704k;
    }

    /* JADX INFO: renamed from: n */
    private float m26707n(float f13, float f14) {
        float fM26705l = f13 - f14;
        if (this.f31599O) {
            fM26705l = m26705l(fM26705l);
        }
        RectF rectF = this.f31595K;
        float f15 = rectF.bottom;
        if (f15 + fM26705l < 0.0f) {
            return -f15;
        }
        return rectF.top + fM26705l > ((float) getHeight()) ? getHeight() - this.f31595K.top : fM26705l;
    }

    /* JADX INFO: renamed from: r */
    private void m26708r() {
        int i13 = C10457e.f31635a[this.f31603S.ordinal()];
        if (i13 == 1) {
            if (this.f31589E[0] < this.f31590F[0]) {
                m26712o();
                return;
            } else {
                m26703j();
                return;
            }
        }
        if (i13 == 2) {
            if (this.f31589E[0] > this.f31590F[0]) {
                m26712o();
                return;
            } else {
                m26703j();
                return;
            }
        }
        if (i13 == 3) {
            m26712o();
        } else {
            if (i13 != 4) {
                return;
            }
            m26703j();
        }
    }

    /* JADX INFO: renamed from: s */
    private void m26709s() {
        this.f31590F = new float[9];
        Matrix matrix = new Matrix(getImageMatrix());
        this.f31619z = matrix;
        matrix.getValues(this.f31590F);
        float f13 = this.f31591G;
        float f14 = this.f31590F[0];
        this.f31593I = f13 * f14;
        this.f31594J = this.f31592H * f14;
    }

    /* JADX INFO: renamed from: t */
    private void m26710t(float[] fArr) {
        if (getDrawable() != null) {
            this.f31595K.set(fArr[2], fArr[5], (getDrawable().getIntrinsicWidth() * fArr[0]) + fArr[2], (getDrawable().getIntrinsicHeight() * fArr[4]) + fArr[5]);
        }
    }

    /* JADX INFO: renamed from: u */
    private void m26711u() {
        float f13 = this.f31591G;
        float f14 = this.f31592H;
        if (f13 >= f14) {
            throw new IllegalStateException("minScale must be less than maxScale");
        }
        if (f13 < 0.0f) {
            throw new IllegalStateException("minScale must be greater than 0");
        }
        if (f14 < 0.0f) {
            throw new IllegalStateException("maxScale must be greater than 0");
        }
        if (this.f31602R > f14) {
            this.f31602R = f14;
        }
        if (this.f31602R < f13) {
            this.f31602R = f13;
        }
    }

    public boolean getAnimateOnReset() {
        return this.f31600P;
    }

    public boolean getAutoCenter() {
        return this.f31601Q;
    }

    public EnumC10458f getAutoResetMode() {
        return this.f31603S;
    }

    public float getCurrentScaleFactor() {
        return this.f31607W;
    }

    public boolean getDoubleTapToZoom() {
        return this.f31598N;
    }

    public float getDoubleTapToZoomScaleFactor() {
        return this.f31602R;
    }

    public boolean getRestrictBounds() {
        return this.f31599O;
    }

    /* JADX INFO: renamed from: o */
    public void m26712o() {
        m26713p(this.f31600P);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f31614g0) {
            canvas.clipPath(this.f31613f0);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.f31605U;
        float f13 = this.f31589E[0];
        float f14 = scaleFactor / f13;
        this.f31606V = f14;
        float f15 = f14 * f13;
        float f16 = this.f31593I;
        if (f15 < f16) {
            this.f31606V = f16 / f13;
        } else {
            float f17 = this.f31594J;
            if (f15 > f17) {
                this.f31606V = f17 / f13;
            }
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f31605U = this.f31589E[0];
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f31606V = 1.0f;
    }

    @Override // android.view.View
    public void onSizeChanged(int i13, int i14, int i15, int i16) {
        this.f31613f0.reset();
        float f13 = i13 / 2;
        this.f31613f0.addCircle(f13, i14 / 2, f13, Path.Direction.CW);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isClickable() || !isEnabled() || (!this.f31597M && !this.f31596L)) {
            return super.onTouchEvent(motionEvent);
        }
        ImageView.ScaleType scaleType = getScaleType();
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
        if (scaleType != scaleType2) {
            super.setScaleType(scaleType2);
        }
        if (this.f31590F == null) {
            m26709s();
        }
        this.f31618y.set(getImageMatrix());
        this.f31618y.getValues(this.f31589E);
        m26710t(this.f31589E);
        this.f31609b0.onTouchEvent(motionEvent);
        this.f31610c0.onTouchEvent(motionEvent);
        if (this.f31598N && this.f31611d0) {
            this.f31611d0 = false;
            this.f31612e0 = false;
            if (this.f31589E[0] != this.f31590F[0]) {
                m26712o();
            } else {
                Matrix matrix = new Matrix(this.f31618y);
                float f13 = this.f31602R;
                matrix.postScale(f13, f13, this.f31609b0.getFocusX(), this.f31609b0.getFocusY());
                m26699f(matrix, 200);
            }
            return true;
        }
        if (!this.f31612e0) {
            if (motionEvent.getActionMasked() == 0 || motionEvent.getPointerCount() != this.f31608a0) {
                this.f31604T.set(this.f31609b0.getFocusX(), this.f31609b0.getFocusY());
            } else if (motionEvent.getActionMasked() == 2) {
                float focusX = this.f31609b0.getFocusX();
                float focusY = this.f31609b0.getFocusY();
                if (this.f31596L) {
                    this.f31618y.postTranslate(m26706m(focusX, this.f31604T.x), m26707n(focusY, this.f31604T.y));
                }
                if (this.f31597M) {
                    Matrix matrix2 = this.f31618y;
                    float f14 = this.f31606V;
                    matrix2.postScale(f14, f14, focusX, focusY);
                    this.f31607W = this.f31589E[0] / this.f31590F[0];
                }
                setImageMatrix(this.f31618y);
                this.f31604T.set(focusX, focusY);
            }
            if (motionEvent.getActionMasked() == 1) {
                this.f31606V = 1.0f;
                m26708r();
            }
        }
        this.f31608a0 = motionEvent.getPointerCount();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m26713p(boolean z4) {
        if (z4) {
            m26700g();
        } else {
            setImageMatrix(this.f31619z);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m26714q() {
        this.f31590F = null;
    }

    public void setAnimateOnReset(boolean z4) {
        this.f31600P = z4;
    }

    public void setAutoCenter(boolean z4) {
        this.f31601Q = z4;
    }

    public void setAutoResetMode(EnumC10458f enumC10458f) {
        this.f31603S = enumC10458f;
    }

    public void setDoubleTapToZoom(boolean z4) {
        this.f31598N = z4;
    }

    public void setDoubleTapToZoomScaleFactor(float f13) {
        this.f31602R = f13;
        m26711u();
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        if (z4) {
            return;
        }
        setScaleType(this.f31617x);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        setScaleType(this.f31617x);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setScaleType(this.f31617x);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i13) {
        super.setImageResource(i13);
        setScaleType(this.f31617x);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setScaleType(this.f31617x);
    }

    public void setRestrictBounds(boolean z4) {
        this.f31599O = z4;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            super.setScaleType(scaleType);
            this.f31617x = scaleType;
            this.f31590F = null;
        }
    }

    public void setTranslatable(boolean z4) {
        this.f31596L = z4;
    }

    public void setZoomable(boolean z4) {
        this.f31597M = z4;
    }
}
