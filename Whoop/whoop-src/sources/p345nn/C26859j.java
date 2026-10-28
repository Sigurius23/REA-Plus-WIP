package p345nn;

import android.os.Parcel;
import android.os.Parcelable;
import mn.C25704b;
import p309lo.AbstractC24567y;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: nn.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C26859j extends AbstractC26858i {
    public static final Parcelable.Creator<C26859j> CREATOR = new C25704b(11);

    /* JADX INFO: renamed from: x */
    public final String f107178x;

    /* JADX INFO: renamed from: y */
    public final String f107179y;

    /* JADX INFO: renamed from: z */
    public final String f107180z;

    public C26859j(String str, String str2, String str3) {
        super("----");
        this.f107178x = str;
        this.f107179y = str2;
        this.f107180z = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26859j.class == obj.getClass()) {
            C26859j c26859j = (C26859j) obj;
            if (AbstractC24567y.m71670a(this.f107179y, c26859j.f107179y) && AbstractC24567y.m71670a(this.f107178x, c26859j.f107178x) && AbstractC24567y.m71670a(this.f107180z, c26859j.f107180z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f107178x;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f107179y;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f107180z;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p345nn.AbstractC26858i
    public final String toString() {
        String str = this.f107177w;
        int iM91832b = AbstractC30007c.m91832b(23, str);
        String str2 = this.f107178x;
        int iM91832b2 = AbstractC30007c.m91832b(iM91832b, str2);
        String str3 = this.f107179y;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b2, str3));
        sb4.append(str);
        sb4.append(": domain=");
        sb4.append(str2);
        sb4.append(", description=");
        sb4.append(str3);
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f107177w);
        parcel.writeString(this.f107178x);
        parcel.writeString(this.f107180z);
    }

    public C26859j(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f107178x = string;
        this.f107179y = parcel.readString();
        this.f107180z = parcel.readString();
    }
}
