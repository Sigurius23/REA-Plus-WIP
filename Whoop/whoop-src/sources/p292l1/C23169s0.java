package p292l1;

import l83.C23454a0;
import p316m1.C24916n;
import p316m1.C24919q;
import p316m1.C24920r;
import p390p1.C28633k1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23169s0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91627w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23098g1 f91628x;

    public /* synthetic */ C23169s0(InterfaceC23098g1 interfaceC23098g1, int i13) {
        this.f91627w = i13;
        this.f91628x = interfaceC23098g1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f91627w) {
            case 0:
                int i13 = ((C23122k1) obj).f91354a;
                C23104h1 c23104h1 = (C23104h1) this.f91628x;
                Long lM67085b = c23104h1.m67085b();
                C24919q c24919q = c23104h1.f91241c;
                if (lM67085b != null) {
                    C24920r c24920rMo73018a = c24919q.mo73018a(c24919q.mo73018a(lM67085b.longValue()).f97603e);
                    if (c23104h1.f91239a.m52655e(c24920rMo73018a.f97599a)) {
                        c23104h1.f91243e.setValue(c24920rMo73018a);
                    }
                }
                c23104h1.f91245g.setValue(new C23122k1(i13));
                break;
            case 1:
                Long l7 = (Long) obj;
                C23104h1 c23104h2 = (C23104h1) this.f91628x;
                C28633k1 c28633k1 = c23104h2.f91244f;
                if (l7 != null) {
                    C24916n c24916nM73021d = c23104h2.f91241c.m73021d(l7.longValue());
                    c28633k1.setValue(c23104h2.f91239a.m52655e(c24916nM73021d.f97589w) ? c24916nM73021d : null);
                } else {
                    c28633k1.setValue(null);
                }
                break;
            default:
                long jLongValue = ((Long) obj).longValue();
                C23104h1 c23104h3 = (C23104h1) this.f91628x;
                C24920r c24920rMo73018a2 = c23104h3.f91241c.mo73018a(jLongValue);
                if (c23104h3.f91239a.m52655e(c24920rMo73018a2.f97599a)) {
                    c23104h3.f91243e.setValue(c24920rMo73018a2);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
