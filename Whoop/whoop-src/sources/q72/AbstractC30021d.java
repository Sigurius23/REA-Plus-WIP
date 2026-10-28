package q72;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m72.C25211j;
import m72.C25212k;
import no0.C26984y0;
import ny0.AbstractC27271o0;
import os0.C28308d;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import pp2.C29451o;
import pt2.C29529k;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: q72.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lm72/k;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lm72/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "f", "(Lm72/k;Landroidx/compose/runtime/Composer;I)V", "sage_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30021d {
    /* JADX INFO: renamed from: f */
    public static final void m91908f(C25212k viewState, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(2035140281);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            String strM73840b = viewState.getCardTitle();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8414L = c38072d.m121952e(c28655q2, i15).getSh4();
            long brandWhite = c38072d.m121949b(c28655q2, i15).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM73840b, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q2, 0, i16, 196602);
            AbstractC30795n.m94707h(viewState.getCardSubtitle(), null, c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB2(), null, c28655q2, 0, i16, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(viewState, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m91909g(C25212k c25212k, int i13, Composer composer, int i14) {
        m91908f(c25212k, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:34:0x0141  */
    /* JADX WARN: Code duplicated, block: B:37:0x014b  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public static final void m91910h(C25212k viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1551809863);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C29529k(29);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 3, 4);
                C17909s c17909s = AbstractC17911t.f69612b;
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                AbstractC31926e.m99375j(AbstractC1092a.m3357b(AbstractC1092a.m3357b(modifierM53364e, C17909s.m51486d(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, c38072d.m121949b(c28655q, i17).getStrainZone1())), new C17919x(C17919x.m51541c(0.0f, c38072d.m121949b(c28655q, i17).getStrainZone1()))), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1200.0f)) & 4294967295L), 8), null, 0.0f, 6), C17909s.m51489g(c17909s, AbstractC37056f.m118959K(new C17919x(AbstractC13673n.m38559f(c38072d, c28655q, i17, 0.2f)), new C17919x(AbstractC13673n.m38559f(c38072d, c28655q, i17, 0.0f))), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), Float.POSITIVE_INFINITY, 8), null, 0.0f, 6), null, c38072d.m121949b(c28655q, i17).getTransparent(), null, null, null, 0.0f, AbstractC37817c.m121344e(640998615, c28655q, new C29451o(3, viewState, function4)), c28655q, 12582912, 122);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C26984y0(viewState, i13, function3, i14, 23);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C29529k(29);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), 3, 4);
            C17909s c17909s2 = AbstractC17911t.f69612b;
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            AbstractC31926e.m99375j(AbstractC1092a.m3357b(AbstractC1092a.m3357b(modifierM53364e2, C17909s.m51486d(c17909s2, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, c38072d2.m121949b(c28655q, i18).getStrainZone1())), new C17919x(C17919x.m51541c(0.0f, c38072d2.m121949b(c28655q, i18).getStrainZone1()))), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(1200.0f)) & 4294967295L), 8), null, 0.0f, 6), C17909s.m51489g(c17909s2, AbstractC37056f.m118959K(new C17919x(AbstractC13673n.m38559f(c38072d2, c28655q, i18, 0.2f)), new C17919x(AbstractC13673n.m38559f(c38072d2, c28655q, i18, 0.0f))), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), Float.POSITIVE_INFINITY, 8), null, 0.0f, 6), null, c38072d2.m121949b(c28655q, i18).getTransparent(), null, null, null, 0.0f, AbstractC37817c.m121344e(640998615, c28655q, new C29451o(3, viewState, function4)), c28655q, 12582912, 122);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(viewState, i13, function3, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m91911i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m91912j(C25212k c25212k, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            float f14 = ((float) 1.5d) * f13;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.75d) * f13, 0.0f, 0.0f, 13));
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.c(c25212k.getImageUrl(), 0, 0, 0, 14, null), null, null, c28655q, AbstractC22403o.c.f87642f, 3), null, AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(148, c2314t)), false, 2.34f), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
            m91908f(c25212k, c28655q, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(((float) 0.5d) * f13, c2314t));
            C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f13, c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(-269175578);
            int i14 = 0;
            for (Object obj : c25212k.m73842e()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                AbstractC30020c.m91900c((C25211j) obj, c28655q, 0);
                if (i14 < AbstractC37056f.m118951C(c25212k.m73842e())) {
                    c28655q.m87150e0(1168533126);
                    AbstractC15751g.m44449b(null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), 0.0f, 0.0f, c28655q, 0, 13);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1168619616);
                    c28655q.m87173q(false);
                }
                i14 = i15;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1099a.m3394p(1 * f13, c2314t));
            TextResource text = c25212k.getSecondaryButton().getText();
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c25212k);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C28448b(27, function1, c25212k);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27271o0.m82253b(null, false, text, null, null, null, null, null, false, null, (InterfaceC4339a) objM87133R, c28655q, TextResource.$stable << 6, 0, 1019);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m91913k(Function1 function1, C25212k c25212k) {
        function1.invoke(c25212k.getSecondaryButton().getNavigationAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m91914l(C25212k c25212k, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m91910h(c25212k, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
