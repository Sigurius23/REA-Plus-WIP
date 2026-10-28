package p023ay;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ay.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C2129d implements InterfaceC36562b {
    public static final Parcelable.Creator<C2129d> CREATOR = new C2125b(1);

    /* JADX INFO: renamed from: w */
    public final String f8513w;

    public C2129d(String clientSecret) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f8513w = clientSecret;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2129d) && AbstractC22676k.m65745e(this.f8513w, ((C2129d) obj).f8513w);
    }

    public final int hashCode() {
        return this.f8513w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("BridgeSuccessParams(clientSecret=", this.f8513w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f8513w);
    }
}
