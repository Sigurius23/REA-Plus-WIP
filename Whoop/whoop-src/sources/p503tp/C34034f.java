package p503tp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: tp.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C34034f extends AbstractC36219a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C34034f> CREATOR = new C34025a0(15);

    /* JADX INFO: renamed from: w */
    public int f142693w;

    /* JADX INFO: renamed from: x */
    public int f142694x;

    public final boolean equals(Object obj) {
        if (obj instanceof C34034f) {
            C34034f c34034f = (C34034f) obj;
            if (this.f142693w == c34034f.f142693w && this.f142694x == c34034f.f142694x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f142693w), Integer.valueOf(this.f142694x)});
    }

    public final String toString() {
        String string;
        int i13 = this.f142693w;
        if (i13 > 22 || i13 < 0) {
            i13 = 4;
        }
        if (i13 == 0) {
            string = "IN_VEHICLE";
        } else if (i13 == 1) {
            string = "ON_BICYCLE";
        } else if (i13 == 2) {
            string = "ON_FOOT";
        } else if (i13 == 3) {
            string = "STILL";
        } else if (i13 == 4) {
            string = "UNKNOWN";
        } else if (i13 == 5) {
            string = "TILTING";
        } else if (i13 == 7) {
            string = "WALKING";
        } else if (i13 == 8) {
            string = "RUNNING";
        } else if (i13 != 16) {
            string = i13 != 17 ? Integer.toString(i13) : "IN_RAIL_VEHICLE";
        } else {
            string = "IN_ROAD_VEHICLE";
        }
        int i14 = this.f142694x;
        StringBuilder sb4 = new StringBuilder(String.valueOf(string).length() + 48);
        sb4.append("DetectedActivity [type=");
        sb4.append(string);
        sb4.append(", confidence=");
        sb4.append(i14);
        sb4.append("]");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        AbstractC35135w.m111094f(parcel);
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        int i14 = this.f142693w;
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(i14);
        int i15 = this.f142694x;
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(i15);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
