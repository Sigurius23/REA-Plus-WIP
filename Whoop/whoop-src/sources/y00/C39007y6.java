package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.y6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39007y6 implements InterfaceC36562b {
    public static final Parcelable.Creator<C39007y6> CREATOR = new C38943r5(23);

    /* JADX INFO: renamed from: E */
    public final String f167889E;

    /* JADX INFO: renamed from: F */
    public final String f167890F;

    /* JADX INFO: renamed from: G */
    public final Integer f167891G;

    /* JADX INFO: renamed from: H */
    public final Integer f167892H;

    /* JADX INFO: renamed from: I */
    public final EnumC38863j f167893I;

    /* JADX INFO: renamed from: J */
    public final String f167894J;

    /* JADX INFO: renamed from: K */
    public final EnumC38852h8 f167895K;

    /* JADX INFO: renamed from: w */
    public final String f167896w;

    /* JADX INFO: renamed from: x */
    public final String f167897x;

    /* JADX INFO: renamed from: y */
    public final EnumC38853i f167898y;

    /* JADX INFO: renamed from: z */
    public final String f167899z;

    public C39007y6(String str, String str2, EnumC38853i brand, String str3, String str4, String str5, Integer num, Integer num2, EnumC38863j enumC38863j, String str6, EnumC38852h8 enumC38852h8) {
        AbstractC22676k.m65750j(brand, "brand");
        this.f167896w = str;
        this.f167897x = str2;
        this.f167898y = brand;
        this.f167899z = str3;
        this.f167889E = str4;
        this.f167890F = str5;
        this.f167891G = num;
        this.f167892H = num2;
        this.f167893I = enumC38863j;
        this.f167894J = str6;
        this.f167895K = enumC38852h8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39007y6)) {
            return false;
        }
        C39007y6 c39007y6 = (C39007y6) obj;
        return AbstractC22676k.m65745e(this.f167896w, c39007y6.f167896w) && AbstractC22676k.m65745e(this.f167897x, c39007y6.f167897x) && this.f167898y == c39007y6.f167898y && AbstractC22676k.m65745e(this.f167899z, c39007y6.f167899z) && AbstractC22676k.m65745e(this.f167889E, c39007y6.f167889E) && AbstractC22676k.m65745e(this.f167890F, c39007y6.f167890F) && AbstractC22676k.m65745e(this.f167891G, c39007y6.f167891G) && AbstractC22676k.m65745e(this.f167892H, c39007y6.f167892H) && this.f167893I == c39007y6.f167893I && AbstractC22676k.m65745e(this.f167894J, c39007y6.f167894J) && this.f167895K == c39007y6.f167895K;
    }

    public final int hashCode() {
        String str = this.f167896w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167897x;
        int iHashCode2 = (this.f167898y.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f167899z;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167889E;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167890F;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f167891G;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f167892H;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        EnumC38863j enumC38863j = this.f167893I;
        int iHashCode8 = (iHashCode7 + (enumC38863j == null ? 0 : enumC38863j.hashCode())) * 31;
        String str6 = this.f167894J;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        EnumC38852h8 enumC38852h8 = this.f167895K;
        return iHashCode9 + (enumC38852h8 != null ? enumC38852h8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Card(addressLine1Check=", this.f167896w, ", addressZipCheck=", this.f167897x, ", brand=");
        sbM32001t.append(this.f167898y);
        sbM32001t.append(", country=");
        sbM32001t.append(this.f167899z);
        sbM32001t.append(", cvcCheck=");
        AbstractC11266d.m30444B(sbM32001t, this.f167889E, ", dynamicLast4=", this.f167890F, ", expiryMonth=");
        AbstractC31061c.m95621A(sbM32001t, this.f167891G, ", expiryYear=", this.f167892H, ", funding=");
        sbM32001t.append(this.f167893I);
        sbM32001t.append(", last4=");
        sbM32001t.append(this.f167894J);
        sbM32001t.append(", tokenizationMethod=");
        sbM32001t.append(this.f167895K);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167896w);
        dest.writeString(this.f167897x);
        dest.writeString(this.f167898y.name());
        dest.writeString(this.f167899z);
        dest.writeString(this.f167889E);
        dest.writeString(this.f167890F);
        Integer num = this.f167891G;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.f167892H;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        EnumC38863j enumC38863j = this.f167893I;
        if (enumC38863j == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38863j.name());
        }
        dest.writeString(this.f167894J);
        EnumC38852h8 enumC38852h8 = this.f167895K;
        if (enumC38852h8 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38852h8.name());
        }
    }
}
