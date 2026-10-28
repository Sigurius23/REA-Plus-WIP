package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.e3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16649e3 implements Parcelable {
    public static final Parcelable.Creator<C16649e3> CREATOR = new C16654f2(16);

    /* JADX INFO: renamed from: w */
    public final String f64015w;

    /* JADX INFO: renamed from: x */
    public final int f64016x;

    public C16649e3(String name, int i13) {
        AbstractC22676k.m65750j(name, "name");
        this.f64015w = name;
        this.f64016x = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16649e3)) {
            return false;
        }
        C16649e3 c16649e3 = (C16649e3) obj;
        return AbstractC22676k.m65745e(this.f64015w, c16649e3.f64015w) && this.f64016x == c16649e3.f64016x;
    }

    public final int hashCode() {
        return (this.f64015w.hashCode() * 31) + this.f64016x;
    }

    public final String toString() {
        return AbstractC11895b.m31993l(this.f64016x, "LineItem(name=", this.f64015w, ", amount=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64015w);
        dest.writeInt(this.f64016x);
    }
}
