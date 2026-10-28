package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16042l0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16042l0> CREATOR = new C16040k0(8);

    /* JADX INFO: renamed from: w */
    public final String f60675w;

    public C16042l0(String str) {
        this.f60675w = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16042l0) {
            return AbstractC35135w.m111097i(this.f60675w, ((C16042l0) obj).f60675w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60675w});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 1, this.f60675w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
