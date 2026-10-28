package y00;

import a10.AbstractC0122j;
import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: y00.z3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39013z3 extends AbstractC38838g4 {
    public static final Parcelable.Creator<C39013z3> CREATOR = new C38967u2(18);

    /* JADX INFO: renamed from: E */
    public final Integer f167910E;

    /* JADX INFO: renamed from: F */
    public final String f167911F;

    /* JADX INFO: renamed from: G */
    public final String f167912G;

    /* JADX INFO: renamed from: H */
    public final String f167913H;

    /* JADX INFO: renamed from: I */
    public final C39004y3 f167914I;

    /* JADX INFO: renamed from: J */
    public final AbstractC0122j f167915J;

    /* JADX INFO: renamed from: K */
    public final C38995x3 f167916K;

    /* JADX INFO: renamed from: L */
    public final String f167917L;

    /* JADX INFO: renamed from: w */
    public final EnumC38853i f167918w;

    /* JADX INFO: renamed from: x */
    public final C38986w3 f167919x;

    /* JADX INFO: renamed from: y */
    public final String f167920y;

    /* JADX INFO: renamed from: z */
    public final Integer f167921z;

    public C39013z3(EnumC38853i brand, C38986w3 c38986w3, String str, Integer num, Integer num2, String str2, String str3, String str4, C39004y3 c39004y3, AbstractC0122j abstractC0122j, C38995x3 c38995x3, String str5) {
        AbstractC22676k.m65750j(brand, "brand");
        this.f167918w = brand;
        this.f167919x = c38986w3;
        this.f167920y = str;
        this.f167921z = num;
        this.f167910E = num2;
        this.f167911F = str2;
        this.f167912G = str3;
        this.f167913H = str4;
        this.f167914I = c39004y3;
        this.f167915J = abstractC0122j;
        this.f167916K = c38995x3;
        this.f167917L = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39013z3)) {
            return false;
        }
        C39013z3 c39013z3 = (C39013z3) obj;
        return this.f167918w == c39013z3.f167918w && AbstractC22676k.m65745e(this.f167919x, c39013z3.f167919x) && AbstractC22676k.m65745e(this.f167920y, c39013z3.f167920y) && AbstractC22676k.m65745e(this.f167921z, c39013z3.f167921z) && AbstractC22676k.m65745e(this.f167910E, c39013z3.f167910E) && AbstractC22676k.m65745e(this.f167911F, c39013z3.f167911F) && AbstractC22676k.m65745e(this.f167912G, c39013z3.f167912G) && AbstractC22676k.m65745e(this.f167913H, c39013z3.f167913H) && AbstractC22676k.m65745e(this.f167914I, c39013z3.f167914I) && AbstractC22676k.m65745e(this.f167915J, c39013z3.f167915J) && AbstractC22676k.m65745e(this.f167916K, c39013z3.f167916K) && AbstractC22676k.m65745e(this.f167917L, c39013z3.f167917L);
    }

    public final int hashCode() {
        int iHashCode = this.f167918w.hashCode() * 31;
        C38986w3 c38986w3 = this.f167919x;
        int iHashCode2 = (iHashCode + (c38986w3 == null ? 0 : c38986w3.hashCode())) * 31;
        String str = this.f167920y;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f167921z;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f167910E;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f167911F;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167912G;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167913H;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C39004y3 c39004y3 = this.f167914I;
        int iHashCode9 = (iHashCode8 + (c39004y3 == null ? 0 : Boolean.hashCode(c39004y3.f167887w))) * 31;
        AbstractC0122j abstractC0122j = this.f167915J;
        int iHashCode10 = (iHashCode9 + (abstractC0122j == null ? 0 : abstractC0122j.hashCode())) * 31;
        C38995x3 c38995x3 = this.f167916K;
        int iHashCode11 = (iHashCode10 + (c38995x3 == null ? 0 : c38995x3.hashCode())) * 31;
        String str5 = this.f167917L;
        return iHashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Card(brand=");
        sb4.append(this.f167918w);
        sb4.append(", checks=");
        sb4.append(this.f167919x);
        sb4.append(", country=");
        AbstractC30007c.m91853w(this.f167921z, this.f167920y, ", expiryMonth=", ", expiryYear=", sb4);
        AbstractC13673n.m38577x(this.f167910E, ", fingerprint=", this.f167911F, ", funding=", sb4);
        AbstractC11266d.m30444B(sb4, this.f167912G, ", last4=", this.f167913H, ", threeDSecureUsage=");
        sb4.append(this.f167914I);
        sb4.append(", wallet=");
        sb4.append(this.f167915J);
        sb4.append(", networks=");
        sb4.append(this.f167916K);
        sb4.append(", displayBrand=");
        sb4.append(this.f167917L);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167918w.name());
        C38986w3 c38986w3 = this.f167919x;
        if (c38986w3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38986w3.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167920y);
        Integer num = this.f167921z;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.f167910E;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        dest.writeString(this.f167911F);
        dest.writeString(this.f167912G);
        dest.writeString(this.f167913H);
        C39004y3 c39004y3 = this.f167914I;
        if (c39004y3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c39004y3.writeToParcel(dest, i13);
        }
        dest.writeParcelable(this.f167915J, i13);
        C38995x3 c38995x3 = this.f167916K;
        if (c38995x3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38995x3.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167917L);
    }

    public /* synthetic */ C39013z3(String str, EnumC38853i enumC38853i) {
        this(enumC38853i, null, null, null, null, null, null, str, null, null, null, null);
    }
}
