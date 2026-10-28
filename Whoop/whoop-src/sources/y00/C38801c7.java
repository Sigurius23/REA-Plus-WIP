package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.c7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38801c7 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38801c7> CREATOR = new C38943r5(28);

    /* JADX INFO: renamed from: E */
    public final String f166982E;

    /* JADX INFO: renamed from: F */
    public final String f166983F;

    /* JADX INFO: renamed from: G */
    public final String f166984G;

    /* JADX INFO: renamed from: H */
    public final String f166985H;

    /* JADX INFO: renamed from: I */
    public final String f166986I;

    /* JADX INFO: renamed from: J */
    public final String f166987J;

    /* JADX INFO: renamed from: K */
    public final String f166988K;

    /* JADX INFO: renamed from: w */
    public final String f166989w;

    /* JADX INFO: renamed from: x */
    public final String f166990x;

    /* JADX INFO: renamed from: y */
    public final String f166991y;

    /* JADX INFO: renamed from: z */
    public final String f166992z;

    public C38801c7(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f166989w = str;
        this.f166990x = str2;
        this.f166991y = str3;
        this.f166992z = str4;
        this.f166982E = str5;
        this.f166983F = str6;
        this.f166984G = str7;
        this.f166985H = str8;
        this.f166986I = str9;
        this.f166987J = str10;
        this.f166988K = str11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38801c7)) {
            return false;
        }
        C38801c7 c38801c7 = (C38801c7) obj;
        return AbstractC22676k.m65745e(this.f166989w, c38801c7.f166989w) && AbstractC22676k.m65745e(this.f166990x, c38801c7.f166990x) && AbstractC22676k.m65745e(this.f166991y, c38801c7.f166991y) && AbstractC22676k.m65745e(this.f166992z, c38801c7.f166992z) && AbstractC22676k.m65745e(this.f166982E, c38801c7.f166982E) && AbstractC22676k.m65745e(this.f166983F, c38801c7.f166983F) && AbstractC22676k.m65745e(this.f166984G, c38801c7.f166984G) && AbstractC22676k.m65745e(this.f166985H, c38801c7.f166985H) && AbstractC22676k.m65745e(this.f166986I, c38801c7.f166986I) && AbstractC22676k.m65745e(this.f166987J, c38801c7.f166987J) && AbstractC22676k.m65745e(this.f166988K, c38801c7.f166988K);
    }

    public final int hashCode() {
        String str = this.f166989w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f166990x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f166991y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f166992z;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f166982E;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f166983F;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f166984G;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f166985H;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f166986I;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f166987J;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f166988K;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ThreeDS2Error(threeDSServerTransId=", this.f166989w, ", acsTransId=", this.f166990x, ", dsTransId=");
        AbstractC11266d.m30444B(sbM32001t, this.f166991y, ", errorCode=", this.f166992z, ", errorComponent=");
        AbstractC11266d.m30444B(sbM32001t, this.f166982E, ", errorDescription=", this.f166983F, ", errorDetail=");
        AbstractC11266d.m30444B(sbM32001t, this.f166984G, ", errorMessageType=", this.f166985H, ", messageType=");
        AbstractC11266d.m30444B(sbM32001t, this.f166986I, ", messageVersion=", this.f166987J, ", sdkTransId=");
        return AbstractC25012a.m73376i(this.f166988K, ")", sbM32001t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166989w);
        dest.writeString(this.f166990x);
        dest.writeString(this.f166991y);
        dest.writeString(this.f166992z);
        dest.writeString(this.f166982E);
        dest.writeString(this.f166983F);
        dest.writeString(this.f166984G);
        dest.writeString(this.f166985H);
        dest.writeString(this.f166986I);
        dest.writeString(this.f166987J);
        dest.writeString(this.f166988K);
    }
}
