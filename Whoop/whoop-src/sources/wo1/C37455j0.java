package wo1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.navigation.C9598e;
import l83.C23454a0;
import p127ev.AbstractC13673n;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import p739ui0.C35015q;
import so1.C32811e0;
import wm1.C37383e;

/* JADX INFO: renamed from: wo1.j0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lwo1/j0;", "Lm91/f;", "Lso1/e0;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lso1/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37455j0 implements InterfaceC25297f<C32811e0> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m119961d(C32811e0 c32811e0, Function1 function1) {
        AnalyticEventModel analyticEventModelM102954a = c32811e0.getAnalyticEvent();
        if (analyticEventModelM102954a != null) {
            AbstractC13673n.m38578y(null, analyticEventModelM102954a, function1);
        }
        C9598e c9598eM102956c = c32811e0.getDestination();
        if (c9598eM102956c != null) {
            function1.invoke(c9598eM102956c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m119962e(C37455j0 c37455j0, Modifier modifier, C32811e0 c32811e0, Function1 function1, int i13, Composer composer, int i14) {
        c37455j0.Compose(modifier, c32811e0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C32811e0 itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1529329668);
        if ((i13 & 48) == 0) {
            i14 = (c28655q.m87157i(itemState) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 145) != 144)) {
            boolean zM87157i = c28655q.m87157i(itemState) | ((i14 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C35015q(itemState, onViewEvent, 28);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC37457k0.m119996i(itemState, (InterfaceC4339a) objM87133R, c28655q, (i14 >> 3) & 14, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37383e(this, modifier, itemState, onViewEvent, i13, 10);
        }
    }
}
