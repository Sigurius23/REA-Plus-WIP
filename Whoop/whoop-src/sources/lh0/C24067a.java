package lh0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import gy0.AbstractC16276e;
import jt1.C21937b;
import l83.C23454a0;
import lf0.C23956p1;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wl0.AbstractC37352a;

/* JADX INFO: renamed from: lh0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Llh0/a;", "Lm91/f;", "Llh0/b;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Llh0/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "showCyclingText", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24067a implements InterfaceC25297f<C24068b> {
    /* JADX INFO: renamed from: d */
    private static final boolean m70981d(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    private static final void m70982e(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m70983f(InterfaceC28601c1 interfaceC28601c1) {
        m70982e(interfaceC28601c1, !m70981d(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m70984g(C24067a c24067a, Modifier modifier, C24068b c24068b, Function1 function1, int i13, Composer composer, int i14) {
        c24067a.Compose(modifier, c24068b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C24068b itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1751013565);
        if ((i13 & 48) == 0) {
            i14 = i13 | (c28655q2.m87153g(itemState) ? 32 : 16);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 17) != 16)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (itemState.getEnableLongLoading() && m70981d(interfaceC28601c1)) {
                c28655q2.m87150e0(-2067078538);
                AbstractC37352a.m119611d(null, null, c28655q2, 0, 3);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(-2067016600);
                float f13 = 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 1 * f13, 0.0f, 10 * f13, 0.0f, 10);
                float f14 = 4;
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f14 * f14, modifierM3398t), "loadingAnimation");
                InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62212f));
                int i15 = itemState.getEnableLongLoading() ? 2 : Integer.MAX_VALUE;
                Object objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21937b(18, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC35684p.m113047h(modifierM3599a, dVarM113128a, false, 0.5f, i15, (InterfaceC4339a) objM87133R2, null, null, null, c28655q2, 199686, 452);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23956p1(i13, 9, this, modifier, itemState, onViewEvent);
        }
    }
}
