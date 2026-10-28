package p465rm;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.TimeoutException;
import p309lo.AbstractC24543a;
import p309lo.C24562t;

/* JADX INFO: renamed from: rm.d1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31525d1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC31522c1 f130116a;

    /* JADX INFO: renamed from: b */
    public final C31581z f130117b;

    /* JADX INFO: renamed from: c */
    public final C24562t f130118c;

    /* JADX INFO: renamed from: d */
    public int f130119d;

    /* JADX INFO: renamed from: e */
    public Object f130120e;

    /* JADX INFO: renamed from: f */
    public final Looper f130121f;

    /* JADX INFO: renamed from: g */
    public boolean f130122g;

    /* JADX INFO: renamed from: h */
    public boolean f130123h;

    /* JADX INFO: renamed from: i */
    public boolean f130124i;

    public C31525d1(C31581z c31581z, InterfaceC31522c1 interfaceC31522c1, AbstractC31558o1 abstractC31558o1, int i13, C24562t c24562t, Looper looper) {
        this.f130117b = c31581z;
        this.f130116a = interfaceC31522c1;
        this.f130121f = looper;
        this.f130118c = c24562t;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m97123a(long j7) {
        boolean z4;
        AbstractC24543a.m71573i(this.f130122g);
        AbstractC24543a.m71573i(this.f130121f.getThread() != Thread.currentThread());
        this.f130118c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j7;
        while (true) {
            z4 = this.f130124i;
            if (z4 || j7 <= 0) {
                break;
            }
            this.f130118c.getClass();
            wait(j7);
            this.f130118c.getClass();
            j7 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (!z4) {
            throw new TimeoutException("Message delivery timed out.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m97124b(boolean z4) {
        this.f130123h = z4 | this.f130123h;
        this.f130124i = true;
        notifyAll();
    }

    /* JADX INFO: renamed from: c */
    public final void m97125c() {
        AbstractC24543a.m71573i(!this.f130122g);
        this.f130122g = true;
        C31581z c31581z = this.f130117b;
        synchronized (c31581z) {
            if (!c31581z.f130500Y && c31581z.f130484I.isAlive()) {
                c31581z.f130483H.m71649a(14, this).m71647b();
                return;
            }
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            m97124b(false);
        }
    }
}
