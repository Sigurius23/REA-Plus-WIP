package p034bl;

import ad3.C0783z;
import android.os.Handler;
import android.util.Log;
import androidx.lifecycle.RunnableC1605m;
import com.google.crypto.tink.internal.C5101l0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import p014aj.C0929d;
import p031b9.C2817b;
import p249jc.C21586l;
import p581we.C37199o;
import p586wk.InterfaceC37327e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29934u0;
import tk.AbstractC33874e;
import tk.C33873d;
import z63.C40132d;

/* JADX INFO: renamed from: bl.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3363c implements InterfaceC3361a {

    /* JADX INFO: renamed from: E */
    public Object f13103E;

    /* JADX INFO: renamed from: w */
    public final long f13104w;

    /* JADX INFO: renamed from: x */
    public final Object f13105x;

    /* JADX INFO: renamed from: y */
    public final Object f13106y;

    /* JADX INFO: renamed from: z */
    public final Object f13107z;

    public C3363c(C0783z runnableScheduler, C5101l0 c5101l0) {
        AbstractC22676k.m65750j(runnableScheduler, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f13105x = runnableScheduler;
        this.f13106y = c5101l0;
        this.f13104w = millis;
        this.f13107z = new Object();
        this.f13103E = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public void m9712a(C21586l token) {
        Runnable runnable;
        AbstractC22676k.m65750j(token, "token");
        synchronized (this.f13107z) {
            runnable = (Runnable) ((LinkedHashMap) this.f13103E).remove(token);
        }
        if (runnable != null) {
            ((Handler) ((C0783z) this.f13105x).f2818x).removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized C33873d m9713b() {
        try {
            if (((C33873d) this.f13103E) == null) {
                this.f13103E = C33873d.m107109J((File) this.f13106y, this.f13104w);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return (C33873d) this.f13103E;
    }

    /* JADX INFO: renamed from: c */
    public void m9714c(C21586l token) {
        AbstractC22676k.m65750j(token, "token");
        RunnableC1605m runnableC1605m = new RunnableC1605m(24, this, token);
        synchronized (this.f13107z) {
        }
        C0783z c0783z = (C0783z) this.f13105x;
        ((Handler) c0783z.f2818x).postDelayed(runnableC1605m, this.f13104w);
    }

    @Override // p034bl.InterfaceC3361a
    public synchronized void clear() {
        try {
            try {
                C33873d c33873dM9713b = m9713b();
                c33873dM9713b.close();
                AbstractC33874e.m107123a(c33873dM9713b.f141887w);
                synchronized (this) {
                    this.f13103E = null;
                }
            } catch (IOException e5) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e5);
                }
                synchronized (this) {
                    this.f13103E = null;
                }
            }
        } catch (Throwable th3) {
            synchronized (this) {
                this.f13103E = null;
                throw th3;
            }
        }
    }

    @Override // p034bl.InterfaceC3361a
    /* JADX INFO: renamed from: j */
    public void mo9710j(InterfaceC37327e interfaceC37327e, C40132d c40132d) {
        C3362b c3362b;
        String strM16042V = ((C5101l0) this.f13105x).m16042V(interfaceC37327e);
        C37199o c37199o = (C37199o) this.f13107z;
        synchronized (c37199o) {
            c3362b = (C3362b) ((HashMap) c37199o.f159040w).get(strM16042V);
            if (c3362b == null) {
                C0929d c0929d = (C0929d) c37199o.f159041x;
                synchronized (((ArrayDeque) c0929d.f3422w)) {
                    c3362b = (C3362b) ((ArrayDeque) c0929d.f3422w).poll();
                }
                if (c3362b == null) {
                    c3362b = new C3362b();
                }
                ((HashMap) c37199o.f159040w).put(strM16042V, c3362b);
            }
            c3362b.f13102b++;
        }
        c3362b.f13101a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM16042V + " for for Key: " + interfaceC37327e);
            }
            try {
                C33873d c33873dM9713b = m9713b();
                if (c33873dM9713b.m107120s(strM16042V) == null) {
                    C2817b c2817bM107118k = c33873dM9713b.m107118k(strM16042V);
                    if (c2817bM107118k == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM16042V));
                    }
                    try {
                        if (c40132d.m128677b(c2817bM107118k.m8012n())) {
                            c2817bM107118k.m8006e();
                        }
                        c2817bM107118k.m8005b();
                    } catch (Throwable th3) {
                        c2817bM107118k.m8005b();
                        throw th3;
                    }
                }
            } catch (IOException e5) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e5);
                }
            }
            ((C37199o) this.f13107z).m119210P(strM16042V);
        } catch (Throwable th4) {
            ((C37199o) this.f13107z).m119210P(strM16042V);
            throw th4;
        }
    }

    @Override // p034bl.InterfaceC3361a
    /* JADX INFO: renamed from: n */
    public File mo9711n(InterfaceC37327e interfaceC37327e) {
        String strM16042V = ((C5101l0) this.f13105x).m16042V(interfaceC37327e);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM16042V + " for for Key: " + interfaceC37327e);
        }
        try {
            C29934u0 c29934u0M107120s = m9713b().m107120s(strM16042V);
            if (c29934u0M107120s != null) {
                return c29934u0M107120s.m91526B();
            }
            return null;
        } catch (IOException e5) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e5);
            return null;
        }
    }

    public C3363c(File file) {
        this.f13107z = new C37199o(5, false);
        this.f13106y = file;
        this.f13104w = 262144000L;
        this.f13105x = new C5101l0(6);
    }
}
