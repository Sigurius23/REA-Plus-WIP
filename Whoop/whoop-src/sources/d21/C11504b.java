package d21;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.C4025f5;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.domain.model.UnitSystem;
import l83.C23454a0;
import p000.C29656q;
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

/* JADX INFO: renamed from: d21.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ld21/b;", "Lm91/f;", "Ld21/c;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Ld21/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "currentHeightInCentimeters", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11504b implements InterfaceC25297f<C11505c> {
    /* JADX INFO: renamed from: d */
    private static final int m30935d(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: e */
    private static final void m30936e(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m30937f(Function1 function1, C11505c c11505c, InterfaceC28601c1 interfaceC28601c1, int i13) {
        m30936e(interfaceC28601c1, i13);
        function1.invoke(new DesignItemInteraction(c11505c.getStateUpdate().invoke(Integer.valueOf(i13), c11505c.getIsImperial() ? UnitSystem.IMPERIAL : UnitSystem.METRIC), null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m30938g(C11504b c11504b, Modifier modifier, C11505c c11505c, Function1 function1, int i13, Composer composer, int i14) {
        c11504b.Compose(modifier, c11505c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C11505c itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-715262280);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean zM87149e = c28655q.m87149e(itemState.getHeightInCentimeters());
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87149e || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Integer.valueOf(itemState.getHeightInCentimeters()));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            C11509g c11509g = new C11509g(itemState.getIsImperial() ? UnitSystem.IMPERIAL : UnitSystem.METRIC, m30935d(interfaceC28601c1), itemState.getFeetRange(), itemState.getCentimetersRange(), itemState.getFeetLabel(), itemState.getInchesLabel(), itemState.getCentimetersLabel());
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | ((i14 & 896) == 256) | c28655q.m87157i(itemState);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C29656q(onViewEvent, (Object) itemState, (Object) interfaceC28601c1, 26);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC11508f.m30953e(c11509g, (Function1) objM87133R2, modifier, 0.0f, null, false, c28655q, (i14 << 6) & 896, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4025f5(this, modifier, itemState, onViewEvent, i13, 16);
        }
    }
}
