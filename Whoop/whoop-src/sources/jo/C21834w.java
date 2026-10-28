package jo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p087db.C11842c0;

/* JADX INFO: renamed from: jo.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C21834w extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f84234a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C21830s f84235b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C11842c0 f84236c;

    public /* synthetic */ C21834w(C11842c0 c11842c0, C21830s c21830s, int i13) {
        this.f84234a = i13;
        this.f84236c = c11842c0;
        this.f84235b = c21830s;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f84234a) {
            case 0:
                C11842c0 c11842c0 = this.f84236c;
                c11842c0.m31796k(1);
                if (c11842c0.f38614v) {
                    this.f84235b.post((RunnableC21831t) c11842c0.f38617y);
                    c11842c0.f38614v = false;
                }
                break;
            case 1:
                C11842c0 c11842c1 = this.f84236c;
                c11842c1.m31796k(2);
                if (c11842c1.f38614v) {
                    this.f84235b.post((RunnableC21831t) c11842c1.f38617y);
                    c11842c1.f38614v = false;
                }
                break;
            default:
                C11842c0 c11842c2 = this.f84236c;
                c11842c2.m31796k(2);
                if (c11842c2.f38614v) {
                    this.f84235b.post((RunnableC21831t) c11842c2.f38617y);
                    c11842c2.f38614v = false;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f84234a) {
            case 0:
                this.f84236c.m31796k(3);
                break;
            case 1:
                this.f84236c.m31796k(3);
                break;
            default:
                this.f84236c.m31796k(3);
                break;
        }
    }
}
