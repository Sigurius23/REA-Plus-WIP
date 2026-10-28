package p377or;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: or.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C28132f implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f113770a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f113771b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C28133g f113772c;

    public C28132f(C28133g c28133g, View view, View view2) {
        this.f113772c = c28133g;
        this.f113770a = view;
        this.f113771b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f113772c.m85121c(this.f113770a, this.f113771b, valueAnimator.getAnimatedFraction());
    }
}
