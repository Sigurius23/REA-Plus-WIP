package v00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p537ux.C35332g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v00.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C35476l extends AbstractC35478m {
    public static final Parcelable.Creator<C35476l> CREATOR = new C35332g(16);

    /* JADX INFO: renamed from: w */
    public final String f151017w;

    public C35476l(String str) {
        this.f151017w = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35476l) && AbstractC22676k.m65745e(this.f151017w, ((C35476l) obj).f151017w);
    }

    public final int hashCode() {
        String str = this.f151017w;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SimpleString(value=", this.f151017w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f151017w);
    }
}
