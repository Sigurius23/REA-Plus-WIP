package p345nn;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import mn.C25704b;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: nn.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C26860k extends AbstractC26858i {
    public static final Parcelable.Creator<C26860k> CREATOR = new C25704b(12);

    /* JADX INFO: renamed from: E */
    public final int[] f107181E;

    /* JADX INFO: renamed from: F */
    public final int[] f107182F;

    /* JADX INFO: renamed from: x */
    public final int f107183x;

    /* JADX INFO: renamed from: y */
    public final int f107184y;

    /* JADX INFO: renamed from: z */
    public final int f107185z;

    public C26860k(int i13, int i14, int[] iArr, int[] iArr2, int i15) {
        super("MLLT");
        this.f107183x = i13;
        this.f107184y = i14;
        this.f107185z = i15;
        this.f107181E = iArr;
        this.f107182F = iArr2;
    }

    @Override // p345nn.AbstractC26858i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C26860k.class == obj.getClass()) {
            C26860k c26860k = (C26860k) obj;
            if (this.f107183x == c26860k.f107183x && this.f107184y == c26860k.f107184y && this.f107185z == c26860k.f107185z && Arrays.equals(this.f107181E, c26860k.f107181E) && Arrays.equals(this.f107182F, c26860k.f107182F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f107182F) + ((Arrays.hashCode(this.f107181E) + ((((((527 + this.f107183x) * 31) + this.f107184y) * 31) + this.f107185z) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f107183x);
        parcel.writeInt(this.f107184y);
        parcel.writeInt(this.f107185z);
        parcel.writeIntArray(this.f107181E);
        parcel.writeIntArray(this.f107182F);
    }

    public C26860k(Parcel parcel) {
        super("MLLT");
        this.f107183x = parcel.readInt();
        this.f107184y = parcel.readInt();
        this.f107185z = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i13 = AbstractC24567y.f95875a;
        this.f107181E = iArrCreateIntArray;
        this.f107182F = parcel.createIntArray();
    }
}
