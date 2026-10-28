package q30;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.interfaces.ECPublicKey;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;

/* JADX INFO: renamed from: q30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C29893a implements Parcelable {
    public static final Parcelable.Creator<C29893a> CREATOR = new C29831p(9);

    /* JADX INFO: renamed from: w */
    public final String f122130w;

    /* JADX INFO: renamed from: x */
    public final ECPublicKey f122131x;

    /* JADX INFO: renamed from: y */
    public final ECPublicKey f122132y;

    public C29893a(String acsUrl, ECPublicKey acsEphemPubKey, ECPublicKey sdkEphemPubKey) {
        AbstractC22676k.m65750j(acsUrl, "acsUrl");
        AbstractC22676k.m65750j(acsEphemPubKey, "acsEphemPubKey");
        AbstractC22676k.m65750j(sdkEphemPubKey, "sdkEphemPubKey");
        this.f122130w = acsUrl;
        this.f122131x = acsEphemPubKey;
        this.f122132y = sdkEphemPubKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29893a)) {
            return false;
        }
        C29893a c29893a = (C29893a) obj;
        return AbstractC22676k.m65745e(this.f122130w, c29893a.f122130w) && AbstractC22676k.m65745e(this.f122131x, c29893a.f122131x) && AbstractC22676k.m65745e(this.f122132y, c29893a.f122132y);
    }

    public final int hashCode() {
        return this.f122132y.hashCode() + ((this.f122131x.hashCode() + (this.f122130w.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AcsData(acsUrl=" + this.f122130w + ", acsEphemPubKey=" + this.f122131x + ", sdkEphemPubKey=" + this.f122132y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f122130w);
        dest.writeSerializable(this.f122131x);
        dest.writeSerializable(this.f122132y);
    }
}
