package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb0.C39382e;
import zz0.AbstractC41246g;
import zz0.AbstractC41251l;
import zz0.C41249j;
import zz0.C41252m;

/* JADX INFO: renamed from: zc1.z */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "c", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40527z {
    /* JADX INFO: renamed from: c */
    public static final void m131244c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1855679268);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(C41249j.f177965a.m134004a());
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 8, C2314t.f9131w);
            C41252m c41252m = (C41252m) interfaceC28601c1.getValue();
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C39382e(17, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC41246g.m133984n(modifierM3394p, c41252m, (Function1) objM87133R2, c28655q, (C41252m.f177975g << 3) | 390, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40363j(i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m131245d(InterfaceC28601c1 interfaceC28601c1, AbstractC41251l event) {
        String strM134011a;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC41251l.b) {
            strM134011a = ((AbstractC41251l.b) event).getNextDateTime();
        } else {
            if (!(event instanceof AbstractC41251l.a)) {
                throw new NoWhenBranchMatchedException();
            }
            strM134011a = ((AbstractC41251l.a) event).getPreviousDateTime();
        }
        interfaceC28601c1.setValue(C41249j.f177965a.m134005b(strM134011a));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m131246e(int i13, Composer composer, int i14) {
        m131244c(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
