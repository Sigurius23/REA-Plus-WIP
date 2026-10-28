package i20;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16760x0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17938e0 extends AbstractC17941f0 {
    public static final Parcelable.Creator<C17938e0> CREATOR = new C17925a(14);

    /* JADX INFO: renamed from: w */
    public final String f69714w;

    /* JADX INFO: renamed from: x */
    public final C16760x0 f69715x;

    public C17938e0(String id4, C16760x0 c16760x0) {
        AbstractC22676k.m65750j(id4, "id");
        this.f69714w = id4;
        this.f69715x = c16760x0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17938e0)) {
            return false;
        }
        C17938e0 c17938e0 = (C17938e0) obj;
        return AbstractC22676k.m65745e(this.f69714w, c17938e0.f69714w) && AbstractC22676k.m65745e(this.f69715x, c17938e0.f69715x);
    }

    @Override // i20.AbstractC17941f0
    public final String getId() {
        return this.f69714w;
    }

    public final int hashCode() {
        int iHashCode = this.f69714w.hashCode() * 31;
        C16760x0 c16760x0 = this.f69715x;
        return iHashCode + (c16760x0 == null ? 0 : c16760x0.hashCode());
    }

    public final String toString() {
        return "EnterManually(id=" + this.f69714w + ", address=" + this.f69715x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f69714w);
        C16760x0 c16760x0 = this.f69715x;
        if (c16760x0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16760x0.writeToParcel(dest, i13);
        }
    }
}
