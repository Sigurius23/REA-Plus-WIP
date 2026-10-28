package p741vn1;

import a11.C0131i;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import bp0.C3527o;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p208i2.C17893k;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: vn1.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Ll83/a0;", "g", "(Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "content", "d", "(Lc93/m;Landroidx/compose/runtime/Composer;I)V", "home-notifications-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36209m {
    /* JADX INFO: renamed from: d */
    public static final void m115227d(InterfaceC4351m content, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1274041563);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(content) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C28674u2 c28674u2 = AbstractC2453v1.f9569h;
            float f13 = 4;
            final float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0(3 * f13);
            final float fMo743q1 = ((InterfaceC39171c) c28655q.m87161k(c28674u2)).mo743q0((float) 1.5d);
            final long jM125370W0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10();
            C22949e c22949e = AbstractC22977m.f90650a;
            float f14 = 8;
            C22971k c22971kM66748k = AbstractC22977m.m66748k(1 * f14, C2299e.f9108K);
            C2305k c2305k = C2299e.f9111N;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(35 * f13, C2314t.f9131w));
            boolean zM87147d = c28655q.m87147d(fMo743q1) | c28655q.m87147d(fMo743q0) | c28655q.m87151f(jM125370W0);
            Object objM87133R = c28655q.m87133R();
            if (zM87147d || objM87133R == C28635l.f115821a) {
                objM87133R = new Function1() { // from class: vn1.l
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC36209m.m115228e(fMo743q1, fMo743q0, jM125370W0, (InterfaceC22131e) obj);
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1125a.m3478a(modifierM3409f, (Function1) objM87133R), ((float) 6.5d) * f14, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66748k, c2305k, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC11895b.m32007z(i14 & 14, content, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3527o(content, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m115228e(float f13, float f14, long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63374D(drawBehind, j7, 0L, 0L, (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L), new C22135i(f13, 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f)), 14), 0.0f, 230);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m115229f(InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m115227d(interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m115230g(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1127154710);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            m115227d(C36199c.f154997a.m115199d(), c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0131i(i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m115231h(int i13, Composer composer, int i14) {
        m115230g(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
