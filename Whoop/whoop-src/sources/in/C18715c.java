package in;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: in.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C18715c implements Parcelable {
    public static final Parcelable.Creator<C18715c> CREATOR = new C18713a();

    /* JADX INFO: renamed from: w */
    public final InterfaceC18714b[] f73525w;

    public C18715c(InterfaceC18714b... interfaceC18714bArr) {
        this.f73525w = interfaceC18714bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18715c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f73525w, ((C18715c) obj).f73525w);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f73525w);
    }

    public final String toString() {
        String strValueOf = String.valueOf(Arrays.toString(this.f73525w));
        return strValueOf.length() != 0 ? "entries=".concat(strValueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        InterfaceC18714b[] interfaceC18714bArr = this.f73525w;
        parcel.writeInt(interfaceC18714bArr.length);
        for (InterfaceC18714b interfaceC18714b : interfaceC18714bArr) {
            parcel.writeParcelable(interfaceC18714b, 0);
        }
    }

    public C18715c(List list) {
        this.f73525w = (InterfaceC18714b[]) list.toArray(new InterfaceC18714b[0]);
    }

    public C18715c(Parcel parcel) {
        this.f73525w = new InterfaceC18714b[parcel.readInt()];
        int i13 = 0;
        while (true) {
            InterfaceC18714b[] interfaceC18714bArr = this.f73525w;
            if (i13 >= interfaceC18714bArr.length) {
                return;
            }
            interfaceC18714bArr[i13] = (InterfaceC18714b) parcel.readParcelable(InterfaceC18714b.class.getClassLoader());
            i13++;
        }
    }
}
