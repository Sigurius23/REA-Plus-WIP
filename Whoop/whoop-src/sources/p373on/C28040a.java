package p373on;

import android.os.Parcel;
import android.os.Parcelable;
import in.InterfaceC18714b;
import java.util.Arrays;
import mn.C25704b;
import p000.AbstractC11266d;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: on.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C28040a implements InterfaceC18714b {
    public static final Parcelable.Creator<C28040a> CREATOR = new C25704b(23);

    /* JADX INFO: renamed from: w */
    public final String f113168w;

    /* JADX INFO: renamed from: x */
    public final byte[] f113169x;

    /* JADX INFO: renamed from: y */
    public final int f113170y;

    /* JADX INFO: renamed from: z */
    public final int f113171z;

    public C28040a(String str, byte[] bArr, int i13, int i14) {
        this.f113168w = str;
        this.f113169x = bArr;
        this.f113170y = i13;
        this.f113171z = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C28040a.class == obj.getClass()) {
            C28040a c28040a = (C28040a) obj;
            if (this.f113168w.equals(c28040a.f113168w) && Arrays.equals(this.f113169x, c28040a.f113169x) && this.f113170y == c28040a.f113170y && this.f113171z == c28040a.f113171z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f113169x) + AbstractC11266d.m30450d(527, 31, this.f113168w)) * 31) + this.f113170y) * 31) + this.f113171z;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f113168w);
        return strValueOf.length() != 0 ? "mdta: key=".concat(strValueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.f113168w);
        parcel.writeByteArray(this.f113169x);
        parcel.writeInt(this.f113170y);
        parcel.writeInt(this.f113171z);
    }

    public C28040a(Parcel parcel) {
        String string = parcel.readString();
        int i13 = AbstractC24567y.f95875a;
        this.f113168w = string;
        this.f113169x = parcel.createByteArray();
        this.f113170y = parcel.readInt();
        this.f113171z = parcel.readInt();
    }
}
