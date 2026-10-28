package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.e */
/* JADX INFO: loaded from: classes5.dex */
public final class AnimationAnimationListenerC1287e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1334p2 f5588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f5589b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f5590c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1291f f5591d;

    public AnimationAnimationListenerC1287e(C1334p2 c1334p2, ViewGroup viewGroup, View view, C1291f c1291f) {
        this.f5588a = c1334p2;
        this.f5589b = viewGroup;
        this.f5590c = view;
        this.f5591d = c1291f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC22676k.m65750j(animation, "animation");
        ViewGroup viewGroup = this.f5589b;
        viewGroup.post(new RunnableC1283d(viewGroup, this.f5590c, this.f5591d, 0));
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f5588a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        AbstractC22676k.m65750j(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AbstractC22676k.m65750j(animation, "animation");
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f5588a + " has reached onAnimationStart.");
        }
    }
}
