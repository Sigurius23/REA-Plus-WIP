package sg2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import java.util.List;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import r90.C31095b;
import rg2.C31394f;
import rg2.C31395g;

/* JADX INFO: renamed from: sg2.j */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lsg2/j;", "Lm91/f;", "Lrg2/g;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Lrg2/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32459j implements InterfaceC25297f<C31395g> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m101357e(Function1 function1, String internalName) {
        AbstractC22676k.m65750j(internalName, "internalName");
        function1.invoke(internalName);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m101358f(Function1 function1) {
        function1.invoke(C31394f.f129225a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m101359g(C32459j c32459j, Modifier modifier, C31395g c31395g, Function1 function1, int i13, Composer composer, int i14) {
        c32459j.Compose(modifier, c31395g, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C31395g itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1129068639);
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
            List<InterfaceC25312u> listM96691a = itemState.m96691a();
            int i15 = i14 & 896;
            boolean z4 = i15 == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C32451b(onViewEvent, 2);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean z13 = i15 == 256;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C32458i(onViewEvent, 0);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC32461l.m101366f(listM96691a, function1, (InterfaceC4339a) objM87133R2, modifier, c28655q, (i14 << 9) & 7168, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31095b((InterfaceC25297f) this, modifier, (InterfaceC25312u) itemState, onViewEvent, i13, 24);
        }
    }
}
