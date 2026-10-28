package ch3;

import bh3.InterfaceC3262i;
import gh3.C15862g;
import java.util.List;
import xg3.AbstractC38292s;
import xg3.C38280g;
import xg3.InterfaceC38278e;

/* JADX INFO: renamed from: ch3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C4683g implements InterfaceC38278e {

    /* JADX INFO: renamed from: w */
    public final Iterable f19164w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC3262i f19165x;

    /* JADX INFO: renamed from: y */
    public final int f19166y;

    public C4683g(List list, InterfaceC3262i interfaceC3262i) {
        int i13 = C15862g.f59961x;
        this.f19164w = list;
        this.f19165x = interfaceC3262i;
        this.f19166y = i13;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        C38280g[] c38280gArr;
        int length;
        AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
        Iterable<C38280g> iterable = this.f19164w;
        if (iterable instanceof List) {
            List list = (List) iterable;
            c38280gArr = (C38280g[]) list.toArray(new C38280g[list.size()]);
            length = c38280gArr.length;
        } else {
            C38280g[] c38280gArr2 = new C38280g[8];
            int i13 = 0;
            for (C38280g c38280g : iterable) {
                if (i13 == c38280gArr2.length) {
                    C38280g[] c38280gArr3 = new C38280g[(i13 >> 2) + i13];
                    System.arraycopy(c38280gArr2, 0, c38280gArr3, 0, i13);
                    c38280gArr2 = c38280gArr3;
                }
                c38280gArr2[i13] = c38280g;
                i13++;
            }
            c38280gArr = c38280gArr2;
            length = i13;
        }
        if (length == 0) {
            abstractC38292s.onCompleted();
            return;
        }
        C4681f c4681f = new C4681f(abstractC38292s, this.f19165x, length, this.f19166y);
        C4679e[] c4679eArr = c4681f.f19161y;
        int length2 = c4679eArr.length;
        for (int i14 = 0; i14 < length2; i14++) {
            c4679eArr[i14] = new C4679e(c4681f, i14);
        }
        c4681f.lazySet(0);
        c4681f.f19159w.m122688c(c4681f);
        c4681f.f19159w.mo14765f(c4681f);
        for (int i15 = 0; i15 < length2 && !c4681f.f19153G; i15++) {
            c38280gArr[i15].m122664N(c4679eArr[i15]);
        }
    }
}
