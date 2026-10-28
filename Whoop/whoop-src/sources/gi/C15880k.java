package gi;

import android.view.ViewTreeObserver;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: gi.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C15880k implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C15875f f59996w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ViewTreeObserver f59997x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC15881l f59998y;

    public C15880k(C15875f c15875f, ViewTreeObserver viewTreeObserver, ViewTreeObserverOnPreDrawListenerC15881l viewTreeObserverOnPreDrawListenerC15881l) {
        this.f59996w = c15875f;
        this.f59997x = viewTreeObserver;
        this.f59998y = viewTreeObserverOnPreDrawListenerC15881l;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewTreeObserver viewTreeObserver = this.f59997x;
        boolean zIsAlive = viewTreeObserver.isAlive();
        ViewTreeObserverOnPreDrawListenerC15881l viewTreeObserverOnPreDrawListenerC15881l = this.f59998y;
        if (zIsAlive) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC15881l);
        } else {
            this.f59996w.f59983b.getViewTreeObserver().removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC15881l);
        }
        return C23454a0.f92919a;
    }
}
