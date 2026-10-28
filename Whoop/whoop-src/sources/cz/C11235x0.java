package cz;

import android.os.Parcel;
import android.os.Parcelable;
import p023ay.C2125b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;

/* JADX INFO: renamed from: cz.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11235x0 extends AbstractC11239z0 {
    public static final Parcelable.Creator<C11235x0> CREATOR = new C2125b(16);

    /* JADX INFO: renamed from: w */
    public final AbstractC29840y f36047w;

    public C11235x0(AbstractC29840y abstractC29840y) {
        this.f36047w = abstractC29840y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11235x0) && AbstractC22676k.m65745e(this.f36047w, ((C11235x0) obj).f36047w);
    }

    public final int hashCode() {
        AbstractC29840y abstractC29840y = this.f36047w;
        if (abstractC29840y == null) {
            return 0;
        }
        return abstractC29840y.hashCode();
    }

    public final String toString() {
        return "Canceled(paymentSelection=" + this.f36047w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f36047w, i13);
    }
}
