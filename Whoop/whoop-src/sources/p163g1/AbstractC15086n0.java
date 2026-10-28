package p163g1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import ch.C4599t;
import hg3.AbstractC17269i;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p291l0.AbstractC22953f;
import p291l0.C22966i0;
import p291l0.InterfaceC22940b2;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: g1.n0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15086n0 {

    /* JADX INFO: renamed from: a */
    public static final float f56484a = 56;

    /* JADX INFO: renamed from: b */
    public static final float f56485b;

    /* JADX INFO: renamed from: c */
    public static final Modifier f56486c;

    /* JADX INFO: renamed from: d */
    public static final Modifier f56487d;

    /* JADX INFO: renamed from: e */
    public static final C22966i0 f56488e;

    static {
        float f13 = 4;
        f56485b = f13;
        C2314t c2314t = C2314t.f9131w;
        f56486c = AbstractC1102d.m3424u(16 - f13, c2314t);
        f56487d = AbstractC1102d.m3424u(72 - f13, AbstractC1102d.m3406c(1.0f, c2314t));
        f56488e = AbstractC22953f.m66716c(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m43157a(long j7, long j13, float f13, InterfaceC22973k1 interfaceC22973k1, InterfaceC22940b2 interfaceC22940b2, Modifier modifier, C37816b c37816b, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1222317265);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87151f(j13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87147d(f13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87153g(interfaceC22973k1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = i13 & 24576;
        C17916v0 c17916v0 = AbstractC17918w0.f69621a;
        if (i15 == 0) {
            i14 |= c28655q2.m87153g(c17916v0) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87153g(interfaceC22940b2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            modifier2 = modifier;
            i14 |= c28655q2.m87153g(modifier2) ? 1048576 : 524288;
        } else {
            modifier2 = modifier;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q2.m87157i(c37816b) ? 8388608 : 4194304;
        }
        if (c28655q2.m87135U(i14 & 1, (4793491 & i14) != 4793490)) {
            int i16 = i14 << 6;
            c28655q = c28655q2;
            AbstractC17269i.m48898k(modifier2, c17916v0, j7, j13, null, f13, AbstractC37817c.m121344e(-1628734195, c28655q2, new C15066l0(interfaceC22940b2, interfaceC22973k1, c37816b, 1)), c28655q, 1572864 | ((i14 >> 18) & 14) | ((i14 >> 9) & 112) | (i16 & 896) | (i16 & 7168) | ((i14 << 9) & 458752), 16);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15046j0(j7, j13, f13, interfaceC22973k1, interfaceC22940b2, modifier, c37816b, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43158b(final Modifier modifier, final long j7, long j13, final float f13, InterfaceC22973k1 interfaceC22973k1, final C37816b c37816b, Composer composer, final int i13) {
        final long j14;
        final InterfaceC22973k1 interfaceC22973k2;
        InterfaceC22973k1 interfaceC22973k3;
        int i14;
        long j15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2030536439);
        int i15 = i13 | (c28655q.m87151f(j7) ? 32 : 16) | 24704;
        if (c28655q.m87135U(i15 & 1, (74899 & i15) != 74898)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                long jM43101b = AbstractC14981d1.m43101b(j7, c28655q);
                interfaceC22973k3 = AbstractC15013g0.f56174b;
                i14 = i15 & (-897);
                j15 = jM43101b;
            } else {
                c28655q.m87138X();
                interfaceC22973k3 = interfaceC22973k1;
                i14 = i15 & (-897);
                j15 = j13;
            }
            c28655q.m87175r();
            m43157a(j7, j15, f13, interfaceC22973k3, f56488e, modifier, c37816b, c28655q, ((i14 >> 3) & 14) | 14380416);
            interfaceC22973k2 = interfaceC22973k3;
            j14 = j15;
        } else {
            c28655q.m87138X();
            j14 = j13;
            interfaceC22973k2 = interfaceC22973k1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m(j7, j14, f13, interfaceC22973k2, c37816b, i13) { // from class: g1.k0

                /* JADX INFO: renamed from: E */
                public final /* synthetic */ InterfaceC22973k1 f56367E;

                /* JADX INFO: renamed from: F */
                public final /* synthetic */ C37816b f56368F;

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ long f56370x;

                /* JADX INFO: renamed from: y */
                public final /* synthetic */ long f56371y;

                /* JADX INFO: renamed from: z */
                public final /* synthetic */ float f56372z;

                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(199687);
                    AbstractC15086n0.m43158b(this.f56369w, this.f56370x, this.f56371y, this.f56372z, this.f56367E, this.f56368F, (Composer) obj, iM87244L);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m43159c(final C37816b c37816b, final InterfaceC22940b2 interfaceC22940b2, final Modifier modifier, final InterfaceC4351m interfaceC4351m, final Function3 function3, final long j7, final long j13, final float f13, Composer composer, final int i13) {
        int i14;
        InterfaceC22940b2 interfaceC22940b3;
        Modifier modifier2;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(138090236);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(c37816b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            interfaceC22940b3 = interfaceC22940b2;
            i14 |= c28655q2.m87153g(interfaceC22940b3) ? 32 : 16;
        } else {
            interfaceC22940b3 = interfaceC22940b2;
        }
        if ((i13 & 384) == 0) {
            modifier2 = modifier;
            i14 |= c28655q2.m87153g(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4351m) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(function3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87151f(j7) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87151f(j13) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q2.m87147d(f13) ? 8388608 : 4194304;
        }
        if (c28655q2.m87135U(i14 & 1, (4793491 & i14) != 4793490)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
            }
            c28655q2.m87175r();
            int i15 = i14 >> 15;
            int i16 = i14 << 12;
            c28655q = c28655q2;
            m43157a(j7, j13, f13, AbstractC15013g0.f56174b, interfaceC22940b3, modifier2, AbstractC37817c.m121344e(-2019867954, c28655q2, new C4599t(interfaceC4351m, c37816b, function3)), c28655q, (i15 & 896) | (i15 & 14) | 12610560 | (i15 & 112) | (458752 & i16) | (i16 & 3670016));
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.i0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC15086n0.m43159c(c37816b, interfaceC22940b2, modifier, interfaceC4351m, function3, j7, j13, f13, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m43160d(C37816b c37816b, Modifier modifier, InterfaceC4351m interfaceC4351m, Function3 function3, long j7, long j13, float f13, Composer composer, int i13, int i14) {
        int i15;
        Function3 function4;
        boolean z4;
        long j14;
        Function3 function5;
        Modifier modifier2;
        C28677v1 c28677v1M87180u;
        Function3 function6;
        int i16;
        int i17;
        int i18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-350082398);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c37816b) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i15 | 48;
        if ((i13 & 384) == 0) {
            i19 |= c28655q.m87157i(interfaceC4351m) ? 256 : 128;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                function4 = function3;
                i19 |= c28655q.m87157i(function4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87151f(j7)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i19 |= i18;
            }
            if ((196608 & i13) == 0) {
                i19 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((1572864 & i13) == 0) {
                if (c28655q.m87147d(f13)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i19 |= i17;
            }
            if ((599187 & i19) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i19 & 1, z4)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0 || c28655q.m87118C()) {
                    if (i24 != 0) {
                        function6 = AbstractC15003f1.f56117a;
                    } else {
                        function6 = function4;
                    }
                    long jM43101b = AbstractC14981d1.m43101b(j7, c28655q);
                    i16 = i19 & (-458753);
                    modifier2 = C2314t.f9131w;
                    function5 = function6;
                    j14 = jM43101b;
                } else {
                    c28655q.m87138X();
                    i16 = i19 & (-458753);
                    j14 = j13;
                    function5 = function4;
                    modifier2 = modifier;
                }
                c28655q.m87175r();
                int i25 = (i16 & 14) | 48;
                int i26 = i16 << 3;
                m43159c(c37816b, f56488e, modifier2, interfaceC4351m, function5, j7, j14, f13, c28655q, i25 | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (i26 & 29360128));
            } else {
                c28655q.m87138X();
                j14 = j13;
                function5 = function4;
                modifier2 = modifier;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15024h0(c37816b, modifier2, interfaceC4351m, function5, j7, j14, f13, i13, i14);
            }
        }
        i19 |= 3072;
        function4 = function3;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87151f(j7)) {
                i18 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i19 |= i18;
        }
        if ((196608 & i13) == 0) {
            i19 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            if (c28655q.m87147d(f13)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i19 |= i17;
        }
        if ((599187 & i19) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i19 & 1, z4)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if (i24 != 0) {
                    function6 = AbstractC15003f1.f56117a;
                } else {
                    function6 = function4;
                }
                long jM43101b2 = AbstractC14981d1.m43101b(j7, c28655q);
                i16 = i19 & (-458753);
                modifier2 = C2314t.f9131w;
                function5 = function6;
                j14 = jM43101b2;
            } else {
                if (i24 != 0) {
                    function6 = AbstractC15003f1.f56117a;
                } else {
                    function6 = function4;
                }
                long jM43101b3 = AbstractC14981d1.m43101b(j7, c28655q);
                i16 = i19 & (-458753);
                modifier2 = C2314t.f9131w;
                function5 = function6;
                j14 = jM43101b3;
            }
            c28655q.m87175r();
            int i27 = (i16 & 14) | 48;
            int i28 = i16 << 3;
            m43159c(c37816b, f56488e, modifier2, interfaceC4351m, function5, j7, j14, f13, c28655q, i27 | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (i28 & 29360128));
        } else {
            c28655q.m87138X();
            j14 = j13;
            function5 = function4;
            modifier2 = modifier;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15024h0(c37816b, modifier2, interfaceC4351m, function5, j7, j14, f13, i13, i14);
        }
    }
}
