package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.b5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38789b5 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38789b5> CREATOR = new C38858i4(16);

    /* JADX INFO: renamed from: E */
    public final EnumC38848h4 f166946E;

    /* JADX INFO: renamed from: w */
    public final String f166947w;

    /* JADX INFO: renamed from: x */
    public final String f166948x;

    /* JADX INFO: renamed from: y */
    public final String f166949y;

    /* JADX INFO: renamed from: z */
    public final EnumC38868j4 f166950z;

    public C38789b5(String str, String str2, String str3, EnumC38868j4 enumC38868j4, EnumC38848h4 enumC38848h4) {
        this.f166947w = str;
        this.f166948x = str2;
        this.f166949y = str3;
        this.f166950z = enumC38868j4;
        this.f166946E = enumC38848h4;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        String str = this.f166947w;
        if (str != null) {
            AbstractC22676k.m65747g(str);
            return AbstractC25247g0.m73989X(new C23465k("link_account_session", str));
        }
        String str2 = this.f166948x;
        AbstractC22676k.m65747g(str2);
        C23465k c23465k = new C23465k("account_number", str2);
        String str3 = this.f166949y;
        AbstractC22676k.m65747g(str3);
        C23465k c23465k2 = new C23465k("routing_number", str3);
        EnumC38868j4 enumC38868j4 = this.f166950z;
        AbstractC22676k.m65747g(enumC38868j4);
        C23465k c23465k3 = new C23465k("account_type", enumC38868j4.f167311w);
        EnumC38848h4 enumC38848h4 = this.f166946E;
        AbstractC22676k.m65747g(enumC38848h4);
        return AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, new C23465k("account_holder_type", enumC38848h4.f167225w));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38789b5)) {
            return false;
        }
        C38789b5 c38789b5 = (C38789b5) obj;
        return AbstractC22676k.m65745e(this.f166947w, c38789b5.f166947w) && AbstractC22676k.m65745e(this.f166948x, c38789b5.f166948x) && AbstractC22676k.m65745e(this.f166949y, c38789b5.f166949y) && this.f166950z == c38789b5.f166950z && this.f166946E == c38789b5.f166946E;
    }

    public final int hashCode() {
        String str = this.f166947w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f166948x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f166949y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EnumC38868j4 enumC38868j4 = this.f166950z;
        int iHashCode4 = (iHashCode3 + (enumC38868j4 == null ? 0 : enumC38868j4.hashCode())) * 31;
        EnumC38848h4 enumC38848h4 = this.f166946E;
        return iHashCode4 + (enumC38848h4 != null ? enumC38848h4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("USBankAccount(linkAccountSessionId=", this.f166947w, ", accountNumber=", this.f166948x, ", routingNumber=");
        sbM32001t.append(this.f166949y);
        sbM32001t.append(", accountType=");
        sbM32001t.append(this.f166950z);
        sbM32001t.append(", accountHolderType=");
        sbM32001t.append(this.f166946E);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166947w);
        dest.writeString(this.f166948x);
        dest.writeString(this.f166949y);
        EnumC38868j4 enumC38868j4 = this.f166950z;
        if (enumC38868j4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            enumC38868j4.writeToParcel(dest, i13);
        }
        EnumC38848h4 enumC38848h4 = this.f166946E;
        if (enumC38848h4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            enumC38848h4.writeToParcel(dest, i13);
        }
    }
}
