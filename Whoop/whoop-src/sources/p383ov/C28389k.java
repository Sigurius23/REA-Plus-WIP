package p383ov;

import android.animation.Animator;
import io.sentry.android.replay.video.C20245d;
import java.util.Iterator;
import p000.AbstractC11266d;
import p157fv.C14802h;
import p157fv.InterfaceC14795a;
import p382ou.C28369o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ov.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C28389k implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28393o f114504b;

    public /* synthetic */ C28389k(C28393o c28393o, int i13) {
        this.f114503a = i13;
        this.f114504b = c28393o;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f114503a) {
        }
        AbstractC22676k.m65750j(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f114503a) {
            case 0:
                AbstractC22676k.m65750j(animator, "animator");
                C28393o c28393o = this.f114504b;
                InterfaceC14795a interfaceC14795a = c28393o.f114522K;
                if (interfaceC14795a == null) {
                    AbstractC22676k.m65757q("cameraAnimationsPlugin");
                    throw null;
                }
                ((C14802h) interfaceC14795a).m42553k(c28393o.f114550m0);
                return;
            case 1:
                AbstractC22676k.m65750j(animator, "animator");
                C28393o c28393o2 = this.f114504b;
                C20245d c20245d = c28393o2.f114561y;
                if (c20245d == null) {
                    AbstractC22676k.m65757q("gesturesManager");
                    throw null;
                }
                AbstractC22676k.m65749i((C28369o) c20245d.f76048d, "gesturesManager.standardScaleGestureDetector");
                Iterator it = c28393o2.f114529R.iterator();
                if (it.hasNext()) {
                    throw AbstractC11266d.m30454h(it);
                }
                InterfaceC14795a interfaceC14795a2 = c28393o2.f114522K;
                if (interfaceC14795a2 == null) {
                    AbstractC22676k.m65757q("cameraAnimationsPlugin");
                    throw null;
                }
                ((C14802h) interfaceC14795a2).m42553k(c28393o2.f114544g0);
                return;
            default:
                AbstractC22676k.m65750j(animator, "animator");
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0002. Please report as an issue. */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.f114503a) {
        }
        AbstractC22676k.m65750j(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f114503a) {
            case 0:
            case 1:
                AbstractC22676k.m65750j(animator, "animator");
                return;
            default:
                AbstractC22676k.m65750j(animator, "animator");
                C28393o c28393o = this.f114504b;
                C20245d c20245d = c28393o.f114561y;
                if (c20245d == null) {
                    AbstractC22676k.m65757q("gesturesManager");
                    throw null;
                }
                AbstractC22676k.m65749i((C28369o) c20245d.f76048d, "gesturesManager.standardScaleGestureDetector");
                Iterator it = c28393o.f114529R.iterator();
                if (it.hasNext()) {
                    throw AbstractC11266d.m30454h(it);
                }
                return;
        }
    }
}
