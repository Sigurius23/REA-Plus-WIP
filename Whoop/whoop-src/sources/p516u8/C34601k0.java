package p516u8;

import android.os.Parcel;
import android.os.Parcelable;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: u8.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34601k0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<C34601k0> CREATOR = new C34598j(2);

    /* JADX INFO: renamed from: w */
    public final int f145684w;

    /* JADX INFO: renamed from: x */
    public final int f145685x;

    /* JADX INFO: renamed from: y */
    public final int f145686y;

    static {
        AbstractC38065t.m121892F(0);
        AbstractC38065t.m121892F(1);
        AbstractC38065t.m121892F(2);
    }

    public C34601k0() {
        this.f145684w = -1;
        this.f145685x = -1;
        this.f145686y = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C34601k0 c34601k0 = (C34601k0) obj;
        int i13 = this.f145684w - c34601k0.f145684w;
        if (i13 != 0) {
            return i13;
        }
        int i14 = this.f145685x - c34601k0.f145685x;
        return i14 == 0 ? this.f145686y - c34601k0.f145686y : i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C34601k0.class == obj.getClass()) {
            C34601k0 c34601k0 = (C34601k0) obj;
            if (this.f145684w == c34601k0.f145684w && this.f145685x == c34601k0.f145685x && this.f145686y == c34601k0.f145686y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f145684w * 31) + this.f145685x) * 31) + this.f145686y;
    }

    public final String toString() {
        return this.f145684w + "." + this.f145685x + "." + this.f145686y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f145684w);
        parcel.writeInt(this.f145685x);
        parcel.writeInt(this.f145686y);
    }

    public C34601k0(Parcel parcel) {
        this.f145684w = parcel.readInt();
        this.f145685x = parcel.readInt();
        this.f145686y = parcel.readInt();
    }
}
