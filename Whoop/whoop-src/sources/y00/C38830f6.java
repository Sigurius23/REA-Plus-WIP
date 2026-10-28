package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.f6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38830f6 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38830f6> CREATOR = new C38943r5(8);

    /* JADX INFO: renamed from: E */
    public final String f167138E;

    /* JADX INFO: renamed from: F */
    public final C38915o4 f167139F;

    /* JADX INFO: renamed from: G */
    public final EnumC38820e6 f167140G;

    /* JADX INFO: renamed from: w */
    public final String f167141w;

    /* JADX INFO: renamed from: x */
    public final String f167142x;

    /* JADX INFO: renamed from: y */
    public final String f167143y;

    /* JADX INFO: renamed from: z */
    public final String f167144z;

    public C38830f6(String str, String str2, String str3, String str4, String str5, C38915o4 c38915o4, EnumC38820e6 enumC38820e6) {
        this.f167141w = str;
        this.f167142x = str2;
        this.f167143y = str3;
        this.f167144z = str4;
        this.f167138E = str5;
        this.f167139F = c38915o4;
        this.f167140G = enumC38820e6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38830f6)) {
            return false;
        }
        C38830f6 c38830f6 = (C38830f6) obj;
        return AbstractC22676k.m65745e(this.f167141w, c38830f6.f167141w) && AbstractC22676k.m65745e(this.f167142x, c38830f6.f167142x) && AbstractC22676k.m65745e(this.f167143y, c38830f6.f167143y) && AbstractC22676k.m65745e(this.f167144z, c38830f6.f167144z) && AbstractC22676k.m65745e(this.f167138E, c38830f6.f167138E) && AbstractC22676k.m65745e(this.f167139F, c38830f6.f167139F) && this.f167140G == c38830f6.f167140G;
    }

    public final int hashCode() {
        String str = this.f167141w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167142x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167143y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167144z;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167138E;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C38915o4 c38915o4 = this.f167139F;
        int iHashCode6 = (iHashCode5 + (c38915o4 == null ? 0 : c38915o4.hashCode())) * 31;
        EnumC38820e6 enumC38820e6 = this.f167140G;
        return iHashCode6 + (enumC38820e6 != null ? enumC38820e6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Error(code=", this.f167141w, ", declineCode=", this.f167142x, ", docUrl=");
        AbstractC11266d.m30444B(sbM32001t, this.f167143y, ", message=", this.f167144z, ", param=");
        sbM32001t.append(this.f167138E);
        sbM32001t.append(", paymentMethod=");
        sbM32001t.append(this.f167139F);
        sbM32001t.append(", type=");
        sbM32001t.append(this.f167140G);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167141w);
        dest.writeString(this.f167142x);
        dest.writeString(this.f167143y);
        dest.writeString(this.f167144z);
        dest.writeString(this.f167138E);
        C38915o4 c38915o4 = this.f167139F;
        if (c38915o4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38915o4.writeToParcel(dest, i13);
        }
        EnumC38820e6 enumC38820e6 = this.f167140G;
        if (enumC38820e6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38820e6.name());
        }
    }
}
