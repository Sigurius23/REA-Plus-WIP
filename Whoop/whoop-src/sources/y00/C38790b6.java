package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.b6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38790b6 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38790b6> CREATOR = new C38943r5(6);

    /* JADX INFO: renamed from: w */
    public final String f166951w;

    /* JADX INFO: renamed from: x */
    public final String f166952x;

    /* JADX INFO: renamed from: y */
    public final String f166953y;

    public C38790b6(String id4, String str, String str2) {
        AbstractC22676k.m65750j(id4, "id");
        this.f166951w = id4;
        this.f166952x = str;
        this.f166953y = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38790b6)) {
            return false;
        }
        C38790b6 c38790b6 = (C38790b6) obj;
        return AbstractC22676k.m65745e(this.f166951w, c38790b6.f166951w) && AbstractC22676k.m65745e(this.f166952x, c38790b6.f166952x) && AbstractC22676k.m65745e(this.f166953y, c38790b6.f166953y);
    }

    public final int hashCode() {
        int iHashCode = this.f166951w.hashCode() * 31;
        String str = this.f166952x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f166953y;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f166953y, ")", AbstractC11895b.m32001t("RadarSessionWithHCaptcha(id=", this.f166951w, ", passiveCaptchaSiteKey=", this.f166952x, ", passiveCaptchaRqdata="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166951w);
        dest.writeString(this.f166952x);
        dest.writeString(this.f166953y);
    }
}
