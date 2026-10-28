package p635y2;

import java.util.ArrayList;
import java.util.List;
import p005a3.C0251s1;
import p636y3.AbstractC39170b;

/* JADX INFO: renamed from: y2.r0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC39127r0 {
    /* JADX INFO: renamed from: a */
    InterfaceC39130s0 mo521a(InterfaceC39133t0 interfaceC39133t0, List list, long j7);

    /* JADX INFO: renamed from: b */
    default int mo537b(InterfaceC39126r interfaceC39126r, List list, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new C0251s1((InterfaceC39124q0) list.get(i14), EnumC39129s.f168267w, EnumC39132t.f168271x, 1));
        }
        return mo521a(new C39138v(interfaceC39126r, interfaceC39126r.getLayoutDirection()), arrayList, AbstractC39170b.m124770b(i13, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: c */
    default int mo538c(InterfaceC39126r interfaceC39126r, List list, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new C0251s1((InterfaceC39124q0) list.get(i14), EnumC39129s.f168268x, EnumC39132t.f168270w, 1));
        }
        return mo521a(new C39138v(interfaceC39126r, interfaceC39126r.getLayoutDirection()), arrayList, AbstractC39170b.m124770b(0, i13, 7)).getWidth();
    }

    /* JADX INFO: renamed from: d */
    default int mo539d(InterfaceC39126r interfaceC39126r, List list, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new C0251s1((InterfaceC39124q0) list.get(i14), EnumC39129s.f168268x, EnumC39132t.f168271x, 1));
        }
        return mo521a(new C39138v(interfaceC39126r, interfaceC39126r.getLayoutDirection()), arrayList, AbstractC39170b.m124770b(i13, 0, 13)).getHeight();
    }

    /* JADX INFO: renamed from: e */
    default int mo540e(InterfaceC39126r interfaceC39126r, List list, int i13) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            arrayList.add(new C0251s1((InterfaceC39124q0) list.get(i14), EnumC39129s.f168267w, EnumC39132t.f168270w, 1));
        }
        return mo521a(new C39138v(interfaceC39126r, interfaceC39126r.getLayoutDirection()), arrayList, AbstractC39170b.m124770b(0, i13, 7)).getWidth();
    }
}
