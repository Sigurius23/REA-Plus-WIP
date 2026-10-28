package p163g1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import f01.C13857f;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p133f1.C13996z;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33244a;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.s6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15142s6 {

    /* JADX INFO: renamed from: c */
    public static final float f56781c;

    /* JADX INFO: renamed from: e */
    public static final float f56783e;

    /* JADX INFO: renamed from: a */
    public static final float f56779a = 30;

    /* JADX INFO: renamed from: b */
    public static final float f56780b = 16;

    /* JADX INFO: renamed from: d */
    public static final float f56782d = 6;

    /* JADX INFO: renamed from: f */
    public static final float f56784f = 48;

    /* JADX INFO: renamed from: g */
    public static final float f56785g = 68;

    static {
        float f13 = 8;
        f56781c = f13;
        f56783e = f13;
    }

    /* JADX INFO: renamed from: a */
    public static final void m43187a(C37816b c37816b, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1302703572);
        int i14 = (c28655q.m87157i(c37816b) ? 4 : 2) | i13 | (c28655q.m87157i(interfaceC4351m) ? 32 : 16);
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f56780b, 0.0f, f56781c, 0.0f, 10);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C14979d(3);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R;
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1131a.m3499c(c2314t, "text"), 0.0f, f56782d, 1);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
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
            AbstractC18489d0.m53384y(i14 & 14, c37816b, c28655q, true);
            Modifier modifierM3499c = AbstractC1131a.m3499c(c2314t, "action");
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3499c);
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
            AbstractC11895b.m31978A((i14 >> 3) & 14, interfaceC4351m, c28655q, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13857f(c37816b, interfaceC4351m, i13, 14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43188b(Modifier modifier, InterfaceC4351m interfaceC4351m, InterfaceC17869a1 interfaceC17869a1, long j7, long j13, float f13, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-662779944);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4351m) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87155h(false) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87153g(interfaceC17869a1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87151f(j7) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87151f(j13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i14 |= c28655q2.m87147d(f13) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q2.m87157i(c37816b) ? 8388608 : 4194304;
        }
        if (c28655q2.m87135U(i14 & 1, (4793491 & i14) != 4793490)) {
            c28655q2.m87140Z();
            if ((i13 & 1) != 0 && !c28655q2.m87118C()) {
                c28655q2.m87138X();
            }
            c28655q2.m87175r();
            int i15 = i14 >> 6;
            c28655q = c28655q2;
            AbstractC17269i.m48898k(modifier, interfaceC17869a1, j7, j13, null, f13, AbstractC37817c.m121344e(-1429068516, c28655q2, new C15034i(interfaceC4351m, c37816b, 4)), c28655q, 1572864 | (i14 & 14) | (i15 & 112) | (i15 & 896) | (i15 & 7168) | ((i14 >> 3) & 458752), 16);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15046j0(modifier, interfaceC4351m, interfaceC17869a1, j7, j13, f13, c37816b, i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m43189c(C15072l6 c15072l6, Modifier modifier, InterfaceC17869a1 interfaceC17869a1, long j7, long j13, long j14, float f13, Composer composer, final int i13) {
        int i14;
        C15072l6 c15072l7;
        final Modifier modifier2;
        final InterfaceC17869a1 interfaceC17869a2;
        final long j15;
        final long j16;
        final float f14;
        final long j17;
        long jM51528p;
        int i15;
        InterfaceC17869a1 interfaceC17869a3;
        Modifier modifier3;
        float f15;
        long j18;
        long j19;
        long j24;
        long j25;
        C37816b c37816bM121344e;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(258660814);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c15072l6) : c28655q.m87157i(c15072l6) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i16 = i14 | 432;
        if ((i13 & 3072) == 0) {
            i16 = i14 | 1456;
        }
        if ((i13 & 24576) == 0) {
            i16 |= DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i16 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i16 |= 524288;
        }
        int i17 = i16 | 12582912;
        if (c28655q.m87135U(i17 & 1, (4793491 & i17) != 4793490)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                AbstractC33244a abstractC33244a = ((C15071l5) c28655q.m87161k(AbstractC15081m5.f56461a)).f56427a;
                C28674u2 c28674u2 = AbstractC14981d1.f55997a;
                long jM51528p2 = AbstractC17918w0.m51528p(C17919x.m51541c(0.8f, ((C14970c1) c28655q.m87161k(c28674u2)).m43090e()), ((C14970c1) c28655q.m87161k(c28674u2)).m43093h());
                long jM43093h = ((C14970c1) c28655q.m87161k(c28674u2)).m43093h();
                C14970c1 c14970c1 = (C14970c1) c28655q.m87161k(c28674u2);
                if (c14970c1.m43094i()) {
                    jM51528p = AbstractC17918w0.m51528p(C17919x.m51541c(0.6f, c14970c1.m43093h()), c14970c1.m43091f());
                } else {
                    jM51528p = ((C17919x) c14970c1.f55894b.getValue()).f69639a;
                }
                i15 = i17 & (-4193281);
                interfaceC17869a3 = abstractC33244a;
                modifier3 = C2314t.f9131w;
                f15 = 6;
                j18 = jM51528p;
                j19 = jM51528p2;
                j24 = jM43093h;
            } else {
                c28655q.m87138X();
                modifier3 = modifier;
                j19 = j7;
                j24 = j13;
                j18 = j14;
                f15 = f13;
                i15 = i17 & (-4193281);
                interfaceC17869a3 = interfaceC17869a1;
            }
            c28655q.m87175r();
            String str = c15072l6.f56431b;
            if (str != null) {
                c28655q.m87150e0(593509092);
                long j26 = j18;
                C15132r6 c15132r6 = new C15132r6(c15072l6, j26, str, 0);
                c15072l7 = c15072l6;
                j25 = j26;
                c37816bM121344e = AbstractC37817c.m121344e(1843479216, c28655q, c15132r6);
                c28655q.m87173q(false);
            } else {
                c15072l7 = c15072l6;
                j25 = j18;
                c28655q.m87150e0(593808056);
                c28655q.m87173q(false);
                c37816bM121344e = null;
            }
            float f16 = f15;
            m43188b(AbstractC1099a.m3394p(12, modifier3), c37816bM121344e, interfaceC17869a3, j19, j24, f16, AbstractC37817c.m121344e(-261845785, c28655q, new C15062k6(c15072l7, 1)), c28655q, (i15 & 896) | 12582912 | ((i15 >> 3) & 3670016));
            f14 = f16;
            j17 = j25;
            j16 = j24;
            j15 = j19;
            interfaceC17869a2 = interfaceC17869a3;
            modifier2 = modifier3;
        } else {
            c15072l7 = c15072l6;
            c28655q.m87138X();
            modifier2 = modifier;
            interfaceC17869a2 = interfaceC17869a1;
            j15 = j7;
            j16 = j13;
            f14 = f13;
            j17 = j14;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final C15072l6 c15072l8 = c15072l7;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: g1.o6
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC15142s6.m43189c(c15072l8, modifier2, interfaceC17869a2, j15, j16, j17, f14, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m43190d(C37816b c37816b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(343813818);
        int i14 = (c28655q.m87157i(c37816b) ? 4 : 2) | i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = C14979d.f55985d;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R;
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, f56780b, f56782d);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            c28655q.m87158i0();
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
            c37816b.invoke(c28655q, Integer.valueOf(i14 & 14));
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13996z(c37816b, i13, 2);
        }
    }
}
