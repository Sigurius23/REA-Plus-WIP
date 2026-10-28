package p730qt2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ks2.AbstractC22822a;
import l83.C23454a0;
import mt2.AbstractC25946g;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p698au1.C2066k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q83.AbstractC30060g;
import qe0.C30301b;
import qn0.C30515j;

/* JADX INFO: renamed from: qt2.k, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lkotlin/Function1;", "Lmt2/g;", "Ll83/a0;", "onNavigationEvent", "d", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {
    /* JADX INFO: renamed from: d */
    public static final void m93909d(p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13, int i14) {
        p715kotlin.jvm.functions.Function1 function2;
        int i15;
        p715kotlin.jvm.functions.Function1 function3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(319046710);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            function2 = function1;
        } else if ((i13 & 6) == 0) {
            function2 = function1;
            i15 = (c28655q.m87157i(function2) ? 4 : 2) | i13;
        } else {
            function2 = function1;
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C30301b(25);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (p715kotlin.jvm.functions.Function1) objM87133R;
            } else {
                function3 = function2;
            }
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
            TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89934f));
            boolean z4 = (i15 & 14) == 4;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C30515j(function3, 2);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            int i17 = 196608 | AbstractC33208p0.b.f138467h;
            int i18 = TextResource.$stable;
            AbstractC33199m0.m105214F(bVar, textResourceM21278l, null, textResourceM21278l2, interfaceC4339a, false, false, null, null, null, false, false, c28655q, i17 | (i18 << 3) | (i18 << 9), 0, 4036);
            function2 = function3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2066k(i13, i14, 5, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m93910e(AbstractC25946g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m93911f(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new AbstractC25946g.b(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m93912g(p715kotlin.jvm.functions.Function1 function1, int i13, int i14, Composer composer, int i15) {
        m93909d(function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
