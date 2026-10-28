package y73;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;
import q73.InterfaceC30023b;

/* JADX INFO: renamed from: y73.m */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC39301m extends AtomicReferenceArray implements Runnable, Callable, InterfaceC26443b {

    /* JADX INFO: renamed from: w */
    public final Runnable f169094w;

    /* JADX INFO: renamed from: x */
    public static final Object f169091x = new Object();

    /* JADX INFO: renamed from: y */
    public static final Object f169092y = new Object();

    /* JADX INFO: renamed from: z */
    public static final Object f169093z = new Object();

    /* JADX INFO: renamed from: E */
    public static final Object f169090E = new Object();

    public RunnableC39301m(Runnable runnable, InterfaceC30023b interfaceC30023b) {
        super(3);
        this.f169094w = runnable;
        lazySet(0, interfaceC30023b);
    }

    /* JADX INFO: renamed from: a */
    public final void m125270a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f169090E) {
                return;
            }
            if (obj == f169092y) {
                future.cancel(false);
                return;
            } else if (obj == f169093z) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // n73.InterfaceC26443b
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f169090E;
            if (obj6 == obj || obj6 == (obj4 = f169092y) || obj6 == (obj5 = f169093z)) {
                break;
            }
            boolean z4 = get(2) != Thread.currentThread();
            if (z4) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z4);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f169091x) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((InterfaceC30023b) obj2).mo78294b(this);
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        Object obj = get(0);
        return obj == f169091x || obj == f169090E;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2 = f169093z;
        Object obj3 = f169092y;
        Object obj4 = f169091x;
        Object obj5 = f169090E;
        lazySet(2, Thread.currentThread());
        try {
            this.f169094w.run();
        } catch (Throwable th3) {
            try {
                AbstractC21598x.m60677d0(th3);
            } finally {
                lazySet(2, null);
                Object obj6 = get(0);
                if (obj6 != obj4 && compareAndSet(0, obj6, obj5) && obj6 != null) {
                    ((InterfaceC30023b) obj6).mo78294b(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj3 || obj == obj2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj5));
            }
        }
        lazySet(2, null);
        Object obj7 = get(0);
        if (obj7 != obj4 && compareAndSet(0, obj7, obj5) && obj7 != null) {
            ((InterfaceC30023b) obj7).mo78294b(this);
        }
        while (r2 != obj3 && r2 != obj2 && !compareAndSet(1, get(i), obj5)) {
        }
    }
}
