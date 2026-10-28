package p163g1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b23.C2342h;
import c93.InterfaceC4351m;
import dc1.C11906c;
import ev2.C13698g;
import fq2.C14686c;
import i93.C18279e;
import j93.AbstractC21478l0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11351f2;
import p077d0.C11365j0;
import p077d0.C11373l0;
import p077d0.C11407v;
import p132f0.C13797j1;
import p132f0.C13818q1;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28670t2;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g1.v4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC15170v4 {

    /* JADX INFO: renamed from: a */
    public static final float f56902a = AbstractC15080m4.f56460a;

    /* JADX INFO: renamed from: b */
    public static final float f56903b = 240;

    /* JADX INFO: renamed from: c */
    public static final float f56904c = 40;

    /* JADX INFO: renamed from: d */
    public static final C11407v f56905d = new C11407v(0.2f, 0.0f, 0.8f, 1.0f);

    /* JADX INFO: renamed from: e */
    public static final C11407v f56906e = new C11407v(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final C11407v f56907f = new C11407v(0.0f, 0.0f, 0.65f, 1.0f);

    /* JADX INFO: renamed from: g */
    public static final C11407v f56908g = new C11407v(0.1f, 0.0f, 0.45f, 1.0f);

    /* JADX INFO: renamed from: h */
    public static final C11407v f56909h = new C11407v(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: renamed from: a */
    public static final void m43201a(float f13, int i13, long j7, long j13, Composer composer, Modifier modifier) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1746618448);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(0.6f) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87151f(j7) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87147d(f13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87151f(j13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i15 = 0;
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87149e(0) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        boolean z4 = true;
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            C22135i c22135i = new C22135i(((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f13), 0.0f, 0, 0, null, 26);
            Float fValueOf = Float.valueOf(0.6f);
            if (Float.isNaN(0.6f)) {
                fValueOf = null;
            }
            Modifier modifierM3419p = AbstractC1102d.m3419p(f56904c, AbstractC18032n.m51775c(modifier, true, new C13797j1(fValueOf != null ? fValueOf.floatValue() : 0.0f, new C18279e(0.0f, 1.0f), i15)));
            boolean zM87147d = ((57344 & i14) == 16384) | c28655q.m87147d(0.6f) | c28655q.m87157i(c22135i);
            if ((((i14 & 896) ^ 384) <= 256 || !c28655q.m87151f(j7)) && (i14 & 384) != 256) {
                z4 = false;
            }
            boolean z13 = zM87147d | z4;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                C15150t4 c15150t4 = new C15150t4(0.6f, j13, c22135i, j7);
                c28655q.m87172p0(c15150t4);
                objM87133R = c15150t4;
            }
            AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15120q4(modifier, j7, f13, j13, i13, 1, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0236  */
    /* JADX WARN: Code duplicated, block: B:103:0x0238  */
    /* JADX WARN: Code duplicated, block: B:106:0x0243  */
    /* JADX WARN: Code duplicated, block: B:108:0x0249  */
    /* JADX WARN: Code duplicated, block: B:114:0x0257 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x025d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0283  */
    /* JADX WARN: Code duplicated, block: B:122:0x0292  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0194  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:98:0x0212  */
    /* JADX WARN: Code duplicated, block: B:99:0x0214  */
    /* JADX INFO: renamed from: b */
    public static final void m43202b(Modifier modifier, long j7, float f13, long j13, int i13, Composer composer, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        long jM43091f;
        float f14;
        int i17;
        int i18;
        int i19;
        boolean z4;
        final Modifier modifier3;
        final long j14;
        final int i24;
        final float f15;
        final long j15;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        long j16;
        final long j17;
        final float f16;
        final C22135i c22135i;
        final C11365j0 c11365j0M30562j;
        final C11365j0 c11365j0M30559g;
        Object objM87133R;
        C28676v0 c28676v0;
        final C11365j0 c11365j0M30559g2;
        Object objM87133R2;
        final C11365j0 c11365j0M30559g3;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R3;
        final long j18;
        int i25;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1119119072);
        int i26 = i15 & 1;
        if (i26 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (c28655q.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            jM43091f = j7;
            i16 |= ((i15 & 2) == 0 && c28655q.m87151f(jM43091f)) ? 32 : 16;
        } else {
            jM43091f = j7;
        }
        int i27 = i15 & 4;
        if (i27 == 0) {
            if ((i14 & 384) == 0) {
                f14 = f13;
                i16 |= c28655q.m87147d(f14) ? 256 : 128;
            }
            i17 = i15 & 8;
            if (i17 != 0) {
                if ((i14 & 3072) == 0) {
                    if (c28655q.m87151f(j13)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i16 |= i18;
                }
                if ((i14 & 24576) == 0) {
                    if ((i15 & 16) == 0) {
                        i19 = i13;
                        if (c28655q.m87149e(i19)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        }
                        i16 |= i25;
                    } else {
                        i19 = i13;
                    }
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    i16 |= i25;
                } else {
                    i19 = i13;
                }
                if ((i16 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i16 & 1, z4)) {
                    c28655q.m87140Z();
                    if ((i14 & 1) != 0 || c28655q.m87118C()) {
                        if (i26 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if ((i15 & 2) != 0) {
                            i16 &= -113;
                            jM43091f = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43091f();
                        }
                        if (i27 != 0) {
                            f14 = AbstractC15080m4.f56460a;
                        }
                        if (i17 != 0) {
                            j16 = C17919x.f69636m;
                        } else {
                            j16 = j13;
                        }
                        if ((i15 & 16) != 0) {
                            i16 &= -57345;
                            i19 = 2;
                        }
                        j17 = j16;
                    } else {
                        c28655q.m87138X();
                        if ((i15 & 2) != 0) {
                            i16 &= -113;
                        }
                        if ((i15 & 16) != 0) {
                            i16 &= -57345;
                        }
                        j17 = j13;
                        modifier4 = modifier2;
                    }
                    f16 = f14;
                    c28655q.m87175r();
                    int i28 = i19;
                    c22135i = new C22135i(((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f16), 0.0f, i28, 0, null, 26);
                    C11373l0 c11373l0M30571s = AbstractC11348f.m30571s(null, c28655q, 1);
                    C11351f2 c11351f2 = AbstractC11348f.f36368j;
                    C2342h c2342h = AbstractC11333b0.f36312c;
                    c11365j0M30562j = AbstractC11348f.m30562j(c11373l0M30571s, 0, 5, c11351f2, AbstractC11348f.m30569q(AbstractC11348f.m30574v(6660, 0, c2342h, 2), null, 6), null, c28655q, 33208, 16);
                    c11365j0M30559g = AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, 286.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(1332, 0, c2342h, 2), null, 6), null, c28655q, 4536, 8);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = new C13818q1(5);
                        c28655q.m87172p0(objM87133R);
                    }
                    c11365j0M30559g2 = AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, 290.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R), null, 6), null, c28655q, 4536, 8);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C13818q1(6);
                        c28655q.m87172p0(objM87133R2);
                    }
                    c11365j0M30559g3 = AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, 290.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R2), null, 6), null, c28655q, 4536, 8);
                    Modifier modifierM3419p = AbstractC1102d.m3419p(f56904c, AbstractC18032n.m51775c(modifier4, true, new C11906c(29)));
                    if ((i16 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean zM87157i = c28655q.m87157i(c22135i) | z13 | c28655q.m87153g(c11365j0M30562j) | c28655q.m87153g(c11365j0M30559g2) | c28655q.m87153g(c11365j0M30559g3) | c28655q.m87153g(c11365j0M30559g);
                    Modifier modifier5 = modifier4;
                    if ((i16 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = zM87157i | z14 | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87151f(jM43091f)) || (i16 & 48) == 32);
                    objM87133R3 = c28655q.m87133R();
                    if (!z15 || objM87133R3 == c28676v0) {
                        j18 = jM43091f;
                        objM87133R3 = new Function1() { // from class: g1.r4
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                float f17;
                                InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                                long j19 = j17;
                                C22135i c22135i2 = c22135i;
                                AbstractC15170v4.m43205e(interfaceC22131e, 0.0f, 360.0f, j19, c22135i2);
                                float fIntValue = (((Number) c11365j0M30562j.getValue()).intValue() * 216.0f) % 360.0f;
                                float fFloatValue = ((Number) c11365j0M30559g2.getValue()).floatValue();
                                InterfaceC28670t2 interfaceC28670t2 = c11365j0M30559g3;
                                float fAbs = Math.abs(fFloatValue - ((Number) interfaceC28670t2.getValue()).floatValue());
                                float fFloatValue2 = ((Number) interfaceC28670t2.getValue()).floatValue() + ((Number) c11365j0M30559g.getValue()).floatValue() + (fIntValue - 90.0f);
                                if (c22135i2.f85860c == 0) {
                                    f17 = 0.0f;
                                } else {
                                    f17 = ((f16 / (AbstractC15170v4.f56904c / 2)) * 57.29578f) / 2.0f;
                                }
                                AbstractC15170v4.m43205e(interfaceC22131e, fFloatValue2 + f17, Math.max(fAbs, 0.1f), j18, c22135i2);
                                return C23454a0.f92919a;
                            }
                        };
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        j18 = jM43091f;
                    }
                    AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R3, c28655q, 0);
                    i24 = i28;
                    modifier3 = modifier5;
                    j15 = j17;
                    f15 = f16;
                    j14 = j18;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    j14 = jM43091f;
                    i24 = i19;
                    f15 = f14;
                    j15 = j13;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.s4
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC15170v4.m43202b(modifier3, j14, f15, j15, i24, (Composer) obj, AbstractC28683x.m87244L(i14 | 1), i15);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i16 |= 3072;
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    i19 = i13;
                    if (c28655q.m87149e(i19)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i16 |= i25;
                } else {
                    i19 = i13;
                }
                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                i16 |= i25;
            } else {
                i19 = i13;
            }
            if ((i16 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i26 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i15 & 2) != 0) {
                        i16 &= -113;
                        jM43091f = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43091f();
                    }
                    if (i27 != 0) {
                        f14 = AbstractC15080m4.f56460a;
                    }
                    if (i17 != 0) {
                        j16 = C17919x.f69636m;
                    } else {
                        j16 = j13;
                    }
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                        i19 = 2;
                    }
                    j17 = j16;
                } else {
                    if (i26 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i15 & 2) != 0) {
                        i16 &= -113;
                        jM43091f = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43091f();
                    }
                    if (i27 != 0) {
                        f14 = AbstractC15080m4.f56460a;
                    }
                    if (i17 != 0) {
                        j16 = C17919x.f69636m;
                    } else {
                        j16 = j13;
                    }
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                        i19 = 2;
                    }
                    j17 = j16;
                }
                f16 = f14;
                c28655q.m87175r();
                int i29 = i19;
                c22135i = new C22135i(((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f16), 0.0f, i29, 0, null, 26);
                C11373l0 c11373l0M30571s2 = AbstractC11348f.m30571s(null, c28655q, 1);
                C11351f2 c11351f3 = AbstractC11348f.f36368j;
                C2342h c2342h2 = AbstractC11333b0.f36312c;
                c11365j0M30562j = AbstractC11348f.m30562j(c11373l0M30571s2, 0, 5, c11351f3, AbstractC11348f.m30569q(AbstractC11348f.m30574v(6660, 0, c2342h2, 2), null, 6), null, c28655q, 33208, 16);
                c11365j0M30559g = AbstractC11348f.m30559g(c11373l0M30571s2, 0.0f, 286.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(1332, 0, c2342h2, 2), null, 6), null, c28655q, 4536, 8);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C13818q1(5);
                    c28655q.m87172p0(objM87133R);
                }
                c11365j0M30559g2 = AbstractC11348f.m30559g(c11373l0M30571s2, 0.0f, 290.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R), null, 6), null, c28655q, 4536, 8);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C13818q1(6);
                    c28655q.m87172p0(objM87133R2);
                }
                c11365j0M30559g3 = AbstractC11348f.m30559g(c11373l0M30571s2, 0.0f, 290.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R2), null, 6), null, c28655q, 4536, 8);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(f56904c, AbstractC18032n.m51775c(modifier4, true, new C11906c(29)));
                if ((i16 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87157i2 = c28655q.m87157i(c22135i) | z13 | c28655q.m87153g(c11365j0M30562j) | c28655q.m87153g(c11365j0M30559g2) | c28655q.m87153g(c11365j0M30559g3) | c28655q.m87153g(c11365j0M30559g);
                Modifier modifier6 = modifier4;
                if ((i16 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i2 | z14 | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87151f(jM43091f)) || (i16 & 48) == 32);
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    j18 = jM43091f;
                    objM87133R3 = new Function1() { // from class: g1.r4
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            float f17;
                            InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                            long j19 = j17;
                            C22135i c22135i2 = c22135i;
                            AbstractC15170v4.m43205e(interfaceC22131e, 0.0f, 360.0f, j19, c22135i2);
                            float fIntValue = (((Number) c11365j0M30562j.getValue()).intValue() * 216.0f) % 360.0f;
                            float fFloatValue = ((Number) c11365j0M30559g2.getValue()).floatValue();
                            InterfaceC28670t2 interfaceC28670t2 = c11365j0M30559g3;
                            float fAbs = Math.abs(fFloatValue - ((Number) interfaceC28670t2.getValue()).floatValue());
                            float fFloatValue2 = ((Number) interfaceC28670t2.getValue()).floatValue() + ((Number) c11365j0M30559g.getValue()).floatValue() + (fIntValue - 90.0f);
                            if (c22135i2.f85860c == 0) {
                                f17 = 0.0f;
                            } else {
                                f17 = ((f16 / (AbstractC15170v4.f56904c / 2)) * 57.29578f) / 2.0f;
                            }
                            AbstractC15170v4.m43205e(interfaceC22131e, fFloatValue2 + f17, Math.max(fAbs, 0.1f), j18, c22135i2);
                            return C23454a0.f92919a;
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    j18 = jM43091f;
                    objM87133R3 = new Function1() { // from class: g1.r4
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            float f17;
                            InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                            long j19 = j17;
                            C22135i c22135i2 = c22135i;
                            AbstractC15170v4.m43205e(interfaceC22131e, 0.0f, 360.0f, j19, c22135i2);
                            float fIntValue = (((Number) c11365j0M30562j.getValue()).intValue() * 216.0f) % 360.0f;
                            float fFloatValue = ((Number) c11365j0M30559g2.getValue()).floatValue();
                            InterfaceC28670t2 interfaceC28670t2 = c11365j0M30559g3;
                            float fAbs = Math.abs(fFloatValue - ((Number) interfaceC28670t2.getValue()).floatValue());
                            float fFloatValue2 = ((Number) interfaceC28670t2.getValue()).floatValue() + ((Number) c11365j0M30559g.getValue()).floatValue() + (fIntValue - 90.0f);
                            if (c22135i2.f85860c == 0) {
                                f17 = 0.0f;
                            } else {
                                f17 = ((f16 / (AbstractC15170v4.f56904c / 2)) * 57.29578f) / 2.0f;
                            }
                            AbstractC15170v4.m43205e(interfaceC22131e, fFloatValue2 + f17, Math.max(fAbs, 0.1f), j18, c22135i2);
                            return C23454a0.f92919a;
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC21478l0.m60421a(modifierM3419p2, (Function1) objM87133R3, c28655q, 0);
                i24 = i29;
                modifier3 = modifier6;
                j15 = j17;
                f15 = f16;
                j14 = j18;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                j14 = jM43091f;
                i24 = i19;
                f15 = f14;
                j15 = j13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.s4
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC15170v4.m43202b(modifier3, j14, f15, j15, i24, (Composer) obj, AbstractC28683x.m87244L(i14 | 1), i15);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i16 |= 384;
        f14 = f13;
        i17 = i15 & 8;
        if (i17 != 0) {
            if ((i14 & 3072) == 0) {
                if (c28655q.m87151f(j13)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i16 |= i18;
            }
            if ((i14 & 24576) == 0) {
                if ((i15 & 16) == 0) {
                    i19 = i13;
                    if (c28655q.m87149e(i19)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i16 |= i25;
                } else {
                    i19 = i13;
                }
                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                i16 |= i25;
            } else {
                i19 = i13;
            }
            if ((i16 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                c28655q.m87140Z();
                if ((i14 & 1) != 0) {
                    if (i26 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i15 & 2) != 0) {
                        i16 &= -113;
                        jM43091f = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43091f();
                    }
                    if (i27 != 0) {
                        f14 = AbstractC15080m4.f56460a;
                    }
                    if (i17 != 0) {
                        j16 = C17919x.f69636m;
                    } else {
                        j16 = j13;
                    }
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                        i19 = 2;
                    }
                    j17 = j16;
                } else {
                    if (i26 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i15 & 2) != 0) {
                        i16 &= -113;
                        jM43091f = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43091f();
                    }
                    if (i27 != 0) {
                        f14 = AbstractC15080m4.f56460a;
                    }
                    if (i17 != 0) {
                        j16 = C17919x.f69636m;
                    } else {
                        j16 = j13;
                    }
                    if ((i15 & 16) != 0) {
                        i16 &= -57345;
                        i19 = 2;
                    }
                    j17 = j16;
                }
                f16 = f14;
                c28655q.m87175r();
                int i210 = i19;
                c22135i = new C22135i(((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f16), 0.0f, i210, 0, null, 26);
                C11373l0 c11373l0M30571s3 = AbstractC11348f.m30571s(null, c28655q, 1);
                C11351f2 c11351f4 = AbstractC11348f.f36368j;
                C2342h c2342h3 = AbstractC11333b0.f36312c;
                c11365j0M30562j = AbstractC11348f.m30562j(c11373l0M30571s3, 0, 5, c11351f4, AbstractC11348f.m30569q(AbstractC11348f.m30574v(6660, 0, c2342h3, 2), null, 6), null, c28655q, 33208, 16);
                c11365j0M30559g = AbstractC11348f.m30559g(c11373l0M30571s3, 0.0f, 286.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(1332, 0, c2342h3, 2), null, 6), null, c28655q, 4536, 8);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C13818q1(5);
                    c28655q.m87172p0(objM87133R);
                }
                c11365j0M30559g2 = AbstractC11348f.m30559g(c11373l0M30571s3, 0.0f, 290.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R), null, 6), null, c28655q, 4536, 8);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C13818q1(6);
                    c28655q.m87172p0(objM87133R2);
                }
                c11365j0M30559g3 = AbstractC11348f.m30559g(c11373l0M30571s3, 0.0f, 290.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R2), null, 6), null, c28655q, 4536, 8);
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(f56904c, AbstractC18032n.m51775c(modifier4, true, new C11906c(29)));
                if ((i16 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87157i3 = c28655q.m87157i(c22135i) | z13 | c28655q.m87153g(c11365j0M30562j) | c28655q.m87153g(c11365j0M30559g2) | c28655q.m87153g(c11365j0M30559g3) | c28655q.m87153g(c11365j0M30559g);
                Modifier modifier7 = modifier4;
                if ((i16 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i3 | z14 | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87151f(jM43091f)) || (i16 & 48) == 32);
                objM87133R3 = c28655q.m87133R();
                if (z15) {
                    j18 = jM43091f;
                    objM87133R3 = new Function1() { // from class: g1.r4
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            float f17;
                            InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                            long j19 = j17;
                            C22135i c22135i2 = c22135i;
                            AbstractC15170v4.m43205e(interfaceC22131e, 0.0f, 360.0f, j19, c22135i2);
                            float fIntValue = (((Number) c11365j0M30562j.getValue()).intValue() * 216.0f) % 360.0f;
                            float fFloatValue = ((Number) c11365j0M30559g2.getValue()).floatValue();
                            InterfaceC28670t2 interfaceC28670t2 = c11365j0M30559g3;
                            float fAbs = Math.abs(fFloatValue - ((Number) interfaceC28670t2.getValue()).floatValue());
                            float fFloatValue2 = ((Number) interfaceC28670t2.getValue()).floatValue() + ((Number) c11365j0M30559g.getValue()).floatValue() + (fIntValue - 90.0f);
                            if (c22135i2.f85860c == 0) {
                                f17 = 0.0f;
                            } else {
                                f17 = ((f16 / (AbstractC15170v4.f56904c / 2)) * 57.29578f) / 2.0f;
                            }
                            AbstractC15170v4.m43205e(interfaceC22131e, fFloatValue2 + f17, Math.max(fAbs, 0.1f), j18, c22135i2);
                            return C23454a0.f92919a;
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                } else {
                    j18 = jM43091f;
                    objM87133R3 = new Function1() { // from class: g1.r4
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            float f17;
                            InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                            long j19 = j17;
                            C22135i c22135i2 = c22135i;
                            AbstractC15170v4.m43205e(interfaceC22131e, 0.0f, 360.0f, j19, c22135i2);
                            float fIntValue = (((Number) c11365j0M30562j.getValue()).intValue() * 216.0f) % 360.0f;
                            float fFloatValue = ((Number) c11365j0M30559g2.getValue()).floatValue();
                            InterfaceC28670t2 interfaceC28670t2 = c11365j0M30559g3;
                            float fAbs = Math.abs(fFloatValue - ((Number) interfaceC28670t2.getValue()).floatValue());
                            float fFloatValue2 = ((Number) interfaceC28670t2.getValue()).floatValue() + ((Number) c11365j0M30559g.getValue()).floatValue() + (fIntValue - 90.0f);
                            if (c22135i2.f85860c == 0) {
                                f17 = 0.0f;
                            } else {
                                f17 = ((f16 / (AbstractC15170v4.f56904c / 2)) * 57.29578f) / 2.0f;
                            }
                            AbstractC15170v4.m43205e(interfaceC22131e, fFloatValue2 + f17, Math.max(fAbs, 0.1f), j18, c22135i2);
                            return C23454a0.f92919a;
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC21478l0.m60421a(modifierM3419p3, (Function1) objM87133R3, c28655q, 0);
                i24 = i210;
                modifier3 = modifier7;
                j15 = j17;
                f15 = f16;
                j14 = j18;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                j14 = jM43091f;
                i24 = i19;
                f15 = f14;
                j15 = j13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.s4
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC15170v4.m43202b(modifier3, j14, f15, j15, i24, (Composer) obj, AbstractC28683x.m87244L(i14 | 1), i15);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i16 |= 3072;
        if ((i14 & 24576) == 0) {
            if ((i15 & 16) == 0) {
                i19 = i13;
                if (c28655q.m87149e(i19)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i16 |= i25;
            } else {
                i19 = i13;
            }
            i25 = DfuBaseService.ERROR_REMOTE_MASK;
            i16 |= i25;
        } else {
            i19 = i13;
        }
        if ((i16 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            c28655q.m87140Z();
            if ((i14 & 1) != 0) {
                if (i26 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i15 & 2) != 0) {
                    i16 &= -113;
                    jM43091f = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43091f();
                }
                if (i27 != 0) {
                    f14 = AbstractC15080m4.f56460a;
                }
                if (i17 != 0) {
                    j16 = C17919x.f69636m;
                } else {
                    j16 = j13;
                }
                if ((i15 & 16) != 0) {
                    i16 &= -57345;
                    i19 = 2;
                }
                j17 = j16;
            } else {
                if (i26 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i15 & 2) != 0) {
                    i16 &= -113;
                    jM43091f = ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43091f();
                }
                if (i27 != 0) {
                    f14 = AbstractC15080m4.f56460a;
                }
                if (i17 != 0) {
                    j16 = C17919x.f69636m;
                } else {
                    j16 = j13;
                }
                if ((i15 & 16) != 0) {
                    i16 &= -57345;
                    i19 = 2;
                }
                j17 = j16;
            }
            f16 = f14;
            c28655q.m87175r();
            int i211 = i19;
            c22135i = new C22135i(((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f16), 0.0f, i211, 0, null, 26);
            C11373l0 c11373l0M30571s4 = AbstractC11348f.m30571s(null, c28655q, 1);
            C11351f2 c11351f5 = AbstractC11348f.f36368j;
            C2342h c2342h4 = AbstractC11333b0.f36312c;
            c11365j0M30562j = AbstractC11348f.m30562j(c11373l0M30571s4, 0, 5, c11351f5, AbstractC11348f.m30569q(AbstractC11348f.m30574v(6660, 0, c2342h4, 2), null, 6), null, c28655q, 33208, 16);
            c11365j0M30559g = AbstractC11348f.m30559g(c11373l0M30571s4, 0.0f, 286.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(1332, 0, c2342h4, 2), null, 6), null, c28655q, 4536, 8);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C13818q1(5);
                c28655q.m87172p0(objM87133R);
            }
            c11365j0M30559g2 = AbstractC11348f.m30559g(c11373l0M30571s4, 0.0f, 290.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R), null, 6), null, c28655q, 4536, 8);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C13818q1(6);
                c28655q.m87172p0(objM87133R2);
            }
            c11365j0M30559g3 = AbstractC11348f.m30559g(c11373l0M30571s4, 0.0f, 290.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R2), null, 6), null, c28655q, 4536, 8);
            Modifier modifierM3419p4 = AbstractC1102d.m3419p(f56904c, AbstractC18032n.m51775c(modifier4, true, new C11906c(29)));
            if ((i16 & 7168) == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zM87157i4 = c28655q.m87157i(c22135i) | z13 | c28655q.m87153g(c11365j0M30562j) | c28655q.m87153g(c11365j0M30559g2) | c28655q.m87153g(c11365j0M30559g3) | c28655q.m87153g(c11365j0M30559g);
            Modifier modifier8 = modifier4;
            if ((i16 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i4 | z14 | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87151f(jM43091f)) || (i16 & 48) == 32);
            objM87133R3 = c28655q.m87133R();
            if (z15) {
                j18 = jM43091f;
                objM87133R3 = new Function1() { // from class: g1.r4
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float f17;
                        InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                        long j19 = j17;
                        C22135i c22135i2 = c22135i;
                        AbstractC15170v4.m43205e(interfaceC22131e, 0.0f, 360.0f, j19, c22135i2);
                        float fIntValue = (((Number) c11365j0M30562j.getValue()).intValue() * 216.0f) % 360.0f;
                        float fFloatValue = ((Number) c11365j0M30559g2.getValue()).floatValue();
                        InterfaceC28670t2 interfaceC28670t2 = c11365j0M30559g3;
                        float fAbs = Math.abs(fFloatValue - ((Number) interfaceC28670t2.getValue()).floatValue());
                        float fFloatValue2 = ((Number) interfaceC28670t2.getValue()).floatValue() + ((Number) c11365j0M30559g.getValue()).floatValue() + (fIntValue - 90.0f);
                        if (c22135i2.f85860c == 0) {
                            f17 = 0.0f;
                        } else {
                            f17 = ((f16 / (AbstractC15170v4.f56904c / 2)) * 57.29578f) / 2.0f;
                        }
                        AbstractC15170v4.m43205e(interfaceC22131e, fFloatValue2 + f17, Math.max(fAbs, 0.1f), j18, c22135i2);
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(objM87133R3);
            } else {
                j18 = jM43091f;
                objM87133R3 = new Function1() { // from class: g1.r4
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float f17;
                        InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                        long j19 = j17;
                        C22135i c22135i2 = c22135i;
                        AbstractC15170v4.m43205e(interfaceC22131e, 0.0f, 360.0f, j19, c22135i2);
                        float fIntValue = (((Number) c11365j0M30562j.getValue()).intValue() * 216.0f) % 360.0f;
                        float fFloatValue = ((Number) c11365j0M30559g2.getValue()).floatValue();
                        InterfaceC28670t2 interfaceC28670t2 = c11365j0M30559g3;
                        float fAbs = Math.abs(fFloatValue - ((Number) interfaceC28670t2.getValue()).floatValue());
                        float fFloatValue2 = ((Number) interfaceC28670t2.getValue()).floatValue() + ((Number) c11365j0M30559g.getValue()).floatValue() + (fIntValue - 90.0f);
                        if (c22135i2.f85860c == 0) {
                            f17 = 0.0f;
                        } else {
                            f17 = ((f16 / (AbstractC15170v4.f56904c / 2)) * 57.29578f) / 2.0f;
                        }
                        AbstractC15170v4.m43205e(interfaceC22131e, fFloatValue2 + f17, Math.max(fAbs, 0.1f), j18, c22135i2);
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC21478l0.m60421a(modifierM3419p4, (Function1) objM87133R3, c28655q, 0);
            i24 = i211;
            modifier3 = modifier8;
            j15 = j17;
            f15 = f16;
            j14 = j18;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            j14 = jM43091f;
            i24 = i19;
            f15 = f14;
            j15 = j13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.s4
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC15170v4.m43202b(modifier3, j14, f15, j15, i24, (Composer) obj, AbstractC28683x.m87244L(i14 | 1), i15);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m43203c(Modifier modifier, final long j7, final long j13, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1501635280);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(modifier) ? 4 : 2);
        } else {
            i14 = i13;
        }
        int i15 = i14 | (c28655q.m87151f(j7) ? 32 : 16) | (c28655q.m87151f(j13) ? 256 : 128) | DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
            }
            int i16 = i15 & (-7169);
            c28655q.m87175r();
            C11373l0 c11373l0M30571s = AbstractC11348f.m30571s(null, c28655q, 1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C14686c(27);
                c28655q.m87172p0(objM87133R);
            }
            final C11365j0 c11365j0M30559g = AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, 1.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R), null, 6), null, c28655q, 4536, 8);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C14686c(28);
                c28655q.m87172p0(objM87133R2);
            }
            final C11365j0 c11365j0M30559g2 = AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, 1.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R2), null, 6), null, c28655q, 4536, 8);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C14686c(29);
                c28655q.m87172p0(objM87133R3);
            }
            final C11365j0 c11365j0M30559g3 = AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, 1.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R3), null, 6), null, c28655q, 4536, 8);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C15160u4(0);
                c28655q.m87172p0(objM87133R4);
            }
            final C11365j0 c11365j0M30559g4 = AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, 1.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r((Function1) objM87133R4), null, 6), null, c28655q, 4536, 8);
            float f13 = 10;
            Modifier modifierM3421r = AbstractC1102d.m3421r(AbstractC18032n.m51775c(AbstractC1099a.m3396r(AbstractC18032n.m51775c(AbstractC1131a.m3498b(modifier, new C13698g(f13, 2)), true, new C14686c(26)), 0.0f, f13, 1), true, new C11906c(29)), f56903b, f56902a);
            boolean zM87149e = ((((i16 & 896) ^ 384) > 256 && c28655q.m87151f(j13)) || (i16 & 384) == 256) | c28655q.m87149e(0) | c28655q.m87153g(c11365j0M30559g) | c28655q.m87153g(c11365j0M30559g2) | ((((i16 & 112) ^ 48) > 32 && c28655q.m87151f(j7)) || (i16 & 48) == 32) | c28655q.m87153g(c11365j0M30559g3) | c28655q.m87153g(c11365j0M30559g4);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87149e || objM87133R5 == c28676v0) {
                Function1 function1 = new Function1() { // from class: g1.n4
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L));
                        AbstractC15170v4.m43206f(0.0f, 1.0f, j13, fIntBitsToFloat, interfaceC22131e);
                        InterfaceC28670t2 interfaceC28670t2 = c11365j0M30559g;
                        float fFloatValue = ((Number) interfaceC28670t2.getValue()).floatValue();
                        InterfaceC28670t2 interfaceC28670t3 = c11365j0M30559g2;
                        float fFloatValue2 = fFloatValue - ((Number) interfaceC28670t3.getValue()).floatValue();
                        long j14 = j7;
                        if (fFloatValue2 > 0.0f) {
                            AbstractC15170v4.m43206f(((Number) interfaceC28670t2.getValue()).floatValue(), ((Number) interfaceC28670t3.getValue()).floatValue(), j14, fIntBitsToFloat, interfaceC22131e);
                        }
                        InterfaceC28670t2 interfaceC28670t4 = c11365j0M30559g3;
                        float fFloatValue3 = ((Number) interfaceC28670t4.getValue()).floatValue();
                        InterfaceC28670t2 interfaceC28670t5 = c11365j0M30559g4;
                        if (fFloatValue3 - ((Number) interfaceC28670t5.getValue()).floatValue() > 0.0f) {
                            AbstractC15170v4.m43206f(((Number) interfaceC28670t4.getValue()).floatValue(), ((Number) interfaceC28670t5.getValue()).floatValue(), j14, fIntBitsToFloat, interfaceC22131e);
                        }
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R5 = function1;
            }
            AbstractC21478l0.m60421a(modifierM3421r, (Function1) objM87133R5, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15100o4(modifier, j7, j13, i13, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m43204d(float f13, int i13, final long j7, final long j13, Composer composer, Modifier modifier) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-531984864);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87151f(j7) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87151f(j13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= DfuBaseService.ERROR_REMOTE_MASK;
        }
        boolean z4 = true;
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
            }
            int i15 = i14 & (-57345);
            c28655q.m87175r();
            float f14 = f13 < 0.0f ? 0.0f : f13;
            if (f14 > 1.0f) {
                f14 = 1.0f;
            }
            float f15 = 10;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC18032n.m51775c(AbstractC1131a.m3498b(modifier, new C13698g(f15, 2)), true, new C14686c(26)), 0.0f, f15, 1);
            Float fValueOf = Float.valueOf(f14);
            if (Float.isNaN(f14)) {
                fValueOf = null;
            }
            Modifier modifierM3421r = AbstractC1102d.m3421r(AbstractC18032n.m51775c(modifierM3396r, true, new C13797j1(fValueOf != null ? fValueOf.floatValue() : 0.0f, new C18279e(0.0f, 1.0f), 0)), f56903b, f56902a);
            boolean zM87149e = ((((i15 & 7168) ^ 3072) > 2048 && c28655q.m87151f(j13)) || (i15 & 3072) == 2048) | c28655q.m87149e(0) | c28655q.m87147d(f14);
            if ((((i15 & 896) ^ 384) <= 256 || !c28655q.m87151f(j7)) && (i15 & 384) != 256) {
                z4 = false;
            }
            boolean z13 = zM87149e | z4;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                final float f16 = f14;
                Function1 function1 = new Function1() { // from class: g1.p4
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L));
                        AbstractC15170v4.m43206f(0.0f, 1.0f, j13, fIntBitsToFloat, interfaceC22131e);
                        AbstractC15170v4.m43206f(0.0f, f16, j7, fIntBitsToFloat, interfaceC22131e);
                        return C23454a0.f92919a;
                    }
                };
                c28655q.m87172p0(function1);
                objM87133R = function1;
            }
            AbstractC21478l0.m60421a(modifierM3421r, (Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15120q4(f13, modifier, j7, j13, i13);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m43205e(InterfaceC22131e interfaceC22131e, float f13, float f14, long j7, C22135i c22135i) {
        float f15 = 2;
        float f16 = c22135i.f85858a / f15;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)) - (f15 * f16);
        InterfaceC22131e.m63380P(interfaceC22131e, j7, f13, f14, (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0.0f, c22135i, 832);
    }

    /* JADX INFO: renamed from: f */
    public static final void m43206f(float f13, float f14, long j7, float f15, InterfaceC22131e interfaceC22131e) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) / 2;
        boolean z4 = interfaceC22131e.getLayoutDirection() == EnumC39181m.f168423w;
        interfaceC22131e.mo732d0(j7, (((long) Float.floatToRawIntBits((z4 ? f13 : 1.0f - f14) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) Float.floatToRawIntBits((z4 ? f14 : 1.0f - f13) * fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (496 & 8) != 0 ? 0.0f : f15, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
    }
}
