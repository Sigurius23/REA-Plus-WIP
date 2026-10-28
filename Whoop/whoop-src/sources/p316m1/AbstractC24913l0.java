package p316m1;

import al.AbstractC0954a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2612r2;
import c93.InterfaceC4351m;
import hc3.C17177j;
import i40.C18068b;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.C33241t;
import p005a3.C0227m1;
import p025b1.C2213d;
import p026b2.InterfaceC2300f;
import p027b3.AbstractC2453v1;
import p040c0.C3731d;
import p077d0.AbstractC11343d2;
import p077d0.AbstractC11348f;
import p077d0.C11351f2;
import p077d0.C11362i1;
import p077d0.C11409v1;
import p077d0.C11421z1;
import p077d0.InterfaceC11403t1;
import p088dc.AbstractC11895b;
import p163g1.C14990e;
import p163g1.C15132r6;
import p181h2.C16620e;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p240j2.AbstractC21222c;
import p291l0.InterfaceC22973k1;
import p292l1.AbstractC23076c3;
import p292l1.AbstractC23119j4;
import p292l1.AbstractC23124k3;
import p292l1.AbstractC23194w1;
import p292l1.AbstractC23215z4;
import p292l1.C23089e4;
import p292l1.C23125k4;
import p292l1.C23135m2;
import p292l1.C23209y4;
import p294l3.C23285v0;
import p354o1.AbstractC27358a0;
import p354o1.AbstractC27384w;
import p354o1.EnumC27375n;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import se.AbstractC32417h;

