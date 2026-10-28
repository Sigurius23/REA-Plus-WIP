package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: androidx.fragment.app.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C1299h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f5614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f5615b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f5616c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1334p2 f5617d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1303i f5618e;

    public C1299h(ViewGroup viewGroup, View view, boolean z4, C1334p2 c1334p2, C1303i c1303i) {
        this.f5614a = viewGroup;
        this.f5615b = view;
        this.f5616c = z4;
        this.f5617d = c1334p2;
        this.f5618e = c1303i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        AbstractC22676k.m65750j(anim, "anim");
        ViewGroup viewGroup = this.f5614a;
        View viewToAnimate = this.f5615b;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z4 = this.f5616c;
        C1334p2 c1334p2 = this.f5617d;
        if (z4) {
            int i13 = c1334p2.f5749a;
            AbstractC22676k.m65749i(viewToAnimate, "viewToAnimate");
            AbstractC30802r.m94752a(i13, viewToAnimate, viewGroup);
        }
        C1303i c1303i = this.f5618e;
        c1303i.f5626c.f5663a.m4202c(c1303i);
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "Animator from operation " + c1334p2 + " has ended.");
        }
    }
}
