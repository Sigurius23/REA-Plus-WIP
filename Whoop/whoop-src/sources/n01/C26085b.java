package n01;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ih1.C18522f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mh0.C25550b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import ry0.C31909d;

/* JADX INFO: renamed from: n01.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Ln01/b;", "Lm91/f;", "Ln01/e;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Ln01/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26085b implements InterfaceC25297f<C26088e> {

    /* JADX INFO: renamed from: a */
    public static final int f103311a = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m77581d(C26088e c26088e, Function1 function1, String cellId, boolean z4, List resultingSelection) {
        AbstractC22676k.m65750j(cellId, "cellId");
        AbstractC22676k.m65750j(resultingSelection, "resultingSelection");
        C26084a c26084a = C26084a.f103310a;
        String id4 = c26088e.getId();
        List<C31909d> listM77603c = c26088e.m77603c();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM77603c, 10));
        Iterator<T> it = listM77603c.iterator();
        while (it.hasNext()) {
            arrayList.add(((C31909d) it.next()).getId());
        }
        AbstractC26087d.m77596m(c26084a.m77578a(id4, arrayList, AbstractC25265s.m74103I1(resultingSelection), c26088e.getStateUpdateValueKey()), AbstractC26087d.m77595l(c26088e, cellId, z4, resultingSelection), function1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m77582e(C26085b c26085b, Modifier modifier, C26088e c26088e, Function1 function1, int i13, Composer composer, int i14) {
        c26085b.Compose(modifier, c26088e, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C26088e itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(867475181);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean zM87157i = c28655q.m87157i(itemState) | ((i14 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C18522f(26, itemState, onViewEvent);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC26087d.m77588e(modifier, null, itemState, null, (Function3) objM87133R, c28655q, (i14 & 14) | ((i14 << 3) & 896), 10);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25550b(i13, 12, this, modifier, itemState, onViewEvent);
        }
    }
}
