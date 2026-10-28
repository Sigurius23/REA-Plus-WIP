package io;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import p309lo.AbstractC24567y;
import sn.C32768x0;

/* JADX INFO: renamed from: io.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C18744f extends C20711w {

    /* JADX INFO: renamed from: o0 */
    public static final /* synthetic */ int f73655o0 = 0;

    /* JADX INFO: renamed from: Z */
    public final int f73656Z;

    /* JADX INFO: renamed from: a0 */
    public final boolean f73657a0;

    /* JADX INFO: renamed from: b0 */
    public final boolean f73658b0;

    /* JADX INFO: renamed from: c0 */
    public final boolean f73659c0;

    /* JADX INFO: renamed from: d0 */
    public final boolean f73660d0;

    /* JADX INFO: renamed from: e0 */
    public final boolean f73661e0;

    /* JADX INFO: renamed from: f0 */
    public final boolean f73662f0;

    /* JADX INFO: renamed from: g0 */
    public final boolean f73663g0;

    /* JADX INFO: renamed from: h0 */
    public final boolean f73664h0;

    /* JADX INFO: renamed from: i0 */
    public final boolean f73665i0;

    /* JADX INFO: renamed from: j0 */
    public final boolean f73666j0;

    /* JADX INFO: renamed from: k0 */
    public final boolean f73667k0;

    /* JADX INFO: renamed from: l0 */
    public final boolean f73668l0;

    /* JADX INFO: renamed from: m0 */
    public final SparseArray f73669m0;

    /* JADX INFO: renamed from: n0 */
    public final SparseBooleanArray f73670n0;

    static {
        new C18745g();
    }

    public C18744f(C18745g c18745g) {
        super(c18745g);
        this.f73657a0 = c18745g.f73685z;
        this.f73658b0 = c18745g.f73671A;
        this.f73659c0 = c18745g.f73672B;
        this.f73660d0 = c18745g.f73673C;
        this.f73661e0 = c18745g.f73674D;
        this.f73662f0 = c18745g.f73675E;
        this.f73663g0 = c18745g.f73676F;
        this.f73664h0 = c18745g.f73677G;
        this.f73665i0 = c18745g.f73678H;
        this.f73656Z = c18745g.f73679I;
        this.f73666j0 = c18745g.f73680J;
        this.f73667k0 = c18745g.f73681K;
        this.f73668l0 = c18745g.f73682L;
        this.f73669m0 = c18745g.f73683M;
        this.f73670n0 = c18745g.f73684N;
    }

    @Override // io.C20711w
    /* JADX INFO: renamed from: a */
    public final C20710v mo54510a() {
        return new C18745g(this);
    }

    @Override // io.C20711w
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18744f.class == obj.getClass()) {
            C18744f c18744f = (C18744f) obj;
            if (super.equals(c18744f) && this.f73657a0 == c18744f.f73657a0 && this.f73658b0 == c18744f.f73658b0 && this.f73659c0 == c18744f.f73659c0 && this.f73660d0 == c18744f.f73660d0 && this.f73661e0 == c18744f.f73661e0 && this.f73662f0 == c18744f.f73662f0 && this.f73663g0 == c18744f.f73663g0 && this.f73664h0 == c18744f.f73664h0 && this.f73665i0 == c18744f.f73665i0 && this.f73656Z == c18744f.f73656Z && this.f73666j0 == c18744f.f73666j0 && this.f73667k0 == c18744f.f73667k0 && this.f73668l0 == c18744f.f73668l0) {
                SparseBooleanArray sparseBooleanArray = c18744f.f73670n0;
                SparseBooleanArray sparseBooleanArray2 = this.f73670n0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    for (int i13 = 0; i13 < size; i13++) {
                        if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i13)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = c18744f.f73669m0;
                    SparseArray sparseArray2 = this.f73669m0;
                    int size2 = sparseArray2.size();
                    if (sparseArray.size() == size2) {
                        for (int i14 = 0; i14 < size2; i14++) {
                            int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i14));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray2.valueAt(i14);
                                Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        C32768x0 c32768x0 = (C32768x0) entry.getKey();
                                        if (!map2.containsKey(c32768x0) || !AbstractC24567y.m71670a(entry.getValue(), map2.get(c32768x0))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // io.C20711w
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f73657a0 ? 1 : 0)) * 31) + (this.f73658b0 ? 1 : 0)) * 31) + (this.f73659c0 ? 1 : 0)) * 31) + (this.f73660d0 ? 1 : 0)) * 31) + (this.f73661e0 ? 1 : 0)) * 31) + (this.f73662f0 ? 1 : 0)) * 31) + (this.f73663g0 ? 1 : 0)) * 31) + (this.f73664h0 ? 1 : 0)) * 31) + (this.f73665i0 ? 1 : 0)) * 31) + this.f73656Z) * 31) + (this.f73666j0 ? 1 : 0)) * 31) + (this.f73667k0 ? 1 : 0)) * 31) + (this.f73668l0 ? 1 : 0);
    }
}
