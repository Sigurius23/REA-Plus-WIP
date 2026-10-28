package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;

/* JADX INFO: renamed from: q30.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C29925q extends AbstractC29921o {
    public static final Parcelable.Creator<C29925q> CREATOR = new C29831p(20);

    /* JADX INFO: renamed from: w */
    public final Throwable f122225w;

    public C29925q(Throwable throwable) {
        AbstractC22676k.m65750j(throwable, "throwable");
        this.f122225w = throwable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29925q) && AbstractC22676k.m65745e(this.f122225w, ((C29925q) obj).f122225w);
    }

    public final int hashCode() {
        return this.f122225w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("RuntimeError(throwable=", ")", this.f122225w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f122225w);
    }
}