/* JADX INFO: renamed from: m1.l0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC24913l0 {

    /* JADX INFO: renamed from: a */
    public static final float f97578a;

    /* JADX INFO: renamed from: b */
    public static final float f97579b = 4;

    /* JADX INFO: renamed from: c */
    public static final float f97580c = 2;

    /* JADX INFO: renamed from: d */
    public static final float f97581d = 24;

    /* JADX INFO: renamed from: e */
    public static final float f97582e;

    /* JADX INFO: renamed from: f */
    public static final float f97583f;

    static {
        float f13 = 16;
        f97578a = f13;
        f97582e = f13;
        f97583f = f13;
    }

    /* JADX WARN: Code duplicated, block: B:214:0x031f  */
    /* JADX WARN: Code duplicated, block: B:216:0x0322  */
    /* JADX WARN: Code duplicated, block: B:220:0x0329  */
    /* JADX WARN: Code duplicated, block: B:222:0x032f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x0332  */
    /* JADX WARN: Code duplicated, block: B:227:0x0354  */
    /* JADX WARN: Code duplicated, block: B:229:0x0357  */
    /* JADX WARN: Code duplicated, block: B:236:0x0393  */
    /* JADX WARN: Code duplicated, block: B:238:0x0396  */
    /* JADX WARN: Code duplicated, block: B:240:0x0399  */
    /* JADX WARN: Code duplicated, block: B:242:0x039d  */
    /* JADX WARN: Code duplicated, block: B:244:0x03a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:245:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:248:0x03be  */
    /* JADX WARN: Code duplicated, block: B:250:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:252:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:254:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:256:0x03ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:260:0x0411  */
    /* JADX WARN: Code duplicated, block: B:262:0x0415  */
    /* JADX WARN: Code duplicated, block: B:265:0x042b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x042d  */
    /* JADX WARN: Code duplicated, block: B:269:0x0455  */
    /* JADX WARN: Code duplicated, block: B:271:0x045b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0478  */
    /* JADX WARN: Code duplicated, block: B:275:0x047b  */
    /* JADX WARN: Code duplicated, block: B:278:0x04c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:279:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:282:0x051a  */
    /* JADX WARN: Code duplicated, block: B:285:0x0528  */
    /* JADX WARN: Code duplicated, block: B:286:0x053b  */
    /* JADX WARN: Code duplicated, block: B:288:0x0563  */
    /* JADX WARN: Code duplicated, block: B:289:0x0566 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:290:0x0568  */
    /* JADX WARN: Code duplicated, block: B:291:0x056b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:292:0x056d  */
    /* JADX WARN: Code duplicated, block: B:293:0x0570  */
    /* JADX WARN: Code duplicated, block: B:296:0x0578  */
    /* JADX WARN: Code duplicated, block: B:299:0x0589  */
    /* JADX WARN: Code duplicated, block: B:304:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:307:0x05db  */
    /* JADX WARN: Code duplicated, block: B:310:0x0611  */
    /* JADX WARN: Code duplicated, block: B:312:0x0615 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:313:0x0617  */
    /* JADX WARN: Code duplicated, block: B:314:0x061a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:315:0x061c  */
    /* JADX WARN: Code duplicated, block: B:316:0x061f  */
    /* JADX WARN: Code duplicated, block: B:318:0x0624  */
    /* JADX WARN: Code duplicated, block: B:319:0x0631  */
    /* JADX WARN: Code duplicated, block: B:322:0x0652  */
    /* JADX WARN: Code duplicated, block: B:324:0x0655  */
    /* JADX WARN: Code duplicated, block: B:326:0x0661  */
    /* JADX WARN: Code duplicated, block: B:330:0x069f  */
    /* JADX WARN: Code duplicated, block: B:333:0x06ad A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:334:0x06af  */
    /* JADX WARN: Code duplicated, block: B:336:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:338:0x0702  */
    /* JADX INFO: renamed from: a */
    public static final void m73013a(EnumC24915m0 enumC24915m0, CharSequence charSequence, InterfaceC4351m interfaceC4351m, C23125k4 c23125k4, Function3 function3, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, boolean z4, boolean z13, boolean z14, InterfaceC21083i interfaceC21083i, InterfaceC22973k1 interfaceC22973k1, C23089e4 c23089e4, InterfaceC4351m interfaceC4351m4, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        EnumC24927y enumC24927y;
        long j7;
        float f13;
        float f14;
        AbstractC0954a abstractC0954a;
        float f15;
        int iOrdinal;
        float f16;
        InterfaceC11403t1 interfaceC11403t1M30664f;
        EnumC24927y enumC24927y2;
        EnumC24927y enumC24927y3;
        C11409v1 c11409v1M30542d;
        int iOrdinal2;
        float f17;
        int iOrdinal3;
        C11409v1 c11409v1M30542d2;
        EnumC24927y enumC24927y4;
        int[] iArr;
        long j13;
        AbstractC21222c abstractC21222cM51545g;
        boolean zM87153g;
        Object objM87133R;
        C28676v0 c28676v0;
        EnumC24927y enumC24927y5;
        long j14;
        EnumC24927y enumC24927y6;
        long j15;
        C11409v1 c11409v1M30542d3;
        AbstractC21222c abstractC21222cM51545g2;
        boolean zM87153g2;
        Object objM87133R2;
        C11409v1 c11409v1M30542d4;
        Object objM87133R3;
        C24907i0 c24907i0;
        C37816b c37816b;
        char c3;
        C37816b c37816bM121344e;
        long j16;
        Object objM87133R4;
        C37816b c37816b2;
        Object objM87133R5;
        long j17;
        long j18;
        boolean z15;
        C37816b c37816bM121344e2;
        int iOrdinal4;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z16;
        boolean zM87153g3;
        Object objM87133R7;
        C28676v0 c28676v1 = C28676v0.f115974F;
        C3731d c3731d = C3731d.f15261z;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(546805032);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87149e(enumC24915m0.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(charSequence) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(interfaceC4351m) ? 256 : 128;
        }
        int i17 = i13 & 3072;
        int i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i17 == 0) {
            i15 |= c28655q.m87153g(c23125k4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i19 = i13 & 24576;
        int i24 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i19 == 0) {
            i15 |= c28655q.m87157i(function3) ? 16384 : 8192;
        }
        int i25 = i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i25 == 0) {
            i15 |= c28655q.m87157i(interfaceC4351m2) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c28655q.m87157i(null) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= c28655q.m87157i(null) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= c28655q.m87157i(null) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= c28655q.m87157i(null) ? 536870912 : 268435456;
        }
        int i27 = i15;
        if ((i14 & 6) == 0) {
            i16 = i14 | (c28655q.m87157i(interfaceC4351m3) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q.m87155h(z14)) {
                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            }
            i16 |= i18;
        }
        if ((i14 & 24576) == 0) {
            if (c28655q.m87153g(interfaceC21083i)) {
                i24 = 16384;
            }
            i16 |= i24;
        }
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87153g(interfaceC22973k1)) {
                i26 = 131072;
            }
            i16 |= i26;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= c28655q.m87153g(c23089e4) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= c28655q.m87157i(interfaceC4351m4) ? 8388608 : 4194304;
        }
        int i28 = i16;
        if (c28655q.m87135U(i27 & 1, ((306783379 & i27) == 306783378 && (i28 & 4793491) == 4793490) ? false : true)) {
            boolean zBooleanValue = ((Boolean) AbstractC32417h.m101215x(interfaceC21083i, c28655q, (i28 >> 12) & 14).getValue()).booleanValue();
            if (zBooleanValue) {
                enumC24927y = EnumC24927y.f97616w;
            } else {
                enumC24927y = charSequence.length() == 0 ? EnumC24927y.f97617x : EnumC24927y.f97618y;
            }
            if (!z13) {
                j7 = c23089e4.f91161z;
            } else if (z14) {
                j7 = c23089e4.f91119A;
            } else {
                j7 = zBooleanValue ? c23089e4.f91159x : c23089e4.f91160y;
            }
            C23209y4 c23209y4 = (C23209y4) c28655q.m87161k(AbstractC23215z4.f91921a);
            C23285v0 c23285v0 = c23209y4.f91879j;
            C23285v0 c23285v1 = c23209y4.f91881l;
            long jM67366c = c23285v0.m67366c();
            long j19 = C17919x.f69637n;
            boolean z17 = (C17919x.m51542d(jM67366c, j19) && !C17919x.m51542d(c23285v1.m67366c(), j19)) || (!C17919x.m51542d(c23285v0.m67366c(), j19) && C17919x.m51542d(c23285v1.m67366c(), j19));
            long jM67366c2 = c23285v1.m67366c();
            if (z17 && jM67366c2 == 16) {
                jM67366c2 = j7;
            }
            long jM67366c3 = c23285v0.m67366c();
            long j24 = (z17 && jM67366c3 == 16) ? j7 : jM67366c3;
            boolean z18 = function3 != null;
            boolean z19 = z17;
            long j25 = jM67366c2;
            C11421z1 c11421z1M30544f = AbstractC11343d2.m30544f(enumC24927y, "TextFieldInputState", c28655q, 48, 0);
            AbstractC0954a abstractC0954a2 = c11421z1M30544f.f36630a;
            C28633k1 c28633k1 = c11421z1M30544f.f36633d;
            C11362i1 c11362i1M67109m = AbstractC23124k3.m67109m(EnumC27375n.f109949x, c28655q);
            C11351f2 c11351f2 = AbstractC11348f.f36367i;
            EnumC24927y enumC24927y7 = (EnumC24927y) abstractC0954a2.mo2428y0();
            c28655q.m87150e0(-1436405362);
            int iOrdinal5 = enumC24927y7.ordinal();
            float f18 = 0.0f;
            if (iOrdinal5 == 0) {
                f13 = 1.0f;
            } else {
                if (iOrdinal5 != 1) {
                    if (iOrdinal5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z18) {
                    f13 = 0.0f;
                }
                f13 = 1.0f;
            }
            c28655q.m87173q(false);
            Float fValueOf = Float.valueOf(f13);
            EnumC24927y enumC24927y8 = (EnumC24927y) c28633k1.getValue();
            c28655q.m87150e0(-1436405362);
            int iOrdinal6 = enumC24927y8.ordinal();
            if (iOrdinal6 == 0) {
                f14 = 1.0f;
            } else {
                if (iOrdinal6 != 1) {
                    if (iOrdinal6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z18) {
                    f14 = 0.0f;
                }
                f14 = 1.0f;
            }
            c28655q.m87173q(false);
            Float fValueOf2 = Float.valueOf(f14);
            c11421z1M30544f.m30664f();
            c28655q.m87150e0(-709912974);
            c28655q.m87173q(false);
            C11409v1 c11409v1M30542d5 = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf, fValueOf2, c11362i1M67109m, c11351f2, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
            EnumC27375n enumC27375n = EnumC27375n.f109951z;
            C11362i1 c11362i1M67109m2 = AbstractC23124k3.m67109m(enumC27375n, c28655q);
            C11362i1 c11362i1M67109m3 = AbstractC23124k3.m67109m(EnumC27375n.f109946E, c28655q);
            EnumC24927y enumC24927y9 = (EnumC24927y) abstractC0954a2.mo2428y0();
            c28655q.m87150e0(-1093194547);
            int iOrdinal7 = enumC24927y9.ordinal();
            if (iOrdinal7 != 0) {
                abstractC0954a = abstractC0954a2;
                if (iOrdinal7 == 1) {
                    if (z18) {
                    }
                    c28655q.m87173q(false);
                    Float fValueOf3 = Float.valueOf(f15);
                    EnumC24927y enumC24927y10 = (EnumC24927y) c28633k1.getValue();
                    c28655q.m87150e0(-1093194547);
                    iOrdinal = enumC24927y10.ordinal();
                    if (iOrdinal == 0) {
                        f16 = 1.0f;
                    } else {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z18) {
                            f16 = 1.0f;
                        }
                        f16 = 0.0f;
                    }
                    c28655q.m87173q(false);
                    Float fValueOf4 = Float.valueOf(f16);
                    interfaceC11403t1M30664f = c11421z1M30544f.m30664f();
                    c28655q.m87150e0(-984009111);
                    enumC24927y2 = EnumC24927y.f97616w;
                    enumC24927y3 = EnumC24927y.f97617x;
                    if (interfaceC11403t1M30664f.m30637d(enumC24927y2, enumC24927y3) || (!interfaceC11403t1M30664f.m30637d(enumC24927y3, enumC24927y2) && !interfaceC11403t1M30664f.m30637d(EnumC24927y.f97618y, enumC24927y3))) {
                        c11362i1M67109m3 = c11362i1M67109m2;
                    }
                    c28655q.m87173q(false);
                    c11409v1M30542d = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf3, fValueOf4, c11362i1M67109m3, c11351f2, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
                    EnumC24927y enumC24927y11 = (EnumC24927y) abstractC0954a.mo2428y0();
                    c28655q.m87150e0(-1258455321);
                    iOrdinal2 = enumC24927y11.ordinal();
                    if (iOrdinal2 == 0) {
                        f17 = 1.0f;
                    } else {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (z18) {
                            f17 = 0.0f;
                        }
                        f17 = 1.0f;
                    }
                    c28655q.m87173q(false);
                    Float fValueOf5 = Float.valueOf(f17);
                    EnumC24927y enumC24927y12 = (EnumC24927y) c28633k1.getValue();
                    c28655q.m87150e0(-1258455321);
                    iOrdinal3 = enumC24927y12.ordinal();
                    if (iOrdinal3 == 0) {
                        f18 = 1.0f;
                    } else {
                        if (iOrdinal3 != 1) {
                            if (iOrdinal3 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z18) {
                        }
                        f18 = 1.0f;
                    }
                    c28655q.m87173q(false);
                    Float fValueOf6 = Float.valueOf(f18);
                    c11421z1M30544f.m30664f();
                    c28655q.m87150e0(2126293195);
                    c28655q.m87173q(false);
                    c11409v1M30542d2 = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf5, fValueOf6, c11362i1M67109m2, c11351f2, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
                    C11362i1 c11362i1M67109m4 = AbstractC23124k3.m67109m(enumC27375n, c28655q);
                    enumC24927y4 = (EnumC24927y) c28633k1.getValue();
                    c28655q.m87150e0(-12973394);
                    iArr = AbstractC24909j0.f97564a;
                    if (iArr[enumC24927y4.ordinal()] == 1) {
                        j13 = j25;
                    } else {
                        j13 = j24;
                    }
                    c28655q.m87173q(false);
                    abstractC21222cM51545g = C17919x.m51545g(j13);
                    zM87153g = c28655q.m87153g(abstractC21222cM51545g);
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = new C11351f2(c3731d, new C0227m1(abstractC21222cM51545g, 9));
                        c28655q.m87172p0(objM87133R);
                    }
                    C11351f2 c11351f3 = (C11351f2) objM87133R;
                    enumC24927y5 = (EnumC24927y) abstractC0954a.mo2428y0();
                    c28655q.m87150e0(-12973394);
                    if (iArr[enumC24927y5.ordinal()] == 1) {
                        j14 = j25;
                    } else {
                        j14 = j24;
                    }
                    C17919x c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, j14);
                    enumC24927y6 = (EnumC24927y) c28633k1.getValue();
                    c28655q.m87150e0(-12973394);
                    if (iArr[enumC24927y6.ordinal()] == 1) {
                        j15 = j25;
                    } else {
                        j15 = j24;
                    }
                    c28655q.m87173q(false);
                    C17919x c17919x = new C17919x(j15);
                    c11421z1M30544f.m30664f();
                    c28655q.m87150e0(1954111929);
                    c28655q.m87173q(false);
                    c11409v1M30542d3 = AbstractC11343d2.m30542d(c11421z1M30544f, c17919xM31989h, c17919x, c11362i1M67109m4, c11351f3, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
                    c28655q.m87150e0(-464752477);
                    c28655q.m87173q(false);
                    abstractC21222cM51545g2 = C17919x.m51545g(j7);
                    zM87153g2 = c28655q.m87153g(abstractC21222cM51545g2);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        objM87133R2 = new C11351f2(c3731d, new C0227m1(abstractC21222cM51545g2, 9));
                        c28655q.m87172p0(objM87133R2);
                    }
                    c28655q.m87150e0(-464752477);
                    c28655q.m87173q(false);
                    long j26 = j7;
                    C17919x c17919x2 = new C17919x(j26);
                    c28655q.m87150e0(-464752477);
                    c28655q.m87173q(false);
                    C17919x c17919x3 = new C17919x(j26);
                    c11421z1M30544f.m30664f();
                    c28655q.m87150e0(1190923886);
                    c28655q.m87173q(false);
                    c11409v1M30542d4 = AbstractC11343d2.m30542d(c11421z1M30544f, c17919x2, c17919x3, c11362i1M67109m4, (C11351f2) objM87133R2, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C24907i0();
                        c28655q.m87172p0(objM87133R3);
                    }
                    c24907i0 = (C24907i0) objM87133R3;
                    if (function3 == null) {
                        c28655q.m87150e0(-1891724857);
                        c28655q.m87173q(false);
                        c37816b = null;
                        c3 = 2048;
                        c37816bM121344e = null;
                    } else {
                        c28655q.m87150e0(-1891724856);
                        c37816b = null;
                        c3 = 2048;
                        c37816bM121344e = AbstractC37817c.m121344e(-1076580032, c28655q, new C23135m2(c23285v0, c23285v1, c11409v1M30542d5, c11409v1M30542d4, z19, c11409v1M30542d3, function3, c24907i0));
                        c28655q.m87173q(false);
                    }
                    if (!z13) {
                        j16 = c23089e4.f91122D;
                    } else if (z14) {
                        j16 = c23089e4.f91123E;
                    } else if (zBooleanValue) {
                        j16 = c23089e4.f91120B;
                    } else {
                        j16 = c23089e4.f91121C;
                    }
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = AbstractC28683x.m87265s(new C33241t(c11409v1M30542d, 6), r21);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R4;
                    if (interfaceC4351m2 == null && charSequence.length() == 0 && ((Boolean) interfaceC28670t2.getValue()).booleanValue()) {
                        c28655q.m87150e0(-1890614312);
                        C37816b c37816bM121344e3 = AbstractC37817c.m121344e(1405547205, c28655q, new C24905h0(c11409v1M30542d, j16, c23285v0, interfaceC4351m2));
                        c28655q.m87173q(false);
                        c37816b2 = c37816bM121344e3;
                    } else {
                        c28655q.m87150e0(-1890217110);
                        c28655q.m87173q(false);
                        c37816b2 = c37816b;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = AbstractC28683x.m87265s(new C33241t(c11409v1M30542d2, 7), c28676v1);
                        c28655q.m87172p0(objM87133R5);
                    }
                    c28655q.m87150e0(-1889500886);
                    c28655q.m87173q(false);
                    c28655q.m87150e0(-1888924534);
                    c28655q.m87173q(false);
                    c28655q.m87150e0(-1888749663);
                    c28655q.m87173q(false);
                    c28655q.m87150e0(-1888469888);
                    c28655q.m87173q(false);
                    if (!z13) {
                        j17 = c23089e4.f91126H;
                    } else if (z14) {
                        j17 = r4.f91127I;
                    } else if (zBooleanValue) {
                        j17 = r4.f91124F;
                    } else {
                        j17 = r4.f91125G;
                    }
                    j18 = j17;
                    if (interfaceC4351m3 == null) {
                        c28655q.m87150e0(-1888176380);
                        z15 = false;
                        c28655q.m87173q(false);
                        c37816bM121344e2 = c37816b;
                    } else {
                        z15 = false;
                        c28655q.m87150e0(-1888176379);
                        c37816bM121344e2 = AbstractC37817c.m121344e(837168720, c28655q, new C15132r6(c23285v1, j18, interfaceC4351m3, 2));
                        c28655q.m87173q(false);
                    }
                    iOrdinal4 = enumC24915m0.ordinal();
                    if (iOrdinal4 == 0) {
                        C37816b c37816b3 = c37816b;
                        c28655q.m87150e0(-1887830698);
                        AbstractC23119j4.m67096b(interfaceC4351m, c37816bM121344e, c37816b2, c37816b3, c37816b3, c37816b3, c37816b3, z4, c23125k4, new C24911k0(new C17177j(0, 3, InterfaceC28670t2.class, c11409v1M30542d5, "value", "getValue()Ljava/lang/Object;")), AbstractC37817c.m121344e(-1729858187, c28655q, new C14990e(7, interfaceC4351m4)), c37816bM121344e2, interfaceC22973k1, c28655q, ((i27 >> 3) & 112) | 6 | ((i28 << 21) & 234881024) | ((i27 << 18) & 1879048192), ((i28 >> 6) & 7168) | 48);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        if (iOrdinal4 != 1) {
                            throw AbstractC11895b.m32003v(493292232, c28655q, z15);
                        }
                        c28655q.m87150e0(-1886778186);
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = AbstractC28683x.m87272z(new C16620e(0L));
                            c28655q.m87172p0(objM87133R6);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
                        C37816b c37816bM121344e4 = AbstractC37817c.m121344e(528115858, c28655q, new C2213d(interfaceC28601c1, c23125k4, interfaceC22973k1, interfaceC4351m4));
                        z16 = true;
                        C37816b c37816b4 = c37816bM121344e;
                        C24911k0 c24911k0 = new C24911k0(new C17177j(0, 4, InterfaceC28670t2.class, c11409v1M30542d5, "value", "getValue()Ljava/lang/Object;"));
                        if ((i27 & 7168) != c3) {
                            z16 = z15;
                        }
                        zM87153g3 = z16 | c28655q.m87153g(c11409v1M30542d5);
                        objM87133R7 = c28655q.m87133R();
                        if (zM87153g3 || objM87133R7 == c28676v0) {
                            objM87133R7 = new C2612r2(c23125k4, c11409v1M30542d5, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R7);
                        }
                        c28655q = c28655q;
                        AbstractC23076c3.m67047c(interfaceC4351m, c37816b2, c37816b4, c37816b, c37816b, c37816b, c37816b, z4, c23125k4, c24911k0, (Function1) objM87133R7, c37816bM121344e4, c37816bM121344e2, interfaceC22973k1, c28655q, ((i27 >> 3) & 112) | 6 | ((i28 << 21) & 234881024) | ((i27 << 18) & 1879048192), (57344 & (i28 >> 3)) | 384);
                        c28655q.m87173q(false);
                    }
                } else if (iOrdinal7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f15 = 0.0f;
                c28655q.m87173q(false);
                Float fValueOf7 = Float.valueOf(f15);
                EnumC24927y enumC24927y13 = (EnumC24927y) c28633k1.getValue();
                c28655q.m87150e0(-1093194547);
                iOrdinal = enumC24927y13.ordinal();
                if (iOrdinal == 0) {
                    f16 = 1.0f;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z18) {
                        f16 = 1.0f;
                    }
                    f16 = 0.0f;
                }
                c28655q.m87173q(false);
                Float fValueOf8 = Float.valueOf(f16);
                interfaceC11403t1M30664f = c11421z1M30544f.m30664f();
                c28655q.m87150e0(-984009111);
                enumC24927y2 = EnumC24927y.f97616w;
                enumC24927y3 = EnumC24927y.f97617x;
                if (interfaceC11403t1M30664f.m30637d(enumC24927y2, enumC24927y3)) {
                    c11362i1M67109m3 = c11362i1M67109m2;
                } else {
                    c11362i1M67109m3 = c11362i1M67109m2;
                }
                c28655q.m87173q(false);
                c11409v1M30542d = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf7, fValueOf8, c11362i1M67109m3, c11351f2, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
                EnumC24927y enumC24927y14 = (EnumC24927y) abstractC0954a.mo2428y0();
                c28655q.m87150e0(-1258455321);
                iOrdinal2 = enumC24927y14.ordinal();
                if (iOrdinal2 == 0) {
                    f17 = 1.0f;
                } else {
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (z18) {
                        f17 = 0.0f;
                    }
                    f17 = 1.0f;
                }
                c28655q.m87173q(false);
                Float fValueOf9 = Float.valueOf(f17);
                EnumC24927y enumC24927y15 = (EnumC24927y) c28633k1.getValue();
                c28655q.m87150e0(-1258455321);
                iOrdinal3 = enumC24927y15.ordinal();
                if (iOrdinal3 == 0) {
                    f18 = 1.0f;
                } else {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (!z18) {
                    }
                    f18 = 1.0f;
                }
                c28655q.m87173q(false);
                Float fValueOf10 = Float.valueOf(f18);
                c11421z1M30544f.m30664f();
                c28655q.m87150e0(2126293195);
                c28655q.m87173q(false);
                c11409v1M30542d2 = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf9, fValueOf10, c11362i1M67109m2, c11351f2, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
                C11362i1 c11362i1M67109m5 = AbstractC23124k3.m67109m(enumC27375n, c28655q);
                enumC24927y4 = (EnumC24927y) c28633k1.getValue();
                c28655q.m87150e0(-12973394);
                iArr = AbstractC24909j0.f97564a;
                if (iArr[enumC24927y4.ordinal()] == 1) {
                    j13 = j25;
                } else {
                    j13 = j24;
                }
                c28655q.m87173q(false);
                abstractC21222cM51545g = C17919x.m51545g(j13);
                zM87153g = c28655q.m87153g(abstractC21222cM51545g);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (zM87153g) {
                    objM87133R = new C11351f2(c3731d, new C0227m1(abstractC21222cM51545g, 9));
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C11351f2(c3731d, new C0227m1(abstractC21222cM51545g, 9));
                    c28655q.m87172p0(objM87133R);
                }
                C11351f2 c11351f4 = (C11351f2) objM87133R;
                enumC24927y5 = (EnumC24927y) abstractC0954a.mo2428y0();
                c28655q.m87150e0(-12973394);
                if (iArr[enumC24927y5.ordinal()] == 1) {
                    j14 = j25;
                } else {
                    j14 = j24;
                }
                C17919x c17919xM31989h2 = AbstractC11895b.m31989h(c28655q, false, j14);
                enumC24927y6 = (EnumC24927y) c28633k1.getValue();
                c28655q.m87150e0(-12973394);
                if (iArr[enumC24927y6.ordinal()] == 1) {
                    j15 = j25;
                } else {
                    j15 = j24;
                }
                c28655q.m87173q(false);
                C17919x c17919x4 = new C17919x(j15);
                c11421z1M30544f.m30664f();
                c28655q.m87150e0(1954111929);
                c28655q.m87173q(false);
                c11409v1M30542d3 = AbstractC11343d2.m30542d(c11421z1M30544f, c17919xM31989h2, c17919x4, c11362i1M67109m5, c11351f4, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
                c28655q.m87150e0(-464752477);
                c28655q.m87173q(false);
                abstractC21222cM51545g2 = C17919x.m51545g(j7);
                zM87153g2 = c28655q.m87153g(abstractC21222cM51545g2);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R2 = new C11351f2(c3731d, new C0227m1(abstractC21222cM51545g2, 9));
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C11351f2(c3731d, new C0227m1(abstractC21222cM51545g2, 9));
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87150e0(-464752477);
                c28655q.m87173q(false);
                long j27 = j7;
                C17919x c17919x5 = new C17919x(j27);
                c28655q.m87150e0(-464752477);
                c28655q.m87173q(false);
                C17919x c17919x6 = new C17919x(j27);
                c11421z1M30544f.m30664f();
                c28655q.m87150e0(1190923886);
                c28655q.m87173q(false);
                c11409v1M30542d4 = AbstractC11343d2.m30542d(c11421z1M30544f, c17919x5, c17919x6, c11362i1M67109m5, (C11351f2) objM87133R2, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C24907i0();
                    c28655q.m87172p0(objM87133R3);
                }
                c24907i0 = (C24907i0) objM87133R3;
                if (function3 == null) {
                    c28655q.m87150e0(-1891724857);
                    c28655q.m87173q(false);
                    c37816b = null;
                    c3 = 2048;
                    c37816bM121344e = null;
                } else {
                    c28655q.m87150e0(-1891724856);
                    c37816b = null;
                    c3 = 2048;
                    c37816bM121344e = AbstractC37817c.m121344e(-1076580032, c28655q, new C23135m2(c23285v0, c23285v1, c11409v1M30542d5, c11409v1M30542d4, z19, c11409v1M30542d3, function3, c24907i0));
                    c28655q.m87173q(false);
                }
                if (!z13) {
                    j16 = c23089e4.f91122D;
                } else if (z14) {
                    j16 = c23089e4.f91123E;
                } else if (zBooleanValue) {
                    j16 = c23089e4.f91120B;
                } else {
                    j16 = c23089e4.f91121C;
                }
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC28683x.m87265s(new C33241t(c11409v1M30542d, 6), r21);
                    c28655q.m87172p0(objM87133R4);
                }
                InterfaceC28670t2 interfaceC28670t3 = (InterfaceC28670t2) objM87133R4;
                if (interfaceC4351m2 == null) {
                    c28655q.m87150e0(-1890217110);
                    c28655q.m87173q(false);
                    c37816b2 = c37816b;
                } else {
                    c28655q.m87150e0(-1890217110);
                    c28655q.m87173q(false);
                    c37816b2 = c37816b;
                }
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = AbstractC28683x.m87265s(new C33241t(c11409v1M30542d2, 7), c28676v1);
                    c28655q.m87172p0(objM87133R5);
                }
                c28655q.m87150e0(-1889500886);
                c28655q.m87173q(false);
                c28655q.m87150e0(-1888924534);
                c28655q.m87173q(false);
                c28655q.m87150e0(-1888749663);
                c28655q.m87173q(false);
                c28655q.m87150e0(-1888469888);
                c28655q.m87173q(false);
                if (!z13) {
                    j17 = c23089e4.f91126H;
                } else if (z14) {
                    j17 = r4.f91127I;
                } else if (zBooleanValue) {
                    j17 = r4.f91124F;
                } else {
                    j17 = r4.f91125G;
                }
                j18 = j17;
                if (interfaceC4351m3 == null) {
                    c28655q.m87150e0(-1888176380);
                    z15 = false;
                    c28655q.m87173q(false);
                    c37816bM121344e2 = c37816b;
                } else {
                    z15 = false;
                    c28655q.m87150e0(-1888176379);
                    c37816bM121344e2 = AbstractC37817c.m121344e(837168720, c28655q, new C15132r6(c23285v1, j18, interfaceC4351m3, 2));
                    c28655q.m87173q(false);
                }
                iOrdinal4 = enumC24915m0.ordinal();
                if (iOrdinal4 == 0) {
                    C37816b c37816b5 = c37816b;
                    c28655q.m87150e0(-1887830698);
                    AbstractC23119j4.m67096b(interfaceC4351m, c37816bM121344e, c37816b2, c37816b5, c37816b5, c37816b5, c37816b5, z4, c23125k4, new C24911k0(new C17177j(0, 3, InterfaceC28670t2.class, c11409v1M30542d5, "value", "getValue()Ljava/lang/Object;")), AbstractC37817c.m121344e(-1729858187, c28655q, new C14990e(7, interfaceC4351m4)), c37816bM121344e2, interfaceC22973k1, c28655q, ((i27 >> 3) & 112) | 6 | ((i28 << 21) & 234881024) | ((i27 << 18) & 1879048192), ((i28 >> 6) & 7168) | 48);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (iOrdinal4 != 1) {
                        throw AbstractC11895b.m32003v(493292232, c28655q, z15);
                    }
                    c28655q.m87150e0(-1886778186);
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = AbstractC28683x.m87272z(new C16620e(0L));
                        c28655q.m87172p0(objM87133R6);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
                    C37816b c37816bM121344e5 = AbstractC37817c.m121344e(528115858, c28655q, new C2213d(interfaceC28601c1, c23125k4, interfaceC22973k1, interfaceC4351m4));
                    z16 = true;
                    C37816b c37816b6 = c37816bM121344e;
                    C24911k0 c24911k1 = new C24911k0(new C17177j(0, 4, InterfaceC28670t2.class, c11409v1M30542d5, "value", "getValue()Ljava/lang/Object;"));
                    if ((i27 & 7168) != c3) {
                        z16 = z15;
                    }
                    zM87153g3 = z16 | c28655q.m87153g(c11409v1M30542d5);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R7 = new C2612r2(c23125k4, c11409v1M30542d5, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C2612r2(c23125k4, c11409v1M30542d5, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    c28655q = c28655q;
                    AbstractC23076c3.m67047c(interfaceC4351m, c37816b2, c37816b6, c37816b, c37816b, c37816b, c37816b, z4, c23125k4, c24911k1, (Function1) objM87133R7, c37816bM121344e5, c37816bM121344e2, interfaceC22973k1, c28655q, ((i27 >> 3) & 112) | 6 | ((i28 << 21) & 234881024) | ((i27 << 18) & 1879048192), (57344 & (i28 >> 3)) | 384);
                    c28655q.m87173q(false);
                }
            } else {
                abstractC0954a = abstractC0954a2;
            }
            f15 = 1.0f;
            c28655q.m87173q(false);
            Float fValueOf11 = Float.valueOf(f15);
            EnumC24927y enumC24927y16 = (EnumC24927y) c28633k1.getValue();
            c28655q.m87150e0(-1093194547);
            iOrdinal = enumC24927y16.ordinal();
            if (iOrdinal == 0) {
                f16 = 1.0f;
            } else {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z18) {
                    f16 = 1.0f;
                }
                f16 = 0.0f;
            }
            c28655q.m87173q(false);
            Float fValueOf12 = Float.valueOf(f16);
            interfaceC11403t1M30664f = c11421z1M30544f.m30664f();
            c28655q.m87150e0(-984009111);
            enumC24927y2 = EnumC24927y.f97616w;
            enumC24927y3 = EnumC24927y.f97617x;
            if (interfaceC11403t1M30664f.m30637d(enumC24927y2, enumC24927y3)) {
                c11362i1M67109m3 = c11362i1M67109m2;
            } else {
                c11362i1M67109m3 = c11362i1M67109m2;
            }
            c28655q.m87173q(false);
            c11409v1M30542d = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf11, fValueOf12, c11362i1M67109m3, c11351f2, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
            EnumC24927y enumC24927y17 = (EnumC24927y) abstractC0954a.mo2428y0();
            c28655q.m87150e0(-1258455321);
            iOrdinal2 = enumC24927y17.ordinal();
            if (iOrdinal2 == 0) {
                f17 = 1.0f;
            } else {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (z18) {
                    f17 = 0.0f;
                }
                f17 = 1.0f;
            }
            c28655q.m87173q(false);
            Float fValueOf13 = Float.valueOf(f17);
            EnumC24927y enumC24927y18 = (EnumC24927y) c28633k1.getValue();
            c28655q.m87150e0(-1258455321);
            iOrdinal3 = enumC24927y18.ordinal();
            if (iOrdinal3 == 0) {
                f18 = 1.0f;
            } else {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z18) {
                }
                f18 = 1.0f;
            }
            c28655q.m87173q(false);
            Float fValueOf14 = Float.valueOf(f18);
            c11421z1M30544f.m30664f();
            c28655q.m87150e0(2126293195);
            c28655q.m87173q(false);
            c11409v1M30542d2 = AbstractC11343d2.m30542d(c11421z1M30544f, fValueOf13, fValueOf14, c11362i1M67109m2, c11351f2, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
            C11362i1 c11362i1M67109m6 = AbstractC23124k3.m67109m(enumC27375n, c28655q);
            enumC24927y4 = (EnumC24927y) c28633k1.getValue();
            c28655q.m87150e0(-12973394);
            iArr = AbstractC24909j0.f97564a;
            if (iArr[enumC24927y4.ordinal()] == 1) {
                j13 = j25;
            } else {
                j13 = j24;
            }
            c28655q.m87173q(false);
            abstractC21222cM51545g = C17919x.m51545g(j13);
            zM87153g = c28655q.m87153g(abstractC21222cM51545g);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (zM87153g) {
                objM87133R = new C11351f2(c3731d, new C0227m1(abstractC21222cM51545g, 9));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C11351f2(c3731d, new C0227m1(abstractC21222cM51545g, 9));
                c28655q.m87172p0(objM87133R);
            }
            C11351f2 c11351f5 = (C11351f2) objM87133R;
            enumC24927y5 = (EnumC24927y) abstractC0954a.mo2428y0();
            c28655q.m87150e0(-12973394);
            if (iArr[enumC24927y5.ordinal()] == 1) {
                j14 = j25;
            } else {
                j14 = j24;
            }
            C17919x c17919xM31989h3 = AbstractC11895b.m31989h(c28655q, false, j14);
            enumC24927y6 = (EnumC24927y) c28633k1.getValue();
            c28655q.m87150e0(-12973394);
            if (iArr[enumC24927y6.ordinal()] == 1) {
                j15 = j25;
            } else {
                j15 = j24;
            }
            c28655q.m87173q(false);
            C17919x c17919x7 = new C17919x(j15);
            c11421z1M30544f.m30664f();
            c28655q.m87150e0(1954111929);
            c28655q.m87173q(false);
            c11409v1M30542d3 = AbstractC11343d2.m30542d(c11421z1M30544f, c17919xM31989h3, c17919x7, c11362i1M67109m6, c11351f5, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
            c28655q.m87150e0(-464752477);
            c28655q.m87173q(false);
            abstractC21222cM51545g2 = C17919x.m51545g(j7);
            zM87153g2 = c28655q.m87153g(abstractC21222cM51545g2);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R2 = new C11351f2(c3731d, new C0227m1(abstractC21222cM51545g2, 9));
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C11351f2(c3731d, new C0227m1(abstractC21222cM51545g2, 9));
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87150e0(-464752477);
            c28655q.m87173q(false);
            long j28 = j7;
            C17919x c17919x8 = new C17919x(j28);
            c28655q.m87150e0(-464752477);
            c28655q.m87173q(false);
            C17919x c17919x9 = new C17919x(j28);
            c11421z1M30544f.m30664f();
            c28655q.m87150e0(1190923886);
            c28655q.m87173q(false);
            c11409v1M30542d4 = AbstractC11343d2.m30542d(c11421z1M30544f, c17919x8, c17919x9, c11362i1M67109m6, (C11351f2) objM87133R2, c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21);
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C24907i0();
                c28655q.m87172p0(objM87133R3);
            }
            c24907i0 = (C24907i0) objM87133R3;
            if (function3 == null) {
                c28655q.m87150e0(-1891724857);
                c28655q.m87173q(false);
                c37816b = null;
                c3 = 2048;
                c37816bM121344e = null;
            } else {
                c28655q.m87150e0(-1891724856);
                c37816b = null;
                c3 = 2048;
                c37816bM121344e = AbstractC37817c.m121344e(-1076580032, c28655q, new C23135m2(c23285v0, c23285v1, c11409v1M30542d5, c11409v1M30542d4, z19, c11409v1M30542d3, function3, c24907i0));
                c28655q.m87173q(false);
            }
            if (!z13) {
                j16 = c23089e4.f91122D;
            } else if (z14) {
                j16 = c23089e4.f91123E;
            } else if (zBooleanValue) {
                j16 = c23089e4.f91120B;
            } else {
                j16 = c23089e4.f91121C;
            }
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC28683x.m87265s(new C33241t(c11409v1M30542d, 6), r21);
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC28670t2 interfaceC28670t4 = (InterfaceC28670t2) objM87133R4;
            if (interfaceC4351m2 == null) {
                c28655q.m87150e0(-1890217110);
                c28655q.m87173q(false);
                c37816b2 = c37816b;
            } else {
                c28655q.m87150e0(-1890217110);
                c28655q.m87173q(false);
                c37816b2 = c37816b;
            }
            objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC28683x.m87265s(new C33241t(c11409v1M30542d2, 7), c28676v1);
                c28655q.m87172p0(objM87133R5);
            }
            c28655q.m87150e0(-1889500886);
            c28655q.m87173q(false);
            c28655q.m87150e0(-1888924534);
            c28655q.m87173q(false);
            c28655q.m87150e0(-1888749663);
            c28655q.m87173q(false);
            c28655q.m87150e0(-1888469888);
            c28655q.m87173q(false);
            if (!z13) {
                j17 = c23089e4.f91126H;
            } else if (z14) {
                j17 = r4.f91127I;
            } else if (zBooleanValue) {
                j17 = r4.f91124F;
            } else {
                j17 = r4.f91125G;
            }
            j18 = j17;
            if (interfaceC4351m3 == null) {
                c28655q.m87150e0(-1888176380);
                z15 = false;
                c28655q.m87173q(false);
                c37816bM121344e2 = c37816b;
            } else {
                z15 = false;
                c28655q.m87150e0(-1888176379);
                c37816bM121344e2 = AbstractC37817c.m121344e(837168720, c28655q, new C15132r6(c23285v1, j18, interfaceC4351m3, 2));
                c28655q.m87173q(false);
            }
            iOrdinal4 = enumC24915m0.ordinal();
            if (iOrdinal4 == 0) {
                C37816b c37816b7 = c37816b;
                c28655q.m87150e0(-1887830698);
                AbstractC23119j4.m67096b(interfaceC4351m, c37816bM121344e, c37816b2, c37816b7, c37816b7, c37816b7, c37816b7, z4, c23125k4, new C24911k0(new C17177j(0, 3, InterfaceC28670t2.class, c11409v1M30542d5, "value", "getValue()Ljava/lang/Object;")), AbstractC37817c.m121344e(-1729858187, c28655q, new C14990e(7, interfaceC4351m4)), c37816bM121344e2, interfaceC22973k1, c28655q, ((i27 >> 3) & 112) | 6 | ((i28 << 21) & 234881024) | ((i27 << 18) & 1879048192), ((i28 >> 6) & 7168) | 48);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                if (iOrdinal4 != 1) {
                    throw AbstractC11895b.m32003v(493292232, c28655q, z15);
                }
                c28655q.m87150e0(-1886778186);
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = AbstractC28683x.m87272z(new C16620e(0L));
                    c28655q.m87172p0(objM87133R6);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R6;
                C37816b c37816bM121344e6 = AbstractC37817c.m121344e(528115858, c28655q, new C2213d(interfaceC28601c1, c23125k4, interfaceC22973k1, interfaceC4351m4));
                z16 = true;
                C37816b c37816b8 = c37816bM121344e;
                C24911k0 c24911k2 = new C24911k0(new C17177j(0, 4, InterfaceC28670t2.class, c11409v1M30542d5, "value", "getValue()Ljava/lang/Object;"));
                if ((i27 & 7168) != c3) {
                    z16 = z15;
                }
                zM87153g3 = z16 | c28655q.m87153g(c11409v1M30542d5);
                objM87133R7 = c28655q.m87133R();
                if (zM87153g3) {
                    objM87133R7 = new C2612r2(c23125k4, c11409v1M30542d5, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C2612r2(c23125k4, c11409v1M30542d5, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R7);
                }
                c28655q = c28655q;
                AbstractC23076c3.m67047c(interfaceC4351m, c37816b2, c37816b8, c37816b, c37816b, c37816b, c37816b, z4, c23125k4, c24911k2, (Function1) objM87133R7, c37816bM121344e6, c37816bM121344e2, interfaceC22973k1, c28655q, ((i27 >> 3) & 112) | 6 | ((i28 << 21) & 234881024) | ((i27 << 18) & 1879048192), (57344 & (i28 >> 3)) | 384);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18068b(enumC24915m0, charSequence, interfaceC4351m, c23125k4, function3, interfaceC4351m2, interfaceC4351m3, z4, z13, z14, interfaceC21083i, interfaceC22973k1, c23089e4, interfaceC4351m4, i13, i14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m73014b(long j7, C23285v0 c23285v0, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(396611577);
        int i14 = (c28655q.m87151f(j7) ? 4 : 2) | i13 | (c28655q.m87153g(c23285v0) ? 32 : 16);
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC24899e0.m72995b(j7, c23285v0, interfaceC4351m, c28655q, i14 & 1022);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24901f0(j7, c23285v0, interfaceC4351m, i13, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2300f m73015c(C23125k4 c23125k4) {
        if (c23125k4 instanceof C23125k4) {
            return c23125k4.f91359a;
        }
        throw new IllegalArgumentException("Unknown position: " + c23125k4);
    }

    /* JADX INFO: renamed from: d */
    public static final float m73016d(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        long j7 = ((C23209y4) c28655q.m87161k(AbstractC23215z4.f91921a)).f91881l.f92256b.f92106c;
        long j13 = AbstractC27358a0.f109662l;
        if ((1095216660480L & j7) != 4294967296L) {
            j7 = j13;
        }
        return ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo738l(j7) / 2;
    }

    /* JADX INFO: renamed from: e */
    public static final float m73017e(Composer composer) {
        float f13 = ((C39174f) ((C28655q) composer).m87161k(AbstractC23194w1.f91763c)).f168413w;
        if (Float.isNaN(f13)) {
            f13 = 0;
        }
        float f14 = (f13 - AbstractC27384w.f110064d) / 2;
        float f15 = 0;
        return f14 < f15 ? f15 : f14;
    }
}
