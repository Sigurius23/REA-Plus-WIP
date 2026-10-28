package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C12259c extends AbstractC36219a {
    public static final Parcelable.Creator<C12259c> CREATOR = new C12280x(4);

    /* JADX INFO: renamed from: w */
    public ArrayList f41032w;

    /* JADX INFO: renamed from: x */
    public boolean f41033x;

    /* JADX INFO: renamed from: y */
    public boolean f41034y;

    /* JADX INFO: renamed from: z */
    public int f41035z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115329j(parcel, 1, this.f41032w);
        boolean z4 = this.f41033x;
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z13 = this.f41034y;
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(z13 ? 1 : 0);
        int i14 = this.f41035z;
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(i14);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
