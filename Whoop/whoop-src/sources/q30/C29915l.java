package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;

/* JADX INFO: renamed from: q30.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C29915l implements Parcelable {
    public static final Parcelable.Creator<C29915l> CREATOR = new C29831p(16);

    /* JADX INFO: renamed from: E */
    public final String f122202E;

    /* JADX INFO: renamed from: w */
    public final String f122203w;

    /* JADX INFO: renamed from: x */
    public final String f122204x;

    /* JADX INFO: renamed from: y */
    public final String f122205y;

    /* JADX INFO: renamed from: z */
    public final String f122206z;

    public C29915l(String str, String str2, String str3, String str4, String str5) {
        this.f122203w = str;
        this.f122204x = str2;
        this.f122205y = str3;
        this.f122206z = str4;
        this.f122202E = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29915l)) {
            return false;
        }
        C29915l c29915l = (C29915l) obj;
        return AbstractC22676k.m65745e(this.f122203w, c29915l.f122203w) && AbstractC22676k.m65745e(this.f122204x, c29915l.f122204x) && AbstractC22676k.m65745e(this.f122205y, c29915l.f122205y) && AbstractC22676k.m65745e(this.f122206z, c29915l.f122206z) && AbstractC22676k.m65745e(this.f122202E, c29915l.f122202E);
    }

    public final int hashCode() {
        String str = this.f122203w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f122204x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f122205y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f122206z;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f122202E;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChallengeParameters(threeDsServerTransactionId=", this.f122203w, ", acsTransactionId=", this.f122204x, ", acsRefNumber=");
        AbstractC11266d.m30444B(sbM32001t, this.f122205y, ", acsSignedContent=", this.f122206z, ", threeDSRequestorAppURL=");
        return AbstractC25012a.m73376i(this.f122202E, ")", sbM32001t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f122203w);
        dest.writeString(this.f122204x);
        dest.writeString(this.f122205y);
        dest.writeString(this.f122206z);
        dest.writeString(this.f122202E);
    }
}
