package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.node.Owner;
import java.util.Map;
import m83.AbstractC25260n;
import p002a0.C0057v0;
import p002a0.C0059w0;
import p557vo.AbstractC36220b;
import p603x2.AbstractC37831a;
import p635y2.AbstractC39071a;
import p635y2.AbstractC39104j1;
import p635y2.C39117o;
import p635y2.C39118o0;
import p635y2.C39149y1;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p635y2.InterfaceC39147y;
import p636y3.C39178j;
import p636y3.C39180l;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.w0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0262w0 extends AbstractC39104j1 implements InterfaceC0211i1, InterfaceC39133t0 {

    /* JADX INFO: renamed from: F */
    public C0253t0 f893F;

    /* JADX INFO: renamed from: G */
    public Function1 f894G;

    /* JADX INFO: renamed from: H */
    public C0196e2 f895H;

    /* JADX INFO: renamed from: I */
    public boolean f896I;

    /* JADX INFO: renamed from: J */
    public boolean f897J;

    /* JADX INFO: renamed from: K */
    public boolean f898K;

    /* JADX INFO: renamed from: L */
    public final C39118o0 f899L = new C39118o0(this, 0);

    /* JADX INFO: renamed from: M */
    public C0212i2 f900M;

    /* JADX INFO: renamed from: N */
    public C0057v0 f901N;

    /* JADX INFO: renamed from: S0 */
    public static void m780S0(NodeCoordinator nodeCoordinator) {
        C0234o0 c0234o0;
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f4859P;
        C0230n0 c0230n0 = nodeCoordinator.f4858O;
        if (!AbstractC22676k.m65745e(nodeCoordinator2 != null ? nodeCoordinator2.f4858O : null, c0230n0)) {
            c0230n0.m643t().f854p.f672Y.m419g();
            return;
        }
        InterfaceC0181b interfaceC0181bMo428f = c0230n0.m643t().f854p.mo428f();
        if (interfaceC0181bMo428f == null || (c0234o0 = ((C0203g1) interfaceC0181bMo428f).f672Y) == null) {
            return;
        }
        c0234o0.m419g();
    }

    @Override // p635y2.InterfaceC39126r
    /* JADX INFO: renamed from: A */
    public boolean mo781A() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C0 */
    public final void m782C0(C0230n0 c0230n0, C39117o c39117o) {
        char c3;
        long j7;
        long j13;
        long j14;
        long[] jArr;
        long[] jArr2;
        long j15;
        int i13;
        char c7;
        long j16;
        long j17;
        int i14;
        int i15;
        int i16;
        C0057v0 c0057v0 = this.f901N;
        char c14 = 7;
        long j18 = -9187201950435737472L;
        int i17 = 8;
        if (c0057v0 != null) {
            Object[] objArr = c0057v0.f172c;
            long[] jArr3 = c0057v0.f170a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i18 = 0;
                long j19 = 128;
                while (true) {
                    long j24 = jArr3[i18];
                    j13 = 255;
                    if ((((~j24) << c14) & j24 & j18) != j18) {
                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                        int i24 = 0;
                        while (i24 < i19) {
                            if ((j24 & 255) < j19) {
                                c7 = c14;
                                C0059w0 c0059w0 = (C0059w0) objArr[(i18 << 3) + i24];
                                j16 = j18;
                                Object[] objArr2 = c0059w0.f178b;
                                long[] jArr4 = c0059w0.f177a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j17 = j19;
                                    int i25 = 0;
                                    int i26 = i17;
                                    while (true) {
                                        int i27 = length2;
                                        long j25 = jArr4[i25];
                                        jArr2 = jArr3;
                                        j15 = j24;
                                        if ((((~j25) << c7) & j25 & j16) != j16) {
                                            int i28 = 8 - ((~(i25 - i27)) >>> 31);
                                            int i29 = 0;
                                            while (i29 < i28) {
                                                if ((j25 & 255) < j17) {
                                                    int i34 = (i25 << 3) + i29;
                                                    C0230n0 c0230n1 = (C0230n0) ((C0248r2) objArr2[i34]).get();
                                                    i15 = i29;
                                                    if (c0230n1 != null) {
                                                        boolean zM605X = c0230n1.m605X();
                                                        i16 = i24;
                                                        if (zM605X) {
                                                        }
                                                    } else {
                                                        i16 = i24;
                                                    }
                                                    c0059w0.m148m(i34);
                                                } else {
                                                    i15 = i29;
                                                    i16 = i24;
                                                }
                                                j25 >>= i26;
                                                i29 = i15 + 1;
                                                i24 = i16;
                                            }
                                            i13 = i24;
                                            if (i28 != i26) {
                                                break;
                                            }
                                        } else {
                                            i13 = i24;
                                        }
                                        length2 = i27;
                                        if (i25 == length2) {
                                            break;
                                        }
                                        i25++;
                                        jArr3 = jArr2;
                                        j24 = j15;
                                        i24 = i13;
                                        i26 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j15 = j24;
                                    i13 = i24;
                                    j17 = j19;
                                }
                                i14 = 8;
                            } else {
                                jArr2 = jArr3;
                                j15 = j24;
                                i13 = i24;
                                c7 = c14;
                                j16 = j18;
                                j17 = j19;
                                i14 = i17;
                            }
                            i17 = i14;
                            j24 = j15 >> i14;
                            c14 = c7;
                            j18 = j16;
                            j19 = j17;
                            i24 = i13 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c3 = c14;
                        j7 = j18;
                        j14 = j19;
                        if (i19 != i17) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c3 = c14;
                        j7 = j18;
                        j14 = j19;
                    }
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                    c14 = c3;
                    j18 = j7;
                    j19 = j14;
                    jArr3 = jArr;
                    i17 = 8;
                }
            } else {
                c3 = 7;
                j7 = -9187201950435737472L;
                j13 = 255;
                j14 = 128;
            }
        } else {
            c3 = 7;
            j7 = -9187201950435737472L;
            j13 = 255;
            j14 = 128;
        }
        C0057v0 c0057v1 = this.f901N;
        if (c0057v1 != null) {
            long[] jArr5 = c0057v1.f170a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i35 = 0;
                while (true) {
                    long j26 = jArr5[i35];
                    if ((((~j26) << c3) & j26 & j7) != j7) {
                        int i36 = 8 - ((~(i35 - length3)) >>> 31);
                        for (int i37 = 0; i37 < i36; i37++) {
                            if ((j26 & j13) < j14) {
                                int i38 = (i35 << 3) + i37;
                                if (((C0059w0) c0057v1.f172c[i38]).m142g()) {
                                    c0057v1.m134l(i38);
                                }
                            }
                            j26 >>= 8;
                        }
                        if (i36 != 8) {
                            break;
                        }
                    }
                    if (i35 == length3) {
                        break;
                    } else {
                        i35++;
                    }
                }
            }
        }
        C0057v0 c0057v2 = this.f901N;
        if (c0057v2 == null) {
            c0057v2 = new C0057v0();
            this.f901N = c0057v2;
        }
        Object objM129g = c0057v2.m129g(c39117o);
        if (objM129g == null) {
            objM129g = new C0059w0();
            c0057v2.m135m(c39117o, objM129g);
        }
        ((C0059w0) objM129g).m146k(new C0248r2(c0230n0));
    }

    /* JADX INFO: renamed from: F0 */
    public abstract int mo475F0(AbstractC39071a abstractC39071a);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public final void m783G0(C0196e2 c0196e2, long j7, long j13) {
        boolean z4;
        char c3;
        long j14;
        long j15;
        long j16;
        C0230n0 c0230n0;
        boolean z13;
        int i13;
        char c7;
        long j17;
        C0188c2 snapshotObserver;
        C0057v0 c0057v0 = this.f901N;
        C0212i2 c0212i2 = this.f900M;
        if (c0212i2 == null) {
            c0212i2 = new C0212i2();
            this.f900M = c0212i2;
        }
        C0212i2 c0212i3 = c0212i2;
        Owner owner = mo788N0().f765M;
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.m457a(c0196e2, C0197f.f646y, new C0256u0(this, j7, j13, c0196e2));
        }
        boolean zMo781A = mo781A();
        C0059w0 c0059w0 = (C0059w0) c0212i3.f708e;
        C0059w0 c0059w1 = (C0059w0) c0212i3.f709f;
        int i14 = c0212i3.f704a;
        for (int i15 = 0; i15 < i14; i15++) {
            byte b = ((byte[]) c0212i3.f707d)[i15];
            if (b == 3) {
                C39117o c39117o = ((C39117o[]) c0212i3.f705b)[i15];
                AbstractC22676k.m65747g(c39117o);
                c0059w1.m146k(c39117o);
            } else if (b != 0 && c0057v0 != null) {
                C39117o c39117o2 = ((C39117o[]) c0212i3.f705b)[i15];
                AbstractC22676k.m65747g(c39117o2);
                C0059w0 c0059w2 = (C0059w0) c0057v0.m133k(c39117o2);
                if (c0059w2 != null) {
                    c0059w0.m145j(c0059w2);
                }
            }
        }
        int i16 = c0212i3.f704a;
        int i17 = 0;
        for (int i18 = 0; i18 < i16; i18++) {
            byte[] bArr = (byte[]) c0212i3.f707d;
            if (bArr[i18] == 2) {
                i17++;
            } else if (i17 > 0) {
                C39117o[] c39117oArr = (C39117o[]) c0212i3.f705b;
                c39117oArr[i18 - i17] = c39117oArr[i18];
            }
            bArr[i18] = 2;
        }
        int i19 = c0212i3.f704a;
        for (int i24 = i19 - i17; i24 < i19; i24++) {
            ((C39117o[]) c0212i3.f705b)[i24] = null;
        }
        c0212i3.f704a -= i17;
        AbstractC0262w0 abstractC0262w0Mo790P0 = mo790P0();
        Object[] objArr = c0059w1.f178b;
        long[] jArr = c0059w1.f177a;
        int length = jArr.length - 2;
        char c14 = 7;
        long j18 = -9187201950435737472L;
        int i25 = 8;
        if (length >= 0) {
            j15 = 128;
            int i26 = 0;
            while (true) {
                long j19 = jArr[i26];
                j16 = 255;
                if ((((~j19) << c14) & j19 & j18) != j18) {
                    int i27 = 8 - ((~(i26 - length)) >>> 31);
                    int i28 = 0;
                    while (i28 < i27) {
                        if ((j19 & 255) < 128) {
                            c7 = c14;
                            C39117o c39117o3 = (C39117o) objArr[(i26 << 3) + i28];
                            j17 = j18;
                            AbstractC0262w0 abstractC0262w0 = abstractC0262w0Mo790P0 == null ? this : abstractC0262w0Mo790P0;
                            i13 = i25;
                            AbstractC0262w0 abstractC0262w1 = abstractC0262w0;
                            while (true) {
                                C0212i2 c0212i4 = abstractC0262w1.f900M;
                                if (c0212i4 != null) {
                                    z13 = zMo781A;
                                    if (AbstractC25260n.m74056a0((C39117o[]) c0212i4.f705b, c39117o3)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z13 = zMo781A;
                                AbstractC0262w0 abstractC0262w0Mo790P1 = abstractC0262w1.mo790P0();
                                if (abstractC0262w0Mo790P1 == null) {
                                    break;
                                }
                                abstractC0262w1 = abstractC0262w0Mo790P1;
                                zMo781A = z13;
                            }
                            C0057v0 c0057v1 = abstractC0262w1.f901N;
                            C0059w0 c0059w3 = c0057v1 != null ? (C0059w0) c0057v1.m133k(c39117o3) : null;
                            if (c0059w3 != null) {
                                abstractC0262w0.m793T0(c0059w3);
                            }
                        } else {
                            z13 = zMo781A;
                            i13 = i25;
                            c7 = c14;
                            j17 = j18;
                        }
                        j19 >>= i13;
                        i28++;
                        c14 = c7;
                        j18 = j17;
                        i25 = i13;
                        zMo781A = z13;
                    }
                    z4 = zMo781A;
                    c3 = c14;
                    j14 = j18;
                    if (i27 != i25) {
                        break;
                    }
                } else {
                    z4 = zMo781A;
                    c3 = c14;
                    j14 = j18;
                }
                if (i26 == length) {
                    break;
                }
                i26++;
                c14 = c3;
                j18 = j14;
                zMo781A = z4;
                i25 = 8;
            }
        } else {
            z4 = zMo781A;
            c3 = 7;
            j14 = -9187201950435737472L;
            j15 = 128;
            j16 = 255;
        }
        c0059w1.m137b();
        Object[] objArr2 = c0059w0.f178b;
        long[] jArr2 = c0059w0.f177a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i29 = 0;
            while (true) {
                long j24 = jArr2[i29];
                if ((((~j24) << c3) & j24 & j14) != j14) {
                    int i34 = 8 - ((~(i29 - length2)) >>> 31);
                    for (int i35 = 0; i35 < i34; i35++) {
                        if ((j24 & j16) < j15 && (c0230n0 = (C0230n0) ((C0248r2) objArr2[(i29 << 3) + i35]).get()) != null) {
                            if (z4) {
                                c0230n0.m642s0(false);
                            } else {
                                c0230n0.m645u0(false);
                            }
                        }
                        j24 >>= 8;
                    }
                    if (i34 != 8) {
                        break;
                    }
                }
                if (i29 == length2) {
                    break;
                } else {
                    i29++;
                }
            }
        }
        c0059w0.m137b();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[LOOP:0: B:11:0x001c->B:21:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0056 A[EDGE_INSN: B:48:0x0056->B:22:0x0056 BREAK  A[LOOP:0: B:11:0x001c->B:21:0x0053], SYNTHETIC] */
    /* JADX INFO: renamed from: H0 */
    public final void m784H0(InterfaceC39130s0 interfaceC39130s0) {
        long j7;
        long j13;
        C0057v0 c0057v0 = this.f901N;
        if (!this.f898K) {
            Function1 function1Mo778c = interfaceC39130s0.mo778c();
            if (function1Mo778c != null) {
                boolean z4 = this.f894G != function1Mo778c;
                if (z4 || !m792R0().f866w) {
                    j7 = 0;
                    j13 = 9223372034707292159L;
                } else {
                    InterfaceC39147y interfaceC39147yMo786L0 = mo786L0();
                    long jM115291C = AbstractC36220b.m115291C(interfaceC39147yMo786L0.mo3516S(0L));
                    long jMo3541n = interfaceC39147yMo786L0.mo3541n();
                    j13 = jM115291C;
                    j7 = jMo3541n;
                    z4 = (C39178j.m124792b(jM115291C, m792R0().f867x) && C39180l.m124799a(jMo3541n, m792R0().f868y)) ? false : true;
                }
                if (z4) {
                    C0196e2 c0196e2 = this.f895H;
                    if (c0196e2 != null) {
                        c0196e2.f634w = interfaceC39130s0;
                    } else {
                        c0196e2 = new C0196e2(interfaceC39130s0, this);
                        this.f895H = c0196e2;
                    }
                    m783G0(c0196e2, j13, j7);
                    this.f894G = interfaceC39130s0.mo778c();
                }
            } else if (c0057v0 != null) {
                Object[] objArr = c0057v0.f172c;
                long[] jArr = c0057v0.f170a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j14 = jArr[i13];
                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i13 != length) {
                                break;
                                break;
                            }
                            i13++;
                        } else {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((255 & j14) < 128) {
                                    m793T0((C0059w0) objArr[(i13 << 3) + i15]);
                                }
                                j14 >>= 8;
                            }
                            if (i14 != 8) {
                                break;
                            } else if (i13 != length) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                c0057v0.m123a();
            }
        }
    }

    /* JADX INFO: renamed from: I0 */
    public abstract AbstractC0262w0 mo785I0();

    /* JADX INFO: renamed from: L0 */
    public abstract InterfaceC39147y mo786L0();

    /* JADX INFO: renamed from: M0 */
    public abstract boolean mo787M0();

    /* JADX INFO: renamed from: N0 */
    public abstract C0230n0 mo788N0();

    /* JADX INFO: renamed from: O0 */
    public abstract InterfaceC39130s0 mo789O0();

    /* JADX INFO: renamed from: P0 */
    public abstract AbstractC0262w0 mo790P0();

    /* JADX INFO: renamed from: Q0 */
    public abstract long mo791Q0();

    /* JADX INFO: renamed from: R0 */
    public final C0253t0 m792R0() {
        C0253t0 c0253t0 = this.f893F;
        if (c0253t0 != null) {
            return c0253t0;
        }
        C0253t0 c0253t1 = new C0253t0(this);
        this.f893F = c0253t1;
        return c0253t1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T0 */
    public final void m793T0(C0059w0 c0059w0) {
        C0230n0 c0230n0;
        Object[] objArr = c0059w0.f178b;
        long[] jArr = c0059w0.f177a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j7 = jArr[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j7) < 128 && (c0230n0 = (C0230n0) ((C0248r2) objArr[(i13 << 3) + i15]).get()) != null) {
                        if (mo781A()) {
                            c0230n0.m642s0(false);
                        } else {
                            c0230n0.m645u0(false);
                        }
                    }
                    j7 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public abstract void mo794U0();

    @Override // p635y2.AbstractC39104j1
    /* JADX INFO: renamed from: c0 */
    public final int mo450c0(AbstractC39071a abstractC39071a) {
        int iMo475F0;
        if (mo787M0() && (iMo475F0 = mo475F0(abstractC39071a)) != Integer.MIN_VALUE) {
            return iMo475F0 + ((int) (abstractC39071a instanceof C39149y1 ? this.f168210E >> 32 : this.f168210E & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // p005a3.InterfaceC0211i1
    /* JADX INFO: renamed from: s */
    public final void mo456s(boolean z4) {
        AbstractC0262w0 abstractC0262w0Mo790P0 = mo790P0();
        C0230n0 c0230n0Mo788N0 = abstractC0262w0Mo790P0 != null ? abstractC0262w0Mo790P0.mo788N0() : null;
        if (AbstractC22676k.m65745e(c0230n0Mo788N0, mo788N0())) {
            this.f896I = z4;
            return;
        }
        if ((c0230n0Mo788N0 != null ? c0230n0Mo788N0.m646v() : null) != EnumC0206h0.f693y) {
            if ((c0230n0Mo788N0 != null ? c0230n0Mo788N0.m646v() : null) != EnumC0206h0.f694z) {
                return;
            }
        }
        this.f896I = z4;
    }

    @Override // p635y2.InterfaceC39133t0
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC39130s0 mo795x0(int i13, int i14, Map map, Function1 function1, Function1 function2) {
        if ((i13 & (-16777216)) != 0 || ((-16777216) & i14) != 0) {
            AbstractC37831a.m121374b("Size(" + i13 + " x " + i14 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0259v0(i13, i14, map, function1, function2, this);
    }
}
