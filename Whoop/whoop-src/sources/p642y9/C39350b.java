package p642y9;

import androidx.media3.common.ParserException;
import java.util.Arrays;
import jh3.AbstractC21702c;
import p012ab.C0668a0;
import p142fa.C14293a;
import p309lo.C24561s;
import p465rm.C31559p;
import p499t9.AbstractC33618a;
import p499t9.C33622c;
import p499t9.C33624d;
import p499t9.C33638k;
import p499t9.C33650s;
import p499t9.C33651t;
import p499t9.C33652u;
import p499t9.C33653v;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p690zr.AbstractC41023g0;

/* JADX INFO: renamed from: y9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C39350b implements InterfaceC33644n {

    /* JADX INFO: renamed from: e */
    public InterfaceC33648q f169367e;

    /* JADX INFO: renamed from: f */
    public InterfaceC33639k0 f169368f;

    /* JADX INFO: renamed from: h */
    public C34585c0 f169370h;

    /* JADX INFO: renamed from: i */
    public C33653v f169371i;

    /* JADX INFO: renamed from: j */
    public int f169372j;

    /* JADX INFO: renamed from: k */
    public int f169373k;

    /* JADX INFO: renamed from: l */
    public C0668a0 f169374l;

    /* JADX INFO: renamed from: m */
    public int f169375m;

    /* JADX INFO: renamed from: n */
    public long f169376n;

    /* JADX INFO: renamed from: a */
    public final byte[] f169363a = new byte[42];

    /* JADX INFO: renamed from: b */
    public final C38059n f169364b = new C38059n(new byte[32768], 0);

    /* JADX INFO: renamed from: c */
    public final boolean f169365c = false;

    /* JADX INFO: renamed from: d */
    public final C33650s f169366d = new C33650s();

    /* JADX INFO: renamed from: g */
    public int f169369g = 0;

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        if (j7 == 0) {
            this.f169369g = 0;
        } else {
            C0668a0 c0668a0 = this.f169374l;
            if (c0668a0 != null) {
                c0668a0.m106253e(j13);
            }
        }
        this.f169376n = j13 != 0 ? -1L : 0L;
        this.f169375m = 0;
        this.f169364b.m121843C(0);
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f169367e = interfaceC33648q;
        this.f169368f = interfaceC33648q.mo3101o(0, 1);
        interfaceC33648q.mo3098l();
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) throws Throwable {
        AbstractC33618a.m106226r(interfaceC33646o, false);
        C38059n c38059n = new C38059n(4);
        ((C33638k) interfaceC33646o).mo3092c(c38059n.f163017a, 0, 4, false);
        return c38059n.m121869v() == 1716281667;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws Throwable {
        C33653v c33653v;
        InterfaceC33627e0 c33651t;
        long j7;
        long j13;
        boolean zM106210b;
        int i13 = this.f169369g;
        boolean z4 = true;
        int i14 = 0;
        if (i13 == 0) {
            boolean z13 = !this.f169365c;
            interfaceC33646o.mo3093e();
            long jMo3095g = interfaceC33646o.mo3095g();
            C34585c0 c34585c0M106226r = AbstractC33618a.m106226r(interfaceC33646o, z13);
            interfaceC33646o.mo3100n((int) (interfaceC33646o.mo3095g() - jMo3095g));
            this.f169370h = c34585c0M106226r;
            this.f169369g = 1;
            return 0;
        }
        byte[] bArr = this.f169363a;
        if (i13 == 1) {
            interfaceC33646o.mo3103p(bArr, 0, bArr.length);
            interfaceC33646o.mo3093e();
            this.f169369g = 2;
            return 0;
        }
        int i15 = 3;
        if (i13 == 2) {
            C38059n c38059n = new C38059n(4);
            interfaceC33646o.readFully(c38059n.f163017a, 0, 4);
            if (c38059n.m121869v() != 1716281667) {
                throw ParserException.m5049a(null, "Failed to read FLAC stream marker.");
            }
            this.f169369g = 3;
            return 0;
        }
        int i16 = 7;
        if (i13 == 3) {
            byte b = 0;
            C33653v c33653v2 = this.f169371i;
            boolean z14 = false;
            while (!z14) {
                interfaceC33646o.mo3093e();
                byte[] bArr2 = new byte[4];
                C24561s c24561s = new C24561s(bArr2, 4, 5, b);
                interfaceC33646o.mo3103p(bArr2, b, 4);
                boolean zM71631h = c24561s.m71631h();
                int iM71632i = c24561s.m71632i(i16);
                int iM71632i2 = c24561s.m71632i(24) + 4;
                if (iM71632i == 0) {
                    byte[] bArr3 = new byte[38];
                    interfaceC33646o.readFully(bArr3, b, 38);
                    c33653v2 = new C33653v(bArr3, 4, b);
                } else {
                    if (c33653v2 == null) {
                        throw new IllegalArgumentException();
                    }
                    C34585c0 c34585c0 = (C34585c0) c33653v2.f140455m;
                    if (iM71632i == i15) {
                        C38059n c38059n2 = new C38059n(iM71632i2);
                        interfaceC33646o.readFully(c38059n2.f163017a, b, iM71632i2);
                        c33653v = new C33653v(c33653v2.f140444b, c33653v2.f140445c, c33653v2.f140446d, c33653v2.f140447e, c33653v2.f140448f, c33653v2.f140450h, c33653v2.f140451i, c33653v2.f140453k, AbstractC33618a.m106228t(c38059n2), (C34585c0) c33653v2.f140455m);
                    } else if (iM71632i == 4) {
                        C38059n c38059n3 = new C38059n(iM71632i2);
                        interfaceC33646o.readFully(c38059n3.f163017a, 0, iM71632i2);
                        c38059n3.m121847G(4);
                        C34585c0 c34585c0M106225q = AbstractC33618a.m106225q(Arrays.asList(AbstractC33618a.m106229u(c38059n3, false, false).f140425a));
                        if (c34585c0 != null) {
                            c34585c0M106225q = c34585c0.m109366b(c34585c0M106225q);
                        }
                        c33653v = new C33653v(c33653v2.f140444b, c33653v2.f140445c, c33653v2.f140446d, c33653v2.f140447e, c33653v2.f140448f, c33653v2.f140450h, c33653v2.f140451i, c33653v2.f140453k, (C33652u) c33653v2.f140454l, c34585c0M106225q);
                    } else if (iM71632i == 6) {
                        C38059n c38059n4 = new C38059n(iM71632i2);
                        interfaceC33646o.readFully(c38059n4.f163017a, 0, iM71632i2);
                        c38059n4.m121847G(4);
                        C34585c0 c34585c1 = new C34585c0(AbstractC41023g0.m133256r(C14293a.m40836b(c38059n4)));
                        if (c34585c0 != null) {
                            c34585c1 = c34585c0.m109366b(c34585c1);
                        }
                        c33653v = new C33653v(c33653v2.f140444b, c33653v2.f140445c, c33653v2.f140446d, c33653v2.f140447e, c33653v2.f140448f, c33653v2.f140450h, c33653v2.f140451i, c33653v2.f140453k, (C33652u) c33653v2.f140454l, c34585c1);
                    } else {
                        interfaceC33646o.mo3100n(iM71632i2);
                    }
                    c33653v2 = c33653v;
                }
                int i17 = AbstractC38065t.f163031a;
                this.f169371i = c33653v2;
                z14 = zM71631h;
                i15 = 3;
                i16 = 7;
                b = 0;
            }
            this.f169371i.getClass();
            this.f169372j = Math.max(this.f169371i.f140446d, 6);
            C34610p c34610pM106294e = this.f169371i.m106294e(bArr, this.f169370h);
            InterfaceC33639k0 interfaceC33639k0 = this.f169368f;
            C34608o c34608oM109410a = c34610pM106294e.m109410a();
            c34608oM109410a.f145740l = AbstractC34587d0.m109382o("audio/flac");
            AbstractC21702c.m61152w(c34608oM109410a, interfaceC33639k0);
            InterfaceC33639k0 interfaceC33639k1 = this.f169368f;
            this.f169371i.m106292c();
            interfaceC33639k1.getClass();
            this.f169369g = 4;
            return 0;
        }
        long j14 = 0;
        if (i13 == 4) {
            interfaceC33646o.mo3093e();
            C38059n c38059n5 = new C38059n(2);
            interfaceC33646o.mo3103p(c38059n5.f163017a, 0, 2);
            int iM121873z = c38059n5.m121873z();
            if ((iM121873z >> 2) != 16382) {
                interfaceC33646o.mo3093e();
                throw ParserException.m5049a(null, "First frame does not start with sync code.");
            }
            interfaceC33646o.mo3093e();
            this.f169373k = iM121873z;
            InterfaceC33648q interfaceC33648q = this.f169367e;
            int i18 = AbstractC38065t.f163031a;
            long position = interfaceC33646o.getPosition();
            long length = interfaceC33646o.getLength();
            this.f169371i.getClass();
            C33653v c33653v3 = this.f169371i;
            if (((C33652u) c33653v3.f140454l) != null) {
                c33651t = new C33651t(c33653v3, position, 0);
                i14 = 0;
            } else if (length == -1 || c33653v3.f140453k <= 0) {
                i14 = 0;
                c33651t = new C33651t(c33653v3.m106292c());
            } else {
                int i19 = this.f169373k;
                int i24 = c33653v3.f140446d;
                C31559p c31559p = new C31559p(c33653v3, 20);
                C39349a c39349a = new C39349a(c33653v3, i19);
                long jM106292c = c33653v3.m106292c();
                long j15 = c33653v3.f140453k;
                int i25 = c33653v3.f140447e;
                if (i25 > 0) {
                    j7 = ((((long) i25) + ((long) i24)) / 2) + 1;
                } else {
                    int i26 = c33653v3.f140444b;
                    j7 = (((((i26 != c33653v3.f140445c || i26 <= 0) ? 4096L : i26) * ((long) c33653v3.f140450h)) * ((long) c33653v3.f140451i)) / 8) + 64;
                }
                C0668a0 c0668a0 = new C0668a0(c31559p, c39349a, jM106292c, j15, position, length, j7, Math.max(6, i24));
                this.f169374l = c0668a0;
                c33651t = (C33622c) c0668a0.f140382c;
            }
            interfaceC33648q.mo3109v(c33651t);
            this.f169369g = 5;
            return i14;
        }
        if (i13 != 5) {
            throw new IllegalStateException();
        }
        this.f169368f.getClass();
        this.f169371i.getClass();
        C0668a0 c0668a1 = this.f169374l;
        if (c0668a1 != null && ((C33624d) c0668a1.f140384e) != null) {
            return c0668a1.m106251a(interfaceC33646o, c33650s);
        }
        if (this.f169376n == -1) {
            C33653v c33653v4 = this.f169371i;
            interfaceC33646o.mo3093e();
            interfaceC33646o.mo3096i(1);
            byte[] bArr4 = new byte[1];
            interfaceC33646o.mo3103p(bArr4, 0, 1);
            boolean z15 = (bArr4[0] & 1) == 1;
            interfaceC33646o.mo3096i(2);
            i16 = z15 ? 7 : 6;
            C38059n c38059n6 = new C38059n(i16);
            byte[] bArr5 = c38059n6.f163017a;
            int i27 = 0;
            while (i27 < i16) {
                int iMo3099m = interfaceC33646o.mo3099m(bArr5, i27, i16 - i27);
                if (iMo3099m == -1) {
                    break;
                }
                i27 += iMo3099m;
            }
            c38059n6.m121845E(i27);
            interfaceC33646o.mo3093e();
            try {
                long jM121841A = c38059n6.m121841A();
                if (!z15) {
                    jM121841A *= (long) c33653v4.f140445c;
                }
                j14 = jM121841A;
            } catch (NumberFormatException unused) {
                z4 = false;
            }
            if (!z4) {
                throw ParserException.m5049a(null, null);
            }
            this.f169376n = j14;
        } else {
            C38059n c38059n7 = this.f169364b;
            int i28 = c38059n7.f163019c;
            if (i28 < 32768) {
                int i29 = interfaceC33646o.read(c38059n7.f163017a, i28, 32768 - i28);
                z4 = i29 == -1;
                if (!z4) {
                    c38059n7.m121845E(i28 + i29);
                } else if (c38059n7.m121848a() == 0) {
                    long j16 = this.f169376n * 1000000;
                    C33653v c33653v5 = this.f169371i;
                    int i34 = AbstractC38065t.f163031a;
                    this.f169368f.mo36174b(j16 / ((long) c33653v5.f140448f), 1, this.f169375m, 0, null);
                    return -1;
                }
            } else {
                z4 = false;
            }
            int i35 = c38059n7.f163018b;
            int i36 = this.f169375m;
            int i37 = this.f169372j;
            if (i36 < i37) {
                c38059n7.m121847G(Math.min(i37 - i36, c38059n7.m121848a()));
            }
            this.f169371i.getClass();
            int i38 = c38059n7.f163018b;
            while (true) {
                int i39 = c38059n7.f163019c - 16;
                C33650s c33650s2 = this.f169366d;
                if (i38 > i39) {
                    if (z4) {
                        while (true) {
                            int i44 = c38059n7.f163019c;
                            if (i38 <= i44 - this.f169372j) {
                                c38059n7.m121846F(i38);
                                try {
                                    zM106210b = AbstractC33618a.m106210b(c38059n7, this.f169371i, this.f169373k, c33650s2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zM106210b = false;
                                }
                                if (c38059n7.f163018b > c38059n7.f163019c) {
                                    zM106210b = false;
                                }
                                if (zM106210b) {
                                    c38059n7.m121846F(i38);
                                    j13 = c33650s2.f140436a;
                                    break;
                                }
                                i38++;
                            } else {
                                c38059n7.m121846F(i44);
                            }
                        }
                    } else {
                        c38059n7.m121846F(i38);
                    }
                    j13 = -1;
                    break;
                }
                c38059n7.m121846F(i38);
                if (AbstractC33618a.m106210b(c38059n7, this.f169371i, this.f169373k, c33650s2)) {
                    c38059n7.m121846F(i38);
                    j13 = c33650s2.f140436a;
                    break;
                }
                i38++;
            }
            int i45 = c38059n7.f163018b - i35;
            c38059n7.m121846F(i35);
            this.f169368f.mo36176d(c38059n7, i45, 0);
            int i46 = this.f169375m + i45;
            this.f169375m = i46;
            if (j13 != -1) {
                long j17 = this.f169376n * 1000000;
                C33653v c33653v6 = this.f169371i;
                int i47 = AbstractC38065t.f163031a;
                this.f169368f.mo36174b(j17 / ((long) c33653v6.f140448f), 1, i46, 0, null);
                this.f169375m = 0;
                this.f169376n = j13;
            }
            int length2 = c38059n7.f163017a.length - c38059n7.f163019c;
            if (c38059n7.m121848a() < 16 && length2 < 16) {
                int iM121848a = c38059n7.m121848a();
                byte[] bArr6 = c38059n7.f163017a;
                System.arraycopy(bArr6, c38059n7.f163018b, bArr6, 0, iM121848a);
                c38059n7.m121846F(0);
                c38059n7.m121845E(iM121848a);
            }
        }
        return 0;
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
