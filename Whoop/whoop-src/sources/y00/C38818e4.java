package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.e4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38818e4 extends AbstractC38838g4 {
    public static final Parcelable.Creator<C38818e4> CREATOR = new C38967u2(26);

    /* JADX INFO: renamed from: E */
    public final String f167066E;

    /* JADX INFO: renamed from: w */
    public final String f167067w;

    /* JADX INFO: renamed from: x */
    public final String f167068x;

    /* JADX INFO: renamed from: y */
    public final String f167069y;

    /* JADX INFO: renamed from: z */
    public final String f167070z;

    public C38818e4(String str, String str2, String str3, String str4, String str5) {
        this.f167067w = str;
        this.f167068x = str2;
        this.f167069y = str3;
        this.f167070z = str4;
        this.f167066E = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38818e4)) {
            return false;
        }
        C38818e4 c38818e4 = (C38818e4) obj;
        return AbstractC22676k.m65745e(this.f167067w, c38818e4.f167067w) && AbstractC22676k.m65745e(this.f167068x, c38818e4.f167068x) && AbstractC22676k.m65745e(this.f167069y, c38818e4.f167069y) && AbstractC22676k.m65745e(this.f167070z, c38818e4.f167070z) && AbstractC22676k.m65745e(this.f167066E, c38818e4.f167066E);
    }

    public final int hashCode() {
        String str = this.f167067w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167068x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167069y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167070z;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167066E;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SepaDebit(bankCode=", this.f167067w, ", branchCode=", this.f167068x, ", country=");
        AbstractC11266d.m30444B(sbM32001t, this.f167069y, ", fingerprint=", this.f167070z, ", last4=");
        return AbstractC25012a.m73376i(this.f167066E, ")", sbM32001t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167067w);
        dest.writeString(this.f167068x);
        dest.writeString(this.f167069y);
        dest.writeString(this.f167070z);
        dest.writeString(this.f167066E);
    }
}
