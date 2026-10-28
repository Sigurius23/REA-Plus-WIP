package s40;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;

/* JADX INFO: renamed from: s40.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C32141d implements Parcelable {
    public static final Parcelable.Creator<C32141d> CREATOR = new C29912j0(22);

    /* JADX INFO: renamed from: w */
    public final String f133178w;

    /* JADX INFO: renamed from: x */
    public final String f133179x;

    public C32141d(String prefix, String name) {
        AbstractC22676k.m65750j(prefix, "prefix");
        AbstractC22676k.m65750j(name, "name");
        this.f133178w = prefix;
        this.f133179x = name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32141d)) {
            return false;
        }
        C32141d c32141d = (C32141d) obj;
        return AbstractC22676k.m65745e(this.f133178w, c32141d.f133178w) && AbstractC22676k.m65745e(this.f133179x, c32141d.f133179x);
    }

    public final int hashCode() {
        return this.f133179x.hashCode() + (this.f133178w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("Bank(prefix=", this.f133178w, ", name=", this.f133179x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f133178w);
        dest.writeString(this.f133179x);
    }
}
