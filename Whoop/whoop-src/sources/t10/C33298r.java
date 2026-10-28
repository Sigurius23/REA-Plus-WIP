package t10;

import android.os.Parcel;
import android.os.Parcelable;
import p486sp.C32854e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;

/* JADX INFO: renamed from: t10.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C33298r implements InterfaceC33299s {
    public static final Parcelable.Creator<C33298r> CREATOR = new C32854e(5);

    /* JADX INFO: renamed from: w */
    public final AbstractC29840y f138865w;

    /* JADX INFO: renamed from: x */
    public final boolean f138866x;

    public C33298r(AbstractC29840y abstractC29840y, boolean z4) {
        this.f138865w = abstractC29840y;
        this.f138866x = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33298r)) {
            return false;
        }
        C33298r c33298r = (C33298r) obj;
        return AbstractC22676k.m65745e(this.f138865w, c33298r.f138865w) && this.f138866x == c33298r.f138866x;
    }

    public final int hashCode() {
        AbstractC29840y abstractC29840y = this.f138865w;
        return Boolean.hashCode(this.f138866x) + ((abstractC29840y == null ? 0 : abstractC29840y.hashCode()) * 31);
    }

    public final String toString() {
        return "Complete(selection=" + this.f138865w + ", hasBeenConfirmed=" + this.f138866x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f138865w, i13);
        dest.writeInt(this.f138866x ? 1 : 0);
    }
}
