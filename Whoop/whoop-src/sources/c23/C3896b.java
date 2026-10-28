package c23;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import hn.C17508p;
import io.getstream.photoview.PhotoView;
import p715kotlin.jvm.internal.AbstractC22676k;
import ro.C31624i;

/* JADX INFO: renamed from: c23.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3896b {

    /* JADX INFO: renamed from: a */
    public final C31624i f15943a;

    /* JADX INFO: renamed from: b */
    public int f15944b = -1;

    /* JADX INFO: renamed from: c */
    public int f15945c;

    /* JADX INFO: renamed from: d */
    public final ScaleGestureDetector f15946d;

    /* JADX INFO: renamed from: e */
    public VelocityTracker f15947e;

    /* JADX INFO: renamed from: f */
    public boolean f15948f;

    /* JADX INFO: renamed from: g */
    public final float f15949g;

    /* JADX INFO: renamed from: h */
    public final float f15950h;

    /* JADX INFO: renamed from: i */
    public float f15951i;

    /* JADX INFO: renamed from: j */
    public float f15952j;

    public C3896b(Context context, C31624i c31624i) {
        this.f15943a = c31624i;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f15949g = viewConfiguration.getScaledTouchSlop();
        this.f15950h = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f15946d = new ScaleGestureDetector(context, new ScaleGestureDetectorOnScaleGestureListenerC3895a(this));
    }

    /* JADX INFO: renamed from: a */
    public final void m11889a(MotionEvent motionEvent) {
        float x3;
        float y13;
        float x5;
        float y14;
        int iRound;
        int i13;
        int iRound2;
        int i14;
        float x9;
        float y15;
        int i15;
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = (ViewOnTouchListenerC3909o) this.f15943a.f130665x;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                this.f15944b = -1;
                if (this.f15948f && this.f15947e != null) {
                    try {
                        x5 = motionEvent.getX(this.f15945c);
                    } catch (Exception unused) {
                        x5 = motionEvent.getX();
                    }
                    this.f15951i = x5;
                    try {
                        y14 = motionEvent.getY(this.f15945c);
                    } catch (Exception unused2) {
                        y14 = motionEvent.getY();
                    }
                    this.f15952j = y14;
                    VelocityTracker velocityTracker = this.f15947e;
                    AbstractC22676k.m65747g(velocityTracker);
                    velocityTracker.addMovement(motionEvent);
                    VelocityTracker velocityTracker2 = this.f15947e;
                    AbstractC22676k.m65747g(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000);
                    VelocityTracker velocityTracker3 = this.f15947e;
                    AbstractC22676k.m65747g(velocityTracker3);
                    float xVelocity = velocityTracker3.getXVelocity();
                    VelocityTracker velocityTracker4 = this.f15947e;
                    AbstractC22676k.m65747g(velocityTracker4);
                    float yVelocity = velocityTracker4.getYVelocity();
                    float fAbs = Math.abs(xVelocity);
                    float fAbs2 = Math.abs(yVelocity);
                    if (fAbs < fAbs2) {
                        fAbs = fAbs2;
                    }
                    if (fAbs >= this.f15950h) {
                        PhotoView photoView = viewOnTouchListenerC3909o.f15987w;
                        RunnableC3906l runnableC3906l = new RunnableC3906l(viewOnTouchListenerC3909o, photoView.getContext());
                        viewOnTouchListenerC3909o.f15981S = runnableC3906l;
                        int width = (photoView.getWidth() - photoView.getPaddingLeft()) - photoView.getPaddingRight();
                        int height = (photoView.getHeight() - photoView.getPaddingTop()) - photoView.getPaddingBottom();
                        int i16 = (int) (-xVelocity);
                        int i17 = (int) (-yVelocity);
                        viewOnTouchListenerC3909o.m11891b();
                        Matrix matrixM11892c = viewOnTouchListenerC3909o.m11892c();
                        RectF rectF = viewOnTouchListenerC3909o.f15976N;
                        Drawable drawable = photoView.getDrawable();
                        if (drawable != null) {
                            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                            matrixM11892c.mapRect(rectF);
                        } else {
                            rectF = null;
                        }
                        if (rectF != null) {
                            int iRound3 = Math.round(-rectF.left);
                            float f13 = width;
                            if (f13 < rectF.width()) {
                                iRound = Math.round(rectF.width() - f13);
                                i13 = 0;
                            } else {
                                iRound = iRound3;
                                i13 = iRound;
                            }
                            int iRound4 = Math.round(-rectF.top);
                            float f14 = height;
                            if (f14 < rectF.height()) {
                                iRound2 = Math.round(rectF.height() - f14);
                                i14 = 0;
                            } else {
                                iRound2 = iRound4;
                                i14 = iRound2;
                            }
                            runnableC3906l.f15961x = iRound3;
                            runnableC3906l.f15962y = iRound4;
                            if (iRound3 != iRound || iRound4 != iRound2) {
                                runnableC3906l.f15960w.fling(iRound3, iRound4, i16, i17, i13, iRound, i14, iRound2, 0, 0);
                            }
                        }
                        photoView.post(viewOnTouchListenerC3909o.f15981S);
                    }
                }
                VelocityTracker velocityTracker5 = this.f15947e;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                    this.f15947e = null;
                }
            } else if (action == 2) {
                try {
                    x9 = motionEvent.getX(this.f15945c);
                } catch (Exception unused3) {
                    x9 = motionEvent.getX();
                }
                try {
                    y15 = motionEvent.getY(this.f15945c);
                } catch (Exception unused4) {
                    y15 = motionEvent.getY();
                }
                float f15 = x9 - this.f15951i;
                float f16 = y15 - this.f15952j;
                if (!this.f15948f) {
                    this.f15948f = Math.sqrt((double) ((f16 * f16) + (f15 * f15))) >= ((double) this.f15949g);
                }
                if (this.f15948f) {
                    C3896b c3896b = viewOnTouchListenerC3909o.f15972J;
                    if (c3896b == null || !c3896b.f15946d.isInProgress()) {
                        InterfaceC3902h interfaceC3902h = viewOnTouchListenerC3909o.f15980R;
                        if (interfaceC3902h != null) {
                            PhotoView photoView2 = (PhotoView) ((C17508p) interfaceC3902h).f67738x;
                            photoView2.setAllowParentInterceptOnEdge(photoView2.getScale() == 1.0f);
                        }
                        viewOnTouchListenerC3909o.f15975M.postTranslate(f15, f16);
                        viewOnTouchListenerC3909o.m11890a();
                        ViewParent parent = viewOnTouchListenerC3909o.f15987w.getParent();
                        if (viewOnTouchListenerC3909o.f15969G && ((c3896b == null || !c3896b.f15946d.isInProgress()) && !viewOnTouchListenerC3909o.f15970H)) {
                            int i18 = viewOnTouchListenerC3909o.f15982T;
                            if ((i18 == 2 || ((i18 == 0 && f15 >= 1.0f) || ((i18 == 1 && f15 <= -1.0f) || (((i15 = viewOnTouchListenerC3909o.f15983U) == 0 && f16 >= 1.0f) || (i15 == 1 && f16 <= -1.0f))))) && parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f15951i = x9;
                    this.f15952j = y15;
                    VelocityTracker velocityTracker6 = this.f15947e;
                    if (velocityTracker6 != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.f15944b = -1;
                VelocityTracker velocityTracker7 = this.f15947e;
                if (velocityTracker7 != null) {
                    velocityTracker7.recycle();
                    this.f15947e = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f15944b) {
                    int i19 = action2 != 0 ? 0 : 1;
                    this.f15944b = motionEvent.getPointerId(i19);
                    this.f15951i = motionEvent.getX(i19);
                    this.f15952j = motionEvent.getY(i19);
                }
            }
        } else {
            this.f15944b = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.f15947e = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            try {
                x3 = motionEvent.getX(this.f15945c);
            } catch (Exception unused5) {
                x3 = motionEvent.getX();
            }
            this.f15951i = x3;
            try {
                y13 = motionEvent.getY(this.f15945c);
            } catch (Exception unused6) {
                y13 = motionEvent.getY();
            }
            this.f15952j = y13;
            this.f15948f = false;
        }
        int i24 = this.f15944b;
        this.f15945c = motionEvent.findPointerIndex(i24 != -1 ? i24 : 0);
    }
}
