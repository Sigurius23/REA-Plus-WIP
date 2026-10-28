package p503tp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: tp.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C34031d0 extends AbstractC36219a {
    public static final Parcelable.Creator<C34031d0> CREATOR = new C34025a0(7);

    /* JADX INFO: renamed from: w */
    public final int f142683w;

    /* JADX INFO: renamed from: x */
    public final int f142684x;

    /* JADX INFO: renamed from: y */
    public final long f142685y;

    /* JADX INFO: renamed from: z */
    public final long f142686z;

    public C34031d0(int i13, int i14, long j7, long j13) {
        this.f142683w = i13;
        this.f142684x = i14;
        this.f142685y = j7;
        this.f142686z = j13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34031d0) {
            C34031d0 c34031d0 = (C34031d0) obj;
            if (this.f142683w == c34031d0.f142683w && this.f142684x == c34031d0.f142684x && this.f142685y == c34031d0.f142685y && this.f142686z == c34031d0.f142686z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f142684x), Integer.valueOf(this.f142683w), Long.valueOf(this.f142686z), Long.valueOf(this.f142685y)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f142683w + " Cell status: " + this.f142684x + " elapsed time NS: " + this.f142686z + " system time ms: " + this.f142685y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f142683w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f142684x);
        AbstractC36221c.m115337r(parcel, 3, 8);
        parcel.writeLong(this.f142685y);
        AbstractC36221c.m115337r(parcel, 4, 8);
        parcel.writeLong(this.f142686z);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
