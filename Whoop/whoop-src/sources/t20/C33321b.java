package t20;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C33321b implements Parcelable {
    public static final Parcelable.Creator<C33321b> CREATOR = new C33320a(1);

    /* JADX INFO: renamed from: E */
    public final String f138995E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC41211c f138996F;

    /* JADX INFO: renamed from: G */
    public final boolean f138997G;

    /* JADX INFO: renamed from: H */
    public final boolean f138998H;

    /* JADX INFO: renamed from: w */
    public final InterfaceC33325f f138999w;

    /* JADX INFO: renamed from: x */
    public final String f139000x;

    /* JADX INFO: renamed from: y */
    public final String f139001y;

    /* JADX INFO: renamed from: z */
    public final String f139002z;

    public C33321b(InterfaceC33325f resultIdentifier, String str, String str2, String str3, String str4, InterfaceC41211c interfaceC41211c, boolean z4, boolean z13) {
        AbstractC22676k.m65750j(resultIdentifier, "resultIdentifier");
        this.f138999w = resultIdentifier;
        this.f139000x = str;
        this.f139001y = str2;
        this.f139002z = str3;
        this.f138995E = str4;
        this.f138996F = interfaceC41211c;
        this.f138997G = z4;
        this.f138998H = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33321b)) {
            return false;
        }
        C33321b c33321b = (C33321b) obj;
        return AbstractC22676k.m65745e(this.f138999w, c33321b.f138999w) && AbstractC22676k.m65745e(this.f139000x, c33321b.f139000x) && AbstractC22676k.m65745e(this.f139001y, c33321b.f139001y) && AbstractC22676k.m65745e(this.f139002z, c33321b.f139002z) && AbstractC22676k.m65745e(this.f138995E, c33321b.f138995E) && AbstractC22676k.m65745e(this.f138996F, c33321b.f138996F) && this.f138997G == c33321b.f138997G && this.f138998H == c33321b.f138998H;
    }

    public final int hashCode() {
        int iHashCode = this.f138999w.hashCode() * 31;
        String str = this.f139000x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f139001y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f139002z;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f138995E;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        InterfaceC41211c interfaceC41211c = this.f138996F;
        return Boolean.hashCode(this.f138998H) + AbstractC2875y.m8289b((iHashCode5 + (interfaceC41211c != null ? interfaceC41211c.hashCode() : 0)) * 31, 31, this.f138997G);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LinkedBankAccount(resultIdentifier=");
        sb4.append(this.f138999w);
        sb4.append(", bankName=");
        sb4.append(this.f139000x);
        sb4.append(", last4=");
        AbstractC11266d.m30444B(sb4, this.f139001y, ", intentId=", this.f139002z, ", financialConnectionsSessionId=");
        sb4.append(this.f138995E);
        sb4.append(", mandateText=");
        sb4.append(this.f138996F);
        sb4.append(", isVerifyingWithMicrodeposits=");
        return AbstractC36095b.m114682j(sb4, this.f138997G, ", eligibleForIncentive=", this.f138998H, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f138999w, i13);
        dest.writeString(this.f139000x);
        dest.writeString(this.f139001y);
        dest.writeString(this.f139002z);
        dest.writeString(this.f138995E);
        dest.writeParcelable(this.f138996F, i13);
        dest.writeInt(this.f138997G ? 1 : 0);
        dest.writeInt(this.f138998H ? 1 : 0);
    }
}
