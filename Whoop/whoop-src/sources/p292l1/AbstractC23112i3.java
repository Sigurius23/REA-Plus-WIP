package p292l1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import dc1.C11906c;
import j93.AbstractC21478l0;
import kx1.C22881b;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0237p;
import p014aj.C0929d;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p077d0.C11365j0;
import p077d0.C11373l0;
import p077d0.C11385o0;
import p077d0.C11389p0;
import p077d0.C11407v;
import p163g1.C15120q4;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p354o1.AbstractC27361c;
import p354o1.AbstractC27376o;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.i3 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23112i3 {

    /* JADX INFO: renamed from: a */
    public static final float f91317a = AbstractC27361c.f109713a;

    /* JADX INFO: renamed from: b */
    public static final C11407v f91318b = AbstractC27376o.f109954c;

    /* JADX WARN: Code duplicated, block: B:103:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:111:0x0208  */
    /* JADX WARN: Code duplicated, block: B:115:0x020f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0226  */
    /* JADX WARN: Code duplicated, block: B:120:0x0234  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01dc  */
    /* JADX INFO: renamed from: a */
    public static final void m67090a(final Modifier modifier, final long j7, final float f13, long j13, int i13, float f14, Composer composer, final int i14, final int i15) {
        int i16;
        long j14;
        int i17;
        float f15;
        int i18;
        boolean z4;
        C28655q c28655q;
        final int i19;
        final long j15;
        final float f16;
        C28677v1 c28677v1M87180u;
        long j16;
        int i24;
        int i25;
        final long j17;
        final float f17;
        final C22135i c22135i;
        final C11365j0 c11365j0M30559g;
        final C11365j0 c11365j0M30559g2;
        final C11365j0 c11365j0M30559g3;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean zM87153g;
        Object objM87133R;
        int i26;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(333154241);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87153g(modifier) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87151f(j7) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87147d(f13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            j14 = j13;
            i16 |= ((i15 & 8) == 0 && c28655q2.m87151f(j14)) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            j14 = j13;
        }
        int i27 = i15 & 16;
        if (i27 == 0) {
            if ((i14 & 24576) == 0) {
                i16 |= c28655q2.m87149e(i13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                f15 = f14;
            } else {
                f15 = f14;
                if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87147d(f15)) {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i18;
                }
            }
            if ((i16 & 74899) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c28655q2.m87140Z();
                if ((i14 & 1) != 0 || c28655q2.m87118C()) {
                    if ((i15 & 8) != 0) {
                        int i28 = AbstractC23094f3.f91187a;
                        j16 = C17919x.f69636m;
                        i16 &= -7169;
                    } else {
                        j16 = j14;
                    }
                    if (i27 != 0) {
                        i24 = AbstractC23094f3.f91187a;
                    } else {
                        i24 = i13;
                    }
                    if (i17 != 0) {
                        i25 = i24;
                        f17 = AbstractC23094f3.f91188b;
                        j17 = j16;
                    } else {
                        i25 = i24;
                        j17 = j16;
                    }
                    c28655q2.m87175r();
                    c22135i = new C22135i(((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(f13), 0.0f, i25, 0, null, 26);
                    C11373l0 c11373l0M30571s = AbstractC11348f.m30571s(null, c28655q2, 1);
                    c11365j0M30559g = AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, 1080.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(ErrorCodes.GenericErrors.cNotConnected, 0, AbstractC11333b0.f36312c, 2), null, 6), null, c28655q2, 4536, 8);
                    c11365j0M30559g2 = AbstractC11348f.m30559g(c11373l0M30571s, 0.0f, 360.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r(new C22881b(17)), null, 6), null, c28655q2, 4536, 8);
                    C11385o0 c11385o0 = new C11385o0();
                    c11385o0.f36506a = ErrorCodes.GenericErrors.cNotConnected;
                    c11385o0.m30615a(ErrorCodes.TracksErrors.cGenericTrack, Float.valueOf(0.87f)).f36485b = f91318b;
                    c11385o0.m30615a(ErrorCodes.GenericErrors.cNotConnected, Float.valueOf(0.1f));
                    c11365j0M30559g3 = AbstractC11348f.m30559g(c11373l0M30571s, 0.1f, 0.87f, AbstractC11348f.m30569q(new C11389p0(c11385o0), null, 6), null, c28655q2, 4536, 8);
                    c28655q = c28655q2;
                    Modifier modifierM3419p = AbstractC1102d.m3419p(f91317a, AbstractC18032n.m51775c(modifier, true, new C11906c(29)));
                    boolean zM87153g2 = c28655q.m87153g(c11365j0M30559g3);
                    if ((i16 & 57344) == 16384) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z16 = z13 | zM87153g2;
                    if ((458752 & i16) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z17 = z16 | z14;
                    if ((i16 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zM87153g = z17 | z15 | c28655q.m87153g(c11365j0M30559g) | c28655q.m87153g(c11365j0M30559g2) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87151f(j17)) || (i16 & 3072) == 2048) | c28655q.m87157i(c22135i) | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87151f(j7)) || (i16 & 48) == 32);
                    objM87133R = c28655q.m87133R();
                    if (!zM87153g || objM87133R == C28635l.f115821a) {
                        final int i29 = i25;
                        i26 = 0;
                        objM87133R = new Function1() { // from class: l1.g3
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) throws Throwable {
                                long j18;
                                long j19 = j17;
                                C22135i c22135i2 = c22135i;
                                long j24 = j7;
                                InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                                float fFloatValue = ((Number) c11365j0M30559g3.getValue()).floatValue() * 360.0f;
                                int i34 = i29;
                                float f18 = f17;
                                if (i34 != 0 && Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32))) {
                                    f18 += f13;
                                }
                                float fMo734f0 = (f18 / ((float) (((double) interfaceC22131e.mo734f0(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                                float fFloatValue2 = ((Number) c11365j0M30559g2.getValue()).floatValue() + ((Number) c11365j0M30559g.getValue()).floatValue();
                                long jMo721B0 = interfaceC22131e.mo721B0();
                                C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
                                long jM670A = c0237pMo744t0.m670A();
                                c0237pMo744t0.m716w().mo51426q();
                                try {
                                    ((C0929d) c0237pMo744t0.f812x).m2358v(fFloatValue2, jMo721B0);
                                    AbstractC23112i3.m67092c(interfaceC22131e, Math.min(fFloatValue, fMo734f0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo734f0) * 2), j19, c22135i2);
                                    j18 = jM670A;
                                    try {
                                        AbstractC23112i3.m67092c(interfaceC22131e, 0.0f, fFloatValue, j24, c22135i2);
                                        AbstractC11266d.m30472z(c0237pMo744t0, j18);
                                        return C23454a0.f92919a;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        AbstractC11266d.m30472z(c0237pMo744t0, j18);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    j18 = jM670A;
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R);
                    } else {
                        i26 = 0;
                    }
                    AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R, c28655q, i26);
                    f16 = f17;
                    j15 = j17;
                    i19 = i25;
                } else {
                    c28655q2.m87138X();
                    if ((i15 & 8) != 0) {
                        i16 &= -7169;
                    }
                    i25 = i13;
                    j17 = j14;
                }
                f17 = f15;
                c28655q2.m87175r();
                c22135i = new C22135i(((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(f13), 0.0f, i25, 0, null, 26);
                C11373l0 c11373l0M30571s2 = AbstractC11348f.m30571s(null, c28655q2, 1);
                c11365j0M30559g = AbstractC11348f.m30559g(c11373l0M30571s2, 0.0f, 1080.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(ErrorCodes.GenericErrors.cNotConnected, 0, AbstractC11333b0.f36312c, 2), null, 6), null, c28655q2, 4536, 8);
                c11365j0M30559g2 = AbstractC11348f.m30559g(c11373l0M30571s2, 0.0f, 360.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r(new C22881b(17)), null, 6), null, c28655q2, 4536, 8);
                C11385o0 c11385o1 = new C11385o0();
                c11385o1.f36506a = ErrorCodes.GenericErrors.cNotConnected;
                c11385o1.m30615a(ErrorCodes.TracksErrors.cGenericTrack, Float.valueOf(0.87f)).f36485b = f91318b;
                c11385o1.m30615a(ErrorCodes.GenericErrors.cNotConnected, Float.valueOf(0.1f));
                c11365j0M30559g3 = AbstractC11348f.m30559g(c11373l0M30571s2, 0.1f, 0.87f, AbstractC11348f.m30569q(new C11389p0(c11385o1), null, 6), null, c28655q2, 4536, 8);
                c28655q = c28655q2;
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(f91317a, AbstractC18032n.m51775c(modifier, true, new C11906c(29)));
                boolean zM87153g3 = c28655q.m87153g(c11365j0M30559g3);
                if ((i16 & 57344) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = z13 | zM87153g3;
                if ((458752 & i16) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z19 = z18 | z14;
                if ((i16 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87153g = z19 | z15 | c28655q.m87153g(c11365j0M30559g) | c28655q.m87153g(c11365j0M30559g2) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87151f(j17)) || (i16 & 3072) == 2048) | c28655q.m87157i(c22135i) | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87151f(j7)) || (i16 & 48) == 32);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    final int i210 = i25;
                    i26 = 0;
                    objM87133R = new Function1() { // from class: l1.g3
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) throws Throwable {
                            long j18;
                            long j19 = j17;
                            C22135i c22135i2 = c22135i;
                            long j24 = j7;
                            InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                            float fFloatValue = ((Number) c11365j0M30559g3.getValue()).floatValue() * 360.0f;
                            int i34 = i210;
                            float f18 = f17;
                            if (i34 != 0 && Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32))) {
                                f18 += f13;
                            }
                            float fMo734f0 = (f18 / ((float) (((double) interfaceC22131e.mo734f0(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) c11365j0M30559g2.getValue()).floatValue() + ((Number) c11365j0M30559g.getValue()).floatValue();
                            long jMo721B0 = interfaceC22131e.mo721B0();
                            C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
                            long jM670A = c0237pMo744t0.m670A();
                            c0237pMo744t0.m716w().mo51426q();
                            try {
                                ((C0929d) c0237pMo744t0.f812x).m2358v(fFloatValue2, jMo721B0);
                                AbstractC23112i3.m67092c(interfaceC22131e, Math.min(fFloatValue, fMo734f0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo734f0) * 2), j19, c22135i2);
                                j18 = jM670A;
                                try {
                                    AbstractC23112i3.m67092c(interfaceC22131e, 0.0f, fFloatValue, j24, c22135i2);
                                    AbstractC11266d.m30472z(c0237pMo744t0, j18);
                                    return C23454a0.f92919a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    AbstractC11266d.m30472z(c0237pMo744t0, j18);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                j18 = jM670A;
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                } else {
                    final int i211 = i25;
                    i26 = 0;
                    objM87133R = new Function1() { // from class: l1.g3
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) throws Throwable {
                            long j18;
                            long j19 = j17;
                            C22135i c22135i2 = c22135i;
                            long j24 = j7;
                            InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                            float fFloatValue = ((Number) c11365j0M30559g3.getValue()).floatValue() * 360.0f;
                            int i34 = i211;
                            float f18 = f17;
                            if (i34 != 0 && Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32))) {
                                f18 += f13;
                            }
                            float fMo734f0 = (f18 / ((float) (((double) interfaceC22131e.mo734f0(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) c11365j0M30559g2.getValue()).floatValue() + ((Number) c11365j0M30559g.getValue()).floatValue();
                            long jMo721B0 = interfaceC22131e.mo721B0();
                            C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
                            long jM670A = c0237pMo744t0.m670A();
                            c0237pMo744t0.m716w().mo51426q();
                            try {
                                ((C0929d) c0237pMo744t0.f812x).m2358v(fFloatValue2, jMo721B0);
                                AbstractC23112i3.m67092c(interfaceC22131e, Math.min(fFloatValue, fMo734f0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo734f0) * 2), j19, c22135i2);
                                j18 = jM670A;
                                try {
                                    AbstractC23112i3.m67092c(interfaceC22131e, 0.0f, fFloatValue, j24, c22135i2);
                                    AbstractC11266d.m30472z(c0237pMo744t0, j18);
                                    return C23454a0.f92919a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    AbstractC11266d.m30472z(c0237pMo744t0, j18);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                j18 = jM670A;
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierM3419p2, (Function1) objM87133R, c28655q, i26);
                f16 = f17;
                j15 = j17;
                i19 = i25;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                i19 = i13;
                j15 = j14;
                f16 = f15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l1.h3
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC23112i3.m67090a(modifier, j7, f13, j15, i19, f16, (Composer) obj, AbstractC28683x.m87244L(i14 | 1), i15);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i16 |= 24576;
        i17 = i15 & 32;
        if (i17 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f15 = f14;
        } else {
            f15 = f14;
            if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87147d(f15)) {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i18 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i18;
            }
        }
        if ((i16 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0) {
                if ((i15 & 8) != 0) {
                    int i212 = AbstractC23094f3.f91187a;
                    j16 = C17919x.f69636m;
                    i16 &= -7169;
                } else {
                    j16 = j14;
                }
                if (i27 != 0) {
                    i24 = AbstractC23094f3.f91187a;
                } else {
                    i24 = i13;
                }
                if (i17 != 0) {
                    i25 = i24;
                    f17 = AbstractC23094f3.f91188b;
                    j17 = j16;
                } else {
                    i25 = i24;
                    j17 = j16;
                    f17 = f15;
                }
            } else {
                if ((i15 & 8) != 0) {
                    int i213 = AbstractC23094f3.f91187a;
                    j16 = C17919x.f69636m;
                    i16 &= -7169;
                } else {
                    j16 = j14;
                }
                if (i27 != 0) {
                    i24 = AbstractC23094f3.f91187a;
                } else {
                    i24 = i13;
                }
                if (i17 != 0) {
                    i25 = i24;
                    f17 = AbstractC23094f3.f91188b;
                    j17 = j16;
                } else {
                    i25 = i24;
                    j17 = j16;
                    f17 = f15;
                }
            }
            c28655q2.m87175r();
            c22135i = new C22135i(((InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h)).mo743q0(f13), 0.0f, i25, 0, null, 26);
            C11373l0 c11373l0M30571s3 = AbstractC11348f.m30571s(null, c28655q2, 1);
            c11365j0M30559g = AbstractC11348f.m30559g(c11373l0M30571s3, 0.0f, 1080.0f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(ErrorCodes.GenericErrors.cNotConnected, 0, AbstractC11333b0.f36312c, 2), null, 6), null, c28655q2, 4536, 8);
            c11365j0M30559g2 = AbstractC11348f.m30559g(c11373l0M30571s3, 0.0f, 360.0f, AbstractC11348f.m30569q(AbstractC11348f.m30570r(new C22881b(17)), null, 6), null, c28655q2, 4536, 8);
            C11385o0 c11385o2 = new C11385o0();
            c11385o2.f36506a = ErrorCodes.GenericErrors.cNotConnected;
            c11385o2.m30615a(ErrorCodes.TracksErrors.cGenericTrack, Float.valueOf(0.87f)).f36485b = f91318b;
            c11385o2.m30615a(ErrorCodes.GenericErrors.cNotConnected, Float.valueOf(0.1f));
            c11365j0M30559g3 = AbstractC11348f.m30559g(c11373l0M30571s3, 0.1f, 0.87f, AbstractC11348f.m30569q(new C11389p0(c11385o2), null, 6), null, c28655q2, 4536, 8);
            c28655q = c28655q2;
            Modifier modifierM3419p3 = AbstractC1102d.m3419p(f91317a, AbstractC18032n.m51775c(modifier, true, new C11906c(29)));
            boolean zM87153g4 = c28655q.m87153g(c11365j0M30559g3);
            if ((i16 & 57344) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z110 = z13 | zM87153g4;
            if ((458752 & i16) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z111 = z110 | z14;
            if ((i16 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87153g = z111 | z15 | c28655q.m87153g(c11365j0M30559g) | c28655q.m87153g(c11365j0M30559g2) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87151f(j17)) || (i16 & 3072) == 2048) | c28655q.m87157i(c22135i) | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87151f(j7)) || (i16 & 48) == 32);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                final int i214 = i25;
                i26 = 0;
                objM87133R = new Function1() { // from class: l1.g3
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws Throwable {
                        long j18;
                        long j19 = j17;
                        C22135i c22135i2 = c22135i;
                        long j24 = j7;
                        InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                        float fFloatValue = ((Number) c11365j0M30559g3.getValue()).floatValue() * 360.0f;
                        int i34 = i214;
                        float f18 = f17;
                        if (i34 != 0 && Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32))) {
                            f18 += f13;
                        }
                        float fMo734f0 = (f18 / ((float) (((double) interfaceC22131e.mo734f0(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) c11365j0M30559g2.getValue()).floatValue() + ((Number) c11365j0M30559g.getValue()).floatValue();
                        long jMo721B0 = interfaceC22131e.mo721B0();
                        C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
                        long jM670A = c0237pMo744t0.m670A();
                        c0237pMo744t0.m716w().mo51426q();
                        try {
                            ((C0929d) c0237pMo744t0.f812x).m2358v(fFloatValue2, jMo721B0);
                            AbstractC23112i3.m67092c(interfaceC22131e, Math.min(fFloatValue, fMo734f0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo734f0) * 2), j19, c22135i2);
                            j18 = jM670A;
                            try {
                                AbstractC23112i3.m67092c(interfaceC22131e, 0.0f, fFloatValue, j24, c22135i2);
                                AbstractC11266d.m30472z(c0237pMo744t0, j18);
                                return C23454a0.f92919a;
                            } catch (Throwable th3) {
                                th = th3;
                                AbstractC11266d.m30472z(c0237pMo744t0, j18);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            j18 = jM670A;
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                final int i215 = i25;
                i26 = 0;
                objM87133R = new Function1() { // from class: l1.g3
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws Throwable {
                        long j18;
                        long j19 = j17;
                        C22135i c22135i2 = c22135i;
                        long j24 = j7;
                        InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                        float fFloatValue = ((Number) c11365j0M30559g3.getValue()).floatValue() * 360.0f;
                        int i34 = i215;
                        float f18 = f17;
                        if (i34 != 0 && Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32))) {
                            f18 += f13;
                        }
                        float fMo734f0 = (f18 / ((float) (((double) interfaceC22131e.mo734f0(Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) c11365j0M30559g2.getValue()).floatValue() + ((Number) c11365j0M30559g.getValue()).floatValue();
                        long jMo721B0 = interfaceC22131e.mo721B0();
                        C0237p c0237pMo744t0 = interfaceC22131e.mo744t0();
                        long jM670A = c0237pMo744t0.m670A();
                        c0237pMo744t0.m716w().mo51426q();
                        try {
                            ((C0929d) c0237pMo744t0.f812x).m2358v(fFloatValue2, jMo721B0);
                            AbstractC23112i3.m67092c(interfaceC22131e, Math.min(fFloatValue, fMo734f0) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo734f0) * 2), j19, c22135i2);
                            j18 = jM670A;
                            try {
                                AbstractC23112i3.m67092c(interfaceC22131e, 0.0f, fFloatValue, j24, c22135i2);
                                AbstractC11266d.m30472z(c0237pMo744t0, j18);
                                return C23454a0.f92919a;
                            } catch (Throwable th3) {
                                th = th3;
                                AbstractC11266d.m30472z(c0237pMo744t0, j18);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            j18 = jM670A;
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3419p3, (Function1) objM87133R, c28655q, i26);
            f16 = f17;
            j15 = j17;
            i19 = i25;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            i19 = i13;
            j15 = j14;
            f16 = f15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l1.h3
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC23112i3.m67090a(modifier, j7, f13, j15, i19, f16, (Composer) obj, AbstractC28683x.m87244L(i14 | 1), i15);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m67091b(float f13, int i13, int i14, long j7, long j13, Composer composer, Modifier modifier) {
        int i15;
        long j14;
        int i16;
        long j15;
        int i17;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-115871647);
        int i18 = i14 | (c28655q.m87151f(j7) ? 32 : 16) | 25600;
        if (c28655q.m87135U(i18 & 1, (i18 & 9363) != 9362)) {
            c28655q.m87140Z();
            if ((i14 & 1) == 0 || c28655q.m87118C()) {
                int i19 = AbstractC23094f3.f91187a;
                i16 = i18 & (-7169);
                j15 = C17919x.f69636m;
                i17 = AbstractC23094f3.f91187a;
            } else {
                c28655q.m87138X();
                i16 = i18 & (-7169);
                i17 = i13;
                j15 = j13;
            }
            c28655q.m87175r();
            m67090a(modifier, j7, f13, j15, i17, AbstractC23094f3.f91188b, c28655q, (i16 & 112) | 221574, 0);
            j14 = j15;
            i15 = i17;
        } else {
            c28655q.m87138X();
            i15 = i13;
            j14 = j13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15120q4(f13, i15, i14, j7, j14, modifier);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m67092c(InterfaceC22131e interfaceC22131e, float f13, float f14, long j7, C22135i c22135i) {
        float f15 = 2;
        float f16 = c22135i.f85858a / f15;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)) - (f15 * f16);
        InterfaceC22131e.m63380P(interfaceC22131e, j7, f13, f14, (((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0.0f, c22135i, 832);
    }
}
