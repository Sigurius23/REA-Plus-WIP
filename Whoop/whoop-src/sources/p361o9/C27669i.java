package p361o9;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import p516u8.C34617s0;

/* JADX INFO: renamed from: o9.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C27669i extends C34617s0 {

    /* JADX INFO: renamed from: A */
    public final boolean f111367A;

    /* JADX INFO: renamed from: B */
    public final SparseArray f111368B;

    /* JADX INFO: renamed from: C */
    public final SparseBooleanArray f111369C;

    /* JADX INFO: renamed from: u */
    public final boolean f111370u;

    /* JADX INFO: renamed from: v */
    public final boolean f111371v;

    /* JADX INFO: renamed from: w */
    public final boolean f111372w;

    /* JADX INFO: renamed from: x */
    public final boolean f111373x;

    /* JADX INFO: renamed from: y */
    public final boolean f111374y;

    /* JADX INFO: renamed from: z */
    public final boolean f111375z;

    public C27669i(C27670j c27670j) {
        m109414b(c27670j);
        this.f111370u = c27670j.f111380u;
        this.f111371v = c27670j.f111381v;
        this.f111372w = c27670j.f111382w;
        this.f111373x = c27670j.f111383x;
        this.f111374y = c27670j.f111384y;
        this.f111375z = c27670j.f111385z;
        this.f111367A = c27670j.f111377A;
        SparseArray sparseArray = c27670j.f111378B;
        SparseArray sparseArray2 = new SparseArray();
        for (int i13 = 0; i13 < sparseArray.size(); i13++) {
            sparseArray2.put(sparseArray.keyAt(i13), new HashMap((Map) sparseArray.valueAt(i13)));
        }
        this.f111368B = sparseArray2;
        this.f111369C = c27670j.f111379C.clone();
    }

    @Override // p516u8.C34617s0
    /* JADX INFO: renamed from: c */
    public final C34617s0 mo83662c(String[] strArr) {
        super.mo83662c(strArr);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public final void m83663d(int i13) {
        this.f145826t.remove(Integer.valueOf(i13));
    }

    public C27669i() {
        this.f111368B = new SparseArray();
        this.f111369C = new SparseBooleanArray();
        this.f111370u = true;
        this.f111371v = true;
        this.f111372w = true;
        this.f111373x = true;
        this.f111374y = true;
        this.f111375z = true;
        this.f111367A = true;
    }
}
