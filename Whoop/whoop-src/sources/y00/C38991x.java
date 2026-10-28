package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C38991x extends AbstractC38794c0 {
    public static final Parcelable.Creator<C38991x> CREATOR = new C38873k(10);

    /* JADX INFO: renamed from: E */
    public final boolean f167831E;

    /* JADX INFO: renamed from: F */
    public final String f167832F;

    /* JADX INFO: renamed from: G */
    public final String f167833G;

    /* JADX INFO: renamed from: H */
    public final String f167834H;

    /* JADX INFO: renamed from: I */
    public final C39000y f167835I;

    /* JADX INFO: renamed from: J */
    public final String f167836J;

    /* JADX INFO: renamed from: y */
    public final String f167837y;

    /* JADX INFO: renamed from: z */
    public final String f167838z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38991x(String id4, String last4, boolean z4, String str, String str2, String str3, C39000y c39000y, String str4) {
        super(z4, "bank_account");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(last4, "last4");
        this.f167837y = id4;
        this.f167838z = last4;
        this.f167831E = z4;
        this.f167832F = str;
        this.f167833G = str2;
        this.f167834H = str3;
        this.f167835I = c39000y;
        this.f167836J = str4;
    }

    /* JADX INFO: renamed from: i */
    public static C38991x m124404i(C38991x c38991x, boolean z4, C39000y c39000y, String str, int i13) {
        String id4 = c38991x.f167837y;
        String last4 = c38991x.f167838z;
        if ((i13 & 4) != 0) {
            z4 = c38991x.f167831E;
        }
        boolean z13 = z4;
        String str2 = c38991x.f167832F;
        String str3 = c38991x.f167833G;
        String str4 = c38991x.f167834H;
        if ((i13 & 64) != 0) {
            c39000y = c38991x.f167835I;
        }
        C39000y c39000y2 = c39000y;
        if ((i13 & 128) != 0) {
            str = c38991x.f167836J;
        }
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(last4, "last4");
        return new C38991x(id4, last4, z13, str2, str3, str4, c39000y2, str);
    }

    @Override // y00.AbstractC38794c0
    /* JADX INFO: renamed from: b */
    public final C39000y mo124309b() {
        return this.f167835I;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38991x)) {
            return false;
        }
        C38991x c38991x = (C38991x) obj;
        return AbstractC22676k.m65745e(this.f167837y, c38991x.f167837y) && AbstractC22676k.m65745e(this.f167838z, c38991x.f167838z) && this.f167831E == c38991x.f167831E && AbstractC22676k.m65745e(this.f167832F, c38991x.f167832F) && AbstractC22676k.m65745e(this.f167833G, c38991x.f167833G) && AbstractC22676k.m65745e(this.f167834H, c38991x.f167834H) && AbstractC22676k.m65745e(this.f167835I, c38991x.f167835I) && AbstractC22676k.m65745e(this.f167836J, c38991x.f167836J);
    }

    @Override // y00.AbstractC38794c0
    /* JADX INFO: renamed from: f */
    public final String mo124310f() {
        return this.f167836J;
    }

    @Override // y00.AbstractC38794c0
    public final String getId() {
        return this.f167837y;
    }

    @Override // y00.AbstractC38794c0
    /* JADX INFO: renamed from: h */
    public final boolean mo124311h() {
        return this.f167831E;
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.f167837y.hashCode() * 31, 31, this.f167838z), 31, this.f167831E);
        String str = this.f167832F;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167833G;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167834H;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C39000y c39000y = this.f167835I;
        int iHashCode4 = (iHashCode3 + (c39000y == null ? 0 : c39000y.hashCode())) * 31;
        String str4 = this.f167836J;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BankAccount(id=", this.f167837y, ", last4=", this.f167838z, ", isDefault=");
        AbstractC38963t7.m124391u(sbM32001t, this.f167831E, ", nickname=", this.f167832F, ", bankAccountName=");
        AbstractC11266d.m30444B(sbM32001t, this.f167833G, ", bankIconCode=", this.f167834H, ", billingAddress=");
        sbM32001t.append(this.f167835I);
        sbM32001t.append(", billingEmailAddress=");
        sbM32001t.append(this.f167836J);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167837y);
        dest.writeString(this.f167838z);
        dest.writeInt(this.f167831E ? 1 : 0);
        dest.writeString(this.f167832F);
        dest.writeString(this.f167833G);
        dest.writeString(this.f167834H);
        C39000y c39000y = this.f167835I;
        if (c39000y == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c39000y.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167836J);
    }
}
