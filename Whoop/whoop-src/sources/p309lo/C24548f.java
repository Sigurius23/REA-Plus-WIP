package p309lo;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: lo.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C24548f {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f95817a;

    public C24548f(SparseBooleanArray sparseBooleanArray) {
        this.f95817a = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: a */
    public final int m71595a(int i13) {
        SparseBooleanArray sparseBooleanArray = this.f95817a;
        AbstractC24543a.m71572h(i13, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24548f)) {
            return false;
        }
        C24548f c24548f = (C24548f) obj;
        SparseBooleanArray sparseBooleanArray = c24548f.f95817a;
        int i13 = AbstractC24567y.f95875a;
        SparseBooleanArray sparseBooleanArray2 = this.f95817a;
        if (i13 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i14 = 0; i14 < sparseBooleanArray2.size(); i14++) {
            if (m71595a(i14) != c24548f.m71595a(i14)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i13 = AbstractC24567y.f95875a;
        SparseBooleanArray sparseBooleanArray = this.f95817a;
        if (i13 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i14 = 0; i14 < sparseBooleanArray.size(); i14++) {
            size = (size * 31) + m71595a(i14);
        }
        return size;
    }
}
