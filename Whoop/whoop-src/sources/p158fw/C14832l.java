package p158fw;

import ne3.C26616h;
import ne3.C26637r0;
import ne3.InterfaceC26629n0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fw.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C14832l implements InterfaceC26629n0 {

    /* JADX INFO: renamed from: w */
    public final C26616h f55099w;

    /* JADX INFO: renamed from: x */
    public long f55100x;

    public C14832l(C26616h c26616h, long j7) {
        if (j7 <= 0) {
            throw new IllegalArgumentException("limit has to be grater than 0");
        }
        this.f55099w = c26616h;
        this.f55100x = j7;
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f55099w.getClass();
    }

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
        this.f55099w.getClass();
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return C26637r0.f105903d;
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        long j13 = this.f55100x;
        if (j13 > 0) {
            long jMin = Math.min(j13, j7);
            this.f55099w.write(source, jMin);
            this.f55100x -= jMin;
        }
    }
}
