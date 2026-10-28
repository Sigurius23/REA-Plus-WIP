package p635y2;

import java.util.ArrayList;
import java.util.List;
import p005a3.C0251s1;
import p636y3.AbstractC39170b;

/* JADX INFO: renamed from: y2.z0 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC39151z0 {
    /* JADX INFO: renamed from: a */
    InterfaceC39130s0 mo43536a(InterfaceC39133t0 interfaceC39133t0, List list, long j7);

    /* JADX INFO: renamed from: b */
    default int mo66766b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            List list2 = (List) arrayList.get(i14);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                arrayList3.add(new C0251s1((InterfaceC39124q0) list2.get(i15), EnumC39129s.f168267w, EnumC39132t.f168271x, 1));
            }
            arrayList2.add(arrayList3);
        }
        return mo43536a(new C39138v(interfaceC39126r, interfaceC39126r.getLayoutDirection()), arrayList2, AbstractC39170b.m124770b(i13, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: c */
    default int mo66767c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            List list2 = (List) arrayList.get(i14);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                arrayList3.add(new C0251s1((InterfaceC39124q0) list2.get(i15), EnumC39129s.f168268x, EnumC39132t.f168270w, 1));
            }
            arrayList2.add(arrayList3);
        }
        return mo43536a(new C39138v(interfaceC39126r, interfaceC39126r.getLayoutDirection()), arrayList2, AbstractC39170b.m124770b(0, i13, 7)).getWidth();
    }

    /* JADX INFO: renamed from: d */
    default int mo66768d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            List list2 = (List) arrayList.get(i14);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                arrayList3.add(new C0251s1((InterfaceC39124q0) list2.get(i15), EnumC39129s.f168268x, EnumC39132t.f168271x, 1));
            }
            arrayList2.add(arrayList3);
        }
        return mo43536a(new C39138v(interfaceC39126r, interfaceC39126r.getLayoutDirection()), arrayList2, AbstractC39170b.m124770b(i13, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: e */
    default int mo66769e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            List list2 = (List) arrayList.get(i14);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i15 = 0; i15 < size2; i15++) {
                arrayList3.add(new C0251s1((InterfaceC39124q0) list2.get(i15), EnumC39129s.f168267w, EnumC39132t.f168270w, 1));
            }
            arrayList2.add(arrayList3);
        }
        return mo43536a(new C39138v(interfaceC39126r, interfaceC39126r.getLayoutDirection()), arrayList2, AbstractC39170b.m124770b(0, i13, 7)).getWidth();
    }
}
