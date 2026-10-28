package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.a3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16625a3 implements Parcelable {
    public static final Parcelable.Creator<C16625a3> CREATOR = new C16654f2(12);

    /* JADX INFO: renamed from: w */
    public final Float f63960w;

    /* JADX INFO: renamed from: x */
    public final Float f63961x;

    /* JADX INFO: renamed from: y */
    public final Float f63962y;

    public /* synthetic */ C16625a3(int i13, Float f13) {
        this((i13 & 1) != 0 ? null : f13, (i13 & 2) != 0 ? null : Float.valueOf(0.0f), null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16625a3)) {
            return false;
        }
        C16625a3 c16625a3 = (C16625a3) obj;
        return AbstractC22676k.m65745e(this.f63960w, c16625a3.f63960w) && AbstractC22676k.m65745e(this.f63961x, c16625a3.f63961x) && AbstractC22676k.m65745e(this.f63962y, c16625a3.f63962y);
    }

    public final int hashCode() {
        Float f13 = this.f63960w;
        int iHashCode = (f13 == null ? 0 : f13.hashCode()) * 31;
        Float f14 = this.f63961x;
        int iHashCode2 = (iHashCode + (f14 == null ? 0 : f14.hashCode())) * 31;
        Float f15 = this.f63962y;
        return iHashCode2 + (f15 != null ? f15.hashCode() : 0);
    }

    public final String toString() {
        return "PrimaryButtonShape(cornerRadiusDp=" + this.f63960w + ", borderStrokeWidthDp=" + this.f63961x + ", heightDp=" + this.f63962y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Float f13 = this.f63960w;
        if (f13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f13.floatValue());
        }
        Float f14 = this.f63961x;
        if (f14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f14.floatValue());
        }
        Float f15 = this.f63962y;
        if (f15 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f15.floatValue());
        }
    }

    public C16625a3(Float f13, Float f14, Float f15) {
        this.f63960w = f13;
        this.f63961x = f14;
        this.f63962y = f15;
    }
}
