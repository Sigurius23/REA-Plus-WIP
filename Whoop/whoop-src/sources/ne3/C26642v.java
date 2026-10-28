package ne3;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p088dc.AbstractC11895b;
import p108e4.AbstractC12682p;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ne3.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C26642v implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: E */
    public final CRC32 f105918E;

    /* JADX INFO: renamed from: w */
    public byte f105919w;

    /* JADX INFO: renamed from: x */
    public final C26621j0 f105920x;

    /* JADX INFO: renamed from: y */
    public final Inflater f105921y;

    /* JADX INFO: renamed from: z */
    public final C26644x f105922z;

    public C26642v(InterfaceC26620j source) {
        AbstractC22676k.m65750j(source, "source");
        C26621j0 c26621j0 = new C26621j0(source);
        this.f105920x = c26621j0;
        Inflater inflater = new Inflater(true);
        this.f105921y = inflater;
        this.f105922z = new C26644x(c26621j0, inflater);
        this.f105918E = new CRC32();
    }

    /* JADX INFO: renamed from: b */
    public static void m79283b(int i13, int i14, String str) throws IOException {
        if (i14 == i13) {
            return;
        }
        StringBuilder sbM35484d = AbstractC12682p.m35484d(str, ": actual 0x");
        sbM35484d.append(AbstractC39414r.m125895n0(8, AbstractC26604b.m79168m(i14)));
        sbM35484d.append(" != expected 0x");
        sbM35484d.append(AbstractC39414r.m125895n0(8, AbstractC26604b.m79168m(i13)));
        throw new IOException(sbM35484d.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f105922z.close();
    }

    /* JADX INFO: renamed from: h */
    public final void m79284h(C26616h c26616h, long j7, long j13) {
        C26623k0 c26623k0 = c26616h.f105865w;
        AbstractC22676k.m65747g(c26623k0);
        while (true) {
            int i13 = c26623k0.f105876c;
            int i14 = c26623k0.f105875b;
            if (j7 < i13 - i14) {
                break;
            }
            j7 -= (long) (i13 - i14);
            c26623k0 = c26623k0.f105879f;
            AbstractC22676k.m65747g(c26623k0);
        }
        while (j13 > 0) {
            int i15 = (int) (((long) c26623k0.f105875b) + j7);
            int iMin = (int) Math.min(c26623k0.f105876c - i15, j13);
            this.f105918E.update(c26623k0.f105874a, i15, iMin);
            j13 -= (long) iMin;
            c26623k0 = c26623k0.f105879f;
            AbstractC22676k.m65747g(c26623k0);
            j7 = 0;
        }
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) throws IOException {
        C26642v c26642v = this;
        AbstractC22676k.m65750j(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount < 0: ").toString());
        }
        if (j7 == 0) {
            return 0L;
        }
        byte b = c26642v.f105919w;
        CRC32 crc32 = c26642v.f105918E;
        C26621j0 c26621j0 = c26642v.f105920x;
        if (b == 0) {
            c26621j0.mo79207g0(10L);
            C26616h c26616h = c26621j0.f105872x;
            byte bM79229s = c26616h.m79229s(3L);
            boolean z4 = ((bM79229s >> 1) & 1) == 1;
            if (z4) {
                c26642v.m79284h(c26616h, 0L, 10L);
            }
            m79283b(8075, c26621j0.readShort(), "ID1ID2");
            c26621j0.skip(8L);
            if (((bM79229s >> 2) & 1) == 1) {
                c26621j0.mo79207g0(2L);
                if (z4) {
                    m79284h(c26616h, 0L, 2L);
                }
                long jM79236x0 = c26616h.m79236x0() & 65535;
                c26621j0.mo79207g0(jM79236x0);
                if (z4) {
                    m79284h(c26616h, 0L, jM79236x0);
                }
                c26621j0.skip(jM79236x0);
            }
            if (((bM79229s >> 3) & 1) == 1) {
                long jM79238b = c26621j0.m79238b((byte) 0, 0L, Long.MAX_VALUE);
                if (jM79238b == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    m79284h(c26616h, 0L, jM79238b + 1);
                }
                c26621j0.skip(jM79238b + 1);
            }
            if (((bM79229s >> 4) & 1) == 1) {
                long jM79238b2 = c26621j0.m79238b((byte) 0, 0L, Long.MAX_VALUE);
                if (jM79238b2 == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    c26642v = this;
                    c26642v.m79284h(c26616h, 0L, jM79238b2 + 1);
                } else {
                    c26642v = this;
                }
                c26621j0.skip(jM79238b2 + 1);
            } else {
                c26642v = this;
            }
            if (z4) {
                m79283b(c26621j0.m79239h(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            c26642v.f105919w = (byte) 1;
        }
        if (c26642v.f105919w == 1) {
            long j13 = sink.f105866x;
            long jMo9164h1 = c26642v.f105922z.mo9164h1(sink, j7);
            if (jMo9164h1 != -1) {
                c26642v.m79284h(sink, j13, jMo9164h1);
                return jMo9164h1;
            }
            c26642v.f105919w = (byte) 2;
        }
        if (c26642v.f105919w == 2) {
            m79283b(c26621j0.mo79192Q0(), (int) crc32.getValue(), "CRC");
            m79283b(c26621j0.mo79192Q0(), (int) c26642v.f105921y.getBytesWritten(), "ISIZE");
            c26642v.f105919w = (byte) 3;
            if (!c26621j0.mo79222o()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return this.f105920x.f105871w.timeout();
    }
}
