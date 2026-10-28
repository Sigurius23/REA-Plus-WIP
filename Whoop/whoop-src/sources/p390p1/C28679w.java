package p390p1;

import android.os.Trace;
import c41.C4065l3;
import c93.InterfaceC4351m;
import hb3.AbstractC17104a0;
import j21.C21245d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23465k;
import m83.C25235a0;
import p002a0.C0023g0;
import p002a0.C0039m0;
import p002a0.C0057v0;
import p002a0.C0059w0;
import p002a0.C0063y0;
import p004a2.C0154c;
import p037bu.C3632c;
import p098dt.AbstractC12350b;
import p410q1.C29752a;
import p410q1.C29775l0;
import p446r1.C30851e;
import p537ux.C35331f0;
import p602x1.C37822h;
import p668z1.AbstractC39948a0;
import p668z1.InterfaceC39977z;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C28679w implements InterfaceC28663s {

    /* JADX INFO: renamed from: E */
    public final C0063y0 f115987E;

    /* JADX INFO: renamed from: F */
    public final C28614f2 f115988F;

    /* JADX INFO: renamed from: G */
    public final C0057v0 f115989G;

    /* JADX INFO: renamed from: H */
    public final C0059w0 f115990H;

    /* JADX INFO: renamed from: I */
    public final C0059w0 f115991I;

    /* JADX INFO: renamed from: J */
    public final C0057v0 f115992J;

    /* JADX INFO: renamed from: K */
    public final C29752a f115993K;

    /* JADX INFO: renamed from: L */
    public final C29752a f115994L;

    /* JADX INFO: renamed from: M */
    public final C0057v0 f115995M;

    /* JADX INFO: renamed from: N */
    public C0057v0 f115996N;

    /* JADX INFO: renamed from: O */
    public boolean f115997O;

    /* JADX INFO: renamed from: P */
    public C35331f0 f115998P;

    /* JADX INFO: renamed from: Q */
    public C28641m1 f115999Q;

    /* JADX INFO: renamed from: R */
    public C28679w f116000R;

    /* JADX INFO: renamed from: S */
    public int f116001S;

    /* JADX INFO: renamed from: T */
    public final C3632c f116002T;

    /* JADX INFO: renamed from: U */
    public final C37822h f116003U;

    /* JADX INFO: renamed from: V */
    public final C28655q f116004V;

    /* JADX INFO: renamed from: W */
    public int f116005W;

    /* JADX INFO: renamed from: X */
    public InterfaceC4351m f116006X;

    /* JADX INFO: renamed from: w */
    public final AbstractC28667t f116007w;

    /* JADX INFO: renamed from: x */
    public final AbstractC17104a0 f116008x;

    /* JADX INFO: renamed from: y */
    public final AtomicReference f116009y = new AtomicReference(null);

    /* JADX INFO: renamed from: z */
    public final Object f116010z = new Object();

    public C28679w(AbstractC28667t abstractC28667t, AbstractC17104a0 abstractC17104a0) {
        this.f116007w = abstractC28667t;
        this.f116008x = abstractC17104a0;
        C0063y0 c0063y0 = new C0063y0(new C0059w0());
        this.f115987E = c0063y0;
        C28614f2 c28614f2 = new C28614f2();
        if (abstractC28667t.mo87093d()) {
            c28614f2.f115763K = new C0023g0();
        }
        if (abstractC28667t.mo87095f()) {
            c28614f2.m87015c();
        }
        this.f115988F = c28614f2;
        this.f115989G = AbstractC12350b.m34588i();
        this.f115990H = new C0059w0();
        this.f115991I = new C0059w0();
        this.f115992J = AbstractC12350b.m34588i();
        C29752a c29752a = new C29752a();
        this.f115993K = c29752a;
        C29752a c29752a2 = new C29752a();
        this.f115994L = c29752a2;
        this.f115995M = AbstractC12350b.m34588i();
        this.f115996N = AbstractC12350b.m34588i();
        C3632c c3632c = new C3632c(abstractC28667t);
        this.f116002T = c3632c;
        this.f116003U = new C37822h();
        C28655q c28655q = new C28655q(abstractC17104a0, abstractC28667t, c28614f2, c0063y0, c29752a, c29752a2, c3632c, this);
        abstractC28667t.mo87104o(c28655q);
        this.f116004V = c28655q;
        this.f116006X = AbstractC28619h.f115777a;
    }

    /* JADX INFO: renamed from: A */
    public final void m87206A(InterfaceC4351m interfaceC4351m) {
        boolean zM87215i = m87215i();
        m87222p();
        AbstractC28667t abstractC28667t = this.f116007w;
        if (!zM87215i) {
            this.f116006X = interfaceC4351m;
            abstractC28667t.mo87090a(this, interfaceC4351m);
            return;
        }
        C28655q c28655q = this.f116004V;
        c28655q.f115931z = 100;
        c28655q.f115930y = true;
        this.f116006X = interfaceC4351m;
        abstractC28667t.mo87090a(this, interfaceC4351m);
        c28655q.m87181v();
    }

    /* JADX INFO: renamed from: a */
    public final void m87207a() {
        this.f116009y.set(null);
        this.f115993K.f121744a.m91235c0();
        this.f115994L.f121744a.m91235c0();
        C0063y0 c0063y0 = this.f115987E;
        if (c0063y0.f199w.m142g()) {
            return;
        }
        C37822h c37822h = this.f116003U;
        try {
            c37822h.m121355g(c0063y0, this.f116004V.m87119D());
            c37822h.m121351b();
        } finally {
            c37822h.m121350a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX INFO: renamed from: b */
    public final void m87208b(Object obj, boolean z4) {
        int i13;
        Object objM129g = this.f115989G.m129g(obj);
        if (objM129g == null) {
            return;
        }
        boolean z13 = objM129g instanceof C0059w0;
        C0059w0 c0059w0 = this.f115990H;
        C0059w0 c0059w1 = this.f115991I;
        C0057v0 c0057v0 = this.f115995M;
        if (!z13) {
            C28677v1 c28677v1 = (C28677v1) objM129g;
            if (AbstractC12350b.m34560I(c0057v0, obj, c28677v1) || c28677v1.m87202c(obj) == EnumC28652p0.f115879w) {
                return;
            }
            if (c28677v1.f115985g == null || z4) {
                c0059w0.m136a(c28677v1);
                return;
            } else {
                c0059w1.m136a(c28677v1);
                return;
            }
        }
        C0059w0 c0059w2 = (C0059w0) objM129g;
        Object[] objArr = c0059w2.f178b;
        long[] jArr = c0059w2.f177a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j7 = jArr[i14];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                int i17 = 0;
                while (i17 < i16) {
                    if ((255 & j7) < 128) {
                        C28677v1 c28677v2 = (C28677v1) objArr[(i14 << 3) + i17];
                        if (AbstractC12350b.m34560I(c0057v0, obj, c28677v2)) {
                            i13 = i15;
                        } else {
                            i13 = i15;
                            if (c28677v2.m87202c(obj) != EnumC28652p0.f115879w) {
                                if (c28677v2.f115985g == null || z4) {
                                    c0059w0.m136a(c28677v2);
                                } else {
                                    c0059w1.m136a(c28677v2);
                                }
                            }
                        }
                    } else {
                        i13 = i15;
                    }
                    j7 >>= i13;
                    i17++;
                    i15 = i13;
                }
                if (i16 != i15) {
                    return;
                }
            }
            if (i14 == length) {
                return;
            } else {
                i14++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0235 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0237 A[LOOP:6: B:92:0x01e3->B:109:0x0237, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x00c8 A[EDGE_INSN: B:194:0x00c8->B:38:0x00c8 BREAK  A[LOOP:2: B:24:0x0077->B:36:0x00b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0244 A[EDGE_INSN: B:202:0x0244->B:111:0x0244 BREAK  A[LOOP:6: B:92:0x01e3->B:109:0x0237], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0122 A[EDGE_INSN: B:222:0x0122->B:217:0x0122 BREAK  A[LOOP:13: B:61:0x0151->B:72:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4 A[LOOP:2: B:24:0x0077->B:36:0x00b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0185 A[LOOP:13: B:61:0x0151->B:72:0x0185, LOOP_END] */
    /* JADX INFO: renamed from: c */
    public final void m87209c(boolean z4, Set set) {
        long j7;
        long j13;
        long j14;
        char c3;
        long[] jArr;
        long[] jArr2;
        long j15;
        boolean zM138c;
        long[] jArr3;
        long j16;
        long[] jArr4;
        long[] jArr5;
        int i13;
        long j17;
        boolean zM142g;
        int i14;
        long j18;
        long[] jArr6;
        Object[] objArr;
        long[] jArr7;
        Object[] objArr2;
        char c7;
        int i15;
        int i16;
        boolean z13 = set instanceof C30851e;
        C0057v0 c0057v0 = this.f115992J;
        Object obj = null;
        int i17 = 8;
        if (z13) {
            C0059w0 c0059w0 = ((C30851e) set).f127230w;
            Object[] objArr3 = c0059w0.f178b;
            long[] jArr8 = c0059w0.f177a;
            int length = jArr8.length - 2;
            if (length >= 0) {
                int i18 = 0;
                j7 = 128;
                j13 = 255;
                while (true) {
                    long j19 = jArr8[i18];
                    char c14 = 7;
                    j14 = -9187201950435737472L;
                    if ((((~j19) << 7) & j19 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                        int i24 = 0;
                        while (i24 < i19) {
                            if ((j19 & 255) < 128) {
                                Object obj2 = objArr3[(i18 << 3) + i24];
                                c7 = c14;
                                if (obj2 instanceof C28677v1) {
                                    ((C28677v1) obj2).m87202c(obj);
                                } else {
                                    m87208b(obj2, z4);
                                    Object objM129g = c0057v0.m129g(obj2);
                                    if (objM129g != null) {
                                        if (objM129g instanceof C0059w0) {
                                            C0059w0 c0059w1 = (C0059w0) objM129g;
                                            Object[] objArr4 = c0059w1.f178b;
                                            long[] jArr9 = c0059w1.f177a;
                                            int length2 = jArr9.length - 2;
                                            if (length2 >= 0) {
                                                int i25 = i17;
                                                i15 = length;
                                                int i26 = 0;
                                                while (true) {
                                                    long j24 = jArr9[i26];
                                                    jArr7 = jArr8;
                                                    objArr2 = objArr3;
                                                    if ((((~j24) << c7) & j24 & (-9187201950435737472L)) == -9187201950435737472L) {
                                                        if (i26 != length2) {
                                                            break;
                                                            break;
                                                        }
                                                        i26++;
                                                        objArr3 = objArr2;
                                                        jArr8 = jArr7;
                                                        i25 = 8;
                                                    } else {
                                                        int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                                        for (int i28 = 0; i28 < i27; i28++) {
                                                            if ((j24 & 255) < 128) {
                                                                m87208b((C28612f0) objArr4[(i26 << 3) + i28], z4);
                                                            }
                                                            j24 >>= i25;
                                                        }
                                                        if (i27 != i25) {
                                                            break;
                                                        }
                                                        if (i26 != length2) {
                                                            break;
                                                        }
                                                        i26++;
                                                        objArr3 = objArr2;
                                                        jArr8 = jArr7;
                                                        i25 = 8;
                                                    }
                                                }
                                            }
                                        } else {
                                            jArr7 = jArr8;
                                            objArr2 = objArr3;
                                            i15 = length;
                                            m87208b((C28612f0) objM129g, z4);
                                        }
                                    }
                                    i16 = 8;
                                }
                                jArr7 = jArr8;
                                objArr2 = objArr3;
                                i15 = length;
                                i16 = 8;
                            } else {
                                jArr7 = jArr8;
                                objArr2 = objArr3;
                                c7 = c14;
                                i15 = length;
                                i16 = i17;
                            }
                            j19 >>= i16;
                            i24++;
                            length = i15;
                            i17 = i16;
                            c14 = c7;
                            objArr3 = objArr2;
                            jArr8 = jArr7;
                            obj = null;
                        }
                        jArr6 = jArr8;
                        objArr = objArr3;
                        c3 = c14;
                        int i29 = length;
                        if (i19 != i17) {
                            break;
                        } else {
                            length = i29;
                        }
                    } else {
                        jArr6 = jArr8;
                        objArr = objArr3;
                        c3 = 7;
                    }
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                    objArr3 = objArr;
                    jArr8 = jArr6;
                    obj = null;
                    i17 = 8;
                }
            } else {
                j7 = 128;
                j13 = 255;
                j14 = -9187201950435737472L;
                c3 = 7;
            }
        } else {
            j7 = 128;
            j13 = 255;
            j14 = -9187201950435737472L;
            c3 = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C28677v1) {
                    ((C28677v1) obj3).m87202c(null);
                } else {
                    m87208b(obj3, z4);
                    Object objM129g2 = c0057v0.m129g(obj3);
                    if (objM129g2 != null) {
                        if (objM129g2 instanceof C0059w0) {
                            C0059w0 c0059w2 = (C0059w0) objM129g2;
                            Object[] objArr5 = c0059w2.f178b;
                            long[] jArr10 = c0059w2.f177a;
                            int length3 = jArr10.length - 2;
                            if (length3 >= 0) {
                                int i34 = 0;
                                while (true) {
                                    long j25 = jArr10[i34];
                                    if ((((~j25) << 7) & j25 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i34 != length3) {
                                            break;
                                            break;
                                        }
                                        i34++;
                                    } else {
                                        int i35 = 8 - ((~(i34 - length3)) >>> 31);
                                        for (int i36 = 0; i36 < i35; i36++) {
                                            if ((j25 & 255) < 128) {
                                                m87208b((C28612f0) objArr5[(i34 << 3) + i36], z4);
                                            }
                                            j25 >>= 8;
                                        }
                                        if (i35 != 8) {
                                            break;
                                        } else if (i34 != length3) {
                                            break;
                                        } else {
                                            i34++;
                                        }
                                    }
                                }
                            }
                        } else {
                            m87208b((C28612f0) objM129g2, z4);
                        }
                    }
                }
            }
        }
        C0057v0 c0057v1 = this.f115989G;
        C0059w0 c0059w3 = this.f115990H;
        if (z4) {
            C0059w0 c0059w4 = this.f115991I;
            if (c0059w4.m143h()) {
                long[] jArr11 = c0057v1.f170a;
                int length4 = jArr11.length - 2;
                if (length4 >= 0) {
                    int i37 = 0;
                    while (true) {
                        long j26 = jArr11[i37];
                        if ((((~j26) << c3) & j26 & j14) != j14) {
                            int i38 = 8 - ((~(i37 - length4)) >>> 31);
                            int i39 = 0;
                            while (i39 < i38) {
                                if ((j26 & j13) < j7) {
                                    int i44 = (i37 << 3) + i39;
                                    Object obj4 = c0057v1.f171b[i44];
                                    Object obj5 = c0057v1.f172c[i44];
                                    if (obj5 instanceof C0059w0) {
                                        C0059w0 c0059w5 = (C0059w0) obj5;
                                        Object[] objArr6 = c0059w5.f178b;
                                        long[] jArr12 = c0059w5.f177a;
                                        int length5 = jArr12.length - 2;
                                        if (length5 >= 0) {
                                            j17 = j26;
                                            int i45 = 0;
                                            while (true) {
                                                long j27 = jArr12[i45];
                                                jArr5 = jArr11;
                                                i13 = length4;
                                                if ((((~j27) << c3) & j27 & j14) != j14) {
                                                    int i46 = 8 - ((~(i45 - length5)) >>> 31);
                                                    for (int i47 = 0; i47 < i46; i47 = i14 + 1) {
                                                        if ((j27 & j13) < j7) {
                                                            i14 = i47;
                                                            int i48 = (i45 << 3) + i14;
                                                            j18 = j27;
                                                            C28677v1 c28677v1 = (C28677v1) objArr6[i48];
                                                            if (c0059w4.m138c(c28677v1) || c0059w3.m138c(c28677v1)) {
                                                                c0059w5.m148m(i48);
                                                            }
                                                        } else {
                                                            i14 = i47;
                                                            j18 = j27;
                                                        }
                                                        j27 = j18 >> 8;
                                                    }
                                                    if (i46 != 8) {
                                                        break;
                                                    }
                                                    if (i45 != length5) {
                                                        break;
                                                    }
                                                    i45++;
                                                    length4 = i13;
                                                    jArr11 = jArr5;
                                                } else if (i45 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i45++;
                                                    length4 = i13;
                                                    jArr11 = jArr5;
                                                }
                                            }
                                        } else {
                                            jArr5 = jArr11;
                                            i13 = length4;
                                            j17 = j26;
                                        }
                                        zM142g = c0059w5.m142g();
                                    } else {
                                        jArr5 = jArr11;
                                        i13 = length4;
                                        j17 = j26;
                                        AbstractC22676k.m65748h(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        C28677v1 c28677v2 = (C28677v1) obj5;
                                        zM142g = c0059w4.m138c(c28677v2) || c0059w3.m138c(c28677v2);
                                    }
                                    if (zM142g) {
                                        c0057v1.m134l(i44);
                                    }
                                } else {
                                    jArr5 = jArr11;
                                    i13 = length4;
                                    j17 = j26;
                                }
                                j26 = j17 >> 8;
                                i39++;
                                length4 = i13;
                                jArr11 = jArr5;
                            }
                            jArr4 = jArr11;
                            int i49 = length4;
                            if (i38 != 8) {
                                break;
                            } else {
                                length4 = i49;
                            }
                        } else {
                            jArr4 = jArr11;
                        }
                        if (i37 == length4) {
                            break;
                        }
                        i37++;
                        jArr11 = jArr4;
                    }
                }
                c0059w4.m137b();
                m87214h();
                return;
            }
        }
        if (c0059w3.m143h()) {
            long[] jArr13 = c0057v1.f170a;
            int length6 = jArr13.length - 2;
            if (length6 >= 0) {
                int i54 = 0;
                while (true) {
                    long j28 = jArr13[i54];
                    if ((((~j28) << c3) & j28 & j14) != j14) {
                        int i55 = 8 - ((~(i54 - length6)) >>> 31);
                        int i56 = 0;
                        while (i56 < i55) {
                            if ((j28 & j13) < j7) {
                                int i57 = (i54 << 3) + i56;
                                Object obj6 = c0057v1.f171b[i57];
                                Object obj7 = c0057v1.f172c[i57];
                                if (obj7 instanceof C0059w0) {
                                    C0059w0 c0059w6 = (C0059w0) obj7;
                                    Object[] objArr7 = c0059w6.f178b;
                                    long[] jArr14 = c0059w6.f177a;
                                    int length7 = jArr14.length - 2;
                                    if (length7 >= 0) {
                                        j15 = j28;
                                        int i58 = 0;
                                        while (true) {
                                            long j29 = jArr14[i58];
                                            Object[] objArr8 = objArr7;
                                            long[] jArr15 = jArr14;
                                            if ((((~j29) << c3) & j29 & j14) != j14) {
                                                int i59 = 8 - ((~(i58 - length7)) >>> 31);
                                                int i64 = 0;
                                                while (i64 < i59) {
                                                    if ((j29 & j13) < j7) {
                                                        jArr3 = jArr13;
                                                        int i65 = (i58 << 3) + i64;
                                                        j16 = j29;
                                                        if (c0059w3.m138c((C28677v1) objArr8[i65])) {
                                                            c0059w6.m148m(i65);
                                                        }
                                                    } else {
                                                        jArr3 = jArr13;
                                                        j16 = j29;
                                                    }
                                                    i64++;
                                                    jArr13 = jArr3;
                                                    j29 = j16 >> 8;
                                                }
                                                jArr2 = jArr13;
                                                if (i59 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr13;
                                            }
                                            if (i58 == length7) {
                                                break;
                                            }
                                            i58++;
                                            objArr7 = objArr8;
                                            jArr14 = jArr15;
                                            jArr13 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr13;
                                        j15 = j28;
                                    }
                                    zM138c = c0059w6.m142g();
                                } else {
                                    jArr2 = jArr13;
                                    j15 = j28;
                                    AbstractC22676k.m65748h(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                    zM138c = c0059w3.m138c((C28677v1) obj7);
                                }
                                if (zM138c) {
                                    c0057v1.m134l(i57);
                                }
                            } else {
                                jArr2 = jArr13;
                                j15 = j28;
                            }
                            i56++;
                            j28 = j15 >> 8;
                            jArr13 = jArr2;
                        }
                        jArr = jArr13;
                        if (i55 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr13;
                    }
                    if (i54 == length6) {
                        break;
                    }
                    i54++;
                    jArr13 = jArr;
                }
            }
            m87214h();
            c0059w3.m137b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m87210d() {
        synchronized (this.f116010z) {
            try {
                m87211e(this.f115993K);
                m87220n();
            } catch (Throwable th3) {
                try {
                    if (!this.f115987E.f199w.m142g()) {
                        C37822h c37822h = this.f116003U;
                        try {
                            c37822h.m121355g(this.f115987E, this.f116004V.m87119D());
                            c37822h.m121351b();
                        } finally {
                            c37822h.m121350a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    m87207a();
                    throw th4;
                }
            }
        }
    }

    @Override // p390p1.InterfaceC28663s
    public final void dispose() {
        synchronized (this.f116010z) {
            try {
                if (this.f116004V.f115890F) {
                    AbstractC28657q1.m87189b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f116005W != 3) {
                    this.f116005W = 3;
                    this.f116006X = AbstractC28619h.f115778b;
                    C29752a c29752a = this.f116004V.f115896L;
                    if (c29752a != null) {
                        m87211e(c29752a);
                    }
                    boolean z4 = this.f115988F.f115765x > 0;
                    if (z4 || !this.f115987E.f199w.m142g()) {
                        C37822h c37822h = this.f116003U;
                        try {
                            c37822h.m121355g(this.f115987E, this.f116004V.m87119D());
                            if (z4) {
                                C28626i2 c28626i2M87017e = this.f115988F.m87017e();
                                try {
                                    c28626i2M87017e.m87068n(c28626i2M87017e.f115800t, new C4065l3(this.f116003U, 10));
                                    c28626i2M87017e.m87042G();
                                    c28626i2M87017e.m87060e(true);
                                    this.f116008x.m48352a();
                                    this.f116008x.mo751h();
                                    c37822h.m121352c();
                                } catch (Throwable th3) {
                                    c28626i2M87017e.m87060e(false);
                                    throw th3;
                                }
                            }
                            c37822h.m121351b();
                            c37822h.m121350a();
                        } catch (Throwable th4) {
                            c37822h.m121350a();
                            throw th4;
                        }
                    }
                    C28655q c28655q = this.f116004V;
                    c28655q.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c28655q.f115907b.mo87108s(c28655q);
                        c28655q.f115889E.clear();
                        c28655q.f115924s.clear();
                        c28655q.f115910e.f121744a.m91235c0();
                        c28655q.f115927v = null;
                        c28655q.f115906a.m48352a();
                        Trace.endSection();
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
            } catch (Throwable th6) {
                throw th6;
            }
        }
        this.f116007w.mo87109t(this);
    }

    /* JADX WARN: Code duplicated, block: B:155:0x011f A[EDGE_INSN: B:155:0x011f->B:71:0x011f BREAK  A[LOOP:2: B:138:0x00d2->B:69:0x0115], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0115 A[Catch: all -> 0x0105, LOOP:2: B:138:0x00d2->B:69:0x0115, LOOP_END, TryCatch #4 {all -> 0x0105, blocks: (B:53:0x00d2, B:55:0x00e1, B:57:0x00eb, B:59:0x00f1, B:61:0x0101, B:65:0x010a, B:71:0x011f, B:79:0x0143, B:82:0x0156, B:69:0x0115, B:74:0x0129, B:88:0x0174, B:90:0x0180), top: B:138:0x00d2 }] */
    /* JADX INFO: renamed from: e */
    public final void m87211e(C29752a c29752a) throws Throwable {
        InterfaceC28599c interfaceC28599c;
        C37822h c37822h;
        C37822h c37822h2;
        long[] jArr;
        int i13;
        long[] jArr2;
        C37822h c37822h3;
        long j7;
        char c3;
        long j13;
        int i14;
        boolean zM142g;
        long j14;
        C29752a c29752a2 = this.f115994L;
        C28655q c28655q = this.f116004V;
        C0154c c0154cM87119D = c28655q.m87119D();
        C37822h c37822h4 = this.f116003U;
        c37822h4.m121355g(this.f115987E, c0154cM87119D);
        if (c29752a.f121744a.m91237e0()) {
            try {
                if (c29752a2.f121744a.m91237e0() && this.f115999Q == null) {
                    c37822h4.m121351b();
                }
                return;
            } finally {
                c37822h4.m121350a();
            }
        }
        try {
            Trace.beginSection("Compose:applyChanges");
            try {
                C28641m1 c28641m1 = this.f115999Q;
                if (c28641m1 == null || (interfaceC28599c = c28641m1.f115847k) == null) {
                    interfaceC28599c = this.f116008x;
                }
                if (c28641m1 == null || (c37822h = c28641m1.f115846j) == null) {
                    c37822h = c37822h4;
                }
                C28626i2 c28626i2M87017e = this.f115988F.m87017e();
                int i15 = 0;
                try {
                    c29752a.m91223c0(interfaceC28599c, c28626i2M87017e, c37822h, c28655q.m87119D());
                    c28626i2M87017e.m87060e(true);
                    interfaceC28599c.mo751h();
                    Trace.endSection();
                    c37822h4.m121352c();
                    c37822h4.m121353d();
                    if (this.f115997O) {
                        Trace.beginSection("Compose:unobserve");
                        try {
                            this.f115997O = false;
                            C0057v0 c0057v0 = this.f115989G;
                            long[] jArr3 = c0057v0.f170a;
                            int length = jArr3.length - 2;
                            if (length >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j15 = jArr3[i16];
                                    char c7 = 7;
                                    long j16 = -9187201950435737472L;
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i17 = 8;
                                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                                        int i19 = i15;
                                        while (i19 < i18) {
                                            if ((j15 & 255) < 128) {
                                                c3 = c7;
                                                int i24 = (i16 << 3) + i19;
                                                j13 = j16;
                                                Object obj = c0057v0.f171b[i24];
                                                Object obj2 = c0057v0.f172c[i24];
                                                if (obj2 instanceof C0059w0) {
                                                    C0059w0 c0059w0 = (C0059w0) obj2;
                                                    Object[] objArr = c0059w0.f178b;
                                                    long[] jArr4 = c0059w0.f177a;
                                                    int i25 = i17;
                                                    int length2 = jArr4.length - 2;
                                                    i13 = i19;
                                                    jArr2 = jArr3;
                                                    c37822h3 = c37822h4;
                                                    if (length2 >= 0) {
                                                        int i26 = 0;
                                                        while (true) {
                                                            try {
                                                                long j17 = jArr4[i26];
                                                                j7 = j15;
                                                                long[] jArr5 = jArr4;
                                                                if ((((~j17) << c3) & j17 & j13) == j13) {
                                                                    if (i26 != length2) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i26++;
                                                                    jArr4 = jArr5;
                                                                    j15 = j7;
                                                                    i25 = 8;
                                                                } else {
                                                                    int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                                                    for (int i28 = 0; i28 < i27; i28++) {
                                                                        if ((j17 & 255) < 128) {
                                                                            j14 = j17;
                                                                            int i29 = (i26 << 3) + i28;
                                                                            if (!((C28677v1) objArr[i29]).m87201b()) {
                                                                                c0059w0.m148m(i29);
                                                                            }
                                                                        } else {
                                                                            j14 = j17;
                                                                        }
                                                                        j17 = j14 >> i25;
                                                                    }
                                                                    if (i27 != i25) {
                                                                        break;
                                                                    }
                                                                    if (i26 != length2) {
                                                                        break;
                                                                    }
                                                                    i26++;
                                                                    jArr4 = jArr5;
                                                                    j15 = j7;
                                                                    i25 = 8;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                Trace.endSection();
                                                                throw th;
                                                            }
                                                        }
                                                    } else {
                                                        j7 = j15;
                                                    }
                                                    zM142g = c0059w0.m142g();
                                                } else {
                                                    i13 = i19;
                                                    jArr2 = jArr3;
                                                    c37822h3 = c37822h4;
                                                    j7 = j15;
                                                    AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                    zM142g = !((C28677v1) obj2).m87201b();
                                                }
                                                if (zM142g) {
                                                    c0057v0.m134l(i24);
                                                }
                                                i14 = 8;
                                            } else {
                                                i13 = i19;
                                                jArr2 = jArr3;
                                                c37822h3 = c37822h4;
                                                j7 = j15;
                                                c3 = c7;
                                                j13 = j16;
                                                i14 = i17;
                                            }
                                            j15 = j7 >> i14;
                                            i19 = i13 + 1;
                                            i17 = i14;
                                            c7 = c3;
                                            j16 = j13;
                                            c37822h4 = c37822h3;
                                            jArr3 = jArr2;
                                        }
                                        jArr = jArr3;
                                        c37822h2 = c37822h4;
                                        if (i18 != i17) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr3;
                                        c37822h2 = c37822h4;
                                    }
                                    if (i16 == length) {
                                        break;
                                    }
                                    i16++;
                                    c37822h4 = c37822h2;
                                    jArr3 = jArr;
                                    i15 = 0;
                                }
                            } else {
                                c37822h2 = c37822h4;
                            }
                            m87214h();
                            Trace.endSection();
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        c37822h2 = c37822h4;
                    }
                    try {
                        if (c29752a2.f121744a.m91237e0() && this.f115999Q == null) {
                            c37822h2.m121351b();
                        }
                        return;
                    } finally {
                        c37822h2.m121350a();
                    }
                } catch (Throwable th5) {
                    try {
                        c28626i2M87017e.m87060e(false);
                        throw th5;
                    } catch (Throwable th6) {
                        th = th6;
                        Trace.endSection();
                        throw th;
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
        }
        try {
            if (c29752a2.f121744a.m91237e0() && this.f115999Q == null) {
                c37822h4.m121351b();
            }
            throw th;
        } finally {
            c37822h4.m121350a();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m87212f() {
        synchronized (this.f116010z) {
            try {
                if (this.f115994L.f121744a.m91238f0()) {
                    m87211e(this.f115994L);
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f115987E.f199w.m142g()) {
                        C37822h c37822h = this.f116003U;
                        try {
                            c37822h.m121355g(this.f115987E, this.f116004V.m87119D());
                            c37822h.m121351b();
                        } finally {
                            c37822h.m121350a();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    m87207a();
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m87213g() {
        synchronized (this.f116010z) {
            try {
                this.f116004V.f115927v = null;
                if (!this.f115987E.f199w.m142g()) {
                    C37822h c37822h = this.f116003U;
                    try {
                        c37822h.m121355g(this.f115987E, this.f116004V.m87119D());
                        c37822h.m121351b();
                        c37822h.m121350a();
                    } catch (Throwable th3) {
                        c37822h.m121350a();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    if (!this.f115987E.f199w.m142g()) {
                        C37822h c37822h2 = this.f116003U;
                        try {
                            c37822h2.m121355g(this.f115987E, this.f116004V.m87119D());
                            c37822h2.m121351b();
                        } finally {
                            c37822h2.m121350a();
                        }
                    }
                    throw th4;
                } catch (Throwable th5) {
                    m87207a();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a1 A[LOOP:2: B:16:0x005a->B:30:0x00a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x00b0 A[EDGE_INSN: B:83:0x00b0->B:32:0x00b0 BREAK  A[LOOP:2: B:16:0x005a->B:30:0x00a1], SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public final void m87214h() {
        char c3;
        long j7;
        long j13;
        long j14;
        long[] jArr;
        long[] jArr2;
        int i13;
        long j15;
        char c7;
        long j16;
        long j17;
        int i14;
        boolean zM142g;
        int i15;
        long j18;
        C0057v0 c0057v0 = this.f115992J;
        long[] jArr3 = c0057v0.f170a;
        int length = jArr3.length - 2;
        char c14 = 7;
        long j19 = -9187201950435737472L;
        int i16 = 8;
        if (length >= 0) {
            int i17 = 0;
            long j24 = 128;
            while (true) {
                long j25 = jArr3[i17];
                j13 = 255;
                if ((((~j25) << c14) & j25 & j19) != j19) {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j25 & 255) < j24) {
                            c7 = c14;
                            int i24 = (i17 << 3) + i19;
                            j16 = j19;
                            Object obj = c0057v0.f171b[i24];
                            Object obj2 = c0057v0.f172c[i24];
                            boolean z4 = obj2 instanceof C0059w0;
                            C0057v0 c0057v1 = this.f115989G;
                            if (z4) {
                                C0059w0 c0059w0 = (C0059w0) obj2;
                                Object[] objArr = c0059w0.f178b;
                                long[] jArr4 = c0059w0.f177a;
                                j17 = j24;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j15 = j25;
                                    int i25 = i16;
                                    int i26 = 0;
                                    while (true) {
                                        long j26 = jArr4[i26];
                                        jArr2 = jArr3;
                                        i13 = length;
                                        if ((((~j26) << c7) & j26 & j16) == j16) {
                                            if (i26 != length2) {
                                                break;
                                                break;
                                            }
                                            i26++;
                                            jArr3 = jArr2;
                                            length = i13;
                                            i25 = 8;
                                        } else {
                                            int i27 = 8 - ((~(i26 - length2)) >>> 31);
                                            int i28 = 0;
                                            while (i28 < i27) {
                                                if ((j26 & 255) < j17) {
                                                    i15 = i28;
                                                    int i29 = (i26 << 3) + i15;
                                                    j18 = j26;
                                                    if (!c0057v1.m125c((C28612f0) objArr[i29])) {
                                                        c0059w0.m148m(i29);
                                                    }
                                                } else {
                                                    i15 = i28;
                                                    j18 = j26;
                                                }
                                                j26 = j18 >> i25;
                                                i28 = i15 + 1;
                                            }
                                            if (i27 != i25) {
                                                break;
                                            }
                                            if (i26 != length2) {
                                                break;
                                            }
                                            i26++;
                                            jArr3 = jArr2;
                                            length = i13;
                                            i25 = 8;
                                        }
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i13 = length;
                                    j15 = j25;
                                }
                                zM142g = c0059w0.m142g();
                            } else {
                                jArr2 = jArr3;
                                i13 = length;
                                j15 = j25;
                                j17 = j24;
                                AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zM142g = !c0057v1.m125c((C28612f0) obj2);
                            }
                            if (zM142g) {
                                c0057v0.m134l(i24);
                            }
                            i14 = 8;
                        } else {
                            jArr2 = jArr3;
                            i13 = length;
                            j15 = j25;
                            c7 = c14;
                            j16 = j19;
                            j17 = j24;
                            i14 = i16;
                        }
                        j25 = j15 >> i14;
                        i19++;
                        i16 = i14;
                        c14 = c7;
                        j19 = j16;
                        j24 = j17;
                        jArr3 = jArr2;
                        length = i13;
                    }
                    jArr = jArr3;
                    int i34 = length;
                    c3 = c14;
                    j7 = j19;
                    j14 = j24;
                    if (i18 != i16) {
                        break;
                    } else {
                        length = i34;
                    }
                } else {
                    jArr = jArr3;
                    c3 = c14;
                    j7 = j19;
                    j14 = j24;
                }
                if (i17 == length) {
                    break;
                }
                i17++;
                c14 = c3;
                j19 = j7;
                j24 = j14;
                jArr3 = jArr;
                i16 = 8;
            }
        } else {
            c3 = 7;
            j7 = -9187201950435737472L;
            j13 = 255;
            j14 = 128;
        }
        C0059w0 c0059w1 = this.f115991I;
        if (!c0059w1.m143h()) {
            return;
        }
        Object[] objArr2 = c0059w1.f178b;
        long[] jArr5 = c0059w1.f177a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i35 = 0;
        while (true) {
            long j27 = jArr5[i35];
            if ((((~j27) << c3) & j27 & j7) != j7) {
                int i36 = 8 - ((~(i35 - length3)) >>> 31);
                for (int i37 = 0; i37 < i36; i37++) {
                    if ((j27 & j13) < j14) {
                        int i38 = (i35 << 3) + i37;
                        if (!(((C28677v1) objArr2[i38]).f115985g != null)) {
                            c0059w1.m148m(i38);
                        }
                    }
                    j27 >>= 8;
                }
                if (i36 != 8) {
                    return;
                }
            }
            if (i35 == length3) {
                return;
            } else {
                i35++;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m87215i() {
        boolean z4;
        synchronized (this.f116010z) {
            z4 = true;
            if (this.f116005W != 1) {
                z4 = false;
            }
            if (z4) {
                this.f116005W = 0;
            }
        }
        return z4;
    }

    /* JADX INFO: renamed from: j */
    public final void m87216j(InterfaceC4351m interfaceC4351m) {
        try {
            synchronized (this.f116010z) {
                m87219m();
                C0057v0 c0057v0 = this.f115996N;
                this.f115996N = AbstractC12350b.m34588i();
                try {
                    C28655q c28655q = this.f116004V;
                    C35331f0 c35331f0 = this.f115998P;
                    if (!c28655q.f115910e.f121744a.m91237e0()) {
                        AbstractC28659r.m87192c("Expected applyChanges() to have been called");
                    }
                    c28655q.f115900P = c35331f0;
                    try {
                        c28655q.m87169o(c0057v0, interfaceC4351m);
                        c28655q.f115900P = null;
                    } catch (Throwable th3) {
                        c28655q.f115900P = null;
                        throw th3;
                    }
                } catch (Throwable th4) {
                    this.f115996N = c0057v0;
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                if (!this.f115987E.f199w.m142g()) {
                    C37822h c37822h = this.f116003U;
                    try {
                        c37822h.m121355g(this.f115987E, this.f116004V.m87119D());
                        c37822h.m121351b();
                    } finally {
                        c37822h.m121350a();
                    }
                }
                throw th5;
            } catch (Throwable th6) {
                m87207a();
                throw th6;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final C28641m1 m87217k(boolean z4, InterfaceC4351m interfaceC4351m) {
        if (this.f115999Q != null) {
            AbstractC28657q1.m87189b("A pausable composition is in progress");
        }
        C28641m1 c28641m1 = new C28641m1(this, this.f116007w, this.f116004V, this.f115987E, interfaceC4351m, z4, this.f116008x, this.f116010z);
        this.f115999Q = c28641m1;
        return c28641m1;
    }

    /* JADX INFO: renamed from: l */
    public final void m87218l() {
        synchronized (this.f116010z) {
            try {
                if (this.f115999Q != null) {
                    AbstractC28657q1.m87189b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z4 = this.f115988F.f115765x > 0;
                if (z4 || !this.f115987E.f199w.m142g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C37822h c37822h = this.f116003U;
                        try {
                            c37822h.m121355g(this.f115987E, this.f116004V.m87119D());
                            if (z4) {
                                C28626i2 c28626i2M87017e = this.f115988F.m87017e();
                                try {
                                    c28626i2M87017e.m87068n(c28626i2M87017e.f115800t, new C21245d(28, this.f116003U, c28626i2M87017e));
                                    c28626i2M87017e.m87060e(true);
                                    this.f116008x.mo751h();
                                    c37822h.m121352c();
                                } catch (Throwable th3) {
                                    c28626i2M87017e.m87060e(false);
                                    throw th3;
                                }
                            }
                            c37822h.m121351b();
                            c37822h.m121350a();
                            Trace.endSection();
                        } catch (Throwable th4) {
                            c37822h.m121350a();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
                this.f115989G.m123a();
                this.f115992J.m123a();
                this.f115996N.m123a();
                this.f115993K.f121744a.m91235c0();
                this.f115994L.f121744a.m91235c0();
                C28655q c28655q = this.f116004V;
                c28655q.f115889E.clear();
                c28655q.f115924s.clear();
                c28655q.f115910e.f121744a.m91235c0();
                c28655q.f115927v = null;
                this.f116005W = 1;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m87219m() {
        Object obj = AbstractC28683x.f116018a;
        AtomicReference atomicReference = this.f116009y;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC28659r.m87193d("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                m87209c(true, (Set) andSet);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC28659r.m87193d("corrupt pendingModifications drain: " + atomicReference);
                throw new KotlinNothingValueException();
            }
            for (Set set : (Set[]) andSet) {
                m87209c(true, set);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m87220n() {
        AtomicReference atomicReference = this.f116009y;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC22676k.m65745e(andSet, AbstractC28683x.f116018a)) {
            return;
        }
        if (andSet instanceof Set) {
            m87209c(false, (Set) andSet);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m87209c(false, set);
            }
            return;
        }
        if (andSet == null) {
            AbstractC28659r.m87193d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        AbstractC28659r.m87193d("corrupt pendingModifications drain: " + atomicReference);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: o */
    public final void m87221o() {
        C25235a0 c25235a0 = C25235a0.f99113w;
        AtomicReference atomicReference = this.f116009y;
        Object andSet = atomicReference.getAndSet(c25235a0);
        if (AbstractC22676k.m65745e(andSet, AbstractC28683x.f116018a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m87209c(false, (Set) andSet);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC28659r.m87193d("corrupt pendingModifications drain: " + atomicReference);
            throw new KotlinNothingValueException();
        }
        for (Set set : (Set[]) andSet) {
            m87209c(false, set);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m87222p() {
        String str;
        int i13 = this.f116005W;
        if (i13 != 0) {
            if (i13 == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i13 != 2) {
                str = i13 != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            AbstractC28657q1.m87189b(str);
        }
        if (this.f115999Q == null) {
            return;
        }
        AbstractC28657q1.m87189b("A pausable composition is in progress");
    }

    /* JADX INFO: renamed from: q */
    public final void m87223q(ArrayList arrayList) {
        C0063y0 c0063y0 = this.f115987E;
        C28655q c28655q = this.f116004V;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!AbstractC22676k.m65745e(((AbstractC28687y0) ((C23465k) arrayList.get(i13)).f92937w).m87277b(), this)) {
                AbstractC28659r.m87192c("Check failed");
                break;
            }
        }
        try {
            c28655q.getClass();
            try {
                c28655q.m87122G(arrayList);
                c28655q.m87159j();
            } catch (Throwable th3) {
                c28655q.m87141a();
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                if (!c0063y0.f199w.m142g()) {
                    C37822h c37822h = this.f116003U;
                    try {
                        c37822h.m121355g(c0063y0, c28655q.m87119D());
                        c37822h.m121351b();
                    } finally {
                        c37822h.m121350a();
                    }
                }
                throw th4;
            } catch (Throwable th5) {
                m87207a();
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final EnumC28652p0 m87224r(C28677v1 c28677v1, Object obj) {
        C28679w c28679w;
        int i13 = c28677v1.f115980b;
        if ((i13 & 2) != 0) {
            c28677v1.f115980b = i13 | 4;
        }
        C28591a c28591a = c28677v1.f115981c;
        if (c28591a == null || !c28591a.m86976a()) {
            return EnumC28652p0.f115879w;
        }
        if (this.f115988F.m87018g(c28591a)) {
            if (c28677v1.f115982d == null) {
                return EnumC28652p0.f115879w;
            }
            EnumC28652p0 enumC28652p0M87226t = m87226t(c28677v1, c28591a, obj);
            if (enumC28652p0M87226t != EnumC28652p0.f115879w) {
                this.f116002T.m11153A();
            }
            return enumC28652p0M87226t;
        }
        synchronized (this.f116010z) {
            c28679w = this.f116000R;
        }
        if (c28679w != null) {
            C28655q c28655q = c28679w.f116004V;
            if (c28655q.f115890F && c28655q.m87162k0(c28677v1, obj)) {
                return EnumC28652p0.f115882z;
            }
        }
        return EnumC28652p0.f115879w;
    }

    /* JADX INFO: renamed from: s */
    public final void m87225s() {
        C28679w c28679w;
        synchronized (this.f116010z) {
            try {
                for (Object obj : this.f115988F.f115766y) {
                    C28677v1 c28677v1 = obj instanceof C28677v1 ? (C28677v1) obj : null;
                    if (c28677v1 != null && (c28679w = c28677v1.f115979a) != null) {
                        c28679w.m87224r(c28677v1, null);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cd A[Catch: all -> 0x0042, LOOP:0: B:47:0x008c->B:61:0x00cd, LOOP_END, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007c, B:44:0x0080, B:47:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b2, B:57:0x00c1, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d5 A[Catch: all -> 0x0042, EDGE_INSN: B:65:0x00d5->B:66:0x00da BREAK  A[LOOP:0: B:47:0x008c->B:61:0x00cd], TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:10:0x001f, B:14:0x0029, B:16:0x002f, B:13:0x0024, B:25:0x0047, B:27:0x004d, B:32:0x0058, B:36:0x005e, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007c, B:44:0x0080, B:47:0x008c, B:49:0x009c, B:51:0x00a8, B:53:0x00b2, B:57:0x00c1, B:61:0x00cd, B:62:0x00d0, B:65:0x00d5), top: B:78:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00d5 A[SYNTHETIC] */
    /* JADX INFO: renamed from: t */
    public final EnumC28652p0 m87226t(C28677v1 c28677v1, C28591a c28591a, Object obj) {
        synchronized (this.f116010z) {
            try {
                C28679w c28679w = this.f116000R;
                C28679w c28679w2 = null;
                if (c28679w != null) {
                    C28614f2 c28614f2 = this.f115988F;
                    int i13 = this.f116001S;
                    if (c28614f2.f115759G) {
                        AbstractC28659r.m87192c("Writer is active");
                    }
                    if (i13 < 0 || i13 >= c28614f2.f115765x) {
                        AbstractC28659r.m87192c("Invalid group index");
                    }
                    if (c28614f2.m87018g(c28591a)) {
                        int i14 = c28614f2.f115764w[(i13 * 5) + 3] + i13;
                        int i15 = c28591a.f115705a;
                        if (i13 > i15 || i15 >= i14) {
                            c28679w = null;
                        }
                    } else {
                        c28679w = null;
                    }
                    c28679w2 = c28679w;
                }
                if (c28679w2 == null) {
                    C28655q c28655q = this.f116004V;
                    if (c28655q.f115890F && c28655q.m87162k0(c28677v1, obj)) {
                        return EnumC28652p0.f115882z;
                    }
                    if (obj != null && (obj instanceof C28612f0)) {
                        Object objM129g = this.f115996N.m129g(c28677v1);
                        if (objM129g != null) {
                            if (!(objM129g instanceof C0059w0)) {
                                if (objM129g != C28676v0.f115973E) {
                                    AbstractC12350b.m34585f(this.f115996N, c28677v1, obj);
                                    break;
                                }
                            } else {
                                C0059w0 c0059w0 = (C0059w0) objM129g;
                                Object[] objArr = c0059w0.f178b;
                                long[] jArr = c0059w0.f177a;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    AbstractC12350b.m34585f(this.f115996N, c28677v1, obj);
                                    break;
                                }
                                int i16 = 0;
                                loop0: while (true) {
                                    long j7 = jArr[i16];
                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i16 == length) {
                                            AbstractC12350b.m34585f(this.f115996N, c28677v1, obj);
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        int i17 = 8;
                                        int i18 = 8 - ((~(i16 - length)) >>> 31);
                                        int i19 = 0;
                                        while (i19 < i18) {
                                            if ((j7 & 255) < 128 && objArr[(i16 << 3) + i19] == C28676v0.f115973E) {
                                                break loop0;
                                            }
                                            j7 >>= i17;
                                            i19++;
                                            i17 = i17;
                                        }
                                        if (i18 == i17) {
                                            if (i16 == length) {
                                                i16++;
                                            }
                                        }
                                        AbstractC12350b.m34585f(this.f115996N, c28677v1, obj);
                                        break;
                                    }
                                }
                            }
                        } else {
                            AbstractC12350b.m34585f(this.f115996N, c28677v1, obj);
                            break;
                        }
                    } else {
                        this.f115996N.m135m(c28677v1, C28676v0.f115973E);
                    }
                }
                if (c28679w2 != null) {
                    return c28679w2.m87226t(c28677v1, c28591a, obj);
                }
                this.f116007w.mo87100k(this);
                return this.f116004V.f115890F ? EnumC28652p0.f115881y : EnumC28652p0.f115880x;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m87227u(Object obj) {
        Object objM129g = this.f115989G.m129g(obj);
        if (objM129g == null) {
            return;
        }
        boolean z4 = objM129g instanceof C0059w0;
        C0057v0 c0057v0 = this.f115995M;
        if (!z4) {
            C28677v1 c28677v1 = (C28677v1) objM129g;
            if (c28677v1.m87202c(obj) == EnumC28652p0.f115882z) {
                AbstractC12350b.m34585f(c0057v0, obj, c28677v1);
                return;
            }
            return;
        }
        C0059w0 c0059w0 = (C0059w0) objM129g;
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
                    if ((255 & j7) < 128) {
                        C28677v1 c28677v2 = (C28677v1) objArr[(i13 << 3) + i15];
                        if (c28677v2.m87202c(obj) == EnumC28652p0.f115882z) {
                            AbstractC12350b.m34585f(c0057v0, obj, c28677v2);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    public final boolean m87228v(Set set) {
        boolean z4 = set instanceof C30851e;
        C0057v0 c0057v0 = this.f115992J;
        C0057v0 c0057v1 = this.f115989G;
        if (z4) {
            C0059w0 c0059w0 = ((C30851e) set).f127230w;
            Object[] objArr = c0059w0.f178b;
            long[] jArr = c0059w0.f177a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                loop0: while (true) {
                    long j7 = jArr[i13];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j7) < 128) {
                                Object obj = objArr[(i13 << 3) + i15];
                                if (c0057v1.m125c(obj) || c0057v0.m125c(obj)) {
                                    break loop0;
                                }
                            }
                            j7 >>= 8;
                        }
                        if (i14 == 8) {
                            if (i13 != length) {
                                i13++;
                            }
                        }
                    } else if (i13 != length) {
                        i13++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (c0057v1.m125c(obj2) || c0057v0.m125c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m87229w() {
        synchronized (this.f116010z) {
            C28641m1 c28641m1 = this.f115999Q;
            boolean zM91238f0 = false;
            if (c28641m1 != null && c28641m1.f115844h.get() != EnumC28645n1.f115851E) {
                c28641m1.m87085e();
                return false;
            }
            m87219m();
            try {
                C0057v0 c0057v0 = this.f115996N;
                this.f115996N = AbstractC12350b.m34588i();
                try {
                    C28655q c28655q = this.f116004V;
                    C35331f0 c35331f0 = this.f115998P;
                    C29775l0 c29775l0 = c28655q.f115910e.f121744a;
                    if (!c29775l0.m91237e0()) {
                        AbstractC28659r.m87192c("Expected applyChanges() to have been called");
                    }
                    if (c0057v0.f174e > 0 || !c28655q.f115924s.isEmpty()) {
                        c28655q.f115900P = c35331f0;
                        try {
                            c28655q.m87169o(c0057v0, null);
                            c28655q.f115900P = null;
                            zM91238f0 = c29775l0.m91238f0();
                        } catch (Throwable th3) {
                            c28655q.f115900P = null;
                            throw th3;
                        }
                    }
                    if (!zM91238f0) {
                        m87220n();
                    }
                    return zM91238f0;
                } catch (Throwable th4) {
                    this.f115996N = c0057v0;
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    if (!this.f115987E.f199w.m142g()) {
                        C37822h c37822h = this.f116003U;
                        try {
                            c37822h.m121355g(this.f115987E, this.f116004V.m87119D());
                            c37822h.m121351b();
                        } finally {
                            c37822h.m121350a();
                        }
                    }
                    throw th5;
                } catch (Throwable th6) {
                    m87207a();
                    throw th6;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m87230x(C30851e c30851e) {
        Object obj;
        while (true) {
            Object obj2 = this.f116009y.get();
            if (obj2 == null || obj2.equals(AbstractC28683x.f116018a)) {
                obj = c30851e;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, c30851e};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f116009y).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = c30851e;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f116009y;
            do {
                if (atomicReference.compareAndSet(obj2, obj)) {
                    if (obj2 == null) {
                        synchronized (this.f116010z) {
                            m87220n();
                        }
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: y */
    public final void m87231y(Object obj) {
        C28677v1 c28677v1M87117B;
        int i13;
        boolean z4;
        boolean z13;
        boolean z14;
        C28655q c28655q = this.f116004V;
        if (c28655q.f115885A <= 0 && (c28677v1M87117B = c28655q.m87117B()) != null) {
            boolean z15 = true;
            int i14 = c28677v1M87117B.f115980b | 1;
            c28677v1M87117B.f115980b = i14;
            if ((i14 & 32) == 0) {
                C0039m0 c0039m0 = c28677v1M87117B.f115984f;
                if (c0039m0 == null) {
                    c0039m0 = new C0039m0();
                    c28677v1M87117B.f115984f = c0039m0;
                }
                int i15 = c28677v1M87117B.f115983e;
                int iM90c = c0039m0.m90c(obj);
                if (iM90c < 0) {
                    iM90c = ~iM90c;
                    i13 = -1;
                } else {
                    i13 = c0039m0.f116c[iM90c];
                }
                c0039m0.f115b[iM90c] = obj;
                c0039m0.f116c[iM90c] = i15;
                if (i13 == c28677v1M87117B.f115983e) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            this.f116002T.m11153A();
            if (z4) {
                return;
            }
            if (obj instanceof AbstractC39948a0) {
                ((AbstractC39948a0) obj).m128129s(1);
            }
            AbstractC12350b.m34585f(this.f115989G, obj, c28677v1M87117B);
            if (obj instanceof C28612f0) {
                C28612f0 c28612f0 = (C28612f0) obj;
                C28608e0 c28608e0M87013y = c28612f0.m87013y();
                C0057v0 c0057v0 = this.f115992J;
                AbstractC12350b.m34561J(c0057v0, obj);
                C0039m0 c0039m1 = c28608e0M87013y.f115734e;
                Object[] objArr = c0039m1.f115b;
                long[] jArr = c0039m1.f114a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j7 = jArr[i16];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i17 = 8;
                            int i18 = 8 - ((~(i16 - length)) >>> 31);
                            int i19 = 0;
                            while (i19 < i18) {
                                if ((j7 & 255) < 128) {
                                    InterfaceC39977z interfaceC39977z = (InterfaceC39977z) objArr[(i16 << 3) + i19];
                                    if (interfaceC39977z instanceof AbstractC39948a0) {
                                        z14 = true;
                                        ((AbstractC39948a0) interfaceC39977z).m128129s(1);
                                    } else {
                                        z14 = true;
                                    }
                                    AbstractC12350b.m34585f(c0057v0, interfaceC39977z, obj);
                                } else {
                                    z14 = z15;
                                }
                                j7 >>= i17;
                                i19++;
                                z15 = z14;
                                i17 = i17;
                            }
                            z13 = z15;
                            if (i18 != i17) {
                                break;
                            }
                        } else {
                            z13 = z15;
                        }
                        if (i16 == length) {
                            break;
                        }
                        i16++;
                        z15 = z13;
                    }
                }
                Object obj2 = c28608e0M87013y.f115735f;
                C0057v0 c0057v1 = c28677v1M87117B.f115985g;
                if (c0057v1 == null) {
                    c0057v1 = new C0057v0();
                    c28677v1M87117B.f115985g = c0057v1;
                }
                c0057v1.m135m(c28612f0, obj2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public final void m87232z(Object obj) {
        synchronized (this.f116010z) {
            try {
                m87227u(obj);
                Object objM129g = this.f115992J.m129g(obj);
                if (objM129g != null) {
                    if (objM129g instanceof C0059w0) {
                        C0059w0 c0059w0 = (C0059w0) objM129g;
                        Object[] objArr = c0059w0.f178b;
                        long[] jArr = c0059w0.f177a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i13 = 0;
                            while (true) {
                                long j7 = jArr[i13];
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i13 != length) {
                                        break;
                                        break;
                                    }
                                    i13++;
                                } else {
                                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                                    for (int i15 = 0; i15 < i14; i15++) {
                                        if ((255 & j7) < 128) {
                                            m87227u((C28612f0) objArr[(i13 << 3) + i15]);
                                        }
                                        j7 >>= 8;
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
                    } else {
                        m87227u((C28612f0) objM129g);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
