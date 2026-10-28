package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.C20121k0;
import io.sentry.android.core.internal.gestures.WindowCallbackC20086b;
import io.sentry.android.core.performance.C20146i;
import java.util.concurrent.atomic.AtomicReference;
import p222ij.RunnableC18575a;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.i */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewTreeObserverOnDrawListenerC20108i implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: w */
    public final Handler f75540w = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: x */
    public final AtomicReference f75541x;

    /* JADX INFO: renamed from: y */
    public final Runnable f75542y;

    public ViewTreeObserverOnDrawListenerC20108i(View view, Runnable runnable) {
        this.f75541x = new AtomicReference(view);
        this.f75542y = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static void m56001a(Activity activity, Runnable runnable, C20121k0 c20121k0) {
        Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView == null) {
                Window.Callback callback = window.getCallback();
                window.setCallback(new C20146i(callback != null ? callback : new WindowCallbackC20086b(), new RunnableC18575a(window, callback, runnable, c20121k0, 1)));
            } else {
                ViewTreeObserverOnDrawListenerC20108i viewTreeObserverOnDrawListenerC20108i = new ViewTreeObserverOnDrawListenerC20108i(viewPeekDecorView, runnable);
                c20121k0.getClass();
                viewPeekDecorView.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC20108i);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.f75541x.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.h
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserverOnDrawListenerC20108i viewTreeObserverOnDrawListenerC20108i = this.f75538w;
                viewTreeObserverOnDrawListenerC20108i.getClass();
                view.getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC20108i);
            }
        });
        this.f75540w.postAtFrontOfQueue(this.f75542y);
    }
}
