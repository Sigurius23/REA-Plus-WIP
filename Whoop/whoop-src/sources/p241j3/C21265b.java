package p241j3;

import ae3.C0803k;
import android.os.Handler;
import androidx.compose.p018ui.node.C1134a;
import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.core.app.FrameMetricsAggregator;
import c93.InterfaceC4339a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p002a0.C0023g0;
import p002a0.C0047q0;
import p005a3.AbstractC0201g;
import p005a3.C0203g1;
import p005a3.C0222l0;
import p005a3.C0223l1;
import p005a3.C0230n0;
import p005a3.InterfaceC0180a2;
import p026b2.AbstractC2297c;
import p026b2.RunnableC2296b;
import p027b3.C2374f2;
import p181h2.C16616a;
import p208i2.AbstractC17918w0;
import p208i2.C17896l0;
import p249jc.AbstractC21598x;
import p446r1.C30849c;
import p557vo.AbstractC36220b;
import p636y3.C39178j;

/* JADX INFO: renamed from: j3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C21265b {

    /* JADX INFO: renamed from: a */
    public final C0803k f81183a;

    /* JADX INFO: renamed from: b */
    public final C21268e f81184b;

    /* JADX INFO: renamed from: c */
    public final C0047q0 f81185c;

    /* JADX INFO: renamed from: d */
    public boolean f81186d;

    /* JADX INFO: renamed from: e */
    public boolean f81187e;

    /* JADX INFO: renamed from: f */
    public boolean f81188f;

    /* JADX INFO: renamed from: g */
    public RunnableC2296b f81189g;

    /* JADX INFO: renamed from: h */
    public long f81190h;

    /* JADX INFO: renamed from: i */
    public final C0222l0 f81191i;

    /* JADX INFO: renamed from: j */
    public final C16616a f81192j;

    public C21265b() {
        C0803k c0803k = new C0803k(3);
        c0803k.f2965c = new long[192];
        c0803k.f2966d = new long[192];
        this.f81183a = c0803k;
        this.f81184b = new C21268e();
        this.f81185c = new C0047q0();
        this.f81190h = -1L;
        this.f81191i = new C0222l0(this, 14);
        this.f81192j = new C16616a();
    }

    /* JADX INFO: renamed from: a */
    public static long m59665a(NodeCoordinator nodeCoordinator, long j7) {
        float[] fArrM7307b;
        int iM60676d;
        InterfaceC0180a2 interfaceC0180a2 = nodeCoordinator.f4878i0;
        if (interfaceC0180a2 == null || (iM60676d = AbstractC21598x.m60676d((fArrM7307b = ((C2374f2) interfaceC0180a2).m7307b()))) == 3) {
            return j7;
        }
        if ((iM60676d & 2) == 0) {
            return 9223372034707292159L;
        }
        return AbstractC36220b.m115291C(C17896l0.m51472b((((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32), fArrM7307b));
    }

    /* JADX INFO: renamed from: h */
    public static long m59666h(C0230n0 c0230n0) {
        C0223l1 c0223l1 = c0230n0.f783e0;
        NodeCoordinator nodeCoordinator = (NodeCoordinator) c0223l1.f741e;
        long jM124794d = 0;
        for (NodeCoordinator nodeCoordinator2 = (C1134a) c0223l1.f740d; nodeCoordinator2 != null && nodeCoordinator2 != nodeCoordinator; nodeCoordinator2 = nodeCoordinator2.f4860Q) {
            long jM59665a = m59665a(nodeCoordinator2, jM124794d);
            if (C39178j.m124792b(jM59665a, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            jM124794d = C39178j.m124794d(jM59665a, nodeCoordinator2.f4869Z);
        }
        return jM124794d;
    }

    /* JADX INFO: renamed from: i */
    public static void m59667i(C0230n0 c0230n0) {
        long jM59666h;
        NodeCoordinator nodeCoordinator = (NodeCoordinator) c0230n0.f783e0.f741e;
        long jM59665a = m59665a(nodeCoordinator, 0L);
        long jM124794d = 9223372034707292159L;
        if (!AbstractC21598x.m60681h(jM59665a)) {
            c0230n0.f796y = 9223372034707292159L;
            return;
        }
        long jM124794d2 = C39178j.m124794d(jM59665a, nodeCoordinator.f4869Z);
        C0230n0 c0230n0M588G = c0230n0.m588G();
        if (c0230n0M588G != null) {
            if (!AbstractC21598x.m60681h(c0230n0M588G.f796y)) {
                m59667i(c0230n0M588G);
            }
            long j7 = c0230n0M588G.f796y;
            if (AbstractC21598x.m60681h(j7)) {
                if (c0230n0M588G.f758F) {
                    jM59666h = m59666h(c0230n0M588G);
                    c0230n0M588G.f757E = jM59666h;
                    c0230n0M588G.f758F = false;
                } else {
                    jM59666h = c0230n0M588G.f757E;
                }
                if (AbstractC21598x.m60681h(jM59666h)) {
                    jM124794d = C39178j.m124794d(C39178j.m124794d(j7, jM59666h), jM124794d2);
                }
            }
        } else {
            jM124794d = jM124794d2;
        }
        c0230n0.f796y = jM124794d;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0222  */
    /* JADX INFO: renamed from: b */
    public final void m59668b() {
        C0803k c0803k;
        C21268e c21268e;
        long j7;
        long j13;
        C21268e c21268e2;
        long j14;
        C21268e c21268e3;
        int i13;
        float[] fArr;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        long j15;
        Handler handler = AbstractC2297c.f9099a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z4 = this.f81186d;
        int i14 = 0;
        boolean z13 = z4 || this.f81187e;
        C0803k c0803k2 = this.f81183a;
        int i15 = 8;
        C21268e c21268e4 = this.f81184b;
        if (z4) {
            this.f81186d = false;
            C0047q0 c0047q0 = this.f81185c;
            Object[] objArr3 = c0047q0.f136a;
            int i16 = c0047q0.f137b;
            for (int i17 = 0; i17 < i16; i17++) {
                ((InterfaceC4339a) objArr3[i17]).invoke();
            }
            long[] jArr3 = (long[]) c0803k2.f2965c;
            int i18 = c0803k2.f2964b;
            int i19 = 0;
            while (i19 < jArr3.length - 2 && i19 < i18) {
                long j16 = jCurrentTimeMillis;
                long j17 = jArr3[i19 + 2];
                if ((((int) (j17 >> 61)) & 1) != 0) {
                    long j18 = jArr3[i19];
                    long j19 = jArr3[i19 + 1];
                    C21267d c21267d = (C21267d) c21268e4.f81208a.m121b(((int) j17) & 67108863);
                    while (c21267d != null) {
                        C0803k c0803k3 = c0803k2;
                        int i24 = i15;
                        C21268e c21268e5 = c21268e4;
                        C21267d c21267d2 = c21267d;
                        long j24 = j16;
                        long j25 = j18;
                        c21268e5.m59680b(c21267d2, j25, j19, j24);
                        j16 = j24;
                        i19 = i19;
                        c21267d = c21267d2.f81203d;
                        i15 = i24;
                        c21268e4 = c21268e5;
                        i18 = i18;
                        c0803k2 = c0803k3;
                        j18 = j25;
                    }
                }
                i19 += 3;
                c21268e4 = c21268e4;
                i18 = i18;
                c0803k2 = c0803k2;
                i15 = i15;
                jCurrentTimeMillis = j16;
            }
            c0803k = c0803k2;
            int i25 = i15;
            c21268e = c21268e4;
            long j26 = jCurrentTimeMillis;
            j13 = 128;
            C0023g0 c0023g0 = c21268e.f81208a;
            Object[] objArr4 = c0023g0.f150c;
            long[] jArr4 = c0023g0.f148a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i26 = 0;
                while (true) {
                    long j27 = jArr4[i26];
                    if ((((~j27) << 7) & j27 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                        int i28 = i14;
                        while (i28 < i27) {
                            if ((j27 & 255) < 128) {
                                C21267d c21267d3 = (C21267d) objArr4[(i26 << 3) + i28];
                                C21267d c21267d4 = c21267d3;
                                while (c21267d4 != null) {
                                    long j28 = j27;
                                    if (c21267d3.f81206g == Long.MIN_VALUE) {
                                        int i29 = c21267d3.f81200a;
                                        C21264a c21264a = new C21264a(this, c21267d3, j26);
                                        int i34 = i29 & 67108863;
                                        jArr2 = jArr4;
                                        long[] jArr5 = (long[]) c0803k.f2965c;
                                        objArr2 = objArr4;
                                        int i35 = c0803k.f2964b;
                                        j15 = j26;
                                        int i36 = 0;
                                        while (i36 < jArr5.length - 2 && i36 < i35) {
                                            int i37 = i36;
                                            if ((((int) jArr5[i36 + 2]) & 67108863) == i34) {
                                                c21264a.invoke(Long.valueOf(jArr5[i37]), Long.valueOf(jArr5[i37 + 1]));
                                                break;
                                            }
                                            i36 = i37 + 3;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        objArr2 = objArr4;
                                        j15 = j26;
                                    }
                                    c21267d4 = c21267d4.f81203d;
                                    j27 = j28;
                                    jArr4 = jArr2;
                                    objArr4 = objArr2;
                                    j26 = j15;
                                }
                            }
                            j27 >>= i25;
                            i28++;
                            i25 = i25;
                            jArr4 = jArr4;
                            objArr4 = objArr4;
                            j26 = j26;
                        }
                        jArr = jArr4;
                        objArr = objArr4;
                        j7 = j26;
                        if (i27 != i25) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr4;
                        j7 = j26;
                    }
                    if (i26 == length) {
                        break;
                    }
                    i26++;
                    jArr4 = jArr;
                    objArr4 = objArr;
                    j26 = j7;
                    i14 = 0;
                    i25 = 8;
                }
            } else {
                j7 = j26;
            }
            long[] jArr6 = (long[]) c0803k.f2965c;
            int i38 = c0803k.f2964b;
            for (int i39 = 0; i39 < jArr6.length - 2 && i39 < i38; i39 += 3) {
                int i44 = i39 + 2;
                jArr6[i44] = jArr6[i44] & (-2305843009213693953L);
            }
        } else {
            c0803k = c0803k2;
            c21268e = c21268e4;
            j7 = jCurrentTimeMillis;
            j13 = 128;
        }
        if (this.f81187e) {
            this.f81187e = false;
            long j29 = c21268e.f81211d;
            long j34 = c21268e.f81212e;
            float[] fArr2 = c21268e.f81214g;
            C0023g0 c0023g1 = c21268e.f81208a;
            Object[] objArr5 = c0023g1.f150c;
            long[] jArr7 = c0023g1.f148a;
            int length2 = jArr7.length - 2;
            if (length2 >= 0) {
                int i45 = 0;
                while (true) {
                    long j35 = jArr7[i45];
                    long[] jArr8 = jArr7;
                    C21268e c21268e6 = c21268e;
                    if ((((~j35) << 7) & j35 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i46 = 8 - ((~(i45 - length2)) >>> 31);
                        long j36 = j35;
                        int i47 = 0;
                        while (i47 < i46) {
                            if ((j36 & 255) < j13) {
                                C21267d c21267d5 = (C21267d) objArr5[(i45 << 3) + i47];
                                while (c21267d5 != null) {
                                    int i48 = i47;
                                    C21268e c21268e7 = c21268e6;
                                    C21267d c21267d6 = c21267d5;
                                    long j37 = j7;
                                    c21268e7.m59679a(c21267d6, j29, j34, fArr2, j37);
                                    j7 = j37;
                                    fArr2 = fArr2;
                                    c21267d5 = c21267d6.f81203d;
                                    c21268e6 = c21268e7;
                                    i47 = i48;
                                }
                            }
                            j36 >>= 8;
                            j7 = j7;
                            c21268e6 = c21268e6;
                            fArr2 = fArr2;
                            i47++;
                        }
                        c21268e2 = c21268e6;
                        fArr = fArr2;
                        j14 = j7;
                        if (i46 != 8) {
                            break;
                        }
                    } else {
                        c21268e2 = c21268e6;
                        fArr = fArr2;
                        j14 = j7;
                    }
                    if (i45 == length2) {
                        break;
                    }
                    i45++;
                    j7 = j14;
                    jArr7 = jArr8;
                    fArr2 = fArr;
                    c21268e = c21268e2;
                }
            } else {
                c21268e2 = c21268e;
                j14 = j7;
            }
        } else {
            c21268e2 = c21268e;
            j14 = j7;
        }
        if (z13) {
            long j38 = c21268e2.f81211d;
            long j39 = c21268e2.f81212e;
            long j44 = j14;
            float[] fArr3 = c21268e2.f81214g;
            C21267d c21267d7 = c21268e2.f81209b;
            if (c21267d7 != null) {
                C21267d c21267d8 = c21267d7;
                while (c21267d8 != null) {
                    C0230n0 c0230n0M516p = AbstractC0201g.m516p(c21267d8.f81201b);
                    long j45 = c0230n0M516p.f796y;
                    long j46 = c0230n0M516p.f797z;
                    c21267d8.f81204e = j45;
                    C21268e c21268e8 = c21268e2;
                    c21267d8.f81205f = (4294967295L & ((long) (((int) (j45 & 4294967295L)) + ((int) (j46 & 4294967295L))))) | (((long) (((int) (j45 >> 32)) + ((int) (j46 >> 32)))) << 32);
                    long j47 = j44;
                    c21268e8.m59679a(c21267d8, j38, j39, fArr3, j47);
                    c21267d8 = c21267d8.f81203d;
                    c21268e2 = c21268e8;
                    j44 = j47;
                    fArr3 = fArr3;
                }
            }
            c21268e3 = c21268e2;
            j14 = j44;
        } else {
            c21268e3 = c21268e2;
        }
        if (this.f81188f) {
            i13 = 0;
            this.f81188f = false;
            long[] jArr9 = (long[]) c0803k.f2965c;
            int i49 = c0803k.f2964b;
            long[] jArr10 = (long[]) c0803k.f2966d;
            int i54 = 0;
            for (int i55 = 0; i55 < jArr9.length - 2 && i54 < jArr10.length - 2 && i55 < i49; i55 += 3) {
                int i56 = i55 + 2;
                if (jArr9[i56] != 2305843009213693951L) {
                    jArr10[i54] = jArr9[i55];
                    jArr10[i54 + 1] = jArr9[i55 + 1];
                    jArr10[i54 + 2] = jArr9[i56];
                    i54 += 3;
                }
            }
            c0803k.f2964b = i54;
            c0803k.f2965c = jArr10;
            c0803k.f2966d = jArr9;
        } else {
            i13 = 0;
        }
        if (c21268e3.f81210c > j14) {
            return;
        }
        C0023g0 c0023g2 = c21268e3.f81208a;
        Object[] objArr6 = c0023g2.f150c;
        long[] jArr11 = c0023g2.f148a;
        int length3 = jArr11.length - 2;
        if (length3 >= 0) {
            int i57 = i13;
            while (true) {
                long j48 = jArr11[i57];
                if ((((~j48) << 7) & j48 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i58 = 8 - ((~(i57 - length3)) >>> 31);
                    long j49 = j48;
                    for (int i59 = i13; i59 < i58; i59++) {
                        if ((j49 & 255) < j13) {
                            for (C21267d c21267d9 = (C21267d) objArr6[(i57 << 3) + i59]; c21267d9 != null; c21267d9 = c21267d9.f81203d) {
                            }
                        }
                        j49 >>= 8;
                    }
                    if (i58 != 8) {
                        break;
                    }
                }
                if (i57 == length3) {
                    break;
                } else {
                    i57++;
                }
            }
        }
        C21267d c21267d10 = c21268e3.f81209b;
        if (c21267d10 != null) {
            while (c21267d10 != null) {
                c21267d10 = c21267d10.f81203d;
            }
        }
        c21268e3.f81210c = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
    /* JADX INFO: renamed from: c */
    public final void m59669c(C0230n0 c0230n0, boolean z4) {
        char c3;
        boolean z13;
        C0230n0 c0230n0M588G;
        int i13;
        C0223l1 c0223l1 = c0230n0.f783e0;
        NodeCoordinator nodeCoordinator = (NodeCoordinator) c0223l1.f741e;
        C0203g1 c0203g1M652z = c0230n0.m652z();
        int iMo452j0 = c0203g1M652z.mo452j0();
        float fMo451g0 = c0203g1M652z.mo451g0();
        C16616a c16616a = this.f81192j;
        c16616a.f63933a = 0.0f;
        c16616a.f63934b = 0.0f;
        c16616a.f63935c = iMo452j0;
        c16616a.f63936d = fMo451g0;
        while (true) {
            c3 = ' ';
            if (nodeCoordinator == null) {
                break;
            }
            InterfaceC0180a2 interfaceC0180a2 = nodeCoordinator.f4878i0;
            if (interfaceC0180a2 != null) {
                float[] fArrM7307b = ((C2374f2) interfaceC0180a2).m7307b();
                if (!AbstractC17918w0.m51534v(fArrM7307b)) {
                    C17896l0.m51473c(fArrM7307b, c16616a);
                }
            }
            long j7 = nodeCoordinator.f4869Z;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
            c16616a.f63933a += fIntBitsToFloat;
            c16616a.f63934b += fIntBitsToFloat2;
            c16616a.f63935c += fIntBitsToFloat;
            c16616a.f63936d += fIntBitsToFloat2;
            nodeCoordinator = nodeCoordinator.f4860Q;
        }
        int i14 = (int) c16616a.f63933a;
        int i15 = (int) c16616a.f63934b;
        int i16 = (int) c16616a.f63935c;
        int i17 = (int) c16616a.f63936d;
        int i18 = c0230n0.f795x;
        C0803k c0803k = this.f81183a;
        if (z4) {
            C0803k c0803k2 = c0803k;
            z13 = true;
            c0230n0M588G = c0230n0.m588G();
            if (c0230n0M588G != null) {
                i13 = c0230n0M588G.f795x;
            } else {
                i13 = -1;
            }
            c0803k2.m1946d(i18, i14, i15, i16, i17, i13, c0223l1.m560j(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED), c0223l1.m560j(16));
        } else {
            int i19 = i18 & 67108863;
            long[] jArr = (long[]) c0803k.f2965c;
            int i24 = c0803k.f2964b;
            int i25 = 0;
            while (true) {
                if (i25 >= jArr.length - 2 || i25 >= i24) {
                    C0803k c0803k3 = c0803k;
                    z13 = true;
                    c0230n0M588G = c0230n0.m588G();
                    if (c0230n0M588G != null) {
                        i13 = c0230n0M588G.f795x;
                    } else {
                        i13 = -1;
                    }
                    c0803k3.m1946d(i18, i14, i15, i16, i17, i13, c0223l1.m560j(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED), c0223l1.m560j(16));
                } else {
                    int i26 = i25 + 2;
                    char c7 = c3;
                    C0803k c0803k4 = c0803k;
                    long j13 = jArr[i26];
                    z13 = true;
                    if ((((int) j13) & 67108863) == i19) {
                        jArr[i25] = (((long) i14) << c7) | (((long) i15) & 4294967295L);
                        jArr[i25 + 1] = (((long) i16) << c7) | (((long) i17) & 4294967295L);
                        jArr[i26] = 2305843009213693952L | j13;
                    } else {
                        i25 += 3;
                        c3 = c7;
                        c0803k = c0803k4;
                    }
                }
            }
        }
        this.f81186d = z13;
    }

    /* JADX INFO: renamed from: d */
    public final void m59670d(C0230n0 c0230n0) {
        C30849c c30849cM595M = c0230n0.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            C0230n0 c0230n1 = (C0230n0) objArr[i14];
            m59669c(c0230n1, false);
            m59670d(c0230n1);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m59671e(C0230n0 c0230n0) {
        this.f81186d = true;
        int i13 = c0230n0.f795x & 67108863;
        C0803k c0803k = this.f81183a;
        long[] jArr = (long[]) c0803k.f2965c;
        int i14 = c0803k.f2964b;
        for (int i15 = 0; i15 < jArr.length - 2 && i15 < i14; i15 += 3) {
            int i16 = i15 + 2;
            long j7 = jArr[i16];
            if ((((int) j7) & 67108863) == i13) {
                jArr[i16] = 2305843009213693952L | j7;
                break;
            }
        }
        m59675k();
    }

    /* JADX INFO: renamed from: f */
    public final void m59672f(C0230n0 c0230n0) {
        long jM59666h = m59666h(c0230n0);
        if (!AbstractC21598x.m60681h(jM59666h)) {
            m59670d(c0230n0);
            return;
        }
        c0230n0.f757E = jM59666h;
        c0230n0.f758F = false;
        C30849c c30849cM595M = c0230n0.m595M();
        Object[] objArr = c30849cM595M.f127227w;
        int i13 = c30849cM595M.f127229y;
        for (int i14 = 0; i14 < i13; i14++) {
            m59673g((C0230n0) objArr[i14], false);
        }
        m59671e(c0230n0);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x016e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173  */
    /* JADX INFO: renamed from: g */
    public final void m59673g(C0230n0 c0230n0, boolean z4) {
        C0230n0 c0230n0M588G;
        int i13;
        long j7;
        char c3;
        C0203g1 c0203g1M652z = c0230n0.m652z();
        int iMo452j0 = c0203g1M652z.mo452j0();
        int iMo451g0 = c0203g1M652z.mo451g0();
        long j13 = c0230n0.f796y;
        long j14 = c0230n0.f797z;
        int i14 = (int) (j14 >> 32);
        int i15 = (int) (j14 & 4294967295L);
        m59667i(c0230n0);
        long j15 = c0230n0.f796y;
        if (!AbstractC21598x.m60681h(j15)) {
            m59669c(c0230n0, z4);
            return;
        }
        c0230n0.f797z = (((long) iMo451g0) & 4294967295L) | (((long) iMo452j0) << 32);
        int i16 = (int) (j15 >> 32);
        int i17 = (int) (j15 & 4294967295L);
        int i18 = i16 + iMo452j0;
        int i19 = i17 + iMo451g0;
        if (!z4 && C39178j.m124792b(j15, j13) && i14 == iMo452j0 && i15 == iMo451g0) {
            return;
        }
        int i24 = c0230n0.f795x;
        C0223l1 c0223l1 = c0230n0.f783e0;
        C0803k c0803k = this.f81183a;
        if (z4) {
            c0230n0M588G = c0230n0.m588G();
            if (c0230n0M588G != null) {
                i13 = c0230n0M588G.f795x;
            } else {
                i13 = -1;
            }
            c0803k.m1946d(i24, i16, i17, i18, i19, i13, c0223l1.m560j(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED), c0223l1.m560j(16));
        } else {
            int i25 = i24 & 67108863;
            long[] jArr = (long[]) c0803k.f2965c;
            int i26 = c0803k.f2964b;
            int i27 = 0;
            while (true) {
                if (i27 >= jArr.length - 2 || i27 >= i26) {
                    c0230n0M588G = c0230n0.m588G();
                    if (c0230n0M588G != null) {
                        i13 = c0230n0M588G.f795x;
                    } else {
                        i13 = -1;
                    }
                    c0803k.m1946d(i24, i16, i17, i18, i19, i13, c0223l1.m560j(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED), c0223l1.m560j(16));
                } else {
                    int i28 = i27 + 2;
                    int i29 = i27;
                    long j16 = jArr[i28];
                    if ((((int) j16) & 67108863) == i25) {
                        long j17 = jArr[i29];
                        jArr[i29] = (((long) i16) << 32) | (((long) i17) & 4294967295L);
                        jArr[i29 + 1] = (((long) i18) << 32) | (((long) i19) & 4294967295L);
                        long j18 = 2305843009213693952L;
                        jArr[i28] = j16 | 2305843009213693952L;
                        int i34 = i16 - ((int) (j17 >> 32));
                        int i35 = i17 - ((int) j17);
                        if ((i34 != 0) | (i35 != 0)) {
                            long j19 = -4503599560261633L;
                            char c7 = 26;
                            long[] jArr2 = (long[]) c0803k.f2965c;
                            long[] jArr3 = (long[]) c0803k.f2966d;
                            int i36 = c0803k.f2964b / 3;
                            jArr3[0] = (j16 & (-4503599560261633L)) | (((long) ((i29 + 3) & 67108863)) << 26);
                            int i37 = 1;
                            while (i37 > 0) {
                                i37--;
                                long j24 = jArr3[i37];
                                int i38 = ((int) j24) & 67108863;
                                char c14 = c7;
                                long j25 = j19;
                                int i39 = ((int) (j24 >> c14)) & 67108863;
                                char c15 = '4';
                                int i44 = (int) (j24 >> 52);
                                char c16 = 511;
                                int i45 = i44 & FrameMetricsAggregator.EVERY_DURATION;
                                int i46 = i45 == 511 ? i36 : i45 + i39;
                                if (i39 < 0) {
                                    break;
                                }
                                while (i39 < jArr2.length - 2 && i39 < i46) {
                                    int i47 = i39 + 2;
                                    long j26 = jArr2[i47];
                                    char c17 = c15;
                                    int i48 = i46;
                                    if ((((int) (j26 >> c14)) & 67108863) == i38) {
                                        long j27 = jArr2[i39];
                                        int i49 = i39 + 1;
                                        j7 = j18;
                                        long j28 = jArr2[i49];
                                        jArr2[i39] = (((long) (((int) j27) + i35)) & 4294967295L) | (((long) (((int) (j27 >> 32)) + i34)) << 32);
                                        jArr2[i49] = (((long) (((int) j28) + i35)) & 4294967295L) | (((long) (((int) (j28 >> 32)) + i34)) << 32);
                                        jArr2[i47] = j26 | j7;
                                        c3 = 511;
                                        if ((((int) (j26 >> c17)) & FrameMetricsAggregator.EVERY_DURATION) > 0) {
                                            jArr3[i37] = (((long) ((i39 + 3) & 67108863)) << c14) | (j26 & j25);
                                            i37++;
                                        }
                                    } else {
                                        j7 = j18;
                                        c3 = c16;
                                    }
                                    i39 += 3;
                                    c16 = c3;
                                    c15 = c17;
                                    i46 = i48;
                                    j18 = j7;
                                }
                                c7 = c14;
                                j19 = j25;
                                j18 = j18;
                            }
                        }
                    } else {
                        i27 = i29 + 3;
                    }
                }
            }
        }
        this.f81186d = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m59674j(C0230n0 c0230n0) {
        int i13 = c0230n0.f795x & 67108863;
        C0803k c0803k = this.f81183a;
        long[] jArr = (long[]) c0803k.f2965c;
        int i14 = c0803k.f2964b;
        for (int i15 = 0; i15 < jArr.length - 2 && i15 < i14; i15 += 3) {
            int i16 = i15 + 2;
            if ((((int) jArr[i16]) & 67108863) == i13) {
                jArr[i15] = -1;
                jArr[i15 + 1] = -1;
                jArr[i16] = 2305843009213693951L;
                break;
            }
        }
        this.f81186d = true;
        this.f81188f = true;
    }

    /* JADX INFO: renamed from: k */
    public final void m59675k() {
        RunnableC2296b runnableC2296b = this.f81189g;
        boolean z4 = runnableC2296b != null;
        long j7 = this.f81184b.f81210c;
        if (j7 >= 0 || !z4) {
            if (this.f81190h == j7 && z4) {
                return;
            }
            if (runnableC2296b != null) {
                Handler handler = AbstractC2297c.f9099a;
                AbstractC2297c.f9099a.removeCallbacks(runnableC2296b);
            }
            Handler handler2 = AbstractC2297c.f9099a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j7, ((long) 16) + jCurrentTimeMillis);
            this.f81190h = jMax;
            RunnableC2296b runnableC2296b2 = new RunnableC2296b(this.f81191i, 0);
            AbstractC2297c.f9099a.postDelayed(runnableC2296b2, jMax - jCurrentTimeMillis);
            this.f81189g = runnableC2296b2;
        }
    }
}
