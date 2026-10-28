package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1663b2 {

    /* JADX INFO: renamed from: a */
    public SparseArray f6582a;

    /* JADX INFO: renamed from: b */
    public int f6583b;

    /* JADX INFO: renamed from: c */
    public Set f6584c;

    /* JADX INFO: renamed from: a */
    public final C1658a2 m5192a(int i13) {
        SparseArray sparseArray = this.f6582a;
        C1658a2 c1658a2 = (C1658a2) sparseArray.get(i13);
        if (c1658a2 != null) {
            return c1658a2;
        }
        C1658a2 c1658a3 = new C1658a2();
        sparseArray.put(i13, c1658a3);
        return c1658a3;
    }
}
