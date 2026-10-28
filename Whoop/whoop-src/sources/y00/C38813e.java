package y00;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.BankAccount$Status;
import com.stripe.android.model.BankAccount$Type;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C38813e implements InterfaceC36562b, Parcelable {
    public static final Parcelable.Creator<C38813e> CREATOR = new C37677f(27);

    /* JADX INFO: renamed from: E */
    public final String f167043E;

    /* JADX INFO: renamed from: F */
    public final String f167044F;

    /* JADX INFO: renamed from: G */
    public final String f167045G;

    /* JADX INFO: renamed from: H */
    public final String f167046H;

    /* JADX INFO: renamed from: I */
    public final String f167047I;

    /* JADX INFO: renamed from: J */
    public final BankAccount$Status f167048J;

    /* JADX INFO: renamed from: w */
    public final String f167049w;

    /* JADX INFO: renamed from: x */
    public final String f167050x;

    /* JADX INFO: renamed from: y */
    public final BankAccount$Type f167051y;

    /* JADX INFO: renamed from: z */
    public final String f167052z;

    public C38813e(String str, String str2, BankAccount$Type bankAccount$Type, String str3, String str4, String str5, String str6, String str7, String str8, BankAccount$Status bankAccount$Status) {
        this.f167049w = str;
        this.f167050x = str2;
        this.f167051y = bankAccount$Type;
        this.f167052z = str3;
        this.f167043E = str4;
        this.f167044F = str5;
        this.f167045G = str6;
        this.f167046H = str7;
        this.f167047I = str8;
        this.f167048J = bankAccount$Status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38813e)) {
            return false;
        }
        C38813e c38813e = (C38813e) obj;
        return AbstractC22676k.m65745e(this.f167049w, c38813e.f167049w) && AbstractC22676k.m65745e(this.f167050x, c38813e.f167050x) && this.f167051y == c38813e.f167051y && AbstractC22676k.m65745e(this.f167052z, c38813e.f167052z) && AbstractC22676k.m65745e(this.f167043E, c38813e.f167043E) && AbstractC22676k.m65745e(this.f167044F, c38813e.f167044F) && AbstractC22676k.m65745e(this.f167045G, c38813e.f167045G) && AbstractC22676k.m65745e(this.f167046H, c38813e.f167046H) && AbstractC22676k.m65745e(this.f167047I, c38813e.f167047I) && this.f167048J == c38813e.f167048J;
    }

    public final int hashCode() {
        String str = this.f167049w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167050x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BankAccount$Type bankAccount$Type = this.f167051y;
        int iHashCode3 = (iHashCode2 + (bankAccount$Type == null ? 0 : bankAccount$Type.hashCode())) * 31;
        String str3 = this.f167052z;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167043E;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167044F;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f167045G;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f167046H;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f167047I;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BankAccount$Status bankAccount$Status = this.f167048J;
        return iHashCode9 + (bankAccount$Status != null ? bankAccount$Status.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BankAccount(id=", this.f167049w, ", accountHolderName=", this.f167050x, ", accountHolderType=");
        sbM32001t.append(this.f167051y);
        sbM32001t.append(", bankName=");
        sbM32001t.append(this.f167052z);
        sbM32001t.append(", countryCode=");
        AbstractC11266d.m30444B(sbM32001t, this.f167043E, ", currency=", this.f167044F, ", fingerprint=");
        AbstractC11266d.m30444B(sbM32001t, this.f167045G, ", last4=", this.f167046H, ", routingNumber=");
        sbM32001t.append(this.f167047I);
        sbM32001t.append(", status=");
        sbM32001t.append(this.f167048J);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167049w);
        dest.writeString(this.f167050x);
        BankAccount$Type bankAccount$Type = this.f167051y;
        if (bankAccount$Type == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bankAccount$Type.name());
        }
        dest.writeString(this.f167052z);
        dest.writeString(this.f167043E);
        dest.writeString(this.f167044F);
        dest.writeString(this.f167045G);
        dest.writeString(this.f167046H);
        dest.writeString(this.f167047I);
        BankAccount$Status bankAccount$Status = this.f167048J;
        if (bankAccount$Status == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bankAccount$Status.name());
        }
    }
}
