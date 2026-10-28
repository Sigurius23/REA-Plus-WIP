package oq1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jj0.AbstractC21738a;
import kq1.AbstractC22773a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import lq1.AbstractC24666f;
import lq1.AbstractC24668h;
import nx1.C27225g;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
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
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: oq1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Llq1/h;", "viewState", "Lkotlin/Function1;", "Llq1/f;", "Ll83/a0;", "onViewEvent", "Lkq1/a;", "onNavigationEvent", "d", "(Llq1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "behavior-impact_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28122f {
    /* JADX INFO: renamed from: d */
    public static final void m85060d(final AbstractC24668h viewState, final Function1 onViewEvent, Function1 function1, Composer composer, int i13) {
        int i14;
        final Function1 onNavigationEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-731765378);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87138X();
        } else if (viewState instanceof AbstractC24668h.c) {
            c28655q.m87150e0(1231880450);
            AbstractC28120d.m85045o(null, ((AbstractC24668h.c) viewState).getState(), function1, c28655q, i14 & 896, 1);
            onNavigationEvent = function1;
            c28655q.m87173q(false);
        } else if (viewState instanceof AbstractC24668h.a) {
            c28655q.m87150e0(1232117662);
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC21738a.f83594f, null, 2, null), false, null, 6, null);
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC21738a.f83591c, null, 2, null);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC21738a.f83593e, null, 2, null);
            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC21738a.f83592d, null, 2, null);
            int i15 = i14 & 14;
            boolean z4 = ((i14 & 112) == 32) | (i15 == 4);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                final int i16 = 0;
                objM87133R = new InterfaceC4339a() { // from class: oq1.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                return AbstractC28122f.m85061e(onViewEvent, viewState);
                            default:
                                return AbstractC28122f.m85062f(onViewEvent, viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z13 = ((i14 & 896) == 256) | (i15 == 4);
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                final int i17 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: oq1.e
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                return AbstractC28122f.m85061e(onNavigationEvent, viewState);
                            default:
                                return AbstractC28122f.m85062f(onNavigationEvent, viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            int i18 = 196608 | AbstractC33208p0.b.f138467h;
            int i19 = TextResource.C8688b.f25889c;
            AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b3, interfaceC4339a, true, false, c8688b2, (InterfaceC4339a) objM87133R2, null, false, false, c28655q, i18 | (i19 << 3) | (i19 << 9) | (i19 << 21), 0, 3652);
            c28655q = c28655q;
            c28655q.m87173q(false);
        } else {
            if (!(viewState instanceof AbstractC24668h.b)) {
                throw AbstractC11895b.m32003v(1148115857, c28655q, false);
            }
            c28655q.m87150e0(1232867831);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) viewState, onViewEvent, (InterfaceC23459e) onNavigationEvent, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m85061e(Function1 function1, AbstractC24668h abstractC24668h) {
        function1.invoke(new AbstractC24666f.a(((AbstractC24668h.a) abstractC24668h).getMetadata()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m85062f(Function1 function1, AbstractC24668h abstractC24668h) {
        function1.invoke(new AbstractC22773a.a(((AbstractC24668h.a) abstractC24668h).getMetadata()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m85063g(AbstractC24668h abstractC24668h, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m85060d(abstractC24668h, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
