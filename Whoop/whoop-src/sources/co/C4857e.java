package co;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p621xn.InterfaceC38468e;

/* JADX INFO: renamed from: co.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C4857e implements InterfaceC38468e {

    /* JADX INFO: renamed from: w */
    public final ArrayList f20200w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f20201x;

    public /* synthetic */ C4857e(ArrayList arrayList, ArrayList arrayList2) {
        this.f20200w = arrayList;
        this.f20201x = arrayList2;
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: b */
    public int mo1673b(long j7) {
        int i13;
        Long lValueOf = Long.valueOf(j7);
        int i14 = AbstractC24567y.f95875a;
        ArrayList arrayList = this.f20201x;
        int iBinarySearch = Collections.binarySearch(arrayList, lValueOf);
        if (iBinarySearch < 0) {
            i13 = ~iBinarySearch;
        } else {
            int size = arrayList.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i13 = iBinarySearch;
        }
        if (i13 < arrayList.size()) {
            return i13;
        }
        return -1;
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: d */
    public List mo1674d(long j7) {
        int iM71672c = AbstractC24567y.m71672c(this.f20201x, Long.valueOf(j7), false);
        return iM71672c == -1 ? Collections.EMPTY_LIST : (List) this.f20200w.get(iM71672c);
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: h */
    public long mo1675h(int i13) {
        AbstractC24543a.m71569e(i13 >= 0);
        ArrayList arrayList = this.f20201x;
        AbstractC24543a.m71569e(i13 < arrayList.size());
        return ((Long) arrayList.get(i13)).longValue();
    }

    @Override // p621xn.InterfaceC38468e, qa.InterfaceC30100e
    /* JADX INFO: renamed from: j */
    public int mo1676j() {
        return this.f20201x.size();
    }
}
