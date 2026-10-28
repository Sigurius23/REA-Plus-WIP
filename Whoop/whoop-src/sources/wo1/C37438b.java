package wo1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import d30.C11520c;
import l83.C23454a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p739ui0.C35015q;
import qy0.InterfaceC30768a;
import xo1.AbstractC38493b;
import xo1.C38494c;

/* JADX INFO: renamed from: wo1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37438b {

    /* JADX INFO: renamed from: a */
    public static final C37438b f160246a = new C37438b();

    /* JADX INFO: renamed from: b */
    private static InterfaceC4352n f160247b = new C37816b(new C11520c(7), false, 89627416);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m119853d(InterfaceC30768a dateItem, Function1 onEvent, Composer composer, int i13) {
        AbstractC22676k.m65750j(dateItem, "dateItem");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        if (dateItem instanceof C38494c) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1379220107);
            C38494c c38494c = (C38494c) dateItem;
            boolean zM87157i = ((((i13 & 112) ^ 48) > 32 && c28655q.m87153g(onEvent)) || (i13 & 48) == 32) | c28655q.m87157i(dateItem);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C35015q(26, onEvent, dateItem);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC38493b.m123355r(c38494c, (InterfaceC4339a) objM87133R, c28655q, i13 & 14, 0);
            c28655q.m87173q(false);
        } else {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-1379107670);
            c28655q2.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m119854e(Function1 function1, InterfaceC30768a interfaceC30768a) {
        function1.invoke(((C38494c) interfaceC30768a).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC4352n m119855c() {
        return f160247b;
    }
}
