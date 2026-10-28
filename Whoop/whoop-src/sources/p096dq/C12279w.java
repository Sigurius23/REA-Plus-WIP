package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import p023ay.C2125b;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C12279w extends AbstractC36219a {
    public static final Parcelable.Creator<C12279w> CREATOR = new C2125b(28);

    /* JADX INFO: renamed from: w */
    public final String f41121w;

    /* JADX INFO: renamed from: x */
    public final String f41122x;

    /* JADX INFO: renamed from: y */
    public final int f41123y;

    /* JADX INFO: renamed from: z */
    public final int f41124z;

    public C12279w(String str, String str2, int i13, int i14) {
        this.f41121w = str;
        this.f41122x = str2;
        this.f41123y = i13;
        this.f41124z = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f41121w);
        AbstractC36221c.m115332m(parcel, 3, this.f41122x);
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(this.f41123y);
        AbstractC36221c.m115337r(parcel, 5, 4);
        parcel.writeInt(this.f41124z);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
