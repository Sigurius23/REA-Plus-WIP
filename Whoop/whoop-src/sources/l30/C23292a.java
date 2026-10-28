package l30;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C23292a implements Parcelable {
    public static final Parcelable.Creator<C23292a> CREATOR = new C22060h(19);

    /* JADX INFO: renamed from: w */
    public final String f92280w;

    /* JADX INFO: renamed from: x */
    public final int f92281x;

    public C23292a(String sdkAppId, int i13) {
        AbstractC22676k.m65750j(sdkAppId, "sdkAppId");
        this.f92280w = sdkAppId;
        this.f92281x = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23292a)) {
            return false;
        }
        C23292a c23292a = (C23292a) obj;
        return AbstractC22676k.m65745e(this.f92280w, c23292a.f92280w) && this.f92281x == c23292a.f92281x;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92281x) + (this.f92280w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC11895b.m31993l(this.f92281x, "AppInfo(sdkAppId=", this.f92280w, ", version=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f92280w);
        dest.writeInt(this.f92281x);
    }
}
