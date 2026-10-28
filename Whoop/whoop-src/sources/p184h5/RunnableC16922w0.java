package p184h5;

import android.animation.ValueAnimator;
import android.view.View;
import io.sentry.internal.debugmeta.C20378c;
import p444r.C30811e;
import p444r.C30820n;
import p444r.MenuC30818l;
import p444r.ViewOnKeyListenerC30812f;
import q30.C29934u0;

/* JADX INFO: renamed from: h5.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC16922w0 implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f64884E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64885w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f64886x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f64887y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f64888z;

    public RunnableC16922w0(C29934u0 c29934u0, C30811e c30811e, C30820n c30820n, MenuC30818l menuC30818l) {
        this.f64884E = c29934u0;
        this.f64886x = c30811e;
        this.f64887y = c30820n;
        this.f64888z = menuC30818l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f64885w) {
            case 0:
                C16926y0.m47618h((View) this.f64886x, (C16866d1) this.f64887y, (C20378c) this.f64888z);
                ((ValueAnimator) this.f64884E).start();
                break;
            default:
                ViewOnKeyListenerC30812f viewOnKeyListenerC30812f = (ViewOnKeyListenerC30812f) ((C29934u0) this.f64884E).f122249x;
                C30820n c30820n = (C30820n) this.f64887y;
                C30811e c30811e = (C30811e) this.f64886x;
                if (c30811e != null) {
                    viewOnKeyListenerC30812f.f127036Z = true;
                    c30811e.f127013b.m94815d(false);
                    viewOnKeyListenerC30812f.f127036Z = false;
                }
                if (c30820n.isEnabled() && c30820n.hasSubMenu()) {
                    ((MenuC30818l) this.f64888z).m94821r(c30820n, null, 4);
                    break;
                }
                break;
        }
    }

    public RunnableC16922w0(View view, C16866d1 c16866d1, C20378c c20378c, ValueAnimator valueAnimator) {
        this.f64886x = view;
        this.f64887y = c16866d1;
        this.f64888z = c20378c;
        this.f64884E = valueAnimator;
    }
}
