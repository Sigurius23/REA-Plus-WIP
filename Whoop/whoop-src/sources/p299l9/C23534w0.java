package p299l9;

import ai.C0902h;
import android.media.MediaCodec;
import ed3.C13117a;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p010a9.C0578c;
import p010a9.C0580e;
import p122em.C13322b;
import p284ko.C22606a;
import p284ko.C22631o;
import p309lo.AbstractC24567y;
import p398p9.C28977a;
import p499t9.C33637j0;
import p499t9.C33652u;
import p527um.C35073c;
import p588wm.C37376r;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p619xl.C38445a;

/* JADX INFO: renamed from: l9.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23534w0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93188a = 1;

    /* JADX INFO: renamed from: b */
    public final int f93189b;

    /* JADX INFO: renamed from: c */
    public long f93190c;

    /* JADX INFO: renamed from: d */
    public final Object f93191d;

    /* JADX INFO: renamed from: e */
    public final Object f93192e;

    /* JADX INFO: renamed from: f */
    public Object f93193f;

    /* JADX INFO: renamed from: g */
    public Object f93194g;

    /* JADX INFO: renamed from: h */
    public Object f93195h;

    public C23534w0(C22631o c22631o) {
        this.f93191d = c22631o;
        int i13 = c22631o.f89028c;
        this.f93189b = i13;
        this.f93192e = new C13117a(32);
        C0902h c0902h = new C0902h(i13, 0L, 9);
        this.f93193f = c0902h;
        this.f93194g = c0902h;
        this.f93195h = c0902h;
    }

    /* JADX INFO: renamed from: e */
    public static C0902h m68110e(C0902h c0902h, long j7, ByteBuffer byteBuffer, int i13) {
        while (j7 >= c0902h.f3296y) {
            c0902h = (C0902h) c0902h.f3293E;
        }
        while (i13 > 0) {
            int iMin = Math.min(i13, (int) (c0902h.f3296y - j7));
            C28977a c28977a = (C28977a) c0902h.f3297z;
            byteBuffer.put(c28977a.f117213a, ((int) (j7 - c0902h.f3295x)) + c28977a.f117214b, iMin);
            i13 -= iMin;
            j7 += (long) iMin;
            if (j7 == c0902h.f3296y) {
                c0902h = (C0902h) c0902h.f3293E;
            }
        }
        return c0902h;
    }

    /* JADX INFO: renamed from: f */
    public static C0902h m68111f(C0902h c0902h, long j7, byte[] bArr, int i13) {
        while (j7 >= c0902h.f3296y) {
            c0902h = (C0902h) c0902h.f3293E;
        }
        int i14 = i13;
        while (i14 > 0) {
            int iMin = Math.min(i14, (int) (c0902h.f3296y - j7));
            C28977a c28977a = (C28977a) c0902h.f3297z;
            System.arraycopy(c28977a.f117213a, ((int) (j7 - c0902h.f3295x)) + c28977a.f117214b, bArr, i13 - i14, iMin);
            i14 -= iMin;
            j7 += (long) iMin;
            if (j7 == c0902h.f3296y) {
                c0902h = (C0902h) c0902h.f3293E;
            }
        }
        return c0902h;
    }

    /* JADX INFO: renamed from: g */
    public static C0902h m68112g(C0902h c0902h, long j7, ByteBuffer byteBuffer, int i13) {
        while (j7 >= c0902h.f3296y) {
            c0902h = (C0902h) c0902h.f3293E;
        }
        while (i13 > 0) {
            int iMin = Math.min(i13, (int) (c0902h.f3296y - j7));
            C22606a c22606a = (C22606a) c0902h.f3297z;
            byteBuffer.put(c22606a.f88944a, ((int) (j7 - c0902h.f3295x)) + c22606a.f88945b, iMin);
            i13 -= iMin;
            j7 += (long) iMin;
            if (j7 == c0902h.f3296y) {
                c0902h = (C0902h) c0902h.f3293E;
            }
        }
        return c0902h;
    }

    /* JADX INFO: renamed from: h */
    public static C0902h m68113h(C0902h c0902h, long j7, byte[] bArr, int i13) {
        while (j7 >= c0902h.f3296y) {
            c0902h = (C0902h) c0902h.f3293E;
        }
        int i14 = i13;
        while (i14 > 0) {
            int iMin = Math.min(i14, (int) (c0902h.f3296y - j7));
            C22606a c22606a = (C22606a) c0902h.f3297z;
            System.arraycopy(c22606a.f88944a, ((int) (j7 - c0902h.f3295x)) + c22606a.f88945b, bArr, i13 - i14, iMin);
            i14 -= iMin;
            j7 += (long) iMin;
            if (j7 == c0902h.f3296y) {
                c0902h = (C0902h) c0902h.f3293E;
            }
        }
        return c0902h;
    }

    /* JADX INFO: renamed from: i */
    public static C0902h m68114i(C0902h c0902h, C0580e c0580e, C13322b c13322b, C38059n c38059n) {
        if (c0580e.m1496f(1073741824)) {
            long j7 = c13322b.f46159b;
            int iM121873z = 1;
            c38059n.m121843C(1);
            C0902h c0902hM68111f = m68111f(c0902h, j7, c38059n.f163017a, 1);
            long j13 = j7 + 1;
            byte b = c38059n.f163017a[0];
            boolean z4 = (b & 128) != 0;
            int i13 = b & 127;
            C0578c c0578c = c0580e.f2069z;
            byte[] bArr = c0578c.f2053a;
            if (bArr == null) {
                c0578c.f2053a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c0902h = m68111f(c0902hM68111f, j13, c0578c.f2053a, i13);
            long j14 = j13 + ((long) i13);
            if (z4) {
                c38059n.m121843C(2);
                c0902h = m68111f(c0902h, j14, c38059n.f163017a, 2);
                j14 += 2;
                iM121873z = c38059n.m121873z();
            }
            int[] iArr = c0578c.f2056d;
            if (iArr == null || iArr.length < iM121873z) {
                iArr = new int[iM121873z];
            }
            int[] iArr2 = c0578c.f2057e;
            if (iArr2 == null || iArr2.length < iM121873z) {
                iArr2 = new int[iM121873z];
            }
            if (z4) {
                int i14 = iM121873z * 6;
                c38059n.m121843C(i14);
                c0902h = m68111f(c0902h, j14, c38059n.f163017a, i14);
                j14 += (long) i14;
                c38059n.m121846F(0);
                for (int i15 = 0; i15 < iM121873z; i15++) {
                    iArr[i15] = c38059n.m121873z();
                    iArr2[i15] = c38059n.m121871x();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c13322b.f46158a - ((int) (j14 - c13322b.f46159b));
            }
            C33637j0 c33637j0 = (C33637j0) c13322b.f46160c;
            int i16 = AbstractC38065t.f163031a;
            byte[] bArr2 = c33637j0.f140399b;
            byte[] bArr3 = c0578c.f2053a;
            int i17 = c33637j0.f140398a;
            int i18 = c33637j0.f140400c;
            int i19 = c33637j0.f140401d;
            c0578c.f2058f = iM121873z;
            c0578c.f2056d = iArr;
            c0578c.f2057e = iArr2;
            c0578c.f2054b = bArr2;
            c0578c.f2053a = bArr3;
            c0578c.f2055c = i17;
            c0578c.f2059g = i18;
            c0578c.f2060h = i19;
            MediaCodec.CryptoInfo cryptoInfo = c0578c.f2061i;
            cryptoInfo.numSubSamples = iM121873z;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i17;
            if (AbstractC38065t.f163031a >= 24) {
                C38445a c38445a = (C38445a) c0578c.f2062j;
                c38445a.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) c38445a.f164637y;
                pattern.set(i18, i19);
                ((MediaCodec.CryptoInfo) c38445a.f164636x).setPattern(pattern);
            }
            long j15 = c13322b.f46159b;
            int i24 = (int) (j14 - j15);
            c13322b.f46159b = j15 + ((long) i24);
            c13322b.f46158a -= i24;
        }
        if (!c0580e.m1496f(268435456)) {
            c0580e.m1508q(c13322b.f46158a);
            return m68110e(c0902h, c13322b.f46159b, c0580e.f2063E, c13322b.f46158a);
        }
        c38059n.m121843C(4);
        C0902h c0902hM68111f2 = m68111f(c0902h, c13322b.f46159b, c38059n.f163017a, 4);
        int iM121871x = c38059n.m121871x();
        c13322b.f46159b += 4;
        c13322b.f46158a -= 4;
        c0580e.m1508q(iM121871x);
        C0902h c0902hM68110e = m68110e(c0902hM68111f2, c13322b.f46159b, c0580e.f2063E, iM121871x);
        c13322b.f46159b += (long) iM121871x;
        int i25 = c13322b.f46158a - iM121871x;
        c13322b.f46158a = i25;
        ByteBuffer byteBuffer = c0580e.f2066H;
        if (byteBuffer == null || byteBuffer.capacity() < i25) {
            c0580e.f2066H = ByteBuffer.allocate(i25);
        } else {
            c0580e.f2066H.clear();
        }
        return m68110e(c0902hM68110e, c13322b.f46159b, c0580e.f2066H, c13322b.f46158a);
    }

    /* JADX INFO: renamed from: j */
    public static C0902h m68115j(C0902h c0902h, C35073c c35073c, C13322b c13322b, C13117a c13117a) {
        if (c35073c.m1496f(1073741824)) {
            long j7 = c13322b.f46159b;
            int iM36682D = 1;
            c13117a.m36686H(1);
            C0902h c0902hM68113h = m68113h(c0902h, j7, c13117a.f45381a, 1);
            long j13 = j7 + 1;
            byte b = c13117a.f45381a[0];
            boolean z4 = (b & 128) != 0;
            int i13 = b & 127;
            C0578c c0578c = c35073c.f148800y;
            byte[] bArr = c0578c.f2053a;
            if (bArr == null) {
                c0578c.f2053a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            c0902h = m68113h(c0902hM68113h, j13, c0578c.f2053a, i13);
            long j14 = j13 + ((long) i13);
            if (z4) {
                c13117a.m36686H(2);
                c0902h = m68113h(c0902h, j14, c13117a.f45381a, 2);
                j14 += 2;
                iM36682D = c13117a.m36682D();
            }
            int[] iArr = c0578c.f2056d;
            if (iArr == null || iArr.length < iM36682D) {
                iArr = new int[iM36682D];
            }
            int[] iArr2 = c0578c.f2057e;
            if (iArr2 == null || iArr2.length < iM36682D) {
                iArr2 = new int[iM36682D];
            }
            if (z4) {
                int i14 = iM36682D * 6;
                c13117a.m36686H(i14);
                c0902h = m68113h(c0902h, j14, c13117a.f45381a, i14);
                j14 += (long) i14;
                c13117a.m36689K(0);
                for (int i15 = 0; i15 < iM36682D; i15++) {
                    iArr[i15] = c13117a.m36682D();
                    iArr2[i15] = c13117a.m36680B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c13322b.f46158a - ((int) (j14 - c13322b.f46159b));
            }
            C37376r c37376r = (C37376r) c13322b.f46160c;
            int i16 = AbstractC24567y.f95875a;
            byte[] bArr2 = c37376r.f159873b;
            byte[] bArr3 = c0578c.f2053a;
            int i17 = c37376r.f159872a;
            int i18 = c37376r.f159874c;
            int i19 = c37376r.f159875d;
            c0578c.f2058f = iM36682D;
            c0578c.f2056d = iArr;
            c0578c.f2057e = iArr2;
            c0578c.f2054b = bArr2;
            c0578c.f2053a = bArr3;
            c0578c.f2055c = i17;
            c0578c.f2059g = i18;
            c0578c.f2060h = i19;
            MediaCodec.CryptoInfo cryptoInfo = c0578c.f2061i;
            cryptoInfo.numSubSamples = iM36682D;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i17;
            if (AbstractC24567y.f95875a >= 24) {
                C33652u c33652u = (C33652u) c0578c.f2062j;
                c33652u.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) c33652u.f140442x;
                pattern.set(i18, i19);
                ((MediaCodec.CryptoInfo) c33652u.f140441w).setPattern(pattern);
            }
            long j15 = c13322b.f46159b;
            int i24 = (int) (j14 - j15);
            c13322b.f46159b = j15 + ((long) i24);
            c13322b.f46158a -= i24;
        }
        if (!c35073c.m1496f(268435456)) {
            c35073c.m110918q(c13322b.f46158a);
            return m68112g(c0902h, c13322b.f46159b, c35073c.f148801z, c13322b.f46158a);
        }
        c13117a.m36686H(4);
        C0902h c0902hM68113h2 = m68113h(c0902h, c13322b.f46159b, c13117a.f45381a, 4);
        int iM36680B = c13117a.m36680B();
        c13322b.f46159b += 4;
        c13322b.f46158a -= 4;
        c35073c.m110918q(iM36680B);
        C0902h c0902hM68112g = m68112g(c0902hM68113h2, c13322b.f46159b, c35073c.f148801z, iM36680B);
        c13322b.f46159b += (long) iM36680B;
        int i25 = c13322b.f46158a - iM36680B;
        c13322b.f46158a = i25;
        ByteBuffer byteBuffer = c35073c.f148798G;
        if (byteBuffer == null || byteBuffer.capacity() < i25) {
            c35073c.f148798G = ByteBuffer.allocate(i25);
        } else {
            c35073c.f148798G.clear();
        }
        return m68112g(c0902hM68112g, c13322b.f46159b, c35073c.f148798G, c13322b.f46158a);
    }

    /* JADX INFO: renamed from: a */
    public void m68116a(C0902h c0902h) {
        if (((C28977a) c0902h.f3297z) == null) {
            return;
        }
        C22631o c22631o = (C22631o) this.f93191d;
        synchronized (c22631o) {
            C0902h c0902h2 = c0902h;
            while (c0902h2 != null) {
                try {
                    C28977a[] c28977aArr = (C28977a[]) c22631o.f89032g;
                    int i13 = c22631o.f89031f;
                    c22631o.f89031f = i13 + 1;
                    C28977a c28977a = (C28977a) c0902h2.f3297z;
                    c28977a.getClass();
                    c28977aArr[i13] = c28977a;
                    c22631o.f89030e--;
                    c0902h2 = (C0902h) c0902h2.f3293E;
                    if (c0902h2 == null || ((C28977a) c0902h2.f3297z) == null) {
                        c0902h2 = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            c22631o.notifyAll();
        }
        c0902h.f3297z = null;
        c0902h.f3293E = null;
    }

    /* JADX INFO: renamed from: b */
    public void m68117b(C0902h c0902h) {
        if (((C22606a) c0902h.f3297z) == null) {
            return;
        }
        C22631o c22631o = (C22631o) this.f93191d;
        synchronized (c22631o) {
            C0902h c0902h2 = c0902h;
            while (c0902h2 != null) {
                try {
                    C22606a[] c22606aArr = (C22606a[]) c22631o.f89032g;
                    int i13 = c22631o.f89031f;
                    c22631o.f89031f = i13 + 1;
                    C22606a c22606a = (C22606a) c0902h2.f3297z;
                    c22606a.getClass();
                    c22606aArr[i13] = c22606a;
                    c22631o.f89030e--;
                    c0902h2 = (C0902h) c0902h2.f3293E;
                    if (c0902h2 == null || ((C22606a) c0902h2.f3297z) == null) {
                        c0902h2 = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            c22631o.notifyAll();
        }
        c0902h.f3297z = null;
        c0902h.f3293E = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m68118c(long j7) {
        switch (this.f93188a) {
            case 0:
                if (j7 == -1) {
                    return;
                }
                while (true) {
                    C0902h c0902h = (C0902h) this.f93193f;
                    if (j7 < c0902h.f3296y) {
                        if (((C0902h) this.f93194g).f3295x < c0902h.f3295x) {
                            this.f93194g = c0902h;
                            return;
                        }
                        return;
                    }
                    C22631o c22631o = (C22631o) this.f93191d;
                    C28977a c28977a = (C28977a) c0902h.f3297z;
                    synchronized (c22631o) {
                        C28977a[] c28977aArr = (C28977a[]) c22631o.f89032g;
                        int i13 = c22631o.f89031f;
                        c22631o.f89031f = i13 + 1;
                        c28977aArr[i13] = c28977a;
                        c22631o.f89030e--;
                        c22631o.notifyAll();
                    }
                    C0902h c0902h2 = (C0902h) this.f93193f;
                    c0902h2.f3297z = null;
                    C0902h c0902h3 = (C0902h) c0902h2.f3293E;
                    c0902h2.f3293E = null;
                    this.f93193f = c0902h3;
                }
                break;
            default:
                if (j7 == -1) {
                    return;
                }
                while (true) {
                    C0902h c0902h4 = (C0902h) this.f93193f;
                    if (j7 < c0902h4.f3296y) {
                        if (((C0902h) this.f93194g).f3295x < c0902h4.f3295x) {
                            this.f93194g = c0902h4;
                            return;
                        }
                        return;
                    }
                    C22631o c22631o2 = (C22631o) this.f93191d;
                    C22606a c22606a = (C22606a) c0902h4.f3297z;
                    synchronized (c22631o2) {
                        C22606a[] c22606aArr = (C22606a[]) c22631o2.f89032g;
                        int i14 = c22631o2.f89031f;
                        c22631o2.f89031f = i14 + 1;
                        c22606aArr[i14] = c22606a;
                        c22631o2.f89030e--;
                        c22631o2.notifyAll();
                    }
                    C0902h c0902h5 = (C0902h) this.f93193f;
                    c0902h5.f3297z = null;
                    C0902h c0902h6 = (C0902h) c0902h5.f3293E;
                    c0902h5.f3293E = null;
                    this.f93193f = c0902h6;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m68119d(int i13) {
        C28977a c28977a;
        C22606a c22606a;
        switch (this.f93188a) {
            case 0:
                C0902h c0902h = (C0902h) this.f93195h;
                if (((C28977a) c0902h.f3297z) == null) {
                    C22631o c22631o = (C22631o) this.f93191d;
                    synchronized (c22631o) {
                        try {
                            int i14 = c22631o.f89030e + 1;
                            c22631o.f89030e = i14;
                            int i15 = c22631o.f89031f;
                            if (i15 > 0) {
                                C28977a[] c28977aArr = (C28977a[]) c22631o.f89032g;
                                int i16 = i15 - 1;
                                c22631o.f89031f = i16;
                                c28977a = c28977aArr[i16];
                                c28977a.getClass();
                                ((C28977a[]) c22631o.f89032g)[c22631o.f89031f] = null;
                            } else {
                                C28977a c28977a2 = new C28977a(new byte[c22631o.f89028c], 0);
                                C28977a[] c28977aArr2 = (C28977a[]) c22631o.f89032g;
                                if (i14 > c28977aArr2.length) {
                                    c22631o.f89032g = (C28977a[]) Arrays.copyOf(c28977aArr2, c28977aArr2.length * 2);
                                }
                                c28977a = c28977a2;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    C0902h c0902h2 = new C0902h(this.f93189b, ((C0902h) this.f93195h).f3296y, 6);
                    c0902h.f3297z = c28977a;
                    c0902h.f3293E = c0902h2;
                }
                return Math.min(i13, (int) (((C0902h) this.f93195h).f3296y - this.f93190c));
            default:
                C0902h c0902h3 = (C0902h) this.f93195h;
                if (((C22606a) c0902h3.f3297z) == null) {
                    C22631o c22631o2 = (C22631o) this.f93191d;
                    synchronized (c22631o2) {
                        try {
                            int i17 = c22631o2.f89030e + 1;
                            c22631o2.f89030e = i17;
                            int i18 = c22631o2.f89031f;
                            if (i18 > 0) {
                                C22606a[] c22606aArr = (C22606a[]) c22631o2.f89032g;
                                int i19 = i18 - 1;
                                c22631o2.f89031f = i19;
                                c22606a = c22606aArr[i19];
                                c22606a.getClass();
                                ((C22606a[]) c22631o2.f89032g)[c22631o2.f89031f] = null;
                            } else {
                                C22606a c22606a2 = new C22606a(new byte[c22631o2.f89028c], 0);
                                C22606a[] c22606aArr2 = (C22606a[]) c22631o2.f89032g;
                                if (i17 > c22606aArr2.length) {
                                    c22631o2.f89032g = (C22606a[]) Arrays.copyOf(c22606aArr2, c22606aArr2.length * 2);
                                }
                                c22606a = c22606a2;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    C0902h c0902h4 = new C0902h(this.f93189b, ((C0902h) this.f93195h).f3296y, 9);
                    c0902h3.f3297z = c22606a;
                    c0902h3.f3293E = c0902h4;
                }
                return Math.min(i13, (int) (((C0902h) this.f93195h).f3296y - this.f93190c));
        }
    }

    public C23534w0(C22631o c22631o, byte b) {
        this.f93191d = c22631o;
        int i13 = c22631o.f89028c;
        this.f93189b = i13;
        this.f93192e = new C38059n(32);
        C0902h c0902h = new C0902h(i13, 0L, 6);
        this.f93193f = c0902h;
        this.f93194g = c0902h;
        this.f93195h = c0902h;
    }
}
