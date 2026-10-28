package p717lq2;

import am2.C1018g;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ht2.C17632d;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import yp2.AbstractC39706c;

/* JADX INFO: renamed from: lq2.s, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0004\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onBackPress", "onNextPress", "f", "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX INFO: renamed from: f */
    public static final void m72259f(InterfaceC4339a onBackPress, InterfaceC4339a onNextPress, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onBackPress, "onBackPress");
        AbstractC22676k.m65750j(onNextPress, "onNextPress");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(805034068);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onBackPress) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNextPress) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170908a);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170909b);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC1136a.m3599a(c2314t, "Back Press"));
            if (0.3f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e = modifierM3406c.mo3471e(new LayoutWeightElement(0.3f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.3f, true));
            boolean zM87153g = c28655q.m87153g(strM92103Y);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C17632d(strM92103Y, 19);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifierMo3471e, false, (Function1) objM87133R);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R2;
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R3 = c28655q.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                objM87133R3 = new C24679k(onBackPress, 3);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierM51775c, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R3, 28), c28655q, 0);
            Modifier modifierM3406c2 = AbstractC1102d.m3406c(1.0f, AbstractC1136a.m3599a(c2314t, "Forward Press"));
            if (0.7f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e2 = modifierM3406c2.mo3471e(new LayoutWeightElement(0.7f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.7f, true));
            boolean zM87153g2 = c28655q.m87153g(strM92103Y2);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g2 || objM87133R4 == c28676v0) {
                objM87133R4 = new C17632d(strM92103Y2, 20);
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierMo3471e2, false, (Function1) objM87133R4);
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R5;
            boolean z13 = (i14 & 112) == 32;
            Object objM87133R6 = c28655q.m87133R();
            if (z13 || objM87133R6 == c28676v0) {
                objM87133R6 = new C24679k(onNextPress, 4);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC22989q.m66760a(AbstractC1092a.m3360e(modifierM51775c2, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R6, 28), c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1018g(onBackPress, onNextPress, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m72260g(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m72261h(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m72262i(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m72263j(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m72264k(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, Composer composer, int i14) {
        m72259f(interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
