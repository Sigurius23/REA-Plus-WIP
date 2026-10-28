package p102dy;

import android.os.Parcel;
import android.os.Parcelable;
import p096dq.C12280x;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: dy.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C12435d implements InterfaceC12437f {
    public static final Parcelable.Creator<C12435d> CREATOR = new C12280x(15);

    /* JADX INFO: renamed from: w */
    public final Throwable f42368w;

    public C12435d(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f42368w = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12435d) && AbstractC22676k.m65745e(this.f42368w, ((C12435d) obj).f42368w);
    }

    public final int hashCode() {
        return this.f42368w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failed(error=", ")", this.f42368w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f42368w);
    }
}
