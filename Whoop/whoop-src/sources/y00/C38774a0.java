package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p547v8.AbstractC35785b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38774a0 extends AbstractC38794c0 {
    public static final Parcelable.Creator<C38774a0> CREATOR = new C38873k(12);

    /* JADX INFO: renamed from: E */
    public final boolean f166886E;

    /* JADX INFO: renamed from: F */
    public final String f166887F;

    /* JADX INFO: renamed from: G */
    public final C39000y f166888G;

    /* JADX INFO: renamed from: H */
    public final String f166889H;

    /* JADX INFO: renamed from: I */
    public final int f166890I;

    /* JADX INFO: renamed from: J */
    public final int f166891J;

    /* JADX INFO: renamed from: K */
    public final EnumC38853i f166892K;

    /* JADX INFO: renamed from: L */
    public final List f166893L;

    /* JADX INFO: renamed from: M */
    public final EnumC38974v0 f166894M;

    /* JADX INFO: renamed from: N */
    public final EnumC39009z f166895N;

    /* JADX INFO: renamed from: y */
    public final String f166896y;

    /* JADX INFO: renamed from: z */
    public final String f166897z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38774a0(String id4, String last4, boolean z4, String str, C39000y c39000y, String str2, int i13, int i14, EnumC38853i brand, List networks, EnumC38974v0 cvcCheck, EnumC39009z funding) {
        super(z4, "card");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(last4, "last4");
        AbstractC22676k.m65750j(brand, "brand");
        AbstractC22676k.m65750j(networks, "networks");
        AbstractC22676k.m65750j(cvcCheck, "cvcCheck");
        AbstractC22676k.m65750j(funding, "funding");
        this.f166896y = id4;
        this.f166897z = last4;
        this.f166886E = z4;
        this.f166887F = str;
        this.f166888G = c39000y;
        this.f166889H = str2;
        this.f166890I = i13;
        this.f166891J = i14;
        this.f166892K = brand;
        this.f166893L = networks;
        this.f166894M = cvcCheck;
        this.f166895N = funding;
    }

    /* JADX INFO: renamed from: i */
    public static C38774a0 m124308i(C38774a0 c38774a0, boolean z4, C39000y c39000y, String str, int i13) {
        String id4 = c38774a0.f166896y;
        String last4 = c38774a0.f166897z;
        if ((i13 & 4) != 0) {
            z4 = c38774a0.f166886E;
        }
        boolean z13 = z4;
        String str2 = c38774a0.f166887F;
        if ((i13 & 16) != 0) {
            c39000y = c38774a0.f166888G;
        }
        C39000y c39000y2 = c39000y;
        String str3 = (i13 & 32) != 0 ? c38774a0.f166889H : str;
        int i14 = c38774a0.f166890I;
        int i15 = c38774a0.f166891J;
        EnumC38853i brand = c38774a0.f166892K;
        List networks = c38774a0.f166893L;
        EnumC38974v0 cvcCheck = c38774a0.f166894M;
        EnumC39009z funding = c38774a0.f166895N;
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(last4, "last4");
        AbstractC22676k.m65750j(brand, "brand");
        AbstractC22676k.m65750j(networks, "networks");
        AbstractC22676k.m65750j(cvcCheck, "cvcCheck");
        AbstractC22676k.m65750j(funding, "funding");
        return new C38774a0(id4, last4, z13, str2, c39000y2, str3, i14, i15, brand, networks, cvcCheck, funding);
    }

    @Override // y00.AbstractC38794c0
    /* JADX INFO: renamed from: b */
    public final C39000y mo124309b() {
        return this.f166888G;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38774a0)) {
            return false;
        }
        C38774a0 c38774a0 = (C38774a0) obj;
        return AbstractC22676k.m65745e(this.f166896y, c38774a0.f166896y) && AbstractC22676k.m65745e(this.f166897z, c38774a0.f166897z) && this.f166886E == c38774a0.f166886E && AbstractC22676k.m65745e(this.f166887F, c38774a0.f166887F) && AbstractC22676k.m65745e(this.f166888G, c38774a0.f166888G) && AbstractC22676k.m65745e(this.f166889H, c38774a0.f166889H) && this.f166890I == c38774a0.f166890I && this.f166891J == c38774a0.f166891J && this.f166892K == c38774a0.f166892K && AbstractC22676k.m65745e(this.f166893L, c38774a0.f166893L) && this.f166894M == c38774a0.f166894M && this.f166895N == c38774a0.f166895N;
    }

    @Override // y00.AbstractC38794c0
    /* JADX INFO: renamed from: f */
    public final String mo124310f() {
        return this.f166889H;
    }

    @Override // y00.AbstractC38794c0
    public final String getId() {
        return this.f166896y;
    }

    @Override // y00.AbstractC38794c0
    /* JADX INFO: renamed from: h */
    public final boolean mo124311h() {
        return this.f166886E;
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.f166896y.hashCode() * 31, 31, this.f166897z), 31, this.f166886E);
        String str = this.f166887F;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        C39000y c39000y = this.f166888G;
        int iHashCode2 = (iHashCode + (c39000y == null ? 0 : c39000y.hashCode())) * 31;
        String str2 = this.f166889H;
        return this.f166895N.hashCode() + ((this.f166894M.hashCode() + AbstractC11895b.m31983b((this.f166892K.hashCode() + AbstractC11266d.m30448b(this.f166891J, AbstractC11266d.m30448b(this.f166890I, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31), 31)) * 31, 31, this.f166893L)) * 31);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m124312k() {
        return !AbstractC35785b.m113386I(this.f166891J, this.f166890I);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Card(id=", this.f166896y, ", last4=", this.f166897z, ", isDefault=");
        AbstractC38963t7.m124391u(sbM32001t, this.f166886E, ", nickname=", this.f166887F, ", billingAddress=");
        sbM32001t.append(this.f166888G);
        sbM32001t.append(", billingEmailAddress=");
        sbM32001t.append(this.f166889H);
        sbM32001t.append(", expiryYear=");
        AbstractC30802r.m94773v(sbM32001t, this.f166890I, ", expiryMonth=", this.f166891J, ", brand=");
        sbM32001t.append(this.f166892K);
        sbM32001t.append(", networks=");
        sbM32001t.append(this.f166893L);
        sbM32001t.append(", cvcCheck=");
        sbM32001t.append(this.f166894M);
        sbM32001t.append(", funding=");
        sbM32001t.append(this.f166895N);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166896y);
        dest.writeString(this.f166897z);
        dest.writeInt(this.f166886E ? 1 : 0);
        dest.writeString(this.f166887F);
        C39000y c39000y = this.f166888G;
        if (c39000y == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c39000y.writeToParcel(dest, i13);
        }
        dest.writeString(this.f166889H);
        dest.writeInt(this.f166890I);
        dest.writeInt(this.f166891J);
        dest.writeString(this.f166892K.name());
        dest.writeStringList(this.f166893L);
        dest.writeString(this.f166894M.name());
        dest.writeString(this.f166895N.name());
    }
}
