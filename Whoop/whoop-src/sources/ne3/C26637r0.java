package ne3;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.r0 */
/* JADX INFO: loaded from: classes5.dex */
public class C26637r0 {

    /* JADX INFO: renamed from: d */
    public static final C26635q0 f105903d = new C26635q0();

    /* JADX INFO: renamed from: a */
    public boolean f105904a;

    /* JADX INFO: renamed from: b */
    public long f105905b;

    /* JADX INFO: renamed from: c */
    public long f105906c;

    /* JADX INFO: renamed from: a */
    public C26637r0 mo79278a() {
        this.f105904a = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C26637r0 mo79279b() {
        this.f105906c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo79280c() {
        if (this.f105904a) {
            return this.f105905b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* JADX INFO: renamed from: d */
    public C26637r0 mo79275d(long j7) {
        this.f105904a = true;
        this.f105905b = j7;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo79281e() {
        return this.f105904a;
    }

    /* JADX INFO: renamed from: f */
    public void mo79276f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f105904a && this.f105905b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: g */
    public C26637r0 mo79277g(long j7, TimeUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "timeout < 0: ").toString());
        }
        this.f105906c = unit.toNanos(j7);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public long mo79282h() {
        return this.f105906c;
    }
}
