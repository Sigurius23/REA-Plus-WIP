package p345nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import mn.C25704b;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: nn.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C26853d extends AbstractC26858i {
    public static final Parcelable.Creator<C26853d> CREATOR = new C25704b(8);

    /* JADX INFO: renamed from: E */
    public final String[] f107163E;

    /* JADX INFO: renamed from: F */
    public final AbstractC26858i[] f107164F;

    /* JADX INFO: renamed from: x */
    public final String f107165x;

    /* JADX INFO: renamed from: y */
    public final boolean f107166y;

    /* JADX INFO: renamed from: z */
    public final boolean f107167z;

    public C26853d(String str, boolean z4, boolean z13, String[] strArr, AbstractC26858i[] abstractC26858iArr) {
        super("CTOC");
        this.f107165x = str;
        this.f107166y = z4;
        this.f107167z = z13;
        this.f107163E = strArr;
        this.f107164F = abstractC26858iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26853d.class == obj.getClass()) {
            C26853d c26853d = (C26853d) obj;
            if (this.f107166y == c26853d.f107166y && this.f107167z == c26853d.f107167z && AbstractC24567y.m71670a(this.f107165x, c26853d.f107165x) && Arrays.equals(this.f107163E, c26853d.f107163E) && Arrays.equals(this.f107164F, c26853d.f107164F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = (((527 + (this.f107166y ? 1 : 0)) * 31) + (this.f107167z ? 1 : 0)) * 31;
        String str = this.f107165x;
        return i13 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f107165x);
        parcel.writeByte(this.f107166y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f107167z ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f107163E);
        AbstractC26858i[] abstractC26858iArr = this.f107164F;
        parcel.writeInt(abstractC26858iArr.length);
        for (AbstractC26858i abstractC26858i : abstractC26858iArr) {
            parcel.writeParcelable(abstractC26858i, 0);
        }
    }

    public C26853d(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f107165x = string;
        this.f107166y = parcel.readByte() != 0;
        this.f107167z = parcel.readByte() != 0;
        this.f107163E = parcel.createStringArray();
        int i14 = parcel.readInt();
        this.f107164F = new AbstractC26858i[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            this.f107164F[i15] = (AbstractC26858i) parcel.readParcelable(AbstractC26858i.class.getClassLoader());
        }
    }
}
