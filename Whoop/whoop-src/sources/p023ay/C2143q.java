package p023ay;

import android.os.Parcel;
import android.os.Parcelable;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ay.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C2143q implements InterfaceC2145s {
    public static final Parcelable.Creator<C2143q> CREATOR = new C2125b(2);

    /* JADX INFO: renamed from: w */
    public final Throwable f8539w;

    public C2143q(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f8539w = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2143q) && AbstractC22676k.m65745e(this.f8539w, ((C2143q) obj).f8539w);
    }

    public final int hashCode() {
        return this.f8539w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failed(error=", ")", this.f8539w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f8539w);
    }
}
