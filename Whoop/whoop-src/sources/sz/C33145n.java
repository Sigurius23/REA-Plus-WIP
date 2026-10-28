package sz;

import android.os.Parcel;
import android.os.Parcelable;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sz.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C33145n extends AbstractC33147o {
    public static final Parcelable.Creator<C33145n> CREATOR = new C33133h(4);

    /* JADX INFO: renamed from: w */
    public final Throwable f138232w;

    public C33145n(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f138232w = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33145n) && AbstractC22676k.m65745e(this.f138232w, ((C33145n) obj).f138232w);
    }

    public final int hashCode() {
        return this.f138232w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failed(error=", ")", this.f138232w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f138232w);
    }
}
