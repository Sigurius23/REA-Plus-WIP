package np;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import io.getstream.chat.android.client.ChatClient;
import java.util.Collections;
import java.util.List;
import mn.C25704b;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: np.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C27005j extends AbstractC36219a {

    /* JADX INFO: renamed from: E */
    public final boolean f107686E;

    /* JADX INFO: renamed from: F */
    public final boolean f107687F;

    /* JADX INFO: renamed from: G */
    public final String f107688G;

    /* JADX INFO: renamed from: H */
    public final boolean f107689H;

    /* JADX INFO: renamed from: I */
    public boolean f107690I;

    /* JADX INFO: renamed from: J */
    public String f107691J;

    /* JADX INFO: renamed from: K */
    public long f107692K;

    /* JADX INFO: renamed from: w */
    public final LocationRequest f107693w;

    /* JADX INFO: renamed from: x */
    public final List f107694x;

    /* JADX INFO: renamed from: y */
    public final String f107695y;

    /* JADX INFO: renamed from: z */
    public final boolean f107696z;

    /* JADX INFO: renamed from: L */
    public static final List f107685L = Collections.EMPTY_LIST;
    public static final Parcelable.Creator<C27005j> CREATOR = new C25704b(17);

    public C27005j(LocationRequest locationRequest, List list, String str, boolean z4, boolean z13, boolean z14, String str2, boolean z15, boolean z16, String str3, long j7) {
        this.f107693w = locationRequest;
        this.f107694x = list;
        this.f107695y = str;
        this.f107696z = z4;
        this.f107686E = z13;
        this.f107687F = z14;
        this.f107688G = str2;
        this.f107689H = z15;
        this.f107690I = z16;
        this.f107691J = str3;
        this.f107692K = j7;
    }

    /* JADX INFO: renamed from: b */
    public static C27005j m80988b(LocationRequest locationRequest) {
        return new C27005j(locationRequest, f107685L, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C27005j) {
            C27005j c27005j = (C27005j) obj;
            if (AbstractC35135w.m111097i(this.f107693w, c27005j.f107693w) && AbstractC35135w.m111097i(this.f107694x, c27005j.f107694x) && AbstractC35135w.m111097i(this.f107695y, c27005j.f107695y) && this.f107696z == c27005j.f107696z && this.f107686E == c27005j.f107686E && this.f107687F == c27005j.f107687F && AbstractC35135w.m111097i(this.f107688G, c27005j.f107688G) && this.f107689H == c27005j.f107689H && this.f107690I == c27005j.f107690I && AbstractC35135w.m111097i(this.f107691J, c27005j.f107691J)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m80989f() {
        LocationRequest locationRequest = this.f107693w;
        long j7 = locationRequest.f20583H;
        long j13 = locationRequest.f20586x;
        if (j7 < j13) {
            j7 = j13;
        }
        if (j7 <= j13) {
            this.f107692K = ChatClient.RESOLVE_DEPENDENCY_TIMEOUT;
            return;
        }
        long j14 = locationRequest.f20586x;
        long j15 = locationRequest.f20583H;
        if (j15 < j14) {
            j15 = j14;
        }
        StringBuilder sb4 = new StringBuilder(120);
        sb4.append("could not set max age when location batching is requested, interval=");
        sb4.append(j14);
        sb4.append("maxWaitTime=");
        sb4.append(j15);
        throw new IllegalArgumentException(sb4.toString());
    }

    /* JADX INFO: renamed from: h */
    public final void m80990h(String str) {
        this.f107691J = str;
    }

    public final int hashCode() {
        return this.f107693w.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m80991i() {
        this.f107690I = true;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f107693w);
        String str = this.f107695y;
        if (str != null) {
            sb4.append(" tag=");
            sb4.append(str);
        }
        String str2 = this.f107688G;
        if (str2 != null) {
            sb4.append(" moduleId=");
            sb4.append(str2);
        }
        if (this.f107691J != null) {
            sb4.append(" contextAttributionTag=");
            sb4.append(this.f107691J);
        }
        sb4.append(" hideAppOps=");
        sb4.append(this.f107696z);
        sb4.append(" clients=");
        sb4.append(this.f107694x);
        sb4.append(" forceCoarseLocation=");
        sb4.append(this.f107686E);
        if (this.f107687F) {
            sb4.append(" exemptFromBackgroundThrottle");
        }
        if (this.f107689H) {
            sb4.append(" locationSettingsIgnored");
        }
        if (this.f107690I) {
            sb4.append(" inaccurateLocationsDelayed");
        }
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 1, this.f107693w, i13);
        AbstractC36221c.m115336q(parcel, 5, this.f107694x);
        AbstractC36221c.m115332m(parcel, 6, this.f107695y);
        AbstractC36221c.m115337r(parcel, 7, 4);
        parcel.writeInt(this.f107696z ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 8, 4);
        parcel.writeInt(this.f107686E ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 9, 4);
        parcel.writeInt(this.f107687F ? 1 : 0);
        AbstractC36221c.m115332m(parcel, 10, this.f107688G);
        AbstractC36221c.m115337r(parcel, 11, 4);
        parcel.writeInt(this.f107689H ? 1 : 0);
        boolean z4 = this.f107690I;
        AbstractC36221c.m115337r(parcel, 12, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC36221c.m115332m(parcel, 13, this.f107691J);
        long j7 = this.f107692K;
        AbstractC36221c.m115337r(parcel, 14, 8);
        parcel.writeLong(j7);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
