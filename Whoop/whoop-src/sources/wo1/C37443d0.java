package wo1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25297f;
import ro1.AbstractC31635g;
import so1.AbstractC32803a0;
import so1.C32806c;
import wm1.C37383e;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: wo1.d0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lwo1/d0;", "Lm91/f;", "Lso1/c;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "modifier", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Landroidx/compose/ui/Modifier;Lso1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37443d0 implements InterfaceC25297f<C32806c> {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m119876h(Function1 function1, AbstractC31635g event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC31635g.e) {
            function1.invoke(((AbstractC31635g.e) event).getNavigationAction());
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m119877i(Function1 function1, AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m119878j(Function1 function1, C32806c c32806c, String it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC32803a0.d(it, c32806c.getSelectedButtonId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m119879k(Function1 function1, C32806c c32806c, String it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC32803a0.d(c32806c.getSegmentedControlDisplayId(), it));
        function1.invoke(AbstractC39672a.v.f170770a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m119880l(Function1 function1, AbstractC39672a it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m119881m(C37443d0 c37443d0, Modifier modifier, C32806c c32806c, Function1 function1, int i13, Composer composer, int i14) {
        c37443d0.Compose(modifier, c32806c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    @Override // p720m91.InterfaceC25297f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void Compose(Modifier modifier, C32806c itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        boolean z4;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(48257702);
        if ((i13 & 48) == 0) {
            i14 = (c28655q.m87157i(itemState) ? 32 : 16) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 145) != 144)) {
            int i15 = i14 & 896;
            boolean z13 = i15 == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C37450h(onViewEvent, 6);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            if (itemState.getUseInternalGraphSelection()) {
                c28655q.m87150e0(-1168412077);
                z4 = i15 == 256;
                Object objM87133R2 = c28655q.m87133R();
                if (z4 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C37450h(onViewEvent, 7);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC37451h0.m119929g(itemState, function1, (Function1) objM87133R2, c28655q, (i14 >> 3) & 14, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1168193310);
                boolean zM87157i = (i15 == 256) | c28655q.m87157i(itemState);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new C37441c0(itemState, onViewEvent, 0);
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function2 = (Function1) objM87133R3;
                boolean zM87157i2 = (i15 == 256) | c28655q.m87157i(itemState);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C37441c0(itemState, onViewEvent, 1);
                    c28655q.m87172p0(objM87133R4);
                }
                Function1 function3 = (Function1) objM87133R4;
                z4 = i15 == 256;
                Object objM87133R5 = c28655q.m87133R();
                if (z4 || objM87133R5 == c28676v0) {
                    objM87133R5 = new C37450h(onViewEvent, 8);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC37447f0.m119911i(itemState, function2, function3, function1, (Function1) objM87133R5, c28655q, (i14 >> 3) & 14, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37383e(this, modifier, itemState, onViewEvent, i13, 9);
        }
    }
}
