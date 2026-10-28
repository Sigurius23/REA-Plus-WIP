package p345nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import mn.C25704b;
import p309lo.AbstractC24567y;
import p465rm.C31548l0;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: nn.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C26850a extends AbstractC26858i {
    public static final Parcelable.Creator<C26850a> CREATOR = new C25704b(5);

    /* JADX INFO: renamed from: E */
    public final byte[] f107152E;

    /* JADX INFO: renamed from: x */
    public final String f107153x;

    /* JADX INFO: renamed from: y */
    public final String f107154y;

    /* JADX INFO: renamed from: z */
    public final int f107155z;

    public C26850a(String str, String str2, int i13, byte[] bArr) {
        super("APIC");
        this.f107153x = str;
        this.f107154y = str2;
        this.f107155z = i13;
        this.f107152E = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26850a.class == obj.getClass()) {
            C26850a c26850a = (C26850a) obj;
            if (this.f107155z == c26850a.f107155z && AbstractC24567y.m71670a(this.f107153x, c26850a.f107153x) && AbstractC24567y.m71670a(this.f107154y, c26850a.f107154y) && Arrays.equals(this.f107152E, c26850a.f107152E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = (527 + this.f107155z) * 31;
        String str = this.f107153x;
        int iHashCode = (i13 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f107154y;
        return Arrays.hashCode(this.f107152E) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p345nn.AbstractC26858i
    public final String toString() {
        String str = this.f107177w;
        int iM91832b = AbstractC30007c.m91832b(25, str);
        String str2 = this.f107153x;
        int iM91832b2 = AbstractC30007c.m91832b(iM91832b, str2);
        String str3 = this.f107154y;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b2, str3));
        sb4.append(str);
        sb4.append(": mimeType=");
        sb4.append(str2);
        sb4.append(", description=");
        sb4.append(str3);
        return sb4.toString();
    }

    @Override // in.InterfaceC18714b
    /* JADX INFO: renamed from: w */
    public final void mo54416w(C31548l0 c31548l0) {
        c31548l0.m97148a(this.f107155z, this.f107152E);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f107153x);
        parcel.writeString(this.f107154y);
        parcel.writeInt(this.f107155z);
        parcel.writeByteArray(this.f107152E);
    }

    public C26850a(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f107153x = string;
        this.f107154y = parcel.readString();
        this.f107155z = parcel.readInt();
        this.f107152E = parcel.createByteArray();
    }
}
