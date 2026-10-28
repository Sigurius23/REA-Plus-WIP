package p163g1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import fq2.C14686c;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p208i2.C17875c1;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p209i3.AbstractC18032n;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC22973k1;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p412q3.C29871f0;
import p412q3.C29891y;
import p412q3.InterfaceC29873g0;
import p490t0.AbstractC33244a;
import p510u0.AbstractC34323i;
import p510u0.C34348q0;
import p510u0.C34351r0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.AbstractC39170b;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.j4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15050j4 {

    /* JADX INFO: renamed from: a */
    public static final float f56342a = 4;

    /* JADX INFO: renamed from: b */
    public static final long f56343b = AbstractC35745c.m113246h(8);

    /* JADX WARN: Code duplicated, block: B:102:0x0138  */
    /* JADX WARN: Code duplicated, block: B:103:0x013b  */
    /* JADX WARN: Code duplicated, block: B:105:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:111:0x0151  */
    /* JADX WARN: Code duplicated, block: B:114:0x015e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0165  */
    /* JADX WARN: Code duplicated, block: B:117:0x0169  */
    /* JADX WARN: Code duplicated, block: B:119:0x0171  */
    /* JADX WARN: Code duplicated, block: B:121:0x0176  */
    /* JADX WARN: Code duplicated, block: B:124:0x017e  */
    /* JADX WARN: Code duplicated, block: B:127:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0190  */
    /* JADX WARN: Code duplicated, block: B:132:0x0199  */
    /* JADX WARN: Code duplicated, block: B:134:0x019e  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:162:0x0207 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x0209  */
    /* JADX WARN: Code duplicated, block: B:165:0x020c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0211  */
    /* JADX WARN: Code duplicated, block: B:169:0x021c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0220  */
    /* JADX WARN: Code duplicated, block: B:174:0x0223  */
    /* JADX WARN: Code duplicated, block: B:175:0x0225  */
    /* JADX WARN: Code duplicated, block: B:178:0x022a  */
    /* JADX WARN: Code duplicated, block: B:180:0x022d  */
    /* JADX WARN: Code duplicated, block: B:181:0x022f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0233  */
    /* JADX WARN: Code duplicated, block: B:184:0x0236  */
    /* JADX WARN: Code duplicated, block: B:187:0x023c  */
    /* JADX WARN: Code duplicated, block: B:188:0x023e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0242  */
    /* JADX WARN: Code duplicated, block: B:191:0x0245  */
    /* JADX WARN: Code duplicated, block: B:194:0x024e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0257  */
    /* JADX WARN: Code duplicated, block: B:199:0x0280  */
    /* JADX WARN: Code duplicated, block: B:202:0x029c  */
    /* JADX WARN: Code duplicated, block: B:204:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:207:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:209:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:211:0x031c  */
    /* JADX WARN: Code duplicated, block: B:213:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:216:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00db  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:86:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x0110  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x0128  */
    /* JADX WARN: Code duplicated, block: B:99:0x012d  */
    /* JADX INFO: renamed from: a */
    public static final void m43135a(final String str, final Function1 function1, final Modifier modifier, boolean z4, boolean z13, C23285v0 c23285v0, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, boolean z14, InterfaceC29873g0 interfaceC29873g0, C34351r0 c34351r0, C34348q0 c34348q0, boolean z15, int i13, int i14, InterfaceC17869a1 interfaceC17869a1, final C15197y1 c15197y1, Composer composer, final int i15, final int i16, final int i17) {
        int i18;
        Function1 function2;
        boolean z16;
        int i19;
        int i24;
        boolean z17;
        int i25;
        C23285v0 c23285v1;
        int i26;
        InterfaceC4351m interfaceC4351m4;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        final InterfaceC4351m interfaceC4351m5;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        int i56;
        boolean z18;
        C28655q c28655q;
        final boolean z19;
        final InterfaceC29873g0 interfaceC29873g1;
        final C34348q0 c34348q1;
        final int i57;
        final int i58;
        final InterfaceC17869a1 interfaceC17869a2;
        final boolean z24;
        final C23285v0 c23285v2;
        final InterfaceC4351m interfaceC4351m6;
        final boolean z25;
        final InterfaceC4351m interfaceC4351m7;
        final C34351r0 c34351r1;
        final boolean z26;
        C28677v1 c28677v1M87180u;
        C23285v0 c23285v3;
        InterfaceC4351m interfaceC4351m8;
        boolean z27;
        C34351r0 c34351r2;
        C34348q0 c34348q2;
        boolean z28;
        int i59;
        int i64;
        int i65;
        InterfaceC17869a1 interfaceC17869a1M43126d;
        InterfaceC29873g0 interfaceC29873g2;
        boolean z29;
        boolean z34;
        boolean z35;
        int i66;
        InterfaceC4351m interfaceC4351m9;
        boolean z36;
        int i67;
        InterfaceC17869a1 interfaceC17869a3;
        int i68;
        Object objM87133R;
        C28676v0 c28676v0;
        long jM67366c;
        long j7;
        InterfaceC39171c interfaceC39171c;
        Modifier modifierM3398t;
        Object objM87133R2;
        int i69;
        int i74;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(801000036);
        if ((i15 & 6) == 0) {
            i18 = (c28655q2.m87153g(str) ? 4 : 2) | i15;
        } else {
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            function2 = function1;
            i18 |= c28655q2.m87157i(function2) ? 32 : 16;
        } else {
            function2 = function1;
        }
        if ((i15 & 384) == 0) {
            i18 |= c28655q2.m87153g(modifier) ? 256 : 128;
        }
        int i75 = i17 & 8;
        if (i75 == 0) {
            if ((i15 & 3072) == 0) {
                z16 = z4;
                i18 |= c28655q2.m87155h(z16) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i19 = i17 & 16;
            i24 = DfuBaseService.ERROR_REMOTE_MASK;
            if (i19 != 0) {
                if ((i15 & 24576) == 0) {
                    z17 = z13;
                    if (c28655q2.m87155h(z17)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i18 |= i25;
                }
                if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    c23285v1 = c23285v0;
                    if ((i17 & 32) == 0 || !c28655q2.m87153g(c23285v1)) {
                        i74 = 65536;
                    } else {
                        i74 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    }
                    i18 |= i74;
                } else {
                    c23285v1 = c23285v0;
                }
                i26 = i17 & 64;
                if (i26 != 0) {
                    i18 |= 1572864;
                    interfaceC4351m4 = interfaceC4351m;
                } else {
                    interfaceC4351m4 = interfaceC4351m;
                    if ((i15 & 1572864) == 0) {
                        if (c28655q2.m87157i(interfaceC4351m4)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i18 |= i27;
                    }
                }
                i28 = i17 & 128;
                if (i28 != 0) {
                    i18 |= 12582912;
                } else if ((i15 & 12582912) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m2)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i18 |= i29;
                }
                i34 = i18 | 100663296;
                i35 = i17 & 512;
                if (i35 != 0) {
                    if ((i15 & 805306368) == 0) {
                        interfaceC4351m5 = interfaceC4351m3;
                        if (c28655q2.m87157i(interfaceC4351m5)) {
                            i36 = 536870912;
                        } else {
                            i36 = 268435456;
                        }
                        i34 |= i36;
                    }
                    i37 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i37 != 0) {
                        if ((i16 & 6) == 0) {
                            if (c28655q2.m87155h(z14)) {
                                i39 = 4;
                            } else {
                                i39 = 2;
                            }
                            i44 = i16 | i39;
                        } else {
                            i37 = i37;
                            i38 = i16;
                        }
                        i45 = i38 | 48;
                        i46 = i17 & 4096;
                        if (i46 != 0) {
                            i47 = i38 | 432;
                        } else {
                            if ((i16 & 384) != 0) {
                                if (c28655q2.m87153g(c34351r0)) {
                                    i48 = 256;
                                } else {
                                    i48 = 128;
                                }
                                i45 |= i48;
                            }
                            i47 = i45;
                        }
                        i49 = i47 | 3072;
                        i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                        if (i54 != 0) {
                            i55 = i47 | 27648;
                        } else if ((i16 & 24576) == 0) {
                            if (c28655q2.m87155h(z15)) {
                                i24 = 16384;
                            }
                            i55 = i49 | i24;
                        } else {
                            i55 = i49;
                        }
                        if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i56 = i55 | 14155776;
                        if ((i16 & 100663296) != 0) {
                            if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0 || !c28655q2.m87153g(interfaceC17869a1)) {
                                i69 = AndroidSDKConstants.FLAG_MUTABLE;
                            } else {
                                i69 = 67108864;
                            }
                            i56 |= i69;
                        }
                        if ((i16 & 805306368) == 0) {
                            i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
                        }
                        if ((i34 & 306783379) == 306783378 || (i56 & 306783379) != 306783378) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (c28655q2.m87135U(i34 & 1, z18)) {
                            c28655q2.m87140Z();
                            if ((i15 & 1) != 0 || c28655q2.m87118C()) {
                                if (i75 != 0) {
                                    z16 = true;
                                }
                                if (i19 != 0) {
                                    z17 = false;
                                }
                                if ((i17 & 32) != 0) {
                                    c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                                    i34 &= -458753;
                                } else {
                                    c23285v3 = c23285v1;
                                }
                                if (i26 != 0) {
                                    interfaceC4351m4 = null;
                                }
                                if (i28 != 0) {
                                    interfaceC4351m8 = null;
                                } else {
                                    interfaceC4351m8 = interfaceC4351m2;
                                }
                                InterfaceC4351m interfaceC4351m10 = i35 == 0 ? interfaceC4351m5 : null;
                                if (i37 != 0) {
                                    z27 = false;
                                } else {
                                    z27 = z14;
                                }
                                if (i46 != 0) {
                                    c34351r2 = C34351r0.f144296e;
                                } else {
                                    c34351r2 = c34351r0;
                                }
                                c34348q2 = C34348q0.f144287g;
                                if (i54 != 0) {
                                    z28 = false;
                                } else {
                                    z28 = z15;
                                }
                                if (z28) {
                                    i59 = 1;
                                } else {
                                    i59 = Integer.MAX_VALUE;
                                }
                                i64 = i56 & (-458753);
                                if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                    C15043i8 c15043i8 = C15043i8.f56313a;
                                    interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                                    i65 = i56 & (-235339777);
                                } else {
                                    i65 = i64;
                                    interfaceC17869a1M43126d = interfaceC17869a1;
                                }
                                interfaceC29873g2 = C29871f0.f122092w;
                                boolean z37 = z17;
                                z29 = z28;
                                z34 = z27;
                                z35 = z37;
                                i66 = i65;
                                interfaceC4351m9 = interfaceC4351m10;
                                z36 = z16;
                                i67 = i59;
                                interfaceC17869a3 = interfaceC17869a1M43126d;
                                i68 = 1;
                            } else {
                                c28655q2.m87138X();
                                if ((i17 & 32) != 0) {
                                    i34 &= -458753;
                                }
                                int i76 = i56 & (-458753);
                                if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                    i76 = i56 & (-235339777);
                                }
                                interfaceC4351m8 = interfaceC4351m2;
                                z34 = z14;
                                interfaceC29873g2 = interfaceC29873g0;
                                c34351r2 = c34351r0;
                                c34348q2 = c34348q0;
                                i68 = i14;
                                interfaceC17869a3 = interfaceC17869a1;
                                i66 = i76;
                                c23285v3 = c23285v1;
                                interfaceC4351m9 = interfaceC4351m5;
                                z36 = z16;
                                i67 = i13;
                                z35 = z17;
                                z29 = z15;
                            }
                            c28655q2.m87175r();
                            c28655q2.m87150e0(-245169385);
                            objM87133R = c28655q2.m87133R();
                            InterfaceC4351m interfaceC4351m11 = interfaceC4351m9;
                            c28676v0 = C28635l.f115821a;
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC11266d.m30453g(c28655q2);
                            }
                            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                            c28655q2.m87173q(false);
                            c28655q2.m87150e0(961927730);
                            jM67366c = c23285v3.m67366c();
                            if (jM67366c != 16) {
                                j7 = jM67366c;
                            } else {
                                j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                            }
                            c28655q2.m87173q(false);
                            C23285v0 c23285v0M67368e = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                            interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                            modifierM3398t = C2314t.f9131w;
                            if (interfaceC4351m4 != null) {
                                c28655q2.m87150e0(-244698123);
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C14686c(25);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(-244312762);
                                c28655q2.m87173q(false);
                            }
                            Modifier modifierM3404a = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                            C17875c1 c17875c1 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                            boolean z38 = z34;
                            InterfaceC4351m interfaceC4351m12 = interfaceC4351m8;
                            InterfaceC4351m interfaceC4351m13 = interfaceC4351m4;
                            InterfaceC17869a1 interfaceC17869a4 = interfaceC17869a3;
                            C15028h4 c15028h4 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i, z38, interfaceC4351m13, interfaceC4351m12, interfaceC4351m11, interfaceC17869a4, c15197y1);
                            boolean z39 = z36;
                            C34351r0 c34351r3 = c34351r2;
                            boolean z44 = z29;
                            int i77 = i66 << 12;
                            C34348q0 c34348q3 = c34348q2;
                            int i78 = i68;
                            c28655q = c28655q2;
                            AbstractC34323i.m108619a(str, function2, modifierM3404a, z39, z35, c23285v0M67368e, c34351r3, c34348q3, z44, i67, i78, interfaceC29873g2, null, interfaceC21083i, c17875c1, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h4), c28655q, (i34 & 64638) | (i77 & 3670016) | (i77 & 29360128) | (i77 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                            c34351r1 = c34351r3;
                            interfaceC29873g1 = interfaceC29873g2;
                            i58 = i78;
                            i57 = i67;
                            z26 = z44;
                            c34348q1 = c34348q3;
                            c23285v2 = c23285v3;
                            interfaceC4351m6 = interfaceC4351m13;
                            z25 = z39;
                            z24 = z35;
                            z19 = z38;
                            interfaceC17869a2 = interfaceC17869a4;
                            interfaceC4351m7 = interfaceC4351m12;
                            interfaceC4351m5 = interfaceC4351m11;
                        } else {
                            c28655q = c28655q2;
                            c28655q.m87138X();
                            z19 = z14;
                            interfaceC29873g1 = interfaceC29873g0;
                            c34348q1 = c34348q0;
                            i57 = i13;
                            i58 = i14;
                            interfaceC17869a2 = interfaceC17869a1;
                            z24 = z17;
                            c23285v2 = c23285v1;
                            interfaceC4351m6 = interfaceC4351m4;
                            z25 = z16;
                            interfaceC4351m7 = interfaceC4351m2;
                            c34351r1 = c34351r0;
                            z26 = z15;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                                    int iM87244L2 = AbstractC28683x.m87244L(i16);
                                    AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                                    return C23454a0.f92919a;
                                }
                            };
                        }
                    }
                    i44 = i16 | 6;
                    i38 = i44;
                    i45 = i38 | 48;
                    i46 = i17 & 4096;
                    if (i46 != 0) {
                        i47 = i38 | 432;
                    } else {
                        if ((i16 & 384) != 0) {
                            if (c28655q2.m87153g(c34351r0)) {
                                i48 = 256;
                            } else {
                                i48 = 128;
                            }
                            i45 |= i48;
                        }
                        i47 = i45;
                    }
                    i49 = i47 | 3072;
                    i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                    if (i54 != 0) {
                        i55 = i47 | 27648;
                    } else if ((i16 & 24576) == 0) {
                        if (c28655q2.m87155h(z15)) {
                            i24 = 16384;
                        }
                        i55 = i49 | i24;
                    } else {
                        i55 = i49;
                    }
                    if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i56 = i55 | 14155776;
                    if ((i16 & 100663296) != 0) {
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                            i69 = AndroidSDKConstants.FLAG_MUTABLE;
                        } else {
                            i69 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i56 |= i69;
                    }
                    if ((i16 & 805306368) == 0) {
                        i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
                    }
                    if ((i34 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (c28655q2.m87135U(i34 & 1, z18)) {
                        c28655q2.m87140Z();
                        if ((i15 & 1) != 0) {
                            if (i75 != 0) {
                                z16 = true;
                            }
                            if (i19 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                                i34 &= -458753;
                            } else {
                                c23285v3 = c23285v1;
                            }
                            if (i26 != 0) {
                                interfaceC4351m4 = null;
                            }
                            if (i28 != 0) {
                                interfaceC4351m8 = null;
                            } else {
                                interfaceC4351m8 = interfaceC4351m2;
                            }
                            if (i35 == 0) {
                            }
                            if (i37 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if (i46 != 0) {
                                c34351r2 = C34351r0.f144296e;
                            } else {
                                c34351r2 = c34351r0;
                            }
                            c34348q2 = C34348q0.f144287g;
                            if (i54 != 0) {
                                z28 = false;
                            } else {
                                z28 = z15;
                            }
                            if (z28) {
                                i59 = 1;
                            } else {
                                i59 = Integer.MAX_VALUE;
                            }
                            i64 = i56 & (-458753);
                            if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                C15043i8 c15043i9 = C15043i8.f56313a;
                                interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                                i65 = i56 & (-235339777);
                            } else {
                                i65 = i64;
                                interfaceC17869a1M43126d = interfaceC17869a1;
                            }
                            interfaceC29873g2 = C29871f0.f122092w;
                            boolean z310 = z17;
                            z29 = z28;
                            z34 = z27;
                            z35 = z310;
                            i66 = i65;
                            interfaceC4351m9 = interfaceC4351m10;
                            z36 = z16;
                            i67 = i59;
                            interfaceC17869a3 = interfaceC17869a1M43126d;
                            i68 = 1;
                        } else {
                            if (i75 != 0) {
                                z16 = true;
                            }
                            if (i19 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                                i34 &= -458753;
                            } else {
                                c23285v3 = c23285v1;
                            }
                            if (i26 != 0) {
                                interfaceC4351m4 = null;
                            }
                            if (i28 != 0) {
                                interfaceC4351m8 = null;
                            } else {
                                interfaceC4351m8 = interfaceC4351m2;
                            }
                            if (i35 == 0) {
                            }
                            if (i37 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if (i46 != 0) {
                                c34351r2 = C34351r0.f144296e;
                            } else {
                                c34351r2 = c34351r0;
                            }
                            c34348q2 = C34348q0.f144287g;
                            if (i54 != 0) {
                                z28 = false;
                            } else {
                                z28 = z15;
                            }
                            if (z28) {
                                i59 = 1;
                            } else {
                                i59 = Integer.MAX_VALUE;
                            }
                            i64 = i56 & (-458753);
                            if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                C15043i8 c15043i10 = C15043i8.f56313a;
                                interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                                i65 = i56 & (-235339777);
                            } else {
                                i65 = i64;
                                interfaceC17869a1M43126d = interfaceC17869a1;
                            }
                            interfaceC29873g2 = C29871f0.f122092w;
                            boolean z311 = z17;
                            z29 = z28;
                            z34 = z27;
                            z35 = z311;
                            i66 = i65;
                            interfaceC4351m9 = interfaceC4351m10;
                            z36 = z16;
                            i67 = i59;
                            interfaceC17869a3 = interfaceC17869a1M43126d;
                            i68 = 1;
                        }
                        c28655q2.m87175r();
                        c28655q2.m87150e0(-245169385);
                        objM87133R = c28655q2.m87133R();
                        InterfaceC4351m interfaceC4351m14 = interfaceC4351m9;
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q2);
                        }
                        InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(961927730);
                        jM67366c = c23285v3.m67366c();
                        if (jM67366c != 16) {
                            j7 = jM67366c;
                        } else {
                            j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                        }
                        c28655q2.m87173q(false);
                        C23285v0 c23285v0M67368e2 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                        interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                        modifierM3398t = C2314t.f9131w;
                        if (interfaceC4351m4 != null) {
                            c28655q2.m87150e0(-244698123);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C14686c(25);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-244312762);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3404a2 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                        C17875c1 c17875c2 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                        boolean z312 = z34;
                        InterfaceC4351m interfaceC4351m15 = interfaceC4351m8;
                        InterfaceC4351m interfaceC4351m16 = interfaceC4351m4;
                        InterfaceC17869a1 interfaceC17869a5 = interfaceC17869a3;
                        C15028h4 c15028h5 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i2, z312, interfaceC4351m16, interfaceC4351m15, interfaceC4351m14, interfaceC17869a5, c15197y1);
                        boolean z313 = z36;
                        C34351r0 c34351r4 = c34351r2;
                        boolean z45 = z29;
                        int i79 = i66 << 12;
                        C34348q0 c34348q4 = c34348q2;
                        int i710 = i68;
                        c28655q = c28655q2;
                        AbstractC34323i.m108619a(str, function2, modifierM3404a2, z313, z35, c23285v0M67368e2, c34351r4, c34348q4, z45, i67, i710, interfaceC29873g2, null, interfaceC21083i2, c17875c2, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h5), c28655q, (i34 & 64638) | (i79 & 3670016) | (i79 & 29360128) | (i79 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                        c34351r1 = c34351r4;
                        interfaceC29873g1 = interfaceC29873g2;
                        i58 = i710;
                        i57 = i67;
                        z26 = z45;
                        c34348q1 = c34348q4;
                        c23285v2 = c23285v3;
                        interfaceC4351m6 = interfaceC4351m16;
                        z25 = z313;
                        z24 = z35;
                        z19 = z312;
                        interfaceC17869a2 = interfaceC17869a5;
                        interfaceC4351m7 = interfaceC4351m15;
                        interfaceC4351m5 = interfaceC4351m14;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z19 = z14;
                        interfaceC29873g1 = interfaceC29873g0;
                        c34348q1 = c34348q0;
                        i57 = i13;
                        i58 = i14;
                        interfaceC17869a2 = interfaceC17869a1;
                        z24 = z17;
                        c23285v2 = c23285v1;
                        interfaceC4351m6 = interfaceC4351m4;
                        z25 = z16;
                        interfaceC4351m7 = interfaceC4351m2;
                        c34351r1 = c34351r0;
                        z26 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                                int iM87244L2 = AbstractC28683x.m87244L(i16);
                                AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i34 = i18 | 905969664;
                interfaceC4351m5 = interfaceC4351m3;
                i37 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i37 != 0) {
                    if ((i16 & 6) == 0) {
                        if (c28655q2.m87155h(z14)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i44 = i16 | i39;
                    } else {
                        i37 = i37;
                        i38 = i16;
                    }
                    i45 = i38 | 48;
                    i46 = i17 & 4096;
                    if (i46 != 0) {
                        i47 = i38 | 432;
                    } else {
                        if ((i16 & 384) != 0) {
                            if (c28655q2.m87153g(c34351r0)) {
                                i48 = 256;
                            } else {
                                i48 = 128;
                            }
                            i45 |= i48;
                        }
                        i47 = i45;
                    }
                    i49 = i47 | 3072;
                    i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                    if (i54 != 0) {
                        i55 = i47 | 27648;
                    } else if ((i16 & 24576) == 0) {
                        if (c28655q2.m87155h(z15)) {
                            i24 = 16384;
                        }
                        i55 = i49 | i24;
                    } else {
                        i55 = i49;
                    }
                    if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i56 = i55 | 14155776;
                    if ((i16 & 100663296) != 0) {
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                            i69 = AndroidSDKConstants.FLAG_MUTABLE;
                        } else {
                            i69 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i56 |= i69;
                    }
                    if ((i16 & 805306368) == 0) {
                        i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
                    }
                    if ((i34 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (c28655q2.m87135U(i34 & 1, z18)) {
                        c28655q2.m87140Z();
                        if ((i15 & 1) != 0) {
                            if (i75 != 0) {
                                z16 = true;
                            }
                            if (i19 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                                i34 &= -458753;
                            } else {
                                c23285v3 = c23285v1;
                            }
                            if (i26 != 0) {
                                interfaceC4351m4 = null;
                            }
                            if (i28 != 0) {
                                interfaceC4351m8 = null;
                            } else {
                                interfaceC4351m8 = interfaceC4351m2;
                            }
                            if (i35 == 0) {
                            }
                            if (i37 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if (i46 != 0) {
                                c34351r2 = C34351r0.f144296e;
                            } else {
                                c34351r2 = c34351r0;
                            }
                            c34348q2 = C34348q0.f144287g;
                            if (i54 != 0) {
                                z28 = false;
                            } else {
                                z28 = z15;
                            }
                            if (z28) {
                                i59 = 1;
                            } else {
                                i59 = Integer.MAX_VALUE;
                            }
                            i64 = i56 & (-458753);
                            if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                C15043i8 c15043i11 = C15043i8.f56313a;
                                interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                                i65 = i56 & (-235339777);
                            } else {
                                i65 = i64;
                                interfaceC17869a1M43126d = interfaceC17869a1;
                            }
                            interfaceC29873g2 = C29871f0.f122092w;
                            boolean z314 = z17;
                            z29 = z28;
                            z34 = z27;
                            z35 = z314;
                            i66 = i65;
                            interfaceC4351m9 = interfaceC4351m10;
                            z36 = z16;
                            i67 = i59;
                            interfaceC17869a3 = interfaceC17869a1M43126d;
                            i68 = 1;
                        } else {
                            if (i75 != 0) {
                                z16 = true;
                            }
                            if (i19 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                                i34 &= -458753;
                            } else {
                                c23285v3 = c23285v1;
                            }
                            if (i26 != 0) {
                                interfaceC4351m4 = null;
                            }
                            if (i28 != 0) {
                                interfaceC4351m8 = null;
                            } else {
                                interfaceC4351m8 = interfaceC4351m2;
                            }
                            if (i35 == 0) {
                            }
                            if (i37 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if (i46 != 0) {
                                c34351r2 = C34351r0.f144296e;
                            } else {
                                c34351r2 = c34351r0;
                            }
                            c34348q2 = C34348q0.f144287g;
                            if (i54 != 0) {
                                z28 = false;
                            } else {
                                z28 = z15;
                            }
                            if (z28) {
                                i59 = 1;
                            } else {
                                i59 = Integer.MAX_VALUE;
                            }
                            i64 = i56 & (-458753);
                            if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                C15043i8 c15043i12 = C15043i8.f56313a;
                                interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                                i65 = i56 & (-235339777);
                            } else {
                                i65 = i64;
                                interfaceC17869a1M43126d = interfaceC17869a1;
                            }
                            interfaceC29873g2 = C29871f0.f122092w;
                            boolean z315 = z17;
                            z29 = z28;
                            z34 = z27;
                            z35 = z315;
                            i66 = i65;
                            interfaceC4351m9 = interfaceC4351m10;
                            z36 = z16;
                            i67 = i59;
                            interfaceC17869a3 = interfaceC17869a1M43126d;
                            i68 = 1;
                        }
                        c28655q2.m87175r();
                        c28655q2.m87150e0(-245169385);
                        objM87133R = c28655q2.m87133R();
                        InterfaceC4351m interfaceC4351m17 = interfaceC4351m9;
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q2);
                        }
                        InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(961927730);
                        jM67366c = c23285v3.m67366c();
                        if (jM67366c != 16) {
                            j7 = jM67366c;
                        } else {
                            j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                        }
                        c28655q2.m87173q(false);
                        C23285v0 c23285v0M67368e3 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                        interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                        modifierM3398t = C2314t.f9131w;
                        if (interfaceC4351m4 != null) {
                            c28655q2.m87150e0(-244698123);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C14686c(25);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-244312762);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3404a3 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                        C17875c1 c17875c3 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                        boolean z316 = z34;
                        InterfaceC4351m interfaceC4351m18 = interfaceC4351m8;
                        InterfaceC4351m interfaceC4351m19 = interfaceC4351m4;
                        InterfaceC17869a1 interfaceC17869a6 = interfaceC17869a3;
                        C15028h4 c15028h6 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i3, z316, interfaceC4351m19, interfaceC4351m18, interfaceC4351m17, interfaceC17869a6, c15197y1);
                        boolean z317 = z36;
                        C34351r0 c34351r5 = c34351r2;
                        boolean z46 = z29;
                        int i711 = i66 << 12;
                        C34348q0 c34348q5 = c34348q2;
                        int i712 = i68;
                        c28655q = c28655q2;
                        AbstractC34323i.m108619a(str, function2, modifierM3404a3, z317, z35, c23285v0M67368e3, c34351r5, c34348q5, z46, i67, i712, interfaceC29873g2, null, interfaceC21083i3, c17875c3, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h6), c28655q, (i34 & 64638) | (i711 & 3670016) | (i711 & 29360128) | (i711 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                        c34351r1 = c34351r5;
                        interfaceC29873g1 = interfaceC29873g2;
                        i58 = i712;
                        i57 = i67;
                        z26 = z46;
                        c34348q1 = c34348q5;
                        c23285v2 = c23285v3;
                        interfaceC4351m6 = interfaceC4351m19;
                        z25 = z317;
                        z24 = z35;
                        z19 = z316;
                        interfaceC17869a2 = interfaceC17869a6;
                        interfaceC4351m7 = interfaceC4351m18;
                        interfaceC4351m5 = interfaceC4351m17;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z19 = z14;
                        interfaceC29873g1 = interfaceC29873g0;
                        c34348q1 = c34348q0;
                        i57 = i13;
                        i58 = i14;
                        interfaceC17869a2 = interfaceC17869a1;
                        z24 = z17;
                        c23285v2 = c23285v1;
                        interfaceC4351m6 = interfaceC4351m4;
                        z25 = z16;
                        interfaceC4351m7 = interfaceC4351m2;
                        c34351r1 = c34351r0;
                        z26 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                                int iM87244L2 = AbstractC28683x.m87244L(i16);
                                AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i44 = i16 | 6;
                i38 = i44;
                i45 = i38 | 48;
                i46 = i17 & 4096;
                if (i46 != 0) {
                    i47 = i38 | 432;
                } else {
                    if ((i16 & 384) != 0) {
                        if (c28655q2.m87153g(c34351r0)) {
                            i48 = 256;
                        } else {
                            i48 = 128;
                        }
                        i45 |= i48;
                    }
                    i47 = i45;
                }
                i49 = i47 | 3072;
                i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i54 != 0) {
                    i55 = i47 | 27648;
                } else if ((i16 & 24576) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i24 = 16384;
                    }
                    i55 = i49 | i24;
                } else {
                    i55 = i49;
                }
                if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i56 = i55 | 14155776;
                if ((i16 & 100663296) != 0) {
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        i69 = AndroidSDKConstants.FLAG_MUTABLE;
                    } else {
                        i69 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i56 |= i69;
                }
                if ((i16 & 805306368) == 0) {
                    i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
                }
                if ((i34 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q2.m87135U(i34 & 1, z18)) {
                    c28655q2.m87140Z();
                    if ((i15 & 1) != 0) {
                        if (i75 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                            i34 &= -458753;
                        } else {
                            c23285v3 = c23285v1;
                        }
                        if (i26 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i28 != 0) {
                            interfaceC4351m8 = null;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i35 == 0) {
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i46 != 0) {
                            c34351r2 = C34351r0.f144296e;
                        } else {
                            c34351r2 = c34351r0;
                        }
                        c34348q2 = C34348q0.f144287g;
                        if (i54 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if (z28) {
                            i59 = 1;
                        } else {
                            i59 = Integer.MAX_VALUE;
                        }
                        i64 = i56 & (-458753);
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            C15043i8 c15043i13 = C15043i8.f56313a;
                            interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                            i65 = i56 & (-235339777);
                        } else {
                            i65 = i64;
                            interfaceC17869a1M43126d = interfaceC17869a1;
                        }
                        interfaceC29873g2 = C29871f0.f122092w;
                        boolean z318 = z17;
                        z29 = z28;
                        z34 = z27;
                        z35 = z318;
                        i66 = i65;
                        interfaceC4351m9 = interfaceC4351m10;
                        z36 = z16;
                        i67 = i59;
                        interfaceC17869a3 = interfaceC17869a1M43126d;
                        i68 = 1;
                    } else {
                        if (i75 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                            i34 &= -458753;
                        } else {
                            c23285v3 = c23285v1;
                        }
                        if (i26 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i28 != 0) {
                            interfaceC4351m8 = null;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i35 == 0) {
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i46 != 0) {
                            c34351r2 = C34351r0.f144296e;
                        } else {
                            c34351r2 = c34351r0;
                        }
                        c34348q2 = C34348q0.f144287g;
                        if (i54 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if (z28) {
                            i59 = 1;
                        } else {
                            i59 = Integer.MAX_VALUE;
                        }
                        i64 = i56 & (-458753);
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            C15043i8 c15043i14 = C15043i8.f56313a;
                            interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                            i65 = i56 & (-235339777);
                        } else {
                            i65 = i64;
                            interfaceC17869a1M43126d = interfaceC17869a1;
                        }
                        interfaceC29873g2 = C29871f0.f122092w;
                        boolean z319 = z17;
                        z29 = z28;
                        z34 = z27;
                        z35 = z319;
                        i66 = i65;
                        interfaceC4351m9 = interfaceC4351m10;
                        z36 = z16;
                        i67 = i59;
                        interfaceC17869a3 = interfaceC17869a1M43126d;
                        i68 = 1;
                    }
                    c28655q2.m87175r();
                    c28655q2.m87150e0(-245169385);
                    objM87133R = c28655q2.m87133R();
                    InterfaceC4351m interfaceC4351m110 = interfaceC4351m9;
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(961927730);
                    jM67366c = c23285v3.m67366c();
                    if (jM67366c != 16) {
                        j7 = jM67366c;
                    } else {
                        j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                    }
                    c28655q2.m87173q(false);
                    C23285v0 c23285v0M67368e4 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    modifierM3398t = C2314t.f9131w;
                    if (interfaceC4351m4 != null) {
                        c28655q2.m87150e0(-244698123);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C14686c(25);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-244312762);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3404a4 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                    C17875c1 c17875c4 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                    boolean z3110 = z34;
                    InterfaceC4351m interfaceC4351m111 = interfaceC4351m8;
                    InterfaceC4351m interfaceC4351m112 = interfaceC4351m4;
                    InterfaceC17869a1 interfaceC17869a7 = interfaceC17869a3;
                    C15028h4 c15028h7 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i4, z3110, interfaceC4351m112, interfaceC4351m111, interfaceC4351m110, interfaceC17869a7, c15197y1);
                    boolean z3111 = z36;
                    C34351r0 c34351r6 = c34351r2;
                    boolean z47 = z29;
                    int i713 = i66 << 12;
                    C34348q0 c34348q6 = c34348q2;
                    int i714 = i68;
                    c28655q = c28655q2;
                    AbstractC34323i.m108619a(str, function2, modifierM3404a4, z3111, z35, c23285v0M67368e4, c34351r6, c34348q6, z47, i67, i714, interfaceC29873g2, null, interfaceC21083i4, c17875c4, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h7), c28655q, (i34 & 64638) | (i713 & 3670016) | (i713 & 29360128) | (i713 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                    c34351r1 = c34351r6;
                    interfaceC29873g1 = interfaceC29873g2;
                    i58 = i714;
                    i57 = i67;
                    z26 = z47;
                    c34348q1 = c34348q6;
                    c23285v2 = c23285v3;
                    interfaceC4351m6 = interfaceC4351m112;
                    z25 = z3111;
                    z24 = z35;
                    z19 = z3110;
                    interfaceC17869a2 = interfaceC17869a7;
                    interfaceC4351m7 = interfaceC4351m111;
                    interfaceC4351m5 = interfaceC4351m110;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z19 = z14;
                    interfaceC29873g1 = interfaceC29873g0;
                    c34348q1 = c34348q0;
                    i57 = i13;
                    i58 = i14;
                    interfaceC17869a2 = interfaceC17869a1;
                    z24 = z17;
                    c23285v2 = c23285v1;
                    interfaceC4351m6 = interfaceC4351m4;
                    z25 = z16;
                    interfaceC4351m7 = interfaceC4351m2;
                    c34351r1 = c34351r0;
                    z26 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                            int iM87244L2 = AbstractC28683x.m87244L(i16);
                            AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i18 |= 24576;
            z17 = z13;
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                c23285v1 = c23285v0;
                if ((i17 & 32) == 0) {
                    i74 = 65536;
                } else {
                    i74 = 65536;
                }
                i18 |= i74;
            } else {
                c23285v1 = c23285v0;
            }
            i26 = i17 & 64;
            if (i26 != 0) {
                i18 |= 1572864;
                interfaceC4351m4 = interfaceC4351m;
            } else {
                interfaceC4351m4 = interfaceC4351m;
                if ((i15 & 1572864) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m4)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i18 |= i27;
                }
            }
            i28 = i17 & 128;
            if (i28 != 0) {
                i18 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (c28655q2.m87157i(interfaceC4351m2)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i18 |= i29;
            }
            i34 = i18 | 100663296;
            i35 = i17 & 512;
            if (i35 != 0) {
                if ((i15 & 805306368) == 0) {
                    interfaceC4351m5 = interfaceC4351m3;
                    if (c28655q2.m87157i(interfaceC4351m5)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i34 |= i36;
                }
                i37 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i37 != 0) {
                    if ((i16 & 6) == 0) {
                        if (c28655q2.m87155h(z14)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i44 = i16 | i39;
                    } else {
                        i37 = i37;
                        i38 = i16;
                    }
                    i45 = i38 | 48;
                    i46 = i17 & 4096;
                    if (i46 != 0) {
                        i47 = i38 | 432;
                    } else {
                        if ((i16 & 384) != 0) {
                            if (c28655q2.m87153g(c34351r0)) {
                                i48 = 256;
                            } else {
                                i48 = 128;
                            }
                            i45 |= i48;
                        }
                        i47 = i45;
                    }
                    i49 = i47 | 3072;
                    i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                    if (i54 != 0) {
                        i55 = i47 | 27648;
                    } else if ((i16 & 24576) == 0) {
                        if (c28655q2.m87155h(z15)) {
                            i24 = 16384;
                        }
                        i55 = i49 | i24;
                    } else {
                        i55 = i49;
                    }
                    if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i56 = i55 | 14155776;
                    if ((i16 & 100663296) != 0) {
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                            i69 = AndroidSDKConstants.FLAG_MUTABLE;
                        } else {
                            i69 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i56 |= i69;
                    }
                    if ((i16 & 805306368) == 0) {
                        i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
                    }
                    if ((i34 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (c28655q2.m87135U(i34 & 1, z18)) {
                        c28655q2.m87140Z();
                        if ((i15 & 1) != 0) {
                            if (i75 != 0) {
                                z16 = true;
                            }
                            if (i19 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                                i34 &= -458753;
                            } else {
                                c23285v3 = c23285v1;
                            }
                            if (i26 != 0) {
                                interfaceC4351m4 = null;
                            }
                            if (i28 != 0) {
                                interfaceC4351m8 = null;
                            } else {
                                interfaceC4351m8 = interfaceC4351m2;
                            }
                            if (i35 == 0) {
                            }
                            if (i37 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if (i46 != 0) {
                                c34351r2 = C34351r0.f144296e;
                            } else {
                                c34351r2 = c34351r0;
                            }
                            c34348q2 = C34348q0.f144287g;
                            if (i54 != 0) {
                                z28 = false;
                            } else {
                                z28 = z15;
                            }
                            if (z28) {
                                i59 = 1;
                            } else {
                                i59 = Integer.MAX_VALUE;
                            }
                            i64 = i56 & (-458753);
                            if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                C15043i8 c15043i15 = C15043i8.f56313a;
                                interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                                i65 = i56 & (-235339777);
                            } else {
                                i65 = i64;
                                interfaceC17869a1M43126d = interfaceC17869a1;
                            }
                            interfaceC29873g2 = C29871f0.f122092w;
                            boolean z3112 = z17;
                            z29 = z28;
                            z34 = z27;
                            z35 = z3112;
                            i66 = i65;
                            interfaceC4351m9 = interfaceC4351m10;
                            z36 = z16;
                            i67 = i59;
                            interfaceC17869a3 = interfaceC17869a1M43126d;
                            i68 = 1;
                        } else {
                            if (i75 != 0) {
                                z16 = true;
                            }
                            if (i19 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                                i34 &= -458753;
                            } else {
                                c23285v3 = c23285v1;
                            }
                            if (i26 != 0) {
                                interfaceC4351m4 = null;
                            }
                            if (i28 != 0) {
                                interfaceC4351m8 = null;
                            } else {
                                interfaceC4351m8 = interfaceC4351m2;
                            }
                            if (i35 == 0) {
                            }
                            if (i37 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if (i46 != 0) {
                                c34351r2 = C34351r0.f144296e;
                            } else {
                                c34351r2 = c34351r0;
                            }
                            c34348q2 = C34348q0.f144287g;
                            if (i54 != 0) {
                                z28 = false;
                            } else {
                                z28 = z15;
                            }
                            if (z28) {
                                i59 = 1;
                            } else {
                                i59 = Integer.MAX_VALUE;
                            }
                            i64 = i56 & (-458753);
                            if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                C15043i8 c15043i16 = C15043i8.f56313a;
                                interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                                i65 = i56 & (-235339777);
                            } else {
                                i65 = i64;
                                interfaceC17869a1M43126d = interfaceC17869a1;
                            }
                            interfaceC29873g2 = C29871f0.f122092w;
                            boolean z3113 = z17;
                            z29 = z28;
                            z34 = z27;
                            z35 = z3113;
                            i66 = i65;
                            interfaceC4351m9 = interfaceC4351m10;
                            z36 = z16;
                            i67 = i59;
                            interfaceC17869a3 = interfaceC17869a1M43126d;
                            i68 = 1;
                        }
                        c28655q2.m87175r();
                        c28655q2.m87150e0(-245169385);
                        objM87133R = c28655q2.m87133R();
                        InterfaceC4351m interfaceC4351m113 = interfaceC4351m9;
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q2);
                        }
                        InterfaceC21083i interfaceC21083i5 = (InterfaceC21083i) objM87133R;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(961927730);
                        jM67366c = c23285v3.m67366c();
                        if (jM67366c != 16) {
                            j7 = jM67366c;
                        } else {
                            j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                        }
                        c28655q2.m87173q(false);
                        C23285v0 c23285v0M67368e5 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                        interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                        modifierM3398t = C2314t.f9131w;
                        if (interfaceC4351m4 != null) {
                            c28655q2.m87150e0(-244698123);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C14686c(25);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-244312762);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3404a5 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                        C17875c1 c17875c5 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                        boolean z3114 = z34;
                        InterfaceC4351m interfaceC4351m114 = interfaceC4351m8;
                        InterfaceC4351m interfaceC4351m115 = interfaceC4351m4;
                        InterfaceC17869a1 interfaceC17869a8 = interfaceC17869a3;
                        C15028h4 c15028h8 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i5, z3114, interfaceC4351m115, interfaceC4351m114, interfaceC4351m113, interfaceC17869a8, c15197y1);
                        boolean z3115 = z36;
                        C34351r0 c34351r7 = c34351r2;
                        boolean z48 = z29;
                        int i715 = i66 << 12;
                        C34348q0 c34348q7 = c34348q2;
                        int i716 = i68;
                        c28655q = c28655q2;
                        AbstractC34323i.m108619a(str, function2, modifierM3404a5, z3115, z35, c23285v0M67368e5, c34351r7, c34348q7, z48, i67, i716, interfaceC29873g2, null, interfaceC21083i5, c17875c5, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h8), c28655q, (i34 & 64638) | (i715 & 3670016) | (i715 & 29360128) | (i715 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                        c34351r1 = c34351r7;
                        interfaceC29873g1 = interfaceC29873g2;
                        i58 = i716;
                        i57 = i67;
                        z26 = z48;
                        c34348q1 = c34348q7;
                        c23285v2 = c23285v3;
                        interfaceC4351m6 = interfaceC4351m115;
                        z25 = z3115;
                        z24 = z35;
                        z19 = z3114;
                        interfaceC17869a2 = interfaceC17869a8;
                        interfaceC4351m7 = interfaceC4351m114;
                        interfaceC4351m5 = interfaceC4351m113;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z19 = z14;
                        interfaceC29873g1 = interfaceC29873g0;
                        c34348q1 = c34348q0;
                        i57 = i13;
                        i58 = i14;
                        interfaceC17869a2 = interfaceC17869a1;
                        z24 = z17;
                        c23285v2 = c23285v1;
                        interfaceC4351m6 = interfaceC4351m4;
                        z25 = z16;
                        interfaceC4351m7 = interfaceC4351m2;
                        c34351r1 = c34351r0;
                        z26 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                                int iM87244L2 = AbstractC28683x.m87244L(i16);
                                AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i44 = i16 | 6;
                i38 = i44;
                i45 = i38 | 48;
                i46 = i17 & 4096;
                if (i46 != 0) {
                    i47 = i38 | 432;
                } else {
                    if ((i16 & 384) != 0) {
                        if (c28655q2.m87153g(c34351r0)) {
                            i48 = 256;
                        } else {
                            i48 = 128;
                        }
                        i45 |= i48;
                    }
                    i47 = i45;
                }
                i49 = i47 | 3072;
                i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i54 != 0) {
                    i55 = i47 | 27648;
                } else if ((i16 & 24576) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i24 = 16384;
                    }
                    i55 = i49 | i24;
                } else {
                    i55 = i49;
                }
                if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i56 = i55 | 14155776;
                if ((i16 & 100663296) != 0) {
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        i69 = AndroidSDKConstants.FLAG_MUTABLE;
                    } else {
                        i69 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i56 |= i69;
                }
                if ((i16 & 805306368) == 0) {
                    i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
                }
                if ((i34 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q2.m87135U(i34 & 1, z18)) {
                    c28655q2.m87140Z();
                    if ((i15 & 1) != 0) {
                        if (i75 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                            i34 &= -458753;
                        } else {
                            c23285v3 = c23285v1;
                        }
                        if (i26 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i28 != 0) {
                            interfaceC4351m8 = null;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i35 == 0) {
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i46 != 0) {
                            c34351r2 = C34351r0.f144296e;
                        } else {
                            c34351r2 = c34351r0;
                        }
                        c34348q2 = C34348q0.f144287g;
                        if (i54 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if (z28) {
                            i59 = 1;
                        } else {
                            i59 = Integer.MAX_VALUE;
                        }
                        i64 = i56 & (-458753);
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            C15043i8 c15043i17 = C15043i8.f56313a;
                            interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                            i65 = i56 & (-235339777);
                        } else {
                            i65 = i64;
                            interfaceC17869a1M43126d = interfaceC17869a1;
                        }
                        interfaceC29873g2 = C29871f0.f122092w;
                        boolean z3116 = z17;
                        z29 = z28;
                        z34 = z27;
                        z35 = z3116;
                        i66 = i65;
                        interfaceC4351m9 = interfaceC4351m10;
                        z36 = z16;
                        i67 = i59;
                        interfaceC17869a3 = interfaceC17869a1M43126d;
                        i68 = 1;
                    } else {
                        if (i75 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                            i34 &= -458753;
                        } else {
                            c23285v3 = c23285v1;
                        }
                        if (i26 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i28 != 0) {
                            interfaceC4351m8 = null;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i35 == 0) {
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i46 != 0) {
                            c34351r2 = C34351r0.f144296e;
                        } else {
                            c34351r2 = c34351r0;
                        }
                        c34348q2 = C34348q0.f144287g;
                        if (i54 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if (z28) {
                            i59 = 1;
                        } else {
                            i59 = Integer.MAX_VALUE;
                        }
                        i64 = i56 & (-458753);
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            C15043i8 c15043i18 = C15043i8.f56313a;
                            interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                            i65 = i56 & (-235339777);
                        } else {
                            i65 = i64;
                            interfaceC17869a1M43126d = interfaceC17869a1;
                        }
                        interfaceC29873g2 = C29871f0.f122092w;
                        boolean z3117 = z17;
                        z29 = z28;
                        z34 = z27;
                        z35 = z3117;
                        i66 = i65;
                        interfaceC4351m9 = interfaceC4351m10;
                        z36 = z16;
                        i67 = i59;
                        interfaceC17869a3 = interfaceC17869a1M43126d;
                        i68 = 1;
                    }
                    c28655q2.m87175r();
                    c28655q2.m87150e0(-245169385);
                    objM87133R = c28655q2.m87133R();
                    InterfaceC4351m interfaceC4351m116 = interfaceC4351m9;
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i6 = (InterfaceC21083i) objM87133R;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(961927730);
                    jM67366c = c23285v3.m67366c();
                    if (jM67366c != 16) {
                        j7 = jM67366c;
                    } else {
                        j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                    }
                    c28655q2.m87173q(false);
                    C23285v0 c23285v0M67368e6 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    modifierM3398t = C2314t.f9131w;
                    if (interfaceC4351m4 != null) {
                        c28655q2.m87150e0(-244698123);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C14686c(25);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-244312762);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3404a6 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                    C17875c1 c17875c6 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                    boolean z3118 = z34;
                    InterfaceC4351m interfaceC4351m117 = interfaceC4351m8;
                    InterfaceC4351m interfaceC4351m118 = interfaceC4351m4;
                    InterfaceC17869a1 interfaceC17869a9 = interfaceC17869a3;
                    C15028h4 c15028h9 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i6, z3118, interfaceC4351m118, interfaceC4351m117, interfaceC4351m116, interfaceC17869a9, c15197y1);
                    boolean z3119 = z36;
                    C34351r0 c34351r8 = c34351r2;
                    boolean z49 = z29;
                    int i717 = i66 << 12;
                    C34348q0 c34348q8 = c34348q2;
                    int i718 = i68;
                    c28655q = c28655q2;
                    AbstractC34323i.m108619a(str, function2, modifierM3404a6, z3119, z35, c23285v0M67368e6, c34351r8, c34348q8, z49, i67, i718, interfaceC29873g2, null, interfaceC21083i6, c17875c6, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h9), c28655q, (i34 & 64638) | (i717 & 3670016) | (i717 & 29360128) | (i717 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                    c34351r1 = c34351r8;
                    interfaceC29873g1 = interfaceC29873g2;
                    i58 = i718;
                    i57 = i67;
                    z26 = z49;
                    c34348q1 = c34348q8;
                    c23285v2 = c23285v3;
                    interfaceC4351m6 = interfaceC4351m118;
                    z25 = z3119;
                    z24 = z35;
                    z19 = z3118;
                    interfaceC17869a2 = interfaceC17869a9;
                    interfaceC4351m7 = interfaceC4351m117;
                    interfaceC4351m5 = interfaceC4351m116;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z19 = z14;
                    interfaceC29873g1 = interfaceC29873g0;
                    c34348q1 = c34348q0;
                    i57 = i13;
                    i58 = i14;
                    interfaceC17869a2 = interfaceC17869a1;
                    z24 = z17;
                    c23285v2 = c23285v1;
                    interfaceC4351m6 = interfaceC4351m4;
                    z25 = z16;
                    interfaceC4351m7 = interfaceC4351m2;
                    c34351r1 = c34351r0;
                    z26 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                            int iM87244L2 = AbstractC28683x.m87244L(i16);
                            AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i34 = i18 | 905969664;
            interfaceC4351m5 = interfaceC4351m3;
            i37 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i37 != 0) {
                if ((i16 & 6) == 0) {
                    if (c28655q2.m87155h(z14)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i44 = i16 | i39;
                } else {
                    i37 = i37;
                    i38 = i16;
                }
                i45 = i38 | 48;
                i46 = i17 & 4096;
                if (i46 != 0) {
                    i47 = i38 | 432;
                } else {
                    if ((i16 & 384) != 0) {
                        if (c28655q2.m87153g(c34351r0)) {
                            i48 = 256;
                        } else {
                            i48 = 128;
                        }
                        i45 |= i48;
                    }
                    i47 = i45;
                }
                i49 = i47 | 3072;
                i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i54 != 0) {
                    i55 = i47 | 27648;
                } else if ((i16 & 24576) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i24 = 16384;
                    }
                    i55 = i49 | i24;
                } else {
                    i55 = i49;
                }
                if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i56 = i55 | 14155776;
                if ((i16 & 100663296) != 0) {
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        i69 = AndroidSDKConstants.FLAG_MUTABLE;
                    } else {
                        i69 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i56 |= i69;
                }
                if ((i16 & 805306368) == 0) {
                    i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
                }
                if ((i34 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q2.m87135U(i34 & 1, z18)) {
                    c28655q2.m87140Z();
                    if ((i15 & 1) != 0) {
                        if (i75 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                            i34 &= -458753;
                        } else {
                            c23285v3 = c23285v1;
                        }
                        if (i26 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i28 != 0) {
                            interfaceC4351m8 = null;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i35 == 0) {
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i46 != 0) {
                            c34351r2 = C34351r0.f144296e;
                        } else {
                            c34351r2 = c34351r0;
                        }
                        c34348q2 = C34348q0.f144287g;
                        if (i54 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if (z28) {
                            i59 = 1;
                        } else {
                            i59 = Integer.MAX_VALUE;
                        }
                        i64 = i56 & (-458753);
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            C15043i8 c15043i19 = C15043i8.f56313a;
                            interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                            i65 = i56 & (-235339777);
                        } else {
                            i65 = i64;
                            interfaceC17869a1M43126d = interfaceC17869a1;
                        }
                        interfaceC29873g2 = C29871f0.f122092w;
                        boolean z31110 = z17;
                        z29 = z28;
                        z34 = z27;
                        z35 = z31110;
                        i66 = i65;
                        interfaceC4351m9 = interfaceC4351m10;
                        z36 = z16;
                        i67 = i59;
                        interfaceC17869a3 = interfaceC17869a1M43126d;
                        i68 = 1;
                    } else {
                        if (i75 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                            i34 &= -458753;
                        } else {
                            c23285v3 = c23285v1;
                        }
                        if (i26 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i28 != 0) {
                            interfaceC4351m8 = null;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i35 == 0) {
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i46 != 0) {
                            c34351r2 = C34351r0.f144296e;
                        } else {
                            c34351r2 = c34351r0;
                        }
                        c34348q2 = C34348q0.f144287g;
                        if (i54 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if (z28) {
                            i59 = 1;
                        } else {
                            i59 = Integer.MAX_VALUE;
                        }
                        i64 = i56 & (-458753);
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            C15043i8 c15043i110 = C15043i8.f56313a;
                            interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                            i65 = i56 & (-235339777);
                        } else {
                            i65 = i64;
                            interfaceC17869a1M43126d = interfaceC17869a1;
                        }
                        interfaceC29873g2 = C29871f0.f122092w;
                        boolean z31111 = z17;
                        z29 = z28;
                        z34 = z27;
                        z35 = z31111;
                        i66 = i65;
                        interfaceC4351m9 = interfaceC4351m10;
                        z36 = z16;
                        i67 = i59;
                        interfaceC17869a3 = interfaceC17869a1M43126d;
                        i68 = 1;
                    }
                    c28655q2.m87175r();
                    c28655q2.m87150e0(-245169385);
                    objM87133R = c28655q2.m87133R();
                    InterfaceC4351m interfaceC4351m119 = interfaceC4351m9;
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i7 = (InterfaceC21083i) objM87133R;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(961927730);
                    jM67366c = c23285v3.m67366c();
                    if (jM67366c != 16) {
                        j7 = jM67366c;
                    } else {
                        j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                    }
                    c28655q2.m87173q(false);
                    C23285v0 c23285v0M67368e7 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    modifierM3398t = C2314t.f9131w;
                    if (interfaceC4351m4 != null) {
                        c28655q2.m87150e0(-244698123);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C14686c(25);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-244312762);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3404a7 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                    C17875c1 c17875c7 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                    boolean z31112 = z34;
                    InterfaceC4351m interfaceC4351m1110 = interfaceC4351m8;
                    InterfaceC4351m interfaceC4351m1111 = interfaceC4351m4;
                    InterfaceC17869a1 interfaceC17869a10 = interfaceC17869a3;
                    C15028h4 c15028h10 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i7, z31112, interfaceC4351m1111, interfaceC4351m1110, interfaceC4351m119, interfaceC17869a10, c15197y1);
                    boolean z31113 = z36;
                    C34351r0 c34351r9 = c34351r2;
                    boolean z410 = z29;
                    int i719 = i66 << 12;
                    C34348q0 c34348q9 = c34348q2;
                    int i7110 = i68;
                    c28655q = c28655q2;
                    AbstractC34323i.m108619a(str, function2, modifierM3404a7, z31113, z35, c23285v0M67368e7, c34351r9, c34348q9, z410, i67, i7110, interfaceC29873g2, null, interfaceC21083i7, c17875c7, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h10), c28655q, (i34 & 64638) | (i719 & 3670016) | (i719 & 29360128) | (i719 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                    c34351r1 = c34351r9;
                    interfaceC29873g1 = interfaceC29873g2;
                    i58 = i7110;
                    i57 = i67;
                    z26 = z410;
                    c34348q1 = c34348q9;
                    c23285v2 = c23285v3;
                    interfaceC4351m6 = interfaceC4351m1111;
                    z25 = z31113;
                    z24 = z35;
                    z19 = z31112;
                    interfaceC17869a2 = interfaceC17869a10;
                    interfaceC4351m7 = interfaceC4351m1110;
                    interfaceC4351m5 = interfaceC4351m119;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z19 = z14;
                    interfaceC29873g1 = interfaceC29873g0;
                    c34348q1 = c34348q0;
                    i57 = i13;
                    i58 = i14;
                    interfaceC17869a2 = interfaceC17869a1;
                    z24 = z17;
                    c23285v2 = c23285v1;
                    interfaceC4351m6 = interfaceC4351m4;
                    z25 = z16;
                    interfaceC4351m7 = interfaceC4351m2;
                    c34351r1 = c34351r0;
                    z26 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                            int iM87244L2 = AbstractC28683x.m87244L(i16);
                            AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i44 = i16 | 6;
            i38 = i44;
            i45 = i38 | 48;
            i46 = i17 & 4096;
            if (i46 != 0) {
                i47 = i38 | 432;
            } else {
                if ((i16 & 384) != 0) {
                    if (c28655q2.m87153g(c34351r0)) {
                        i48 = 256;
                    } else {
                        i48 = 128;
                    }
                    i45 |= i48;
                }
                i47 = i45;
            }
            i49 = i47 | 3072;
            i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i54 != 0) {
                i55 = i47 | 27648;
            } else if ((i16 & 24576) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i24 = 16384;
                }
                i55 = i49 | i24;
            } else {
                i55 = i49;
            }
            if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i56 = i55 | 14155776;
            if ((i16 & 100663296) != 0) {
                if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    i69 = AndroidSDKConstants.FLAG_MUTABLE;
                } else {
                    i69 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i56 |= i69;
            }
            if ((i16 & 805306368) == 0) {
                i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
            }
            if ((i34 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q2.m87135U(i34 & 1, z18)) {
                c28655q2.m87140Z();
                if ((i15 & 1) != 0) {
                    if (i75 != 0) {
                        z16 = true;
                    }
                    if (i19 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                        i34 &= -458753;
                    } else {
                        c23285v3 = c23285v1;
                    }
                    if (i26 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i28 != 0) {
                        interfaceC4351m8 = null;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i35 == 0) {
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i46 != 0) {
                        c34351r2 = C34351r0.f144296e;
                    } else {
                        c34351r2 = c34351r0;
                    }
                    c34348q2 = C34348q0.f144287g;
                    if (i54 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if (z28) {
                        i59 = 1;
                    } else {
                        i59 = Integer.MAX_VALUE;
                    }
                    i64 = i56 & (-458753);
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        C15043i8 c15043i111 = C15043i8.f56313a;
                        interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                        i65 = i56 & (-235339777);
                    } else {
                        i65 = i64;
                        interfaceC17869a1M43126d = interfaceC17869a1;
                    }
                    interfaceC29873g2 = C29871f0.f122092w;
                    boolean z31114 = z17;
                    z29 = z28;
                    z34 = z27;
                    z35 = z31114;
                    i66 = i65;
                    interfaceC4351m9 = interfaceC4351m10;
                    z36 = z16;
                    i67 = i59;
                    interfaceC17869a3 = interfaceC17869a1M43126d;
                    i68 = 1;
                } else {
                    if (i75 != 0) {
                        z16 = true;
                    }
                    if (i19 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                        i34 &= -458753;
                    } else {
                        c23285v3 = c23285v1;
                    }
                    if (i26 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i28 != 0) {
                        interfaceC4351m8 = null;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i35 == 0) {
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i46 != 0) {
                        c34351r2 = C34351r0.f144296e;
                    } else {
                        c34351r2 = c34351r0;
                    }
                    c34348q2 = C34348q0.f144287g;
                    if (i54 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if (z28) {
                        i59 = 1;
                    } else {
                        i59 = Integer.MAX_VALUE;
                    }
                    i64 = i56 & (-458753);
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        C15043i8 c15043i112 = C15043i8.f56313a;
                        interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                        i65 = i56 & (-235339777);
                    } else {
                        i65 = i64;
                        interfaceC17869a1M43126d = interfaceC17869a1;
                    }
                    interfaceC29873g2 = C29871f0.f122092w;
                    boolean z31115 = z17;
                    z29 = z28;
                    z34 = z27;
                    z35 = z31115;
                    i66 = i65;
                    interfaceC4351m9 = interfaceC4351m10;
                    z36 = z16;
                    i67 = i59;
                    interfaceC17869a3 = interfaceC17869a1M43126d;
                    i68 = 1;
                }
                c28655q2.m87175r();
                c28655q2.m87150e0(-245169385);
                objM87133R = c28655q2.m87133R();
                InterfaceC4351m interfaceC4351m1112 = interfaceC4351m9;
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i8 = (InterfaceC21083i) objM87133R;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(961927730);
                jM67366c = c23285v3.m67366c();
                if (jM67366c != 16) {
                    j7 = jM67366c;
                } else {
                    j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                }
                c28655q2.m87173q(false);
                C23285v0 c23285v0M67368e8 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                modifierM3398t = C2314t.f9131w;
                if (interfaceC4351m4 != null) {
                    c28655q2.m87150e0(-244698123);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C14686c(25);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-244312762);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3404a8 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                C17875c1 c17875c8 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                boolean z31116 = z34;
                InterfaceC4351m interfaceC4351m1113 = interfaceC4351m8;
                InterfaceC4351m interfaceC4351m1114 = interfaceC4351m4;
                InterfaceC17869a1 interfaceC17869a11 = interfaceC17869a3;
                C15028h4 c15028h11 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i8, z31116, interfaceC4351m1114, interfaceC4351m1113, interfaceC4351m1112, interfaceC17869a11, c15197y1);
                boolean z31117 = z36;
                C34351r0 c34351r10 = c34351r2;
                boolean z411 = z29;
                int i7111 = i66 << 12;
                C34348q0 c34348q10 = c34348q2;
                int i7112 = i68;
                c28655q = c28655q2;
                AbstractC34323i.m108619a(str, function2, modifierM3404a8, z31117, z35, c23285v0M67368e8, c34351r10, c34348q10, z411, i67, i7112, interfaceC29873g2, null, interfaceC21083i8, c17875c8, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h11), c28655q, (i34 & 64638) | (i7111 & 3670016) | (i7111 & 29360128) | (i7111 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                c34351r1 = c34351r10;
                interfaceC29873g1 = interfaceC29873g2;
                i58 = i7112;
                i57 = i67;
                z26 = z411;
                c34348q1 = c34348q10;
                c23285v2 = c23285v3;
                interfaceC4351m6 = interfaceC4351m1114;
                z25 = z31117;
                z24 = z35;
                z19 = z31116;
                interfaceC17869a2 = interfaceC17869a11;
                interfaceC4351m7 = interfaceC4351m1113;
                interfaceC4351m5 = interfaceC4351m1112;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z19 = z14;
                interfaceC29873g1 = interfaceC29873g0;
                c34348q1 = c34348q0;
                i57 = i13;
                i58 = i14;
                interfaceC17869a2 = interfaceC17869a1;
                z24 = z17;
                c23285v2 = c23285v1;
                interfaceC4351m6 = interfaceC4351m4;
                z25 = z16;
                interfaceC4351m7 = interfaceC4351m2;
                c34351r1 = c34351r0;
                z26 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                        int iM87244L2 = AbstractC28683x.m87244L(i16);
                        AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i18 |= 3072;
        z16 = z4;
        i19 = i17 & 16;
        i24 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i19 != 0) {
            if ((i15 & 24576) == 0) {
                z17 = z13;
                if (c28655q2.m87155h(z17)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i18 |= i25;
            }
            if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                c23285v1 = c23285v0;
                if ((i17 & 32) == 0) {
                    i74 = 65536;
                } else {
                    i74 = 65536;
                }
                i18 |= i74;
            } else {
                c23285v1 = c23285v0;
            }
            i26 = i17 & 64;
            if (i26 != 0) {
                i18 |= 1572864;
                interfaceC4351m4 = interfaceC4351m;
            } else {
                interfaceC4351m4 = interfaceC4351m;
                if ((i15 & 1572864) == 0) {
                    if (c28655q2.m87157i(interfaceC4351m4)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i18 |= i27;
                }
            }
            i28 = i17 & 128;
            if (i28 != 0) {
                i18 |= 12582912;
            } else if ((i15 & 12582912) == 0) {
                if (c28655q2.m87157i(interfaceC4351m2)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i18 |= i29;
            }
            i34 = i18 | 100663296;
            i35 = i17 & 512;
            if (i35 != 0) {
                if ((i15 & 805306368) == 0) {
                    interfaceC4351m5 = interfaceC4351m3;
                    if (c28655q2.m87157i(interfaceC4351m5)) {
                        i36 = 536870912;
                    } else {
                        i36 = 268435456;
                    }
                    i34 |= i36;
                }
                i37 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i37 != 0) {
                    if ((i16 & 6) == 0) {
                        if (c28655q2.m87155h(z14)) {
                            i39 = 4;
                        } else {
                            i39 = 2;
                        }
                        i44 = i16 | i39;
                    } else {
                        i37 = i37;
                        i38 = i16;
                    }
                    i45 = i38 | 48;
                    i46 = i17 & 4096;
                    if (i46 != 0) {
                        i47 = i38 | 432;
                    } else {
                        if ((i16 & 384) != 0) {
                            if (c28655q2.m87153g(c34351r0)) {
                                i48 = 256;
                            } else {
                                i48 = 128;
                            }
                            i45 |= i48;
                        }
                        i47 = i45;
                    }
                    i49 = i47 | 3072;
                    i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                    if (i54 != 0) {
                        i55 = i47 | 27648;
                    } else if ((i16 & 24576) == 0) {
                        if (c28655q2.m87155h(z15)) {
                            i24 = 16384;
                        }
                        i55 = i49 | i24;
                    } else {
                        i55 = i49;
                    }
                    if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i56 = i55 | 14155776;
                    if ((i16 & 100663296) != 0) {
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                            i69 = AndroidSDKConstants.FLAG_MUTABLE;
                        } else {
                            i69 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i56 |= i69;
                    }
                    if ((i16 & 805306368) == 0) {
                        i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
                    }
                    if ((i34 & 306783379) == 306783378) {
                        z18 = true;
                    } else {
                        z18 = true;
                    }
                    if (c28655q2.m87135U(i34 & 1, z18)) {
                        c28655q2.m87140Z();
                        if ((i15 & 1) != 0) {
                            if (i75 != 0) {
                                z16 = true;
                            }
                            if (i19 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                                i34 &= -458753;
                            } else {
                                c23285v3 = c23285v1;
                            }
                            if (i26 != 0) {
                                interfaceC4351m4 = null;
                            }
                            if (i28 != 0) {
                                interfaceC4351m8 = null;
                            } else {
                                interfaceC4351m8 = interfaceC4351m2;
                            }
                            if (i35 == 0) {
                            }
                            if (i37 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if (i46 != 0) {
                                c34351r2 = C34351r0.f144296e;
                            } else {
                                c34351r2 = c34351r0;
                            }
                            c34348q2 = C34348q0.f144287g;
                            if (i54 != 0) {
                                z28 = false;
                            } else {
                                z28 = z15;
                            }
                            if (z28) {
                                i59 = 1;
                            } else {
                                i59 = Integer.MAX_VALUE;
                            }
                            i64 = i56 & (-458753);
                            if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                C15043i8 c15043i113 = C15043i8.f56313a;
                                interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                                i65 = i56 & (-235339777);
                            } else {
                                i65 = i64;
                                interfaceC17869a1M43126d = interfaceC17869a1;
                            }
                            interfaceC29873g2 = C29871f0.f122092w;
                            boolean z31118 = z17;
                            z29 = z28;
                            z34 = z27;
                            z35 = z31118;
                            i66 = i65;
                            interfaceC4351m9 = interfaceC4351m10;
                            z36 = z16;
                            i67 = i59;
                            interfaceC17869a3 = interfaceC17869a1M43126d;
                            i68 = 1;
                        } else {
                            if (i75 != 0) {
                                z16 = true;
                            }
                            if (i19 != 0) {
                                z17 = false;
                            }
                            if ((i17 & 32) != 0) {
                                c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                                i34 &= -458753;
                            } else {
                                c23285v3 = c23285v1;
                            }
                            if (i26 != 0) {
                                interfaceC4351m4 = null;
                            }
                            if (i28 != 0) {
                                interfaceC4351m8 = null;
                            } else {
                                interfaceC4351m8 = interfaceC4351m2;
                            }
                            if (i35 == 0) {
                            }
                            if (i37 != 0) {
                                z27 = false;
                            } else {
                                z27 = z14;
                            }
                            if (i46 != 0) {
                                c34351r2 = C34351r0.f144296e;
                            } else {
                                c34351r2 = c34351r0;
                            }
                            c34348q2 = C34348q0.f144287g;
                            if (i54 != 0) {
                                z28 = false;
                            } else {
                                z28 = z15;
                            }
                            if (z28) {
                                i59 = 1;
                            } else {
                                i59 = Integer.MAX_VALUE;
                            }
                            i64 = i56 & (-458753);
                            if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                                C15043i8 c15043i114 = C15043i8.f56313a;
                                interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                                i65 = i56 & (-235339777);
                            } else {
                                i65 = i64;
                                interfaceC17869a1M43126d = interfaceC17869a1;
                            }
                            interfaceC29873g2 = C29871f0.f122092w;
                            boolean z31119 = z17;
                            z29 = z28;
                            z34 = z27;
                            z35 = z31119;
                            i66 = i65;
                            interfaceC4351m9 = interfaceC4351m10;
                            z36 = z16;
                            i67 = i59;
                            interfaceC17869a3 = interfaceC17869a1M43126d;
                            i68 = 1;
                        }
                        c28655q2.m87175r();
                        c28655q2.m87150e0(-245169385);
                        objM87133R = c28655q2.m87133R();
                        InterfaceC4351m interfaceC4351m1115 = interfaceC4351m9;
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q2);
                        }
                        InterfaceC21083i interfaceC21083i9 = (InterfaceC21083i) objM87133R;
                        c28655q2.m87173q(false);
                        c28655q2.m87150e0(961927730);
                        jM67366c = c23285v3.m67366c();
                        if (jM67366c != 16) {
                            j7 = jM67366c;
                        } else {
                            j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                        }
                        c28655q2.m87173q(false);
                        C23285v0 c23285v0M67368e9 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                        interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                        modifierM3398t = C2314t.f9131w;
                        if (interfaceC4351m4 != null) {
                            c28655q2.m87150e0(-244698123);
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C14686c(25);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(-244312762);
                            c28655q2.m87173q(false);
                        }
                        Modifier modifierM3404a9 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                        C17875c1 c17875c9 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                        boolean z311110 = z34;
                        InterfaceC4351m interfaceC4351m1116 = interfaceC4351m8;
                        InterfaceC4351m interfaceC4351m1117 = interfaceC4351m4;
                        InterfaceC17869a1 interfaceC17869a12 = interfaceC17869a3;
                        C15028h4 c15028h12 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i9, z311110, interfaceC4351m1117, interfaceC4351m1116, interfaceC4351m1115, interfaceC17869a12, c15197y1);
                        boolean z311111 = z36;
                        C34351r0 c34351r11 = c34351r2;
                        boolean z412 = z29;
                        int i7113 = i66 << 12;
                        C34348q0 c34348q11 = c34348q2;
                        int i7114 = i68;
                        c28655q = c28655q2;
                        AbstractC34323i.m108619a(str, function2, modifierM3404a9, z311111, z35, c23285v0M67368e9, c34351r11, c34348q11, z412, i67, i7114, interfaceC29873g2, null, interfaceC21083i9, c17875c9, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h12), c28655q, (i34 & 64638) | (i7113 & 3670016) | (i7113 & 29360128) | (i7113 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                        c34351r1 = c34351r11;
                        interfaceC29873g1 = interfaceC29873g2;
                        i58 = i7114;
                        i57 = i67;
                        z26 = z412;
                        c34348q1 = c34348q11;
                        c23285v2 = c23285v3;
                        interfaceC4351m6 = interfaceC4351m1117;
                        z25 = z311111;
                        z24 = z35;
                        z19 = z311110;
                        interfaceC17869a2 = interfaceC17869a12;
                        interfaceC4351m7 = interfaceC4351m1116;
                        interfaceC4351m5 = interfaceC4351m1115;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        z19 = z14;
                        interfaceC29873g1 = interfaceC29873g0;
                        c34348q1 = c34348q0;
                        i57 = i13;
                        i58 = i14;
                        interfaceC17869a2 = interfaceC17869a1;
                        z24 = z17;
                        c23285v2 = c23285v1;
                        interfaceC4351m6 = interfaceC4351m4;
                        z25 = z16;
                        interfaceC4351m7 = interfaceC4351m2;
                        c34351r1 = c34351r0;
                        z26 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                                int iM87244L2 = AbstractC28683x.m87244L(i16);
                                AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i44 = i16 | 6;
                i38 = i44;
                i45 = i38 | 48;
                i46 = i17 & 4096;
                if (i46 != 0) {
                    i47 = i38 | 432;
                } else {
                    if ((i16 & 384) != 0) {
                        if (c28655q2.m87153g(c34351r0)) {
                            i48 = 256;
                        } else {
                            i48 = 128;
                        }
                        i45 |= i48;
                    }
                    i47 = i45;
                }
                i49 = i47 | 3072;
                i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i54 != 0) {
                    i55 = i47 | 27648;
                } else if ((i16 & 24576) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i24 = 16384;
                    }
                    i55 = i49 | i24;
                } else {
                    i55 = i49;
                }
                if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i56 = i55 | 14155776;
                if ((i16 & 100663296) != 0) {
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        i69 = AndroidSDKConstants.FLAG_MUTABLE;
                    } else {
                        i69 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i56 |= i69;
                }
                if ((i16 & 805306368) == 0) {
                    i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
                }
                if ((i34 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q2.m87135U(i34 & 1, z18)) {
                    c28655q2.m87140Z();
                    if ((i15 & 1) != 0) {
                        if (i75 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                            i34 &= -458753;
                        } else {
                            c23285v3 = c23285v1;
                        }
                        if (i26 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i28 != 0) {
                            interfaceC4351m8 = null;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i35 == 0) {
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i46 != 0) {
                            c34351r2 = C34351r0.f144296e;
                        } else {
                            c34351r2 = c34351r0;
                        }
                        c34348q2 = C34348q0.f144287g;
                        if (i54 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if (z28) {
                            i59 = 1;
                        } else {
                            i59 = Integer.MAX_VALUE;
                        }
                        i64 = i56 & (-458753);
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            C15043i8 c15043i115 = C15043i8.f56313a;
                            interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                            i65 = i56 & (-235339777);
                        } else {
                            i65 = i64;
                            interfaceC17869a1M43126d = interfaceC17869a1;
                        }
                        interfaceC29873g2 = C29871f0.f122092w;
                        boolean z311112 = z17;
                        z29 = z28;
                        z34 = z27;
                        z35 = z311112;
                        i66 = i65;
                        interfaceC4351m9 = interfaceC4351m10;
                        z36 = z16;
                        i67 = i59;
                        interfaceC17869a3 = interfaceC17869a1M43126d;
                        i68 = 1;
                    } else {
                        if (i75 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                            i34 &= -458753;
                        } else {
                            c23285v3 = c23285v1;
                        }
                        if (i26 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i28 != 0) {
                            interfaceC4351m8 = null;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i35 == 0) {
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i46 != 0) {
                            c34351r2 = C34351r0.f144296e;
                        } else {
                            c34351r2 = c34351r0;
                        }
                        c34348q2 = C34348q0.f144287g;
                        if (i54 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if (z28) {
                            i59 = 1;
                        } else {
                            i59 = Integer.MAX_VALUE;
                        }
                        i64 = i56 & (-458753);
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            C15043i8 c15043i116 = C15043i8.f56313a;
                            interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                            i65 = i56 & (-235339777);
                        } else {
                            i65 = i64;
                            interfaceC17869a1M43126d = interfaceC17869a1;
                        }
                        interfaceC29873g2 = C29871f0.f122092w;
                        boolean z311113 = z17;
                        z29 = z28;
                        z34 = z27;
                        z35 = z311113;
                        i66 = i65;
                        interfaceC4351m9 = interfaceC4351m10;
                        z36 = z16;
                        i67 = i59;
                        interfaceC17869a3 = interfaceC17869a1M43126d;
                        i68 = 1;
                    }
                    c28655q2.m87175r();
                    c28655q2.m87150e0(-245169385);
                    objM87133R = c28655q2.m87133R();
                    InterfaceC4351m interfaceC4351m1118 = interfaceC4351m9;
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i10 = (InterfaceC21083i) objM87133R;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(961927730);
                    jM67366c = c23285v3.m67366c();
                    if (jM67366c != 16) {
                        j7 = jM67366c;
                    } else {
                        j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                    }
                    c28655q2.m87173q(false);
                    C23285v0 c23285v0M67368e10 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    modifierM3398t = C2314t.f9131w;
                    if (interfaceC4351m4 != null) {
                        c28655q2.m87150e0(-244698123);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C14686c(25);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-244312762);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3404a10 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                    C17875c1 c17875c10 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                    boolean z311114 = z34;
                    InterfaceC4351m interfaceC4351m1119 = interfaceC4351m8;
                    InterfaceC4351m interfaceC4351m11110 = interfaceC4351m4;
                    InterfaceC17869a1 interfaceC17869a13 = interfaceC17869a3;
                    C15028h4 c15028h13 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i10, z311114, interfaceC4351m11110, interfaceC4351m1119, interfaceC4351m1118, interfaceC17869a13, c15197y1);
                    boolean z311115 = z36;
                    C34351r0 c34351r12 = c34351r2;
                    boolean z413 = z29;
                    int i7115 = i66 << 12;
                    C34348q0 c34348q12 = c34348q2;
                    int i7116 = i68;
                    c28655q = c28655q2;
                    AbstractC34323i.m108619a(str, function2, modifierM3404a10, z311115, z35, c23285v0M67368e10, c34351r12, c34348q12, z413, i67, i7116, interfaceC29873g2, null, interfaceC21083i10, c17875c10, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h13), c28655q, (i34 & 64638) | (i7115 & 3670016) | (i7115 & 29360128) | (i7115 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                    c34351r1 = c34351r12;
                    interfaceC29873g1 = interfaceC29873g2;
                    i58 = i7116;
                    i57 = i67;
                    z26 = z413;
                    c34348q1 = c34348q12;
                    c23285v2 = c23285v3;
                    interfaceC4351m6 = interfaceC4351m11110;
                    z25 = z311115;
                    z24 = z35;
                    z19 = z311114;
                    interfaceC17869a2 = interfaceC17869a13;
                    interfaceC4351m7 = interfaceC4351m1119;
                    interfaceC4351m5 = interfaceC4351m1118;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z19 = z14;
                    interfaceC29873g1 = interfaceC29873g0;
                    c34348q1 = c34348q0;
                    i57 = i13;
                    i58 = i14;
                    interfaceC17869a2 = interfaceC17869a1;
                    z24 = z17;
                    c23285v2 = c23285v1;
                    interfaceC4351m6 = interfaceC4351m4;
                    z25 = z16;
                    interfaceC4351m7 = interfaceC4351m2;
                    c34351r1 = c34351r0;
                    z26 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                            int iM87244L2 = AbstractC28683x.m87244L(i16);
                            AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i34 = i18 | 905969664;
            interfaceC4351m5 = interfaceC4351m3;
            i37 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i37 != 0) {
                if ((i16 & 6) == 0) {
                    if (c28655q2.m87155h(z14)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i44 = i16 | i39;
                } else {
                    i37 = i37;
                    i38 = i16;
                }
                i45 = i38 | 48;
                i46 = i17 & 4096;
                if (i46 != 0) {
                    i47 = i38 | 432;
                } else {
                    if ((i16 & 384) != 0) {
                        if (c28655q2.m87153g(c34351r0)) {
                            i48 = 256;
                        } else {
                            i48 = 128;
                        }
                        i45 |= i48;
                    }
                    i47 = i45;
                }
                i49 = i47 | 3072;
                i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i54 != 0) {
                    i55 = i47 | 27648;
                } else if ((i16 & 24576) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i24 = 16384;
                    }
                    i55 = i49 | i24;
                } else {
                    i55 = i49;
                }
                if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i56 = i55 | 14155776;
                if ((i16 & 100663296) != 0) {
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        i69 = AndroidSDKConstants.FLAG_MUTABLE;
                    } else {
                        i69 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i56 |= i69;
                }
                if ((i16 & 805306368) == 0) {
                    i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
                }
                if ((i34 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q2.m87135U(i34 & 1, z18)) {
                    c28655q2.m87140Z();
                    if ((i15 & 1) != 0) {
                        if (i75 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                            i34 &= -458753;
                        } else {
                            c23285v3 = c23285v1;
                        }
                        if (i26 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i28 != 0) {
                            interfaceC4351m8 = null;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i35 == 0) {
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i46 != 0) {
                            c34351r2 = C34351r0.f144296e;
                        } else {
                            c34351r2 = c34351r0;
                        }
                        c34348q2 = C34348q0.f144287g;
                        if (i54 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if (z28) {
                            i59 = 1;
                        } else {
                            i59 = Integer.MAX_VALUE;
                        }
                        i64 = i56 & (-458753);
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            C15043i8 c15043i117 = C15043i8.f56313a;
                            interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                            i65 = i56 & (-235339777);
                        } else {
                            i65 = i64;
                            interfaceC17869a1M43126d = interfaceC17869a1;
                        }
                        interfaceC29873g2 = C29871f0.f122092w;
                        boolean z311116 = z17;
                        z29 = z28;
                        z34 = z27;
                        z35 = z311116;
                        i66 = i65;
                        interfaceC4351m9 = interfaceC4351m10;
                        z36 = z16;
                        i67 = i59;
                        interfaceC17869a3 = interfaceC17869a1M43126d;
                        i68 = 1;
                    } else {
                        if (i75 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                            i34 &= -458753;
                        } else {
                            c23285v3 = c23285v1;
                        }
                        if (i26 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i28 != 0) {
                            interfaceC4351m8 = null;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i35 == 0) {
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i46 != 0) {
                            c34351r2 = C34351r0.f144296e;
                        } else {
                            c34351r2 = c34351r0;
                        }
                        c34348q2 = C34348q0.f144287g;
                        if (i54 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if (z28) {
                            i59 = 1;
                        } else {
                            i59 = Integer.MAX_VALUE;
                        }
                        i64 = i56 & (-458753);
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            C15043i8 c15043i118 = C15043i8.f56313a;
                            interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                            i65 = i56 & (-235339777);
                        } else {
                            i65 = i64;
                            interfaceC17869a1M43126d = interfaceC17869a1;
                        }
                        interfaceC29873g2 = C29871f0.f122092w;
                        boolean z311117 = z17;
                        z29 = z28;
                        z34 = z27;
                        z35 = z311117;
                        i66 = i65;
                        interfaceC4351m9 = interfaceC4351m10;
                        z36 = z16;
                        i67 = i59;
                        interfaceC17869a3 = interfaceC17869a1M43126d;
                        i68 = 1;
                    }
                    c28655q2.m87175r();
                    c28655q2.m87150e0(-245169385);
                    objM87133R = c28655q2.m87133R();
                    InterfaceC4351m interfaceC4351m11111 = interfaceC4351m9;
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i11 = (InterfaceC21083i) objM87133R;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(961927730);
                    jM67366c = c23285v3.m67366c();
                    if (jM67366c != 16) {
                        j7 = jM67366c;
                    } else {
                        j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                    }
                    c28655q2.m87173q(false);
                    C23285v0 c23285v0M67368e11 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    modifierM3398t = C2314t.f9131w;
                    if (interfaceC4351m4 != null) {
                        c28655q2.m87150e0(-244698123);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C14686c(25);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-244312762);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3404a11 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                    C17875c1 c17875c11 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                    boolean z311118 = z34;
                    InterfaceC4351m interfaceC4351m11112 = interfaceC4351m8;
                    InterfaceC4351m interfaceC4351m11113 = interfaceC4351m4;
                    InterfaceC17869a1 interfaceC17869a14 = interfaceC17869a3;
                    C15028h4 c15028h14 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i11, z311118, interfaceC4351m11113, interfaceC4351m11112, interfaceC4351m11111, interfaceC17869a14, c15197y1);
                    boolean z311119 = z36;
                    C34351r0 c34351r13 = c34351r2;
                    boolean z414 = z29;
                    int i7117 = i66 << 12;
                    C34348q0 c34348q13 = c34348q2;
                    int i7118 = i68;
                    c28655q = c28655q2;
                    AbstractC34323i.m108619a(str, function2, modifierM3404a11, z311119, z35, c23285v0M67368e11, c34351r13, c34348q13, z414, i67, i7118, interfaceC29873g2, null, interfaceC21083i11, c17875c11, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h14), c28655q, (i34 & 64638) | (i7117 & 3670016) | (i7117 & 29360128) | (i7117 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                    c34351r1 = c34351r13;
                    interfaceC29873g1 = interfaceC29873g2;
                    i58 = i7118;
                    i57 = i67;
                    z26 = z414;
                    c34348q1 = c34348q13;
                    c23285v2 = c23285v3;
                    interfaceC4351m6 = interfaceC4351m11113;
                    z25 = z311119;
                    z24 = z35;
                    z19 = z311118;
                    interfaceC17869a2 = interfaceC17869a14;
                    interfaceC4351m7 = interfaceC4351m11112;
                    interfaceC4351m5 = interfaceC4351m11111;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z19 = z14;
                    interfaceC29873g1 = interfaceC29873g0;
                    c34348q1 = c34348q0;
                    i57 = i13;
                    i58 = i14;
                    interfaceC17869a2 = interfaceC17869a1;
                    z24 = z17;
                    c23285v2 = c23285v1;
                    interfaceC4351m6 = interfaceC4351m4;
                    z25 = z16;
                    interfaceC4351m7 = interfaceC4351m2;
                    c34351r1 = c34351r0;
                    z26 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                            int iM87244L2 = AbstractC28683x.m87244L(i16);
                            AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i44 = i16 | 6;
            i38 = i44;
            i45 = i38 | 48;
            i46 = i17 & 4096;
            if (i46 != 0) {
                i47 = i38 | 432;
            } else {
                if ((i16 & 384) != 0) {
                    if (c28655q2.m87153g(c34351r0)) {
                        i48 = 256;
                    } else {
                        i48 = 128;
                    }
                    i45 |= i48;
                }
                i47 = i45;
            }
            i49 = i47 | 3072;
            i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i54 != 0) {
                i55 = i47 | 27648;
            } else if ((i16 & 24576) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i24 = 16384;
                }
                i55 = i49 | i24;
            } else {
                i55 = i49;
            }
            if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i56 = i55 | 14155776;
            if ((i16 & 100663296) != 0) {
                if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    i69 = AndroidSDKConstants.FLAG_MUTABLE;
                } else {
                    i69 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i56 |= i69;
            }
            if ((i16 & 805306368) == 0) {
                i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
            }
            if ((i34 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q2.m87135U(i34 & 1, z18)) {
                c28655q2.m87140Z();
                if ((i15 & 1) != 0) {
                    if (i75 != 0) {
                        z16 = true;
                    }
                    if (i19 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                        i34 &= -458753;
                    } else {
                        c23285v3 = c23285v1;
                    }
                    if (i26 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i28 != 0) {
                        interfaceC4351m8 = null;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i35 == 0) {
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i46 != 0) {
                        c34351r2 = C34351r0.f144296e;
                    } else {
                        c34351r2 = c34351r0;
                    }
                    c34348q2 = C34348q0.f144287g;
                    if (i54 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if (z28) {
                        i59 = 1;
                    } else {
                        i59 = Integer.MAX_VALUE;
                    }
                    i64 = i56 & (-458753);
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        C15043i8 c15043i119 = C15043i8.f56313a;
                        interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                        i65 = i56 & (-235339777);
                    } else {
                        i65 = i64;
                        interfaceC17869a1M43126d = interfaceC17869a1;
                    }
                    interfaceC29873g2 = C29871f0.f122092w;
                    boolean z3111110 = z17;
                    z29 = z28;
                    z34 = z27;
                    z35 = z3111110;
                    i66 = i65;
                    interfaceC4351m9 = interfaceC4351m10;
                    z36 = z16;
                    i67 = i59;
                    interfaceC17869a3 = interfaceC17869a1M43126d;
                    i68 = 1;
                } else {
                    if (i75 != 0) {
                        z16 = true;
                    }
                    if (i19 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                        i34 &= -458753;
                    } else {
                        c23285v3 = c23285v1;
                    }
                    if (i26 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i28 != 0) {
                        interfaceC4351m8 = null;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i35 == 0) {
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i46 != 0) {
                        c34351r2 = C34351r0.f144296e;
                    } else {
                        c34351r2 = c34351r0;
                    }
                    c34348q2 = C34348q0.f144287g;
                    if (i54 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if (z28) {
                        i59 = 1;
                    } else {
                        i59 = Integer.MAX_VALUE;
                    }
                    i64 = i56 & (-458753);
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        C15043i8 c15043i1110 = C15043i8.f56313a;
                        interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                        i65 = i56 & (-235339777);
                    } else {
                        i65 = i64;
                        interfaceC17869a1M43126d = interfaceC17869a1;
                    }
                    interfaceC29873g2 = C29871f0.f122092w;
                    boolean z3111111 = z17;
                    z29 = z28;
                    z34 = z27;
                    z35 = z3111111;
                    i66 = i65;
                    interfaceC4351m9 = interfaceC4351m10;
                    z36 = z16;
                    i67 = i59;
                    interfaceC17869a3 = interfaceC17869a1M43126d;
                    i68 = 1;
                }
                c28655q2.m87175r();
                c28655q2.m87150e0(-245169385);
                objM87133R = c28655q2.m87133R();
                InterfaceC4351m interfaceC4351m11114 = interfaceC4351m9;
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i12 = (InterfaceC21083i) objM87133R;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(961927730);
                jM67366c = c23285v3.m67366c();
                if (jM67366c != 16) {
                    j7 = jM67366c;
                } else {
                    j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                }
                c28655q2.m87173q(false);
                C23285v0 c23285v0M67368e12 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                modifierM3398t = C2314t.f9131w;
                if (interfaceC4351m4 != null) {
                    c28655q2.m87150e0(-244698123);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C14686c(25);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-244312762);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3404a12 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                C17875c1 c17875c12 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                boolean z3111112 = z34;
                InterfaceC4351m interfaceC4351m11115 = interfaceC4351m8;
                InterfaceC4351m interfaceC4351m11116 = interfaceC4351m4;
                InterfaceC17869a1 interfaceC17869a15 = interfaceC17869a3;
                C15028h4 c15028h15 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i12, z3111112, interfaceC4351m11116, interfaceC4351m11115, interfaceC4351m11114, interfaceC17869a15, c15197y1);
                boolean z3111113 = z36;
                C34351r0 c34351r14 = c34351r2;
                boolean z415 = z29;
                int i7119 = i66 << 12;
                C34348q0 c34348q14 = c34348q2;
                int i71110 = i68;
                c28655q = c28655q2;
                AbstractC34323i.m108619a(str, function2, modifierM3404a12, z3111113, z35, c23285v0M67368e12, c34351r14, c34348q14, z415, i67, i71110, interfaceC29873g2, null, interfaceC21083i12, c17875c12, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h15), c28655q, (i34 & 64638) | (i7119 & 3670016) | (i7119 & 29360128) | (i7119 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                c34351r1 = c34351r14;
                interfaceC29873g1 = interfaceC29873g2;
                i58 = i71110;
                i57 = i67;
                z26 = z415;
                c34348q1 = c34348q14;
                c23285v2 = c23285v3;
                interfaceC4351m6 = interfaceC4351m11116;
                z25 = z3111113;
                z24 = z35;
                z19 = z3111112;
                interfaceC17869a2 = interfaceC17869a15;
                interfaceC4351m7 = interfaceC4351m11115;
                interfaceC4351m5 = interfaceC4351m11114;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z19 = z14;
                interfaceC29873g1 = interfaceC29873g0;
                c34348q1 = c34348q0;
                i57 = i13;
                i58 = i14;
                interfaceC17869a2 = interfaceC17869a1;
                z24 = z17;
                c23285v2 = c23285v1;
                interfaceC4351m6 = interfaceC4351m4;
                z25 = z16;
                interfaceC4351m7 = interfaceC4351m2;
                c34351r1 = c34351r0;
                z26 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                        int iM87244L2 = AbstractC28683x.m87244L(i16);
                        AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i18 |= 24576;
        z17 = z13;
        if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            c23285v1 = c23285v0;
            if ((i17 & 32) == 0) {
                i74 = 65536;
            } else {
                i74 = 65536;
            }
            i18 |= i74;
        } else {
            c23285v1 = c23285v0;
        }
        i26 = i17 & 64;
        if (i26 != 0) {
            i18 |= 1572864;
            interfaceC4351m4 = interfaceC4351m;
        } else {
            interfaceC4351m4 = interfaceC4351m;
            if ((i15 & 1572864) == 0) {
                if (c28655q2.m87157i(interfaceC4351m4)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i18 |= i27;
            }
        }
        i28 = i17 & 128;
        if (i28 != 0) {
            i18 |= 12582912;
        } else if ((i15 & 12582912) == 0) {
            if (c28655q2.m87157i(interfaceC4351m2)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i18 |= i29;
        }
        i34 = i18 | 100663296;
        i35 = i17 & 512;
        if (i35 != 0) {
            if ((i15 & 805306368) == 0) {
                interfaceC4351m5 = interfaceC4351m3;
                if (c28655q2.m87157i(interfaceC4351m5)) {
                    i36 = 536870912;
                } else {
                    i36 = 268435456;
                }
                i34 |= i36;
            }
            i37 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i37 != 0) {
                if ((i16 & 6) == 0) {
                    if (c28655q2.m87155h(z14)) {
                        i39 = 4;
                    } else {
                        i39 = 2;
                    }
                    i44 = i16 | i39;
                } else {
                    i37 = i37;
                    i38 = i16;
                }
                i45 = i38 | 48;
                i46 = i17 & 4096;
                if (i46 != 0) {
                    i47 = i38 | 432;
                } else {
                    if ((i16 & 384) != 0) {
                        if (c28655q2.m87153g(c34351r0)) {
                            i48 = 256;
                        } else {
                            i48 = 128;
                        }
                        i45 |= i48;
                    }
                    i47 = i45;
                }
                i49 = i47 | 3072;
                i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i54 != 0) {
                    i55 = i47 | 27648;
                } else if ((i16 & 24576) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i24 = 16384;
                    }
                    i55 = i49 | i24;
                } else {
                    i55 = i49;
                }
                if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i56 = i55 | 14155776;
                if ((i16 & 100663296) != 0) {
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        i69 = AndroidSDKConstants.FLAG_MUTABLE;
                    } else {
                        i69 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i56 |= i69;
                }
                if ((i16 & 805306368) == 0) {
                    i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
                }
                if ((i34 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q2.m87135U(i34 & 1, z18)) {
                    c28655q2.m87140Z();
                    if ((i15 & 1) != 0) {
                        if (i75 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                            i34 &= -458753;
                        } else {
                            c23285v3 = c23285v1;
                        }
                        if (i26 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i28 != 0) {
                            interfaceC4351m8 = null;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i35 == 0) {
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i46 != 0) {
                            c34351r2 = C34351r0.f144296e;
                        } else {
                            c34351r2 = c34351r0;
                        }
                        c34348q2 = C34348q0.f144287g;
                        if (i54 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if (z28) {
                            i59 = 1;
                        } else {
                            i59 = Integer.MAX_VALUE;
                        }
                        i64 = i56 & (-458753);
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            C15043i8 c15043i1111 = C15043i8.f56313a;
                            interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                            i65 = i56 & (-235339777);
                        } else {
                            i65 = i64;
                            interfaceC17869a1M43126d = interfaceC17869a1;
                        }
                        interfaceC29873g2 = C29871f0.f122092w;
                        boolean z3111114 = z17;
                        z29 = z28;
                        z34 = z27;
                        z35 = z3111114;
                        i66 = i65;
                        interfaceC4351m9 = interfaceC4351m10;
                        z36 = z16;
                        i67 = i59;
                        interfaceC17869a3 = interfaceC17869a1M43126d;
                        i68 = 1;
                    } else {
                        if (i75 != 0) {
                            z16 = true;
                        }
                        if (i19 != 0) {
                            z17 = false;
                        }
                        if ((i17 & 32) != 0) {
                            c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                            i34 &= -458753;
                        } else {
                            c23285v3 = c23285v1;
                        }
                        if (i26 != 0) {
                            interfaceC4351m4 = null;
                        }
                        if (i28 != 0) {
                            interfaceC4351m8 = null;
                        } else {
                            interfaceC4351m8 = interfaceC4351m2;
                        }
                        if (i35 == 0) {
                        }
                        if (i37 != 0) {
                            z27 = false;
                        } else {
                            z27 = z14;
                        }
                        if (i46 != 0) {
                            c34351r2 = C34351r0.f144296e;
                        } else {
                            c34351r2 = c34351r0;
                        }
                        c34348q2 = C34348q0.f144287g;
                        if (i54 != 0) {
                            z28 = false;
                        } else {
                            z28 = z15;
                        }
                        if (z28) {
                            i59 = 1;
                        } else {
                            i59 = Integer.MAX_VALUE;
                        }
                        i64 = i56 & (-458753);
                        if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            C15043i8 c15043i1112 = C15043i8.f56313a;
                            interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                            i65 = i56 & (-235339777);
                        } else {
                            i65 = i64;
                            interfaceC17869a1M43126d = interfaceC17869a1;
                        }
                        interfaceC29873g2 = C29871f0.f122092w;
                        boolean z3111115 = z17;
                        z29 = z28;
                        z34 = z27;
                        z35 = z3111115;
                        i66 = i65;
                        interfaceC4351m9 = interfaceC4351m10;
                        z36 = z16;
                        i67 = i59;
                        interfaceC17869a3 = interfaceC17869a1M43126d;
                        i68 = 1;
                    }
                    c28655q2.m87175r();
                    c28655q2.m87150e0(-245169385);
                    objM87133R = c28655q2.m87133R();
                    InterfaceC4351m interfaceC4351m11117 = interfaceC4351m9;
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i13 = (InterfaceC21083i) objM87133R;
                    c28655q2.m87173q(false);
                    c28655q2.m87150e0(961927730);
                    jM67366c = c23285v3.m67366c();
                    if (jM67366c != 16) {
                        j7 = jM67366c;
                    } else {
                        j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                    }
                    c28655q2.m87173q(false);
                    C23285v0 c23285v0M67368e13 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                    interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                    modifierM3398t = C2314t.f9131w;
                    if (interfaceC4351m4 != null) {
                        c28655q2.m87150e0(-244698123);
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C14686c(25);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(-244312762);
                        c28655q2.m87173q(false);
                    }
                    Modifier modifierM3404a13 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                    C17875c1 c17875c13 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                    boolean z3111116 = z34;
                    InterfaceC4351m interfaceC4351m11118 = interfaceC4351m8;
                    InterfaceC4351m interfaceC4351m11119 = interfaceC4351m4;
                    InterfaceC17869a1 interfaceC17869a16 = interfaceC17869a3;
                    C15028h4 c15028h16 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i13, z3111116, interfaceC4351m11119, interfaceC4351m11118, interfaceC4351m11117, interfaceC17869a16, c15197y1);
                    boolean z3111117 = z36;
                    C34351r0 c34351r15 = c34351r2;
                    boolean z416 = z29;
                    int i71111 = i66 << 12;
                    C34348q0 c34348q15 = c34348q2;
                    int i71112 = i68;
                    c28655q = c28655q2;
                    AbstractC34323i.m108619a(str, function2, modifierM3404a13, z3111117, z35, c23285v0M67368e13, c34351r15, c34348q15, z416, i67, i71112, interfaceC29873g2, null, interfaceC21083i13, c17875c13, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h16), c28655q, (i34 & 64638) | (i71111 & 3670016) | (i71111 & 29360128) | (i71111 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                    c34351r1 = c34351r15;
                    interfaceC29873g1 = interfaceC29873g2;
                    i58 = i71112;
                    i57 = i67;
                    z26 = z416;
                    c34348q1 = c34348q15;
                    c23285v2 = c23285v3;
                    interfaceC4351m6 = interfaceC4351m11119;
                    z25 = z3111117;
                    z24 = z35;
                    z19 = z3111116;
                    interfaceC17869a2 = interfaceC17869a16;
                    interfaceC4351m7 = interfaceC4351m11118;
                    interfaceC4351m5 = interfaceC4351m11117;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    z19 = z14;
                    interfaceC29873g1 = interfaceC29873g0;
                    c34348q1 = c34348q0;
                    i57 = i13;
                    i58 = i14;
                    interfaceC17869a2 = interfaceC17869a1;
                    z24 = z17;
                    c23285v2 = c23285v1;
                    interfaceC4351m6 = interfaceC4351m4;
                    z25 = z16;
                    interfaceC4351m7 = interfaceC4351m2;
                    c34351r1 = c34351r0;
                    z26 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                            int iM87244L2 = AbstractC28683x.m87244L(i16);
                            AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i44 = i16 | 6;
            i38 = i44;
            i45 = i38 | 48;
            i46 = i17 & 4096;
            if (i46 != 0) {
                i47 = i38 | 432;
            } else {
                if ((i16 & 384) != 0) {
                    if (c28655q2.m87153g(c34351r0)) {
                        i48 = 256;
                    } else {
                        i48 = 128;
                    }
                    i45 |= i48;
                }
                i47 = i45;
            }
            i49 = i47 | 3072;
            i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i54 != 0) {
                i55 = i47 | 27648;
            } else if ((i16 & 24576) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i24 = 16384;
                }
                i55 = i49 | i24;
            } else {
                i55 = i49;
            }
            if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i56 = i55 | 14155776;
            if ((i16 & 100663296) != 0) {
                if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    i69 = AndroidSDKConstants.FLAG_MUTABLE;
                } else {
                    i69 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i56 |= i69;
            }
            if ((i16 & 805306368) == 0) {
                i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
            }
            if ((i34 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q2.m87135U(i34 & 1, z18)) {
                c28655q2.m87140Z();
                if ((i15 & 1) != 0) {
                    if (i75 != 0) {
                        z16 = true;
                    }
                    if (i19 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                        i34 &= -458753;
                    } else {
                        c23285v3 = c23285v1;
                    }
                    if (i26 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i28 != 0) {
                        interfaceC4351m8 = null;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i35 == 0) {
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i46 != 0) {
                        c34351r2 = C34351r0.f144296e;
                    } else {
                        c34351r2 = c34351r0;
                    }
                    c34348q2 = C34348q0.f144287g;
                    if (i54 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if (z28) {
                        i59 = 1;
                    } else {
                        i59 = Integer.MAX_VALUE;
                    }
                    i64 = i56 & (-458753);
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        C15043i8 c15043i1113 = C15043i8.f56313a;
                        interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                        i65 = i56 & (-235339777);
                    } else {
                        i65 = i64;
                        interfaceC17869a1M43126d = interfaceC17869a1;
                    }
                    interfaceC29873g2 = C29871f0.f122092w;
                    boolean z3111118 = z17;
                    z29 = z28;
                    z34 = z27;
                    z35 = z3111118;
                    i66 = i65;
                    interfaceC4351m9 = interfaceC4351m10;
                    z36 = z16;
                    i67 = i59;
                    interfaceC17869a3 = interfaceC17869a1M43126d;
                    i68 = 1;
                } else {
                    if (i75 != 0) {
                        z16 = true;
                    }
                    if (i19 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                        i34 &= -458753;
                    } else {
                        c23285v3 = c23285v1;
                    }
                    if (i26 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i28 != 0) {
                        interfaceC4351m8 = null;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i35 == 0) {
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i46 != 0) {
                        c34351r2 = C34351r0.f144296e;
                    } else {
                        c34351r2 = c34351r0;
                    }
                    c34348q2 = C34348q0.f144287g;
                    if (i54 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if (z28) {
                        i59 = 1;
                    } else {
                        i59 = Integer.MAX_VALUE;
                    }
                    i64 = i56 & (-458753);
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        C15043i8 c15043i1114 = C15043i8.f56313a;
                        interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                        i65 = i56 & (-235339777);
                    } else {
                        i65 = i64;
                        interfaceC17869a1M43126d = interfaceC17869a1;
                    }
                    interfaceC29873g2 = C29871f0.f122092w;
                    boolean z3111119 = z17;
                    z29 = z28;
                    z34 = z27;
                    z35 = z3111119;
                    i66 = i65;
                    interfaceC4351m9 = interfaceC4351m10;
                    z36 = z16;
                    i67 = i59;
                    interfaceC17869a3 = interfaceC17869a1M43126d;
                    i68 = 1;
                }
                c28655q2.m87175r();
                c28655q2.m87150e0(-245169385);
                objM87133R = c28655q2.m87133R();
                InterfaceC4351m interfaceC4351m111110 = interfaceC4351m9;
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i14 = (InterfaceC21083i) objM87133R;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(961927730);
                jM67366c = c23285v3.m67366c();
                if (jM67366c != 16) {
                    j7 = jM67366c;
                } else {
                    j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                }
                c28655q2.m87173q(false);
                C23285v0 c23285v0M67368e14 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                modifierM3398t = C2314t.f9131w;
                if (interfaceC4351m4 != null) {
                    c28655q2.m87150e0(-244698123);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C14686c(25);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-244312762);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3404a14 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                C17875c1 c17875c14 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                boolean z31111110 = z34;
                InterfaceC4351m interfaceC4351m111111 = interfaceC4351m8;
                InterfaceC4351m interfaceC4351m111112 = interfaceC4351m4;
                InterfaceC17869a1 interfaceC17869a17 = interfaceC17869a3;
                C15028h4 c15028h17 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i14, z31111110, interfaceC4351m111112, interfaceC4351m111111, interfaceC4351m111110, interfaceC17869a17, c15197y1);
                boolean z31111111 = z36;
                C34351r0 c34351r16 = c34351r2;
                boolean z417 = z29;
                int i71113 = i66 << 12;
                C34348q0 c34348q16 = c34348q2;
                int i71114 = i68;
                c28655q = c28655q2;
                AbstractC34323i.m108619a(str, function2, modifierM3404a14, z31111111, z35, c23285v0M67368e14, c34351r16, c34348q16, z417, i67, i71114, interfaceC29873g2, null, interfaceC21083i14, c17875c14, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h17), c28655q, (i34 & 64638) | (i71113 & 3670016) | (i71113 & 29360128) | (i71113 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                c34351r1 = c34351r16;
                interfaceC29873g1 = interfaceC29873g2;
                i58 = i71114;
                i57 = i67;
                z26 = z417;
                c34348q1 = c34348q16;
                c23285v2 = c23285v3;
                interfaceC4351m6 = interfaceC4351m111112;
                z25 = z31111111;
                z24 = z35;
                z19 = z31111110;
                interfaceC17869a2 = interfaceC17869a17;
                interfaceC4351m7 = interfaceC4351m111111;
                interfaceC4351m5 = interfaceC4351m111110;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z19 = z14;
                interfaceC29873g1 = interfaceC29873g0;
                c34348q1 = c34348q0;
                i57 = i13;
                i58 = i14;
                interfaceC17869a2 = interfaceC17869a1;
                z24 = z17;
                c23285v2 = c23285v1;
                interfaceC4351m6 = interfaceC4351m4;
                z25 = z16;
                interfaceC4351m7 = interfaceC4351m2;
                c34351r1 = c34351r0;
                z26 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                        int iM87244L2 = AbstractC28683x.m87244L(i16);
                        AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i34 = i18 | 905969664;
        interfaceC4351m5 = interfaceC4351m3;
        i37 = i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i37 != 0) {
            if ((i16 & 6) == 0) {
                if (c28655q2.m87155h(z14)) {
                    i39 = 4;
                } else {
                    i39 = 2;
                }
                i44 = i16 | i39;
            } else {
                i37 = i37;
                i38 = i16;
            }
            i45 = i38 | 48;
            i46 = i17 & 4096;
            if (i46 != 0) {
                i47 = i38 | 432;
            } else {
                if ((i16 & 384) != 0) {
                    if (c28655q2.m87153g(c34351r0)) {
                        i48 = 256;
                    } else {
                        i48 = 128;
                    }
                    i45 |= i48;
                }
                i47 = i45;
            }
            i49 = i47 | 3072;
            i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i54 != 0) {
                i55 = i47 | 27648;
            } else if ((i16 & 24576) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i24 = 16384;
                }
                i55 = i49 | i24;
            } else {
                i55 = i49;
            }
            if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i56 = i55 | 14155776;
            if ((i16 & 100663296) != 0) {
                if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    i69 = AndroidSDKConstants.FLAG_MUTABLE;
                } else {
                    i69 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i56 |= i69;
            }
            if ((i16 & 805306368) == 0) {
                i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
            }
            if ((i34 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q2.m87135U(i34 & 1, z18)) {
                c28655q2.m87140Z();
                if ((i15 & 1) != 0) {
                    if (i75 != 0) {
                        z16 = true;
                    }
                    if (i19 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                        i34 &= -458753;
                    } else {
                        c23285v3 = c23285v1;
                    }
                    if (i26 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i28 != 0) {
                        interfaceC4351m8 = null;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i35 == 0) {
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i46 != 0) {
                        c34351r2 = C34351r0.f144296e;
                    } else {
                        c34351r2 = c34351r0;
                    }
                    c34348q2 = C34348q0.f144287g;
                    if (i54 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if (z28) {
                        i59 = 1;
                    } else {
                        i59 = Integer.MAX_VALUE;
                    }
                    i64 = i56 & (-458753);
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        C15043i8 c15043i1115 = C15043i8.f56313a;
                        interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                        i65 = i56 & (-235339777);
                    } else {
                        i65 = i64;
                        interfaceC17869a1M43126d = interfaceC17869a1;
                    }
                    interfaceC29873g2 = C29871f0.f122092w;
                    boolean z31111112 = z17;
                    z29 = z28;
                    z34 = z27;
                    z35 = z31111112;
                    i66 = i65;
                    interfaceC4351m9 = interfaceC4351m10;
                    z36 = z16;
                    i67 = i59;
                    interfaceC17869a3 = interfaceC17869a1M43126d;
                    i68 = 1;
                } else {
                    if (i75 != 0) {
                        z16 = true;
                    }
                    if (i19 != 0) {
                        z17 = false;
                    }
                    if ((i17 & 32) != 0) {
                        c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                        i34 &= -458753;
                    } else {
                        c23285v3 = c23285v1;
                    }
                    if (i26 != 0) {
                        interfaceC4351m4 = null;
                    }
                    if (i28 != 0) {
                        interfaceC4351m8 = null;
                    } else {
                        interfaceC4351m8 = interfaceC4351m2;
                    }
                    if (i35 == 0) {
                    }
                    if (i37 != 0) {
                        z27 = false;
                    } else {
                        z27 = z14;
                    }
                    if (i46 != 0) {
                        c34351r2 = C34351r0.f144296e;
                    } else {
                        c34351r2 = c34351r0;
                    }
                    c34348q2 = C34348q0.f144287g;
                    if (i54 != 0) {
                        z28 = false;
                    } else {
                        z28 = z15;
                    }
                    if (z28) {
                        i59 = 1;
                    } else {
                        i59 = Integer.MAX_VALUE;
                    }
                    i64 = i56 & (-458753);
                    if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        C15043i8 c15043i1116 = C15043i8.f56313a;
                        interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                        i65 = i56 & (-235339777);
                    } else {
                        i65 = i64;
                        interfaceC17869a1M43126d = interfaceC17869a1;
                    }
                    interfaceC29873g2 = C29871f0.f122092w;
                    boolean z31111113 = z17;
                    z29 = z28;
                    z34 = z27;
                    z35 = z31111113;
                    i66 = i65;
                    interfaceC4351m9 = interfaceC4351m10;
                    z36 = z16;
                    i67 = i59;
                    interfaceC17869a3 = interfaceC17869a1M43126d;
                    i68 = 1;
                }
                c28655q2.m87175r();
                c28655q2.m87150e0(-245169385);
                objM87133R = c28655q2.m87133R();
                InterfaceC4351m interfaceC4351m111113 = interfaceC4351m9;
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i15 = (InterfaceC21083i) objM87133R;
                c28655q2.m87173q(false);
                c28655q2.m87150e0(961927730);
                jM67366c = c23285v3.m67366c();
                if (jM67366c != 16) {
                    j7 = jM67366c;
                } else {
                    j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
                }
                c28655q2.m87173q(false);
                C23285v0 c23285v0M67368e15 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                modifierM3398t = C2314t.f9131w;
                if (interfaceC4351m4 != null) {
                    c28655q2.m87150e0(-244698123);
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C14686c(25);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-244312762);
                    c28655q2.m87173q(false);
                }
                Modifier modifierM3404a15 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
                C17875c1 c17875c15 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
                boolean z31111114 = z34;
                InterfaceC4351m interfaceC4351m111114 = interfaceC4351m8;
                InterfaceC4351m interfaceC4351m111115 = interfaceC4351m4;
                InterfaceC17869a1 interfaceC17869a18 = interfaceC17869a3;
                C15028h4 c15028h18 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i15, z31111114, interfaceC4351m111115, interfaceC4351m111114, interfaceC4351m111113, interfaceC17869a18, c15197y1);
                boolean z31111115 = z36;
                C34351r0 c34351r17 = c34351r2;
                boolean z418 = z29;
                int i71115 = i66 << 12;
                C34348q0 c34348q17 = c34348q2;
                int i71116 = i68;
                c28655q = c28655q2;
                AbstractC34323i.m108619a(str, function2, modifierM3404a15, z31111115, z35, c23285v0M67368e15, c34351r17, c34348q17, z418, i67, i71116, interfaceC29873g2, null, interfaceC21083i15, c17875c15, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h18), c28655q, (i34 & 64638) | (i71115 & 3670016) | (i71115 & 29360128) | (i71115 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
                c34351r1 = c34351r17;
                interfaceC29873g1 = interfaceC29873g2;
                i58 = i71116;
                i57 = i67;
                z26 = z418;
                c34348q1 = c34348q17;
                c23285v2 = c23285v3;
                interfaceC4351m6 = interfaceC4351m111115;
                z25 = z31111115;
                z24 = z35;
                z19 = z31111114;
                interfaceC17869a2 = interfaceC17869a18;
                interfaceC4351m7 = interfaceC4351m111114;
                interfaceC4351m5 = interfaceC4351m111113;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                z19 = z14;
                interfaceC29873g1 = interfaceC29873g0;
                c34348q1 = c34348q0;
                i57 = i13;
                i58 = i14;
                interfaceC17869a2 = interfaceC17869a1;
                z24 = z17;
                c23285v2 = c23285v1;
                interfaceC4351m6 = interfaceC4351m4;
                z25 = z16;
                interfaceC4351m7 = interfaceC4351m2;
                c34351r1 = c34351r0;
                z26 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                        int iM87244L2 = AbstractC28683x.m87244L(i16);
                        AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i44 = i16 | 6;
        i38 = i44;
        i45 = i38 | 48;
        i46 = i17 & 4096;
        if (i46 != 0) {
            i47 = i38 | 432;
        } else {
            if ((i16 & 384) != 0) {
                if (c28655q2.m87153g(c34351r0)) {
                    i48 = 256;
                } else {
                    i48 = 128;
                }
                i45 |= i48;
            }
            i47 = i45;
        }
        i49 = i47 | 3072;
        i54 = i17 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i54 != 0) {
            i55 = i47 | 27648;
        } else if ((i16 & 24576) == 0) {
            if (c28655q2.m87155h(z15)) {
                i24 = 16384;
            }
            i55 = i49 | i24;
        } else {
            i55 = i49;
        }
        if ((i16 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i55 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        i56 = i55 | 14155776;
        if ((i16 & 100663296) != 0) {
            if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                i69 = AndroidSDKConstants.FLAG_MUTABLE;
            } else {
                i69 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i56 |= i69;
        }
        if ((i16 & 805306368) == 0) {
            i56 |= c28655q2.m87153g(c15197y1) ? 536870912 : 268435456;
        }
        if ((i34 & 306783379) == 306783378) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (c28655q2.m87135U(i34 & 1, z18)) {
            c28655q2.m87140Z();
            if ((i15 & 1) != 0) {
                if (i75 != 0) {
                    z16 = true;
                }
                if (i19 != 0) {
                    z17 = false;
                }
                if ((i17 & 32) != 0) {
                    c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                    i34 &= -458753;
                } else {
                    c23285v3 = c23285v1;
                }
                if (i26 != 0) {
                    interfaceC4351m4 = null;
                }
                if (i28 != 0) {
                    interfaceC4351m8 = null;
                } else {
                    interfaceC4351m8 = interfaceC4351m2;
                }
                if (i35 == 0) {
                }
                if (i37 != 0) {
                    z27 = false;
                } else {
                    z27 = z14;
                }
                if (i46 != 0) {
                    c34351r2 = C34351r0.f144296e;
                } else {
                    c34351r2 = c34351r0;
                }
                c34348q2 = C34348q0.f144287g;
                if (i54 != 0) {
                    z28 = false;
                } else {
                    z28 = z15;
                }
                if (z28) {
                    i59 = 1;
                } else {
                    i59 = Integer.MAX_VALUE;
                }
                i64 = i56 & (-458753);
                if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                    C15043i8 c15043i1117 = C15043i8.f56313a;
                    interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                    i65 = i56 & (-235339777);
                } else {
                    i65 = i64;
                    interfaceC17869a1M43126d = interfaceC17869a1;
                }
                interfaceC29873g2 = C29871f0.f122092w;
                boolean z31111116 = z17;
                z29 = z28;
                z34 = z27;
                z35 = z31111116;
                i66 = i65;
                interfaceC4351m9 = interfaceC4351m10;
                z36 = z16;
                i67 = i59;
                interfaceC17869a3 = interfaceC17869a1M43126d;
                i68 = 1;
            } else {
                if (i75 != 0) {
                    z16 = true;
                }
                if (i19 != 0) {
                    z17 = false;
                }
                if ((i17 & 32) != 0) {
                    c23285v3 = (C23285v0) c28655q2.m87161k(AbstractC15011f9.f56166a);
                    i34 &= -458753;
                } else {
                    c23285v3 = c23285v1;
                }
                if (i26 != 0) {
                    interfaceC4351m4 = null;
                }
                if (i28 != 0) {
                    interfaceC4351m8 = null;
                } else {
                    interfaceC4351m8 = interfaceC4351m2;
                }
                if (i35 == 0) {
                }
                if (i37 != 0) {
                    z27 = false;
                } else {
                    z27 = z14;
                }
                if (i46 != 0) {
                    c34351r2 = C34351r0.f144296e;
                } else {
                    c34351r2 = c34351r0;
                }
                c34348q2 = C34348q0.f144287g;
                if (i54 != 0) {
                    z28 = false;
                } else {
                    z28 = z15;
                }
                if (z28) {
                    i59 = 1;
                } else {
                    i59 = Integer.MAX_VALUE;
                }
                i64 = i56 & (-458753);
                if ((i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                    C15043i8 c15043i1118 = C15043i8.f56313a;
                    interfaceC17869a1M43126d = C15043i8.m43126d(c28655q2);
                    i65 = i56 & (-235339777);
                } else {
                    i65 = i64;
                    interfaceC17869a1M43126d = interfaceC17869a1;
                }
                interfaceC29873g2 = C29871f0.f122092w;
                boolean z31111117 = z17;
                z29 = z28;
                z34 = z27;
                z35 = z31111117;
                i66 = i65;
                interfaceC4351m9 = interfaceC4351m10;
                z36 = z16;
                i67 = i59;
                interfaceC17869a3 = interfaceC17869a1M43126d;
                i68 = 1;
            }
            c28655q2.m87175r();
            c28655q2.m87150e0(-245169385);
            objM87133R = c28655q2.m87133R();
            InterfaceC4351m interfaceC4351m111116 = interfaceC4351m9;
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i16 = (InterfaceC21083i) objM87133R;
            c28655q2.m87173q(false);
            c28655q2.m87150e0(961927730);
            jM67366c = c23285v3.m67366c();
            if (jM67366c != 16) {
                j7 = jM67366c;
            } else {
                j7 = ((C17919x) c15197y1.m43218e(z36, c28655q2).getValue()).f69639a;
            }
            c28655q2.m87173q(false);
            C23285v0 c23285v0M67368e16 = c23285v3.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
            interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            modifierM3398t = C2314t.f9131w;
            if (interfaceC4351m4 != null) {
                c28655q2.m87150e0(-244698123);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C14686c(25);
                    c28655q2.m87172p0(objM87133R2);
                }
                modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R2), 0.0f, interfaceC39171c.mo738l(f56343b), 0.0f, 0.0f, 13);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-244312762);
                c28655q2.m87173q(false);
            }
            Modifier modifierM3404a16 = AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(modifierM3398t), z34, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b);
            C17875c1 c17875c16 = new C17875c1(((C17919x) c15197y1.m43215b(z34, c28655q2).getValue()).f69639a);
            boolean z31111118 = z34;
            InterfaceC4351m interfaceC4351m111117 = interfaceC4351m8;
            InterfaceC4351m interfaceC4351m111118 = interfaceC4351m4;
            InterfaceC17869a1 interfaceC17869a19 = interfaceC17869a3;
            C15028h4 c15028h19 = new C15028h4(str, z36, z29, interfaceC29873g2, interfaceC21083i16, z31111118, interfaceC4351m111118, interfaceC4351m111117, interfaceC4351m111116, interfaceC17869a19, c15197y1);
            boolean z31111119 = z36;
            C34351r0 c34351r18 = c34351r2;
            boolean z419 = z29;
            int i71117 = i66 << 12;
            C34348q0 c34348q18 = c34348q2;
            int i71118 = i68;
            c28655q = c28655q2;
            AbstractC34323i.m108619a(str, function2, modifierM3404a16, z31111119, z35, c23285v0M67368e16, c34351r18, c34348q18, z419, i67, i71118, interfaceC29873g2, null, interfaceC21083i16, c17875c16, AbstractC37817c.m121344e(-591103097, c28655q2, c15028h19), c28655q, (i34 & 64638) | (i71117 & 3670016) | (i71117 & 29360128) | (i71117 & 234881024), ((i66 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | (i66 & 112), 4096);
            c34351r1 = c34351r18;
            interfaceC29873g1 = interfaceC29873g2;
            i58 = i71118;
            i57 = i67;
            z26 = z419;
            c34348q1 = c34348q18;
            c23285v2 = c23285v3;
            interfaceC4351m6 = interfaceC4351m111118;
            z25 = z31111119;
            z24 = z35;
            z19 = z31111118;
            interfaceC17869a2 = interfaceC17869a19;
            interfaceC4351m7 = interfaceC4351m111117;
            interfaceC4351m5 = interfaceC4351m111116;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z19 = z14;
            interfaceC29873g1 = interfaceC29873g0;
            c34348q1 = c34348q0;
            i57 = i13;
            i58 = i14;
            interfaceC17869a2 = interfaceC17869a1;
            z24 = z17;
            c23285v2 = c23285v1;
            interfaceC4351m6 = interfaceC4351m4;
            z25 = z16;
            interfaceC4351m7 = interfaceC4351m2;
            c34351r1 = c34351r0;
            z26 = z15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c4
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i15 | 1);
                    int iM87244L2 = AbstractC28683x.m87244L(i16);
                    AbstractC15050j4.m43135a(str, function1, modifier, z25, z24, c23285v2, interfaceC4351m6, interfaceC4351m7, interfaceC4351m5, z19, interfaceC29873g1, c34351r1, c34348q1, z26, i57, i58, interfaceC17869a2, c15197y1, (Composer) obj, iM87244L, iM87244L2, i17);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43136b(C29891y c29891y, Function1 function1, Modifier modifier, boolean z4, C23285v0 c23285v0, InterfaceC4351m interfaceC4351m, InterfaceC29873g0 interfaceC29873g0, C34351r0 c34351r0, C34348q0 c34348q0, int i13, int i14, InterfaceC17869a1 interfaceC17869a1, InterfaceC14999e8 interfaceC14999e8, Composer composer, int i15) {
        C28655q c28655q;
        boolean z13;
        InterfaceC29873g0 interfaceC29873g1;
        InterfaceC17869a1 interfaceC17869a2;
        InterfaceC14999e8 interfaceC14999e9;
        boolean z14;
        InterfaceC14999e8 interfaceC14999e8M43129g;
        C28655q c28655q2;
        InterfaceC29873g0 interfaceC29873g2;
        int i16;
        boolean z15;
        InterfaceC17869a1 interfaceC17869a3;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-365650761);
        int i17 = i15 | (c28655q3.m87153g(c29891y) ? 4 : 2) | (c28655q3.m87157i(function1) ? 32 : 16) | (c28655q3.m87153g(modifier) ? 256 : 128) | 27648 | (c28655q3.m87153g(c23285v0) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) | 1572864 | (c28655q3.m87157i(interfaceC4351m) ? 8388608 : 4194304) | 905969664;
        int i18 = (c28655q3.m87153g(c34348q0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | 316367286;
        if (c28655q3.m87135U(i17 & 1, ((i17 & 306783379) == 306783378 && (i18 & 306783379) == 306783378) ? false : true)) {
            c28655q3.m87140Z();
            if ((i15 & 1) == 0 || c28655q3.m87118C()) {
                C15043i8 c15043i8 = C15043i8.f56313a;
                AbstractC33244a abstractC33244aM43126d = C15043i8.m43126d(c28655q3);
                z14 = false;
                interfaceC14999e8M43129g = C15043i8.m43129g(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c28655q3, 2097151);
                c28655q2 = c28655q3;
                interfaceC29873g2 = C29871f0.f122092w;
                i16 = i18 & (-2113929217);
                z15 = true;
                interfaceC17869a3 = abstractC33244aM43126d;
            } else {
                c28655q3.m87138X();
                interfaceC29873g2 = interfaceC29873g0;
                interfaceC17869a3 = interfaceC17869a1;
                interfaceC14999e8M43129g = interfaceC14999e8;
                c28655q2 = c28655q3;
                i16 = i18 & (-2113929217);
                z14 = false;
                z15 = z4;
            }
            c28655q2.m87175r();
            c28655q2.m87150e0(-1063693660);
            Object objM87133R = c28655q2.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            c28655q2.m87173q(z14);
            c28655q2.m87150e0(796976389);
            long jM67366c = c23285v0.m67366c();
            if (jM67366c == 16) {
                jM67366c = ((C17919x) ((C15197y1) interfaceC14999e8M43129g).m43218e(z15, c28655q2).getValue()).f69639a;
            }
            long j7 = jM67366c;
            c28655q2.m87173q(z14);
            C23285v0 c23285v0M67368e = c23285v0.m67368e(new C23285v0(j7, 0L, null, null, null, 0L, null, null, 0, 0L, 16777214));
            c28655q2.m87150e0(-1062837037);
            c28655q2.m87173q(z14);
            C15197y1 c15197y1 = (C15197y1) interfaceC14999e8M43129g;
            c28655q = c28655q2;
            boolean z16 = z15;
            AbstractC34323i.m108620b(c29891y, function1, AbstractC1102d.m3404a(AbstractC15114p8.m43176c(modifier.mo3471e(C2314t.f9131w), z14, AbstractC32417h.m101177H(c28655q2, 3)), C15043i8.f56315c, C15043i8.f56314b), z16, false, c23285v0M67368e, c34351r0, c34348q0, false, i13, i14, interfaceC29873g2, null, interfaceC21083i, new C17875c1(((C17919x) c15197y1.m43215b(z14, c28655q2).getValue()).f69639a), AbstractC37817c.m121344e(-1881867558, c28655q2, new C15017g4(c29891y, z15, interfaceC29873g2, interfaceC21083i, interfaceC4351m, interfaceC17869a3, c15197y1)), c28655q, (64638 & i17) | 1572864 | ((i16 << 12) & 29360128) | 905969664, 196662, 4096);
            interfaceC14999e9 = c15197y1;
            z13 = z16;
            interfaceC29873g1 = interfaceC29873g2;
            interfaceC17869a2 = interfaceC17869a3;
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
            z13 = z4;
            interfaceC29873g1 = interfaceC29873g0;
            interfaceC17869a2 = interfaceC17869a1;
            interfaceC14999e9 = interfaceC14999e8;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14962b4(c29891y, function1, modifier, z13, c23285v0, interfaceC4351m, interfaceC29873g1, c34351r0, c34348q0, i13, i14, interfaceC17869a2, interfaceC14999e9, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v22, types: [int] */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, kotlin.jvm.functions.Function3] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.lang.Object, x1.b] */
    /* JADX INFO: renamed from: c */
    public static final void m43137c(final Modifier modifier, InterfaceC4351m interfaceC4351m, final Function3 function3, InterfaceC4351m interfaceC4351m2, final InterfaceC4351m interfaceC4351m3, final InterfaceC4351m interfaceC4351m4, final boolean z4, final float f13, final Function1 function1, final C37816b c37816b, InterfaceC22973k1 interfaceC22973k1, Composer composer, final int i13) {
        int i14;
        InterfaceC4351m interfaceC4351m5;
        EnumC39181m enumC39181m;
        boolean z13;
        ?? r15;
        boolean z14;
        final InterfaceC4351m interfaceC4351m6 = interfaceC4351m2;
        final InterfaceC22973k1 interfaceC22973k2 = interfaceC22973k1;
        C2307m c2307m = C2299e.f9102E;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(36320288);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function3) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m6) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87155h(z4) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i14 |= c28655q.m87147d(f13) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i14 |= c28655q.m87157i(function1) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 536870912 : 268435456;
        }
        int i15 = i14;
        char c3 = c28655q.m87153g(interfaceC22973k2) ? (char) 4 : (char) 2;
        if (c28655q.m87135U(i15 & 1, ((i14 & 306783379) == 306783378 && (c3 & 3) == 2) ? false : true)) {
            boolean z15 = ((i15 & 234881024) == 67108864) | ((i15 & 3670016) == 1048576) | ((i15 & 29360128) == 8388608) | ((c3 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            if (z15 || objM87133R == C28635l.f115821a) {
                objM87133R = new C15070l4(function1, z4, f13, interfaceC22973k2);
                c28655q.m87172p0(objM87133R);
            }
            C15070l4 c15070l4 = (C15070l4) objM87133R;
            EnumC39181m enumC39181m2 = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c15070l4);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            c37816b.invoke(c28655q, Integer.valueOf((i15 >> 27) & 14));
            C2314t c2314t = C2314t.f9131w;
            if (interfaceC4351m3 != null) {
                c28655q.m87150e0(1336978507);
                Modifier modifierM3499c = AbstractC1131a.m3499c(c2314t, "Leading");
                C28674u2 c28674u2 = AbstractC15027h3.f56241a;
                Modifier modifierMo3471e = modifierM3499c.mo3471e(MinimumInteractiveModifier.f4718w);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                c28655q.m87158i0();
                enumC39181m = enumC39181m2;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                z13 = false;
                AbstractC11895b.m31978A((i15 >> 12) & 14, interfaceC4351m3, c28655q, true, false);
            } else {
                enumC39181m = enumC39181m2;
                z13 = false;
                c28655q.m87150e0(1337224523);
                c28655q.m87173q(false);
            }
            if (interfaceC4351m4 != null) {
                c28655q.m87150e0(1337267241);
                Modifier modifierM3499c2 = AbstractC1131a.m3499c(c2314t, "Trailing");
                C28674u2 c28674u3 = AbstractC15027h3.f56241a;
                Modifier modifierMo3471e2 = modifierM3499c2.mo3471e(MinimumInteractiveModifier.f4718w);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, z13);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                r15 = 0;
                AbstractC11895b.m31978A((i15 >> 15) & 14, interfaceC4351m4, c28655q, true, false);
            } else {
                c28655q.m87150e0(1337515179);
                c28655q.m87173q(z13);
                r15 = z13;
            }
            interfaceC22973k2 = interfaceC22973k1;
            EnumC39181m enumC39181m3 = enumC39181m;
            float fM3387i = AbstractC1099a.m3387i(interfaceC22973k2, enumC39181m3);
            float fM3386h = AbstractC1099a.m3386h(interfaceC22973k2, enumC39181m3);
            if (interfaceC4351m3 != null) {
                fM3387i -= AbstractC15114p8.f56625b;
                float f14 = (float) r15;
                if (fM3387i < f14) {
                    fM3387i = f14;
                }
            }
            float f15 = fM3387i;
            if (interfaceC4351m4 != null) {
                fM3386h -= AbstractC15114p8.f56625b;
                float f16 = (float) r15;
                if (fM3386h < f16) {
                    fM3386h = f16;
                }
            }
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f15, 0.0f, fM3386h, 0.0f, 10);
            if (function3 != 0) {
                c28655q.m87150e0(1338367152);
                function3.invoke(AbstractC1131a.m3499c(c2314t, "Hint").mo3471e(modifierM3398t), c28655q, Integer.valueOf((i15 >> 3) & 112));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1338454603);
                c28655q.m87173q(false);
            }
            Modifier modifierMo3471e3 = AbstractC1131a.m3499c(c2314t, "TextField").mo3471e(modifierM3398t);
            C2307m c2307m2 = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, true);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            interfaceC4351m5 = interfaceC4351m;
            AbstractC11895b.m32007z((i15 >> 3) & 14, interfaceC4351m5, c28655q, true);
            if (interfaceC4351m2 != null) {
                c28655q.m87150e0(1338685429);
                Modifier modifierM3499c3 = AbstractC1131a.m3499c(c2314t, "Label");
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
                int iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3499c3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                interfaceC4351m6 = interfaceC4351m2;
                z14 = true;
                AbstractC11895b.m31978A((i15 >> 9) & 14, interfaceC4351m6, c28655q, true, false);
            } else {
                interfaceC4351m6 = interfaceC4351m2;
                z14 = true;
                c28655q.m87150e0(1338768075);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
        } else {
            interfaceC4351m5 = interfaceC4351m;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final InterfaceC4351m interfaceC4351m7 = interfaceC4351m5;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.e4
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC15050j4.m43137c(modifier, interfaceC4351m7, function3, interfaceC4351m6, interfaceC4351m3, interfaceC4351m4, z4, f13, function1, c37816b, interfaceC22973k2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final int m43138d(int i13, int i14, int i15, int i16, int i17, float f13, long j7, float f14, InterfaceC22973k1 interfaceC22973k1) {
        int iMax = Math.max(i15, Math.max(i17, AbstractC12889b.m36250P(f13, i16, 0)));
        float fMo43112d = interfaceC22973k1.mo43112d() * f14;
        return AbstractC39170b.m124774f(Math.max(i13, Math.max(i14, AbstractC12889b.m36258X(AbstractC12889b.m36249O(fMo43112d, Math.max(fMo43112d, i16 / 2.0f), f13) + iMax + (interfaceC22973k1.mo43109a() * f14)))), j7);
    }

    /* JADX INFO: renamed from: e */
    public static final int m43139e(int i13, int i14, int i15, int i16, int i17, float f13, long j7, float f14, InterfaceC22973k1 interfaceC22973k1) {
        int iMax = Math.max(i15, Math.max(AbstractC12889b.m36250P(f13, i16, 0), i17)) + i13 + i14;
        EnumC39181m enumC39181m = EnumC39181m.f168423w;
        return AbstractC39170b.m124775g(Math.max(iMax, AbstractC12889b.m36258X((i16 + ((interfaceC22973k1.mo43111c(enumC39181m) + interfaceC22973k1.mo43110b(enumC39181m)) * f14)) * f13)), j7);
    }
}
