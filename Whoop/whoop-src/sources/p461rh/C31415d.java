package p461rh;

import c93.InterfaceC4339a;
import java.util.ArrayList;
import java.util.List;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.C25271y;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: rh.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C31415d {

    /* JADX INFO: renamed from: a */
    public final List f129275a;

    /* JADX INFO: renamed from: b */
    public final List f129276b;

    /* JADX INFO: renamed from: c */
    public final List f129277c;

    /* JADX INFO: renamed from: d */
    public List f129278d;

    /* JADX INFO: renamed from: e */
    public List f129279e;

    /* JADX INFO: renamed from: f */
    public final C23470p f129280f;

    /* JADX INFO: renamed from: g */
    public final C23470p f129281g;

    public C31415d(List list, List list2, List list3, List list4, List list5) {
        this.f129275a = list;
        this.f129276b = list2;
        this.f129277c = list3;
        this.f129278d = list4;
        this.f129279e = list5;
        final int i13 = 0;
        this.f129280f = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: rh.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C31415d f129272x;

            {
                this.f129272x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        C31415d c31415d = this.f129272x;
                        List list6 = c31415d.f129278d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            AbstractC25265s.m74141p0(arrayList, (List) ((InterfaceC4339a) list6.get(i14)).invoke());
                        }
                        c31415d.f129278d = C25271y.f99162w;
                        return arrayList;
                    default:
                        C31415d c31415d2 = this.f129272x;
                        List list7 = c31415d2.f129279e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            AbstractC25265s.m74141p0(arrayList2, (List) ((InterfaceC4339a) list7.get(i15)).invoke());
                        }
                        c31415d2.f129279e = C25271y.f99162w;
                        return arrayList2;
                }
            }
        });
        final int i14 = 1;
        this.f129281g = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: rh.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C31415d f129272x;

            {
                this.f129272x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        C31415d c31415d = this.f129272x;
                        List list6 = c31415d.f129278d;
                        ArrayList arrayList = new ArrayList();
                        int size = list6.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            AbstractC25265s.m74141p0(arrayList, (List) ((InterfaceC4339a) list6.get(i15)).invoke());
                        }
                        c31415d.f129278d = C25271y.f99162w;
                        return arrayList;
                    default:
                        C31415d c31415d2 = this.f129272x;
                        List list7 = c31415d2.f129279e;
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = list7.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            AbstractC25265s.m74141p0(arrayList2, (List) ((InterfaceC4339a) list7.get(i16)).invoke());
                        }
                        c31415d2.f129279e = C25271y.f99162w;
                        return arrayList2;
                }
            }
        });
    }
}
