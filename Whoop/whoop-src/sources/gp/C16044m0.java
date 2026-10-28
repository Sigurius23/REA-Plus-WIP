package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import mp.C25801t0;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16044m0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16044m0> CREATOR = new C16040k0(19);

    /* JADX INFO: renamed from: w */
    public final C25801t0 f60678w;

    /* JADX INFO: renamed from: x */
    public final C25801t0 f60679x;

    public C16044m0(C25801t0 c25801t0, C25801t0 c25801t1) {
        this.f60678w = c25801t0;
        this.f60679x = c25801t1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16044m0)) {
            return false;
        }
        C16044m0 c16044m0 = (C16044m0) obj;
        return AbstractC35135w.m111097i(this.f60678w, c16044m0.f60678w) && AbstractC35135w.m111097i(this.f60679x, c16044m0.f60679x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60678w, this.f60679x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        C25801t0 c25801t0 = this.f60678w;
        AbstractC36221c.m115325f(parcel, 1, c25801t0 == null ? null : c25801t0.m76050m());
        C25801t0 c25801t1 = this.f60679x;
        AbstractC36221c.m115325f(parcel, 2, c25801t1 != null ? c25801t1.m76050m() : null);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
