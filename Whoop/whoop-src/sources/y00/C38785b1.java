package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.b1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38785b1 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38785b1> CREATOR = new C38992x0(2);

    /* JADX INFO: renamed from: w */
    public final boolean f166941w;

    /* JADX INFO: renamed from: x */
    public final List f166942x;

    public C38785b1(boolean z4, List preferredNetworks) {
        AbstractC22676k.m65750j(preferredNetworks, "preferredNetworks");
        this.f166941w = z4;
        this.f166942x = preferredNetworks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38785b1)) {
            return false;
        }
        C38785b1 c38785b1 = (C38785b1) obj;
        return this.f166941w == c38785b1.f166941w && AbstractC22676k.m65745e(this.f166942x, c38785b1.f166942x);
    }

    public final int hashCode() {
        return this.f166942x.hashCode() + (Boolean.hashCode(this.f166941w) * 31);
    }

    public final String toString() {
        return "CardBrandChoice(eligible=" + this.f166941w + ", preferredNetworks=" + this.f166942x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f166941w ? 1 : 0);
        dest.writeStringList(this.f166942x);
    }
}
