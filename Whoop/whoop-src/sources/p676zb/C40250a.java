package p676zb;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: zb.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C40250a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C40252c f174042a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C40253d f174043b;

    public C40250a(C40253d c40253d, C40252c c40252c) {
        this.f174043b = c40253d;
        this.f174042a = c40252c;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C40252c c40252c = this.f174042a;
        C40253d.m129249c(fFloatValue, c40252c);
        C40253d c40253d = this.f174043b;
        c40253d.m129250a(fFloatValue, c40252c, false);
        c40253d.invalidateSelf();
    }
}
