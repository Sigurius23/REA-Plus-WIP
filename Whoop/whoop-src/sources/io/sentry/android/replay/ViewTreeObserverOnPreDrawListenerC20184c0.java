package io.sentry.android.replay;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import m83.AbstractC25265s;
import p006a4.AbstractC0354a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewTreeObserverOnPreDrawListenerC20184c0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C20203e0 f75820w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ View f75821x;

    public ViewTreeObserverOnPreDrawListenerC20184c0(C20203e0 c20203e0, View view) {
        this.f75820w = c20203e0;
        this.f75821x = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C20203e0 c20203e0 = this.f75820w;
        Point point = c20203e0.f75885H;
        WeakReference weakReference = (WeakReference) AbstractC25265s.m74114R0(c20203e0.f75884G);
        View view = weakReference != null ? (View) weakReference.get() : null;
        View view2 = this.f75821x;
        if (!AbstractC22676k.m65745e(view2, view)) {
            AbstractC0354a.m986z(view2, this);
            return true;
        }
        AbstractC22676k.m65750j(view2, "<this>");
        if (view2.getWidth() > 0 && view2.getHeight() > 0) {
            AbstractC0354a.m986z(view2, this);
            if (view2.getWidth() == point.x && view2.getHeight() == point.y) {
                return true;
            }
            point.set(view2.getWidth(), view2.getHeight());
            c20203e0.f75895y.m56099o0(view2.getWidth(), view2.getHeight());
        }
        return true;
    }
}
