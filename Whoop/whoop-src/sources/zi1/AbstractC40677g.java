package zi1;

import android.annotation.SuppressLint;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import h51.C16934f;
import l83.C23454a0;
import n51.C26299f;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.C22971k;
import p291l0.C22976l1;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p748zc1.C40349h7;
import wb3.AbstractC37056f;
import wq1.C37508b;
import x30.C37900j1;
import yi1.InterfaceC39570d;

/* JADX INFO: renamed from: zi1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lyi1/d$c;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onClick", "e", "(Lyi1/d$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lm91/u;", "state", "Landroidx/compose/ui/Modifier;", "j", "(Lm91/u;)Landroidx/compose/ui/Modifier;", "kennel_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40677g {
    /* JADX INFO: renamed from: e */
    public static final void m132051e(InterfaceC39570d.c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(635662466);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C40349h7(19);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            float f13 = 8;
            C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(0.0f, 2 * f13, 1);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(3 * f13);
            boolean zM87157i = c28655q.m87157i(viewState) | ((i15 & 112) == 32);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C37900j1(21, viewState, function3);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22674j.m65717c(modifierM3407d, null, c22976l1M3379a, c22971kM66746i, null, null, false, null, (Function1) objM87133R2, c28655q, 24966, 490);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(viewState, i13, function2, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m132052f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132053g(InterfaceC39570d.c cVar, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        int i13 = 0;
        for (Object obj : cVar.m126376a()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C26299f((InterfaceC25312u) obj, function1, 4), true, 1491476513), 3);
            i13 = i14;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m132054h(InterfaceC25312u interfaceC25312u, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC40692v.m132139d(interfaceC25312u, function1, m132056j(interfaceC25312u), c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m132055i(InterfaceC39570d.c cVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m132051e(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    @SuppressLint({"ModifierFactoryExtensionFunction"})
    /* JADX INFO: renamed from: j */
    private static final Modifier m132056j(InterfaceC25312u interfaceC25312u) {
        boolean z4 = interfaceC25312u instanceof C16934f;
        C2314t c2314t = C2314t.f9131w;
        return z4 ? c2314t : AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2);
    }
}
