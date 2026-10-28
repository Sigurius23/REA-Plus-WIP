package gi;

import android.view.ViewTreeObserver;
import bc3.C3033m;

/* JADX INFO: renamed from: gi.l */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewTreeObserverOnPreDrawListenerC15881l implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: w */
    public boolean f59999w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15875f f60000x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ViewTreeObserver f60001y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3033m f60002z;

    public ViewTreeObserverOnPreDrawListenerC15881l(C15875f c15875f, ViewTreeObserver viewTreeObserver, C3033m c3033m) {
        this.f60000x = c15875f;
        this.f60001y = viewTreeObserver;
        this.f60002z = c3033m;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C15875f c15875f = this.f60000x;
        C15878i c15878iM44782c = c15875f.m44782c();
        if (c15878iM44782c != null) {
            ViewTreeObserver viewTreeObserver = this.f60001y;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                c15875f.f59983b.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f59999w) {
                this.f59999w = true;
                this.f60002z.resumeWith(c15878iM44782c);
            }
        }
        return true;
    }
}
