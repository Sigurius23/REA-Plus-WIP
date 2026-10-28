package c23;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import p382ou.C28369o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c23.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C3908n extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15965w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f15966x;

    public /* synthetic */ C3908n(Object obj, int i13) {
        this.f15965w = i13;
        this.f15966x = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (this.f15965w) {
            case 1:
                if (motionEvent.getActionMasked() == 0) {
                    C28369o c28369o = (C28369o) this.f15966x;
                    c28369o.f114463w = true;
                    c28369o.f114464x = new PointF(motionEvent.getX(), motionEvent.getY());
                }
                return true;
            default:
                return super.onDoubleTapEvent(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent e5, float f13, float f14) {
        switch (this.f15965w) {
            case 0:
                AbstractC22676k.m65750j(e5, "e2");
                ((ViewOnTouchListenerC3909o) this.f15966x).getClass();
                return false;
            default:
                return super.onFling(motionEvent, e5, f13, f14);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e5) {
        switch (this.f15965w) {
            case 0:
                AbstractC22676k.m65750j(e5, "e");
                ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = (ViewOnTouchListenerC3909o) this.f15966x;
                View.OnLongClickListener onLongClickListener = viewOnTouchListenerC3909o.f15979Q;
                if (onLongClickListener != null) {
                    onLongClickListener.onLongClick(viewOnTouchListenerC3909o.f15987w);
                }
                break;
            default:
                super.onLongPress(e5);
                break;
        }
    }
}
