package androidx.fragment.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C1291f extends AbstractC1330o2 {

    /* JADX INFO: renamed from: c */
    public final C1295g f5596c;

    public C1291f(C1295g c1295g) {
        this.f5596c = c1295g;
    }

    @Override // androidx.fragment.app.AbstractC1330o2
    /* JADX INFO: renamed from: c */
    public final void mo4081c(ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
        C1295g c1295g = this.f5596c;
        C1334p2 c1334p2 = c1295g.f5663a;
        View view = c1334p2.f5751c.mView;
        view.clearAnimation();
        container.endViewTransition(view);
        c1295g.f5663a.m4202c(this);
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Animation from operation " + c1334p2 + " has been cancelled.");
        }
    }

    @Override // androidx.fragment.app.AbstractC1330o2
    /* JADX INFO: renamed from: d */
    public final void mo4082d(ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
        C1295g c1295g = this.f5596c;
        C1334p2 c1334p2 = c1295g.f5663a;
        if (c1295g.m4119a()) {
            c1334p2.m4202c(this);
            return;
        }
        Context context = container.getContext();
        View view = c1334p2.f5751c.mView;
        AbstractC22676k.m65749i(context, "context");
        C1344s0 c1344s0M4084b = c1295g.m4084b(context);
        if (c1344s0M4084b == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = c1344s0M4084b.f5796a;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (c1334p2.f5749a != 1) {
            view.startAnimation(animation);
            c1334p2.m4202c(this);
            return;
        }
        container.startViewTransition(view);
        RunnableC1347t0 runnableC1347t0 = new RunnableC1347t0(animation, container, view);
        runnableC1347t0.setAnimationListener(new AnimationAnimationListenerC1287e(c1334p2, container, view, this));
        view.startAnimation(runnableC1347t0);
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Animation from operation " + c1334p2 + " has started.");
        }
    }
}
