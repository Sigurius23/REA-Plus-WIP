package p564vx;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35467g0;

/* JADX INFO: renamed from: vx.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C36550b implements InterfaceC36551c {
    public static final Parcelable.Creator<C36550b> CREATOR = new C35467g0(8);

    /* JADX INFO: renamed from: w */
    public final String f156472w;

    public C36550b(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        this.f156472w = id4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36550b) && AbstractC22676k.m65745e(this.f156472w, ((C36550b) obj).f156472w);
    }

    public final int hashCode() {
        return this.f156472w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Owner(id=", this.f156472w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f156472w);
    }
}
