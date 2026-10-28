package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p031b9.AbstractC2875y;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pg3.C29205p;
import q63.AbstractC30007c;
import v00.C35467g0;

/* JADX INFO: loaded from: classes6.dex */
public final class LatLngBounds extends AbstractC36219a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C35467g0(20);

    /* JADX INFO: renamed from: w */
    public final LatLng f20616w;

    /* JADX INFO: renamed from: x */
    public final LatLng f20617x;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        AbstractC35135w.m111095g(latLng, "southwest must not be null.");
        AbstractC35135w.m111095g(latLng2, "northeast must not be null.");
        double d3 = latLng2.f20614w;
        double d14 = latLng.f20614w;
        if (!(d3 >= d14)) {
            throw new IllegalArgumentException(AbstractC30007c.m91836f(d3, ")", AbstractC2875y.m8306s("southern latitude exceeds northern latitude (", d14, " > ")));
        }
        this.f20616w = latLng;
        this.f20617x = latLng2;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15633b(LatLng latLng) {
        AbstractC35135w.m111095g(latLng, "point must not be null.");
        double d3 = latLng.f20614w;
        LatLng latLng2 = this.f20616w;
        if (latLng2.f20614w > d3) {
            return false;
        }
        LatLng latLng3 = this.f20617x;
        if (d3 > latLng3.f20614w) {
            return false;
        }
        double d14 = latLng.f20615x;
        double d15 = latLng2.f20615x;
        double d16 = latLng3.f20615x;
        if (d15 <= d16) {
            return d15 <= d14 && d14 <= d16;
        }
        return d15 <= d14 || d14 <= d16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f20616w.equals(latLngBounds.f20616w) && this.f20617x.equals(latLngBounds.f20617x);
    }

    /* JADX INFO: renamed from: f */
    public final LatLng m15634f() {
        LatLng latLng = this.f20616w;
        double d3 = latLng.f20614w;
        LatLng latLng2 = this.f20617x;
        double d14 = d3 + latLng2.f20614w;
        double d15 = latLng2.f20615x;
        double d16 = latLng.f20615x;
        if (d16 > d15) {
            d15 += 360.0d;
        }
        return new LatLng(d14 / 2.0d, (d15 + d16) / 2.0d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20616w, this.f20617x});
    }

    public final String toString() {
        C29205p c29205p = new C29205p(this);
        c29205p.m88707c(this.f20616w, "southwest");
        c29205p.m88707c(this.f20617x, "northeast");
        return c29205p.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 2, this.f20616w, i13);
        AbstractC36221c.m115331l(parcel, 3, this.f20617x, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
