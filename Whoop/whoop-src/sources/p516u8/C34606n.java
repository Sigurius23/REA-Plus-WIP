package p516u8;

import android.util.SparseBooleanArray;
import p607x8.AbstractC38065t;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: u8.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C34606n {

    /* JADX INFO: renamed from: a */
    public final SparseBooleanArray f145698a;

    public C34606n(SparseBooleanArray sparseBooleanArray) {
        this.f145698a = sparseBooleanArray;
    }

    /* JADX INFO: renamed from: a */
    public final int m109400a(int i13) {
        SparseBooleanArray sparseBooleanArray = this.f145698a;
        AbstractC35849g.m113804f(i13, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34606n)) {
            return false;
        }
        C34606n c34606n = (C34606n) obj;
        SparseBooleanArray sparseBooleanArray = c34606n.f145698a;
        int i13 = AbstractC38065t.f163031a;
        SparseBooleanArray sparseBooleanArray2 = this.f145698a;
        if (i13 >= 24) {
            return sparseBooleanArray2.equals(sparseBooleanArray);
        }
        if (sparseBooleanArray2.size() != sparseBooleanArray.size()) {
            return false;
        }
        for (int i14 = 0; i14 < sparseBooleanArray2.size(); i14++) {
            if (m109400a(i14) != c34606n.m109400a(i14)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i13 = AbstractC38065t.f163031a;
        SparseBooleanArray sparseBooleanArray = this.f145698a;
        if (i13 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i14 = 0; i14 < sparseBooleanArray.size(); i14++) {
            size = (size * 31) + m109400a(i14);
        }
        return size;
    }
}
