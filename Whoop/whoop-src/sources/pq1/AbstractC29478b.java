package pq1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import e31.AbstractC12610b;
import e31.C12611c;
import iq1.C20848a;
import iq1.InterfaceC20850c;
import l83.C23454a0;
import of2.C27900d;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33208p0;

/* JADX INFO: renamed from: pq1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Liq1/a$a;", "viewState", "Lkotlin/Function1;", "Liq1/c;", "Ll83/a0;", "onEvent", "e", "(Liq1/a$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "behavior-impact_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29478b {
    /* JADX INFO: renamed from: e */
    public static final void m90019e(final C20848a.a viewState, final Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2137663232);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C12611c state = viewState.getState();
            boolean z4 = state.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(-1784007851);
                TextResource title = state.getType().getTitle();
                boolean z13 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState))) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    final int i15 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: pq1.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    return AbstractC29478b.m90020f(viewState, onEvent);
                                case 1:
                                    return AbstractC29478b.m90021g(viewState, onEvent);
                                default:
                                    return AbstractC29478b.m90022h(viewState, onEvent);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC12610b.m35349f(new C12611c(null, new AbstractC33208p0.h(title, 0L, (InterfaceC4339a) objM87133R, 2, null), state.getSupportText(), null, null, null, 57, null), null, null, c28655q, C12611c.f43049g, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1783611392);
                C12611c state2 = viewState.getState();
                int i16 = i14 & 14;
                int i17 = i14 & 112;
                boolean z14 = (i16 == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState))) | (i17 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    final int i18 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: pq1.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC29478b.m90020f(viewState, onEvent);
                                case 1:
                                    return AbstractC29478b.m90021g(viewState, onEvent);
                                default:
                                    return AbstractC29478b.m90022h(viewState, onEvent);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean z15 = (i16 == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState))) | (i17 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (z15 || objM87133R3 == c28676v0) {
                    final int i19 = 2;
                    objM87133R3 = new InterfaceC4339a() { // from class: pq1.a
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC29478b.m90020f(viewState, onEvent);
                                case 1:
                                    return AbstractC29478b.m90021g(viewState, onEvent);
                                default:
                                    return AbstractC29478b.m90022h(viewState, onEvent);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC12610b.m35349f(state2, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, C12611c.f43049g, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(viewState, onEvent, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m90020f(C20848a.a aVar, Function1 function1) {
        InterfaceC20850c primaryClickEvent = aVar.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m90021g(C20848a.a aVar, Function1 function1) {
        InterfaceC20850c primaryClickEvent = aVar.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m90022h(C20848a.a aVar, Function1 function1) {
        InterfaceC20850c secondaryClickEvent = aVar.getSecondaryClickEvent();
        if (secondaryClickEvent != null) {
            function1.invoke(secondaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m90023i(C20848a.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m90019e(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
