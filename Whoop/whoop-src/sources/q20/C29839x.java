package q20;

import android.os.Parcel;
import android.os.Parcelable;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q20.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C29839x extends AbstractC29840y {

    /* JADX INFO: renamed from: x */
    public static final C29839x f121958x = new C29839x();
    public static final Parcelable.Creator<C29839x> CREATOR = new C29831p(4);

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
        return this == obj || (obj instanceof C29839x);
    }

    @Override // q20.AbstractC29840y
    /* JADX INFO: renamed from: f */
    public final InterfaceC41211c mo91324f(String merchantName, boolean z4) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        return null;
    }

    public final int hashCode() {
        return 2007368465;
    }

    public final String toString() {
        return "ShopPay";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
