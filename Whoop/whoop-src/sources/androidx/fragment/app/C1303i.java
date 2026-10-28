package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import p161g.C14894a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C1303i extends AbstractC1330o2 {

    /* JADX INFO: renamed from: c */
    public final C1295g f5626c;

    /* JADX INFO: renamed from: d */
    public AnimatorSet f5627d;

    public C1303i(C1295g c1295g) {
        this.f5626c = c1295g;
    }

    @Override // androidx.fragment.app.AbstractC1330o2
    /* JADX INFO: renamed from: c */
    public final void mo4081c(ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
        AnimatorSet animatorSet = this.f5627d;
        C1295g c1295g = this.f5626c;
        if (animatorSet == null) {
            c1295g.f5663a.m4202c(this);
            return;
        }
        C1334p2 c1334p2 = c1295g.f5663a;
        if (c1334p2.f5755g) {
            C1311k.f5661a.m4109a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (AbstractC1329o1.m4132M(2)) {
            StringBuilder sb4 = new StringBuilder("Animator from operation ");
            sb4.append(c1334p2);
            sb4.append(" has been canceled");
            sb4.append(c1334p2.f5755g ? " with seeking." : ".");
            sb4.append(' ');
            Log.v("FragmentManager", sb4.toString());
        }
    }

    @Override // androidx.fragment.app.AbstractC1330o2
    /* JADX INFO: renamed from: d */
    public final void mo4082d(ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
        C1334p2 c1334p2 = this.f5626c.f5663a;
        AnimatorSet animatorSet = this.f5627d;
        if (animatorSet == null) {
            c1334p2.m4202c(this);
            return;
        }
        animatorSet.start();
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Animator from operation " + c1334p2 + " has started.");
        }
    }

    @Override // androidx.fragment.app.AbstractC1330o2
    /* JADX INFO: renamed from: e */
    public final void mo4086e(C14894a c14894a, ViewGroup container) {
        AbstractC22676k.m65750j(container, "container");
        C1334p2 c1334p2 = this.f5626c.f5663a;
        AnimatorSet animatorSet = this.f5627d;
        if (animatorSet == null) {
            c1334p2.m4202c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !c1334p2.f5751c.mTransitioning) {
            return;
        }
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + c1334p2);
        }
        long jM4107a = C1307j.f5651a.m4107a(animatorSet);
        long j7 = (long) (c14894a.f55564c * jM4107a);
        if (j7 == 0) {
            j7 = 1;
        }
        if (j7 == jM4107a) {
            j7 = jM4107a - 1;
        }
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j7 + " for Animator " + animatorSet + " on operation " + c1334p2);
        }
        C1311k.f5661a.m4110b(animatorSet, j7);
    }

    @Override // androidx.fragment.app.AbstractC1330o2
    /* JADX INFO: renamed from: f */
    public final void mo4087f(ViewGroup container) {
        C1303i c1303i;
        AbstractC22676k.m65750j(container, "container");
        C1295g c1295g = this.f5626c;
        if (c1295g.m4119a()) {
            return;
        }
        Context context = container.getContext();
        AbstractC22676k.m65749i(context, "context");
        C1344s0 c1344s0M4084b = c1295g.m4084b(context);
        this.f5627d = c1344s0M4084b != null ? c1344s0M4084b.f5797b : null;
        C1334p2 c1334p2 = c1295g.f5663a;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = c1334p2.f5751c;
        boolean z4 = c1334p2.f5749a == 3;
        View view = abstractComponentCallbacksC1320m0.mView;
        container.startViewTransition(view);
        AnimatorSet animatorSet = this.f5627d;
        if (animatorSet != null) {
            c1303i = this;
            animatorSet.addListener(new C1299h(container, view, z4, c1334p2, c1303i));
        } else {
            c1303i = this;
        }
        AnimatorSet animatorSet2 = c1303i.f5627d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
