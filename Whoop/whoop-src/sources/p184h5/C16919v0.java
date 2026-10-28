package p184h5;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p543v4.C35643b;

/* JADX INFO: renamed from: h5.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16919v0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C16866d1 f64875a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C16905q1 f64876b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C16905q1 f64877c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f64878d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f64879e;

    public C16919v0(C16866d1 c16866d1, C16905q1 c16905q1, C16905q1 c16905q2, int i13, View view) {
        this.f64875a = c16866d1;
        this.f64876b = c16905q1;
        this.f64877c = c16905q2;
        this.f64878d = i13;
        this.f64879e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C16866d1 c16866d1 = this.f64875a;
        AbstractC16863c1 abstractC16863c1 = c16866d1.f64800a;
        abstractC16863c1.mo47491d(animatedFraction);
        C16905q1 c16905q1 = this.f64876b;
        C16899o1 c16899o1 = c16905q1.f64864a;
        float fMo47489b = abstractC16863c1.mo47489b();
        PathInterpolator pathInterpolator = C16926y0.f64894e;
        int i13 = Build.VERSION.SDK_INT;
        AbstractC16878h1 c16875g1 = i13 >= 30 ? new C16875g1(c16905q1) : i13 >= 29 ? new C16872f1(c16905q1) : new C16869e1(c16905q1);
        for (int i14 = 1; i14 <= 256; i14 <<= 1) {
            if ((this.f64878d & i14) == 0) {
                c16875g1.mo47504c(i14, c16899o1.mo47530g(i14));
            } else {
                C35643b c35643bMo47530g = c16899o1.mo47530g(i14);
                C35643b c35643bMo47530g2 = this.f64877c.f64864a.mo47530g(i14);
                float f13 = 1.0f - fMo47489b;
                c16875g1.mo47504c(i14, C16905q1.m47595e(c35643bMo47530g, (int) (((double) ((c35643bMo47530g.f151449a - c35643bMo47530g2.f151449a) * f13)) + 0.5d), (int) (((double) ((c35643bMo47530g.f151450b - c35643bMo47530g2.f151450b) * f13)) + 0.5d), (int) (((double) ((c35643bMo47530g.f151451c - c35643bMo47530g2.f151451c) * f13)) + 0.5d), (int) (((double) ((c35643bMo47530g.f151452d - c35643bMo47530g2.f151452d) * f13)) + 0.5d)));
            }
        }
        C16926y0.m47617g(this.f64879e, c16875g1.mo47495b(), Collections.singletonList(c16866d1));
    }
}
