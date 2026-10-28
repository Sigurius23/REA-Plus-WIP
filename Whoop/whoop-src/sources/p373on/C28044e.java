package p373on;

import android.os.Parcel;
import android.os.Parcelable;
import in.InterfaceC18714b;
import mn.C25704b;

/* JADX INFO: renamed from: on.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C28044e implements InterfaceC18714b {
    public static final Parcelable.Creator<C28044e> CREATOR = new C25704b(27);

    /* JADX INFO: renamed from: w */
    public final float f113181w;

    /* JADX INFO: renamed from: x */
    public final int f113182x;

    public C28044e(float f13, int i13) {
        this.f113181w = f13;
        this.f113182x = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C28044e.class == obj.getClass()) {
            C28044e c28044e = (C28044e) obj;
            if (this.f113181w == c28044e.f113181w && this.f113182x == c28044e.f113182x) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f113181w).hashCode() + 527) * 31) + this.f113182x;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(73);
        sb4.append("smta: captureFrameRate=");
        sb4.append(this.f113181w);
        sb4.append(", svcTemporalLayerCount=");
        sb4.append(this.f113182x);
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeFloat(this.f113181w);
        parcel.writeInt(this.f113182x);
    }

    public C28044e(Parcel parcel) {
        this.f113181w = parcel.readFloat();
        this.f113182x = parcel.readInt();
    }
}
