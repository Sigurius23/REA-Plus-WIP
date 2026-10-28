package p730qt2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import f41.C14063a;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import java.util.Iterator;
import l83.C23454a0;
import os0.C28308d;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.InterfaceC22996s0;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.C29124b;
import qz0.AbstractC30795n;
import te0.AbstractC33745d;
import x81.C38072d;

/* JADX INFO: renamed from: qt2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lf41/a;", "behaviorBottomSheetState", "Ll83/a0;", "e", "(Lf41/a;Landroidx/compose/runtime/Composer;I)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30593b {
    /* JADX INFO: renamed from: e */
    public static final void m93841e(C14063a behaviorBottomSheetState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(behaviorBottomSheetState, "behaviorBottomSheetState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1867609943);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(behaviorBottomSheetState) : c28655q.m87157i(behaviorBottomSheetState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 8, C2314t.f9131w);
            if ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(behaviorBottomSheetState))) {
                z4 = true;
            }
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C29124b(behaviorBottomSheetState, 16);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65717c(modifierM3394p, null, null, null, null, null, false, null, (Function1) objM87133R, c28655q, 6, 510);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(behaviorBottomSheetState, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m93842f(C14063a c14063a, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C30591a(c14063a, 0), true, -2038131294), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m93843g(C14063a c14063a, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            TextResource impactTitle = c14063a.getImpactTitle();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(impactTitle, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long brandWhite = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a t14 = c38072d.m121952e(c28655q, i15).getT4();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q, 0, i16, 196602);
            float f13 = 8;
            float f14 = 2 * f13;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c14063a.getDescription(), c28655q, i14), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, i16, 196602);
            if (c14063a.m40024d().isEmpty()) {
                c28655q.m87150e0(-15453184);
                c28655q.m87173q(false);
            } else {
                AbstractC33745d.m106667z(c28655q, -16143182, c2314t, f14, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c14063a.getMetricsTagTitle(), c28655q, i14), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getSh4(), null, c28655q, 0, i16, 196602);
                float f15 = 1 * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
                AbstractC22960g2.m66729a(null, AbstractC22977m.m66746i(f15), AbstractC22977m.m66746i(f15), null, 0, 0, AbstractC37817c.m121344e(-1117112542, c28655q, new C30591a(c14063a, 1)), c28655q, 1573296, 57);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m93844h(C14063a c14063a, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Iterator<T> it = c14063a.m40024d().iterator();
            while (it.hasNext()) {
                AbstractC17746g1.m50872h((C17750h1) it.next(), null, null, c28655q, C17750h1.f69012w, 6);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m93845i(C14063a c14063a, int i13, Composer composer, int i14) {
        m93841e(c14063a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
