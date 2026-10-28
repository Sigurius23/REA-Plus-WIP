package ar;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: ar.g */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewTreeObserverOnPreDrawListenerC1919g implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7598w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f7599x;

    public /* synthetic */ ViewTreeObserverOnPreDrawListenerC1919g(Object obj, int i13) {
        this.f7598w = i13;
        this.f7599x = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f7598w) {
            case 0:
                AbstractC1923k abstractC1923k = (AbstractC1923k) this.f7599x;
                float rotation = abstractC1923k.f7635s.getRotation();
                if (abstractC1923k.f7631o != rotation) {
                    abstractC1923k.f7631o = rotation;
                    abstractC1923k.mo5891p();
                }
                break;
            default:
                ((CoordinatorLayout) this.f7599x).m3665p(0);
                break;
        }
        return true;
    }
}
