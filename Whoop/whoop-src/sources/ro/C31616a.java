package ro;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import q30.C29912j0;

/* JADX INFO: renamed from: ro.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C31616a extends AbstractC36219a {
    public static final Parcelable.Creator<C31616a> CREATOR = new C29912j0(15);

    /* JADX INFO: renamed from: w */
    public final int f130635w;

    /* JADX INFO: renamed from: x */
    public final int f130636x;

    /* JADX INFO: renamed from: y */
    public final Bundle f130637y;

    public C31616a(int i13, int i14, Bundle bundle) {
        this.f130635w = i13;
        this.f130636x = i14;
        this.f130637y = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f130635w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f130636x);
        AbstractC36221c.m115324e(parcel, 3, this.f130637y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
