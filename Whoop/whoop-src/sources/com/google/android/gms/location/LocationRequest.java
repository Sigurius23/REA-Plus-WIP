package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p503tp.C34025a0;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes6.dex */
public final class LocationRequest extends AbstractC36219a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new C34025a0(1);

    /* JADX INFO: renamed from: w */
    public int f20585w = 102;

    /* JADX INFO: renamed from: x */
    public long f20586x = 3600000;

    /* JADX INFO: renamed from: y */
    public long f20587y = 600000;

    /* JADX INFO: renamed from: z */
    public boolean f20588z = false;

    /* JADX INFO: renamed from: E */
    public long f20580E = Long.MAX_VALUE;

    /* JADX INFO: renamed from: F */
    public int f20581F = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: G */
    public float f20582G = 0.0f;

    /* JADX INFO: renamed from: H */
    public long f20583H = 0;

    /* JADX INFO: renamed from: I */
    public boolean f20584I = false;

    @Deprecated
    public LocationRequest() {
    }

    /* JADX INFO: renamed from: b */
    public static LocationRequest m15625b() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.f20584I = true;
        return locationRequest;
    }

    /* JADX INFO: renamed from: x */
    public static void m15626x(long j7) {
        if (j7 >= 0) {
            return;
        }
        StringBuilder sb4 = new StringBuilder(38);
        sb4.append("invalid interval: ");
        sb4.append(j7);
        throw new IllegalArgumentException(sb4.toString());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        if (this.f20585w != locationRequest.f20585w) {
            return false;
        }
        long j7 = this.f20586x;
        long j13 = locationRequest.f20586x;
        if (j7 != j13 || this.f20587y != locationRequest.f20587y || this.f20588z != locationRequest.f20588z || this.f20580E != locationRequest.f20580E || this.f20581F != locationRequest.f20581F || this.f20582G != locationRequest.f20582G) {
            return false;
        }
        long j14 = this.f20583H;
        if (j14 >= j7) {
            j7 = j14;
        }
        long j15 = locationRequest.f20583H;
        if (j15 >= j13) {
            j13 = j15;
        }
        return j7 == j13 && this.f20584I == locationRequest.f20584I;
    }

    /* JADX INFO: renamed from: f */
    public final void m15627f() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = 30000 <= Long.MAX_VALUE - jElapsedRealtime ? 30000 + jElapsedRealtime : Long.MAX_VALUE;
        this.f20580E = j7;
        if (j7 < 0) {
            this.f20580E = 0L;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m15628h(long j7) {
        m15626x(j7);
        this.f20588z = true;
        this.f20587y = j7;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20585w), Long.valueOf(this.f20586x), Float.valueOf(this.f20582G), Long.valueOf(this.f20583H)});
    }

    /* JADX INFO: renamed from: i */
    public final void m15629i(long j7) {
        m15626x(j7);
        this.f20586x = j7;
        if (this.f20588z) {
            return;
        }
        this.f20587y = (long) (j7 / 6.0d);
    }

    /* JADX INFO: renamed from: k */
    public final void m15630k(int i13) {
        if (i13 != 100 && i13 != 102 && i13 != 104 && i13 != 105) {
            throw new IllegalArgumentException(AbstractC31061c.m95634j(28, i13, "invalid quality: "));
        }
        this.f20585w = i13;
    }

    /* JADX INFO: renamed from: s */
    public final void m15631s(float f13) {
        if (f13 >= 0.0f) {
            this.f20582G = f13;
            return;
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("invalid displacement: ");
        sb4.append(f13);
        throw new IllegalArgumentException(sb4.toString());
    }

    public final String toString() {
        String str;
        int i13 = this.f20581F;
        StringBuilder sb4 = new StringBuilder("Request[");
        int i14 = this.f20585w;
        if (i14 == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i14 == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i14 != 104) {
            str = i14 != 105 ? "???" : "PRIORITY_NO_POWER";
        } else {
            str = "PRIORITY_LOW_POWER";
        }
        sb4.append(str);
        if (this.f20585w != 105) {
            sb4.append(" requested=");
            sb4.append(this.f20586x);
            sb4.append("ms");
        }
        sb4.append(" fastest=");
        sb4.append(this.f20587y);
        sb4.append("ms");
        if (this.f20583H > this.f20586x) {
            sb4.append(" maxWait=");
            sb4.append(this.f20583H);
            sb4.append("ms");
        }
        if (this.f20582G > 0.0f) {
            sb4.append(" smallestDisplacement=");
            sb4.append(this.f20582G);
            sb4.append("m");
        }
        long j7 = this.f20580E;
        if (j7 != Long.MAX_VALUE) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            sb4.append(" expireIn=");
            sb4.append(j7 - jElapsedRealtime);
            sb4.append("ms");
        }
        if (i13 != Integer.MAX_VALUE) {
            sb4.append(" num=");
            sb4.append(i13);
        }
        sb4.append(']');
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        int i14 = this.f20585w;
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(i14);
        long j7 = this.f20586x;
        AbstractC36221c.m115337r(parcel, 2, 8);
        parcel.writeLong(j7);
        long j13 = this.f20587y;
        AbstractC36221c.m115337r(parcel, 3, 8);
        parcel.writeLong(j13);
        boolean z4 = this.f20588z;
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(z4 ? 1 : 0);
        long j14 = this.f20580E;
        AbstractC36221c.m115337r(parcel, 5, 8);
        parcel.writeLong(j14);
        int i15 = this.f20581F;
        AbstractC36221c.m115337r(parcel, 6, 4);
        parcel.writeInt(i15);
        float f13 = this.f20582G;
        AbstractC36221c.m115337r(parcel, 7, 4);
        parcel.writeFloat(f13);
        long j15 = this.f20583H;
        AbstractC36221c.m115337r(parcel, 8, 8);
        parcel.writeLong(j15);
        boolean z13 = this.f20584I;
        AbstractC36221c.m115337r(parcel, 9, 4);
        parcel.writeInt(z13 ? 1 : 0);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
