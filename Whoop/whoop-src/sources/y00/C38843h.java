package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p565vy.InterfaceC36562b;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C38843h implements InterfaceC36562b, Parcelable {
    public static final Parcelable.Creator<C38843h> CREATOR = new C37677f(29);

    /* JADX INFO: renamed from: E */
    public final String f167195E;

    /* JADX INFO: renamed from: F */
    public final String f167196F;

    /* JADX INFO: renamed from: G */
    public final String f167197G;

    /* JADX INFO: renamed from: H */
    public final String f167198H;

    /* JADX INFO: renamed from: I */
    public final String f167199I;

    /* JADX INFO: renamed from: J */
    public final String f167200J;

    /* JADX INFO: renamed from: K */
    public final String f167201K;

    /* JADX INFO: renamed from: L */
    public final String f167202L;

    /* JADX INFO: renamed from: M */
    public final EnumC38853i f167203M;

    /* JADX INFO: renamed from: N */
    public final EnumC38863j f167204N;

    /* JADX INFO: renamed from: O */
    public final String f167205O;

    /* JADX INFO: renamed from: P */
    public final String f167206P;

    /* JADX INFO: renamed from: Q */
    public final String f167207Q;

    /* JADX INFO: renamed from: R */
    public final String f167208R;

    /* JADX INFO: renamed from: S */
    public final String f167209S;

    /* JADX INFO: renamed from: T */
    public final String f167210T;

    /* JADX INFO: renamed from: U */
    public final EnumC38852h8 f167211U;

    /* JADX INFO: renamed from: w */
    public final Integer f167212w;

    /* JADX INFO: renamed from: x */
    public final Integer f167213x;

    /* JADX INFO: renamed from: y */
    public final String f167214y;

    /* JADX INFO: renamed from: z */
    public final String f167215z;

    public C38843h(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, EnumC38853i brand, EnumC38863j enumC38863j, String str11, String str12, String str13, String str14, String str15, String str16, EnumC38852h8 enumC38852h8) {
        AbstractC22676k.m65750j(brand, "brand");
        this.f167212w = num;
        this.f167213x = num2;
        this.f167214y = str;
        this.f167215z = str2;
        this.f167195E = str3;
        this.f167196F = str4;
        this.f167197G = str5;
        this.f167198H = str6;
        this.f167199I = str7;
        this.f167200J = str8;
        this.f167201K = str9;
        this.f167202L = str10;
        this.f167203M = brand;
        this.f167204N = enumC38863j;
        this.f167205O = str11;
        this.f167206P = str12;
        this.f167207Q = str13;
        this.f167208R = str14;
        this.f167209S = str15;
        this.f167210T = str16;
        this.f167211U = enumC38852h8;
    }

    /* JADX INFO: renamed from: b */
    public final EnumC38853i m124351b() {
        return this.f167203M;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38843h)) {
            return false;
        }
        C38843h c38843h = (C38843h) obj;
        return AbstractC22676k.m65745e(this.f167212w, c38843h.f167212w) && AbstractC22676k.m65745e(this.f167213x, c38843h.f167213x) && AbstractC22676k.m65745e(this.f167214y, c38843h.f167214y) && AbstractC22676k.m65745e(this.f167215z, c38843h.f167215z) && AbstractC22676k.m65745e(this.f167195E, c38843h.f167195E) && AbstractC22676k.m65745e(this.f167196F, c38843h.f167196F) && AbstractC22676k.m65745e(this.f167197G, c38843h.f167197G) && AbstractC22676k.m65745e(this.f167198H, c38843h.f167198H) && AbstractC22676k.m65745e(this.f167199I, c38843h.f167199I) && AbstractC22676k.m65745e(this.f167200J, c38843h.f167200J) && AbstractC22676k.m65745e(this.f167201K, c38843h.f167201K) && AbstractC22676k.m65745e(this.f167202L, c38843h.f167202L) && this.f167203M == c38843h.f167203M && this.f167204N == c38843h.f167204N && AbstractC22676k.m65745e(this.f167205O, c38843h.f167205O) && AbstractC22676k.m65745e(this.f167206P, c38843h.f167206P) && AbstractC22676k.m65745e(this.f167207Q, c38843h.f167207Q) && AbstractC22676k.m65745e(this.f167208R, c38843h.f167208R) && AbstractC22676k.m65745e(this.f167209S, c38843h.f167209S) && AbstractC22676k.m65745e(this.f167210T, c38843h.f167210T) && this.f167211U == c38843h.f167211U;
    }

    public final int hashCode() {
        Integer num = this.f167212w;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f167213x;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f167214y;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167215z;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167195E;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167196F;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167197G;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f167198H;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f167199I;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f167200J;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f167201K;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f167202L;
        int iHashCode12 = (this.f167203M.hashCode() + ((iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31)) * 31;
        EnumC38863j enumC38863j = this.f167204N;
        int iHashCode13 = (iHashCode12 + (enumC38863j == null ? 0 : enumC38863j.hashCode())) * 31;
        String str11 = this.f167205O;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f167206P;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f167207Q;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f167208R;
        int iHashCode17 = (iHashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f167209S;
        int iHashCode18 = (iHashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f167210T;
        int iHashCode19 = (iHashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        EnumC38852h8 enumC38852h8 = this.f167211U;
        return iHashCode19 + (enumC38852h8 != null ? enumC38852h8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM114684l = AbstractC36095b.m114684l("Card(expMonth=", this.f167212w, ", expYear=", this.f167213x, ", name=");
        AbstractC11266d.m30444B(sbM114684l, this.f167214y, ", addressLine1=", this.f167215z, ", addressLine1Check=");
        AbstractC11266d.m30444B(sbM114684l, this.f167195E, ", addressLine2=", this.f167196F, ", addressCity=");
        AbstractC11266d.m30444B(sbM114684l, this.f167197G, ", addressState=", this.f167198H, ", addressZip=");
        AbstractC11266d.m30444B(sbM114684l, this.f167199I, ", addressZipCheck=", this.f167200J, ", addressCountry=");
        AbstractC11266d.m30444B(sbM114684l, this.f167201K, ", last4=", this.f167202L, ", brand=");
        sbM114684l.append(this.f167203M);
        sbM114684l.append(", funding=");
        sbM114684l.append(this.f167204N);
        sbM114684l.append(", fingerprint=");
        AbstractC11266d.m30444B(sbM114684l, this.f167205O, ", country=", this.f167206P, ", currency=");
        AbstractC11266d.m30444B(sbM114684l, this.f167207Q, ", customerId=", this.f167208R, ", cvcCheck=");
        AbstractC11266d.m30444B(sbM114684l, this.f167209S, ", id=", this.f167210T, ", tokenizationMethod=");
        sbM114684l.append(this.f167211U);
        sbM114684l.append(")");
        return sbM114684l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Integer num = this.f167212w;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.f167213x;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        dest.writeString(this.f167214y);
        dest.writeString(this.f167215z);
        dest.writeString(this.f167195E);
        dest.writeString(this.f167196F);
        dest.writeString(this.f167197G);
        dest.writeString(this.f167198H);
        dest.writeString(this.f167199I);
        dest.writeString(this.f167200J);
        dest.writeString(this.f167201K);
        dest.writeString(this.f167202L);
        dest.writeString(this.f167203M.name());
        EnumC38863j enumC38863j = this.f167204N;
        if (enumC38863j == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38863j.name());
        }
        dest.writeString(this.f167205O);
        dest.writeString(this.f167206P);
        dest.writeString(this.f167207Q);
        dest.writeString(this.f167208R);
        dest.writeString(this.f167209S);
        dest.writeString(this.f167210T);
        EnumC38852h8 enumC38852h8 = this.f167211U;
        if (enumC38852h8 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38852h8.name());
        }
    }
}
