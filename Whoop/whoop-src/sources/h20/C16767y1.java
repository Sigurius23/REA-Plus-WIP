package h20;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.y1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16767y1 implements Parcelable {
    public static final Parcelable.Creator<C16767y1> CREATOR = new C16699n(26);

    /* JADX INFO: renamed from: w */
    public final String f64443w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC41211c f64444x;

    /* JADX INFO: renamed from: y */
    public final boolean f64445y;

    public C16767y1(String id4, InterfaceC41211c interfaceC41211c, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        this.f64443w = id4;
        this.f64444x = interfaceC41211c;
        this.f64445y = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16767y1)) {
            return false;
        }
        C16767y1 c16767y1 = (C16767y1) obj;
        return AbstractC22676k.m65745e(this.f64443w, c16767y1.f64443w) && AbstractC22676k.m65745e(this.f64444x, c16767y1.f64444x) && this.f64445y == c16767y1.f64445y;
    }

    public final int hashCode() {
        int iHashCode = this.f64443w.hashCode() * 31;
        InterfaceC41211c interfaceC41211c = this.f64444x;
        return Boolean.hashCode(this.f64445y) + ((iHashCode + (interfaceC41211c == null ? 0 : interfaceC41211c.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CustomPaymentMethod(id=");
        sb4.append(this.f64443w);
        sb4.append(", subtitle=");
        sb4.append(this.f64444x);
        sb4.append(", disableBillingDetailCollection=");
        return AbstractC18489d0.m53372m(sb4, this.f64445y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64443w);
        dest.writeParcelable(this.f64444x, i13);
        dest.writeInt(this.f64445y ? 1 : 0);
    }
}
