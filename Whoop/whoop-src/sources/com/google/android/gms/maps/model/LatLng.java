package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import q63.AbstractC30007c;
import v00.C35467g0;

/* JADX INFO: loaded from: classes6.dex */
public final class LatLng extends AbstractC36219a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new C35467g0(21);

    /* JADX INFO: renamed from: w */
    public final double f20614w;

    /* JADX INFO: renamed from: x */
    public final double f20615x;

    public LatLng(double d3, double d14) {
        if (d14 < -180.0d || d14 >= 180.0d) {
            this.f20615x = ((((d14 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f20615x = d14;
        }
        this.f20614w = Math.max(-90.0d, Math.min(90.0d, d3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f20614w) == Double.doubleToLongBits(latLng.f20614w) && Double.doubleToLongBits(this.f20615x) == Double.doubleToLongBits(latLng.f20615x);
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f20614w);
        long j7 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f20615x);
        return ((((int) j7) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("lat/lng: (");
        sb4.append(this.f20614w);
        sb4.append(",");
        return AbstractC30007c.m91836f(this.f20615x, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 2, 8);
        parcel.writeDouble(this.f20614w);
        AbstractC36221c.m115337r(parcel, 3, 8);
        parcel.writeDouble(this.f20615x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
