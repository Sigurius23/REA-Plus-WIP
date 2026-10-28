package c23;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import io.getstream.photoview.PhotoView;
import p715kotlin.jvm.internal.AbstractC22676k;
import ro.C31624i;

/* JADX INFO: renamed from: c23.o */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC3909o implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: H */
    public boolean f15970H;

    /* JADX INFO: renamed from: I */
    public final GestureDetector f15971I;

    /* JADX INFO: renamed from: J */
    public final C3896b f15972J;

    /* JADX INFO: renamed from: K */
    public final Matrix f15973K;

    /* JADX INFO: renamed from: L */
    public final Matrix f15974L;

    /* JADX INFO: renamed from: M */
    public final Matrix f15975M;

    /* JADX INFO: renamed from: N */
    public final RectF f15976N;

    /* JADX INFO: renamed from: O */
    public final float[] f15977O;

    /* JADX INFO: renamed from: P */
    public View.OnClickListener f15978P;

    /* JADX INFO: renamed from: Q */
    public View.OnLongClickListener f15979Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC3902h f15980R;

    /* JADX INFO: renamed from: S */
    public RunnableC3906l f15981S;

    /* JADX INFO: renamed from: T */
    public int f15982T;

    /* JADX INFO: renamed from: U */
    public int f15983U;

    /* JADX INFO: renamed from: V */
    public boolean f15984V;

    /* JADX INFO: renamed from: W */
    public ImageView.ScaleType f15985W;

    /* JADX INFO: renamed from: X */
    public final C31624i f15986X;

    /* JADX INFO: renamed from: w */
    public final PhotoView f15987w;

    /* JADX INFO: renamed from: x */
    public final AccelerateDecelerateInterpolator f15988x = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: y */
    public int f15989y = 200;

    /* JADX INFO: renamed from: z */
    public float f15990z = 1.0f;

    /* JADX INFO: renamed from: E */
    public float f15967E = 1.75f;

    /* JADX INFO: renamed from: F */
    public float f15968F = 3.0f;

    /* JADX INFO: renamed from: G */
    public boolean f15969G = true;

    public ViewOnTouchListenerC3909o(PhotoView photoView) {
        this.f15987w = photoView;
        GestureDetector gestureDetector = new GestureDetector(photoView.getContext(), new C3908n(this, 0));
        this.f15971I = gestureDetector;
        this.f15973K = new Matrix();
        this.f15974L = new Matrix();
        this.f15975M = new Matrix();
        this.f15976N = new RectF();
        this.f15977O = new float[9];
        this.f15982T = 2;
        this.f15983U = 2;
        this.f15984V = true;
        this.f15985W = ImageView.ScaleType.FIT_CENTER;
        C31624i c31624i = new C31624i(this, 11);
        this.f15986X = c31624i;
        photoView.setOnTouchListener(this);
        photoView.addOnLayoutChangeListener(this);
        if (photoView.isInEditMode()) {
            return;
        }
        Context context = photoView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        this.f15972J = new C3896b(context, c31624i);
        gestureDetector.setOnDoubleTapListener(new GestureDetectorOnDoubleTapListenerC3904j(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m11890a() {
        if (m11891b()) {
            this.f15987w.setImageMatrix(m11892c());
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m11891b() {
        RectF rectF;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        Matrix matrixM11892c = m11892c();
        PhotoView photoView = this.f15987w;
        Drawable drawable = photoView.getDrawable();
        float f18 = 0.0f;
        if (drawable != null) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            rectF = this.f15976N;
            rectF.set(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
            matrixM11892c.mapRect(rectF);
        } else {
            rectF = null;
        }
        if (rectF == null) {
            return false;
        }
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        float height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        if (fHeight <= height) {
            int i13 = AbstractC3907m.f15964a[this.f15985W.ordinal()];
            if (i13 != 2) {
                if (i13 != 3) {
                    f16 = (height - fHeight) / 2;
                    f17 = rectF.top;
                } else {
                    f16 = height - fHeight;
                    f17 = rectF.top;
                }
                f13 = f16 - f17;
            } else {
                f13 = -rectF.top;
            }
            this.f15983U = 2;
        } else {
            float f19 = rectF.top;
            if (f19 > 0.0f) {
                this.f15983U = 0;
                f13 = -f19;
            } else {
                float f24 = rectF.bottom;
                if (f24 < height) {
                    this.f15983U = 1;
                    f13 = height - f24;
                } else {
                    this.f15983U = -1;
                    f13 = 0.0f;
                }
            }
        }
        float width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        if (fWidth <= width) {
            int i14 = AbstractC3907m.f15964a[this.f15985W.ordinal()];
            if (i14 != 2) {
                if (i14 != 3) {
                    f14 = (width - fWidth) / 2;
                    f15 = rectF.left;
                } else {
                    f14 = width - fWidth;
                    f15 = rectF.left;
                }
                f18 = f14 - f15;
            } else {
                f18 = -rectF.left;
            }
            this.f15982T = 2;
        } else {
            float f25 = rectF.left;
            if (f25 > 0.0f) {
                this.f15982T = 0;
                f18 = -f25;
            } else {
                float f26 = rectF.right;
                if (f26 < width) {
                    f18 = width - f26;
                    this.f15982T = 1;
                } else {
                    this.f15982T = -1;
                }
            }
        }
        this.f15975M.postTranslate(f18, f13);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final Matrix m11892c() {
        Matrix matrix = this.f15973K;
        Matrix matrix2 = this.f15974L;
        matrix2.set(matrix);
        matrix2.postConcat(this.f15975M);
        return matrix2;
    }

    /* JADX INFO: renamed from: d */
    public final float m11893d() {
        Matrix matrix = this.f15975M;
        float[] fArr = this.f15977O;
        matrix.getValues(fArr);
        float fPow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    /* JADX INFO: renamed from: e */
    public final void m11894e(float f13, float f14, float f15, boolean z4) {
        if (f13 < this.f15990z || f13 > this.f15968F) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z4) {
            this.f15987w.post(new RunnableC3905k(this, m11893d(), f13, f14, f15));
        } else {
            this.f15975M.setScale(f13, f13, f14, f15);
            m11890a();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11895f() {
        boolean z4 = this.f15984V;
        PhotoView photoView = this.f15987w;
        if (z4) {
            m11896g(photoView.getDrawable());
            return;
        }
        Matrix matrix = this.f15975M;
        matrix.reset();
        matrix.postRotate(0.0f % 360);
        m11890a();
        photoView.setImageMatrix(m11892c());
        m11891b();
    }

    /* JADX INFO: renamed from: g */
    public final void m11896g(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        PhotoView photoView = this.f15987w;
        float width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
        float height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f15973K;
        matrix.reset();
        float f13 = intrinsicWidth;
        float f14 = width / f13;
        float f15 = intrinsicHeight;
        float f16 = height / f15;
        ImageView.ScaleType scaleType = this.f15985W;
        int[] iArr = AbstractC3907m.f15964a;
        int i13 = iArr[scaleType.ordinal()];
        if (i13 == 5) {
            matrix.postTranslate((width - f13) / 2.0f, (height - f15) / 2.0f);
        } else if (i13 == 6) {
            if (f14 < f16) {
                f14 = f16;
            }
            matrix.postScale(f14, f14);
            matrix.postTranslate((width - (f13 * f14)) / 2.0f, (height - (f15 * f14)) / 2.0f);
        } else if (i13 != 7) {
            RectF rectF = new RectF(0.0f, 0.0f, f13, f15);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f15, f13);
            }
            int i14 = iArr[this.f15985W.ordinal()];
            if (i14 == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i14 == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i14 == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i14 == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        } else {
            if (f14 > f16) {
                f14 = f16;
            }
            if (1.0f <= f14) {
                f14 = 1.0f;
            }
            matrix.postScale(f14, f14);
            matrix.postTranslate((width - (f13 * f14)) / 2.0f, (height - (f15 * f14)) / 2.0f);
        }
        Matrix matrix2 = this.f15975M;
        matrix2.reset();
        matrix2.postRotate(0.0f % 360);
        m11890a();
        photoView.setImageMatrix(m11892c());
        m11891b();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v13, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        AbstractC22676k.m65750j(v13, "v");
        if (i13 == i17 && i14 == i18 && i15 == i19 && i16 == i24) {
            return;
        }
        m11896g(this.f15987w.getDrawable());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x0101  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v13, MotionEvent ev3) {
        boolean z4;
        C3896b c3896b;
        ScaleGestureDetector scaleGestureDetector;
        boolean zIsInProgress;
        boolean z13;
        boolean z14;
        boolean z15;
        AbstractC22676k.m65750j(v13, "v");
        AbstractC22676k.m65750j(ev3, "ev");
        boolean z16 = false;
        if (!this.f15984V || ((ImageView) v13).getDrawable() == null) {
            return false;
        }
        int action = ev3.getAction();
        RectF rectF = null;
        if (action != 0) {
            if (action == 1 || action == 3) {
                float fM11893d = m11893d();
                float f13 = this.f15990z;
                PhotoView photoView = this.f15987w;
                RectF rectF2 = this.f15976N;
                if (fM11893d < f13) {
                    m11891b();
                    Matrix matrixM11892c = m11892c();
                    Drawable drawable = photoView.getDrawable();
                    if (drawable != null) {
                        rectF2.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        matrixM11892c.mapRect(rectF2);
                        rectF = rectF2;
                    }
                    if (rectF != null) {
                        RectF rectF3 = rectF;
                        v13.post(new RunnableC3905k(this, m11893d(), this.f15990z, rectF3.centerX(), rectF3.centerY()));
                        z4 = true;
                    }
                } else if (m11893d() > this.f15968F) {
                    m11891b();
                    Matrix matrixM11892c2 = m11892c();
                    Drawable drawable2 = photoView.getDrawable();
                    if (drawable2 != null) {
                        rectF2.set(0.0f, 0.0f, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
                        matrixM11892c2.mapRect(rectF2);
                        rectF = rectF2;
                    }
                    if (rectF != null) {
                        RectF rectF4 = rectF;
                        v13.post(new RunnableC3905k(this, m11893d(), this.f15968F, rectF4.centerX(), rectF4.centerY()));
                        z4 = true;
                    }
                }
            }
            c3896b = this.f15972J;
            if (c3896b != null) {
                scaleGestureDetector = c3896b.f15946d;
                zIsInProgress = scaleGestureDetector.isInProgress();
                z13 = c3896b.f15948f;
                try {
                    scaleGestureDetector.onTouchEvent(ev3);
                    c3896b.m11889a(ev3);
                } catch (IllegalArgumentException unused) {
                }
                if (!zIsInProgress || scaleGestureDetector.isInProgress()) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                if (!z13 || c3896b.f15948f) {
                    z15 = false;
                } else {
                    z15 = true;
                }
                if (z14 && z15) {
                    z16 = true;
                }
                this.f15970H = z16;
                z4 = true;
            }
            if (this.f15971I.onTouchEvent(ev3)) {
                return true;
            }
            return z4;
        }
        ViewParent parent = v13.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        RunnableC3906l runnableC3906l = this.f15981S;
        if (runnableC3906l != null) {
            runnableC3906l.f15960w.forceFinished(true);
            this.f15981S = null;
        }
        z4 = false;
        c3896b = this.f15972J;
        if (c3896b != null) {
            scaleGestureDetector = c3896b.f15946d;
            zIsInProgress = scaleGestureDetector.isInProgress();
            z13 = c3896b.f15948f;
            scaleGestureDetector.onTouchEvent(ev3);
            c3896b.m11889a(ev3);
            if (zIsInProgress) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (z13) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (z14) {
                z16 = true;
            }
            this.f15970H = z16;
            z4 = true;
        }
        if (this.f15971I.onTouchEvent(ev3)) {
            return true;
        }
        return z4;
    }
}
