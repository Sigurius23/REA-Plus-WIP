package p503tp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: tp.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C34043n extends AbstractC36219a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C34043n> CREATOR = new C34025a0(8);

    /* JADX INFO: renamed from: w */
    public final List f142716w;

    /* JADX INFO: renamed from: x */
    public final int f142717x;

    public C34043n(ArrayList arrayList, int i13) {
        this.f142716w = arrayList;
        this.f142717x = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34043n)) {
            return false;
        }
        C34043n c34043n = (C34043n) obj;
        return AbstractC35135w.m111097i(this.f142716w, c34043n.f142716w) && this.f142717x == c34043n.f142717x;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f142716w, Integer.valueOf(this.f142717x)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        AbstractC35135w.m111094f(parcel);
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115336q(parcel, 1, this.f142716w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f142717x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
