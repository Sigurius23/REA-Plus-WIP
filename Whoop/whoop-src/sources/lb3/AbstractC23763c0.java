package lb3;

import java.io.IOException;
import java.util.Iterator;
import m83.AbstractC25265s;
import ob3.InterfaceC27799i;
import ob3.InterfaceC27800j;
import s93.InterfaceC32300b;
import xa3.C38148i;
import yb3.AbstractC39419w;

/* JADX INFO: renamed from: lb3.c0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23763c0 extends AbstractC23773f1 implements InterfaceC27799i, InterfaceC27800j {
    public String toString() throws IOException {
        StringBuilder sb4 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            AbstractC39419w.m125911u(sb4, "[", C38148i.f163320e.m122220x((InterfaceC32300b) it.next(), null), "] ");
        }
        sb4.append(mo69844i0());
        if (!mo69842X().isEmpty()) {
            AbstractC25265s.m74109M0(mo69842X(), sb4, ", ", "<", ">", null, 112);
        }
        if (mo69814k0()) {
            sb4.append("?");
        }
        return sb4.toString();
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC23763c0 mo64125r0(boolean z4);

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC23763c0 mo64127t0(C23784k0 c23784k0);
}
