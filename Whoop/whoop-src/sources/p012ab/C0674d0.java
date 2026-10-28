package p012ab;

import android.util.SparseArray;
import io.sentry.internal.debugmeta.C20378c;
import java.io.EOFException;
import java.io.InterruptedIOException;
import live.hms.video.utils.HMSConstantsKt;
import ng3.C26702o;
import p309lo.C24561s;
import p499t9.C33622c;
import p499t9.C33624d;
import p499t9.C33638k;
import p499t9.C33650s;
import p499t9.C33651t;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p607x8.C38059n;
import p607x8.C38064s;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0674d0 implements InterfaceC33644n {

    /* JADX INFO: renamed from: e */
    public boolean f2361e;

    /* JADX INFO: renamed from: f */
    public boolean f2362f;

    /* JADX INFO: renamed from: g */
    public boolean f2363g;

    /* JADX INFO: renamed from: h */
    public long f2364h;

    /* JADX INFO: renamed from: i */
    public C0668a0 f2365i;

    /* JADX INFO: renamed from: j */
    public InterfaceC33648q f2366j;

    /* JADX INFO: renamed from: k */
    public boolean f2367k;

    /* JADX INFO: renamed from: a */
    public final C38064s f2357a = new C38064s(0);

    /* JADX INFO: renamed from: c */
    public final C38059n f2359c = new C38059n(4096);

    /* JADX INFO: renamed from: b */
    public final SparseArray f2358b = new SparseArray();

    /* JADX INFO: renamed from: d */
    public final C0670b0 f2360d = new C0670b0(0);

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        long j14;
        SparseArray sparseArray = this.f2358b;
        C38064s c38064s = this.f2357a;
        synchronized (c38064s) {
            j14 = c38064s.f163028b;
        }
        boolean z4 = j14 == -9223372036854775807L;
        if (!z4) {
            long jM121885d = c38064s.m121885d();
            z4 = (jM121885d == -9223372036854775807L || jM121885d == 0 || jM121885d == j13) ? false : true;
        }
        if (z4) {
            c38064s.m121886e(j13);
        }
        C0668a0 c0668a0 = this.f2365i;
        if (c0668a0 != null) {
            c0668a0.m106253e(j13);
        }
        for (int i13 = 0; i13 < sparseArray.size(); i13++) {
            C0672c0 c0672c0 = (C0672c0) sparseArray.valueAt(i13);
            c0672c0.f2352f = false;
            c0672c0.f2347a.mo1663a();
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f2366j = interfaceC33648q;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C33638k c33638k = (C33638k) interfaceC33646o;
        c33638k.mo3092c(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            c33638k.mo3078C(bArr[13] & 7, false);
            c33638k.mo3092c(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) {
        long j7;
        InterfaceC0685j c0689l;
        long j13;
        AbstractC35849g.m113808j(this.f2366j);
        long length = interfaceC33646o.getLength();
        long j14 = -9223372036854775807L;
        C0670b0 c0670b0 = this.f2360d;
        if (length != -1 && !c0670b0.f2326d) {
            C38064s c38064s = c0670b0.f2324b;
            C38059n c38059n = c0670b0.f2325c;
            if (!c0670b0.f2328f) {
                long length2 = interfaceC33646o.getLength();
                int iMin = (int) Math.min(20000L, length2);
                long j15 = length2 - ((long) iMin);
                if (interfaceC33646o.getPosition() != j15) {
                    c33650s.f140436a = j15;
                    return 1;
                }
                c38059n.m121843C(iMin);
                interfaceC33646o.mo3093e();
                interfaceC33646o.mo3103p(c38059n.f163017a, 0, iMin);
                int i13 = c38059n.f163018b;
                for (int i14 = c38059n.f163019c - 4; i14 >= i13; i14--) {
                    if (C0670b0.m1658b(i14, c38059n.f163017a) == 442) {
                        c38059n.m121846F(i14 + 4);
                        long jM1659c = C0670b0.m1659c(c38059n);
                        if (jM1659c != -9223372036854775807L) {
                            j14 = jM1659c;
                            break;
                        }
                    }
                }
                c0670b0.f2330h = j14;
                c0670b0.f2328f = true;
                return 0;
            }
            if (c0670b0.f2330h == -9223372036854775807L) {
                c0670b0.m1660a(interfaceC33646o);
                return 0;
            }
            if (c0670b0.f2327e) {
                long j16 = c0670b0.f2329g;
                if (j16 == -9223372036854775807L) {
                    c0670b0.m1660a(interfaceC33646o);
                    return 0;
                }
                c0670b0.f2331i = c38064s.m121884c(c0670b0.f2330h) - c38064s.m121883b(j16);
                c0670b0.m1660a(interfaceC33646o);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, interfaceC33646o.getLength());
            long j17 = 0;
            if (interfaceC33646o.getPosition() != j17) {
                c33650s.f140436a = j17;
                return 1;
            }
            c38059n.m121843C(iMin2);
            interfaceC33646o.mo3093e();
            interfaceC33646o.mo3103p(c38059n.f163017a, 0, iMin2);
            int i15 = c38059n.f163019c;
            for (int i16 = c38059n.f163018b; i16 < i15 - 3; i16++) {
                if (C0670b0.m1658b(i16, c38059n.f163017a) == 442) {
                    c38059n.m121846F(i16 + 4);
                    long jM1659c2 = C0670b0.m1659c(c38059n);
                    if (jM1659c2 != -9223372036854775807L) {
                        j13 = jM1659c2;
                        c0670b0.f2329g = j13;
                        c0670b0.f2327e = true;
                        return 0;
                    }
                }
            }
            j13 = -9223372036854775807L;
            c0670b0.f2329g = j13;
            c0670b0.f2327e = true;
            return 0;
        }
        if (!this.f2367k) {
            this.f2367k = true;
            long j18 = c0670b0.f2331i;
            if (j18 != -9223372036854775807L) {
                C0668a0 c0668a0 = new C0668a0(new C26702o(29, false), new C20378c(c0670b0.f2324b), j18, j18 + 1, 0L, length, 188L, 1000);
                this.f2365i = c0668a0;
                this.f2366j.mo3109v((C33622c) c0668a0.f140382c);
            } else {
                this.f2366j.mo3109v(new C33651t(j18));
            }
        }
        C0668a0 c0668a1 = this.f2365i;
        if (c0668a1 != null && ((C33624d) c0668a1.f140384e) != null) {
            return c0668a1.m106251a(interfaceC33646o, c33650s);
        }
        interfaceC33646o.mo3093e();
        long jMo3095g = length != -1 ? length - interfaceC33646o.mo3095g() : -1L;
        if (jMo3095g != -1 && jMo3095g < 4) {
            return -1;
        }
        C38059n c38059n2 = this.f2359c;
        if (!interfaceC33646o.mo3092c(c38059n2.f163017a, 0, 4, true)) {
            return -1;
        }
        c38059n2.m121846F(0);
        int iM121854g = c38059n2.m121854g();
        if (iM121854g == 441) {
            return -1;
        }
        if (iM121854g == 442) {
            interfaceC33646o.mo3103p(c38059n2.f163017a, 0, 10);
            c38059n2.m121846F(9);
            interfaceC33646o.mo3100n((c38059n2.m121867t() & 7) + 14);
            return 0;
        }
        if (iM121854g == 443) {
            interfaceC33646o.mo3103p(c38059n2.f163017a, 0, 2);
            c38059n2.m121846F(0);
            interfaceC33646o.mo3100n(c38059n2.m121873z() + 6);
            return 0;
        }
        if (((iM121854g & (-256)) >> 8) != 1) {
            interfaceC33646o.mo3100n(1);
            return 0;
        }
        int i17 = iM121854g & 255;
        SparseArray sparseArray = this.f2358b;
        C0672c0 c0672c0 = (C0672c0) sparseArray.get(i17);
        if (!this.f2361e) {
            if (c0672c0 == null) {
                if (i17 == 189) {
                    c0689l = new C0671c("video/mp2p");
                    this.f2362f = true;
                    this.f2364h = interfaceC33646o.getPosition();
                } else if ((iM121854g & 224) == 192) {
                    c0689l = new C0701v(null, 0, "video/mp2p");
                    this.f2362f = true;
                    this.f2364h = interfaceC33646o.getPosition();
                } else if ((iM121854g & 240) == 224) {
                    c0689l = new C0689l(null, "video/mp2p");
                    this.f2363g = true;
                    this.f2364h = interfaceC33646o.getPosition();
                } else {
                    c0689l = null;
                }
                if (c0689l != null) {
                    c0689l.mo1667i(this.f2366j, new C0690l0(i17, 256, 0, (byte) 0));
                    c0672c0 = new C0672c0(c0689l, this.f2357a);
                    sparseArray.put(i17, c0672c0);
                }
            }
            if (interfaceC33646o.getPosition() > ((this.f2362f && this.f2363g) ? this.f2364h + HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE : 1048576L)) {
                this.f2361e = true;
                this.f2366j.mo3098l();
            }
        }
        interfaceC33646o.mo3103p(c38059n2.f163017a, 0, 2);
        c38059n2.m121846F(0);
        int iM121873z = c38059n2.m121873z() + 6;
        if (c0672c0 == null) {
            interfaceC33646o.mo3100n(iM121873z);
            return 0;
        }
        c38059n2.m121843C(iM121873z);
        interfaceC33646o.readFully(c38059n2.f163017a, 0, iM121873z);
        c38059n2.m121846F(6);
        InterfaceC0685j interfaceC0685j = c0672c0.f2347a;
        C24561s c24561s = c0672c0.f2349c;
        c38059n2.m121852e(c24561s.f95858b, 0, 3);
        c24561s.m71640q(0);
        c24561s.m71643t(8);
        c0672c0.f2350d = c24561s.m71631h();
        c0672c0.f2351e = c24561s.m71631h();
        c24561s.m71643t(6);
        c38059n2.m121852e(c24561s.f95858b, 0, c24561s.m71632i(8));
        c24561s.m71640q(0);
        C38064s c38064s2 = c0672c0.f2348b;
        c0672c0.f2353g = 0L;
        if (c0672c0.f2350d) {
            c24561s.m71643t(4);
            long jM71632i = ((long) c24561s.m71632i(3)) << 30;
            c24561s.m71643t(1);
            long jM71632i2 = jM71632i | ((long) (c24561s.m71632i(15) << 15));
            c24561s.m71643t(1);
            long jM71632i3 = jM71632i2 | ((long) c24561s.m71632i(15));
            c24561s.m71643t(1);
            if (c0672c0.f2352f || !c0672c0.f2351e) {
                j7 = jM71632i3;
            } else {
                c24561s.m71643t(4);
                long jM71632i4 = ((long) c24561s.m71632i(3)) << 30;
                c24561s.m71643t(1);
                long jM71632i5 = ((long) (c24561s.m71632i(15) << 15)) | jM71632i4;
                c24561s.m71643t(1);
                long jM71632i6 = jM71632i5 | ((long) c24561s.m71632i(15));
                c24561s.m71643t(1);
                c38064s2.m121883b(jM71632i6);
                c0672c0.f2352f = true;
                j7 = jM71632i3;
            }
            c0672c0.f2353g = c38064s2.m121883b(j7);
        }
        interfaceC0685j.mo1665d(4, c0672c0.f2353g);
        interfaceC0685j.mo1664c(c38059n2);
        interfaceC0685j.mo1666e(false);
        c38059n2.m121845E(c38059n2.f163017a.length);
        return 0;
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
