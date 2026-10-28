package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.w3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38986w3 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38986w3> CREATOR = new C38967u2(17);

    /* JADX INFO: renamed from: w */
    public final String f167820w;

    /* JADX INFO: renamed from: x */
    public final String f167821x;

    /* JADX INFO: renamed from: y */
    public final String f167822y;

    public C38986w3(String str, String str2, String str3) {
        this.f167820w = str;
        this.f167821x = str2;
        this.f167822y = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38986w3)) {
            return false;
        }
        C38986w3 c38986w3 = (C38986w3) obj;
        return AbstractC22676k.m65745e(this.f167820w, c38986w3.f167820w) && AbstractC22676k.m65745e(this.f167821x, c38986w3.f167821x) && AbstractC22676k.m65745e(this.f167822y, c38986w3.f167822y);
    }

    public final int hashCode() {
        String str = this.f167820w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167821x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167822y;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f167822y, ")", AbstractC11895b.m32001t("Checks(addressLine1Check=", this.f167820w, ", addressPostalCodeCheck=", this.f167821x, ", cvcCheck="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167820w);
        dest.writeString(this.f167821x);
        dest.writeString(this.f167822y);
    }
}
