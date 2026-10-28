package p345nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import mn.C25704b;
import p031b9.AbstractC2875y;
import p309lo.AbstractC24567y;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: nn.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C26855f extends AbstractC26858i {
    public static final Parcelable.Creator<C26855f> CREATOR = new C25704b(10);

    /* JADX INFO: renamed from: E */
    public final byte[] f107171E;

    /* JADX INFO: renamed from: x */
    public final String f107172x;

    /* JADX INFO: renamed from: y */
    public final String f107173y;

    /* JADX INFO: renamed from: z */
    public final String f107174z;

    public C26855f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f107172x = str;
        this.f107173y = str2;
        this.f107174z = str3;
        this.f107171E = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26855f.class == obj.getClass()) {
            C26855f c26855f = (C26855f) obj;
            if (AbstractC24567y.m71670a(this.f107172x, c26855f.f107172x) && AbstractC24567y.m71670a(this.f107173y, c26855f.f107173y) && AbstractC24567y.m71670a(this.f107174z, c26855f.f107174z) && Arrays.equals(this.f107171E, c26855f.f107171E)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f107172x;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f107173y;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f107174z;
        return Arrays.hashCode(this.f107171E) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p345nn.AbstractC26858i
    public final String toString() {
        String str = this.f107177w;
        int iM91832b = AbstractC30007c.m91832b(36, str);
        String str2 = this.f107172x;
        int iM91832b2 = AbstractC30007c.m91832b(iM91832b, str2);
        String str3 = this.f107173y;
        int iM91832b3 = AbstractC30007c.m91832b(iM91832b2, str3);
        String str4 = this.f107174z;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b3, str4));
        sb4.append(str);
        sb4.append(": mimeType=");
        sb4.append(str2);
        sb4.append(", filename=");
        return AbstractC2875y.m8304q(sb4, str3, ", description=", str4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f107172x);
        parcel.writeString(this.f107173y);
        parcel.writeString(this.f107174z);
        parcel.writeByteArray(this.f107171E);
    }

    public C26855f(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f107172x = string;
        this.f107173y = parcel.readString();
        this.f107174z = parcel.readString();
        this.f107171E = parcel.createByteArray();
    }
}
