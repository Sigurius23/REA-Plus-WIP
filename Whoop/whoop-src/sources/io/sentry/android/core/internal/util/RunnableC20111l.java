package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.EnumC20436n5;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.l */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC20111l implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75553w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20116q f75554x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Window f75555y;

    public /* synthetic */ RunnableC20111l(C20116q c20116q, Window window, int i13) {
        this.f75553w = i13;
        this.f75554x = c20116q;
        this.f75555y = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75553w) {
            case 0:
                C20116q c20116q = this.f75554x;
                CopyOnWriteArraySet copyOnWriteArraySet = c20116q.f75575x;
                Window window = this.f75555y;
                if (copyOnWriteArraySet.add(window)) {
                    try {
                        C20103d c20103d = c20116q.f75567H;
                        WindowOnFrameMetricsAvailableListenerC20113n windowOnFrameMetricsAvailableListenerC20113n = c20116q.f75568I;
                        Handler handler = c20116q.f75577z;
                        c20103d.getClass();
                        if (windowOnFrameMetricsAvailableListenerC20113n != null) {
                            window.addOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC20113n, handler);
                        }
                    } catch (Throwable th3) {
                        c20116q.f75576y.mo16060j(EnumC20436n5.ERROR, "Failed to add frameMetricsAvailableListener", th3);
                        return;
                    }
                }
                break;
            default:
                C20116q c20116q2 = this.f75554x;
                Window window2 = this.f75555y;
                try {
                    if (c20116q2.f75575x.remove(window2)) {
                        C20103d c20103d2 = c20116q2.f75567H;
                        WindowOnFrameMetricsAvailableListenerC20113n windowOnFrameMetricsAvailableListenerC20113n2 = c20116q2.f75568I;
                        c20103d2.getClass();
                        if (windowOnFrameMetricsAvailableListenerC20113n2 != null) {
                            window2.removeOnFrameMetricsAvailableListener(windowOnFrameMetricsAvailableListenerC20113n2);
                        }
                    }
                } catch (Throwable th4) {
                    c20116q2.f75576y.mo16060j(EnumC20436n5.ERROR, "Failed to remove frameMetricsAvailableListener", th4);
                }
                break;
        }
    }
}
