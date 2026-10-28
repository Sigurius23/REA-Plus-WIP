package p096dq;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p023ay.C2125b;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C12271o extends AbstractC36219a {
    public static final Parcelable.Creator<C12271o> CREATOR = new C2125b(27);

    /* JADX INFO: renamed from: w */
    public final int f41098w;

    /* JADX INFO: renamed from: x */
    public final Bundle f41099x;

    public C12271o(int i13, Bundle bundle) {
        new Bundle();
        this.f41098w = i13;
        this.f41099x = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f41098w);
        AbstractC36221c.m115324e(parcel, 3, this.f41099x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
