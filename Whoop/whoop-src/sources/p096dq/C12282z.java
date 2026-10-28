package p096dq;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C12282z extends AbstractC36219a {
    public static final Parcelable.Creator<C12282z> CREATOR = new C12280x(1);

    /* JADX INFO: renamed from: w */
    public String f41127w;

    /* JADX INFO: renamed from: x */
    public Bundle f41128x;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f41127w);
        AbstractC36221c.m115324e(parcel, 3, this.f41128x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
