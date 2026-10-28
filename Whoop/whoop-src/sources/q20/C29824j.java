package q20;

import android.os.Parcel;
import android.os.Parcelable;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import pn.C29367a;

/* JADX INFO: renamed from: q20.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C29824j extends AbstractC29840y {

    /* JADX INFO: renamed from: x */
    public static final C29824j f121906x = new C29824j();
    public static final Parcelable.Creator<C29824j> CREATOR = new C29367a(26);

    @Override // q20.AbstractC29840y
    /* JADX INFO: renamed from: b */
    public final boolean mo91323b() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C29824j);
    }

    @Override // q20.AbstractC29840y
    /* JADX INFO: renamed from: f */
    public final InterfaceC41211c mo91324f(String merchantName, boolean z4) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        return null;
    }

    public final int hashCode() {
        return -61554386;
    }

    public final String toString() {
        return "GooglePay";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
