package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2633u2;
import be1.C3172f;
import c93.InterfaceC4351m;
import fw0.C14833a;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22953f;
import p291l0.C22966i0;
import p291l0.InterfaceC22940b2;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.AbstractC39125q1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: g1.g5 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15018g5 {

    /* JADX INFO: renamed from: a */
    public static final C28674u2 f56197a = new C28674u2(new C14833a(16));

    /* JADX INFO: renamed from: b */
    public static final float f56198b = 16;

    /* JADX WARN: Code duplicated, block: B:102:0x019c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0205  */
    /* JADX WARN: Code duplicated, block: B:108:0x022a  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:88:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0127  */
    /* JADX WARN: Code duplicated, block: B:90:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x013b  */
    /* JADX WARN: Code duplicated, block: B:96:0x014b  */
    /* JADX WARN: Code duplicated, block: B:99:0x015a  */
    /* JADX INFO: renamed from: a */
    public static final void m43116a(Modifier modifier, C15040i5 c15040i5, final C37816b c37816b, InterfaceC4351m interfaceC4351m, Function3 function3, InterfaceC4351m interfaceC4351m2, int i13, boolean z4, InterfaceC17869a1 interfaceC17869a1, float f13, long j7, long j13, long j14, long j15, long j16, final C37816b c37816b2, Composer composer, final int i14, final int i15, final int i16) {
        Modifier modifier2;
        int i17;
        InterfaceC4351m interfaceC4351m3;
        int i18;
        int i19;
        int i24;
        long jM43087b;
        boolean z13;
        C28655q c28655q;
        final C15040i5 c15040i6;
        final InterfaceC4351m interfaceC4351m4;
        final int i25;
        final boolean z14;
        final float f14;
        final long j17;
        final long j18;
        final long j19;
        final Modifier modifier3;
        final InterfaceC4351m interfaceC4351m5;
        final long j24;
        final Function3 function4;
        final InterfaceC17869a1 interfaceC17869a2;
        final long j25;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C15118q2 c15118q2M43173d;
        Object objM87133R;
        C28676v0 c28676v0;
        C15092n6 c15092n6;
        Object objM87133R2;
        int i26;
        InterfaceC4351m interfaceC4351m6;
        C28674u2 c28674u2;
        int i27;
        int i28;
        Function3 function5;
        InterfaceC4351m interfaceC4351m7;
        InterfaceC17869a1 interfaceC17869a3;
        float f15;
        boolean z15;
        long j26;
        int i29;
        long jM43101b;
        long j27;
        long j28;
        Modifier modifier5;
        long j29;
        int i34;
        int i35;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1135600301);
        int i36 = i16 & 1;
        if (i36 != 0) {
            i17 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i17 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= c28655q2.m87157i(c37816b) ? 256 : 128;
        }
        int i37 = i16 & 8;
        if (i37 == 0) {
            if ((i14 & 3072) == 0) {
                interfaceC4351m3 = interfaceC4351m;
                i17 |= c28655q2.m87157i(interfaceC4351m3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i18 = i17 | 920346624;
            if ((i15 & 6) == 0) {
                i19 = i15 | 2;
            } else {
                i19 = i15;
            }
            i24 = i19 | 48;
            if ((i15 & 384) == 0) {
                i24 = i19 | 176;
            }
            if ((i15 & 3072) == 0) {
                i24 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 24576) == 0) {
                i24 |= DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((196608 & i15) == 0) {
                jM43087b = j15;
                if ((i16 & 32768) == 0 || !c28655q2.m87151f(jM43087b)) {
                    i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                } else {
                    i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i24 |= i35;
            } else {
                jM43087b = j15;
            }
            if ((1572864 & i15) == 0) {
                i24 |= 524288;
            }
            if ((12582912 & i15) != 0) {
                if (c28655q2.m87157i(c37816b2)) {
                    i34 = 8388608;
                } else {
                    i34 = 4194304;
                }
                i24 |= i34;
            }
            if ((306783379 & i18) == 306783378 || (4793491 & i24) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z13)) {
                c28655q2.m87140Z();
                if ((i14 & 1) != 0 || c28655q2.m87118C()) {
                    if (i36 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    EnumC15128r2 enumC15128r2 = EnumC15128r2.f56690w;
                    c15118q2M43173d = AbstractC15108p2.m43173d(c28655q2);
                    objM87133R = c28655q2.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = new C15092n6();
                        c28655q2.m87172p0(objM87133R);
                    }
                    c15092n6 = (C15092n6) objM87133R;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C15040i5(c15118q2M43173d, c15092n6);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    C15040i5 c15040i7 = (C15040i5) objM87133R2;
                    i26 = i18 & (-113);
                    if (i37 != 0) {
                        interfaceC4351m3 = AbstractC15025h1.f56235a;
                    }
                    C37816b c37816b3 = AbstractC15025h1.f56236b;
                    interfaceC4351m6 = AbstractC15025h1.f56237c;
                    C33252i c33252i = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56429c;
                    float f16 = AbstractC14993e2.f56068b;
                    c28674u2 = AbstractC14981d1.f55997a;
                    Modifier modifier6 = modifier4;
                    c15040i5 = c15040i7;
                    long jM43093h = ((C14970c1) c28655q2.m87161k(c28674u2)).m43093h();
                    long jM43101b2 = AbstractC14981d1.m43101b(jM43093h, c28655q2);
                    long jM51541c = C17919x.m51541c(0.32f, ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43090e());
                    i27 = i24 & (-65423);
                    if ((i16 & 32768) != 0) {
                        jM43087b = ((C14970c1) c28655q2.m87161k(c28674u2)).m43087b();
                        i27 = i24 & (-524175);
                    }
                    i28 = i27 & (-3670017);
                    function5 = c37816b3;
                    interfaceC4351m7 = interfaceC4351m3;
                    interfaceC17869a3 = c33252i;
                    f15 = f16;
                    z15 = true;
                    j26 = jM43101b2;
                    i29 = 2;
                    jM43101b = AbstractC14981d1.m43101b(jM43087b, c28655q2);
                    j27 = jM51541c;
                    j28 = jM43087b;
                    modifier5 = modifier6;
                    j29 = jM43093h;
                } else {
                    c28655q2.m87138X();
                    int i38 = i18 & (-113);
                    int i39 = i24 & (-65423);
                    if ((i16 & 32768) != 0) {
                        i39 = i24 & (-524175);
                    }
                    Modifier modifier7 = modifier2;
                    i26 = i38;
                    modifier5 = modifier7;
                    function5 = function3;
                    interfaceC4351m6 = interfaceC4351m2;
                    z15 = z4;
                    interfaceC17869a3 = interfaceC17869a1;
                    f15 = f13;
                    j26 = j13;
                    j27 = j14;
                    jM43101b = j16;
                    i28 = i39 & (-3670017);
                    interfaceC4351m7 = interfaceC4351m3;
                    j28 = jM43087b;
                    i29 = i13;
                    j29 = j7;
                }
                C15040i5 c15040i8 = c15040i5;
                c28655q2.m87175r();
                int i44 = i28 << 3;
                c28655q = c28655q2;
                m43117b(AbstractC22953f.m66716c(0), modifier5, c15040i8, c37816b, interfaceC4351m7, function5, interfaceC4351m6, i29, z15, interfaceC17869a3, f15, j29, j26, j27, j28, jM43101b, c37816b2, c28655q, (i26 << 3) & 2147483632, (i44 & 896) | ((i26 >> 27) & 14) | (3670016 & i44) | (i44 & 234881024));
                modifier3 = modifier5;
                c15040i6 = c15040i8;
                interfaceC4351m5 = interfaceC4351m7;
                function4 = function5;
                interfaceC4351m4 = interfaceC4351m6;
                i25 = i29;
                z14 = z15;
                interfaceC17869a2 = interfaceC17869a3;
                f14 = f15;
                j17 = j29;
                j25 = j26;
                j18 = j27;
                j24 = j28;
                j19 = jM43101b;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                c15040i6 = c15040i5;
                interfaceC4351m4 = interfaceC4351m2;
                i25 = i13;
                z14 = z4;
                f14 = f13;
                j17 = j7;
                j18 = j14;
                j19 = j16;
                modifier3 = modifier2;
                interfaceC4351m5 = interfaceC4351m3;
                j24 = jM43087b;
                function4 = function3;
                interfaceC17869a2 = interfaceC17869a1;
                j25 = j13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.b5
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM87244L = AbstractC28683x.m87244L(i14 | 1);
                        int iM87244L2 = AbstractC28683x.m87244L(i15);
                        AbstractC15018g5.m43116a(modifier3, c15040i6, c37816b, interfaceC4351m5, function4, interfaceC4351m4, i25, z14, interfaceC17869a2, f14, j17, j25, j18, j24, j19, c37816b2, (Composer) obj, iM87244L, iM87244L2, i16);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i17 |= 3072;
        interfaceC4351m3 = interfaceC4351m;
        i18 = i17 | 920346624;
        if ((i15 & 6) == 0) {
            i19 = i15 | 2;
        } else {
            i19 = i15;
        }
        i24 = i19 | 48;
        if ((i15 & 384) == 0) {
            i24 = i19 | 176;
        }
        if ((i15 & 3072) == 0) {
            i24 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i24 |= DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i15) == 0) {
            jM43087b = j15;
            if ((i16 & 32768) == 0) {
                i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            } else {
                i35 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i24 |= i35;
        } else {
            jM43087b = j15;
        }
        if ((1572864 & i15) == 0) {
            i24 |= 524288;
        }
        if ((12582912 & i15) != 0) {
            if (c28655q2.m87157i(c37816b2)) {
                i34 = 8388608;
            } else {
                i34 = 4194304;
            }
            i24 |= i34;
        }
        if ((306783379 & i18) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c28655q2.m87135U(i18 & 1, z13)) {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0) {
                if (i36 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                EnumC15128r2 enumC15128r3 = EnumC15128r2.f56690w;
                c15118q2M43173d = AbstractC15108p2.m43173d(c28655q2);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C15092n6();
                    c28655q2.m87172p0(objM87133R);
                }
                c15092n6 = (C15092n6) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C15040i5(c15118q2M43173d, c15092n6);
                    c28655q2.m87172p0(objM87133R2);
                }
                C15040i5 c15040i9 = (C15040i5) objM87133R2;
                i26 = i18 & (-113);
                if (i37 != 0) {
                    interfaceC4351m3 = AbstractC15025h1.f56235a;
                }
                C37816b c37816b4 = AbstractC15025h1.f56236b;
                interfaceC4351m6 = AbstractC15025h1.f56237c;
                C33252i c33252i2 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56429c;
                float f17 = AbstractC14993e2.f56068b;
                c28674u2 = AbstractC14981d1.f55997a;
                Modifier modifier8 = modifier4;
                c15040i5 = c15040i9;
                long jM43093h2 = ((C14970c1) c28655q2.m87161k(c28674u2)).m43093h();
                long jM43101b3 = AbstractC14981d1.m43101b(jM43093h2, c28655q2);
                long jM51541c2 = C17919x.m51541c(0.32f, ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43090e());
                i27 = i24 & (-65423);
                if ((i16 & 32768) != 0) {
                    jM43087b = ((C14970c1) c28655q2.m87161k(c28674u2)).m43087b();
                    i27 = i24 & (-524175);
                }
                i28 = i27 & (-3670017);
                function5 = c37816b4;
                interfaceC4351m7 = interfaceC4351m3;
                interfaceC17869a3 = c33252i2;
                f15 = f17;
                z15 = true;
                j26 = jM43101b3;
                i29 = 2;
                jM43101b = AbstractC14981d1.m43101b(jM43087b, c28655q2);
                j27 = jM51541c2;
                j28 = jM43087b;
                modifier5 = modifier8;
                j29 = jM43093h2;
            } else {
                if (i36 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                EnumC15128r2 enumC15128r4 = EnumC15128r2.f56690w;
                c15118q2M43173d = AbstractC15108p2.m43173d(c28655q2);
                objM87133R = c28655q2.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C15092n6();
                    c28655q2.m87172p0(objM87133R);
                }
                c15092n6 = (C15092n6) objM87133R;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C15040i5(c15118q2M43173d, c15092n6);
                    c28655q2.m87172p0(objM87133R2);
                }
                C15040i5 c15040i10 = (C15040i5) objM87133R2;
                i26 = i18 & (-113);
                if (i37 != 0) {
                    interfaceC4351m3 = AbstractC15025h1.f56235a;
                }
                C37816b c37816b5 = AbstractC15025h1.f56236b;
                interfaceC4351m6 = AbstractC15025h1.f56237c;
                C33252i c33252i3 = ((C15071l5) c28655q2.m87161k(AbstractC15081m5.f56461a)).f56429c;
                float f18 = AbstractC14993e2.f56068b;
                c28674u2 = AbstractC14981d1.f55997a;
                Modifier modifier9 = modifier4;
                c15040i5 = c15040i10;
                long jM43093h3 = ((C14970c1) c28655q2.m87161k(c28674u2)).m43093h();
                long jM43101b4 = AbstractC14981d1.m43101b(jM43093h3, c28655q2);
                long jM51541c3 = C17919x.m51541c(0.32f, ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43090e());
                i27 = i24 & (-65423);
                if ((i16 & 32768) != 0) {
                    jM43087b = ((C14970c1) c28655q2.m87161k(c28674u2)).m43087b();
                    i27 = i24 & (-524175);
                }
                i28 = i27 & (-3670017);
                function5 = c37816b5;
                interfaceC4351m7 = interfaceC4351m3;
                interfaceC17869a3 = c33252i3;
                f15 = f18;
                z15 = true;
                j26 = jM43101b4;
                i29 = 2;
                jM43101b = AbstractC14981d1.m43101b(jM43087b, c28655q2);
                j27 = jM51541c3;
                j28 = jM43087b;
                modifier5 = modifier9;
                j29 = jM43093h3;
            }
            C15040i5 c15040i11 = c15040i5;
            c28655q2.m87175r();
            int i45 = i28 << 3;
            c28655q = c28655q2;
            m43117b(AbstractC22953f.m66716c(0), modifier5, c15040i11, c37816b, interfaceC4351m7, function5, interfaceC4351m6, i29, z15, interfaceC17869a3, f15, j29, j26, j27, j28, jM43101b, c37816b2, c28655q, (i26 << 3) & 2147483632, (i45 & 896) | ((i26 >> 27) & 14) | (3670016 & i45) | (i45 & 234881024));
            modifier3 = modifier5;
            c15040i6 = c15040i11;
            interfaceC4351m5 = interfaceC4351m7;
            function4 = function5;
            interfaceC4351m4 = interfaceC4351m6;
            i25 = i29;
            z14 = z15;
            interfaceC17869a2 = interfaceC17869a3;
            f14 = f15;
            j17 = j29;
            j25 = j26;
            j18 = j27;
            j24 = j28;
            j19 = jM43101b;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            c15040i6 = c15040i5;
            interfaceC4351m4 = interfaceC4351m2;
            i25 = i13;
            z14 = z4;
            f14 = f13;
            j17 = j7;
            j18 = j14;
            j19 = j16;
            modifier3 = modifier2;
            interfaceC4351m5 = interfaceC4351m3;
            j24 = jM43087b;
            function4 = function3;
            interfaceC17869a2 = interfaceC17869a1;
            j25 = j13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.b5
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i14 | 1);
                    int iM87244L2 = AbstractC28683x.m87244L(i15);
                    AbstractC15018g5.m43116a(modifier3, c15040i6, c37816b, interfaceC4351m5, function4, interfaceC4351m4, i25, z14, interfaceC17869a2, f14, j17, j25, j18, j24, j19, c37816b2, (Composer) obj, iM87244L, iM87244L2, i16);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43117b(final C22966i0 c22966i0, Modifier modifier, final C15040i5 c15040i5, final C37816b c37816b, final InterfaceC4351m interfaceC4351m, final Function3 function3, final InterfaceC4351m interfaceC4351m2, final int i13, final boolean z4, final InterfaceC17869a1 interfaceC17869a1, final float f13, final long j7, final long j13, final long j14, final long j15, final long j16, final C37816b c37816b2, Composer composer, final int i14, final int i15) {
        int i16;
        C37816b c37816b3;
        int i17;
        C28655q c28655q;
        final Modifier modifier2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(50073903);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87153g(c22966i0) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87153g(c15040i5) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            c37816b3 = c37816b;
            i16 |= c28655q2.m87157i(c37816b3) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            c37816b3 = c37816b;
        }
        int i18 = i14 & 24576;
        int i19 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i18 == 0) {
            i16 |= c28655q2.m87157i(interfaceC4351m) ? 16384 : 8192;
        }
        int i24 = i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i24 == 0) {
            i16 |= c28655q2.m87157i(function3) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= c28655q2.m87157i(interfaceC4351m2) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= c28655q2.m87149e(i13) ? 8388608 : 4194304;
        }
        int i26 = i14 & 100663296;
        int i27 = AndroidSDKConstants.FLAG_MUTABLE;
        if (i26 == 0) {
            i16 |= c28655q2.m87155h(false) ? 67108864 : 33554432;
        }
        if ((i14 & 805306368) == 0) {
            i16 |= c28655q2.m87157i(null) ? 536870912 : 268435456;
        }
        int i28 = i16;
        if ((i15 & 6) == 0) {
            i17 = (c28655q2.m87155h(z4) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q2.m87153g(interfaceC17869a1) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q2.m87147d(f13) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= c28655q2.m87151f(j7) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            if (c28655q2.m87151f(j13)) {
                i19 = 16384;
            }
            i17 |= i19;
        }
        if ((i15 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87151f(j14)) {
                i25 = 131072;
            }
            i17 |= i25;
        }
        if ((i15 & 1572864) == 0) {
            i17 |= c28655q2.m87151f(j15) ? 1048576 : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i17 |= c28655q2.m87151f(j16) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            if (c28655q2.m87157i(c37816b2)) {
                i27 = 67108864;
            }
            i17 |= i27;
        }
        if (c28655q2.m87135U(i28 & 1, ((i28 & 306783379) == 306783378 && (38347923 & i17) == 38347922) ? false : true)) {
            c28655q2.m87140Z();
            if ((i14 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
            }
            c28655q2.m87175r();
            boolean z13 = (i28 & 14) == 4;
            Object objM87133R = c28655q2.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C14951a4(c22966i0);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            C37816b c37816bM121344e = AbstractC37817c.m121344e(-1236753028, c28655q, new C14996e5((C14951a4) objM87133R, c22966i0, j15, j16, i13, c37816b3, c37816b2, interfaceC4351m2, interfaceC4351m, function3, c15040i5));
            c28655q.m87150e0(1400751284);
            modifier2 = modifier;
            c37816bM121344e.invoke(modifier2, c28655q, Integer.valueOf(((i28 >> 3) & 14) | 48));
            c28655q.m87173q(false);
        } else {
            c28655q = c28655q2;
            modifier2 = modifier;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.c5
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i14 | 1);
                    int iM87244L2 = AbstractC28683x.m87244L(i15);
                    AbstractC15018g5.m43117b(c22966i0, modifier2, c15040i5, c37816b, interfaceC4351m, function3, interfaceC4351m2, i13, z4, interfaceC17869a1, f13, j7, j13, j14, j15, j16, c37816b2, (Composer) obj, iM87244L, iM87244L2);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m43118c(int i13, C37816b c37816b, C37816b c37816b2, C37816b c37816b3, InterfaceC4351m interfaceC4351m, InterfaceC22940b2 interfaceC22940b2, InterfaceC4351m interfaceC4351m2, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(675142332);
        int i15 = i14 | (c28655q.m87155h(false) ? 4 : 2) | (c28655q.m87149e(i13) ? 32 : 16) | (c28655q.m87157i(c37816b) ? 256 : 128) | (c28655q.m87157i(c37816b2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87157i(interfaceC4351m) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) | (c28655q.m87153g(interfaceC22940b2) ? 1048576 : 524288) | (c28655q.m87157i(interfaceC4351m2) ? 8388608 : 4194304);
        if (c28655q.m87135U(i15 & 1, (4793491 & i15) != 4793490)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C15007f5();
                c28655q.m87172p0(objM87133R);
            }
            C15007f5 c15007f5 = (C15007f5) objM87133R;
            boolean z4 = ((i15 & 896) == 256) | ((3670016 & i15) == 1048576) | ((458752 & i15) == 131072) | ((i15 & 112) == 32) | ((i15 & 14) == 4) | ((29360128 & i15) == 8388608) | ((i15 & 7168) == 2048);
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                C2633u2 c2633u2 = new C2633u2(c37816b, c37816b3, interfaceC4351m, i13, interfaceC22940b2, c15007f5, interfaceC4351m2, c37816b2);
                c28655q.m87172p0(c2633u2);
                objM87133R2 = c2633u2;
            }
            AbstractC39125q1.m124656b(null, (InterfaceC4351m) objM87133R2, c28655q, 0, 1);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f(i13, c37816b, c37816b2, c37816b3, interfaceC4351m, interfaceC22940b2, interfaceC4351m2, i14);
        }
    }
}
