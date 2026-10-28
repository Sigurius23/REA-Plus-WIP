package com.google.android.material.textfield;

/* JADX INFO: renamed from: com.google.android.material.textfield.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC5035a0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21187w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f21188x;

    public /* synthetic */ RunnableC5035a0(Object obj, int i13) {
        this.f21187w = i13;
        this.f21188x = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21187w) {
            case 0:
                ((TextInputLayout) this.f21188x).f21183z.requestLayout();
                break;
            case 1:
                ((C5042e) this.f21188x).m15846s(true);
                break;
            default:
                C5053l c5053l = (C5053l) this.f21188x;
                boolean zIsPopupShowing = c5053l.f21222h.isPopupShowing();
                c5053l.m15855s(zIsPopupShowing);
                c5053l.f21227m = zIsPopupShowing;
                break;
        }
    }
}
