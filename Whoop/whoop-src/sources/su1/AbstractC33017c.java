package su1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
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
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25312u;
import p734sl0.C32618h3;
import qu1.C30625a;
import qu1.C30632h;
import qu1.InterfaceC30626b;
import qu1.InterfaceC30627c;
import sg2.C32451b;
import so2.C32848f;
import tu1.C34191d;
import tu1.C34194g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: su1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lqu1/h;", "viewState", "Lkotlin/Function1;", "Lqu1/c;", "Ll83/a0;", "onEvent", "d", "(Lqu1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "last-night-sleep_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33017c {
    /* JADX INFO: renamed from: d */
    public static final void m104246d(C30632h viewState, Function1 onEvent, Composer composer, int i13) {
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(780451332);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            c28655q.m87150e0(-2070102910);
            for (C30625a c30625a : viewState.m94055a()) {
                InterfaceC25312u itemViewState = c30625a.getItemViewState();
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C32618h3(21);
                    c28655q.m87172p0(objM87133R);
                }
                C25307p c25307pM74306g = p720m91.Function1.m74306g((Function1) objM87133R);
                boolean z4 = (i14 & 112) == 32;
                Object objM87133R2 = c28655q.m87133R();
                if (z4 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C32451b(onEvent, 4);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC25303l.m74291r(itemViewState, c25307pM74306g, null, (Function1) objM87133R2, c28655q, C25307p.f99300b << 3, 4);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(c30625a.getInsetBottom().getSpacing(), c2314t));
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(viewState, onEvent, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m104247e(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        designItemViewFactory.m74324c().put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34194g.class), new C34191d());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m104248f(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof InterfaceC30626b) {
            if (it instanceof InterfaceC30626b.a) {
                InterfaceC30626b.a aVar = (InterfaceC30626b.a) it;
                function1.invoke(new InterfaceC30627c.c(aVar.getComponentId(), aVar.getBottomSheetState()));
            } else {
                function1.invoke(new InterfaceC30627c.e((InterfaceC30626b) it));
            }
        } else if (it instanceof InterfaceC30627c.a) {
            function1.invoke(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m104249g(C30632h c30632h, Function1 function1, int i13, Composer composer, int i14) {
        m104246d(c30632h, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
