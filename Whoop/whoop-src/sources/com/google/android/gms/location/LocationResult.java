package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p031b9.AbstractC2875y;
import p503tp.C34025a0;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: loaded from: classes6.dex */
public final class LocationResult extends AbstractC36219a implements ReflectedParcelable {

    /* JADX INFO: renamed from: w */
    public final List f20590w;

    /* JADX INFO: renamed from: x */
    public static final List f20589x = Collections.EMPTY_LIST;

    @RecentlyNonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new C34025a0(2);

    public LocationResult(List list) {
        this.f20590w = list;
    }

    /* JADX INFO: renamed from: b */
    public final Location m15632b() {
        List list = this.f20590w;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        return (Location) list.get(size - 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List list = ((LocationResult) obj).f20590w;
        int size = list.size();
        List list2 = this.f20590w;
        if (size != list2.size()) {
            return false;
        }
        Iterator it = list.iterator();
        Iterator it3 = list2.iterator();
        while (it.hasNext()) {
            if (((Location) it3.next()).getTime() != ((Location) it.next()).getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f20590w.iterator();
        int i13 = 17;
        while (it.hasNext()) {
            long time = ((Location) it.next()).getTime();
            i13 = (i13 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i13;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f20590w);
        return AbstractC2875y.m8304q(new StringBuilder(strValueOf.length() + 27), "LocationResult[locations: ", strValueOf, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115336q(parcel, 1, this.f20590w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
