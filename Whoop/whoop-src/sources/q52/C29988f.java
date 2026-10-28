package q52;

import android.os.Handler;
import bh3.InterfaceC3255b;
import se.AbstractC32411b;

/* JADX INFO: renamed from: q52.f */
/* JADX INFO: loaded from: classes10.dex */
public class C29988f {

    /* JADX INFO: renamed from: a */
    private final long f122463a;

    /* JADX INFO: renamed from: b */
    private final long f122464b;

    /* JADX INFO: renamed from: c */
    private final Runnable f122465c;

    /* JADX INFO: renamed from: d */
    private final Handler f122466d = AbstractC32411b.m101066J();

    /* JADX INFO: renamed from: e */
    private boolean f122467e;

    /* JADX INFO: renamed from: q52.f$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC3255b f122468w;

        public a(InterfaceC3255b interfaceC3255b) {
            this.f122468w = interfaceC3255b;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C29988f.this.f122466d) {
                try {
                    if (C29988f.this.f122467e) {
                        long jM91718d = C29988f.this.m91718d();
                        if (jM91718d >= 0) {
                            this.f122468w.mo9472b(Long.valueOf(jM91718d));
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public C29988f(long j7, long j13, InterfaceC3255b interfaceC3255b) {
        this.f122463a = j7;
        this.f122464b = j13;
        this.f122465c = new a(interfaceC3255b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public long m91718d() {
        long j7;
        synchronized (this.f122466d) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j13 = this.f122463a;
                j7 = jCurrentTimeMillis - j13;
                if (j7 < 0) {
                    this.f122466d.postDelayed(this.f122465c, -j7);
                } else {
                    long j14 = this.f122464b;
                    this.f122466d.postDelayed(this.f122465c, ((((j7 / j14) + 1) * j14) + j13) - jCurrentTimeMillis);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return j7;
    }

    /* JADX INFO: renamed from: e */
    public void m91719e() {
        synchronized (this.f122466d) {
            m91720f();
            this.f122467e = true;
            this.f122466d.post(this.f122465c);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m91720f() {
        synchronized (this.f122466d) {
            this.f122467e = false;
            this.f122466d.removeCallbacks(this.f122465c);
        }
    }
}
