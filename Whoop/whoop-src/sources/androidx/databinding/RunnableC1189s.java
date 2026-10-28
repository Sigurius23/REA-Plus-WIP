package androidx.databinding;

import android.view.MotionEvent;
import androidx.compose.p018ui.platform.AndroidComposeView;
import com.google.crypto.tink.internal.C5099k0;
import com.iterable.iterableapi.C5325g;
import com.iterable.iterableapi.InterfaceC5321f;
import eh3.C13198b;
import eh3.C13200d;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.cache.C20280c;
import io.sentry.cache.InterfaceC20281d;
import io.sentry.util.C20579a;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import p314m.LayoutInflaterFactory2C24829a0;
import p684zk.C40772a;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32306h;
import yd3.AbstractC39470a;
import yd3.C39472c;
import yd3.C39473d;

/* JADX INFO: renamed from: androidx.databinding.s */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1189s implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5336w;

    /* JADX INFO: renamed from: x */
    public final Object f5337x;

    public /* synthetic */ RunnableC1189s(Object obj, int i13) {
        this.f5336w = i13;
        this.f5337x = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC39470a abstractC39470aM126124b;
        long jNanoTime;
        switch (this.f5336w) {
            case 0:
                synchronized (this) {
                    ((AbstractC1168a0) this.f5337x).mPendingRebind = false;
                    break;
                }
                AbstractC1168a0.access$300();
                if (((AbstractC1168a0) this.f5337x).mRoot.isAttachedToWindow()) {
                    ((AbstractC1168a0) this.f5337x).executePendingBindings();
                    return;
                } else {
                    ((AbstractC1168a0) this.f5337x).mRoot.removeOnAttachStateChangeListener(AbstractC1168a0.ROOT_REATTACHED_LISTENER);
                    ((AbstractC1168a0) this.f5337x).mRoot.addOnAttachStateChangeListener(AbstractC1168a0.ROOT_REATTACHED_LISTENER);
                    return;
                }
            case 1:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f5337x;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.f4925S0;
                if (motionEvent != null) {
                    boolean z4 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z4) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i13 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i13 = 2;
                    }
                    AndroidComposeView androidComposeView2 = (AndroidComposeView) this.f5337x;
                    androidComposeView2.m3580M(motionEvent, i13, androidComposeView2.f4927T0, false);
                    return;
                }
                return;
            case 2:
                C5325g c5325g = (C5325g) this.f5337x;
                c5325g.f21690d = false;
                for (WeakReference weakReference : c5325g.f21691e) {
                    if (weakReference.get() != null) {
                        ((InterfaceC5321f) weakReference.get()).mo16418a();
                    }
                }
                return;
            case 3:
                C13198b c13198b = (C13198b) this.f5337x;
                ConcurrentLinkedQueue<C13200d> concurrentLinkedQueue = c13198b.f45744c;
                if (concurrentLinkedQueue.isEmpty()) {
                    return;
                }
                long jNanoTime2 = System.nanoTime();
                for (C13200d c13200d : concurrentLinkedQueue) {
                    if (c13200d.f45752I > jNanoTime2) {
                        return;
                    }
                    if (concurrentLinkedQueue.remove(c13200d)) {
                        c13198b.f45745d.m75181e(c13200d);
                    }
                }
                return;
            case 4:
                C20513q6 c20513q6 = (C20513q6) this.f5337x;
                String cacheDirPath = c20513q6.getCacheDirPath();
                if (cacheDirPath == null) {
                    c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
                    return;
                }
                InterfaceC20281d envelopeDiskCache = c20513q6.getEnvelopeDiskCache();
                if (envelopeDiskCache instanceof C20280c) {
                    int i14 = C20280c.f76154J;
                    C20280c c20280c = (C20280c) envelopeDiskCache;
                    c20280c.m56258d(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
                    c20280c.f76155E.countDown();
                    return;
                }
                return;
            case 5:
                C5099k0 c5099k0 = (C5099k0) this.f5337x;
                do {
                    c5099k0.m16019x();
                } while (((ConcurrentLinkedQueue) c5099k0.f21441z).size() >= 1000);
                C20535s c20535sM56711a = ((C20579a) c5099k0.f21437F).m56711a();
                try {
                    if (!((ConcurrentLinkedQueue) c5099k0.f21441z).isEmpty()) {
                        c5099k0.m15993K(false);
                        break;
                    }
                    c20535sM56711a.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        c20535sM56711a.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            case 6:
                LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) this.f5337x;
                if ((1 & layoutInflaterFactory2C24829a0.f97250z0) != 0) {
                    layoutInflaterFactory2C24829a0.m72783A(0);
                }
                if ((layoutInflaterFactory2C24829a0.f97250z0 & 4096) != 0) {
                    layoutInflaterFactory2C24829a0.m72783A(108);
                }
                layoutInflaterFactory2C24829a0.f97249y0 = false;
                layoutInflaterFactory2C24829a0.f97250z0 = 0;
                return;
            case 7:
                C39473d c39473d = (C39473d) this.f5337x;
                synchronized (c39473d) {
                    c39473d.f169849g++;
                    abstractC39470aM126124b = c39473d.m126124b();
                }
                if (abstractC39470aM126124b == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    AbstractC39470a abstractC39470a = abstractC39470aM126124b;
                    try {
                        threadCurrentThread.setName(abstractC39470a.f169829a);
                        Logger logger = ((C39473d) this.f5337x).f169844b;
                        C39472c c39472c = abstractC39470a.f169831c;
                        AbstractC22676k.m65747g(c39472c);
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            AbstractC32306h.m100554b(logger, abstractC39470a, c39472c, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jMo70158a = abstractC39470a.mo70158a();
                            if (zIsLoggable) {
                                AbstractC32306h.m100554b(logger, abstractC39470a, c39472c, "finished run in " + AbstractC32306h.m100566o(System.nanoTime() - jNanoTime));
                            }
                            C39473d c39473d2 = (C39473d) this.f5337x;
                            synchronized (c39473d2) {
                                C39473d.m126123a(c39473d2, abstractC39470a, jMo70158a, true);
                                abstractC39470aM126124b = c39473d2.m126124b();
                            }
                        } catch (Throwable th5) {
                            if (zIsLoggable) {
                                AbstractC32306h.m100554b(logger, abstractC39470a, c39472c, "failed a run in " + AbstractC32306h.m100566o(System.nanoTime() - jNanoTime));
                            }
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        try {
                            C39473d c39473d3 = (C39473d) this.f5337x;
                            synchronized (c39473d3) {
                                C39473d.m126123a(c39473d3, abstractC39470a, -1L, false);
                                if (!(th6 instanceof InterruptedException)) {
                                    throw th6;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th7) {
                            threadCurrentThread.setName(name);
                            throw th7;
                        }
                    }
                } while (abstractC39470aM126124b != null);
                threadCurrentThread.setName(name);
                return;
            default:
                C41113q c41113q = (C41113q) this.f5337x;
                c41113q.getClass();
                while (true) {
                    try {
                        c41113q.m133471r((C40772a) ((ReferenceQueue) c41113q.f177226z).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
        }
    }
}
