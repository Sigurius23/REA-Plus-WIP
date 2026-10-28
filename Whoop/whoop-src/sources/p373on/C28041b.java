package p373on;

import android.os.Parcel;
import android.os.Parcelable;
import in.InterfaceC18714b;
import mn.C25704b;
import p031b9.AbstractC2875y;
import p558vp.AbstractC36259c;

/* JADX INFO: renamed from: on.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C28041b implements InterfaceC18714b {
    public static final Parcelable.Creator<C28041b> CREATOR = new C25704b(24);

    /* JADX INFO: renamed from: E */
    public final long f113172E;

    /* JADX INFO: renamed from: w */
    public final long f113173w;

    /* JADX INFO: renamed from: x */
    public final long f113174x;

    /* JADX INFO: renamed from: y */
    public final long f113175y;

    /* JADX INFO: renamed from: z */
    public final long f113176z;

    public C28041b(long j7, long j13, long j14, long j15, long j16) {
        this.f113173w = j7;
        this.f113174x = j13;
        this.f113175y = j14;
        this.f113176z = j15;
        this.f113172E = j16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C28041b.class == obj.getClass()) {
            C28041b c28041b = (C28041b) obj;
            if (this.f113173w == c28041b.f113173w && this.f113174x == c28041b.f113174x && this.f113175y == c28041b.f113175y && this.f113176z == c28041b.f113176z && this.f113172E == c28041b.f113172E) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC36259c.m115682b0(this.f113172E) + ((AbstractC36259c.m115682b0(this.f113176z) + ((AbstractC36259c.m115682b0(this.f113175y) + ((AbstractC36259c.m115682b0(this.f113174x) + ((AbstractC36259c.m115682b0(this.f113173w) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder(218);
        sb4.append("Motion photo metadata: photoStartPosition=");
        sb4.append(this.f113173w);
        sb4.append(", photoSize=");
        sb4.append(this.f113174x);
        AbstractC2875y.m8285A(sb4, ", photoPresentationTimestampUs=", this.f113175y, ", videoStartPosition=");
        sb4.append(this.f113176z);
        sb4.append(", videoSize=");
        sb4.append(this.f113172E);
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeLong(this.f113173w);
        parcel.writeLong(this.f113174x);
        parcel.writeLong(this.f113175y);
        parcel.writeLong(this.f113176z);
        parcel.writeLong(this.f113172E);
    }

    public C28041b(Parcel parcel) {
        this.f113173w = parcel.readLong();
        this.f113174x = parcel.readLong();
        this.f113175y = parcel.readLong();
        this.f113176z = parcel.readLong();
        this.f113172E = parcel.readLong();
    }
}
