package p503tp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: tp.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C34033e0 extends AbstractC36219a {
    public static final Parcelable.Creator<C34033e0> CREATOR = new C34025a0(9);

    /* JADX INFO: renamed from: w */
    public final int f142689w;

    /* JADX INFO: renamed from: x */
    public final int f142690x;

    /* JADX INFO: renamed from: y */
    public final int f142691y;

    /* JADX INFO: renamed from: z */
    public final int f142692z;

    public C34033e0(int i13, int i14, int i15, int i16) {
        AbstractC35135w.m111096h("Start hour must be in range [0, 23].", i13 >= 0 && i13 <= 23);
        AbstractC35135w.m111096h("Start minute must be in range [0, 59].", i14 >= 0 && i14 <= 59);
        AbstractC35135w.m111096h("End hour must be in range [0, 23].", i15 >= 0 && i15 <= 23);
        AbstractC35135w.m111096h("End minute must be in range [0, 59].", i16 >= 0 && i16 <= 59);
        AbstractC35135w.m111096h("Parameters can't be all 0.", ((i13 + i14) + i15) + i16 > 0);
        this.f142689w = i13;
        this.f142690x = i14;
        this.f142691y = i15;
        this.f142692z = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34033e0)) {
            return false;
        }
        C34033e0 c34033e0 = (C34033e0) obj;
        return this.f142689w == c34033e0.f142689w && this.f142690x == c34033e0.f142690x && this.f142691y == c34033e0.f142691y && this.f142692z == c34033e0.f142692z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f142689w), Integer.valueOf(this.f142690x), Integer.valueOf(this.f142691y), Integer.valueOf(this.f142692z)});
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(117);
        sb4.append("UserPreferredSleepWindow [startHour=");
        sb4.append(this.f142689w);
        sb4.append(", startMinute=");
        sb4.append(this.f142690x);
        sb4.append(", endHour=");
        sb4.append(this.f142691y);
        sb4.append(", endMinute=");
        sb4.append(this.f142692z);
        sb4.append(']');
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        AbstractC35135w.m111094f(parcel);
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f142689w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f142690x);
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(this.f142691y);
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(this.f142692z);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
