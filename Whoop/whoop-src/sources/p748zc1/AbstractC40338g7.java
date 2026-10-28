package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import gz0.EnumC16313m0;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ry0.C31906a;
import ry0.C31909d;
import ry0.EnumC31908c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.g7 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "f", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40338g7 {
    /* JADX INFO: renamed from: f */
    public static final void m129808f(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-242895942);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 2 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
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
            AbstractC22399k.m64473c("Basic Cell Item - Unselected", c28655q, 6);
            C31906a c31906a = new C31906a();
            C31909d c31909d = new C31909d("basic", "Basic Cell Item", null, null, null, false, null, false, false, null, null, false, false, null, null, 32764, null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40473t5(19);
                c28655q.m87172p0(objM87133R);
            }
            int i14 = (C31909d.f132449p << 3) | 390 | (C31906a.f132448a << 9);
            c31906a.Compose(c2314t, c31909d, (Function1) objM87133R, c28655q, i14);
            AbstractC22399k.m64473c("MCI Flow Selection Style - Selected", c28655q, 6);
            C31906a c31906a2 = new C31906a();
            C31909d c31909d2 = new C31909d("mci-flow-selected", "MCI Flow Style", "With MCI flow selection", EnumC16313m0.BLOOD_OXYGEN, null, false, EnumC31908c.MCI_FLOW, true, false, null, null, false, false, null, null, 32560, null);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C40473t5(20);
                c28655q.m87172p0(objM87133R2);
            }
            c31906a2.Compose(c2314t, c31909d2, (Function1) objM87133R2, c28655q, i14);
            AbstractC22399k.m64473c("Cervical Mucus Selection Style - Selected", c28655q, 6);
            C31906a c31906a3 = new C31906a();
            C31909d c31909d3 = new C31909d("cervical-mucus-selected", "Cervical Mucus Style", "With cervical mucus selection", EnumC16313m0.ACTIVITY, null, false, EnumC31908c.CERVICAL_MUCUS, true, false, null, null, false, false, null, null, 32560, null);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C40473t5(21);
                c28655q.m87172p0(objM87133R3);
            }
            c31906a3.Compose(c2314t, c31909d3, (Function1) objM87133R3, c28655q, i14);
            AbstractC22399k.m64473c("Disabled - Unsupported State", c28655q, 6);
            C31906a c31906a4 = new C31906a();
            C31909d c31909d4 = new C31909d("disabled", "Disabled Cell Item", "This option isn't available", EnumC16313m0.HOME, null, false, null, false, false, null, null, false, true, null, null, 28656, null);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C40473t5(22);
                c28655q.m87172p0(objM87133R4);
            }
            c31906a4.Compose(c2314t, c31909d4, (Function1) objM87133R4, c28655q, i14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40337g6(i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m129809g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m129810h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m129811i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m129812j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m129813k(int i13, Composer composer, int i14) {
        m129808f(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
