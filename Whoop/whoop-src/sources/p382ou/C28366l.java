package p382ou;

import android.view.MotionEvent;

/* JADX INFO: renamed from: ou.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C28366l implements InterfaceGestureDetectorOnGestureListenerC28367m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C28368n f114452w;

    public C28366l(C28368n c28368n) {
        this.f114452w = c28368n;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C28368n c28368n = this.f114452w;
        return c28368n.mo86029b(10) && ((InterfaceGestureDetectorOnGestureListenerC28367m) c28368n.f114407h).onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        C28368n c28368n = this.f114452w;
        return c28368n.mo86029b(11) && ((InterfaceGestureDetectorOnGestureListenerC28367m) c28368n.f114407h).onDoubleTapEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C28368n c28368n = this.f114452w;
        return c28368n.mo86029b(9) && ((InterfaceGestureDetectorOnGestureListenerC28367m) c28368n.f114407h).onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
        C28368n c28368n = this.f114452w;
        return c28368n.mo86029b(7) && ((InterfaceGestureDetectorOnGestureListenerC28367m) c28368n.f114407h).onFling(motionEvent, motionEvent2, f13, f14);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C28368n c28368n = this.f114452w;
        if (c28368n.mo86029b(6)) {
            ((InterfaceGestureDetectorOnGestureListenerC28367m) c28368n.f114407h).onLongPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
        C28368n c28368n = this.f114452w;
        return c28368n.mo86029b(0) && ((InterfaceGestureDetectorOnGestureListenerC28367m) c28368n.f114407h).onScroll(motionEvent, motionEvent2, f13, f14);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        C28368n c28368n = this.f114452w;
        if (c28368n.mo86029b(8)) {
            ((InterfaceGestureDetectorOnGestureListenerC28367m) c28368n.f114407h).onShowPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C28368n c28368n = this.f114452w;
        return c28368n.mo86029b(12) && ((InterfaceGestureDetectorOnGestureListenerC28367m) c28368n.f114407h).onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C28368n c28368n = this.f114452w;
        return c28368n.mo86029b(5) && ((InterfaceGestureDetectorOnGestureListenerC28367m) c28368n.f114407h).onSingleTapUp(motionEvent);
    }
}
