package p426qi;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.RunnableC1645z0;
import androidx.profileinstaller.ExecutorC1651b;
import dj.AbstractC12058c;
import dj.ThreadFactoryC12059d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import live.hms.video.factories.MediaConstraintsFactory;

/* JADX INFO: renamed from: qi.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C30378d0 {

    /* JADX INFO: renamed from: e */
    public static final Executor f124649e;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f124650a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f124651b = new LinkedHashSet(1);

    /* JADX INFO: renamed from: c */
    public final Handler f124652c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public volatile C30374b0 f124653d = null;

    static {
        if (MediaConstraintsFactory.kValueTrue.equals(System.getProperty("lottie.testing.directExecutor"))) {
            f124649e = new ExecutorC1651b(0);
        } else {
            f124649e = Executors.newCachedThreadPool(new ThreadFactoryC12059d());
        }
    }

    public C30378d0(C30387i c30387i) {
        m92857d(new C30374b0(c30387i));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m92854a(InterfaceC30405z interfaceC30405z) {
        Throwable th3;
        try {
            C30374b0 c30374b0 = this.f124653d;
            if (c30374b0 != null && (th3 = c30374b0.f124647b) != null) {
                interfaceC30405z.onResult(th3);
            }
            this.f124651b.add(interfaceC30405z);
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m92855b(InterfaceC30405z interfaceC30405z) {
        C30387i c30387i;
        try {
            C30374b0 c30374b0 = this.f124653d;
            if (c30374b0 != null && (c30387i = c30374b0.f124646a) != null) {
                interfaceC30405z.onResult(c30387i);
            }
            this.f124650a.add(interfaceC30405z);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m92856c() {
        C30374b0 c30374b0 = this.f124653d;
        if (c30374b0 == null) {
            return;
        }
        C30387i c30387i = c30374b0.f124646a;
        if (c30387i != null) {
            synchronized (this) {
                Iterator it = new ArrayList(this.f124650a).iterator();
                while (it.hasNext()) {
                    ((InterfaceC30405z) it.next()).onResult(c30387i);
                }
            }
            return;
        }
        Throwable th3 = c30374b0.f124647b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f124651b);
            if (arrayList.isEmpty()) {
                AbstractC12058c.m33240c("Lottie encountered an error but no failure listener was added:", th3);
                return;
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((InterfaceC30405z) it3.next()).onResult(th3);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m92857d(C30374b0 c30374b0) {
        if (this.f124653d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f124653d = c30374b0;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            m92856c();
        } else {
            this.f124652c.post(new RunnableC1645z0(this, 19));
        }
    }

    public C30378d0(Callable callable, boolean z4) {
        if (z4) {
            try {
                m92857d((C30374b0) callable.call());
                return;
            } catch (Throwable th3) {
                m92857d(new C30374b0(th3));
                return;
            }
        }
        Executor executor = f124649e;
        C30376c0 c30376c0 = new C30376c0(callable);
        c30376c0.f124648w = this;
        executor.execute(c30376c0);
    }
}
