package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pg3.C29205p;
import v00.C35467g0;

/* JADX INFO: loaded from: classes6.dex */
public final class CameraPosition extends AbstractC36219a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C35467g0(16);

    /* JADX INFO: renamed from: w */
    public final LatLng f20610w;

    /* JADX INFO: renamed from: x */
    public final float f20611x;

    /* JADX INFO: renamed from: y */
    public final float f20612y;

    /* JADX INFO: renamed from: z */
    public final float f20613z;

    public CameraPosition(LatLng latLng, float f13, float f14, float f15) {
        AbstractC35135w.m111095g(latLng, "camera target must not be null.");
        boolean z4 = false;
        if (f14 >= 0.0f && f14 <= 90.0f) {
            z4 = true;
        }
        if (!z4) {
            throw new IllegalArgumentException("Tilt needs to be between 0 and 90 inclusive: " + f14);
        }
        this.f20610w = latLng;
        this.f20611x = f13;
        this.f20612y = f14 + 0.0f;
        this.f20613z = (((double) f15) <= 0.0d ? (f15 % 360.0f) + 360.0f : f15) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f20610w.equals(cameraPosition.f20610w) && Float.floatToIntBits(this.f20611x) == Float.floatToIntBits(cameraPosition.f20611x) && Float.floatToIntBits(this.f20612y) == Float.floatToIntBits(cameraPosition.f20612y) && Float.floatToIntBits(this.f20613z) == Float.floatToIntBits(cameraPosition.f20613z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20610w, Float.valueOf(this.f20611x), Float.valueOf(this.f20612y), Float.valueOf(this.f20613z)});
    }

    public final String toString() {
        C29205p c29205p = new C29205p(this);
        c29205p.m88707c(this.f20610w, "target");
        c29205p.m88707c(Float.valueOf(this.f20611x), "zoom");
        c29205p.m88707c(Float.valueOf(this.f20612y), "tilt");
        c29205p.m88707c(Float.valueOf(this.f20613z), "bearing");
        return c29205p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 2, this.f20610w, i13);
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeFloat(this.f20611x);
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeFloat(this.f20612y);
        AbstractC36221c.m115337r(parcel, 5, 4);
        parcel.writeFloat(this.f20613z);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
