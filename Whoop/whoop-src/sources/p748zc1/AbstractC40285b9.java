package p748zc1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.domain.model.UnitSystem;
import fc0.C14362f;
import i93.C18284j;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import s41.AbstractC32195c;
import s41.C32196d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.b9 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ll83/a0;", "d", "(Landroidx/compose/runtime/Composer;I)V", "", "imperialPounds", "metricPounds", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40285b9 {
    /* JADX INFO: renamed from: d */
    public static final void m129394d(Composer composer, int i13) {
        InterfaceC28593a1 interfaceC28593a1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-234519914);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(160, c28655q);
            }
            InterfaceC28593a1 interfaceC28593a2 = (InterfaceC28593a1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC31061c.m95646v(150, c28655q);
            }
            InterfaceC28593a1 interfaceC28593a3 = (InterfaceC28593a1) objM87133R2;
            AbstractC22399k.m64473c("Weight Picker - Imperial", c28655q, 6);
            C32196d c32196d = new C32196d(UnitSystem.IMPERIAL, m129395e(interfaceC28593a2), new C18284j(0, 600, 1), new C18284j(0, 300, 1), "lbs", "kg");
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C14362f(interfaceC28593a2, 15);
                c28655q.m87172p0(objM87133R3);
            }
            int i14 = C32196d.f133326g | 48;
            AbstractC32195c.m100133d(c32196d, (Function1) objM87133R3, null, 0.0f, null, false, c28655q, i14, 60);
            String strM8296i = AbstractC2875y.m8296i(m129395e(interfaceC28593a2), "Selected: ", " lbs");
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125405l0 = c38072d.m121949b(c28655q, i15).getStrainZone1();
            C2886a c2886aM8436q = c38072d.m121952e(c28655q, i15).getH3();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM8296i, null, jM125405l0, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q, 0, i16, 196602);
            float f13 = 5 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
            AbstractC22399k.m64473c("Weight Picker - Metric", c28655q, 6);
            C32196d c32196d2 = new C32196d(UnitSystem.METRIC, m129397g(interfaceC28593a3), new C18284j(0, 600, 1), new C18284j(0, 300, 1), "lbs", "kg");
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                interfaceC28593a1 = interfaceC28593a3;
                objM87133R4 = new C14362f(interfaceC28593a1, 16);
                c28655q.m87172p0(objM87133R4);
            } else {
                interfaceC28593a1 = interfaceC28593a3;
            }
            AbstractC32195c.m100133d(c32196d2, (Function1) objM87133R4, null, 0.0f, null, false, c28655q, i14, 60);
            AbstractC30795n.m94707h(AbstractC2875y.m8296i(m129397g(interfaceC28593a1), "Selected: ", " lbs"), null, c38072d.m121949b(c28655q, i15).getStrainZone1(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getH3(), null, c28655q, 0, i16, 196602);
            c28655q = c28655q;
            AbstractC25012a.m73389v(c2314t, f13, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40506w8(i13, 4);
        }
    }

    /* JADX INFO: renamed from: e */
    private static final int m129395e(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: f */
    private static final void m129396f(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: renamed from: g */
    private static final int m129397g(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: h */
    private static final void m129398h(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m129399i(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m129396f(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m129400j(InterfaceC28593a1 interfaceC28593a1, int i13) {
        m129398h(interfaceC28593a1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m129401k(int i13, Composer composer, int i14) {
        m129394d(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
