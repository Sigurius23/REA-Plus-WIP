package xi2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import u21.C34481a;
import wr0.C37526f;
import x81.C38072d;
import xa0.C38136a;

/* JADX INFO: renamed from: xi2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lu21/a;", "milestoneHeaderState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lu21/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "streaks_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38326d {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m122836c(Modifier modifier, C34481a c34481a, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Function1 function2;
        Modifier modifier3;
        Function1 function3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-515354161);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q2.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(c34481a) : c28655q2.m87157i(c34481a) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            if ((i14 & 4) != 0) {
                Object objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C38136a(21);
                    c28655q2.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            String strM21274h = AbstractC8693b.m21274h(c34481a.getTitle(), c28655q2, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h, modifier4, c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getT3(), null, c28655q, (i15 << 3) & 112, C2886a.f11498d << 18, 196088);
            function2 = function3;
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function2 = function1;
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 12, modifier3, c34481a, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m122837d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m122838e(Modifier modifier, C34481a c34481a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m122836c(modifier, c34481a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
