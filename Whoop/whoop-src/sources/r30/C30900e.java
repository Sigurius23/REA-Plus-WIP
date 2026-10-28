package r30;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;
import q30.C29926q0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: r30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C30900e implements Parcelable {
    public static final Parcelable.Creator<C30900e> CREATOR = new C29912j0(10);

    /* JADX INFO: renamed from: c0 */
    public static final List f127402c0 = AbstractC37056f.m118959K("Y", "N");

    /* JADX INFO: renamed from: E */
    public final EnumC30905j f127403E;

    /* JADX INFO: renamed from: F */
    public final boolean f127404F;

    /* JADX INFO: renamed from: G */
    public final String f127405G;

    /* JADX INFO: renamed from: H */
    public final String f127406H;

    /* JADX INFO: renamed from: I */
    public final String f127407I;

    /* JADX INFO: renamed from: J */
    public final String f127408J;

    /* JADX INFO: renamed from: K */
    public final boolean f127409K;

    /* JADX INFO: renamed from: L */
    public final List f127410L;

    /* JADX INFO: renamed from: M */
    public final String f127411M;

    /* JADX INFO: renamed from: N */
    public final String f127412N;

    /* JADX INFO: renamed from: O */
    public final C30899d f127413O;

    /* JADX INFO: renamed from: P */
    public final List f127414P;

    /* JADX INFO: renamed from: Q */
    public final String f127415Q;

    /* JADX INFO: renamed from: R */
    public final String f127416R;

    /* JADX INFO: renamed from: S */
    public final String f127417S;

    /* JADX INFO: renamed from: T */
    public final String f127418T;

    /* JADX INFO: renamed from: U */
    public final C30899d f127419U;

    /* JADX INFO: renamed from: V */
    public final String f127420V;

    /* JADX INFO: renamed from: W */
    public final C29926q0 f127421W;

    /* JADX INFO: renamed from: X */
    public final String f127422X;

    /* JADX INFO: renamed from: Y */
    public final String f127423Y;

    /* JADX INFO: renamed from: Z */
    public final String f127424Z;

    /* JADX INFO: renamed from: a0 */
    public final String f127425a0;

    /* JADX INFO: renamed from: b0 */
    public final String f127426b0;

    /* JADX INFO: renamed from: w */
    public final String f127427w;

    /* JADX INFO: renamed from: x */
    public final String f127428x;

    /* JADX INFO: renamed from: y */
    public final String f127429y;

    /* JADX INFO: renamed from: z */
    public final String f127430z;

    public C30900e(String serverTransId, String acsTransId, String str, String str2, EnumC30905j enumC30905j, boolean z4, String str3, String str4, String str5, String str6, boolean z13, ArrayList arrayList, String str7, String str8, C30899d c30899d, ArrayList arrayList2, String messageVersion, String str9, String str10, String str11, C30899d c30899d2, String str12, C29926q0 sdkTransId, String str13, String str14, String str15, String str16, String str17) {
        AbstractC22676k.m65750j(serverTransId, "serverTransId");
        AbstractC22676k.m65750j(acsTransId, "acsTransId");
        AbstractC22676k.m65750j(messageVersion, "messageVersion");
        AbstractC22676k.m65750j(sdkTransId, "sdkTransId");
        this.f127427w = serverTransId;
        this.f127428x = acsTransId;
        this.f127429y = str;
        this.f127430z = str2;
        this.f127403E = enumC30905j;
        this.f127404F = z4;
        this.f127405G = str3;
        this.f127406H = str4;
        this.f127407I = str5;
        this.f127408J = str6;
        this.f127409K = z13;
        this.f127410L = arrayList;
        this.f127411M = str7;
        this.f127412N = str8;
        this.f127413O = c30899d;
        this.f127414P = arrayList2;
        this.f127415Q = messageVersion;
        this.f127416R = str9;
        this.f127417S = str10;
        this.f127418T = str11;
        this.f127419U = c30899d2;
        this.f127420V = str12;
        this.f127421W = sdkTransId;
        this.f127422X = str13;
        this.f127423Y = str14;
        this.f127424Z = str15;
        this.f127425a0 = str16;
        this.f127426b0 = str17;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30900e)) {
            return false;
        }
        C30900e c30900e = (C30900e) obj;
        return AbstractC22676k.m65745e(this.f127427w, c30900e.f127427w) && AbstractC22676k.m65745e(this.f127428x, c30900e.f127428x) && AbstractC22676k.m65745e(this.f127429y, c30900e.f127429y) && AbstractC22676k.m65745e(this.f127430z, c30900e.f127430z) && this.f127403E == c30900e.f127403E && this.f127404F == c30900e.f127404F && AbstractC22676k.m65745e(this.f127405G, c30900e.f127405G) && AbstractC22676k.m65745e(this.f127406H, c30900e.f127406H) && AbstractC22676k.m65745e(this.f127407I, c30900e.f127407I) && AbstractC22676k.m65745e(this.f127408J, c30900e.f127408J) && this.f127409K == c30900e.f127409K && AbstractC22676k.m65745e(this.f127410L, c30900e.f127410L) && AbstractC22676k.m65745e(this.f127411M, c30900e.f127411M) && AbstractC22676k.m65745e(this.f127412N, c30900e.f127412N) && AbstractC22676k.m65745e(this.f127413O, c30900e.f127413O) && AbstractC22676k.m65745e(this.f127414P, c30900e.f127414P) && AbstractC22676k.m65745e(this.f127415Q, c30900e.f127415Q) && AbstractC22676k.m65745e(this.f127416R, c30900e.f127416R) && AbstractC22676k.m65745e(this.f127417S, c30900e.f127417S) && AbstractC22676k.m65745e(this.f127418T, c30900e.f127418T) && AbstractC22676k.m65745e(this.f127419U, c30900e.f127419U) && AbstractC22676k.m65745e(this.f127420V, c30900e.f127420V) && AbstractC22676k.m65745e(this.f127421W, c30900e.f127421W) && AbstractC22676k.m65745e(this.f127422X, c30900e.f127422X) && AbstractC22676k.m65745e(this.f127423Y, c30900e.f127423Y) && AbstractC22676k.m65745e(this.f127424Z, c30900e.f127424Z) && AbstractC22676k.m65745e(this.f127425a0, c30900e.f127425a0) && AbstractC22676k.m65745e(this.f127426b0, c30900e.f127426b0);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f127427w.hashCode() * 31, 31, this.f127428x);
        String str = this.f127429y;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f127430z;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC30905j enumC30905j = this.f127403E;
        int iM8289b = AbstractC2875y.m8289b((iHashCode2 + (enumC30905j == null ? 0 : enumC30905j.hashCode())) * 31, 31, this.f127404F);
        String str3 = this.f127405G;
        int iHashCode3 = (iM8289b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f127406H;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f127407I;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f127408J;
        int iM8289b2 = AbstractC2875y.m8289b((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f127409K);
        List list = this.f127410L;
        int iHashCode6 = (iM8289b2 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.f127411M;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f127412N;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        C30899d c30899d = this.f127413O;
        int iHashCode9 = (iHashCode8 + (c30899d == null ? 0 : c30899d.hashCode())) * 31;
        List list2 = this.f127414P;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f127415Q);
        String str9 = this.f127416R;
        int iHashCode10 = (iM30450d2 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f127417S;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f127418T;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        C30899d c30899d2 = this.f127419U;
        int iHashCode13 = (iHashCode12 + (c30899d2 == null ? 0 : c30899d2.hashCode())) * 31;
        String str12 = this.f127420V;
        int iM30450d3 = AbstractC11266d.m30450d((iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31, 31, this.f127421W.f122226w);
        String str13 = this.f127422X;
        int iHashCode14 = (iM30450d3 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f127423Y;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f127424Z;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f127425a0;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f127426b0;
        return iHashCode17 + (str17 != null ? str17.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChallengeResponseData(serverTransId=", this.f127427w, ", acsTransId=", this.f127428x, ", acsHtml=");
        AbstractC11266d.m30444B(sbM32001t, this.f127429y, ", acsHtmlRefresh=", this.f127430z, ", uiType=");
        sbM32001t.append(this.f127403E);
        sbM32001t.append(", isChallengeCompleted=");
        sbM32001t.append(this.f127404F);
        sbM32001t.append(", challengeInfoHeader=");
        AbstractC11266d.m30444B(sbM32001t, this.f127405G, ", challengeInfoLabel=", this.f127406H, ", challengeInfoText=");
        AbstractC11266d.m30444B(sbM32001t, this.f127407I, ", challengeAdditionalInfoText=", this.f127408J, ", shouldShowChallengeInfoTextIndicator=");
        AbstractC25012a.m73391x(", challengeSelectOptions=", ", expandInfoLabel=", sbM32001t, this.f127410L, this.f127409K);
        AbstractC11266d.m30444B(sbM32001t, this.f127411M, ", expandInfoText=", this.f127412N, ", issuerImage=");
        sbM32001t.append(this.f127413O);
        sbM32001t.append(", messageExtensions=");
        sbM32001t.append(this.f127414P);
        sbM32001t.append(", messageVersion=");
        AbstractC11266d.m30444B(sbM32001t, this.f127415Q, ", oobAppUrl=", this.f127416R, ", oobAppLabel=");
        AbstractC11266d.m30444B(sbM32001t, this.f127417S, ", oobContinueLabel=", this.f127418T, ", paymentSystemImage=");
        sbM32001t.append(this.f127419U);
        sbM32001t.append(", resendInformationLabel=");
        sbM32001t.append(this.f127420V);
        sbM32001t.append(", sdkTransId=");
        sbM32001t.append(this.f127421W);
        sbM32001t.append(", submitAuthenticationLabel=");
        sbM32001t.append(this.f127422X);
        sbM32001t.append(", whitelistingInfoText=");
        AbstractC11266d.m30444B(sbM32001t, this.f127423Y, ", whyInfoLabel=", this.f127424Z, ", whyInfoText=");
        return AbstractC11266d.m30464r(sbM32001t, this.f127425a0, ", transStatus=", this.f127426b0, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f127427w);
        dest.writeString(this.f127428x);
        dest.writeString(this.f127429y);
        dest.writeString(this.f127430z);
        EnumC30905j enumC30905j = this.f127403E;
        if (enumC30905j == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC30905j.name());
        }
        dest.writeInt(this.f127404F ? 1 : 0);
        dest.writeString(this.f127405G);
        dest.writeString(this.f127406H);
        dest.writeString(this.f127407I);
        dest.writeString(this.f127408J);
        dest.writeInt(this.f127409K ? 1 : 0);
        List list = this.f127410L;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C30898c) it.next()).writeToParcel(dest, i13);
            }
        }
        dest.writeString(this.f127411M);
        dest.writeString(this.f127412N);
        C30899d c30899d = this.f127413O;
        if (c30899d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c30899d.writeToParcel(dest, i13);
        }
        List list2 = this.f127414P;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ((C30903h) it3.next()).writeToParcel(dest, i13);
            }
        }
        dest.writeString(this.f127415Q);
        dest.writeString(this.f127416R);
        dest.writeString(this.f127417S);
        dest.writeString(this.f127418T);
        C30899d c30899d2 = this.f127419U;
        if (c30899d2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c30899d2.writeToParcel(dest, i13);
        }
        dest.writeString(this.f127420V);
        this.f127421W.writeToParcel(dest, i13);
        dest.writeString(this.f127422X);
        dest.writeString(this.f127423Y);
        dest.writeString(this.f127424Z);
        dest.writeString(this.f127425a0);
        dest.writeString(this.f127426b0);
    }
}
