package io.sentry.android.core.performance;

import android.view.Window;
import io.sentry.android.core.internal.gestures.AbstractWindowCallbackC20094j;
import p222ij.RunnableC18575a;

/* JADX INFO: renamed from: io.sentry.android.core.performance.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C20146i extends AbstractWindowCallbackC20094j {

    /* JADX INFO: renamed from: x */
    public final RunnableC18575a f75680x;

    public C20146i(Window.Callback callback, RunnableC18575a runnableC18575a) {
        super(callback);
        this.f75680x = runnableC18575a;
    }

    @Override // io.sentry.android.core.internal.gestures.AbstractWindowCallbackC20094j, android.view.Window.Callback
    public final void onContentChanged() {
        super.onContentChanged();
        this.f75680x.run();
    }
}
