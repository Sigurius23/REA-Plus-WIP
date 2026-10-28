package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import q30.C29912j0;

/* JADX INFO: loaded from: classes6.dex */
public final class SignInConfiguration extends AbstractC36219a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C29912j0(16);

    /* JADX INFO: renamed from: w */
    public final String f20469w;

    /* JADX INFO: renamed from: x */
    public final GoogleSignInOptions f20470x;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        AbstractC35135w.m111092d(str);
        this.f20469w = str;
        this.f20470x = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        GoogleSignInOptions googleSignInOptions = signInConfiguration.f20470x;
        if (this.f20469w.equals(signInConfiguration.f20469w)) {
            GoogleSignInOptions googleSignInOptions2 = this.f20470x;
            if (googleSignInOptions2 == null) {
                if (googleSignInOptions == null) {
                    return true;
                }
            } else if (googleSignInOptions2.equals(googleSignInOptions)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = 1 * 31;
        String str = this.f20469w;
        int iHashCode = (i13 + (str == null ? 0 : str.hashCode())) * 31;
        GoogleSignInOptions googleSignInOptions = this.f20470x;
        return iHashCode + (googleSignInOptions != null ? googleSignInOptions.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f20469w);
        AbstractC36221c.m115331l(parcel, 5, this.f20470x, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
