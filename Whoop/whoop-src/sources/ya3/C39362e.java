package ya3;

import java.util.Collections;
import java.util.List;
import r93.AbstractC31150q;
import r93.C31148p;
import r93.EnumC31120f;
import r93.InterfaceC31117e;
import r93.InterfaceC31155s0;
import s93.C32305g;
import u93.C34682j;

/* JADX INFO: renamed from: ya3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C39362e extends C34682j {
    public C39362e(InterfaceC31117e interfaceC31117e) {
        C31148p c31148p;
        super(interfaceC31117e, null, C32305g.f133684a, true, 1, InterfaceC31155s0.f128370q);
        List list = Collections.EMPTY_LIST;
        int i13 = AbstractC39363f.f169413a;
        EnumC31120f kind = interfaceC31117e.getKind();
        if (kind == EnumC31120f.f128330y || kind.m95867a()) {
            c31148p = AbstractC31150q.f128349a;
            if (c31148p == null) {
                AbstractC39363f.m125519a(49);
                throw null;
            }
        } else if (AbstractC39363f.m125533o(interfaceC31117e)) {
            c31148p = AbstractC31150q.f128349a;
            if (c31148p == null) {
                AbstractC39363f.m125519a(51);
                throw null;
            }
        } else if (AbstractC39363f.m125528j(interfaceC31117e)) {
            c31148p = AbstractC31150q.f128358j;
            if (c31148p == null) {
                AbstractC39363f.m125519a(52);
                throw null;
            }
        } else {
            c31148p = AbstractC31150q.f128353e;
            if (c31148p == null) {
                AbstractC39363f.m125519a(53);
                throw null;
            }
        }
        m109568X0(list, c31148p);
    }
}
