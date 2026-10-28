package p503tp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: tp.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C34042m extends AbstractC36219a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C34042m> CREATOR = new C34025a0(6);

    /* JADX INFO: renamed from: E */
    public final boolean f142710E;

    /* JADX INFO: renamed from: F */
    public final boolean f142711F;

    /* JADX INFO: renamed from: w */
    public final boolean f142712w;

    /* JADX INFO: renamed from: x */
    public final boolean f142713x;

    /* JADX INFO: renamed from: y */
    public final boolean f142714y;

    /* JADX INFO: renamed from: z */
    public final boolean f142715z;

    public C34042m(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f142712w = z4;
        this.f142713x = z13;
        this.f142714y = z14;
        this.f142715z = z15;
        this.f142710E = z16;
        this.f142711F = z17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f142712w ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f142713x ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(this.f142714y ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(this.f142715z ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 5, 4);
        parcel.writeInt(this.f142710E ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 6, 4);
        parcel.writeInt(this.f142711F ? 1 : 0);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
