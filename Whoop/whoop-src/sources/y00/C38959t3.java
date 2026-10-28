package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.t3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38959t3 extends AbstractC38838g4 {
    public static final Parcelable.Creator<C38959t3> CREATOR = new C38967u2(15);

    /* JADX INFO: renamed from: w */
    public final String f167700w;

    /* JADX INFO: renamed from: x */
    public final String f167701x;

    /* JADX INFO: renamed from: y */
    public final String f167702y;

    public C38959t3(String str, String str2, String str3) {
        this.f167700w = str;
        this.f167701x = str2;
        this.f167702y = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38959t3)) {
            return false;
        }
        C38959t3 c38959t3 = (C38959t3) obj;
        return AbstractC22676k.m65745e(this.f167700w, c38959t3.f167700w) && AbstractC22676k.m65745e(this.f167701x, c38959t3.f167701x) && AbstractC22676k.m65745e(this.f167702y, c38959t3.f167702y);
    }

    public final int hashCode() {
        String str = this.f167700w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167701x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167702y;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f167702y, ")", AbstractC11895b.m32001t("BacsDebit(fingerprint=", this.f167700w, ", last4=", this.f167701x, ", sortCode="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167700w);
        dest.writeString(this.f167701x);
        dest.writeString(this.f167702y);
    }
}
