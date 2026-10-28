package i20;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16760x0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17935d0 extends AbstractC17941f0 {
    public static final Parcelable.Creator<C17935d0> CREATOR = new C17925a(13);

    /* JADX INFO: renamed from: w */
    public final String f69706w;

    /* JADX INFO: renamed from: x */
    public final C16760x0 f69707x;

    public C17935d0(String id4, C16760x0 c16760x0) {
        AbstractC22676k.m65750j(id4, "id");
        this.f69706w = id4;
        this.f69707x = c16760x0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17935d0)) {
            return false;
        }
        C17935d0 c17935d0 = (C17935d0) obj;
        return AbstractC22676k.m65745e(this.f69706w, c17935d0.f69706w) && AbstractC22676k.m65745e(this.f69707x, c17935d0.f69707x);
    }

    @Override // i20.AbstractC17941f0
    public final String getId() {
        return this.f69706w;
    }

    public final int hashCode() {
        int iHashCode = this.f69706w.hashCode() * 31;
        C16760x0 c16760x0 = this.f69707x;
        return iHashCode + (c16760x0 == null ? 0 : c16760x0.hashCode());
    }

    public final String toString() {
        return "Address(id=" + this.f69706w + ", address=" + this.f69707x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f69706w);
        C16760x0 c16760x0 = this.f69707x;
        if (c16760x0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16760x0.writeToParcel(dest, i13);
        }
    }
}
