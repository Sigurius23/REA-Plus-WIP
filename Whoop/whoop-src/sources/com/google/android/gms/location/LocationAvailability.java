package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p503tp.C34025a0;
import p503tp.C34031d0;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: loaded from: classes6.dex */
public final class LocationAvailability extends AbstractC36219a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C34025a0(0);

    /* JADX INFO: renamed from: E */
    public C34031d0[] f20575E;

    /* JADX INFO: renamed from: w */
    public int f20576w;

    /* JADX INFO: renamed from: x */
    public int f20577x;

    /* JADX INFO: renamed from: y */
    public long f20578y;

    /* JADX INFO: renamed from: z */
    public int f20579z;

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f20576w == locationAvailability.f20576w && this.f20577x == locationAvailability.f20577x && this.f20578y == locationAvailability.f20578y && this.f20579z == locationAvailability.f20579z && Arrays.equals(this.f20575E, locationAvailability.f20575E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20579z), Integer.valueOf(this.f20576w), Integer.valueOf(this.f20577x), Long.valueOf(this.f20578y), this.f20575E});
    }

    public final String toString() {
        boolean z4 = this.f20579z < 1000;
        StringBuilder sb4 = new StringBuilder(48);
        sb4.append("LocationAvailability[isLocationAvailable: ");
        sb4.append(z4);
        sb4.append("]");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        int i14 = this.f20576w;
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(i14);
        int i15 = this.f20577x;
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(i15);
        long j7 = this.f20578y;
        AbstractC36221c.m115337r(parcel, 3, 8);
        parcel.writeLong(j7);
        int i16 = this.f20579z;
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(i16);
        AbstractC36221c.m115335p(parcel, 5, this.f20575E, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
