package yw1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23001u;
import p292l1.AbstractC23124k3;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33208p0;
import p736sz0.C33211q0;
import p736sz0.Function0;
import uw1.C35311d;
import vv2.C36537c;
import wb3.AbstractC37056f;
import ww1.AbstractC37659e;
import ww1.InterfaceC37661g;
import yf1.C39516e;

/* JADX INFO: renamed from: yw1.k */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\t\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Luw1/d$b;", "viewState", "Lkotlin/Function1;", "Lww1/c;", "Ll83/a0;", "onEvent", "i", "(Luw1/d$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ll0/u;", "f", "(Ll0/u;Luw1/d$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39824k {
    /* JADX INFO: renamed from: f */
    private static final void m127728f(InterfaceC23001u interfaceC23001u, C35311d.b bVar, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(110799813);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(bVar) : c28655q.m87157i(bVar) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (bVar.getState().getType() instanceof AbstractC33208p0.b) {
            c28655q.m87150e0(-1992425247);
            boolean z4 = ((i14 & 896) == 256) | ((i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q.m87157i(bVar)));
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C39823j(bVar, function1, 2);
                c28655q.m87172p0(objM87133R);
            }
            float f13 = 8;
            AbstractC23124k3.m67101e((InterfaceC4339a) objM87133R, AbstractC1099a.m3398t(interfaceC23001u.mo3400a(C2314t.f9131w, C2299e.f9114w), 1 * f13, 4 * f13, 0.0f, 0.0f, 12), false, null, null, C39815b.f171579a.m127652b(), c28655q, 1572864, 60);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1991937059);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(interfaceC23001u, bVar, function1, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m127729g(C35311d.b bVar, Function1 function1) {
        AbstractC37659e backClickEvent = bVar.getBackClickEvent();
        if (backClickEvent != null) {
            function1.invoke(backClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m127730h(InterfaceC23001u interfaceC23001u, C35311d.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m127728f(interfaceC23001u, bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m127731i(C35311d.b viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1054339352);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C33211q0 state = viewState.getState();
            int i15 = i14 & 14;
            int i16 = i14 & 112;
            boolean z4 = (i15 == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState))) | (i16 == 32);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C39823j(viewState, onEvent, 0);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z13 = (i15 == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState))) | (i16 == 32);
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C39823j(viewState, onEvent, 1);
                c28655q.m87172p0(objM87133R2);
            }
            Function0.m105274p(state, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, C33211q0.f138501k, 0);
            int i17 = i14 << 3;
            m127728f(C1100b.f4583a, viewState, onEvent, c28655q, (i17 & 896) | (i17 & 112) | 6);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(viewState, onEvent, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m127732j(C35311d.b bVar, Function1 function1) {
        InterfaceC37661g primaryClickEvent = bVar.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m127733k(C35311d.b bVar, Function1 function1) {
        InterfaceC37661g secondaryClickEvent = bVar.getSecondaryClickEvent();
        if (secondaryClickEvent != null) {
            function1.invoke(secondaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m127734l(C35311d.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m127731i(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
