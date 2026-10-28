package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.k8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38882k8 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38882k8> CREATOR = new C38821e7(19);

    /* JADX INFO: renamed from: E */
    public final String f167342E;

    /* JADX INFO: renamed from: F */
    public final String f167343F;

    /* JADX INFO: renamed from: G */
    public final String f167344G;

    /* JADX INFO: renamed from: H */
    public final String f167345H;

    /* JADX INFO: renamed from: I */
    public final String f167346I;

    /* JADX INFO: renamed from: w */
    public final String f167347w;

    /* JADX INFO: renamed from: x */
    public final String f167348x;

    /* JADX INFO: renamed from: y */
    public final String f167349y;

    /* JADX INFO: renamed from: z */
    public final String f167350z;

    public C38882k8(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f167347w = str;
        this.f167348x = str2;
        this.f167349y = str3;
        this.f167350z = str4;
        this.f167342E = str5;
        this.f167343F = str6;
        this.f167344G = str7;
        this.f167345H = str8;
        this.f167346I = str9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38882k8)) {
            return false;
        }
        C38882k8 c38882k8 = (C38882k8) obj;
        return AbstractC22676k.m65745e(this.f167347w, c38882k8.f167347w) && AbstractC22676k.m65745e(this.f167348x, c38882k8.f167348x) && AbstractC22676k.m65745e(this.f167349y, c38882k8.f167349y) && AbstractC22676k.m65745e(this.f167350z, c38882k8.f167350z) && AbstractC22676k.m65745e(this.f167342E, c38882k8.f167342E) && AbstractC22676k.m65745e(this.f167343F, c38882k8.f167343F) && AbstractC22676k.m65745e(this.f167344G, c38882k8.f167344G) && AbstractC22676k.m65745e(this.f167345H, c38882k8.f167345H) && AbstractC22676k.m65745e(this.f167346I, c38882k8.f167346I);
    }

    public final int hashCode() {
        String str = this.f167347w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167348x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167349y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167350z;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167342E;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f167343F;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f167344G;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f167345H;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f167346I;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WeChat(statementDescriptor=", this.f167347w, ", appId=", this.f167348x, ", nonce=");
        AbstractC11266d.m30444B(sbM32001t, this.f167349y, ", packageValue=", this.f167350z, ", partnerId=");
        AbstractC11266d.m30444B(sbM32001t, this.f167342E, ", prepayId=", this.f167343F, ", sign=");
        AbstractC11266d.m30444B(sbM32001t, this.f167344G, ", timestamp=", this.f167345H, ", qrCodeUrl=");
        return AbstractC25012a.m73376i(this.f167346I, ")", sbM32001t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167347w);
        dest.writeString(this.f167348x);
        dest.writeString(this.f167349y);
        dest.writeString(this.f167350z);
        dest.writeString(this.f167342E);
        dest.writeString(this.f167343F);
        dest.writeString(this.f167344G);
        dest.writeString(this.f167345H);
        dest.writeString(this.f167346I);
    }
}
