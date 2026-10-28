package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ux.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C35344m implements Parcelable {
    public static final Parcelable.Creator<C35344m> CREATOR = new C35332g(3);

    /* JADX INFO: renamed from: w */
    public final EnumC35342l f150564w;

    public C35344m(EnumC35342l id4) {
        AbstractC22676k.m65750j(id4, "id");
        this.f150564w = id4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35344m) && this.f150564w == ((C35344m) obj).f150564w;
    }

    public final int hashCode() {
        return this.f150564w.hashCode();
    }

    public final String toString() {
        return "SoftwareInfo(id=" + this.f150564w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f150564w.name());
    }
}
