package gb;

import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import p114eb.AbstractC12964i1;
import p114eb.C12977n0;
import p114eb.C12982q;
import p114eb.C12997x0;
import p114eb.InterfaceC12961h1;
import p602x1.C37816b;
import p715kotlin.Metadata;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: gb.q */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12961h1("dialog")
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lgb/q;", "Leb/i1;", "Lgb/p;", "<init>", "()V", "navigation-compose_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
public final class C15656q extends AbstractC12964i1 {
    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: a */
    public final C12977n0 mo36423a() {
        C37816b c37816b = AbstractC15641e.f58697a;
        return new C15655p(this);
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: d */
    public final void mo36436d(List list, C12997x0 c12997x0) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m36435b().m36498h((C12982q) it.next());
        }
    }

    @Override // p114eb.AbstractC12964i1
    /* JADX INFO: renamed from: i */
    public final void mo36441i(C12982q c12982q, boolean z4) {
        m36435b().m36496f(c12982q, z4);
        int iM74104J0 = AbstractC25265s.m74104J0((Iterable) m36435b().f44871f.f45200w.getValue(), c12982q);
        int i13 = 0;
        for (Object obj : (Iterable) m36435b().f44871f.f45200w.getValue()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C12982q c12982q2 = (C12982q) obj;
            if (i13 > iM74104J0) {
                m36435b().m36492b(c12982q2);
            }
            i13 = i14;
        }
    }
}
