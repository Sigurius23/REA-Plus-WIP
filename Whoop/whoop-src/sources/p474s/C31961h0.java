package p474s;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import p444r.ViewTreeObserverOnGlobalLayoutListenerC30809d;

/* JADX INFO: renamed from: s.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31961h0 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC30809d f132705w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31965i0 f132706x;

    public C31961h0(C31965i0 c31965i0, ViewTreeObserverOnGlobalLayoutListenerC30809d viewTreeObserverOnGlobalLayoutListenerC30809d) {
        this.f132706x = c31965i0;
        this.f132705w = viewTreeObserverOnGlobalLayoutListenerC30809d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f132706x.f132712g0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f132705w);
        }
    }
}
