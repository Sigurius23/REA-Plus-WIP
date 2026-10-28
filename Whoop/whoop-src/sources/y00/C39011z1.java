package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.z1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39011z1 implements Parcelable {
    public static final Parcelable.Creator<C39011z1> CREATOR = new C38992x0(18);

    /* JADX INFO: renamed from: w */
    public final String f167907w;

    /* JADX INFO: renamed from: x */
    public final String f167908x;

    public C39011z1(String networkId, String externalId) {
        AbstractC22676k.m65750j(networkId, "networkId");
        AbstractC22676k.m65750j(externalId, "externalId");
        this.f167907w = networkId;
        this.f167908x = externalId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39011z1)) {
            return false;
        }
        C39011z1 c39011z1 = (C39011z1) obj;
        return AbstractC22676k.m65745e(this.f167907w, c39011z1.f167907w) && AbstractC22676k.m65745e(this.f167908x, c39011z1.f167908x);
    }

    public final int hashCode() {
        return this.f167908x.hashCode() + (this.f167907w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("SellerDetails(networkId=", this.f167907w, ", externalId=", this.f167908x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167907w);
        dest.writeString(this.f167908x);
    }
}
