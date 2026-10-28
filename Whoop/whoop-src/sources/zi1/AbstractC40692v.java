package zi1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aw0.C2101a;
import ej1.C13253p;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p748zc1.C40349h7;

/* JADX INFO: renamed from: zi1.v */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lm91/u;", "item", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Landroidx/compose/ui/Modifier;", "modifier", "d", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "kennel_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40692v {
    /* JADX INFO: renamed from: d */
    public static final void m132139d(InterfaceC25312u item, Function1 function1, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC25312u interfaceC25312u;
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(767225239);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40349h7(23);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function2 = function1;
            interfaceC25312u = item;
            AbstractC25303l.m74291r(interfaceC25312u, AbstractC40693w.m132144b(), new C2101a(13, modifier), function2, c28655q, (i15 & 14) | (C25307p.f99300b << 3) | ((i15 << 6) & 7168), 0);
            function1 = function2;
        } else {
            interfaceC25312u = item;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13253p(interfaceC25312u, function1, modifier, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m132140e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m132141f(Modifier modifier, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1341269031);
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132142g(InterfaceC25312u interfaceC25312u, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m132139d(interfaceC25312u, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
