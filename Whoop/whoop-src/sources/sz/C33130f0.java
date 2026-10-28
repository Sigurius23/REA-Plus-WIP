package sz;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sz.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33130f0 extends AbstractC33132g0 {
    public static final Parcelable.Creator<C33130f0> CREATOR = new C33133h(11);

    /* JADX INFO: renamed from: w */
    public final Throwable f138192w;

    /* JADX INFO: renamed from: x */
    public final int f138193x;

    public C33130f0(int i13, Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f138192w = error;
        this.f138193x = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33130f0)) {
            return false;
        }
        C33130f0 c33130f0 = (C33130f0) obj;
        return AbstractC22676k.m65745e(this.f138192w, c33130f0.f138192w) && this.f138193x == c33130f0.f138193x;
    }

    public final int hashCode() {
        return (this.f138192w.hashCode() * 31) + this.f138193x;
    }

    public final String toString() {
        return "Failed(error=" + this.f138192w + ", errorCode=" + this.f138193x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f138192w);
        dest.writeInt(this.f138193x);
    }
}
