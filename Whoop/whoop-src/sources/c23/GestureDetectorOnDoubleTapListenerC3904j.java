package c23;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import io.getstream.photoview.PhotoView;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c23.j */
/* JADX INFO: loaded from: classes3.dex */
public final class GestureDetectorOnDoubleTapListenerC3904j implements GestureDetector.OnDoubleTapListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ViewOnTouchListenerC3909o f15953w;

    public GestureDetectorOnDoubleTapListenerC3904j(ViewOnTouchListenerC3909o viewOnTouchListenerC3909o) {
        this.f15953w = viewOnTouchListenerC3909o;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c A[Catch: ArrayIndexOutOfBoundsException -> 0x0031, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0031, blocks: (B:3:0x0008, B:5:0x001a, B:8:0x0022, B:10:0x0028, B:11:0x002c), top: B:15:0x0008 }] */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent ev3) {
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f15953w;
        AbstractC22676k.m65750j(ev3, "ev");
        try {
            float fM11893d = viewOnTouchListenerC3909o.m11893d();
            float x3 = ev3.getX();
            float y13 = ev3.getY();
            float f13 = viewOnTouchListenerC3909o.f15967E;
            if (fM11893d < f13) {
                viewOnTouchListenerC3909o.m11894e(f13, x3, y13, true);
            } else if (fM11893d >= f13) {
                float f14 = viewOnTouchListenerC3909o.f15968F;
                if (fM11893d < f14) {
                    viewOnTouchListenerC3909o.m11894e(f14, x3, y13, true);
                } else {
                    viewOnTouchListenerC3909o.m11894e(viewOnTouchListenerC3909o.f15990z, x3, y13, true);
                }
            } else {
                viewOnTouchListenerC3909o.m11894e(viewOnTouchListenerC3909o.f15990z, x3, y13, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent e5) {
        AbstractC22676k.m65750j(e5, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent e5) {
        AbstractC22676k.m65750j(e5, "e");
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f15953w;
        PhotoView photoView = viewOnTouchListenerC3909o.f15987w;
        View.OnClickListener onClickListener = viewOnTouchListenerC3909o.f15978P;
        if (onClickListener != null) {
            onClickListener.onClick(photoView);
        }
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
        float x3 = e5.getX();
        float y13 = e5.getY();
        if (rectF == null || !rectF.contains(x3, y13)) {
            return false;
        }
        rectF.width();
        rectF.height();
        return true;
    }
}
