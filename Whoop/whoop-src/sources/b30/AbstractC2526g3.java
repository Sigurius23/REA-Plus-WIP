package b30;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import d40.AbstractC11672q;
import d40.AbstractC11673r;
import d40.C11674s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p000.C26047n;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p023ay.C2140n;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2464x2;
import p163g1.AbstractC14983d3;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15086n0;
import p163g1.C15069l3;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p490t0.AbstractC33253j;
import p513u4.AbstractC34523k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39183o;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.g3 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2526g3 {

    /* JADX INFO: renamed from: a */
    public static final float f9822a = 56;

    /* JADX INFO: renamed from: a */
    public static final void m7462a(int i13, boolean z4, long j7, InterfaceC4339a interfaceC4339a, Composer composer, int i14) {
        Typeface typefaceM109098b;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-555214987);
        int i15 = i14 | (c28655q.m87149e(i13) ? 4 : 2) | (c28655q.m87155h(z4) ? 32 : 16) | (c28655q.m87151f(j7) ? 256 : 128) | (c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((i15 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            C11674s c11674sM31084m = AbstractC11673r.m31084m(c28655q);
            c28655q.m87150e0(-1272516412);
            boolean zM87153g = c28655q.m87153g(c11674sM31084m);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                Integer num = c11674sM31084m.f37729k;
                if (num == null || (typefaceM109098b = AbstractC34523k.m109098b(context, num.intValue())) == null) {
                    typefaceM109098b = Typeface.DEFAULT;
                }
                objM87133R = typefaceM109098b;
                c28655q.m87172p0(objM87133R);
            }
            Typeface typeface = (Typeface) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(-1272510751);
            boolean zM87153g2 = c28655q.m87153g(c11674sM31084m);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C39183o(interfaceC39171c.mo735h(C39183o.m124805c(AbstractC11672q.f37694d.f37725g) * c11674sM31084m.f37722d));
                c28655q.m87172p0(objM87133R2);
            }
            long j13 = ((C39183o) objM87133R2).f168429a;
            c28655q.m87173q(false);
            AbstractC14983d3.m43104a(interfaceC4339a, AbstractC1099a.m3398t(AbstractC1136a.m3599a(C2314t.f9131w, "PaymentSheetEditButton"), 0.0f, 0.0f, 10, 0.0f, 11), z4, AbstractC37817c.m121344e(1983637009, c28655q, new C2486b3(i13, j7, j13, typeface)), c28655q, ((i15 << 3) & 896) | ((i15 >> 9) & 14) | 24624, 8);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2478a3(i13, z4, j7, interfaceC4339a, i14);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m7463b(float f13, int i13, Composer composer, C2550j3 state, InterfaceC4339a onNavigationIconPressed, boolean z4, boolean z13) {
        int i14;
        boolean z14;
        C28655q c28655q;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onNavigationIconPressed, "onNavigationIconPressed");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1583235568);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87147d(f13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(onNavigationIconPressed) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i14 & 9363) == 9362 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
            z14 = z13;
        } else {
            InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p);
            long j7 = AbstractC11673r.m31082k(c28655q2).f37675h;
            z14 = z13;
            c28655q = c28655q2;
            AbstractC15086n0.m43160d(AbstractC37817c.m121344e(1485633716, c28655q2, new C2140n(state, 3)), null, AbstractC37817c.m121344e(1984190518, c28655q2, new C2510e3(interfaceC2464x2, onNavigationIconPressed, z13, z4, j7)), AbstractC37817c.m121344e(1793907103, c28655q2, new C2518f3(state, z14, j7)), C15069l3.m43147a(c28655q2).m43093h(), 0L, f13, c28655q, ((i14 << 9) & 3670016) | 3462, 34);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2668z2(state, z4, z14, f13, onNavigationIconPressed, i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m7464c(float f13, int i13, Composer composer, C2550j3 c2550j3, InterfaceC4339a handleBackPressed, boolean z4, boolean z13) {
        C2550j3 c2550j4;
        boolean z14;
        boolean z15;
        float f14;
        AbstractC22676k.m65750j(handleBackPressed, "handleBackPressed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(284933000);
        int i14 = (c28655q.m87153g(c2550j3) ? 4 : 2) | i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        int i15 = i14 | (c28655q.m87157i(handleBackPressed) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | 24576;
        if ((i15 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
            c2550j4 = c2550j3;
            z14 = z4;
            z15 = z13;
            f14 = f13;
        } else {
            float f15 = 0;
            if (c2550j3 != null) {
                c2550j4 = c2550j3;
                m7463b(f15, (i15 & 1022) | 3072 | ((i15 << 3) & 57344), c28655q, c2550j4, handleBackPressed, z4, z13);
                z14 = z4;
                z15 = z13;
            } else {
                c2550j4 = c2550j3;
                z14 = z4;
                z15 = z13;
            }
            f14 = f15;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2668z2(c2550j4, z14, z15, handleBackPressed, f14, i13);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m7465d(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1806667293);
        if (i13 == 0 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            long jM110156q = AbstractC34924m.m110156q(c28655q, R.color.stripe_paymentsheet_testmode_background);
            long jM110156q2 = AbstractC34924m.m110156q(c28655q, R.color.stripe_paymentsheet_testmode_text);
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3358c(C2314t.f9131w, jM110156q, AbstractC33253j.m105489e(5)), 6, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC15011f9.m43114b("TEST", null, jM110156q2, 0L, null, C28780r.f116542I, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 196614, 0, 131034);
            c28655q = c28655q;
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26047n(i13, 13);
        }
    }
}
