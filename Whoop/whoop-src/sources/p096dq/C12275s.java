package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C12275s extends AbstractC36219a {
    public static final Parcelable.Creator<C12275s> CREATOR = new C12280x(0);

    /* JADX INFO: renamed from: w */
    public int f41102w;

    /* JADX INFO: renamed from: x */
    public String f41103x;

    /* JADX INFO: renamed from: y */
    public String f41104y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        int i14 = this.f41102w;
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(i14);
        AbstractC36221c.m115332m(parcel, 2, this.f41103x);
        AbstractC36221c.m115332m(parcel, 3, this.f41104y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
