package p700bd1;

import a80.C0539c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import e93.AbstractC12889b;
import kd1.C22396h;
import l83.C23454a0;
import p000.C24827m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import r80.AbstractC31061c;
import x81.C38072d;

/* JADX INFO: renamed from: bd1.q */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lbd1/q;", "Lm91/f;", "Lbd1/u;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lbd1/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3099q implements InterfaceC25297f<C3103u> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m8890d(C3103u c3103u, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87138X();
        } else if (c3103u.m8910e() != null) {
            c28655q.m87150e0(57533988);
            AbstractC3102t.m8901i(c3103u.m8910e(), c28655q, C22396h.f87627d);
            c28655q.m87173q(false);
        } else if (c3103u.getCornerRadius() != null) {
            c28655q.m87150e0(57536886);
            AbstractC3102t.m8899g(c3103u.getCornerRadius().f168413w, c3103u.getDescription(), c28655q, 0);
            c28655q.m87173q(false);
        } else if (c3103u.m8907a() != null) {
            c28655q.m87150e0(57540688);
            AbstractC3102t.m8897e(c3103u.m8907a(), c28655q, C22396h.f87627d);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(1783824229);
            c28655q.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m8891e(C3099q c3099q, Modifier modifier, C3103u c3103u, Function1 function1, int i13, Composer composer, int i14) {
        c3099q.Compose(modifier, c3103u, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C3103u itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        long jM95624D;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1885248192);
        if ((i13 & 48) == 0) {
            i14 = i13 | ((i13 & 64) == 0 ? c28655q.m87153g(itemState) : c28655q.m87157i(itemState) ? 32 : 16);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 17) != 16)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), false, 1.0f));
            if (itemState.m8907a() != null) {
                c28655q.m87150e0(-1858115674);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(-1858050202);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            }
            AbstractC12889b.m36263b(modifierM3394p, null, jM95624D, null, 0.0f, AbstractC37817c.m121344e(1095030717, c28655q, new C0539c(itemState, 14)), c28655q, 1572870, 58);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24827m(this, modifier, itemState, onViewEvent, i13, 23);
        }
    }
}
