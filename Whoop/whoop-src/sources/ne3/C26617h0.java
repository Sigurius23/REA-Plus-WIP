package ne3;

import java.nio.ByteBuffer;
import live.hms.video.utils.HMSConstantsKt;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26617h0 implements InterfaceC26618i {

    /* JADX INFO: renamed from: w */
    public final InterfaceC26629n0 f105867w;

    /* JADX INFO: renamed from: x */
    public final C26616h f105868x;

    /* JADX INFO: renamed from: y */
    public boolean f105869y;

    public C26617h0(InterfaceC26629n0 sink) {
        AbstractC22676k.m65750j(sink, "sink");
        this.f105867w = sink;
        this.f105868x = new C26616h();
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: H */
    public final InterfaceC26618i mo79182H(long j7) {
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        this.f105868x.m79227q1(AbstractC26604b.m79163h(j7));
        m79237b();
        return this;
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: L0 */
    public final InterfaceC26618i mo79186L0(int i13, int i14, String string) {
        AbstractC22676k.m65750j(string, "string");
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        this.f105868x.m79231t1(i13, i14, string);
        m79237b();
        return this;
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: N0 */
    public final long mo79189N0(InterfaceC26633p0 source) {
        AbstractC22676k.m65750j(source, "source");
        long j7 = 0;
        while (true) {
            long jMo9164h1 = source.mo9164h1(this.f105868x, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE);
            if (jMo9164h1 == -1) {
                return j7;
            }
            j7 += jMo9164h1;
            m79237b();
        }
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: Q */
    public final InterfaceC26618i mo79191Q(C26624l byteString) {
        AbstractC22676k.m65750j(byteString, "byteString");
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        this.f105868x.m79217l1(byteString);
        m79237b();
        return this;
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: S */
    public final InterfaceC26618i mo79193S(String string) {
        AbstractC22676k.m65750j(string, "string");
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        this.f105868x.m79232u1(string);
        m79237b();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC26618i m79237b() {
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        C26616h c26616h = this.f105868x;
        long jM79208h = c26616h.m79208h();
        if (jM79208h > 0) {
            this.f105867w.write(c26616h, jM79208h);
        }
        return this;
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC26629n0 interfaceC26629n0 = this.f105867w;
        if (this.f105869y) {
            return;
        }
        C26616h c26616h = this.f105868x;
        long j7 = c26616h.f105866x;
        if (j7 > 0) {
            interfaceC26629n0.write(c26616h, j7);
        }
        th = null;
        try {
            interfaceC26629n0.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f105869y = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: e */
    public final InterfaceC26618i mo79203e() {
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        C26616h c26616h = this.f105868x;
        long j7 = c26616h.f105866x;
        if (j7 > 0) {
            this.f105867w.write(c26616h, j7);
        }
        return this;
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: f */
    public final C26616h mo79205f() {
        return this.f105868x;
    }

    @Override // ne3.InterfaceC26618i, ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        C26616h c26616h = this.f105868x;
        long j7 = c26616h.f105866x;
        InterfaceC26629n0 interfaceC26629n0 = this.f105867w;
        if (j7 > 0) {
            interfaceC26629n0.write(c26616h, j7);
        }
        interfaceC26629n0.flush();
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: h0 */
    public final InterfaceC26618i mo79209h0(long j7) {
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        this.f105868x.m79221n1(j7);
        m79237b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f105869y;
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return this.f105867w.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f105867w + ')';
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: v0 */
    public final InterfaceC26618i mo79233v0(int i13) {
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        this.f105868x.m79226p1(AbstractC26604b.m79162g(i13));
        m79237b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        AbstractC22676k.m65750j(source, "source");
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f105868x.write(source);
        m79237b();
        return iWrite;
    }

    @Override // ne3.InterfaceC26618i
    public final InterfaceC26618i writeByte(int i13) {
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        this.f105868x.m79219m1(i13);
        m79237b();
        return this;
    }

    @Override // ne3.InterfaceC26618i
    public final InterfaceC26618i writeInt(int i13) {
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        this.f105868x.m79226p1(i13);
        m79237b();
        return this;
    }

    @Override // ne3.InterfaceC26618i
    public final InterfaceC26618i writeShort(int i13) {
        if (this.f105869y) {
            throw new IllegalStateException("closed");
        }
        this.f105868x.m79228r1(i13);
        m79237b();
        return this;
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        if (!this.f105869y) {
            this.f105868x.write(source, j7);
            m79237b();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ne3.InterfaceC26618i
    public final InterfaceC26618i write(byte[] source) {
        AbstractC22676k.m65750j(source, "source");
        if (!this.f105869y) {
            this.f105868x.m134462write(source);
            m79237b();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ne3.InterfaceC26618i
    public final InterfaceC26618i write(byte[] source, int i13, int i14) {
        AbstractC22676k.m65750j(source, "source");
        if (!this.f105869y) {
            this.f105868x.m134463write(source, i13, i14);
            m79237b();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
