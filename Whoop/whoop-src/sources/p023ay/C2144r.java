package p023ay;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ay.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C2144r implements InterfaceC2145s {
    public static final Parcelable.Creator<C2144r> CREATOR = new C2125b(3);

    /* JADX INFO: renamed from: w */
    public final String f8540w;

    public C2144r(String clientSecret) {
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f8540w = clientSecret;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2144r) && AbstractC22676k.m65745e(this.f8540w, ((C2144r) obj).f8540w);
    }

    public final int hashCode() {
        return this.f8540w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Success(clientSecret=", this.f8540w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f8540w);
    }
}
