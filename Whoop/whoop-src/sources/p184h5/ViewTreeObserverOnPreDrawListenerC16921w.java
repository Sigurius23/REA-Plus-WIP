package p184h5;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: h5.w */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeObserverOnPreDrawListenerC16921w implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w */
    public final View f64881w;

    /* JADX INFO: renamed from: x */
    public ViewTreeObserver f64882x;

    /* JADX INFO: renamed from: y */
    public final Runnable f64883y;

    public ViewTreeObserverOnPreDrawListenerC16921w(View view, Runnable runnable) {
        this.f64881w = view;
        this.f64882x = view.getViewTreeObserver();
        this.f64883y = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static void m47614a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC16921w viewTreeObserverOnPreDrawListenerC16921w = new ViewTreeObserverOnPreDrawListenerC16921w(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC16921w);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC16921w);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f64882x.isAlive();
        View view = this.f64881w;
        if (zIsAlive) {
            this.f64882x.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f64883y.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f64882x = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f64882x.isAlive();
        View view2 = this.f64881w;
        if (zIsAlive) {
            this.f64882x.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
