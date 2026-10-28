package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.l4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38888l4 extends AbstractC38838g4 {
    public static final Parcelable.Creator<C38888l4> CREATOR = new C38967u2(28);

    /* JADX INFO: renamed from: E */
    public final String f167395E;

    /* JADX INFO: renamed from: F */
    public final String f167396F;

    /* JADX INFO: renamed from: G */
    public final C38878k4 f167397G;

    /* JADX INFO: renamed from: H */
    public final String f167398H;

    /* JADX INFO: renamed from: w */
    public final EnumC38848h4 f167399w;

    /* JADX INFO: renamed from: x */
    public final EnumC38868j4 f167400x;

    /* JADX INFO: renamed from: y */
    public final String f167401y;

    /* JADX INFO: renamed from: z */
    public final String f167402z;

    public C38888l4(EnumC38848h4 accountHolderType, EnumC38868j4 accountType, String str, String str2, String str3, String str4, C38878k4 c38878k4, String str5) {
        AbstractC22676k.m65750j(accountHolderType, "accountHolderType");
        AbstractC22676k.m65750j(accountType, "accountType");
        this.f167399w = accountHolderType;
        this.f167400x = accountType;
        this.f167401y = str;
        this.f167402z = str2;
        this.f167395E = str3;
        this.f167396F = str4;
        this.f167397G = c38878k4;
        this.f167398H = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38888l4)) {
            return false;
        }
        C38888l4 c38888l4 = (C38888l4) obj;
        return this.f167399w == c38888l4.f167399w && this.f167400x == c38888l4.f167400x && AbstractC22676k.m65745e(this.f167401y, c38888l4.f167401y) && AbstractC22676k.m65745e(this.f167402z, c38888l4.f167402z) && AbstractC22676k.m65745e(this.f167395E, c38888l4.f167395E) && AbstractC22676k.m65745e(this.f167396F, c38888l4.f167396F) && AbstractC22676k.m65745e(this.f167397G, c38888l4.f167397G) && AbstractC22676k.m65745e(this.f167398H, c38888l4.f167398H);
    }

    public final int hashCode() {
        int iHashCode = (this.f167400x.hashCode() + (this.f167399w.hashCode() * 31)) * 31;
        String str = this.f167401y;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167402z;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167395E;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167396F;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C38878k4 c38878k4 = this.f167397G;
        int iHashCode6 = (iHashCode5 + (c38878k4 == null ? 0 : c38878k4.hashCode())) * 31;
        String str5 = this.f167398H;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("USBankAccount(accountHolderType=");
        sb4.append(this.f167399w);
        sb4.append(", accountType=");
        sb4.append(this.f167400x);
        sb4.append(", bankName=");
        AbstractC11266d.m30444B(sb4, this.f167401y, ", fingerprint=", this.f167402z, ", last4=");
        AbstractC11266d.m30444B(sb4, this.f167395E, ", financialConnectionsAccount=", this.f167396F, ", networks=");
        sb4.append(this.f167397G);
        sb4.append(", routingNumber=");
        sb4.append(this.f167398H);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f167399w.writeToParcel(dest, i13);
        this.f167400x.writeToParcel(dest, i13);
        dest.writeString(this.f167401y);
        dest.writeString(this.f167402z);
        dest.writeString(this.f167395E);
        dest.writeString(this.f167396F);
        C38878k4 c38878k4 = this.f167397G;
        if (c38878k4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38878k4.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167398H);
    }
}
