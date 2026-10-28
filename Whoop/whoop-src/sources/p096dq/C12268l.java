package p096dq;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import p023ay.C2125b;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C12268l extends AbstractC36219a {
    public static final Parcelable.Creator<C12268l> CREATOR = new C2125b(24);

    /* JADX INFO: renamed from: E */
    public String f41076E;

    /* JADX INFO: renamed from: F */
    public Bundle f41077F;

    /* JADX INFO: renamed from: G */
    public String f41078G;

    /* JADX INFO: renamed from: H */
    public Bundle f41079H;

    /* JADX INFO: renamed from: w */
    public String f41080w;

    /* JADX INFO: renamed from: x */
    public C12258b f41081x;

    /* JADX INFO: renamed from: y */
    public UserAddress f41082y;

    /* JADX INFO: renamed from: z */
    public C12270n f41083z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 1, this.f41080w);
        AbstractC36221c.m115331l(parcel, 2, this.f41081x, i13);
        AbstractC36221c.m115331l(parcel, 3, this.f41082y, i13);
        AbstractC36221c.m115331l(parcel, 4, this.f41083z, i13);
        AbstractC36221c.m115332m(parcel, 5, this.f41076E);
        AbstractC36221c.m115324e(parcel, 6, this.f41077F);
        AbstractC36221c.m115332m(parcel, 7, this.f41078G);
        AbstractC36221c.m115324e(parcel, 8, this.f41079H);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
