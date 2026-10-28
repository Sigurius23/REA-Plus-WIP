package p389p0;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: p0.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C28520f implements Parcelable {
    public static final Parcelable.Creator<C28520f> CREATOR = new C28517e();

    /* JADX INFO: renamed from: w */
    public final int f115418w;

    public C28520f(int i13) {
        this.f115418w = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28520f) && this.f115418w == ((C28520f) obj).f115418w;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f115418w);
    }

    public final String toString() {
        return AbstractC11895b.m31999r(new StringBuilder("DefaultLazyKey(index="), this.f115418w, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f115418w);
    }
}
