package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ux.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C35340k implements Parcelable {
    public static final Parcelable.Creator<C35340k> CREATOR = new C35332g(2);

    /* JADX INFO: renamed from: w */
    public final String f150555w;

    /* JADX INFO: renamed from: x */
    public final C35344m f150556x;

    public C35340k(String str, C35344m softwareInfo) {
        AbstractC22676k.m65750j(softwareInfo, "softwareInfo");
        this.f150555w = str;
        this.f150556x = softwareInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35340k)) {
            return false;
        }
        C35340k c35340k = (C35340k) obj;
        return AbstractC22676k.m65745e(this.f150555w, c35340k.f150555w) && AbstractC22676k.m65745e(this.f150556x, c35340k.f150556x);
    }

    public final int hashCode() {
        String str = this.f150555w;
        return this.f150556x.f150564w.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "MerchantInfo(merchantName=" + this.f150555w + ", softwareInfo=" + this.f150556x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f150555w);
        this.f150556x.writeToParcel(dest, i13);
    }
}
