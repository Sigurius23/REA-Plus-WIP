package z10;

import android.os.Parcel;
import android.os.Parcelable;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38821e7;

/* JADX INFO: renamed from: z10.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C39986i implements InterfaceC39987j {
    public static final Parcelable.Creator<C39986i> CREATOR = new C38821e7(28);

    /* JADX INFO: renamed from: w */
    public final Throwable f172557w;

    public C39986i(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f172557w = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39986i) && AbstractC22676k.m65745e(this.f172557w, ((C39986i) obj).f172557w);
    }

    public final int hashCode() {
        return this.f172557w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failed(error=", ")", this.f172557w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f172557w);
    }
}
