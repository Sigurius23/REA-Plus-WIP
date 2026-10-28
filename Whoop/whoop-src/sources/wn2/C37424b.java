package wn2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import io2.AbstractC20760g;
import io2.C20762h;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;

/* JADX INFO: renamed from: wn2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lwn2/b;", "Lm91/f;", "Lio2/h;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "b", "(Landroidx/compose/ui/Modifier;Lio2/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class C37424b implements InterfaceC25297f<C20762h> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m119795c(C37424b c37424b, Modifier modifier, C20762h c20762h, Function1 function1, int i13, Composer composer, int i14) {
        c37424b.Compose(modifier, c20762h, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void Compose(final Modifier modifier, final C20762h itemState, final Function1 onViewEvent, Composer composer, final int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1717612056);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(itemState) : c28655q2.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            c28655q = c28655q2;
            AbstractC20760g.m57163e(itemState, AbstractC1099a.m3398t(modifier, 0.0f, 8 * 1, 0.0f, 0.0f, 13), false, onViewEvent, c28655q, TextResource.$stable | 384 | ((i15 >> 3) & 14) | ((i15 << 3) & 7168), 0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: wn2.a
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return C37424b.m119795c(this.f160169w, modifier, itemState, onViewEvent, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }
}
