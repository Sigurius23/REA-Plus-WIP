package jr1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gr1.C16110q;
import gr1.InterfaceC16107n;
import ig0.C18464d;
import jp1.C21860l;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import zq1.AbstractC40987b;

/* JADX INFO: renamed from: jr1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lgr1/q;", "viewState", "Lkotlin/Function1;", "Lgr1/n;", "Ll83/a0;", "onViewEvent", "c", "(Lgr1/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "integrations_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21894b {
    /* JADX INFO: renamed from: c */
    public static final void m62170c(C16110q viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1692903248);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if (!c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q = c28655q2;
            c28655q.m87138X();
        } else if (viewState.getLoading() != null) {
            c28655q2.m87150e0(1774845200);
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, viewState.getLoading().getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q = c28655q2;
            c28655q.m87173q(false);
        } else {
            c28655q = c28655q2;
            if (viewState.getIsError()) {
                c28655q.m87150e0(1775044096);
                AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC40987b.f176901i), false, null, 6, null);
                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC40987b.f176900h);
                boolean z4 = (i14 & 112) == 32;
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C21860l(onViewEvent, 5);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688bM21277k, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (viewState.getSuccess() != null) {
                c28655q.m87150e0(1775476267);
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(AbstractC8693b.m21277k(AbstractC40987b.f176902j), 0L, null, 6, null), viewState.getSuccess().getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1775704210);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(viewState, onViewEvent, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m62171d(Function1 function1) {
        function1.invoke(InterfaceC16107n.h.f61108a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m62172e(C16110q c16110q, Function1 function1, int i13, Composer composer, int i14) {
        m62170c(c16110q, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
