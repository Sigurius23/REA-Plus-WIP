package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C12258b extends AbstractC36219a {
    public static final Parcelable.Creator<C12258b> CREATOR = new C12280x(3);

    /* JADX INFO: renamed from: E */
    public UserAddress f41027E;

    /* JADX INFO: renamed from: w */
    public String f41028w;

    /* JADX INFO: renamed from: x */
    public String f41029x;

    /* JADX INFO: renamed from: y */
    public String f41030y;

    /* JADX INFO: renamed from: z */
    public int f41031z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 1, this.f41028w);
        AbstractC36221c.m115332m(parcel, 2, this.f41029x);
        AbstractC36221c.m115332m(parcel, 3, this.f41030y);
        int i14 = this.f41031z;
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(i14);
        AbstractC36221c.m115331l(parcel, 5, this.f41027E, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
