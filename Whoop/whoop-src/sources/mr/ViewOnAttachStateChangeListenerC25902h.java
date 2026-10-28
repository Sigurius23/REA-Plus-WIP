package mr;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import p186h8.C16999a;

/* JADX INFO: renamed from: mr.h */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnAttachStateChangeListenerC25902h implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: w */
    public final WeakReference f102230w;

    /* JADX INFO: renamed from: x */
    public final WeakReference f102231x;

    public ViewOnAttachStateChangeListenerC25902h(C25908n c25908n, View view) {
        this.f102230w = new WeakReference(c25908n);
        this.f102231x = new WeakReference(view);
    }

    /* JADX INFO: renamed from: a */
    public final void m76608a() {
        WeakReference weakReference = this.f102231x;
        if (weakReference.get() != null) {
            ((View) weakReference.get()).removeOnAttachStateChangeListener(this);
            View view = (View) weakReference.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        weakReference.clear();
        this.f102230w.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakReference weakReference = this.f102230w;
        if (weakReference.get() == null) {
            m76608a();
            return;
        }
        AbstractC25906l abstractC25906l = (AbstractC25906l) weakReference.get();
        C16999a c16999a = AbstractC25906l.f102248x;
        abstractC25906l.getClass();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.f102230w.get() == null) {
            m76608a();
        } else if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f102230w.get() == null) {
            m76608a();
        } else if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
