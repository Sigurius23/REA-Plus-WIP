package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.z1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16773z1 implements InterfaceC16630b2 {
    public static final Parcelable.Creator<C16773z1> CREATOR = new C16699n(27);

    /* JADX INFO: renamed from: w */
    public final String f64473w;

    public C16773z1(String customerSessionClientSecret) {
        AbstractC22676k.m65750j(customerSessionClientSecret, "customerSessionClientSecret");
        this.f64473w = customerSessionClientSecret;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // h20.InterfaceC16630b2
    /* JADX INFO: renamed from: e */
    public final String mo47222e() {
        return "customer_session";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16773z1) && AbstractC22676k.m65745e(this.f64473w, ((C16773z1) obj).f64473w);
    }

    public final int hashCode() {
        return this.f64473w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("CustomerSession(customerSessionClientSecret=", this.f64473w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64473w);
    }
}
