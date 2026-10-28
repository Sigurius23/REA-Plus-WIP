package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.a7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38781a7 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38781a7> CREATOR = new C38943r5(25);

    /* JADX INFO: renamed from: E */
    public final String f166918E;

    /* JADX INFO: renamed from: F */
    public final String f166919F;

    /* JADX INFO: renamed from: G */
    public final String f166920G;

    /* JADX INFO: renamed from: H */
    public final List f166921H;

    /* JADX INFO: renamed from: I */
    public final String f166922I;

    /* JADX INFO: renamed from: J */
    public final String f166923J;

    /* JADX INFO: renamed from: K */
    public final String f166924K;

    /* JADX INFO: renamed from: L */
    public final String f166925L;

    /* JADX INFO: renamed from: w */
    public final String f166926w;

    /* JADX INFO: renamed from: x */
    public final String f166927x;

    /* JADX INFO: renamed from: y */
    public final String f166928y;

    /* JADX INFO: renamed from: z */
    public final String f166929z;

    public C38781a7(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList, String str8, String str9, String str10, String str11) {
        this.f166926w = str;
        this.f166927x = str2;
        this.f166928y = str3;
        this.f166929z = str4;
        this.f166918E = str5;
        this.f166919F = str6;
        this.f166920G = str7;
        this.f166921H = arrayList;
        this.f166922I = str8;
        this.f166923J = str9;
        this.f166924K = str10;
        this.f166925L = str11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38781a7)) {
            return false;
        }
        C38781a7 c38781a7 = (C38781a7) obj;
        return AbstractC22676k.m65745e(this.f166926w, c38781a7.f166926w) && AbstractC22676k.m65745e(this.f166927x, c38781a7.f166927x) && AbstractC22676k.m65745e(this.f166928y, c38781a7.f166928y) && AbstractC22676k.m65745e(this.f166929z, c38781a7.f166929z) && AbstractC22676k.m65745e(this.f166918E, c38781a7.f166918E) && AbstractC22676k.m65745e(this.f166919F, c38781a7.f166919F) && AbstractC22676k.m65745e(this.f166920G, c38781a7.f166920G) && AbstractC22676k.m65745e(this.f166921H, c38781a7.f166921H) && AbstractC22676k.m65745e(this.f166922I, c38781a7.f166922I) && AbstractC22676k.m65745e(this.f166923J, c38781a7.f166923J) && AbstractC22676k.m65745e(this.f166924K, c38781a7.f166924K) && AbstractC22676k.m65745e(this.f166925L, c38781a7.f166925L);
    }

    public final int hashCode() {
        String str = this.f166926w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f166927x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f166928y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f166929z;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f166918E;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f166919F;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f166920G;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list = this.f166921H;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str8 = this.f166922I;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f166923J;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f166924K;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f166925L;
        return iHashCode11 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Ares(threeDSServerTransId=", this.f166926w, ", acsChallengeMandated=", this.f166927x, ", acsSignedContent=");
        AbstractC11266d.m30444B(sbM32001t, this.f166928y, ", acsTransId=", this.f166929z, ", acsUrl=");
        AbstractC11266d.m30444B(sbM32001t, this.f166918E, ", authenticationType=", this.f166919F, ", cardholderInfo=");
        AbstractC36095b.m114694v(this.f166920G, ", messageExtension=", ", messageType=", sbM32001t, this.f166921H);
        AbstractC11266d.m30444B(sbM32001t, this.f166922I, ", messageVersion=", this.f166923J, ", sdkTransId=");
        return AbstractC11266d.m30464r(sbM32001t, this.f166924K, ", transStatus=", this.f166925L, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166926w);
        dest.writeString(this.f166927x);
        dest.writeString(this.f166928y);
        dest.writeString(this.f166929z);
        dest.writeString(this.f166918E);
        dest.writeString(this.f166919F);
        dest.writeString(this.f166920G);
        List list = this.f166921H;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C38791b7) it.next()).writeToParcel(dest, i13);
            }
        }
        dest.writeString(this.f166922I);
        dest.writeString(this.f166923J);
        dest.writeString(this.f166924K);
        dest.writeString(this.f166925L);
    }
}
