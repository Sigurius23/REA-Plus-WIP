package ne3;

import androidx.profileinstaller.ProfileVerifier;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import live.hms.video.utils.HMSConstantsKt;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import oe3.AbstractC27881a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p108e4.AbstractC12682p;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: ne3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C26616h implements InterfaceC26620j, InterfaceC26618i, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: w */
    public C26623k0 f105865w;

    /* JADX INFO: renamed from: x */
    public long f105866x;

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: H */
    public final InterfaceC26618i mo79182H(long j7) {
        m79227q1(AbstractC26604b.m79163h(j7));
        return this;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: H0 */
    public final String mo79183H0(Charset charset) {
        AbstractC22676k.m65750j(charset, "charset");
        return m79188M0(this.f105866x, charset);
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: I0 */
    public final long mo79184I0(C26624l bytes) {
        AbstractC22676k.m65750j(bytes, "bytes");
        byte[] bArr = AbstractC27881a.f112425a;
        return AbstractC27881a.m84147a(this, bytes, 0L, Long.MAX_VALUE, bytes.mo79253d());
    }

    /* JADX INFO: renamed from: J */
    public final long m79185J(long j7, C26624l targetBytes) {
        AbstractC22676k.m65750j(targetBytes, "targetBytes");
        long j13 = 0;
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "fromIndex < 0: ").toString());
        }
        C26623k0 c26623k0 = this.f105865w;
        if (c26623k0 == null) {
            return -1L;
        }
        long j14 = this.f105866x;
        if (j14 - j7 < j7) {
            while (j14 > j7) {
                c26623k0 = c26623k0.f105880g;
                AbstractC22676k.m65747g(c26623k0);
                j14 -= (long) (c26623k0.f105876c - c26623k0.f105875b);
            }
            if (targetBytes.mo79253d() == 2) {
                byte bMo79257i = targetBytes.mo79257i(0);
                byte bMo79257i2 = targetBytes.mo79257i(1);
                while (j14 < this.f105866x) {
                    byte[] bArr = c26623k0.f105874a;
                    int i13 = c26623k0.f105876c;
                    for (int i14 = (int) ((((long) c26623k0.f105875b) + j7) - j14); i14 < i13; i14++) {
                        byte b = bArr[i14];
                        if (b == bMo79257i || b == bMo79257i2) {
                            return ((long) (i14 - c26623k0.f105875b)) + j14;
                        }
                    }
                    j14 += (long) (c26623k0.f105876c - c26623k0.f105875b);
                    c26623k0 = c26623k0.f105879f;
                    AbstractC22676k.m65747g(c26623k0);
                    j7 = j14;
                }
            } else {
                byte[] bArrMo79256h = targetBytes.mo79256h();
                while (j14 < this.f105866x) {
                    byte[] bArr2 = c26623k0.f105874a;
                    int i15 = c26623k0.f105876c;
                    for (int i16 = (int) ((((long) c26623k0.f105875b) + j7) - j14); i16 < i15; i16++) {
                        byte b6 = bArr2[i16];
                        for (byte b8 : bArrMo79256h) {
                            if (b6 == b8) {
                                return ((long) (i16 - c26623k0.f105875b)) + j14;
                            }
                        }
                    }
                    j14 += (long) (c26623k0.f105876c - c26623k0.f105875b);
                    c26623k0 = c26623k0.f105879f;
                    AbstractC22676k.m65747g(c26623k0);
                    j7 = j14;
                }
            }
            return -1L;
        }
        while (true) {
            long j15 = ((long) (c26623k0.f105876c - c26623k0.f105875b)) + j13;
            if (j15 > j7) {
                break;
            }
            c26623k0 = c26623k0.f105879f;
            AbstractC22676k.m65747g(c26623k0);
            j13 = j15;
        }
        if (targetBytes.mo79253d() == 2) {
            byte bMo79257i3 = targetBytes.mo79257i(0);
            byte bMo79257i4 = targetBytes.mo79257i(1);
            while (j13 < this.f105866x) {
                byte[] bArr3 = c26623k0.f105874a;
                int i17 = c26623k0.f105876c;
                for (int i18 = (int) ((((long) c26623k0.f105875b) + j7) - j13); i18 < i17; i18++) {
                    byte b14 = bArr3[i18];
                    if (b14 == bMo79257i3 || b14 == bMo79257i4) {
                        return ((long) (i18 - c26623k0.f105875b)) + j13;
                    }
                }
                j13 += (long) (c26623k0.f105876c - c26623k0.f105875b);
                c26623k0 = c26623k0.f105879f;
                AbstractC22676k.m65747g(c26623k0);
                j7 = j13;
            }
        } else {
            byte[] bArrMo79256h2 = targetBytes.mo79256h();
            while (j13 < this.f105866x) {
                byte[] bArr4 = c26623k0.f105874a;
                int i19 = c26623k0.f105876c;
                for (int i24 = (int) ((((long) c26623k0.f105875b) + j7) - j13); i24 < i19; i24++) {
                    byte b15 = bArr4[i24];
                    for (byte b16 : bArrMo79256h2) {
                        if (b15 == b16) {
                            return ((long) (i24 - c26623k0.f105875b)) + j13;
                        }
                    }
                }
                j13 += (long) (c26623k0.f105876c - c26623k0.f105875b);
                c26623k0 = c26623k0.f105879f;
                AbstractC22676k.m65747g(c26623k0);
                j7 = j13;
            }
        }
        return -1L;
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: L0 */
    public final /* bridge */ /* synthetic */ InterfaceC26618i mo79186L0(int i13, int i14, String str) {
        m79231t1(i13, i14, str);
        return this;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: M */
    public final String mo79187M(long j7) throws EOFException {
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "limit < 0: ").toString());
        }
        long j13 = j7 != Long.MAX_VALUE ? j7 + 1 : Long.MAX_VALUE;
        long jM79235x = m79235x((byte) 10, 0L, j13);
        if (jM79235x != -1) {
            return AbstractC27881a.m84149c(this, jM79235x);
        }
        if (j13 < this.f105866x && m79229s(j13 - 1) == 13 && m79229s(j13) == 10) {
            return AbstractC27881a.m84149c(this, j13);
        }
        C26616h c26616h = new C26616h();
        m79214k(c26616h, 0L, Math.min(32, this.f105866x));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f105866x, j7) + " content=" + c26616h.mo79218m0(c26616h.f105866x).mo79254e() + (char) 8230);
    }

    /* JADX INFO: renamed from: M0 */
    public final String m79188M0(long j7, Charset charset) throws EOFException {
        AbstractC22676k.m65750j(charset, "charset");
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount: ").toString());
        }
        if (this.f105866x < j7) {
            throw new EOFException();
        }
        if (j7 == 0) {
            return "";
        }
        C26623k0 c26623k0 = this.f105865w;
        AbstractC22676k.m65747g(c26623k0);
        int i13 = c26623k0.f105875b;
        if (((long) i13) + j7 > c26623k0.f105876c) {
            return new String(m79201b0(j7), charset);
        }
        int i14 = (int) j7;
        String str = new String(c26623k0.f105874a, i13, i14, charset);
        int i15 = c26623k0.f105875b + i14;
        c26623k0.f105875b = i15;
        this.f105866x -= j7;
        if (i15 == c26623k0.f105876c) {
            this.f105865w = c26623k0.m79243a();
            AbstractC26625l0.m79267a(c26623k0);
        }
        return str;
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: N0 */
    public final long mo79189N0(InterfaceC26633p0 source) {
        AbstractC22676k.m65750j(source, "source");
        long j7 = 0;
        while (true) {
            long jMo9164h1 = source.mo9164h1(this, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE);
            if (jMo9164h1 == -1) {
                return j7;
            }
            j7 += jMo9164h1;
        }
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: P0 */
    public final long mo79190P0(InterfaceC26618i interfaceC26618i) {
        long j7 = this.f105866x;
        if (j7 > 0) {
            interfaceC26618i.write(this, j7);
        }
        return j7;
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: Q */
    public final /* bridge */ /* synthetic */ InterfaceC26618i mo79191Q(C26624l c26624l) {
        m79217l1(c26624l);
        return this;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: Q0 */
    public final int mo79192Q0() {
        return AbstractC26604b.m79162g(readInt());
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: S */
    public final /* bridge */ /* synthetic */ InterfaceC26618i mo79193S(String str) {
        m79232u1(str);
        return this;
    }

    /* JADX INFO: renamed from: S0 */
    public final String m79194S0() {
        return m79188M0(this.f105866x, AbstractC39397a.f169546a);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m79195T(int i13, long j7, C26624l bytes) {
        AbstractC22676k.m65750j(bytes, "bytes");
        if (i13 >= 0 && j7 >= 0 && ((long) i13) + j7 <= this.f105866x && i13 <= bytes.mo79253d()) {
            return i13 == 0 || AbstractC27881a.m84147a(this, bytes, j7, j7 + 1, i13) != -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: T0 */
    public final int m79196T0() throws EOFException {
        int i13;
        int i14;
        int i15;
        if (this.f105866x == 0) {
            throw new EOFException();
        }
        byte bM79229s = m79229s(0L);
        if ((bM79229s & 128) == 0) {
            i13 = bM79229s & 127;
            i15 = 0;
            i14 = 1;
        } else if ((bM79229s & 224) == 192) {
            i13 = bM79229s & 31;
            i14 = 2;
            i15 = 128;
        } else if ((bM79229s & 240) == 224) {
            i13 = bM79229s & 15;
            i14 = 3;
            i15 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        } else {
            if ((bM79229s & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i13 = bM79229s & 7;
            i14 = 4;
            i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        long j7 = i14;
        if (this.f105866x < j7) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i14, "size < ", ": ");
            sbM30466t.append(this.f105866x);
            sbM30466t.append(" (to read code point prefixed 0x");
            sbM30466t.append(AbstractC26604b.m79167l(bM79229s));
            sbM30466t.append(')');
            throw new EOFException(sbM30466t.toString());
        }
        for (int i16 = 1; i16 < i14; i16++) {
            long j13 = i16;
            byte bM79229s2 = m79229s(j13);
            if ((bM79229s2 & 192) != 128) {
                skip(j13);
                return 65533;
            }
            i13 = (i13 << 6) | (bM79229s2 & 63);
        }
        skip(j7);
        if (i13 > 1114111) {
            return 65533;
        }
        if ((55296 > i13 || i13 >= 57344) && i13 >= i15) {
            return i13;
        }
        return 65533;
    }

    /* JADX INFO: renamed from: X0 */
    public final C26624l m79197X0() {
        long j7 = this.f105866x;
        if (j7 <= 2147483647L) {
            return m79213j1((int) j7);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f105866x).toString());
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: Y0 */
    public final int mo79198Y0(C26607c0 options) {
        AbstractC22676k.m65750j(options, "options");
        int iM84150d = AbstractC27881a.m84150d(this, options, false);
        if (iM84150d == -1) {
            return -1;
        }
        skip(options.f105835w[iM84150d].mo79253d());
        return iM84150d;
    }

    /* JADX INFO: renamed from: a0 */
    public final C26612f m79199a0(C26612f unsafeCursor) {
        AbstractC22676k.m65750j(unsafeCursor, "unsafeCursor");
        byte[] bArr = AbstractC27881a.f112425a;
        if (unsafeCursor == AbstractC26604b.f105833a) {
            unsafeCursor = new C26612f();
        }
        if (unsafeCursor.f105853w != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursor.f105853w = this;
        unsafeCursor.f105854x = true;
        return unsafeCursor;
    }

    /* JADX INFO: renamed from: b */
    public final void m79200b() {
        skip(this.f105866x);
    }

    /* JADX INFO: renamed from: b0 */
    public final byte[] m79201b0(long j7) throws EOFException {
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount: ").toString());
        }
        if (this.f105866x < j7) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j7];
        readFully(bArr);
        return bArr;
    }

    public final Object clone() {
        return m79210i();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, ne3.InterfaceC26629n0
    public final void close() {
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: d0 */
    public final boolean mo79202d0(long j7, C26624l bytes) {
        AbstractC22676k.m65750j(bytes, "bytes");
        return m79195T(bytes.mo79253d(), j7, bytes);
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: e */
    public final InterfaceC26618i mo79203e() {
        return this;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: e0 */
    public final long mo79204e0() {
        return AbstractC26604b.m79163h(readLong());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26616h)) {
            return false;
        }
        long j7 = this.f105866x;
        C26616h c26616h = (C26616h) obj;
        if (j7 != c26616h.f105866x) {
            return false;
        }
        if (j7 == 0) {
            return true;
        }
        C26623k0 c26623k0 = this.f105865w;
        AbstractC22676k.m65747g(c26623k0);
        C26623k0 c26623k1 = c26616h.f105865w;
        AbstractC22676k.m65747g(c26623k1);
        int i13 = c26623k0.f105875b;
        int i14 = c26623k1.f105875b;
        long j13 = 0;
        while (j13 < this.f105866x) {
            long jMin = Math.min(c26623k0.f105876c - i13, c26623k1.f105876c - i14);
            long j14 = 0;
            while (j14 < jMin) {
                int i15 = i13 + 1;
                int i16 = i14 + 1;
                if (c26623k0.f105874a[i13] != c26623k1.f105874a[i14]) {
                    return false;
                }
                j14++;
                i13 = i15;
                i14 = i16;
            }
            if (i13 == c26623k0.f105876c) {
                c26623k0 = c26623k0.f105879f;
                AbstractC22676k.m65747g(c26623k0);
                i13 = c26623k0.f105875b;
            }
            if (i14 == c26623k1.f105876c) {
                c26623k1 = c26623k1.f105879f;
                AbstractC22676k.m65747g(c26623k1);
                i14 = c26623k1.f105875b;
            }
            j13 += jMin;
        }
        return true;
    }

    @Override // ne3.InterfaceC26620j, ne3.InterfaceC26618i
    /* JADX INFO: renamed from: f */
    public final C26616h mo79205f() {
        return this;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: f0 */
    public final long mo79206f0(C26624l targetBytes) {
        AbstractC22676k.m65750j(targetBytes, "targetBytes");
        return m79185J(0L, targetBytes);
    }

    @Override // ne3.InterfaceC26618i, ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: g0 */
    public final void mo79207g0(long j7) throws EOFException {
        if (this.f105866x < j7) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: h */
    public final long m79208h() {
        long j7 = this.f105866x;
        if (j7 == 0) {
            return 0L;
        }
        C26623k0 c26623k0 = this.f105865w;
        AbstractC22676k.m65747g(c26623k0);
        C26623k0 c26623k1 = c26623k0.f105880g;
        AbstractC22676k.m65747g(c26623k1);
        int i13 = c26623k1.f105876c;
        return (i13 >= 8192 || !c26623k1.f105878e) ? j7 : j7 - ((long) (i13 - c26623k1.f105875b));
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: h0 */
    public final /* bridge */ /* synthetic */ InterfaceC26618i mo79209h0(long j7) {
        m79221n1(j7);
        return this;
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) {
        AbstractC22676k.m65750j(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount < 0: ").toString());
        }
        long j13 = this.f105866x;
        if (j13 == 0) {
            return -1L;
        }
        if (j7 > j13) {
            j7 = j13;
        }
        sink.write(this, j7);
        return j7;
    }

    public final int hashCode() {
        C26623k0 c26623k0 = this.f105865w;
        if (c26623k0 == null) {
            return 0;
        }
        int i13 = 1;
        do {
            int i14 = c26623k0.f105876c;
            for (int i15 = c26623k0.f105875b; i15 < i14; i15++) {
                i13 = (i13 * 31) + c26623k0.f105874a[i15];
            }
            c26623k0 = c26623k0.f105879f;
            AbstractC22676k.m65747g(c26623k0);
        } while (c26623k0 != this.f105865w);
        return i13;
    }

    /* JADX INFO: renamed from: i */
    public final C26616h m79210i() {
        C26616h c26616h = new C26616h();
        if (this.f105866x == 0) {
            return c26616h;
        }
        C26623k0 c26623k0 = this.f105865w;
        AbstractC22676k.m65747g(c26623k0);
        C26623k0 c26623k0M79245c = c26623k0.m79245c();
        c26616h.f105865w = c26623k0M79245c;
        c26623k0M79245c.f105880g = c26623k0M79245c;
        c26623k0M79245c.f105879f = c26623k0M79245c;
        for (C26623k0 c26623k1 = c26623k0.f105879f; c26623k1 != c26623k0; c26623k1 = c26623k1.f105879f) {
            C26623k0 c26623k2 = c26623k0M79245c.f105880g;
            AbstractC22676k.m65747g(c26623k2);
            AbstractC22676k.m65747g(c26623k1);
            c26623k2.m79244b(c26623k1.m79245c());
        }
        c26616h.f105866x = this.f105866x;
        return c26616h;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: i1 */
    public final InputStream mo79211i1() {
        return new C26614g(this);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: j0 */
    public final void mo79212j0(C26616h c26616h, long j7) throws EOFException {
        long j13 = this.f105866x;
        if (j13 >= j7) {
            c26616h.write(this, j7);
        } else {
            c26616h.write(this, j13);
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final C26624l m79213j1(int i13) {
        if (i13 == 0) {
            return C26624l.f105881E;
        }
        AbstractC26604b.m79160e(this.f105866x, 0L, i13);
        C26623k0 c26623k0 = this.f105865w;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            AbstractC22676k.m65747g(c26623k0);
            int i17 = c26623k0.f105876c;
            int i18 = c26623k0.f105875b;
            if (i17 == i18) {
                throw new AssertionError("s.limit == s.pos");
            }
            i15 += i17 - i18;
            i16++;
            c26623k0 = c26623k0.f105879f;
        }
        byte[][] bArr = new byte[i16][];
        int[] iArr = new int[i16 * 2];
        C26623k0 c26623k1 = this.f105865w;
        int i19 = 0;
        while (i14 < i13) {
            AbstractC22676k.m65747g(c26623k1);
            bArr[i19] = c26623k1.f105874a;
            i14 += c26623k1.f105876c - c26623k1.f105875b;
            iArr[i19] = Math.min(i14, i13);
            iArr[i19 + i16] = c26623k1.f105875b;
            c26623k1.f105877d = true;
            i19++;
            c26623k1 = c26623k1.f105879f;
        }
        return new C26627m0(bArr, iArr);
    }

    /* JADX INFO: renamed from: k */
    public final void m79214k(C26616h out, long j7, long j13) {
        AbstractC22676k.m65750j(out, "out");
        long j14 = j7;
        AbstractC26604b.m79160e(this.f105866x, j14, j13);
        if (j13 == 0) {
            return;
        }
        out.f105866x += j13;
        C26623k0 c26623k0 = this.f105865w;
        while (true) {
            AbstractC22676k.m65747g(c26623k0);
            long j15 = c26623k0.f105876c - c26623k0.f105875b;
            if (j14 < j15) {
                break;
            }
            j14 -= j15;
            c26623k0 = c26623k0.f105879f;
        }
        C26623k0 c26623k1 = c26623k0;
        long j16 = j13;
        while (j16 > 0) {
            AbstractC22676k.m65747g(c26623k1);
            C26623k0 c26623k0M79245c = c26623k1.m79245c();
            int i13 = c26623k0M79245c.f105875b + ((int) j14);
            c26623k0M79245c.f105875b = i13;
            c26623k0M79245c.f105876c = Math.min(i13 + ((int) j16), c26623k0M79245c.f105876c);
            C26623k0 c26623k2 = out.f105865w;
            if (c26623k2 == null) {
                c26623k0M79245c.f105880g = c26623k0M79245c;
                c26623k0M79245c.f105879f = c26623k0M79245c;
                out.f105865w = c26623k0M79245c;
            } else {
                C26623k0 c26623k3 = c26623k2.f105880g;
                AbstractC22676k.m65747g(c26623k3);
                c26623k3.m79244b(c26623k0M79245c);
            }
            j16 -= (long) (c26623k0M79245c.f105876c - c26623k0M79245c.f105875b);
            c26623k1 = c26623k1.f105879f;
            j14 = 0;
        }
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: k0 */
    public final String mo79215k0(long j7) {
        return m79188M0(j7, AbstractC39397a.f169546a);
    }

    /* JADX INFO: renamed from: k1 */
    public final C26623k0 m79216k1(int i13) {
        if (i13 < 1 || i13 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C26623k0 c26623k0 = this.f105865w;
        if (c26623k0 == null) {
            C26623k0 c26623k0M79268b = AbstractC26625l0.m79268b();
            this.f105865w = c26623k0M79268b;
            c26623k0M79268b.f105880g = c26623k0M79268b;
            c26623k0M79268b.f105879f = c26623k0M79268b;
            return c26623k0M79268b;
        }
        C26623k0 c26623k1 = c26623k0.f105880g;
        AbstractC22676k.m65747g(c26623k1);
        if (c26623k1.f105876c + i13 <= 8192 && c26623k1.f105878e) {
            return c26623k1;
        }
        C26623k0 c26623k0M79268b2 = AbstractC26625l0.m79268b();
        c26623k1.m79244b(c26623k0M79268b2);
        return c26623k0M79268b2;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m79217l1(C26624l byteString) {
        AbstractC22676k.m65750j(byteString, "byteString");
        byteString.mo79266t(this, byteString.mo79253d());
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: m0 */
    public final C26624l mo79218m0(long j7) throws EOFException {
        if (j7 < 0 || j7 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount: ").toString());
        }
        if (this.f105866x < j7) {
            throw new EOFException();
        }
        if (j7 < 4096) {
            return new C26624l(m79201b0(j7));
        }
        C26624l c26624lM79213j1 = m79213j1((int) j7);
        skip(j7);
        return c26624lM79213j1;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m79219m1(int i13) {
        C26623k0 c26623k0M79216k1 = m79216k1(1);
        byte[] bArr = c26623k0M79216k1.f105874a;
        int i14 = c26623k0M79216k1.f105876c;
        c26623k0M79216k1.f105876c = i14 + 1;
        bArr[i14] = (byte) i13;
        this.f105866x++;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: n */
    public final byte[] mo79220n() {
        return m79201b0(this.f105866x);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m79221n1(long j7) {
        boolean z4;
        if (j7 == 0) {
            m79219m1(48);
            return;
        }
        if (j7 < 0) {
            j7 = -j7;
            if (j7 < 0) {
                m79232u1("-9223372036854775808");
                return;
            }
            z4 = true;
        } else {
            z4 = false;
        }
        byte[] bArr = AbstractC27881a.f112425a;
        int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j7)) * 10) >>> 5;
        int i13 = iNumberOfLeadingZeros + (j7 > AbstractC27881a.f112426b[iNumberOfLeadingZeros] ? 1 : 0);
        if (z4) {
            i13++;
        }
        C26623k0 c26623k0M79216k1 = m79216k1(i13);
        byte[] bArr2 = c26623k0M79216k1.f105874a;
        int i14 = c26623k0M79216k1.f105876c + i13;
        while (j7 != 0) {
            long j13 = 10;
            i14--;
            bArr2[i14] = AbstractC27881a.f112425a[(int) (j7 % j13)];
            j7 /= j13;
        }
        if (z4) {
            bArr2[i14 - 1] = 45;
        }
        c26623k0M79216k1.f105876c += i13;
        this.f105866x += (long) i13;
    }

    @Override // ne3.InterfaceC26620j
    /* JADX INFO: renamed from: o */
    public final boolean mo79222o() {
        return this.f105866x == 0;
    }

    /* JADX INFO: renamed from: o0 */
    public final long m79223o0() throws EOFException {
        long j7;
        byte b;
        long j13 = 0;
        if (this.f105866x == 0) {
            throw new EOFException();
        }
        int i13 = 0;
        boolean z4 = false;
        long j14 = 0;
        long j15 = -7;
        boolean z13 = false;
        loop0: while (true) {
            C26623k0 c26623k0 = this.f105865w;
            AbstractC22676k.m65747g(c26623k0);
            byte[] bArr = c26623k0.f105874a;
            int i14 = c26623k0.f105875b;
            int i15 = c26623k0.f105876c;
            while (true) {
                if (i14 >= i15) {
                    j7 = j13;
                    break;
                }
                b = bArr[i14];
                if (b >= 48 && b <= 57) {
                    int i16 = 48 - b;
                    if (j14 < -922337203685477580L) {
                        break loop0;
                    }
                    j7 = j13;
                    if (j14 == -922337203685477580L && i16 < j15) {
                        break loop0;
                    }
                    j14 = (j14 * 10) + ((long) i16);
                } else {
                    j7 = j13;
                    if (b != 45 || i13 != 0) {
                        z13 = true;
                        break;
                    }
                    j15--;
                    z4 = true;
                }
                i14++;
                i13++;
                j13 = j7;
            }
            if (i14 == i15) {
                this.f105865w = c26623k0.m79243a();
                AbstractC26625l0.m79267a(c26623k0);
            } else {
                c26623k0.f105875b = i14;
            }
            if (z13 || this.f105865w == null) {
                long j16 = this.f105866x - ((long) i13);
                this.f105866x = j16;
                if (i13 >= (z4 ? 2 : 1)) {
                    return z4 ? j14 : -j14;
                }
                if (j16 == j7) {
                    throw new EOFException();
                }
                StringBuilder sbM35484d = AbstractC12682p.m35484d(z4 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
                sbM35484d.append(AbstractC26604b.m79167l(m79229s(j7)));
                throw new NumberFormatException(sbM35484d.toString());
            }
            j13 = j7;
        }
        C26616h c26616h = new C26616h();
        c26616h.m79221n1(j14);
        c26616h.m79219m1(b);
        if (!z4) {
            c26616h.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(c26616h.m79194S0()));
    }

    /* JADX INFO: renamed from: o1 */
    public final void m79224o1(long j7) {
        if (j7 == 0) {
            m79219m1(48);
            return;
        }
        long j13 = (j7 >>> 1) | j7;
        long j14 = j13 | (j13 >>> 2);
        long j15 = j14 | (j14 >>> 4);
        long j16 = j15 | (j15 >>> 8);
        long j17 = j16 | (j16 >>> 16);
        long j18 = j17 | (j17 >>> 32);
        long j19 = j18 - ((j18 >>> 1) & 6148914691236517205L);
        long j24 = ((j19 >>> 2) & 3689348814741910323L) + (j19 & 3689348814741910323L);
        long j25 = ((j24 >>> 4) + j24) & 1085102592571150095L;
        long j26 = j25 + (j25 >>> 8);
        long j27 = j26 + (j26 >>> 16);
        int i13 = (int) ((((j27 & 63) + ((j27 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        C26623k0 c26623k0M79216k1 = m79216k1(i13);
        byte[] bArr = c26623k0M79216k1.f105874a;
        int i14 = c26623k0M79216k1.f105876c;
        for (int i15 = (i14 + i13) - 1; i15 >= i14; i15--) {
            bArr[i15] = AbstractC27881a.f112425a[(int) (15 & j7)];
            j7 >>>= 4;
        }
        c26623k0M79216k1.f105876c += i13;
        this.f105866x += (long) i13;
    }

    /* JADX INFO: renamed from: p0 */
    public final long m79225p0() throws EOFException {
        int i13;
        if (this.f105866x == 0) {
            throw new EOFException();
        }
        int i14 = 0;
        boolean z4 = false;
        long j7 = 0;
        do {
            C26623k0 c26623k0 = this.f105865w;
            AbstractC22676k.m65747g(c26623k0);
            byte[] bArr = c26623k0.f105874a;
            int i15 = c26623k0.f105875b;
            int i16 = c26623k0.f105876c;
            while (i15 < i16) {
                byte b = bArr[i15];
                if (b >= 48 && b <= 57) {
                    i13 = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i13 = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i14 == 0) {
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(AbstractC26604b.m79167l(b)));
                        }
                        z4 = true;
                        break;
                    }
                    i13 = b - 55;
                }
                if (((-1152921504606846976L) & j7) != 0) {
                    C26616h c26616h = new C26616h();
                    c26616h.m79224o1(j7);
                    c26616h.m79219m1(b);
                    throw new NumberFormatException("Number too large: ".concat(c26616h.m79194S0()));
                }
                j7 = (j7 << 4) | ((long) i13);
                i15++;
                i14++;
            }
            if (i15 == i16) {
                this.f105865w = c26623k0.m79243a();
                AbstractC26625l0.m79267a(c26623k0);
            } else {
                c26623k0.f105875b = i15;
            }
            if (z4) {
                break;
            }
        } while (this.f105865w != null);
        this.f105866x -= (long) i14;
        return j7;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m79226p1(int i13) {
        C26623k0 c26623k0M79216k1 = m79216k1(4);
        byte[] bArr = c26623k0M79216k1.f105874a;
        int i14 = c26623k0M79216k1.f105876c;
        bArr[i14] = (byte) ((i13 >>> 24) & 255);
        bArr[i14 + 1] = (byte) ((i13 >>> 16) & 255);
        bArr[i14 + 2] = (byte) ((i13 >>> 8) & 255);
        bArr[i14 + 3] = (byte) (i13 & 255);
        c26623k0M79216k1.f105876c = i14 + 4;
        this.f105866x += 4;
    }

    @Override // ne3.InterfaceC26620j
    public final C26621j0 peek() {
        return AbstractC26604b.m79158c(new C26613f0(this));
    }

    /* JADX INFO: renamed from: q1 */
    public final void m79227q1(long j7) {
        C26623k0 c26623k0M79216k1 = m79216k1(8);
        byte[] bArr = c26623k0M79216k1.f105874a;
        int i13 = c26623k0M79216k1.f105876c;
        bArr[i13] = (byte) ((j7 >>> 56) & 255);
        bArr[i13 + 1] = (byte) ((j7 >>> 48) & 255);
        bArr[i13 + 2] = (byte) ((j7 >>> 40) & 255);
        bArr[i13 + 3] = (byte) ((j7 >>> 32) & 255);
        bArr[i13 + 4] = (byte) ((j7 >>> 24) & 255);
        bArr[i13 + 5] = (byte) ((j7 >>> 16) & 255);
        bArr[i13 + 6] = (byte) ((j7 >>> 8) & 255);
        bArr[i13 + 7] = (byte) (j7 & 255);
        c26623k0M79216k1.f105876c = i13 + 8;
        this.f105866x += 8;
    }

    /* JADX INFO: renamed from: r1 */
    public final void m79228r1(int i13) {
        C26623k0 c26623k0M79216k1 = m79216k1(2);
        byte[] bArr = c26623k0M79216k1.f105874a;
        int i14 = c26623k0M79216k1.f105876c;
        bArr[i14] = (byte) ((i13 >>> 8) & 255);
        bArr[i14 + 1] = (byte) (i13 & 255);
        c26623k0M79216k1.f105876c = i14 + 2;
        this.f105866x += 2;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        AbstractC22676k.m65750j(sink, "sink");
        C26623k0 c26623k0 = this.f105865w;
        if (c26623k0 == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), c26623k0.f105876c - c26623k0.f105875b);
        sink.put(c26623k0.f105874a, c26623k0.f105875b, iMin);
        int i13 = c26623k0.f105875b + iMin;
        c26623k0.f105875b = i13;
        this.f105866x -= (long) iMin;
        if (i13 == c26623k0.f105876c) {
            this.f105865w = c26623k0.m79243a();
            AbstractC26625l0.m79267a(c26623k0);
        }
        return iMin;
    }

    @Override // ne3.InterfaceC26620j
    public final byte readByte() {
        if (this.f105866x == 0) {
            throw new EOFException();
        }
        C26623k0 c26623k0 = this.f105865w;
        AbstractC22676k.m65747g(c26623k0);
        int i13 = c26623k0.f105875b;
        int i14 = c26623k0.f105876c;
        int i15 = i13 + 1;
        byte b = c26623k0.f105874a[i13];
        this.f105866x--;
        if (i15 != i14) {
            c26623k0.f105875b = i15;
            return b;
        }
        this.f105865w = c26623k0.m79243a();
        AbstractC26625l0.m79267a(c26623k0);
        return b;
    }

    @Override // ne3.InterfaceC26620j
    public final void readFully(byte[] sink) throws EOFException {
        AbstractC22676k.m65750j(sink, "sink");
        int i13 = 0;
        while (i13 < sink.length) {
            int i14 = read(sink, i13, sink.length - i13);
            if (i14 == -1) {
                throw new EOFException();
            }
            i13 += i14;
        }
    }

    @Override // ne3.InterfaceC26620j
    public final int readInt() throws EOFException {
        if (this.f105866x < 4) {
            throw new EOFException();
        }
        C26623k0 c26623k0 = this.f105865w;
        AbstractC22676k.m65747g(c26623k0);
        int i13 = c26623k0.f105875b;
        int i14 = c26623k0.f105876c;
        if (i14 - i13 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c26623k0.f105874a;
        int i15 = i13 + 3;
        int i16 = ((bArr[i13 + 1] & 255) << 16) | ((bArr[i13] & 255) << 24) | ((bArr[i13 + 2] & 255) << 8);
        int i17 = i13 + 4;
        int i18 = (bArr[i15] & 255) | i16;
        this.f105866x -= 4;
        if (i17 != i14) {
            c26623k0.f105875b = i17;
            return i18;
        }
        this.f105865w = c26623k0.m79243a();
        AbstractC26625l0.m79267a(c26623k0);
        return i18;
    }

    @Override // ne3.InterfaceC26620j
    public final long readLong() throws EOFException {
        if (this.f105866x < 8) {
            throw new EOFException();
        }
        C26623k0 c26623k0 = this.f105865w;
        AbstractC22676k.m65747g(c26623k0);
        int i13 = c26623k0.f105875b;
        int i14 = c26623k0.f105876c;
        if (i14 - i13 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = c26623k0.f105874a;
        int i15 = i13 + 7;
        long j7 = ((((long) bArr[i13]) & 255) << 56) | ((((long) bArr[i13 + 1]) & 255) << 48) | ((((long) bArr[i13 + 2]) & 255) << 40) | ((((long) bArr[i13 + 3]) & 255) << 32) | ((((long) bArr[i13 + 4]) & 255) << 24) | ((((long) bArr[i13 + 5]) & 255) << 16) | ((((long) bArr[i13 + 6]) & 255) << 8);
        int i16 = i13 + 8;
        long j13 = j7 | (((long) bArr[i15]) & 255);
        this.f105866x -= 8;
        if (i16 != i14) {
            c26623k0.f105875b = i16;
            return j13;
        }
        this.f105865w = c26623k0.m79243a();
        AbstractC26625l0.m79267a(c26623k0);
        return j13;
    }

    @Override // ne3.InterfaceC26620j
    public final short readShort() throws EOFException {
        if (this.f105866x < 2) {
            throw new EOFException();
        }
        C26623k0 c26623k0 = this.f105865w;
        AbstractC22676k.m65747g(c26623k0);
        int i13 = c26623k0.f105875b;
        int i14 = c26623k0.f105876c;
        if (i14 - i13 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c26623k0.f105874a;
        int i15 = i13 + 1;
        int i16 = (bArr[i13] & 255) << 8;
        int i17 = i13 + 2;
        int i18 = (bArr[i15] & 255) | i16;
        this.f105866x -= 2;
        if (i17 == i14) {
            this.f105865w = c26623k0.m79243a();
            AbstractC26625l0.m79267a(c26623k0);
        } else {
            c26623k0.f105875b = i17;
        }
        return (short) i18;
    }

    @Override // ne3.InterfaceC26620j
    public final boolean request(long j7) {
        return this.f105866x >= j7;
    }

    /* JADX INFO: renamed from: s */
    public final byte m79229s(long j7) {
        AbstractC26604b.m79160e(this.f105866x, j7, 1L);
        C26623k0 c26623k0 = this.f105865w;
        if (c26623k0 == null) {
            AbstractC22676k.m65747g(null);
            throw null;
        }
        long j13 = this.f105866x;
        if (j13 - j7 < j7) {
            while (j13 > j7) {
                c26623k0 = c26623k0.f105880g;
                AbstractC22676k.m65747g(c26623k0);
                j13 -= (long) (c26623k0.f105876c - c26623k0.f105875b);
            }
            return c26623k0.f105874a[(int) ((((long) c26623k0.f105875b) + j7) - j13)];
        }
        long j14 = 0;
        while (true) {
            int i13 = c26623k0.f105876c;
            int i14 = c26623k0.f105875b;
            long j15 = ((long) (i13 - i14)) + j14;
            if (j15 > j7) {
                return c26623k0.f105874a[(int) ((((long) i14) + j7) - j14)];
            }
            c26623k0 = c26623k0.f105879f;
            AbstractC22676k.m65747g(c26623k0);
            j14 = j15;
        }
    }

    /* JADX INFO: renamed from: s1 */
    public final void m79230s1(OutputStream out, long j7) throws IOException {
        AbstractC22676k.m65750j(out, "out");
        AbstractC26604b.m79160e(this.f105866x, 0L, j7);
        C26623k0 c26623k0 = this.f105865w;
        long j13 = j7;
        while (j13 > 0) {
            AbstractC22676k.m65747g(c26623k0);
            int iMin = (int) Math.min(j13, c26623k0.f105876c - c26623k0.f105875b);
            out.write(c26623k0.f105874a, c26623k0.f105875b, iMin);
            int i13 = c26623k0.f105875b + iMin;
            c26623k0.f105875b = i13;
            long j14 = iMin;
            this.f105866x -= j14;
            j13 -= j14;
            if (i13 == c26623k0.f105876c) {
                C26623k0 c26623k0M79243a = c26623k0.m79243a();
                this.f105865w = c26623k0M79243a;
                AbstractC26625l0.m79267a(c26623k0);
                c26623k0 = c26623k0M79243a;
            }
        }
    }

    @Override // ne3.InterfaceC26620j
    public final void skip(long j7) {
        while (j7 > 0) {
            C26623k0 c26623k0 = this.f105865w;
            if (c26623k0 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j7, c26623k0.f105876c - c26623k0.f105875b);
            long j13 = iMin;
            this.f105866x -= j13;
            j7 -= j13;
            int i13 = c26623k0.f105875b + iMin;
            c26623k0.f105875b = i13;
            if (i13 == c26623k0.f105876c) {
                this.f105865w = c26623k0.m79243a();
                AbstractC26625l0.m79267a(c26623k0);
            }
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final void m79231t1(int i13, int i14, String string) {
        char cCharAt;
        AbstractC22676k.m65750j(string, "string");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "beginIndex < 0: ").toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i14, i13, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i14 > string.length()) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i14, "endIndex > string.length: ", " > ");
            sbM30466t.append(string.length());
            throw new IllegalArgumentException(sbM30466t.toString().toString());
        }
        while (i13 < i14) {
            char cCharAt2 = string.charAt(i13);
            if (cCharAt2 < 128) {
                C26623k0 c26623k0M79216k1 = m79216k1(1);
                byte[] bArr = c26623k0M79216k1.f105874a;
                int i15 = c26623k0M79216k1.f105876c - i13;
                int iMin = Math.min(i14, 8192 - i15);
                int i16 = i13 + 1;
                bArr[i13 + i15] = (byte) cCharAt2;
                while (true) {
                    i13 = i16;
                    if (i13 >= iMin || (cCharAt = string.charAt(i13)) >= 128) {
                        break;
                    }
                    i16 = i13 + 1;
                    bArr[i13 + i15] = (byte) cCharAt;
                }
                int i17 = c26623k0M79216k1.f105876c;
                int i18 = (i15 + i13) - i17;
                c26623k0M79216k1.f105876c = i17 + i18;
                this.f105866x += (long) i18;
            } else {
                if (cCharAt2 < 2048) {
                    C26623k0 c26623k0M79216k2 = m79216k1(2);
                    byte[] bArr2 = c26623k0M79216k2.f105874a;
                    int i19 = c26623k0M79216k2.f105876c;
                    bArr2[i19] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i19 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c26623k0M79216k2.f105876c = i19 + 2;
                    this.f105866x += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C26623k0 c26623k0M79216k3 = m79216k1(3);
                    byte[] bArr3 = c26623k0M79216k3.f105874a;
                    int i24 = c26623k0M79216k3.f105876c;
                    bArr3[i24] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i24 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i24 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c26623k0M79216k3.f105876c = i24 + 3;
                    this.f105866x += 3;
                } else {
                    int i25 = i13 + 1;
                    char cCharAt3 = i25 < i14 ? string.charAt(i25) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m79219m1(63);
                        i13 = i25;
                    } else {
                        int i26 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        C26623k0 c26623k0M79216k4 = m79216k1(4);
                        byte[] bArr4 = c26623k0M79216k4.f105874a;
                        int i27 = c26623k0M79216k4.f105876c;
                        bArr4[i27] = (byte) ((i26 >> 18) | 240);
                        bArr4[i27 + 1] = (byte) (((i26 >> 12) & 63) | 128);
                        bArr4[i27 + 2] = (byte) (((i26 >> 6) & 63) | 128);
                        bArr4[i27 + 3] = (byte) ((i26 & 63) | 128);
                        c26623k0M79216k4.f105876c = i27 + 4;
                        this.f105866x += 4;
                        i13 += 2;
                    }
                }
                i13++;
            }
        }
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return C26637r0.f105903d;
    }

    public final String toString() {
        return m79197X0().toString();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m79232u1(String string) {
        AbstractC22676k.m65750j(string, "string");
        m79231t1(0, string.length(), string);
    }

    @Override // ne3.InterfaceC26618i
    /* JADX INFO: renamed from: v0 */
    public final InterfaceC26618i mo79233v0(int i13) {
        m79226p1(AbstractC26604b.m79162g(i13));
        return this;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m79234v1(int i13) {
        if (i13 < 128) {
            m79219m1(i13);
            return;
        }
        if (i13 < 2048) {
            C26623k0 c26623k0M79216k1 = m79216k1(2);
            byte[] bArr = c26623k0M79216k1.f105874a;
            int i14 = c26623k0M79216k1.f105876c;
            bArr[i14] = (byte) ((i13 >> 6) | 192);
            bArr[i14 + 1] = (byte) ((i13 & 63) | 128);
            c26623k0M79216k1.f105876c = i14 + 2;
            this.f105866x += 2;
            return;
        }
        if (55296 <= i13 && i13 < 57344) {
            m79219m1(63);
            return;
        }
        if (i13 < 65536) {
            C26623k0 c26623k0M79216k2 = m79216k1(3);
            byte[] bArr2 = c26623k0M79216k2.f105874a;
            int i15 = c26623k0M79216k2.f105876c;
            bArr2[i15] = (byte) ((i13 >> 12) | 224);
            bArr2[i15 + 1] = (byte) (((i13 >> 6) & 63) | 128);
            bArr2[i15 + 2] = (byte) ((i13 & 63) | 128);
            c26623k0M79216k2.f105876c = i15 + 3;
            this.f105866x += 3;
            return;
        }
        if (i13 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(AbstractC26604b.m79168m(i13)));
        }
        C26623k0 c26623k0M79216k3 = m79216k1(4);
        byte[] bArr3 = c26623k0M79216k3.f105874a;
        int i16 = c26623k0M79216k3.f105876c;
        bArr3[i16] = (byte) ((i13 >> 18) | 240);
        bArr3[i16 + 1] = (byte) (((i13 >> 12) & 63) | 128);
        bArr3[i16 + 2] = (byte) (((i13 >> 6) & 63) | 128);
        bArr3[i16 + 3] = (byte) ((i13 & 63) | 128);
        c26623k0M79216k3.f105876c = i16 + 4;
        this.f105866x += 4;
    }

    @Override // ne3.InterfaceC26618i
    public final /* bridge */ /* synthetic */ InterfaceC26618i write(byte[] bArr) {
        m134462write(bArr);
        return this;
    }

    @Override // ne3.InterfaceC26618i
    public final /* bridge */ /* synthetic */ InterfaceC26618i writeByte(int i13) {
        m79219m1(i13);
        return this;
    }

    @Override // ne3.InterfaceC26618i
    public final /* bridge */ /* synthetic */ InterfaceC26618i writeInt(int i13) {
        m79226p1(i13);
        return this;
    }

    @Override // ne3.InterfaceC26618i
    public final /* bridge */ /* synthetic */ InterfaceC26618i writeShort(int i13) {
        m79228r1(i13);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final long m79235x(byte b, long j7, long j13) {
        C26623k0 c26623k0;
        long j14 = j7;
        long j15 = j13;
        long j16 = 0;
        if (0 > j14 || j14 > j15) {
            StringBuilder sb4 = new StringBuilder("size=");
            sb4.append(this.f105866x);
            AbstractC2875y.m8285A(sb4, " fromIndex=", j14, " toIndex=");
            sb4.append(j15);
            throw new IllegalArgumentException(sb4.toString().toString());
        }
        long j17 = this.f105866x;
        if (j15 > j17) {
            j15 = j17;
        }
        long j18 = -1;
        if (j14 == j15 || (c26623k0 = this.f105865w) == null) {
            return -1L;
        }
        if (j17 - j14 < j14) {
            while (j17 > j14) {
                c26623k0 = c26623k0.f105880g;
                AbstractC22676k.m65747g(c26623k0);
                j17 -= (long) (c26623k0.f105876c - c26623k0.f105875b);
            }
            while (j17 < j15) {
                byte[] bArr = c26623k0.f105874a;
                long j19 = j18;
                int iMin = (int) Math.min(c26623k0.f105876c, (((long) c26623k0.f105875b) + j15) - j17);
                for (int i13 = (int) ((((long) c26623k0.f105875b) + j14) - j17); i13 < iMin; i13++) {
                    if (bArr[i13] == b) {
                        return ((long) (i13 - c26623k0.f105875b)) + j17;
                    }
                }
                j17 += (long) (c26623k0.f105876c - c26623k0.f105875b);
                c26623k0 = c26623k0.f105879f;
                AbstractC22676k.m65747g(c26623k0);
                j18 = j19;
                j14 = j17;
            }
            return j18;
        }
        while (true) {
            long j24 = ((long) (c26623k0.f105876c - c26623k0.f105875b)) + j16;
            if (j24 > j14) {
                break;
            }
            c26623k0 = c26623k0.f105879f;
            AbstractC22676k.m65747g(c26623k0);
            j16 = j24;
        }
        while (j16 < j15) {
            byte[] bArr2 = c26623k0.f105874a;
            int iMin2 = (int) Math.min(c26623k0.f105876c, (((long) c26623k0.f105875b) + j15) - j16);
            for (int i14 = (int) ((((long) c26623k0.f105875b) + j14) - j16); i14 < iMin2; i14++) {
                if (bArr2[i14] == b) {
                    return ((long) (i14 - c26623k0.f105875b)) + j16;
                }
            }
            j16 += (long) (c26623k0.f105876c - c26623k0.f105875b);
            c26623k0 = c26623k0.f105879f;
            AbstractC22676k.m65747g(c26623k0);
            j14 = j16;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: x0 */
    public final short m79236x0() throws EOFException {
        short s13 = readShort();
        return (short) (((s13 & 255) << 8) | ((65280 & s13) >>> 8));
    }

    @Override // ne3.InterfaceC26618i
    public final /* bridge */ /* synthetic */ InterfaceC26618i write(byte[] bArr, int i13, int i14) {
        m134463write(bArr, i13, i14);
        return this;
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        C26623k0 c26623k0M79268b;
        AbstractC22676k.m65750j(source, "source");
        if (source != this) {
            AbstractC26604b.m79160e(source.f105866x, 0L, j7);
            while (j7 > 0) {
                C26623k0 c26623k0 = source.f105865w;
                AbstractC22676k.m65747g(c26623k0);
                int i13 = c26623k0.f105876c;
                C26623k0 c26623k1 = source.f105865w;
                AbstractC22676k.m65747g(c26623k1);
                long j13 = i13 - c26623k1.f105875b;
                int i14 = 0;
                if (j7 < j13) {
                    C26623k0 c26623k2 = this.f105865w;
                    C26623k0 c26623k3 = c26623k2 != null ? c26623k2.f105880g : null;
                    if (c26623k3 != null && c26623k3.f105878e) {
                        if ((((long) c26623k3.f105876c) + j7) - ((long) (c26623k3.f105877d ? 0 : c26623k3.f105875b)) <= HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) {
                            C26623k0 c26623k4 = source.f105865w;
                            AbstractC22676k.m65747g(c26623k4);
                            c26623k4.m79246d(c26623k3, (int) j7);
                            source.f105866x -= j7;
                            this.f105866x += j7;
                            return;
                        }
                    }
                    C26623k0 c26623k5 = source.f105865w;
                    AbstractC22676k.m65747g(c26623k5);
                    int i15 = (int) j7;
                    if (i15 > 0 && i15 <= c26623k5.f105876c - c26623k5.f105875b) {
                        if (i15 >= 1024) {
                            c26623k0M79268b = c26623k5.m79245c();
                        } else {
                            c26623k0M79268b = AbstractC26625l0.m79268b();
                            byte[] bArr = c26623k5.f105874a;
                            byte[] bArr2 = c26623k0M79268b.f105874a;
                            int i16 = c26623k5.f105875b;
                            AbstractC25260n.m74067h0(i16, i16 + i15, 2, bArr, bArr2);
                        }
                        c26623k0M79268b.f105876c = c26623k0M79268b.f105875b + i15;
                        c26623k5.f105875b += i15;
                        C26623k0 c26623k6 = c26623k5.f105880g;
                        AbstractC22676k.m65747g(c26623k6);
                        c26623k6.m79244b(c26623k0M79268b);
                        source.f105865w = c26623k0M79268b;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                C26623k0 c26623k7 = source.f105865w;
                AbstractC22676k.m65747g(c26623k7);
                long j14 = c26623k7.f105876c - c26623k7.f105875b;
                source.f105865w = c26623k7.m79243a();
                C26623k0 c26623k8 = this.f105865w;
                if (c26623k8 == null) {
                    this.f105865w = c26623k7;
                    c26623k7.f105880g = c26623k7;
                    c26623k7.f105879f = c26623k7;
                } else {
                    C26623k0 c26623k9 = c26623k8.f105880g;
                    AbstractC22676k.m65747g(c26623k9);
                    c26623k9.m79244b(c26623k7);
                    C26623k0 c26623k10 = c26623k7.f105880g;
                    if (c26623k10 != c26623k7) {
                        AbstractC22676k.m65747g(c26623k10);
                        if (c26623k10.f105878e) {
                            int i17 = c26623k7.f105876c - c26623k7.f105875b;
                            C26623k0 c26623k11 = c26623k7.f105880g;
                            AbstractC22676k.m65747g(c26623k11);
                            int i18 = 8192 - c26623k11.f105876c;
                            C26623k0 c26623k12 = c26623k7.f105880g;
                            AbstractC22676k.m65747g(c26623k12);
                            if (!c26623k12.f105877d) {
                                C26623k0 c26623k13 = c26623k7.f105880g;
                                AbstractC22676k.m65747g(c26623k13);
                                i14 = c26623k13.f105875b;
                            }
                            if (i17 <= i18 + i14) {
                                C26623k0 c26623k14 = c26623k7.f105880g;
                                AbstractC22676k.m65747g(c26623k14);
                                c26623k7.m79246d(c26623k14, i17);
                                c26623k7.m79243a();
                                AbstractC26625l0.m79267a(c26623k7);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                source.f105866x -= j14;
                this.f105866x += j14;
                j7 -= j14;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public final int read(byte[] sink, int i13, int i14) {
        AbstractC22676k.m65750j(sink, "sink");
        AbstractC26604b.m79160e(sink.length, i13, i14);
        C26623k0 c26623k0 = this.f105865w;
        if (c26623k0 == null) {
            return -1;
        }
        int iMin = Math.min(i14, c26623k0.f105876c - c26623k0.f105875b);
        byte[] bArr = c26623k0.f105874a;
        int i15 = c26623k0.f105875b;
        AbstractC25260n.m74060c0(i13, i15, i15 + iMin, bArr, sink);
        int i16 = c26623k0.f105875b + iMin;
        c26623k0.f105875b = i16;
        this.f105866x -= (long) iMin;
        if (i16 == c26623k0.f105876c) {
            this.f105865w = c26623k0.m79243a();
            AbstractC26625l0.m79267a(c26623k0);
        }
        return iMin;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        AbstractC22676k.m65750j(source, "source");
        int iRemaining = source.remaining();
        int i13 = iRemaining;
        while (i13 > 0) {
            C26623k0 c26623k0M79216k1 = m79216k1(1);
            int iMin = Math.min(i13, 8192 - c26623k0M79216k1.f105876c);
            source.get(c26623k0M79216k1.f105874a, c26623k0M79216k1.f105876c, iMin);
            i13 -= iMin;
            c26623k0M79216k1.f105876c += iMin;
        }
        this.f105866x += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m134462write(byte[] source) {
        AbstractC22676k.m65750j(source, "source");
        m134463write(source, 0, source.length);
    }

    /* JADX INFO: renamed from: write, reason: collision with other method in class */
    public final void m134463write(byte[] source, int i13, int i14) {
        AbstractC22676k.m65750j(source, "source");
        long j7 = i14;
        AbstractC26604b.m79160e(source.length, i13, j7);
        int i15 = i14 + i13;
        while (i13 < i15) {
            C26623k0 c26623k0M79216k1 = m79216k1(1);
            int iMin = Math.min(i15 - i13, 8192 - c26623k0M79216k1.f105876c);
            int i16 = i13 + iMin;
            AbstractC25260n.m74060c0(c26623k0M79216k1.f105876c, i13, i16, source, c26623k0M79216k1.f105874a);
            c26623k0M79216k1.f105876c += iMin;
            i13 = i16;
        }
        this.f105866x += j7;
    }
}
