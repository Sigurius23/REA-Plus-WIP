package er;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: er.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C13575h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f47927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f47928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C13576i f47929c;

    public C13575h(C13576i c13576i, boolean z4, int i13) {
        this.f47929c = c13576i;
        this.f47927a = z4;
        this.f47928b = i13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C13576i c13576i = this.f47929c;
        c13576i.f47914b.setTranslationX(0.0f);
        c13576i.m38318a(0.0f, this.f47928b, this.f47927a);
    }
}
