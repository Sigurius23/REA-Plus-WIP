package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jz.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C22066n extends AbstractC22067o {
    public static final Parcelable.Creator<C22066n> CREATOR = new C22060h(4);

    /* JADX INFO: renamed from: w */
    public final Throwable f85578w;

    public C22066n(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f85578w = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22066n) && AbstractC22676k.m65745e(this.f85578w, ((C22066n) obj).f85578w);
    }

    public final int hashCode() {
        return this.f85578w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failed(error=", ")", this.f85578w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f85578w);
    }
}
