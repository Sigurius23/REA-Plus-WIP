package j22;

import androidx.compose.runtime.Composer;
import aq1.C1909c;
import c93.InterfaceC4339a;
import dc0.C11901c;
import e81.C12826f;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import if0.C18451b;
import ig0.C18468h;
import java.util.List;
import k22.C22164d;
import k22.InterfaceC22165e;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.AbstractC24949d;
import p719m22.AbstractC24951f;
import p719m22.AbstractC24955j;
import p719m22.AbstractC42785i;
import p719m22.AbstractC42786k;
import p719m22.AbstractC42787l;
import p719m22.AbstractC42788s;
import p719m22.AbstractC42789u;
import p719m22.Function0;
import qt0.C30586b;

/* JADX INFO: renamed from: j22.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"", "startDestination", "Leb/u0;", "navController", "Lk22/d;", "viewState", "Lkotlin/Function1;", "Lk22/e;", "Ll83/a0;", "onViewEvent", "Lj22/f;", "onNavigationEvent", "E", "(Ljava/lang/String;Leb/u0;Lk22/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "pairing-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21256e {
    /* JADX INFO: renamed from: E */
    public static final void m59602E(String startDestination, C12991u0 navController, C22164d viewState, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C12991u0 c12991u0;
        String str;
        AbstractC22676k.m65750j(startDestination, "startDestination");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1036441604);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(startDestination) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(navController) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(viewState) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            boolean zM87157i = ((57344 & i14) == 16384) | ((i14 & 7168) == 2048) | c28655q.m87157i(viewState);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C18468h(onNavigationEvent, onViewEvent, viewState, 24);
                c28655q.m87172p0(objM87133R);
            }
            c12991u0 = navController;
            AbstractC17269i.m48888e(c12991u0, startDestination, null, (Function1) objM87133R, c28655q, ((i14 >> 3) & 14) | ((i14 << 3) & 112));
            str = startDestination;
        } else {
            c12991u0 = navController;
            str = startDestination;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c(str, c12991u0, viewState, onViewEvent, onNavigationEvent, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m59603F(final Function1 function1, final Function1 function2, C22164d c22164d, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, AbstractC21261j.f.f81164b.getRoute(), null, new C37816b(new C12826f(function1, 2), true, -79404031), 6);
        AbstractC12889b.m36291u(NavHost, AbstractC21261j.g.f81165b.getRoute(), null, new C37816b(new C12826f(function1, 3), true, 438351160), 6);
        final int i13 = 1;
        AbstractC12889b.m36291u(NavHost, AbstractC21261j.h.f81166b.getRoute(), null, new C37816b(new Function3() { // from class: j22.a
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i14 = i13;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i14) {
                    case 0:
                        return AbstractC21256e.m59633e0(function1, function2, c12982q, composer, iIntValue);
                    default:
                        return AbstractC21256e.m59609L(function1, function2, c12982q, composer, iIntValue);
                }
            }
        }, true, -129621063), 6);
        AbstractC12889b.m36291u(NavHost, AbstractC21261j.a.f81159b.getRoute(), null, new C37816b(new C21254c(0, c22164d, function1, function2), true, -697593286), 6);
        AbstractC12889b.m36291u(NavHost, AbstractC21261j.i.f81167b.getRoute(), null, new C37816b(new C21254c(function1, function2, c22164d), true, -1265565509), 6);
        AbstractC12889b.m36291u(NavHost, AbstractC21261j.d.f81162b.getRoute(), null, new C37816b(new C21255d(function1, c22164d), true, -1833537732), 6);
        AbstractC12889b.m36291u(NavHost, AbstractC21261j.e.f81163b.getRoute(), null, new C37816b(new C21255d(c22164d, function1), true, 1893457341), 6);
        AbstractC12889b.m36291u(NavHost, AbstractC21261j.c.f81161b.getRoute(), null, new C37816b(new C21254c(2, c22164d, function1, function2), true, 1325485118), 6);
        final int i14 = 0;
        AbstractC12889b.m36291u(NavHost, AbstractC21261j.b.f81160b.getRoute(), null, new C37816b(new Function3() { // from class: j22.a
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                C12982q c12982q = (C12982q) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i15) {
                    case 0:
                        return AbstractC21256e.m59633e0(function1, function2, c12982q, composer, iIntValue);
                    default:
                        return AbstractC21256e.m59609L(function1, function2, c12982q, composer, iIntValue);
                }
            }
        }, true, 757512895), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m59604G(Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C18451b(function1, 17);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC42786k.m73211g((InterfaceC4339a) objM87133R, null, c28655q, 0, 2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m59605H(Function1 function1) {
        function1.invoke(new AbstractC21257f.b(AbstractC21261j.g.f81165b.getRoute()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m59606I(Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C18451b(function1, 18);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(function1);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C18451b(function1, 19);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC42787l.m73221g(interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m59607J(Function1 function1) {
        function1.invoke(AbstractC21257f.a.f81137a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m59608K(Function1 function1) {
        function1.invoke(AbstractC21257f.d.f81140a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m59609L(Function1 function1, Function1 function2, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C18451b(function1, 14);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(function2);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C18451b(function2, 15);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
        boolean zM87153g3 = c28655q.m87153g(function1);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C18451b(function1, 16);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC42788s.m73249u(interfaceC4339a, interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m59610M(Function1 function1) {
        function1.invoke(AbstractC21257f.a.f81137a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m59611N(Function1 function1) {
        function1.invoke(InterfaceC22165e.c.f85938a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m59612O(Function1 function1) {
        function1.invoke(AbstractC21257f.d.f81140a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m59613P(C22164d c22164d, Function1 function1, Function1 function2, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        List<C30586b> listM63442b = c22164d.m63442b();
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C18451b(function1, 9);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87153g(function2);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C11901c(function1, 2, function2);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC24949d.m73132u(listM63442b, null, interfaceC4339a, (InterfaceC4339a) objM87133R2, c28655q, 0, 2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m59614Q(Function1 function1) {
        function1.invoke(AbstractC21257f.d.f81140a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m59615R(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC21257f.a.f81137a);
        function2.invoke(InterfaceC22165e.d.f85939a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m59616S(final Function1 function1, final Function1 function2, final C22164d c22164d, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(function2) | c28655q.m87157i(c22164d);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            final int i14 = 0;
            objM87133R = new InterfaceC4339a() { // from class: j22.b
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i14) {
                        case 0:
                            return AbstractC21256e.m59617T(function1, function2, c22164d);
                        default:
                            return AbstractC21256e.m59618U(function1, function2, c22164d);
                    }
                }
            };
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87153g(function2) | c28655q.m87157i(c22164d);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            final int i15 = 1;
            objM87133R2 = new InterfaceC4339a() { // from class: j22.b
                @Override // c93.InterfaceC4339a
                public final Object invoke() {
                    switch (i15) {
                        case 0:
                            return AbstractC21256e.m59617T(function1, function2, c22164d);
                        default:
                            return AbstractC21256e.m59618U(function1, function2, c22164d);
                    }
                }
            };
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
        boolean zM87153g3 = c28655q.m87153g(function2);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C18451b(function2, 8);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC42789u.m73285v(interfaceC4339a, interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m59617T(Function1 function1, Function1 function2, C22164d c22164d) {
        function1.invoke(AbstractC21257f.a.f81137a);
        function2.invoke(new InterfaceC22165e.a(c22164d.getTriggerRescan()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m59618U(Function1 function1, Function1 function2, C22164d c22164d) {
        function1.invoke(AbstractC21257f.a.f81137a);
        function2.invoke(new InterfaceC22165e.a(c22164d.getTriggerRescan()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m59619V(Function1 function1) {
        function1.invoke(InterfaceC22165e.b.f85937a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m59620W(Function1 function1, C22164d c22164d, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C18451b(function1, 13);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        C30586b c30586bM63443c = c22164d.getPairingDevice();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (c30586bM63443c == null) {
            return c23454a0;
        }
        AbstractC42785i.m73179l(interfaceC4339a, c30586bM63443c, c28655q, 0, 0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m59621X(Function1 function1) {
        function1.invoke(AbstractC21257f.a.f81137a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m59622Y(C22164d c22164d, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C30586b c30586bM63443c = c22164d.getPairingDevice();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (c30586bM63443c == null) {
            return c23454a0;
        }
        int iM63441a = c22164d.getBatteryPercent();
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C18451b(function1, 7);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC24955j.m73196n(c30586bM63443c, iM63441a, false, null, (InterfaceC4339a) objM87133R, c28655q, 0, 12);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m59623Z(Function1 function1) {
        function1.invoke(AbstractC21257f.a.f81137a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m59625a0(C22164d c22164d, Function1 function1, Function1 function2, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C30586b c30586bM63443c = c22164d.getPairingDevice();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (c30586bM63443c == null) {
            return c23454a0;
        }
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C18451b(function1, 20);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(function1);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C18451b(function1, 21);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
        boolean zM87153g3 = c28655q.m87153g(function2);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C18451b(function2, 22);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC24951f.m73163k(c30586bM63443c, interfaceC4339a, interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m59627b0(Function1 function1) {
        function1.invoke(AbstractC21257f.a.f81137a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m59629c0(Function1 function1) {
        function1.invoke(AbstractC21257f.a.f81137a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m59631d0(Function1 function1) {
        function1.invoke(InterfaceC22165e.g.f85942a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m59633e0(Function1 function1, Function1 function2, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C18451b(function1, 10);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
        boolean zM87153g2 = c28655q.m87153g(function1);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87153g2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C18451b(function1, 11);
            c28655q.m87172p0(objM87133R2);
        }
        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
        boolean zM87153g3 = c28655q.m87153g(function2);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C18451b(function2, 12);
            c28655q.m87172p0(objM87133R3);
        }
        Function0.m73148k(interfaceC4339a, interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m59635f0(Function1 function1) {
        function1.invoke(AbstractC21257f.a.f81137a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m59637g0(Function1 function1) {
        function1.invoke(AbstractC21257f.a.f81137a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C23454a0 m59639h0(Function1 function1) {
        function1.invoke(InterfaceC22165e.g.f85942a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m59641i0(String str, C12991u0 c12991u0, C22164d c22164d, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m59602E(str, c12991u0, c22164d, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
