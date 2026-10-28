package p345nn;

import android.os.Parcel;
import android.os.Parcelable;
import mn.C25704b;
import p309lo.AbstractC24567y;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: nn.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C26854e extends AbstractC26858i {
    public static final Parcelable.Creator<C26854e> CREATOR = new C25704b(9);

    /* JADX INFO: renamed from: x */
    public final String f107168x;

    /* JADX INFO: renamed from: y */
    public final String f107169y;

    /* JADX INFO: renamed from: z */
    public final String f107170z;

    public C26854e(String str, String str2, String str3) {
        super("COMM");
        this.f107168x = str;
        this.f107169y = str2;
        this.f107170z = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26854e.class == obj.getClass()) {
            C26854e c26854e = (C26854e) obj;
            if (AbstractC24567y.m71670a(this.f107169y, c26854e.f107169y) && AbstractC24567y.m71670a(this.f107168x, c26854e.f107168x) && AbstractC24567y.m71670a(this.f107170z, c26854e.f107170z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f107168x;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f107169y;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f107170z;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p345nn.AbstractC26858i
    public final String toString() {
        String str = this.f107177w;
        int iM91832b = AbstractC30007c.m91832b(25, str);
        String str2 = this.f107168x;
        int iM91832b2 = AbstractC30007c.m91832b(iM91832b, str2);
        String str3 = this.f107169y;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b2, str3));
        sb4.append(str);
        sb4.append(": language=");
        sb4.append(str2);
        sb4.append(", description=");
        sb4.append(str3);
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f107177w);
        parcel.writeString(this.f107168x);
        parcel.writeString(this.f107170z);
    }

    public C26854e(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f107168x = string;
        this.f107169y = parcel.readString();
        this.f107170z = parcel.readString();
    }
}
