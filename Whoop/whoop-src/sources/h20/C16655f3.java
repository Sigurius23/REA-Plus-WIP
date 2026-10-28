package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.f3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16655f3 implements Parcelable {
    public static final Parcelable.Creator<C16655f3> CREATOR = new C16654f2(17);

    /* JADX INFO: renamed from: w */
    public final String f64035w;

    /* JADX INFO: renamed from: x */
    public final int f64036x;

    /* JADX INFO: renamed from: y */
    public final String f64037y;

    public C16655f3(String id4, int i13, String displayName, InterfaceC16643d3 interfaceC16643d3) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(displayName, "displayName");
        this.f64035w = id4;
        this.f64036x = i13;
        this.f64037y = displayName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16655f3)) {
            return false;
        }
        C16655f3 c16655f3 = (C16655f3) obj;
        return AbstractC22676k.m65745e(this.f64035w, c16655f3.f64035w) && this.f64036x == c16655f3.f64036x && AbstractC22676k.m65745e(this.f64037y, c16655f3.f64037y) && AbstractC22676k.m65745e(null, null);
    }

    public final int hashCode() {
        return AbstractC11266d.m30450d(((this.f64035w.hashCode() * 31) + this.f64036x) * 31, 31, this.f64037y) + 0;
    }

    public final String toString() {
        StringBuilder sbM30467u = AbstractC11266d.m30467u(this.f64036x, "ShippingRate(id=", this.f64035w, ", amount=", ", displayName=");
        sbM30467u.append(this.f64037y);
        sbM30467u.append(", deliveryEstimate=");
        sbM30467u.append((Object) null);
        sbM30467u.append(")");
        return sbM30467u.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64035w);
        dest.writeInt(this.f64036x);
        dest.writeString(this.f64037y);
        dest.writeParcelable(null, i13);
    }
}
