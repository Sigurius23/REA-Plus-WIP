package j00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j00.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C21104h0 extends AbstractC21106i0 {
    public static final Parcelable.Creator<C21104h0> CREATOR = new C21100f0(1);

    /* JADX INFO: renamed from: E */
    public final EnumC21098e0 f80033E;

    /* JADX INFO: renamed from: F */
    public final String f80034F;

    /* JADX INFO: renamed from: w */
    public final String f80035w;

    /* JADX INFO: renamed from: x */
    public final String f80036x;

    /* JADX INFO: renamed from: y */
    public final String f80037y;

    /* JADX INFO: renamed from: z */
    public final String f80038z;

    public C21104h0(String email, String str, String str2, String str3, EnumC21098e0 consentAction, String countryInferringMethod) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(consentAction, "consentAction");
        AbstractC22676k.m65750j(countryInferringMethod, "countryInferringMethod");
        this.f80035w = email;
        this.f80036x = str;
        this.f80037y = str2;
        this.f80038z = str3;
        this.f80033E = consentAction;
        this.f80034F = countryInferringMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21104h0)) {
            return false;
        }
        C21104h0 c21104h0 = (C21104h0) obj;
        return AbstractC22676k.m65745e(this.f80035w, c21104h0.f80035w) && AbstractC22676k.m65745e(this.f80036x, c21104h0.f80036x) && AbstractC22676k.m65745e(this.f80037y, c21104h0.f80037y) && AbstractC22676k.m65745e(this.f80038z, c21104h0.f80038z) && this.f80033E == c21104h0.f80033E && AbstractC22676k.m65745e(this.f80034F, c21104h0.f80034F);
    }

    public final int hashCode() {
        int iHashCode = this.f80035w.hashCode() * 31;
        String str = this.f80036x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f80037y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f80038z;
        return this.f80034F.hashCode() + ((this.f80033E.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SignUp(email=", this.f80035w, ", phone=", this.f80036x, ", country=");
        AbstractC11266d.m30444B(sbM32001t, this.f80037y, ", name=", this.f80038z, ", consentAction=");
        sbM32001t.append(this.f80033E);
        sbM32001t.append(", countryInferringMethod=");
        sbM32001t.append(this.f80034F);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f80035w);
        dest.writeString(this.f80036x);
        dest.writeString(this.f80037y);
        dest.writeString(this.f80038z);
        dest.writeString(this.f80033E.name());
        dest.writeString(this.f80034F);
    }
}
