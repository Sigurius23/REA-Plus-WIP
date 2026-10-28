package ue3;

import aa3.C0656u0;
import af3.AbstractC0844t;
import af3.C0823a0;
import af3.C0845u;
import df3.InterfaceC12001a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p319m4.AbstractC25012a;
import te3.C33754a;
import xe3.C38241d;

/* JADX INFO: renamed from: ue3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C34864a implements InterfaceC12001a {
    @Override // df3.InterfaceC12001a
    /* JADX INFO: renamed from: a */
    public final int mo33077a(C38241d c38241d, C38241d c38241d2) {
        ArrayList arrayList = c38241d.f163952a;
        int size = arrayList.size();
        ArrayList arrayList2 = c38241d2.f163952a;
        if (size != arrayList2.size() || arrayList.size() > 2) {
            return 0;
        }
        C0823a0 c0823a0 = (C0823a0) AbstractC25012a.m73371d(arrayList, 1);
        C33754a c33754a = new C33754a();
        C0656u0 c0656u0 = new C0656u0();
        c0656u0.m1639h(c38241d.m122569b(arrayList.size()));
        C0845u c0845u = new C0845u(c0823a0.f3042e, (C0823a0) arrayList2.get(0));
        while (c0845u.hasNext()) {
            AbstractC0844t abstractC0844t = (AbstractC0844t) c0845u.next();
            c33754a.m2055c(abstractC0844t);
            c0656u0.m1638g(abstractC0844t.m2056e());
        }
        c0656u0.m1639h(c38241d2.m122568a(arrayList2.size()));
        List list = c0656u0.f2286a;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        c33754a.m2058h(list);
        c0823a0.m2057f(c33754a);
        return arrayList.size();
    }

    @Override // df3.InterfaceC12001a
    /* JADX INFO: renamed from: b */
    public final char mo33078b() {
        return '~';
    }

    @Override // df3.InterfaceC12001a
    /* JADX INFO: renamed from: c */
    public final int mo33079c() {
        return 1;
    }

    @Override // df3.InterfaceC12001a
    /* JADX INFO: renamed from: d */
    public final char mo33080d() {
        return '~';
    }
}
