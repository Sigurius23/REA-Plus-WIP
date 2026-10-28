package p403pp;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: pp.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C29408d implements Comparable, Parcelable {
    public static final Parcelable.Creator<C29408d> CREATOR = new C29407c();

    /* JADX INFO: renamed from: w */
    public final String f119430w;

    /* JADX INFO: renamed from: x */
    public final long f119431x;

    /* JADX INFO: renamed from: y */
    public final int f119432y;

    public C29408d(int i13, String str, long j7) {
        this.f119430w = str;
        this.f119431x = j7;
        this.f119432y = i13;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f119430w.compareTo(((C29408d) obj).f119430w);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C29408d) {
            return this.f119430w.equals(((C29408d) obj).f119430w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f119430w.hashCode();
    }

    public final String toString() {
        return this.f119430w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f119430w);
        parcel.writeLong(this.f119431x);
        parcel.writeInt(this.f119432y);
    }

    public /* synthetic */ C29408d(Parcel parcel) {
        this.f119430w = parcel.readString();
        this.f119431x = parcel.readLong();
        this.f119432y = parcel.readInt();
    }
}
