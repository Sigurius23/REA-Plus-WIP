package ye3;

import aa3.C0656u0;
import af3.AbstractC0844t;
import af3.C0823a0;
import af3.C0832h;
import af3.C0845u;
import af3.C0850z;
import df3.InterfaceC12001a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xe3.C38241d;

/* JADX INFO: renamed from: ye3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C39481a implements InterfaceC12001a {

    /* JADX INFO: renamed from: a */
    public final char f169870a;

    public C39481a(char c3) {
        this.f169870a = c3;
    }

    @Override // df3.InterfaceC12001a
    /* JADX INFO: renamed from: a */
    public final int mo33077a(C38241d c38241d, C38241d c38241d2) {
        AbstractC0844t c0832h;
        ArrayList arrayList = c38241d.f163952a;
        ArrayList arrayList2 = c38241d2.f163952a;
        if (c38241d.f163956e || c38241d2.f163955d) {
            int i13 = c38241d2.f163954c;
            if (i13 % 3 != 0 && (c38241d.f163954c + i13) % 3 == 0) {
                return 0;
            }
        }
        int size = arrayList.size();
        char c3 = this.f169870a;
        int i14 = 2;
        if (size < 2 || arrayList2.size() < 2) {
            String.valueOf(c3);
            c0832h = new C0832h();
            i14 = 1;
        } else {
            String.valueOf(c3);
            c0832h = new C0850z();
        }
        C0656u0 c0656u0 = new C0656u0();
        c0656u0.m1639h(c38241d.m122569b(i14));
        C0823a0 c0823a0 = (C0823a0) arrayList.get(arrayList.size() - 1);
        C0845u c0845u = new C0845u(c0823a0.f3042e, (C0823a0) arrayList2.get(0));
        while (c0845u.hasNext()) {
            AbstractC0844t abstractC0844t = (AbstractC0844t) c0845u.next();
            c0832h.m2055c(abstractC0844t);
            c0656u0.m1638g(abstractC0844t.m2056e());
        }
        c0656u0.m1639h(c38241d2.m122568a(i14));
        List list = c0656u0.f2286a;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        c0832h.m2058h(list);
        c0823a0.m2057f(c0832h);
        return i14;
    }

    @Override // df3.InterfaceC12001a
    /* JADX INFO: renamed from: b */
    public final char mo33078b() {
        return this.f169870a;
    }

    @Override // df3.InterfaceC12001a
    /* JADX INFO: renamed from: c */
    public final int mo33079c() {
        return 1;
    }

    @Override // df3.InterfaceC12001a
    /* JADX INFO: renamed from: d */
    public final char mo33080d() {
        return this.f169870a;
    }
}
