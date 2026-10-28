package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p184h5.ViewTreeObserverOnPreDrawListenerC16921w;

/* JADX INFO: renamed from: androidx.fragment.app.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC1347t0 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: E */
    public boolean f5802E;

    /* JADX INFO: renamed from: w */
    public final ViewGroup f5803w;

    /* JADX INFO: renamed from: x */
    public final View f5804x;

    /* JADX INFO: renamed from: y */
    public boolean f5805y;

    /* JADX INFO: renamed from: z */
    public boolean f5806z;

    public RunnableC1347t0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f5802E = true;
        this.f5803w = viewGroup;
        this.f5804x = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j7, Transformation transformation) {
        this.f5802E = true;
        if (this.f5805y) {
            return !this.f5806z;
        }
        if (!super.getTransformation(j7, transformation)) {
            this.f5805y = true;
            ViewTreeObserverOnPreDrawListenerC16921w.m47614a(this.f5803w, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4 = this.f5805y;
        ViewGroup viewGroup = this.f5803w;
        if (z4 || !this.f5802E) {
            viewGroup.endViewTransition(this.f5804x);
            this.f5806z = true;
        } else {
            this.f5802E = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j7, Transformation transformation, float f13) {
        this.f5802E = true;
        if (this.f5805y) {
            return !this.f5806z;
        }
        if (!super.getTransformation(j7, transformation, f13)) {
            this.f5805y = true;
            ViewTreeObserverOnPreDrawListenerC16921w.m47614a(this.f5803w, this);
        }
        return true;
    }
}
