package q00;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q00.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C29727m implements InterfaceC29729n {
    public static final Parcelable.Creator<C29727m> CREATOR = new C29723k(2);

    /* JADX INFO: renamed from: w */
    public final int f121579w;

    public C29727m(int i13) {
        this.f121579w = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29727m) && this.f121579w == ((C29727m) obj).f121579w;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121579w);
    }

    public final String toString() {
        return AbstractC2875y.m8296i(this.f121579w, "Card(iconRes=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f121579w);
    }
}
