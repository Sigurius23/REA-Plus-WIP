package p529uo;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p486sp.C32854e;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: uo.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C35131s extends AbstractC36219a {
    public static final Parcelable.Creator<C35131s> CREATOR = new C32854e(24);

    /* JADX INFO: renamed from: w */
    public final int f149066w;

    /* JADX INFO: renamed from: x */
    public final Account f149067x;

    /* JADX INFO: renamed from: y */
    public final int f149068y;

    /* JADX INFO: renamed from: z */
    public final GoogleSignInAccount f149069z;

    public C35131s(int i13, Account account, int i14, GoogleSignInAccount googleSignInAccount) {
        this.f149066w = i13;
        this.f149067x = account;
        this.f149068y = i14;
        this.f149069z = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f149066w);
        AbstractC36221c.m115331l(parcel, 2, this.f149067x, i13);
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(this.f149068y);
        AbstractC36221c.m115331l(parcel, 4, this.f149069z, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
