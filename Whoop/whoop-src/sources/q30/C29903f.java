package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: q30.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C29903f extends AbstractC29907h {
    public static final Parcelable.Creator<C29903f> CREATOR = new C29831p(14);

    /* JADX INFO: renamed from: w */
    public final Boolean f122172w;

    public C29903f(Boolean bool) {
        this.f122172w = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29903f) && AbstractC22676k.m65745e(this.f122172w, ((C29903f) obj).f122172w);
    }

    public final int hashCode() {
        Boolean bool = this.f122172w;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106651j("Oob(whitelistingValue=", this.f122172w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Boolean bool = this.f122172w;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
    }
}
