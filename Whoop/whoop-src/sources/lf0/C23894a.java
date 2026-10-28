package lf0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import hy0.C17750h1;
import kd1.AbstractC22403o;
import l01.C23038j;
import l01.C23045q;
import l83.C23454a0;
import ld0.C23842a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;

/* JADX INFO: renamed from: lf0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Llf0/a;", "Lm91/f;", "Lld0/a;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lld0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23894a implements InterfaceC25297f<C23842a> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m70177d(Function1 function1, C23842a c23842a) {
        function1.invoke(c23842a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m70178e(C23894a c23894a, Modifier modifier, C23842a c23842a, Function1 function1, int i13, Composer composer, int i14) {
        c23894a.Compose(modifier, c23842a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C23842a itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1749793711);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean z13 = (i14 & 896) == 256;
            if ((i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q.m87157i(itemState))) {
                z4 = true;
            }
            boolean z14 = z13 | z4;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C23045q(onViewEvent, itemState, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23898b.m70200e(itemState, modifier, (InterfaceC4339a) objM87133R, c28655q, C17750h1.f69012w | AbstractC22403o.f87638a | ((i14 >> 3) & 14) | ((i14 << 3) & 112), 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23038j(this, modifier, itemState, onViewEvent, i13, 11);
        }
    }
}
