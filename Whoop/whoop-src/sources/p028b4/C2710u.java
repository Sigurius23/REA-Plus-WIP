package p028b4;

import android.os.Parcelable;
import android.util.SparseArray;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b4.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C2710u extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10677w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2711v f10678x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2710u(C2711v c2711v, int i13) {
        super(0);
        this.f10677w = i13;
        this.f10678x = c2711v;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f10677w) {
            case 0:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f10678x.f10679c0.saveHierarchyState(sparseArray);
                return sparseArray;
            case 1:
                C2711v c2711v = this.f10678x;
                c2711v.getReleaseBlock().invoke(c2711v.f10679c0);
                C2711v.m7593n(c2711v);
                return C23454a0.f92919a;
            case 2:
                C2711v c2711v2 = this.f10678x;
                c2711v2.getResetBlock().invoke(c2711v2.f10679c0);
                return C23454a0.f92919a;
            default:
                C2711v c2711v3 = this.f10678x;
                c2711v3.getUpdateBlock().invoke(c2711v3.f10679c0);
                return C23454a0.f92919a;
        }
    }
}
