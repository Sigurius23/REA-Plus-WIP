package w10;

import android.os.Parcel;
import android.os.Parcelable;
import p266jz.C22057e;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35467g0;

/* JADX INFO: renamed from: w10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C36689a implements Parcelable, InterfaceC36692d {
    public static final Parcelable.Creator<C36689a> CREATOR = new C35467g0(11);

    /* JADX INFO: renamed from: w */
    public final String f157126w;

    /* JADX INFO: renamed from: x */
    public final C22057e f157127x;

    public C36689a(String str, C22057e c22057e) {
        this.f157126w = str;
        this.f157127x = c22057e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36689a)) {
            return false;
        }
        C36689a c36689a = (C36689a) obj;
        return AbstractC22676k.m65745e(this.f157126w, c36689a.f157126w) && AbstractC22676k.m65745e(this.f157127x, c36689a.f157127x);
    }

    public final int hashCode() {
        String str = this.f157126w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C22057e c22057e = this.f157127x;
        return iHashCode + (c22057e != null ? c22057e.hashCode() : 0);
    }

    public final String toString() {
        return "InstantDebits(email=" + this.f157126w + ", elementsSessionContext=" + this.f157127x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f157126w);
        dest.writeParcelable(this.f157127x, i13);
    }
}
