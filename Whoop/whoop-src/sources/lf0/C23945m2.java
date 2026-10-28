package lf0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;

/* JADX INFO: renamed from: lf0.m2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Llf0/m2;", "Lm91/f;", "Llf0/o2;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "b", "(Landroidx/compose/ui/Modifier;Llf0/o2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23945m2 implements InterfaceC25297f<C23953o2> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m70530c(C23945m2 c23945m2, Modifier modifier, C23953o2 c23953o2, Function1 function1, int i13, Composer composer, int i14) {
        c23945m2.Compose(modifier, c23953o2, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C23953o2 itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1897347676);
        if ((i13 & 48) == 0) {
            i14 = (c28655q.m87153g(itemState) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 17) != 16)) {
            AbstractC23949n2.m70544b(itemState, c28655q, (i14 >> 3) & 14);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23956p1(i13, 6, this, modifier, itemState, onViewEvent);
        }
    }
}
