package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37712e0 implements Parcelable {
    public static final Parcelable.Creator<C37712e0> CREATOR = new C37677f(11);

    /* JADX INFO: renamed from: w */
    public final boolean f161578w;

    /* JADX INFO: renamed from: x */
    public final List f161579x;

    public C37712e0(boolean z4, List preferredNetworks) {
        AbstractC22676k.m65750j(preferredNetworks, "preferredNetworks");
        this.f161578w = z4;
        this.f161579x = preferredNetworks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37712e0)) {
            return false;
        }
        C37712e0 c37712e0 = (C37712e0) obj;
        return this.f161578w == c37712e0.f161578w && AbstractC22676k.m65745e(this.f161579x, c37712e0.f161579x);
    }

    public final int hashCode() {
        return this.f161579x.hashCode() + (Boolean.hashCode(this.f161578w) * 31);
    }

    public final String toString() {
        return "CardBrandChoice(eligible=" + this.f161578w + ", preferredNetworks=" + this.f161579x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f161578w ? 1 : 0);
        dest.writeStringList(this.f161579x);
    }
}
