package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import az0.AbstractC2159b;
import bm0.C3412o;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k91.C22302a;
import kd1.AbstractC22399k;
import l83.C23454a0;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.y8 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001d\u0010\u0006\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ll83/a0;", "c", "(Landroidx/compose/runtime/Composer;I)V", "", "Li91/a;", "backgrounds", "e", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40526y8 {
    /* JADX INFO: renamed from: c */
    public static final void m131238c(Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1300913102);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            List listM118959K = AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q, i15).getRecoveryLowRecovery()), new C17919x(c38072d.m121949b(c28655q, i15).getRecoveryMediumRecovery()), new C17919x(c38072d.m121949b(c28655q, i15).getRecoveryHighRecovery()));
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
            Iterator it = listM118959K.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC18249c.m52577o(((C17919x) it.next()).f69639a));
            }
            C17909s c17909s = AbstractC17911t.f69612b;
            C38072d c38072d2 = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            List listM118959K2 = AbstractC37056f.m118959K(C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, i16).getStrainZone1()), new C17919x(c38072d2.m121949b(c28655q, i16).getStrainZone2())), 0.0f, 0.0f, 14), C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, i16).getStrainZone2()), new C17919x(c38072d2.m121949b(c28655q, i16).getStrainZone3())), 0.0f, 0.0f, 14), C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, i16).getStrainZone4()), new C17919x(c38072d2.m121949b(c28655q, i16).getStrainZone5())), 0.0f, 0.0f, 14), C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d2.m121949b(c28655q, i16).getStrainZone5()), new C17919x(c38072d2.m121949b(c28655q, i16).getStrainZone1())), 0.0f, 0.0f, 14));
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM118959K2, 10));
            Iterator it3 = listM118959K2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(AbstractC18249c.m52570h((AbstractC17911t) it3.next()));
            }
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            AbstractC22399k.m64473c("Solid Colors", c28655q, 6);
            m131240e(arrayList, c28655q, 0);
            AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
            AbstractC22399k.m64473c("Gradients", c28655q, 6);
            m131240e(arrayList2, c28655q, 0);
            i14 = 1;
            c28655q.m87173q(true);
        } else {
            i14 = 1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40506w8(i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m131239d(int i13, Composer composer, int i14) {
        m131238c(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private static final void m131240e(List<? extends AbstractC18247a> list, Composer composer, int i13) {
        C28655q c28655q;
        Float fValueOf = Float.valueOf(0.5f);
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-957964052);
        int i14 = (i13 & 6) == 0 ? (c28655q2.m87157i(list) ? 4 : 2) | i13 : i13;
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            List listM118959K = AbstractC37056f.m118959K(Float.valueOf(0.25f), Float.valueOf(0.4f), Float.valueOf(0.1f), fValueOf, Float.valueOf(0.75f), Float.valueOf(1.0f), fValueOf, Float.valueOf(0.3f), Float.valueOf(0.6f), Float.valueOf(0.9f));
            float f13 = 8;
            float f14 = f13 * 0.5f;
            float f15 = 1 * f13;
            C2314t c2314t = C2314t.f9131w;
            float f16 = 4 * 1.0f;
            Modifier modifierM52565c = AbstractC18249c.m52565c(AbstractC37056f.m118994r(AbstractC1102d.m3411h(240, AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3395q(c2314t, f14, f15))), C22302a.INSTANCE.m64093a(f16).m64090c()), AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getWhite20()));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9104G, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM52565c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            c28655q2.m87150e0(-1234151841);
            int i15 = 0;
            for (Object obj : listM118959K) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C2314t c2314t2 = c2314t;
                AbstractC2159b.m6721b(AbstractC29011e.m88145f(c2314t2, i15 * 0.1f, 0.0f, 0.1f, ((Number) obj).floatValue(), null, 18, null), list.get(i15 % list.size()), C22302a.Companion.m64092d(C22302a.INSTANCE, f16, 0.0f, 2, null), c28655q2, (AbstractC18247a.f71043a << 3) | (C22302a.f87021f << 6), 0);
                i15 = i16;
                c2314t = c2314t2;
            }
            c28655q = c28655q2;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m131241f(List list, int i13, Composer composer, int i14) {
        m131240e(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
