package p309lo;

import a30.C0332w0;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import bc3.C3033m;
import eu.C13612g;
import eu.InterfaceC13606d;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import p085d9.C11787e;
import p284ko.C22632p;
import p503tp.C34047r;
import p505ts.AbstractC34132o;
import p529uo.AbstractC35135w;
import p530up.C35145a;
import p530up.C35146b;
import to.C33974g0;
import to.C33976h0;
import to.C33979j;
import to.C33981k;
import to.C33985m;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: lo.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C24560r implements InterfaceC13606d {

    /* JADX INFO: renamed from: E */
    public static C24560r f95852E;

    /* JADX INFO: renamed from: y */
    public Object f95855y = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: z */
    public Object f95856z = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w */
    public Object f95853w = new Object();

    /* JADX INFO: renamed from: x */
    public int f95854x = 0;

    public C24560r(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C11787e(this, 1), intentFilter);
    }

    /* JADX INFO: renamed from: a */
    public static void m71617a(C24560r c24560r, int i13) {
        synchronized (c24560r.f95853w) {
            try {
                if (c24560r.f95854x == i13) {
                    return;
                }
                c24560r.f95854x = i13;
                for (WeakReference weakReference : (CopyOnWriteArrayList) c24560r.f95856z) {
                    C22632p c22632p = (C22632p) weakReference.get();
                    if (c22632p != null) {
                        c22632p.m65568a(i13);
                    } else {
                        ((CopyOnWriteArrayList) c24560r.f95856z).remove(weakReference);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public C33985m m71618b() {
        AbstractC35135w.m111090b(((C0332w0) this.f95855y) != null, "Must set register function");
        AbstractC35135w.m111090b(((C34047r) this.f95856z) != null, "Must set unregister function");
        AbstractC35135w.m111090b(((C33981k) this.f95853w) != null, "Must set holder");
        C33979j c33979j = ((C33981k) this.f95853w).f142452b;
        AbstractC35135w.m111095g(c33979j, "Key must not be null");
        return new C33985m(new C33974g0(this, (C33981k) this.f95853w, this.f95854x), new C33976h0(this, c33979j));
    }

    /* JADX INFO: renamed from: c */
    public void m71619c(C0332w0 c0332w0) {
        this.f95855y = c0332w0;
    }

    @Override // eu.InterfaceC13606d
    /* JADX INFO: renamed from: d */
    public void mo35231d() {
        ((C3033m) this.f95855y).resumeWith(AbstractC34132o.m107888l(new CancellationException("Animation cancelled")));
    }

    /* JADX INFO: renamed from: e */
    public void m71620e() {
        HandlerThread handlerThread;
        synchronized (this.f95853w) {
            try {
                AbstractC35849g.m113807i(this.f95854x > 0);
                int i13 = this.f95854x - 1;
                this.f95854x = i13;
                if (i13 == 0 && (handlerThread = (HandlerThread) this.f95856z) != null) {
                    handlerThread.quit();
                    this.f95856z = null;
                    this.f95855y = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // eu.InterfaceC13606d
    /* JADX INFO: renamed from: f */
    public void mo35232f(C35146b c35146b) {
        C3033m c3033m = (C3033m) this.f95855y;
        if (c35146b != null) {
            C13612g.m38429a((C13612g) this.f95856z, c35146b, (C35145a) this.f95853w, this.f95854x, c3033m);
        } else {
            c3033m.resumeWith(AbstractC34132o.m107888l(new CancellationException("internal error; no GoogleMap available")));
            throw new IllegalStateException("internal error; no GoogleMap available to animate position");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m71621g(int i13) {
        this.f95854x = i13;
    }

    /* JADX INFO: renamed from: h */
    public void m71622h(C34047r c34047r) {
        this.f95856z = c34047r;
    }

    /* JADX INFO: renamed from: i */
    public void m71623i(C33981k c33981k) {
        this.f95853w = c33981k;
    }
}
