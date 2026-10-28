package p529uo;

import android.os.Parcel;
import android.os.Parcelable;
import p486sp.C32854e;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: uo.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C35121j extends AbstractC36219a {
    public static final Parcelable.Creator<C35121j> CREATOR = new C32854e(23);

    /* JADX INFO: renamed from: E */
    public final long f149038E;

    /* JADX INFO: renamed from: F */
    public final String f149039F;

    /* JADX INFO: renamed from: G */
    public final String f149040G;

    /* JADX INFO: renamed from: H */
    public final int f149041H;

    /* JADX INFO: renamed from: I */
    public final int f149042I;

    /* JADX INFO: renamed from: w */
    public final int f149043w;

    /* JADX INFO: renamed from: x */
    public final int f149044x;

    /* JADX INFO: renamed from: y */
    public final int f149045y;

    /* JADX INFO: renamed from: z */
    public final long f149046z;

    public C35121j(int i13, int i14, int i15, long j7, long j13, String str, String str2, int i16, int i17) {
        this.f149043w = i13;
        this.f149044x = i14;
        this.f149045y = i15;
        this.f149046z = j7;
        this.f149038E = j13;
        this.f149039F = str;
        this.f149040G = str2;
        this.f149041H = i16;
        this.f149042I = i17;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f149043w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f149044x);
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(this.f149045y);
        AbstractC36221c.m115337r(parcel, 4, 8);
        parcel.writeLong(this.f149046z);
        AbstractC36221c.m115337r(parcel, 5, 8);
        parcel.writeLong(this.f149038E);
        AbstractC36221c.m115332m(parcel, 6, this.f149039F);
        AbstractC36221c.m115332m(parcel, 7, this.f149040G);
        AbstractC36221c.m115337r(parcel, 8, 4);
        parcel.writeInt(this.f149041H);
        AbstractC36221c.m115337r(parcel, 9, 4);
        parcel.writeInt(this.f149042I);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
