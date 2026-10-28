package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c41.C4150x4;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p132f0.C13825t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p291l0.C22976l1;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p412q3.InterfaceC29873g0;
import p490t0.AbstractC33244a;
import p490t0.AbstractC33247d;
import p490t0.C33246c;
import p522uf.AbstractC34870c0;
import p602x1.C37816b;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.i8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15043i8 {

    /* JADX INFO: renamed from: a */
    public static final C15043i8 f56313a = new C15043i8();

    /* JADX INFO: renamed from: b */
    public static final float f56314b = 56;

    /* JADX INFO: renamed from: c */
    public static final float f56315c = 280;

    /* JADX INFO: renamed from: d */
    public static final float f56316d = 1;

    /* JADX INFO: renamed from: e */
    public static final float f56317e = 2;

    /* JADX INFO: renamed from: d */
    public static AbstractC33244a m43126d(Composer composer) {
        return ((C15071l5) ((C28655q) composer).m87161k(AbstractC15081m5.f56461a)).f56427a;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC33244a m43127e(Composer composer) {
        AbstractC33244a abstractC33244a = ((C15071l5) ((C28655q) composer).m87161k(AbstractC15081m5.f56461a)).f56427a;
        C33246c c33246c = AbstractC33247d.f138647a;
        return AbstractC33244a.m105477d(abstractC33244a, null, null, c33246c, c33246c, 3, null);
    }

    /* JADX INFO: renamed from: f */
    public static Modifier m43128f(Modifier modifier, boolean z4, boolean z13, InterfaceC21083i interfaceC21083i, InterfaceC14999e8 interfaceC14999e8) {
        return AbstractC37056f.m118997u(modifier, new C15032h8(z4, z13, interfaceC21083i, interfaceC14999e8));
    }

    /* JADX INFO: renamed from: g */
    public static C15197y1 m43129g(long j7, long j13, long j14, long j15, long j16, long j17, long j18, long j19, Composer composer, int i13) {
        long jM51541c;
        long jM51541c2;
        long jM43091f;
        double d3;
        long jM51541c3;
        long jM51541c4;
        long jM51541c5;
        if ((i13 & 1) != 0) {
            C28655q c28655q = (C28655q) composer;
            jM51541c = C17919x.m51541c(((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue(), ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a);
        } else {
            jM51541c = j7;
        }
        if ((i13 & 2) != 0) {
            C28655q c28655q2 = (C28655q) composer;
            long j24 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                AbstractC17918w0.m51536x(j24);
            } else {
                AbstractC17918w0.m51536x(j24);
            }
            jM51541c2 = C17919x.m51541c(0.38f, jM51541c);
        } else {
            jM51541c2 = j13;
        }
        long j25 = (i13 & 4) != 0 ? C17919x.f69636m : j14;
        if ((i13 & 8) != 0) {
            jM43091f = ((C14970c1) ((C28655q) composer).m87161k(AbstractC14981d1.f55997a)).m43091f();
        } else {
            jM43091f = j15;
        }
        C28674u2 c28674u2 = AbstractC14981d1.f55997a;
        long jM43088c = ((C14970c1) ((C28655q) composer).m87161k(c28674u2)).m43088c();
        if ((i13 & 32) != 0) {
            C28655q c28655q3 = (C28655q) composer;
            long jM43091f2 = ((C14970c1) c28655q3.m87161k(c28674u2)).m43091f();
            d3 = 0.5d;
            long j26 = ((C17919x) c28655q3.m87161k(AbstractC15067l1.f56420a)).f69639a;
            jM51541c3 = C17919x.m51541c((!((C14970c1) c28655q3.m87161k(c28674u2)).m43094i() ? ((double) AbstractC17918w0.m51536x(j26)) < 0.5d : ((double) AbstractC17918w0.m51536x(j26)) > 0.5d) ? 0.87f : 1.0f, jM43091f2);
        } else {
            d3 = 0.5d;
            jM51541c3 = j16;
        }
        if ((i13 & 64) != 0) {
            C28655q c28655q4 = (C28655q) composer;
            long jM43090e = ((C14970c1) c28655q4.m87161k(c28674u2)).m43090e();
            long j27 = ((C17919x) c28655q4.m87161k(AbstractC15067l1.f56420a)).f69639a;
            if (((C14970c1) c28655q4.m87161k(c28674u2)).m43094i()) {
                AbstractC17918w0.m51536x(j27);
            } else {
                AbstractC17918w0.m51536x(j27);
            }
            jM51541c4 = C17919x.m51541c(0.38f, jM43090e);
        } else {
            jM51541c4 = j17;
        }
        if ((i13 & 128) != 0) {
            C28655q c28655q5 = (C28655q) composer;
            long j28 = ((C17919x) c28655q5.m87161k(AbstractC15067l1.f56420a)).f69639a;
            if (((C14970c1) c28655q5.m87161k(c28674u2)).m43094i()) {
                AbstractC17918w0.m51536x(j28);
            } else {
                AbstractC17918w0.m51536x(j28);
            }
            jM51541c5 = C17919x.m51541c(0.38f, jM51541c4);
        } else {
            jM51541c5 = j18;
        }
        long jM43088c2 = (i13 & 256) != 0 ? ((C14970c1) ((C28655q) composer).m87161k(c28674u2)).m43088c() : j19;
        long j29 = jM51541c5;
        long jM51541c6 = C17919x.m51541c(0.54f, ((C14970c1) ((C28655q) composer).m87161k(c28674u2)).m43090e());
        C28596b0 c28596b0 = AbstractC15067l1.f56420a;
        C28655q c28655q6 = (C28655q) composer;
        long j34 = jM51541c2;
        long j35 = ((C17919x) c28655q6.m87161k(c28596b0)).f69639a;
        if (((C14970c1) c28655q6.m87161k(c28674u2)).m43094i()) {
            AbstractC17918w0.m51536x(j35);
        } else {
            AbstractC17918w0.m51536x(j35);
        }
        long jM51541c7 = C17919x.m51541c(0.38f, jM51541c6);
        long jM51541c8 = C17919x.m51541c(0.54f, ((C14970c1) ((C28655q) composer).m87161k(c28674u2)).m43090e());
        C28655q c28655q7 = (C28655q) composer;
        long j36 = ((C17919x) c28655q7.m87161k(c28596b0)).f69639a;
        if (((C14970c1) c28655q7.m87161k(c28674u2)).m43094i()) {
            AbstractC17918w0.m51536x(j36);
        } else {
            AbstractC17918w0.m51536x(j36);
        }
        long jM51541c9 = C17919x.m51541c(0.38f, jM51541c8);
        long jM43088c3 = ((C14970c1) ((C28655q) composer).m87161k(c28674u2)).m43088c();
        C28655q c28655q8 = (C28655q) composer;
        long jM43091f3 = ((C14970c1) c28655q8.m87161k(c28674u2)).m43091f();
        long j37 = ((C17919x) c28655q8.m87161k(c28596b0)).f69639a;
        long jM51541c10 = C17919x.m51541c((!((C14970c1) c28655q8.m87161k(c28674u2)).m43094i() ? ((double) AbstractC17918w0.m51536x(j37)) < d3 : ((double) AbstractC17918w0.m51536x(j37)) > d3) ? 0.87f : 1.0f, jM43091f3);
        C28655q c28655q9 = (C28655q) composer;
        long jM43090e2 = ((C14970c1) c28655q9.m87161k(c28674u2)).m43090e();
        long j38 = ((C17919x) c28655q9.m87161k(c28596b0)).f69639a;
        long jM51541c11 = C17919x.m51541c((!((C14970c1) c28655q9.m87161k(c28674u2)).m43094i() ? ((double) AbstractC17918w0.m51536x(j38)) < d3 : ((double) AbstractC17918w0.m51536x(j38)) > d3) ? 0.6f : 0.74f, jM43090e2);
        C28655q c28655q10 = (C28655q) composer;
        long j39 = ((C17919x) c28655q10.m87161k(c28596b0)).f69639a;
        if (((C14970c1) c28655q10.m87161k(c28674u2)).m43094i()) {
            AbstractC17918w0.m51536x(j39);
        } else {
            AbstractC17918w0.m51536x(j39);
        }
        long jM51541c12 = C17919x.m51541c(0.38f, jM51541c11);
        long jM43088c4 = ((C14970c1) ((C28655q) composer).m87161k(c28674u2)).m43088c();
        C28655q c28655q11 = (C28655q) composer;
        long jM43090e3 = ((C14970c1) c28655q11.m87161k(c28674u2)).m43090e();
        long j44 = ((C17919x) c28655q11.m87161k(c28596b0)).f69639a;
        long jM51541c13 = C17919x.m51541c((!((C14970c1) c28655q11.m87161k(c28674u2)).m43094i() ? ((double) AbstractC17918w0.m51536x(j44)) < d3 : ((double) AbstractC17918w0.m51536x(j44)) > d3) ? 0.6f : 0.74f, jM43090e3);
        C28655q c28655q12 = (C28655q) composer;
        long j45 = ((C17919x) c28655q12.m87161k(c28596b0)).f69639a;
        if (((C14970c1) c28655q12.m87161k(c28674u2)).m43094i()) {
            AbstractC17918w0.m51536x(j45);
        } else {
            AbstractC17918w0.m51536x(j45);
        }
        return new C15197y1(jM51541c, j34, jM43091f, jM43088c, jM51541c3, jM51541c4, jM43088c2, j29, jM51541c6, jM51541c7, jM51541c6, jM51541c8, jM51541c9, jM43088c3, j25, jM51541c10, jM51541c11, jM51541c12, jM43088c4, jM51541c13, C17919x.m51541c(0.38f, jM51541c13));
    }

    /* JADX INFO: renamed from: h */
    public static C15197y1 m43130h(long j7, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26, long j27, long j28, Composer composer, int i13) {
        long jM51541c;
        long jM51541c2;
        long jM51541c3;
        long jM43091f;
        long jM43088c;
        double d3;
        long jM51541c4;
        long jM51541c5;
        long jM51541c6;
        long jM43088c2;
        long jM51541c7;
        long jM51541c8;
        long jM51541c9;
        long jM51541c10;
        if ((i13 & 1) != 0) {
            C28655q c28655q = (C28655q) composer;
            jM51541c = C17919x.m51541c(((Number) c28655q.m87161k(AbstractC15047j1.f56336a)).floatValue(), ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a);
        } else {
            jM51541c = j7;
        }
        if ((i13 & 2) != 0) {
            C28655q c28655q2 = (C28655q) composer;
            long j29 = ((C17919x) c28655q2.m87161k(AbstractC15067l1.f56420a)).f69639a;
            if (((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                AbstractC17918w0.m51536x(j29);
            } else {
                AbstractC17918w0.m51536x(j29);
            }
            jM51541c2 = C17919x.m51541c(0.38f, jM51541c);
        } else {
            jM51541c2 = j13;
        }
        if ((i13 & 4) != 0) {
            jM51541c3 = C17919x.m51541c(0.12f, ((C14970c1) ((C28655q) composer).m87161k(AbstractC14981d1.f55997a)).m43090e());
        } else {
            jM51541c3 = j14;
        }
        if ((i13 & 8) != 0) {
            jM43091f = ((C14970c1) ((C28655q) composer).m87161k(AbstractC14981d1.f55997a)).m43091f();
        } else {
            jM43091f = j15;
        }
        if ((i13 & 16) != 0) {
            jM43088c = ((C14970c1) ((C28655q) composer).m87161k(AbstractC14981d1.f55997a)).m43088c();
        } else {
            jM43088c = j16;
        }
        if ((i13 & 32) != 0) {
            C28674u2 c28674u2 = AbstractC14981d1.f55997a;
            C28655q c28655q3 = (C28655q) composer;
            long jM43091f2 = ((C14970c1) c28655q3.m87161k(c28674u2)).m43091f();
            d3 = 0.5d;
            long j34 = ((C17919x) c28655q3.m87161k(AbstractC15067l1.f56420a)).f69639a;
            jM51541c4 = C17919x.m51541c((!((C14970c1) c28655q3.m87161k(c28674u2)).m43094i() ? ((double) AbstractC17918w0.m51536x(j34)) < 0.5d : ((double) AbstractC17918w0.m51536x(j34)) > 0.5d) ? 0.87f : 1.0f, jM43091f2);
        } else {
            d3 = 0.5d;
            jM51541c4 = j17;
        }
        if ((i13 & 64) != 0) {
            jM51541c5 = C17919x.m51541c(0.42f, ((C14970c1) ((C28655q) composer).m87161k(AbstractC14981d1.f55997a)).m43090e());
        } else {
            jM51541c5 = j18;
        }
        if ((i13 & 128) != 0) {
            C28655q c28655q4 = (C28655q) composer;
            long j35 = ((C17919x) c28655q4.m87161k(AbstractC15067l1.f56420a)).f69639a;
            if (((C14970c1) c28655q4.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                AbstractC17918w0.m51536x(j35);
            } else {
                AbstractC17918w0.m51536x(j35);
            }
            jM51541c6 = C17919x.m51541c(0.38f, jM51541c5);
        } else {
            jM51541c6 = j19;
        }
        if ((i13 & 256) != 0) {
            jM43088c2 = ((C14970c1) ((C28655q) composer).m87161k(AbstractC14981d1.f55997a)).m43088c();
        } else {
            jM43088c2 = j24;
        }
        C28674u2 c28674u3 = AbstractC14981d1.f55997a;
        long j36 = jM51541c6;
        long jM51541c11 = C17919x.m51541c(0.54f, ((C14970c1) ((C28655q) composer).m87161k(c28674u3)).m43090e());
        C28596b0 c28596b0 = AbstractC15067l1.f56420a;
        C28655q c28655q5 = (C28655q) composer;
        long j37 = jM51541c2;
        long j38 = ((C17919x) c28655q5.m87161k(c28596b0)).f69639a;
        if (((C14970c1) c28655q5.m87161k(c28674u3)).m43094i()) {
            AbstractC17918w0.m51536x(j38);
        } else {
            AbstractC17918w0.m51536x(j38);
        }
        long jM51541c12 = C17919x.m51541c(0.38f, jM51541c11);
        long jM51541c13 = C17919x.m51541c(0.54f, ((C14970c1) ((C28655q) composer).m87161k(c28674u3)).m43090e());
        C28655q c28655q6 = (C28655q) composer;
        long j39 = ((C17919x) c28655q6.m87161k(c28596b0)).f69639a;
        if (((C14970c1) c28655q6.m87161k(c28674u3)).m43094i()) {
            AbstractC17918w0.m51536x(j39);
        } else {
            AbstractC17918w0.m51536x(j39);
        }
        long jM51541c14 = C17919x.m51541c(0.38f, jM51541c13);
        long jM43088c3 = ((C14970c1) ((C28655q) composer).m87161k(c28674u3)).m43088c();
        if ((i13 & 32768) != 0) {
            C28655q c28655q7 = (C28655q) composer;
            long jM43091f3 = ((C14970c1) c28655q7.m87161k(c28674u3)).m43091f();
            long j44 = ((C17919x) c28655q7.m87161k(c28596b0)).f69639a;
            jM51541c7 = C17919x.m51541c((!((C14970c1) c28655q7.m87161k(c28674u3)).m43094i() ? ((double) AbstractC17918w0.m51536x(j44)) < d3 : ((double) AbstractC17918w0.m51536x(j44)) > d3) ? 0.87f : 1.0f, jM43091f3);
        } else {
            jM51541c7 = j25;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
            C28655q c28655q8 = (C28655q) composer;
            long jM43090e = ((C14970c1) c28655q8.m87161k(c28674u3)).m43090e();
            long j45 = ((C17919x) c28655q8.m87161k(c28596b0)).f69639a;
            jM51541c8 = C17919x.m51541c((!((C14970c1) c28655q8.m87161k(c28674u3)).m43094i() ? ((double) AbstractC17918w0.m51536x(j45)) < d3 : ((double) AbstractC17918w0.m51536x(j45)) > d3) ? 0.6f : 0.74f, jM43090e);
        } else {
            jM51541c8 = j26;
        }
        C28655q c28655q9 = (C28655q) composer;
        long j46 = ((C17919x) c28655q9.m87161k(c28596b0)).f69639a;
        if (((C14970c1) c28655q9.m87161k(c28674u3)).m43094i()) {
            AbstractC17918w0.m51536x(j46);
        } else {
            AbstractC17918w0.m51536x(j46);
        }
        long jM51541c15 = C17919x.m51541c(0.38f, jM51541c8);
        long jM43088c4 = ((C14970c1) ((C28655q) composer).m87161k(c28674u3)).m43088c();
        if ((i13 & 524288) != 0) {
            C28655q c28655q10 = (C28655q) composer;
            long jM43090e2 = ((C14970c1) c28655q10.m87161k(c28674u3)).m43090e();
            long j47 = ((C17919x) c28655q10.m87161k(c28596b0)).f69639a;
            jM51541c9 = C17919x.m51541c((!((C14970c1) c28655q10.m87161k(c28674u3)).m43094i() ? ((double) AbstractC17918w0.m51536x(j47)) < d3 : ((double) AbstractC17918w0.m51536x(j47)) > d3) ? 0.6f : 0.74f, jM43090e2);
        } else {
            jM51541c9 = j27;
        }
        if ((i13 & 1048576) != 0) {
            C28655q c28655q11 = (C28655q) composer;
            long j48 = ((C17919x) c28655q11.m87161k(c28596b0)).f69639a;
            if (((C14970c1) c28655q11.m87161k(c28674u3)).m43094i()) {
                AbstractC17918w0.m51536x(j48);
            } else {
                AbstractC17918w0.m51536x(j48);
            }
            jM51541c10 = C17919x.m51541c(0.38f, jM51541c9);
        } else {
            jM51541c10 = j28;
        }
        return new C15197y1(jM51541c, j37, jM43091f, jM43088c, jM51541c4, jM51541c5, jM43088c2, j36, jM51541c11, jM51541c12, jM51541c11, jM51541c13, jM51541c14, jM43088c3, jM51541c3, jM51541c7, jM51541c8, jM51541c15, jM43088c4, jM51541c9, jM51541c10);
    }

    /* JADX INFO: renamed from: a */
    public final void m43131a(final boolean z4, final boolean z13, final InterfaceC21083i interfaceC21083i, final InterfaceC14999e8 interfaceC14999e8, final InterfaceC17869a1 interfaceC17869a1, float f13, float f14, Composer composer, final int i13, final int i14) {
        float f15;
        float f16;
        final float f17;
        final float f18;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(943754022);
        int i16 = i13 | (c28655q.m87155h(z4) ? 4 : 2) | (c28655q.m87155h(z13) ? 32 : 16) | (c28655q.m87153g(interfaceC21083i) ? 256 : 128) | (c28655q.m87153g(interfaceC14999e8) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87153g(interfaceC17869a1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK);
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if ((i14 & 32) == 0) {
                f15 = f13;
                if (c28655q.m87147d(f15)) {
                    i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                i16 |= i15;
            } else {
                f15 = f13;
            }
            i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            i16 |= i15;
        } else {
            f15 = f13;
        }
        if ((i13 & 1572864) == 0) {
            if ((i14 & 64) == 0) {
                f16 = f14;
                int i17 = c28655q.m87147d(f16) ? 1048576 : 524288;
                i16 |= i17;
            } else {
                f16 = f14;
            }
            i16 |= i17;
        } else {
            f16 = f14;
        }
        if (c28655q.m87135U(i16 & 1, (4793491 & i16) != 4793490)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 32) != 0) {
                    i16 &= -458753;
                    f15 = f56317e;
                }
                if ((i14 & 64) != 0) {
                    i16 &= -3670017;
                    f16 = f56316d;
                }
            } else {
                c28655q.m87138X();
                if ((i14 & 32) != 0) {
                    i16 &= -458753;
                }
                if ((i14 & 64) != 0) {
                    i16 &= -3670017;
                }
            }
            float f19 = f15;
            float f24 = f16;
            c28655q.m87175r();
            int i18 = i16 & 8190;
            int i19 = i16 >> 3;
            AbstractC22989q.m66760a(AbstractC15751g.m44454g(C2314t.f9131w, (C13825t) AbstractC34870c0.m110023y(z4, z13, interfaceC21083i, interfaceC14999e8, f19, f24, c28655q, i18 | (57344 & i19) | (i19 & 458752)).getValue(), interfaceC17869a1), c28655q, 0);
            f17 = f19;
            f18 = f24;
        } else {
            c28655q.m87138X();
            f17 = f15;
            f18 = f16;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.g8
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f56218w.m43131a(z4, z13, interfaceC21083i, interfaceC14999e8, interfaceC17869a1, f17, f18, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m43132b(String str, InterfaceC4351m interfaceC4351m, boolean z4, boolean z13, InterfaceC29873g0 interfaceC29873g0, InterfaceC21083i interfaceC21083i, boolean z14, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, InterfaceC4351m interfaceC4351m4, InterfaceC4351m interfaceC4351m5, InterfaceC17869a1 interfaceC17869a1, InterfaceC14999e8 interfaceC14999e8, InterfaceC22973k1 interfaceC22973k1, C37816b c37816b, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4351m interfaceC4351m6;
        boolean z15;
        boolean z16;
        InterfaceC4351m interfaceC4351m7;
        C28655q c28655q;
        InterfaceC22973k1 interfaceC22973k2;
        InterfaceC4351m interfaceC4351m8;
        InterfaceC22973k1 c22976l1;
        InterfaceC22973k1 interfaceC22973k3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1154925202);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            interfaceC4351m6 = interfaceC4351m;
            i15 |= c28655q2.m87157i(interfaceC4351m6) ? 32 : 16;
        } else {
            interfaceC4351m6 = interfaceC4351m;
        }
        if ((i13 & 384) == 0) {
            z15 = z4;
            i15 |= c28655q2.m87155h(z15) ? 256 : 128;
        } else {
            z15 = z4;
        }
        if ((i13 & 3072) == 0) {
            z16 = z13;
            i15 |= c28655q2.m87155h(z16) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            z16 = z13;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87153g(interfaceC29873g0) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i15 |= c28655q2.m87153g(interfaceC21083i) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c28655q2.m87155h(z14) ? 1048576 : 524288;
        }
        int i16 = i14 & 128;
        if (i16 != 0) {
            i15 |= 12582912;
            interfaceC4351m7 = interfaceC4351m2;
        } else {
            interfaceC4351m7 = interfaceC4351m2;
            if ((i13 & 12582912) == 0) {
                i15 |= c28655q2.m87157i(interfaceC4351m7) ? 8388608 : 4194304;
            }
        }
        if ((i13 & 100663296) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4351m3) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= c28655q2.m87157i(interfaceC4351m4) ? 536870912 : 268435456;
        }
        int i17 = 221184 | (c28655q2.m87157i(interfaceC4351m5) ? 4 : 2) | (c28655q2.m87153g(interfaceC17869a1) ? 32 : 16) | (c28655q2.m87153g(interfaceC14999e8) ? 256 : 128) | (((i14 & DfuBaseService.ERROR_REMOTE_MASK) == 0 && c28655q2.m87153g(interfaceC22973k1)) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if (c28655q2.m87135U(i15 & 1, ((i15 & 306783379) == 306783378 && (74899 & i17) == 74898) ? false : true)) {
            c28655q2.m87140Z();
            if ((i13 & 1) == 0 || c28655q2.m87118C()) {
                InterfaceC4351m interfaceC4351m9 = i16 != 0 ? null : interfaceC4351m7;
                if ((i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    float f13 = AbstractC15114p8.f56624a;
                    c22976l1 = new C22976l1(f13, f13, f13, f13);
                    i17 &= -7169;
                } else {
                    c22976l1 = interfaceC22973k1;
                }
                interfaceC22973k3 = c22976l1;
                interfaceC4351m7 = interfaceC4351m9;
            } else {
                c28655q2.m87138X();
                if ((i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    i17 &= -7169;
                }
                interfaceC22973k3 = interfaceC22973k1;
            }
            c28655q2.m87175r();
            c28655q = c28655q2;
            int i18 = i15 << 3;
            int i19 = i15 >> 9;
            int i24 = (i18 & 896) | (i18 & 112) | 6 | ((i15 >> 3) & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016) | ((i17 << 21) & 29360128) | ((i15 << 15) & 234881024) | ((i15 << 21) & 1879048192);
            int i25 = ((i15 >> 18) & 14) | ((i15 >> 12) & 112) | ((i17 >> 3) & 896);
            int i26 = i17 << 6;
            InterfaceC4351m interfaceC4351m10 = interfaceC4351m7;
            boolean z17 = z15;
            AbstractC15114p8.m43174a(EnumC14967b9.f55876x, str, interfaceC4351m6, interfaceC29873g0, interfaceC4351m10, interfaceC4351m3, interfaceC4351m4, interfaceC4351m5, z16, z17, z14, interfaceC21083i, interfaceC22973k3, interfaceC17869a1, interfaceC14999e8, c37816b, c28655q, i24, (i26 & 57344) | i25 | (i26 & 7168) | ProfileVerifier.CompilationStatus.f6515xf2722a21);
            interfaceC4351m8 = interfaceC4351m10;
            interfaceC22973k2 = interfaceC22973k3;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC22973k2 = interfaceC22973k1;
            interfaceC4351m8 = interfaceC4351m7;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15010f8(this, str, interfaceC4351m, z4, z13, interfaceC29873g0, interfaceC21083i, z14, interfaceC4351m8, interfaceC4351m3, interfaceC4351m4, interfaceC4351m5, interfaceC17869a1, interfaceC14999e8, interfaceC22973k2, c37816b, i13, i14);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m43133c(String str, InterfaceC4351m interfaceC4351m, boolean z4, boolean z13, InterfaceC29873g0 interfaceC29873g0, InterfaceC21083i interfaceC21083i, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, InterfaceC4351m interfaceC4351m4, InterfaceC17869a1 interfaceC17869a1, C15197y1 c15197y1, InterfaceC22973k1 interfaceC22973k1, Composer composer, int i13, int i14, int i15) {
        int i16;
        InterfaceC4351m interfaceC4351m5;
        boolean z14;
        boolean z15;
        InterfaceC4351m interfaceC4351m6;
        InterfaceC4351m interfaceC4351m7;
        int i17;
        C28655q c28655q;
        InterfaceC17869a1 interfaceC17869a2;
        InterfaceC4351m interfaceC4351m8;
        InterfaceC22973k1 interfaceC22973k2;
        InterfaceC17869a1 interfaceC17869a1M43127e;
        InterfaceC22973k1 interfaceC22973k3;
        InterfaceC4351m interfaceC4351m9;
        InterfaceC4351m interfaceC4351m10;
        C22976l1 c22976l1;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(2088762355);
        if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87153g(str) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            interfaceC4351m5 = interfaceC4351m;
            i16 |= c28655q2.m87157i(interfaceC4351m5) ? 32 : 16;
        } else {
            interfaceC4351m5 = interfaceC4351m;
        }
        if ((i13 & 384) == 0) {
            z14 = z4;
            i16 |= c28655q2.m87155h(z14) ? 256 : 128;
        } else {
            z14 = z4;
        }
        int i18 = i13 & 3072;
        int i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i18 == 0) {
            z15 = z13;
            i16 |= c28655q2.m87155h(z15) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            z15 = z13;
        }
        if ((i13 & 24576) == 0) {
            i16 |= c28655q2.m87153g(interfaceC29873g0) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i16 |= c28655q2.m87153g(interfaceC21083i) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i15 & 64) != 0) {
            i16 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            i16 |= c28655q2.m87155h(false) ? 1048576 : 524288;
        }
        int i24 = i15 & 128;
        if (i24 != 0) {
            i16 |= 12582912;
            interfaceC4351m6 = interfaceC4351m2;
        } else {
            interfaceC4351m6 = interfaceC4351m2;
            if ((i13 & 12582912) == 0) {
                i16 |= c28655q2.m87157i(interfaceC4351m6) ? 8388608 : 4194304;
            }
        }
        if ((i13 & 100663296) == 0) {
            i16 |= c28655q2.m87157i(interfaceC4351m3) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i15 & 512) != 0) {
            i16 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            i16 |= c28655q2.m87157i(null) ? 536870912 : 268435456;
        }
        int i25 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i25 != 0) {
            i17 = i14 | 6;
            interfaceC4351m7 = interfaceC4351m4;
        } else {
            interfaceC4351m7 = interfaceC4351m4;
            i17 = i14 | (c28655q2.m87157i(interfaceC4351m7) ? 4 : 2);
        }
        int i26 = i17 | (((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 && c28655q2.m87153g(interfaceC17869a1)) ? 32 : 16) | (c28655q2.m87153g(c15197y1) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0 || !c28655q2.m87153g(interfaceC22973k1)) {
                i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i26 |= i19;
        }
        int i27 = i26;
        if (c28655q2.m87135U(i16 & 1, ((i16 & 306783379) == 306783378 && (i27 & 9363) == 9362) ? false : true)) {
            c28655q2.m87140Z();
            if ((i13 & 1) == 0 || c28655q2.m87118C()) {
                if (i24 != 0) {
                    interfaceC4351m6 = null;
                }
                InterfaceC4351m interfaceC4351m11 = i25 != 0 ? null : interfaceC4351m7;
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                    interfaceC17869a1M43127e = m43127e(c28655q2);
                    i27 &= -113;
                } else {
                    interfaceC17869a1M43127e = interfaceC17869a1;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    if (interfaceC4351m6 == null) {
                        float f13 = AbstractC15114p8.f56624a;
                        c22976l1 = new C22976l1(f13, f13, f13, f13);
                    } else {
                        float f14 = AbstractC15114p8.f56624a;
                        c22976l1 = new C22976l1(f14, AbstractC15164u8.f56885a, f14, AbstractC15164u8.f56886b);
                    }
                    i27 &= -7169;
                    interfaceC22973k3 = c22976l1;
                } else {
                    interfaceC22973k3 = interfaceC22973k1;
                }
                interfaceC4351m9 = interfaceC4351m6;
                interfaceC4351m10 = interfaceC4351m11;
            } else {
                c28655q2.m87138X();
                if ((i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                    i27 &= -113;
                }
                if ((i15 & DfuBaseService.ERROR_REMOTE_MASK) != 0) {
                    i27 &= -7169;
                }
                interfaceC17869a1M43127e = interfaceC17869a1;
                interfaceC22973k3 = interfaceC22973k1;
                interfaceC4351m9 = interfaceC4351m6;
                interfaceC4351m10 = interfaceC4351m7;
            }
            c28655q2.m87175r();
            EnumC14967b9 enumC14967b9 = EnumC14967b9.f55875w;
            int i28 = i16 << 3;
            int i29 = i16 >> 9;
            int i34 = (i28 & 896) | (i28 & 112) | 6 | ((i16 >> 3) & 7168) | (i29 & 57344) | (458752 & i29) | (i29 & 3670016) | ((i27 << 21) & 29360128) | ((i16 << 15) & 234881024) | (1879048192 & (i16 << 21));
            int i35 = ((i16 >> 18) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i16 >> 12) & 112) | ((i27 >> 3) & 896);
            int i36 = i27 << 6;
            c28655q = c28655q2;
            AbstractC15114p8.m43174a(enumC14967b9, str, interfaceC4351m5, interfaceC29873g0, interfaceC4351m9, interfaceC4351m3, null, interfaceC4351m10, z15, z14, false, interfaceC21083i, interfaceC22973k3, interfaceC17869a1M43127e, c15197y1, null, c28655q, i34, i35 | (i36 & 7168) | (i36 & 57344));
            interfaceC4351m6 = interfaceC4351m9;
            interfaceC4351m8 = interfaceC4351m10;
            interfaceC22973k2 = interfaceC22973k3;
            interfaceC17869a2 = interfaceC17869a1M43127e;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC17869a2 = interfaceC17869a1;
            interfaceC4351m8 = interfaceC4351m7;
            interfaceC22973k2 = interfaceC22973k1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4150x4(this, str, interfaceC4351m, z4, z13, interfaceC29873g0, interfaceC21083i, interfaceC4351m6, interfaceC4351m3, interfaceC4351m8, interfaceC17869a2, c15197y1, interfaceC22973k2, i13, i14, i15);
        }
    }
}
