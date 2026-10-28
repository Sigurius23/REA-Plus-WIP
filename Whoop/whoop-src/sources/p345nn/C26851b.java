package p345nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import mn.C25704b;
import p000.AbstractC11266d;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: nn.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C26851b extends AbstractC26858i {
    public static final Parcelable.Creator<C26851b> CREATOR = new C25704b(6);

    /* JADX INFO: renamed from: x */
    public final byte[] f107156x;

    public C26851b(String str, byte[] bArr) {
        super(str);
        this.f107156x = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26851b.class == obj.getClass()) {
            C26851b c26851b = (C26851b) obj;
            if (this.f107177w.equals(c26851b.f107177w) && Arrays.equals(this.f107156x, c26851b.f107156x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f107156x) + AbstractC11266d.m30450d(527, 31, this.f107177w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f107177w);
        parcel.writeByteArray(this.f107156x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C26851b(Parcel parcel) {
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        super(string);
        this.f107156x = parcel.createByteArray();
    }
}
