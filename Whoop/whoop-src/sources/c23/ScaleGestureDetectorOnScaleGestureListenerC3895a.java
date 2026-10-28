package c23;

import android.view.ScaleGestureDetector;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c23.a */
/* JADX INFO: loaded from: classes3.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC3895a implements ScaleGestureDetector.OnScaleGestureListener {

    /* JADX INFO: renamed from: w */
    public float f15940w;

    /* JADX INFO: renamed from: x */
    public float f15941x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3896b f15942y;

    public ScaleGestureDetectorOnScaleGestureListenerC3895a(C3896b c3896b) {
        this.f15942y = c3896b;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        AbstractC22676k.m65750j(detector, "detector");
        float scaleFactor = detector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        if (scaleFactor < 0.0f) {
            return true;
        }
        this.f15942y.f15943a.m97718z(scaleFactor, detector.getFocusX(), detector.getFocusY(), detector.getFocusX() - this.f15940w, detector.getFocusY() - this.f15941x);
        this.f15940w = detector.getFocusX();
        this.f15941x = detector.getFocusY();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        AbstractC22676k.m65750j(detector, "detector");
        this.f15940w = detector.getFocusX();
        this.f15941x = detector.getFocusY();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        AbstractC22676k.m65750j(detector, "detector");
    }
}
