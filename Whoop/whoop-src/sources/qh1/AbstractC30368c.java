package qh1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import nh1.C26723d;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q11.C29793c;
import qb0.C30179a;
import w71.AbstractC36900s;

/* JADX INFO: renamed from: qh1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lnh1/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lnh1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "gifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30368c {
    /* JADX INFO: renamed from: c */
    public static final void m92843c(Modifier modifier, C26723d viewState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(765265536);
        if ((i13 & 48) == 0) {
            i15 = ((i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 145) != 144)) {
            Modifier modifier3 = (i14 & 1) != 0 ? C2314t.f9131w : modifier;
            c28655q.m87144b0(980782149, Integer.valueOf(viewState.getStartingValue()));
            TextResource textResourceM79492c = viewState.getDescription();
            if (textResourceM79492c == null) {
                textResourceM79492c = AbstractC8693b.m21278l("");
            }
            TextResource textResourceM21278l = AbstractC8693b.m21278l("");
            boolean z4 = true;
            int iM79494f = viewState.getMinValue();
            int iM79493e = viewState.getMaxValue();
            Integer numValueOf = Integer.valueOf(viewState.getStartingValue());
            boolean z13 = (i15 & 896) == 256;
            if ((i15 & 112) != 32 && ((i15 & 64) == 0 || !c28655q.m87157i(viewState))) {
                z4 = false;
            }
            boolean z14 = z13 | z4;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C29793c(9, onViewEvent, viewState);
                c28655q.m87172p0(objM87133R);
            }
            int i16 = TextResource.$stable;
            AbstractC36900s.m118473h(textResourceM79492c, textResourceM21278l, iM79494f, iM79493e, numValueOf, false, true, (Function1) objM87133R, c28655q, 1572864 | i16 | (i16 << 3), 32);
            c28655q.m87173q(false);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(i13, i14, 5, modifier2, viewState, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m92844d(Function1 function1, C26723d c26723d, int i13) {
        function1.invoke(new C30367b(i13, c26723d.getId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m92845e(Modifier modifier, C26723d c26723d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m92843c(modifier, c26723d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
