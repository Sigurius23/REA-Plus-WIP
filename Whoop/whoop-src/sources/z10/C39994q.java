package z10;

import android.os.Parcel;
import android.os.Parcelable;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z10.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C39994q extends AbstractC39995r {
    public static final Parcelable.Creator<C39994q> CREATOR = new C39988k(4);

    /* JADX INFO: renamed from: w */
    public final Throwable f172569w;

    public C39994q(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f172569w = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39994q) && AbstractC22676k.m65745e(this.f172569w, ((C39994q) obj).f172569w);
    }

    public final int hashCode() {
        return this.f172569w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failed(error=", ")", this.f172569w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f172569w);
    }
}
