package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bf0.C3195g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.profile.view.edit.C9772c;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p043c4.AbstractC3975r;
import p043c4.C3966j0;
import p077d0.C11393q0;
import p132f0.C13821r1;
import p208i2.C17881e1;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function3;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: g1.f0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15002f0 {

    /* JADX INFO: renamed from: a */
    public static final C3966j0 f56116a = new C3966j0(true, 14);

    /* JADX WARN: Code duplicated, block: B:100:0x0158  */
    /* JADX WARN: Code duplicated, block: B:104:0x0171  */
    /* JADX WARN: Code duplicated, block: B:107:0x018f  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7 A[PHI: r0 r5 r8 r10
      0x00e7: PHI (r0v20 int) = (r0v15 int), (r0v12 int), (r0v21 int) binds: [B:91:0x0116, B:81:0x00e4, B:82:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r5v11 androidx.compose.ui.Modifier) = (r5v3 androidx.compose.ui.Modifier), (r5v2 androidx.compose.ui.Modifier), (r5v2 androidx.compose.ui.Modifier) binds: [B:91:0x0116, B:81:0x00e4, B:82:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r8v20 f0.r1) = (r8v9 f0.r1), (r8v7 f0.r1), (r8v7 f0.r1) binds: [B:91:0x0116, B:81:0x00e4, B:82:0x00e6] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r10v9 long) = (r10v4 long), (r10v1 long), (r10v1 long) binds: [B:91:0x0116, B:81:0x00e4, B:82:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x010f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129  */
    /* JADX WARN: Code duplicated, block: B:98:0x014a  */
    /* JADX INFO: renamed from: a */
    public static final void m43105a(boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, long j7, C13821r1 c13821r1, C3966j0 c3966j0, Function3 function3, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        Modifier modifier2;
        int i16;
        long jFloatToRawIntBits;
        int i17;
        C13821r1 c13821r1M92099U;
        int i18;
        C3966j0 c3966j1;
        int i19;
        Function3 function4;
        boolean z13;
        Modifier modifier3;
        C13821r1 c13821r2;
        C3966j0 c3966j2;
        long j13;
        C28677v1 c28677v1M87180u;
        C3966j0 c3966j3;
        Modifier modifier4;
        C13821r1 c13821r3;
        Object objM87133R;
        C28676v0 c28676v0;
        C11393q0 c11393q0;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R3;
        int i24;
        int i25;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1275450738);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        int i26 = i14 & 4;
        if (i26 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                i15 |= 3072;
                jFloatToRawIntBits = j7;
            } else {
                jFloatToRawIntBits = j7;
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87151f(jFloatToRawIntBits)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
            }
            if ((i13 & 24576) == 0) {
                if ((i14 & 16) == 0) {
                    c13821r1M92099U = c13821r1;
                    if (c28655q.m87153g(c13821r1M92099U)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i15 |= i25;
                } else {
                    c13821r1M92099U = c13821r1;
                }
                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                i15 |= i25;
            } else {
                c13821r1M92099U = c13821r1;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    c3966j1 = c3966j0;
                    if (c28655q.m87153g(c3966j1)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                if ((1572864 & i13) == 0) {
                    function4 = function3;
                    if (c28655q.m87157i(function4)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i15 |= i24;
                } else {
                    function4 = function3;
                }
                if ((599187 & i15) != 599186) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q.m87135U(i15 & 1, z13)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0 || c28655q.m87118C()) {
                        if (i26 != 0) {
                            modifier2 = C2314t.f9131w;
                        }
                        if (i16 != 0) {
                            float f13 = 0;
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f13)) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << 32);
                        }
                        if ((i14 & 16) != 0) {
                            i15 &= -57345;
                            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                        }
                        if (i18 != 0) {
                            c3966j3 = f56116a;
                            modifier4 = modifier2;
                            c13821r3 = c13821r1M92099U;
                        }
                        c28655q.m87175r();
                        objM87133R = c28655q.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = new C11393q0(Boolean.FALSE);
                            c28655q.m87172p0(objM87133R);
                        }
                        c11393q0 = (C11393q0) objM87133R;
                        c11393q0.m30628I0(Boolean.valueOf(z4));
                        if (!((Boolean) c11393q0.f36534y.getValue()).booleanValue() || ((Boolean) c11393q0.f36535z.getValue()).booleanValue()) {
                            c28655q.m87150e0(-622275818);
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = AbstractC28683x.m87272z(new C17881e1(C17881e1.f69566b));
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C9772c(4, interfaceC28601c1);
                                c28655q.m87172p0(objM87133R3);
                            }
                            int i27 = i15;
                            AbstractC3975r.m12004a(new C15138s2(jFloatToRawIntBits, interfaceC39171c, (InterfaceC4351m) objM87133R3), interfaceC4339a2, c3966j3, AbstractC37817c.m121344e(1788768427, c28655q, new C14991e0(c11393q0, interfaceC28601c1, c13821r3, modifier4, function4, 0)), c28655q, ((i27 >> 9) & 896) | (i27 & 112) | 3072, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-621482032);
                            c28655q.m87173q(false);
                        }
                        c3966j2 = c3966j3;
                        c13821r2 = c13821r3;
                        modifier3 = modifier4;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 16) != 0) {
                            i15 &= -57345;
                        }
                    }
                    modifier4 = modifier2;
                    c13821r3 = c13821r1M92099U;
                    c3966j3 = c3966j1;
                    c28655q.m87175r();
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = new C11393q0(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    }
                    c11393q0 = (C11393q0) objM87133R;
                    c11393q0.m30628I0(Boolean.valueOf(z4));
                    if (((Boolean) c11393q0.f36534y.getValue()).booleanValue()) {
                        c28655q.m87150e0(-622275818);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(new C17881e1(C17881e1.f69566b));
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        InterfaceC39171c interfaceC39171c2 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C9772c(4, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i28 = i15;
                        AbstractC3975r.m12004a(new C15138s2(jFloatToRawIntBits, interfaceC39171c2, (InterfaceC4351m) objM87133R3), interfaceC4339a2, c3966j3, AbstractC37817c.m121344e(1788768427, c28655q, new C14991e0(c11393q0, interfaceC28601c1, c13821r3, modifier4, function4, 0)), c28655q, ((i28 >> 9) & 896) | (i28 & 112) | 3072, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-622275818);
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(new C17881e1(C17881e1.f69566b));
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                        InterfaceC39171c interfaceC39171c3 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C9772c(4, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        int i29 = i15;
                        AbstractC3975r.m12004a(new C15138s2(jFloatToRawIntBits, interfaceC39171c3, (InterfaceC4351m) objM87133R3), interfaceC4339a2, c3966j3, AbstractC37817c.m121344e(1788768427, c28655q, new C14991e0(c11393q0, interfaceC28601c1, c13821r3, modifier4, function4, 0)), c28655q, ((i29 >> 9) & 896) | (i29 & 112) | 3072, 0);
                        c28655q.m87173q(false);
                    }
                    c3966j2 = c3966j3;
                    c13821r2 = c13821r3;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    c13821r2 = c13821r1M92099U;
                    c3966j2 = c3966j1;
                }
                j13 = jFloatToRawIntBits;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C14980d0(z4, interfaceC4339a, modifier3, j13, c13821r2, c3966j2, function3, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            c3966j1 = c3966j0;
            if ((1572864 & i13) == 0) {
                function4 = function3;
                if (c28655q.m87157i(function4)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i15 |= i24;
            } else {
                function4 = function3;
            }
            if ((599187 & i15) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        float f14 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(f14)) << 32);
                    }
                    if ((i14 & 16) != 0) {
                        i15 &= -57345;
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    }
                    if (i18 != 0) {
                        c3966j3 = f56116a;
                        modifier4 = modifier2;
                        c13821r3 = c13821r1M92099U;
                    } else {
                        modifier4 = modifier2;
                        c13821r3 = c13821r1M92099U;
                        c3966j3 = c3966j1;
                    }
                } else {
                    if (i26 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        float f15 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (((long) Float.floatToRawIntBits(f15)) << 32);
                    }
                    if ((i14 & 16) != 0) {
                        i15 &= -57345;
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    }
                    if (i18 != 0) {
                        c3966j3 = f56116a;
                        modifier4 = modifier2;
                        c13821r3 = c13821r1M92099U;
                    } else {
                        modifier4 = modifier2;
                        c13821r3 = c13821r1M92099U;
                        c3966j3 = c3966j1;
                    }
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C11393q0(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                c11393q0 = (C11393q0) objM87133R;
                c11393q0.m30628I0(Boolean.valueOf(z4));
                if (((Boolean) c11393q0.f36534y.getValue()).booleanValue()) {
                    c28655q.m87150e0(-622275818);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(new C17881e1(C17881e1.f69566b));
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    InterfaceC39171c interfaceC39171c4 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C9772c(4, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i210 = i15;
                    AbstractC3975r.m12004a(new C15138s2(jFloatToRawIntBits, interfaceC39171c4, (InterfaceC4351m) objM87133R3), interfaceC4339a2, c3966j3, AbstractC37817c.m121344e(1788768427, c28655q, new C14991e0(c11393q0, interfaceC28601c1, c13821r3, modifier4, function4, 0)), c28655q, ((i210 >> 9) & 896) | (i210 & 112) | 3072, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-622275818);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(new C17881e1(C17881e1.f69566b));
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    InterfaceC39171c interfaceC39171c5 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C9772c(4, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i211 = i15;
                    AbstractC3975r.m12004a(new C15138s2(jFloatToRawIntBits, interfaceC39171c5, (InterfaceC4351m) objM87133R3), interfaceC4339a2, c3966j3, AbstractC37817c.m121344e(1788768427, c28655q, new C14991e0(c11393q0, interfaceC28601c1, c13821r3, modifier4, function4, 0)), c28655q, ((i211 >> 9) & 896) | (i211 & 112) | 3072, 0);
                    c28655q.m87173q(false);
                }
                c3966j2 = c3966j3;
                c13821r2 = c13821r3;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                c13821r2 = c13821r1M92099U;
                c3966j2 = c3966j1;
            }
            j13 = jFloatToRawIntBits;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14980d0(z4, interfaceC4339a, modifier3, j13, c13821r2, c3966j2, function3, i13, i14);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            i15 |= 3072;
            jFloatToRawIntBits = j7;
        } else {
            jFloatToRawIntBits = j7;
            if ((i13 & 3072) == 0) {
                if (c28655q.m87151f(jFloatToRawIntBits)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
        }
        if ((i13 & 24576) == 0) {
            if ((i14 & 16) == 0) {
                c13821r1M92099U = c13821r1;
                if (c28655q.m87153g(c13821r1M92099U)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i15 |= i25;
            } else {
                c13821r1M92099U = c13821r1;
            }
            i25 = DfuBaseService.ERROR_REMOTE_MASK;
            i15 |= i25;
        } else {
            c13821r1M92099U = c13821r1;
        }
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                c3966j1 = c3966j0;
                if (c28655q.m87153g(c3966j1)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            if ((1572864 & i13) == 0) {
                function4 = function3;
                if (c28655q.m87157i(function4)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i15 |= i24;
            } else {
                function4 = function3;
            }
            if ((599187 & i15) != 599186) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i26 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        float f16 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f16)) & 4294967295L) | (((long) Float.floatToRawIntBits(f16)) << 32);
                    }
                    if ((i14 & 16) != 0) {
                        i15 &= -57345;
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    }
                    if (i18 != 0) {
                        c3966j3 = f56116a;
                        modifier4 = modifier2;
                        c13821r3 = c13821r1M92099U;
                    } else {
                        modifier4 = modifier2;
                        c13821r3 = c13821r1M92099U;
                        c3966j3 = c3966j1;
                    }
                } else {
                    if (i26 != 0) {
                        modifier2 = C2314t.f9131w;
                    }
                    if (i16 != 0) {
                        float f17 = 0;
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f17)) & 4294967295L) | (((long) Float.floatToRawIntBits(f17)) << 32);
                    }
                    if ((i14 & 16) != 0) {
                        i15 &= -57345;
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                    }
                    if (i18 != 0) {
                        c3966j3 = f56116a;
                        modifier4 = modifier2;
                        c13821r3 = c13821r1M92099U;
                    } else {
                        modifier4 = modifier2;
                        c13821r3 = c13821r1M92099U;
                        c3966j3 = c3966j1;
                    }
                }
                c28655q.m87175r();
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C11393q0(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                c11393q0 = (C11393q0) objM87133R;
                c11393q0.m30628I0(Boolean.valueOf(z4));
                if (((Boolean) c11393q0.f36534y.getValue()).booleanValue()) {
                    c28655q.m87150e0(-622275818);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(new C17881e1(C17881e1.f69566b));
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    InterfaceC39171c interfaceC39171c6 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C9772c(4, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i212 = i15;
                    AbstractC3975r.m12004a(new C15138s2(jFloatToRawIntBits, interfaceC39171c6, (InterfaceC4351m) objM87133R3), interfaceC4339a2, c3966j3, AbstractC37817c.m121344e(1788768427, c28655q, new C14991e0(c11393q0, interfaceC28601c1, c13821r3, modifier4, function4, 0)), c28655q, ((i212 >> 9) & 896) | (i212 & 112) | 3072, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-622275818);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(new C17881e1(C17881e1.f69566b));
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    InterfaceC39171c interfaceC39171c7 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C9772c(4, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    int i213 = i15;
                    AbstractC3975r.m12004a(new C15138s2(jFloatToRawIntBits, interfaceC39171c7, (InterfaceC4351m) objM87133R3), interfaceC4339a2, c3966j3, AbstractC37817c.m121344e(1788768427, c28655q, new C14991e0(c11393q0, interfaceC28601c1, c13821r3, modifier4, function4, 0)), c28655q, ((i213 >> 9) & 896) | (i213 & 112) | 3072, 0);
                    c28655q.m87173q(false);
                }
                c3966j2 = c3966j3;
                c13821r2 = c13821r3;
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                c13821r2 = c13821r1M92099U;
                c3966j2 = c3966j1;
            }
            j13 = jFloatToRawIntBits;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14980d0(z4, interfaceC4339a, modifier3, j13, c13821r2, c3966j2, function3, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        c3966j1 = c3966j0;
        if ((1572864 & i13) == 0) {
            function4 = function3;
            if (c28655q.m87157i(function4)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i15 |= i24;
        } else {
            function4 = function3;
        }
        if ((599187 & i15) != 599186) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i26 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 != 0) {
                    float f18 = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f18)) & 4294967295L) | (((long) Float.floatToRawIntBits(f18)) << 32);
                }
                if ((i14 & 16) != 0) {
                    i15 &= -57345;
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                }
                if (i18 != 0) {
                    c3966j3 = f56116a;
                    modifier4 = modifier2;
                    c13821r3 = c13821r1M92099U;
                } else {
                    modifier4 = modifier2;
                    c13821r3 = c13821r1M92099U;
                    c3966j3 = c3966j1;
                }
            } else {
                if (i26 != 0) {
                    modifier2 = C2314t.f9131w;
                }
                if (i16 != 0) {
                    float f19 = 0;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f19)) & 4294967295L) | (((long) Float.floatToRawIntBits(f19)) << 32);
                }
                if ((i14 & 16) != 0) {
                    i15 &= -57345;
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                }
                if (i18 != 0) {
                    c3966j3 = f56116a;
                    modifier4 = modifier2;
                    c13821r3 = c13821r1M92099U;
                } else {
                    modifier4 = modifier2;
                    c13821r3 = c13821r1M92099U;
                    c3966j3 = c3966j1;
                }
            }
            c28655q.m87175r();
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C11393q0(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            c11393q0 = (C11393q0) objM87133R;
            c11393q0.m30628I0(Boolean.valueOf(z4));
            if (((Boolean) c11393q0.f36534y.getValue()).booleanValue()) {
                c28655q.m87150e0(-622275818);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(new C17881e1(C17881e1.f69566b));
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                InterfaceC39171c interfaceC39171c8 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C9772c(4, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                int i214 = i15;
                AbstractC3975r.m12004a(new C15138s2(jFloatToRawIntBits, interfaceC39171c8, (InterfaceC4351m) objM87133R3), interfaceC4339a2, c3966j3, AbstractC37817c.m121344e(1788768427, c28655q, new C14991e0(c11393q0, interfaceC28601c1, c13821r3, modifier4, function4, 0)), c28655q, ((i214 >> 9) & 896) | (i214 & 112) | 3072, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-622275818);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(new C17881e1(C17881e1.f69566b));
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                InterfaceC39171c interfaceC39171c9 = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C9772c(4, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                int i215 = i15;
                AbstractC3975r.m12004a(new C15138s2(jFloatToRawIntBits, interfaceC39171c9, (InterfaceC4351m) objM87133R3), interfaceC4339a2, c3966j3, AbstractC37817c.m121344e(1788768427, c28655q, new C14991e0(c11393q0, interfaceC28601c1, c13821r3, modifier4, function4, 0)), c28655q, ((i215 >> 9) & 896) | (i215 & 112) | 3072, 0);
                c28655q.m87173q(false);
            }
            c3966j2 = c3966j3;
            c13821r2 = c13821r3;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            c13821r2 = c13821r1M92099U;
            c3966j2 = c3966j1;
        }
        j13 = jFloatToRawIntBits;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14980d0(z4, interfaceC4339a, modifier3, j13, c13821r2, c3966j2, function3, i13, i14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43106b(InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z4, InterfaceC22973k1 interfaceC22973k1, Function3 function3, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(670540513);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i15 | 432;
        int i17 = i14 & 8;
        if (i17 != 0) {
            i16 = i15 | 3504;
        } else if ((i13 & 3072) == 0) {
            i16 |= c28655q.m87153g(interfaceC22973k1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i18 = i16 | 24576;
        if (c28655q.m87135U(i18 & 1, (74899 & i18) != 74898)) {
            if (i17 != 0) {
                interfaceC22973k1 = AbstractC15089n3.f56495a;
            }
            AbstractC15099o3.m43168b(interfaceC4339a, interfaceC22973k1, function3, c28655q, 524286 & i18);
            modifier = C2314t.f9131w;
            z13 = true;
        } else {
            c28655q.m87138X();
            z13 = z4;
        }
        Modifier modifier2 = modifier;
        InterfaceC22973k1 interfaceC22973k2 = interfaceC22973k1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g(interfaceC4339a, modifier2, z13, interfaceC22973k2, function3, i13, i14, 8);
        }
    }
}
