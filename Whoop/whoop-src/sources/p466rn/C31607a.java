package p466rn;

import android.os.Parcel;
import android.os.Parcelable;
import q30.C29912j0;

/* JADX INFO: renamed from: rn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C31607a implements Comparable, Parcelable {
    public static final Parcelable.Creator<C31607a> CREATOR = new C29912j0(14);

    /* JADX INFO: renamed from: w */
    public final int f130619w;

    /* JADX INFO: renamed from: x */
    public final int f130620x;

    /* JADX INFO: renamed from: y */
    public final int f130621y;

    public C31607a(Parcel parcel) {
        this.f130619w = parcel.readInt();
        this.f130620x = parcel.readInt();
        this.f130621y = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C31607a c31607a = (C31607a) obj;
        int i13 = this.f130619w - c31607a.f130619w;
        if (i13 != 0) {
            return i13;
        }
        int i14 = this.f130620x - c31607a.f130620x;
        return i14 == 0 ? this.f130621y - c31607a.f130621y : i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C31607a.class == obj.getClass()) {
            C31607a c31607a = (C31607a) obj;
            if (this.f130619w == c31607a.f130619w && this.f130620x == c31607a.f130620x && this.f130621y == c31607a.f130621y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f130619w * 31) + this.f130620x) * 31) + this.f130621y;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(35);
        sb4.append(this.f130619w);
        sb4.append(".");
        sb4.append(this.f130620x);
        sb4.append(".");
        sb4.append(this.f130621y);
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f130619w);
        parcel.writeInt(this.f130620x);
        parcel.writeInt(this.f130621y);
    }
}
