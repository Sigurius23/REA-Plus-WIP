package p087db;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: db.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11840b0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C11882x f38582b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C11842c0 f38583c;

    public /* synthetic */ C11840b0(C11842c0 c11842c0, C11882x c11882x, int i13) {
        this.f38581a = i13;
        this.f38583c = c11842c0;
        this.f38582b = c11882x;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38581a) {
            case 0:
                C11842c0 c11842c0 = this.f38583c;
                c11842c0.m31796k(1);
                if (c11842c0.f38614v) {
                    this.f38582b.post((RunnableC11883y) c11842c0.f38617y);
                    c11842c0.f38614v = false;
                }
                break;
            case 1:
                C11842c0 c11842c1 = this.f38583c;
                c11842c1.m31796k(2);
                if (c11842c1.f38614v) {
                    this.f38582b.post((RunnableC11883y) c11842c1.f38617y);
                    c11842c1.f38614v = false;
                }
                break;
            default:
                C11842c0 c11842c2 = this.f38583c;
                c11842c2.m31796k(2);
                if (c11842c2.f38614v) {
                    this.f38582b.post((RunnableC11883y) c11842c2.f38617y);
                    c11842c2.f38614v = false;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f38581a) {
            case 0:
                this.f38583c.m31796k(3);
                break;
            case 1:
                this.f38583c.m31796k(3);
                break;
            default:
                this.f38583c.m31796k(3);
                break;
        }
    }
}
