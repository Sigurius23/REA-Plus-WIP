package p548v9;

import androidx.media3.common.ParserException;
import cr.C11078p;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import jh3.AbstractC21702c;
import p031b9.C2817b;
import p249jc.C21567b;
import p499t9.C33623c0;
import p499t9.C33650s;
import p499t9.C33651t;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33644n;
import p499t9.InterfaceC33646o;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p690zr.C41017e0;

/* JADX INFO: renamed from: v9.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C35802b implements InterfaceC33644n {

    /* JADX INFO: renamed from: a */
    public final C38059n f152285a;

    /* JADX INFO: renamed from: b */
    public final C11078p f152286b;

    /* JADX INFO: renamed from: c */
    public final boolean f152287c;

    /* JADX INFO: renamed from: d */
    public final C21567b f152288d;

    /* JADX INFO: renamed from: e */
    public int f152289e;

    /* JADX INFO: renamed from: f */
    public InterfaceC33648q f152290f;

    /* JADX INFO: renamed from: g */
    public C35803c f152291g;

    /* JADX INFO: renamed from: h */
    public long f152292h;

    /* JADX INFO: renamed from: i */
    public C35805e[] f152293i;

    /* JADX INFO: renamed from: j */
    public long f152294j;

    /* JADX INFO: renamed from: k */
    public C35805e f152295k;

    /* JADX INFO: renamed from: l */
    public int f152296l;

    /* JADX INFO: renamed from: m */
    public long f152297m;

    /* JADX INFO: renamed from: n */
    public long f152298n;

    /* JADX INFO: renamed from: o */
    public int f152299o;

    /* JADX INFO: renamed from: p */
    public boolean f152300p;

    public C35802b(int i13, C21567b c21567b) {
        this.f152288d = c21567b;
        this.f152287c = (i13 & 1) == 0;
        this.f152285a = new C38059n(12);
        this.f152286b = new C11078p();
        this.f152290f = new C33623c0();
        this.f152293i = new C35805e[0];
        this.f152297m = -1L;
        this.f152298n = -1L;
        this.f152296l = -1;
        this.f152292h = -9223372036854775807L;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: b */
    public final void mo1540b(long j7, long j13) {
        this.f152294j = -1L;
        this.f152295k = null;
        for (C35805e c35805e : this.f152293i) {
            if (c35805e.f152320k == 0) {
                c35805e.f152318i = 0;
            } else {
                c35805e.f152318i = c35805e.f152323n[AbstractC38065t.m121911d(c35805e.f152322m, j7, true)];
            }
        }
        if (j7 != 0) {
            this.f152289e = 6;
        } else if (this.f152293i.length == 0) {
            this.f152289e = 0;
        } else {
            this.f152289e = 3;
        }
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: g */
    public final void mo1541g(InterfaceC33648q interfaceC33648q) {
        this.f152289e = 0;
        if (this.f152287c) {
            interfaceC33648q = new C2817b(interfaceC33648q, this.f152288d);
        }
        this.f152290f = interfaceC33648q;
        this.f152294j = -1L;
    }

    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: h */
    public final boolean mo1542h(InterfaceC33646o interfaceC33646o) {
        C38059n c38059n = this.f152285a;
        interfaceC33646o.mo3103p(c38059n.f163017a, 0, 12);
        c38059n.m121846F(0);
        if (c38059n.m121856i() == 1179011410) {
            c38059n.m121847G(4);
            if (c38059n.m121856i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:175:0x0396  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104  */
    /* JADX WARN: Code duplicated, block: B:67:0x010d  */
    @Override // p499t9.InterfaceC33644n
    /* JADX INFO: renamed from: i */
    public final int mo1543i(InterfaceC33646o interfaceC33646o, C33650s c33650s) throws ParserException {
        boolean z4;
        C35805e c35805e;
        int i13;
        C35805e c35805e2;
        if (this.f152294j != -1) {
            long position = interfaceC33646o.getPosition();
            long j7 = this.f152294j;
            if (j7 < position || j7 > 262144 + position) {
                c33650s.f140436a = j7;
                z4 = true;
            } else {
                interfaceC33646o.mo3100n((int) (j7 - position));
                z4 = false;
            }
        } else {
            z4 = false;
        }
        this.f152294j = -1L;
        if (z4) {
            return 1;
        }
        int i14 = this.f152289e;
        int i15 = 4;
        C35805e c35805e3 = null;
        C11078p c11078p = this.f152286b;
        C38059n c38059n = this.f152285a;
        switch (i14) {
            case 0:
                if (!mo1542h(interfaceC33646o)) {
                    throw ParserException.m5049a(null, "AVI Header List not found");
                }
                interfaceC33646o.mo3100n(12);
                this.f152289e = 1;
                return 0;
            case 1:
                interfaceC33646o.readFully(c38059n.f163017a, 0, 12);
                c38059n.m121846F(0);
                c11078p.getClass();
                c11078p.f35038a = c38059n.m121856i();
                c11078p.f35039b = c38059n.m121856i();
                c11078p.f35040c = 0;
                if (c11078p.f35038a != 1414744396) {
                    throw ParserException.m5049a(null, "LIST expected, found: " + c11078p.f35038a);
                }
                int iM121856i = c38059n.m121856i();
                c11078p.f35040c = iM121856i;
                if (iM121856i == 1819436136) {
                    this.f152296l = c11078p.f35039b;
                    this.f152289e = 2;
                    return 0;
                }
                throw ParserException.m5049a(null, "hdrl expected, found: " + c11078p.f35040c);
            case 2:
                int i16 = this.f152296l - 4;
                C38059n c38059n2 = new C38059n(i16);
                interfaceC33646o.readFully(c38059n2.f163017a, 0, i16);
                C35806f c35806fM113526b = C35806f.m113526b(1819436136, c38059n2);
                int i17 = c35806fM113526b.f152325b;
                if (i17 != 1819436136) {
                    throw ParserException.m5049a(null, "Unexpected header list type " + i17);
                }
                C35803c c35803c = (C35803c) c35806fM113526b.m113527a(C35803c.class);
                if (c35803c == null) {
                    throw ParserException.m5049a(null, "AviHeader not found");
                }
                this.f152291g = c35803c;
                this.f152292h = ((long) c35803c.f152303c) * ((long) c35803c.f152301a);
                ArrayList arrayList = new ArrayList();
                C41017e0 c41017e0ListIterator = c35806fM113526b.f152324a.listIterator(0);
                int i18 = 0;
                while (c41017e0ListIterator.hasNext()) {
                    InterfaceC35801a interfaceC35801a = (InterfaceC35801a) c41017e0ListIterator.next();
                    if (interfaceC35801a.getType() == 1819440243) {
                        C35806f c35806f = (C35806f) interfaceC35801a;
                        int i19 = i18 + 1;
                        C35804d c35804d = (C35804d) c35806f.m113527a(C35804d.class);
                        C35807g c35807g = (C35807g) c35806f.m113527a(C35807g.class);
                        if (c35804d == null) {
                            AbstractC38046a.m121826u("AviExtractor", "Missing Stream Header");
                        } else if (c35807g == null) {
                            AbstractC38046a.m121826u("AviExtractor", "Missing Stream Format");
                        } else {
                            long j13 = c35804d.f152307d;
                            long j14 = 1000000 * ((long) c35804d.f152305b);
                            long j15 = c35804d.f152306c;
                            int i24 = AbstractC38065t.f163031a;
                            long jM121903Q = AbstractC38065t.m121903Q(j13, j14, j15, RoundingMode.DOWN);
                            C34610p c34610p = c35807g.f152326a;
                            C34608o c34608oM109410a = c34610p.m109410a();
                            c34608oM109410a.f145729a = Integer.toString(i18);
                            int i25 = c35804d.f152308e;
                            if (i25 != 0) {
                                c34608oM109410a.f145742n = i25;
                            }
                            C35808h c35808h = (C35808h) c35806f.m113527a(C35808h.class);
                            if (c35808h != null) {
                                c34608oM109410a.f145730b = c35808h.f152327a;
                            }
                            int iM109376i = AbstractC34587d0.m109376i(c34610p.f145783n);
                            if (iM109376i == 1 || iM109376i == 2) {
                                InterfaceC33639k0 interfaceC33639k0Mo3101o = this.f152290f.mo3101o(i18, iM109376i);
                                AbstractC21702c.m61152w(c34608oM109410a, interfaceC33639k0Mo3101o);
                                this.f152292h = Math.max(this.f152292h, jM121903Q);
                                c35805e = new C35805e(i18, c35804d, interfaceC33639k0Mo3101o);
                            }
                            if (c35805e != null) {
                                arrayList.add(c35805e);
                            }
                            i18 = i19;
                        }
                        c35805e = null;
                        if (c35805e != null) {
                            arrayList.add(c35805e);
                        }
                        i18 = i19;
                    }
                }
                this.f152293i = (C35805e[]) arrayList.toArray(new C35805e[0]);
                this.f152290f.mo3098l();
                this.f152289e = 3;
                return 0;
            case 3:
                if (this.f152297m != -1) {
                    long position2 = interfaceC33646o.getPosition();
                    long j16 = this.f152297m;
                    if (position2 != j16) {
                        this.f152294j = j16;
                        return 0;
                    }
                }
                interfaceC33646o.mo3103p(c38059n.f163017a, 0, 12);
                interfaceC33646o.mo3093e();
                c38059n.m121846F(0);
                c11078p.getClass();
                c11078p.f35038a = c38059n.m121856i();
                c11078p.f35039b = c38059n.m121856i();
                c11078p.f35040c = 0;
                int iM121856i2 = c38059n.m121856i();
                int i26 = c11078p.f35038a;
                if (i26 == 1179011410) {
                    interfaceC33646o.mo3100n(12);
                    return 0;
                }
                if (i26 != 1414744396 || iM121856i2 != 1769369453) {
                    this.f152294j = interfaceC33646o.getPosition() + ((long) c11078p.f35039b) + 8;
                    return 0;
                }
                long position3 = interfaceC33646o.getPosition();
                this.f152297m = position3;
                this.f152298n = position3 + ((long) c11078p.f35039b) + 8;
                if (!this.f152300p) {
                    C35803c c35803c2 = this.f152291g;
                    c35803c2.getClass();
                    if ((c35803c2.f152302b & 16) == 16) {
                        this.f152289e = 4;
                        this.f152294j = this.f152298n;
                        return 0;
                    }
                    this.f152290f.mo3109v(new C33651t(this.f152292h));
                    this.f152300p = true;
                }
                this.f152294j = interfaceC33646o.getPosition() + 12;
                this.f152289e = 6;
                return 0;
            case 4:
                interfaceC33646o.readFully(c38059n.f163017a, 0, 8);
                c38059n.m121846F(0);
                int iM121856i3 = c38059n.m121856i();
                int iM121856i4 = c38059n.m121856i();
                if (iM121856i3 != 829973609) {
                    this.f152294j = interfaceC33646o.getPosition() + ((long) iM121856i4);
                    return 0;
                }
                this.f152289e = 5;
                this.f152299o = iM121856i4;
                return 0;
            case 5:
                C38059n c38059n3 = new C38059n(this.f152299o);
                interfaceC33646o.readFully(c38059n3.f163017a, 0, this.f152299o);
                long j17 = 0;
                if (c38059n3.m121848a() >= 16) {
                    int i27 = c38059n3.f163018b;
                    c38059n3.m121847G(8);
                    long jM121856i = c38059n3.m121856i();
                    long j18 = this.f152297m;
                    j17 = jM121856i <= j18 ? j18 + 8 : 0L;
                    c38059n3.m121846F(i27);
                }
                while (c38059n3.m121848a() >= 16) {
                    int iM121856i5 = c38059n3.m121856i();
                    int iM121856i6 = c38059n3.m121856i();
                    long jM121856i2 = ((long) c38059n3.m121856i()) + j17;
                    c38059n3.m121847G(i15);
                    C35805e[] c35805eArr = this.f152293i;
                    int length = c35805eArr.length;
                    int i28 = 0;
                    while (true) {
                        if (i28 < length) {
                            c35805e2 = c35805eArr[i28];
                            if (c35805e2.f152312c != iM121856i5 && c35805e2.f152313d != iM121856i5) {
                                i28++;
                            }
                        } else {
                            c35805e2 = null;
                        }
                    }
                    if (c35805e2 != null) {
                        boolean z13 = (iM121856i6 & 16) == 16;
                        if (c35805e2.f152321l == -1) {
                            c35805e2.f152321l = jM121856i2;
                        }
                        if (z13) {
                            if (c35805e2.f152320k == c35805e2.f152323n.length) {
                                long[] jArr = c35805e2.f152322m;
                                c35805e2.f152322m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                int[] iArr = c35805e2.f152323n;
                                c35805e2.f152323n = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
                            }
                            long[] jArr2 = c35805e2.f152322m;
                            int i29 = c35805e2.f152320k;
                            jArr2[i29] = jM121856i2;
                            c35805e2.f152323n[i29] = c35805e2.f152319j;
                            c35805e2.f152320k = i29 + 1;
                        }
                        c35805e2.f152319j++;
                    }
                    i15 = 4;
                }
                for (C35805e c35805e4 : this.f152293i) {
                    c35805e4.f152322m = Arrays.copyOf(c35805e4.f152322m, c35805e4.f152320k);
                    c35805e4.f152323n = Arrays.copyOf(c35805e4.f152323n, c35805e4.f152320k);
                    if ((c35805e4.f152312c & 1651965952) == 1651965952 && c35805e4.f152310a.f152309f != 0 && (i13 = c35805e4.f152320k) > 0) {
                        c35805e4.f152315f = i13;
                    }
                }
                this.f152300p = true;
                if (this.f152293i.length == 0) {
                    this.f152290f.mo3109v(new C33651t(this.f152292h));
                } else {
                    this.f152290f.mo3109v(new C33651t(this, this.f152292h, 2));
                }
                this.f152289e = 6;
                this.f152294j = this.f152297m;
                return 0;
            case 6:
                if (interfaceC33646o.getPosition() >= this.f152298n) {
                    return -1;
                }
                C35805e c35805e5 = this.f152295k;
                if (c35805e5 != null) {
                    int i34 = c35805e5.f152317h;
                    int iMo36175c = i34 - c35805e5.f152311b.mo36175c(interfaceC33646o, i34, false);
                    c35805e5.f152317h = iMo36175c;
                    boolean z14 = iMo36175c == 0;
                    if (z14) {
                        if (c35805e5.f152316g > 0) {
                            InterfaceC33639k0 interfaceC33639k0 = c35805e5.f152311b;
                            int i35 = c35805e5.f152318i;
                            interfaceC33639k0.mo36174b((c35805e5.f152314e * ((long) i35)) / ((long) c35805e5.f152315f), Arrays.binarySearch(c35805e5.f152323n, i35) >= 0 ? 1 : 0, c35805e5.f152316g, 0, null);
                        }
                        c35805e5.f152318i++;
                    }
                    if (z14) {
                        this.f152295k = null;
                    }
                    return 0;
                }
                if ((interfaceC33646o.getPosition() & 1) == 1) {
                    interfaceC33646o.mo3100n(1);
                }
                interfaceC33646o.mo3103p(c38059n.f163017a, 0, 12);
                c38059n.m121846F(0);
                int iM121856i7 = c38059n.m121856i();
                if (iM121856i7 == 1414744396) {
                    c38059n.m121846F(8);
                    interfaceC33646o.mo3100n(c38059n.m121856i() == 1769369453 ? 12 : 8);
                    interfaceC33646o.mo3093e();
                    return 0;
                }
                int iM121856i8 = c38059n.m121856i();
                if (iM121856i7 == 1263424842) {
                    this.f152294j = interfaceC33646o.getPosition() + ((long) iM121856i8) + 8;
                    return 0;
                }
                interfaceC33646o.mo3100n(8);
                interfaceC33646o.mo3093e();
                for (C35805e c35805e6 : this.f152293i) {
                    if (c35805e6.f152312c == iM121856i7 || c35805e6.f152313d == iM121856i7) {
                        c35805e3 = c35805e6;
                        if (c35805e3 == null) {
                            this.f152294j = interfaceC33646o.getPosition() + ((long) iM121856i8);
                            return 0;
                        }
                        c35805e3.f152316g = iM121856i8;
                        c35805e3.f152317h = iM121856i8;
                        this.f152295k = c35805e3;
                        return 0;
                    }
                }
                if (c35805e3 == null) {
                    this.f152294j = interfaceC33646o.getPosition() + ((long) iM121856i8);
                    return 0;
                }
                c35805e3.f152316g = iM121856i8;
                c35805e3.f152317h = iM121856i8;
                this.f152295k = c35805e3;
                return 0;
            default:
                throw new AssertionError();
        }
    }

    @Override // p499t9.InterfaceC33644n
    public final void release() {
    }
}
