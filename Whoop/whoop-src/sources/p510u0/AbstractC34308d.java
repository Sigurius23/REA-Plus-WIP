package p510u0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import java.util.List;
import l83.C23465k;
import m83.C25271y;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2314t;
import p294l3.C23250e;
import p294l3.C23254g;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import so2.C32848f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: u0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC34308d {

    /* JADX INFO: renamed from: a */
    public static final C23465k f144071a;

    static {
        C25271y c25271y = C25271y.f99162w;
        f144071a = new C23465k(c25271y, c25271y);
    }

    /* JADX INFO: renamed from: a */
    public static final void m108613a(C23254g c23254g, List list, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1794596951);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87153g(c23254g) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(list) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                C23250e c23250e = (C23250e) list.get(i15);
                Function3 function3 = (Function3) c23250e.f92125a;
                int i16 = c23250e.f92126b;
                int i17 = c23250e.f92127c;
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = C34305c.f144055a;
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R;
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                function3.invoke(c23254g.subSequence(i16, i17).f92135x, c28655q, 0);
                c28655q.m87173q(true);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(c23254g, list, i13, 15);
        }
    }
}
