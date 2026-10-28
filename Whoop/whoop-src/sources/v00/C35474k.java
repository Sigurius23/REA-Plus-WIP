package v00;

import android.os.Parcel;
import android.os.Parcelable;
import p537ux.C35332g;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: v00.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C35474k extends AbstractC35478m {
    public static final Parcelable.Creator<C35474k> CREATOR = new C35332g(15);

    /* JADX INFO: renamed from: w */
    public final Boolean f151015w;

    public C35474k(Boolean bool) {
        this.f151015w = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35474k) && AbstractC22676k.m65745e(this.f151015w, ((C35474k) obj).f151015w);
    }

    public final int hashCode() {
        Boolean bool = this.f151015w;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106651j("SimpleBoolean(value=", this.f151015w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Boolean bool = this.f151015w;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
    }
}
