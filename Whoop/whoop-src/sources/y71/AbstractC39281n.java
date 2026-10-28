package y71;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wr0.C37526f;
import xo1.C38492a;

/* JADX INFO: renamed from: y71.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ly71/o;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "c", "(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39281n {
    /* JADX INFO: renamed from: c */
    public static final void m125207c(Modifier modifier, C39282o state, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2009351493);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            modifier2 = modifier;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C38492a(21);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a = (InterfaceC4339a) objM87133R;
            }
            InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
            AbstractC39279l alignment = state.getAlignment();
            if (alignment instanceof AbstractC39279l.a) {
                c28655q.m87150e0(-1748491654);
                AbstractC39273f.m125126d(state, (AbstractC39279l.a) alignment, modifier2, interfaceC4339a2, c28655q, ((i15 >> 3) & 14) | ((i15 << 6) & 896) | ((i15 << 3) & 7168));
                c28655q.m87173q(false);
            } else if (alignment instanceof AbstractC39279l.c) {
                c28655q.m87150e0(-1748487838);
                AbstractC39276i.m125142h(state, (AbstractC39279l.c) alignment, modifier2, interfaceC4339a2, c28655q, ((i15 >> 3) & 14) | ((i15 << 6) & 896) | ((i15 << 3) & 7168));
                c28655q.m87173q(false);
            } else {
                if (!(alignment instanceof AbstractC39279l.b)) {
                    throw AbstractC11895b.m32003v(-1748494434, c28655q, false);
                }
                c28655q.m87150e0(-1748483807);
                AbstractC39276i.m125140f(state, (AbstractC39279l.b) alignment, modifier2, interfaceC4339a2, c28655q, ((i15 >> 3) & 14) | ((i15 << 6) & 896) | ((i15 << 3) & 7168));
                c28655q.m87173q(false);
            }
            interfaceC4339a = interfaceC4339a2;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 20, modifier2, state, interfaceC4339a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m125208d() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m125209e(Modifier modifier, C39282o c39282o, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m125207c(modifier, c39282o, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
