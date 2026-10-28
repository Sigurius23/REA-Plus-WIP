package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C12264h extends AbstractC36219a {
    public static final Parcelable.Creator<C12264h> CREATOR = new C12280x(11);

    /* JADX INFO: renamed from: w */
    public final int f41069w;

    /* JADX INFO: renamed from: x */
    public final String f41070x;

    /* JADX INFO: renamed from: y */
    public final CommonWalletObject f41071y;

    public C12264h(int i13, String str, String str2, CommonWalletObject commonWalletObject) {
        this.f41069w = i13;
        this.f41070x = str2;
        if (i13 >= 3) {
            this.f41071y = commonWalletObject;
            return;
        }
        CommonWalletObject commonWalletObject2 = new CommonWalletObject();
        commonWalletObject2.f20674w = str;
        this.f41071y = commonWalletObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f41069w);
        AbstractC36221c.m115332m(parcel, 3, this.f41070x);
        AbstractC36221c.m115331l(parcel, 4, this.f41071y, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
