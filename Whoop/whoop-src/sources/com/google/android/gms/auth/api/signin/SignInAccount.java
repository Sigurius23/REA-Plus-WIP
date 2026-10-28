package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import q30.C29912j0;

/* JADX INFO: loaded from: classes6.dex */
public class SignInAccount extends AbstractC36219a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C29912j0(7);

    /* JADX INFO: renamed from: w */
    public final String f20466w;

    /* JADX INFO: renamed from: x */
    public final GoogleSignInAccount f20467x;

    /* JADX INFO: renamed from: y */
    public final String f20468y;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f20467x = googleSignInAccount;
        AbstractC35135w.m111093e(str, "8.3 and 8.4 SDKs require non-null email");
        this.f20466w = str;
        AbstractC35135w.m111093e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f20468y = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 4, this.f20466w);
        AbstractC36221c.m115331l(parcel, 7, this.f20467x, i13);
        AbstractC36221c.m115332m(parcel, 8, this.f20468y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
