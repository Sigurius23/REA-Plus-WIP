package ne3;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import live.hms.video.utils.HMSConstantsKt;
import oe3.AbstractC27881a;
import oe3.AbstractC27882b;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: ne3.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26621j0 implements InterfaceC26620j {

    /* JADX INFO: renamed from: w */
    public final InterfaceC26633p0 f105871w;

    /* JADX INFO: renamed from: x */
    public final C26616h f105872x;

    /* JADX INFO: renamed from: y */
    public boolean f105873y;

    public C26621j0(InterfaceC26633p0 source) {
        AbstractC22676k.m65750j(source, "source");
        this.f105871w = source;
        this.f105872x = new C26616h();
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: H0 */
    public final String mo79183H0(Charset charset) {
        AbstractC22676k.m65750j(charset, "charset");
        InterfaceC26633p0 interfaceC26633p0 = this.f105871w;
        C26616h c26616h = this.f105872x;
        c26616h.mo79189N0(interfaceC26633p0);
        return c26616h.mo79183H0(charset);
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: I0 */
    public final long mo79184I0(C26624l bytes) {
        AbstractC22676k.m65750j(bytes, "bytes");
        return AbstractC27882b.m84152b(this, bytes, bytes.mo79253d(), 0L, Long.MAX_VALUE);
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: M */
    public final String mo79187M(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "limit < 0: ").toString());
        }
        long j13 = j7 == Long.MAX_VALUE ? Long.MAX_VALUE : j7 + 1;
        long jM79238b = m79238b((byte) 10, 0L, j13);
        C26616h c26616h = this.f105872x;
        if (jM79238b != -1) {
            return AbstractC27881a.m84149c(c26616h, jM79238b);
        }
        if (j13 < Long.MAX_VALUE && request(j13) && c26616h.m79229s(j13 - 1) == 13 && request(j13 + 1) && c26616h.m79229s(j13) == 10) {
            return AbstractC27881a.m84149c(c26616h, j13);
        }
        C26616h c26616h2 = new C26616h();
        c26616h.m79214k(c26616h2, 0L, Math.min(32, c26616h.f105866x));
        throw new EOFException("\\n not found: limit=" + Math.min(c26616h.f105866x, j7) + " content=" + c26616h2.mo79218m0(c26616h2.f105866x).mo79254e() + (char) 8230);
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: P0 */
    public final long mo79190P0(InterfaceC26618i interfaceC26618i) {
        C26616h c26616h;
        long j7 = 0;
        while (true) {
            InterfaceC26633p0 interfaceC26633p0 = this.f105871w;
            c26616h = this.f105872x;
            if (interfaceC26633p0.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) == -1) {
                break;
            }
            long jM79208h = c26616h.m79208h();
            if (jM79208h > 0) {
                j7 += jM79208h;
                interfaceC26618i.write(c26616h, jM79208h);
            }
        }
        long j13 = c26616h.f105866x;
        if (j13 <= 0) {
            return j7;
        }
        long j14 = j7 + j13;
        interfaceC26618i.write(c26616h, j13);
        return j14;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: Q0 */
    public final int mo79192Q0() {
        mo79207g0(4L);
        return this.f105872x.mo79192Q0();
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: Y0 */
    public final int mo79198Y0(C26607c0 options) {
        C26616h c26616h;
        AbstractC22676k.m65750j(options, "options");
        if (this.f105873y) {
            throw new IllegalStateException("closed");
        }
        do {
            c26616h = this.f105872x;
            int iM84150d = AbstractC27881a.m84150d(c26616h, options, true);
            if (iM84150d != -2) {
                if (iM84150d == -1) {
                    break;
                }
                c26616h.skip(options.f105835w[iM84150d].mo79253d());
                return iM84150d;
            }
        } while (this.f105871w.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) != -1);
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final long m79238b(byte b, long j7, long j13) {
        if (this.f105873y) {
            throw new IllegalStateException("closed");
        }
        if (0 > j13) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j13, "fromIndex=0 toIndex=").toString());
        }
        long jMax = 0;
        while (jMax < j13) {
            C26616h c26616h = this.f105872x;
            byte b6 = b;
            long j14 = j13;
            long jM79235x = c26616h.m79235x(b6, jMax, j14);
            if (jM79235x != -1) {
                return jM79235x;
            }
            long j15 = c26616h.f105866x;
            if (j15 >= j14 || this.f105871w.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) == -1) {
                break;
            }
            jMax = Math.max(jMax, j15);
            b = b6;
            j13 = j14;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f105873y) {
            return;
        }
        this.f105873y = true;
        this.f105871w.close();
        this.f105872x.m79200b();
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: d0 */
    public final boolean mo79202d0(long j7, C26624l bytes) {
        AbstractC22676k.m65750j(bytes, "bytes");
        int iMo79253d = bytes.mo79253d();
        if (this.f105873y) {
            throw new IllegalStateException("closed");
        }
        if (iMo79253d >= 0 && j7 >= 0 && iMo79253d <= bytes.mo79253d()) {
            return iMo79253d == 0 || AbstractC27882b.m84152b(this, bytes, iMo79253d, j7, j7 + 1) != -1;
        }
        return false;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: e0 */
    public final long mo79204e0() {
        mo79207g0(8L);
        return this.f105872x.mo79204e0();
    }

    @Override // ne3.InterfaceC26620j, ne3.InterfaceC26618i
    /* JADX INFO: renamed from: f */
    public final C26616h mo79205f() {
        return this.f105872x;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: f0 */
    public final long mo79206f0(C26624l targetBytes) {
        AbstractC22676k.m65750j(targetBytes, "targetBytes");
        if (this.f105873y) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C26616h c26616h = this.f105872x;
            long jM79185J = c26616h.m79185J(jMax, targetBytes);
            if (jM79185J != -1) {
                return jM79185J;
            }
            long j7 = c26616h.f105866x;
            if (this.f105871w.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j7);
        }
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: g0 */
    public final void mo79207g0(long j7) {
        if (!request(j7)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: h */
    public final short m79239h() {
        mo79207g0(2L);
        return this.f105872x.m79236x0();
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) {
        AbstractC22676k.m65750j(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount < 0: ").toString());
        }
        if (this.f105873y) {
            throw new IllegalStateException("closed");
        }
        C26616h c26616h = this.f105872x;
        if (c26616h.f105866x == 0) {
            if (j7 == 0) {
                return 0L;
            }
            if (this.f105871w.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) == -1) {
                return -1L;
            }
        }
        return c26616h.mo9164h1(sink, Math.min(j7, c26616h.f105866x));
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: i1 */
    public final InputStream mo79211i1() {
        return new C26619i0(this);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f105873y;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: j0 */
    public final void mo79212j0(C26616h c26616h, long j7) throws EOFException {
        C26616h c26616h2 = this.f105872x;
        try {
            mo79207g0(j7);
            c26616h2.mo79212j0(c26616h, j7);
        } catch (EOFException e5) {
            c26616h.mo79189N0(c26616h2);
            throw e5;
        }
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: k0 */
    public final String mo79215k0(long j7) {
        mo79207g0(j7);
        C26616h c26616h = this.f105872x;
        c26616h.getClass();
        return c26616h.m79188M0(j7, AbstractC39397a.f169546a);
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: m0 */
    public final C26624l mo79218m0(long j7) {
        mo79207g0(j7);
        return this.f105872x.mo79218m0(j7);
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: n */
    public final byte[] mo79220n() {
        InterfaceC26633p0 interfaceC26633p0 = this.f105871w;
        C26616h c26616h = this.f105872x;
        c26616h.mo79189N0(interfaceC26633p0);
        return c26616h.m79201b0(c26616h.f105866x);
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: o */
    public final boolean mo79222o() {
        if (this.f105873y) {
            throw new IllegalStateException("closed");
        }
        C26616h c26616h = this.f105872x;
        return c26616h.mo79222o() && this.f105871w.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) == -1;
    }

    @Override // ne3.InterfaceC26620j
    public final C26621j0 peek() {
        return AbstractC26604b.m79158c(new C26613f0(this));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        AbstractC22676k.m65750j(sink, "sink");
        C26616h c26616h = this.f105872x;
        if (c26616h.f105866x == 0 && this.f105871w.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) == -1) {
            return -1;
        }
        return c26616h.read(sink);
    }

    @Override // ne3.InterfaceC26620j
    public final byte readByte() {
        mo79207g0(1L);
        return this.f105872x.readByte();
    }

    @Override // ne3.InterfaceC26620j
    public final void readFully(byte[] sink) throws EOFException {
        C26616h c26616h = this.f105872x;
        AbstractC22676k.m65750j(sink, "sink");
        try {
            mo79207g0(sink.length);
            c26616h.readFully(sink);
        } catch (EOFException e5) {
            int i13 = 0;
            while (true) {
                long j7 = c26616h.f105866x;
                if (j7 <= 0) {
                    throw e5;
                }
                int i14 = c26616h.read(sink, i13, (int) j7);
                if (i14 == -1) {
                    throw new AssertionError();
                }
                i13 += i14;
            }
        }
    }

    @Override // ne3.InterfaceC26620j
    public final int readInt() {
        mo79207g0(4L);
        return this.f105872x.readInt();
    }

    @Override // ne3.InterfaceC26620j
    public final long readLong() {
        mo79207g0(8L);
        return this.f105872x.readLong();
    }

    @Override // ne3.InterfaceC26620j
    public final short readShort() {
        mo79207g0(2L);
        return this.f105872x.readShort();
    }

    @Override // ne3.InterfaceC26620j
    public final boolean request(long j7) {
        C26616h c26616h;
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount < 0: ").toString());
        }
        if (this.f105873y) {
            throw new IllegalStateException("closed");
        }
        do {
            c26616h = this.f105872x;
            if (c26616h.f105866x >= j7) {
                return true;
            }
        } while (this.f105871w.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) != -1);
        return false;
    }

    @Override // ne3.InterfaceC26620j
    public final void skip(long j7) {
        if (this.f105873y) {
            throw new IllegalStateException("closed");
        }
        while (j7 > 0) {
            C26616h c26616h = this.f105872x;
            if (c26616h.f105866x == 0 && this.f105871w.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j7, c26616h.f105866x);
            c26616h.skip(jMin);
            j7 -= jMin;
        }
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return this.f105871w.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f105871w + ')';
    }
}
