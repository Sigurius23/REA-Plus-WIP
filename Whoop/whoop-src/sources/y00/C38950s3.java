package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.s3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38950s3 extends AbstractC38838g4 {
    public static final Parcelable.Creator<C38950s3> CREATOR = new C38967u2(14);

    /* JADX INFO: renamed from: w */
    public final String f167655w;

    /* JADX INFO: renamed from: x */
    public final String f167656x;

    /* JADX INFO: renamed from: y */
    public final String f167657y;

    public C38950s3(String str, String str2, String str3) {
        this.f167655w = str;
        this.f167656x = str2;
        this.f167657y = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38950s3)) {
            return false;
        }
        C38950s3 c38950s3 = (C38950s3) obj;
        return AbstractC22676k.m65745e(this.f167655w, c38950s3.f167655w) && AbstractC22676k.m65745e(this.f167656x, c38950s3.f167656x) && AbstractC22676k.m65745e(this.f167657y, c38950s3.f167657y);
    }

    public final int hashCode() {
        String str = this.f167655w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167656x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167657y;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f167657y, ")", AbstractC11895b.m32001t("AuBecsDebit(bsbNumber=", this.f167655w, ", fingerprint=", this.f167656x, ", last4="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167655w);
        dest.writeString(this.f167656x);
        dest.writeString(this.f167657y);
    }
}
