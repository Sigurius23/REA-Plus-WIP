package p345nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import mn.C25704b;
import p309lo.AbstractC24567y;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: nn.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C26861l extends AbstractC26858i {
    public static final Parcelable.Creator<C26861l> CREATOR = new C25704b(13);

    /* JADX INFO: renamed from: x */
    public final String f107186x;

    /* JADX INFO: renamed from: y */
    public final byte[] f107187y;

    public C26861l(String str, byte[] bArr) {
        super("PRIV");
        this.f107186x = str;
        this.f107187y = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26861l.class == obj.getClass()) {
            C26861l c26861l = (C26861l) obj;
            if (AbstractC24567y.m71670a(this.f107186x, c26861l.f107186x) && Arrays.equals(this.f107187y, c26861l.f107187y)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f107186x;
        return Arrays.hashCode(this.f107187y) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p345nn.AbstractC26858i
    public final String toString() {
        String str = this.f107177w;
        int iM91832b = AbstractC30007c.m91832b(8, str);
        String str2 = this.f107186x;
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(iM91832b, str2));
        sb4.append(str);
        sb4.append(": owner=");
        sb4.append(str2);
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f107186x);
        parcel.writeByteArray(this.f107187y);
    }

    public C26861l(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f107186x = string;
        this.f107187y = parcel.createByteArray();
    }
}
