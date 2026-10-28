package wa3;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: wa3.l */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC37004l extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: x */
    public C37000j f158354x = C37000j.f158349c;

    /* JADX INFO: renamed from: y */
    public boolean f158355y;

    /* JADX INFO: renamed from: j */
    public final void m118816j(AbstractC37006m abstractC37006m) {
        C36983a0 c36983a0;
        if (!this.f158355y) {
            this.f158354x = this.f158354x.clone();
            this.f158355y = true;
        }
        C37000j c37000j = this.f158354x;
        C37000j c37000j2 = abstractC37006m.f158356w;
        c37000j.getClass();
        int i13 = 0;
        while (true) {
            c36983a0 = c37000j2.f158350a;
            if (i13 >= c36983a0.f158310x.size()) {
                break;
            }
            c37000j.m118810g((Map.Entry) c36983a0.f158310x.get(i13));
            i13++;
        }
        Iterator it = c36983a0.m118729c().iterator();
        while (it.hasNext()) {
            c37000j.m118810g((Map.Entry) it.next());
        }
    }
}
