package np;

import android.os.Parcel;
import p073cq.C11048q;
import p229ip.AbstractBinderC20797h;
import p503tp.C34041l;

/* JADX INFO: renamed from: np.h */
/* JADX INFO: loaded from: classes6.dex */
public final class BinderC27003h extends AbstractBinderC20797h {

    /* JADX INFO: renamed from: g */
    public C11048q f107682g;

    @Override // p229ip.AbstractBinderC20797h
    /* JADX INFO: renamed from: m0 */
    public final boolean mo57333m0(Parcel parcel, int i13) {
        if (i13 != 1) {
            return false;
        }
        this.f107682g.m29697b((C34041l) AbstractC27007l.m80995b(parcel, C34041l.CREATOR));
        this.f107682g = null;
        return true;
    }
}
