package h60;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import f01.C13845b;
import f50.AbstractC14089b;
import f60.C14138c;
import f60.InterfaceC14136a;
import h00.C16497d0;
import l83.C23454a0;
import p178gz.C16283a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qs1.AbstractC30574a;
import qs1.C30575b;

/* JADX INFO: renamed from: h60.f */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lf60/c$b;", "viewState", "Lkotlin/Function1;", "Lf60/a;", "Ll83/a0;", "onEvent", "f", "(Lf60/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16977f {
    /* JADX INFO: renamed from: f */
    public static final void m47756f(C14138c.b viewState, Function1 onEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(24683040);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C30575b c30575b = new C30575b(viewState.getTitle(), viewState.m40250a(), AbstractC30060g.m92103Y(c28655q, AbstractC14089b.f50626e), AbstractC30060g.m92103Y(c28655q, AbstractC14089b.f50627f), null, null, 48, null);
            int i15 = i14 & 112;
            boolean z4 = i15 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C16283a(onEvent, 6);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C16497d0(13);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            boolean z13 = i15 == 32;
            Object objM87133R3 = c28655q.m87133R();
            if (z13 || objM87133R3 == c28676v0) {
                objM87133R3 = new C16283a(onEvent, 7);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R3;
            boolean z14 = i15 == 32;
            Object objM87133R4 = c28655q.m87133R();
            if (z14 || objM87133R4 == c28676v0) {
                objM87133R4 = new C16283a(onEvent, 8);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC30574a.m93775y(c30575b, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, (InterfaceC4339a) objM87133R4, null, c28655q, C30575b.f125807g | 384, 32);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13845b(viewState, onEvent, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m47757g(Function1 function1) {
        function1.invoke(InterfaceC14136a.a.f50839a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m47758h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m47759i(Function1 function1) {
        function1.invoke(InterfaceC14136a.a.f50839a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m47760j(Function1 function1) {
        function1.invoke(InterfaceC14136a.j.f50847a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m47761k(C14138c.b bVar, Function1 function1, int i13, Composer composer, int i14) {
        m47756f(bVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
