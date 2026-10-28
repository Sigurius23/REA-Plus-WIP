package p345nn;

import android.os.Parcel;
import android.os.Parcelable;
import mn.C25704b;
import p000.AbstractC11266d;
import p309lo.AbstractC24567y;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: nn.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C26863n extends AbstractC26858i {
    public static final Parcelable.Creator<C26863n> CREATOR = new C25704b(15);

    /* JADX INFO: renamed from: x */
    public final String f107190x;

    /* JADX INFO: renamed from: y */
    public final String f107191y;

    public C26863n(String str, String str2, String str3) {
        super(str);
        this.f107190x = str2;
        this.f107191y = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26863n.class == obj.getClass()) {
            C26863n c26863n = (C26863n) obj;
            if (this.f107177w.equals(c26863n.f107177w) && AbstractC24567y.m71670a(this.f107190x, c26863n.f107190x) && AbstractC24567y.m71670a(this.f107191y, c26863n.f107191y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(527, 31, this.f107177w);
        String str = this.f107190x;
        int iHashCode = (iM30450d + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f107191y;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p345nn.AbstractC26858i
    public final String toString() {
        String str = this.f107177w;
        int iM91832b = AbstractC30007c.m91832b(6, str);
        String str2 = this.f107191y;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b, str2));
        sb4.append(str);
        sb4.append(": url=");
        sb4.append(str2);
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f107177w);
        parcel.writeString(this.f107190x);
        parcel.writeString(this.f107191y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C26863n(Parcel parcel) {
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        super(string);
        this.f107190x = parcel.readString();
        this.f107191y = parcel.readString();
    }
}
