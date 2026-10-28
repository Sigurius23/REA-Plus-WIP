package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.b3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38787b3 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38787b3> CREATOR = new C38967u2(5);

    /* JADX INFO: renamed from: w */
    public final String f166943w;

    public C38787b3(String preferred) {
        AbstractC22676k.m65750j(preferred, "preferred");
        this.f166943w = preferred;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38787b3) && AbstractC22676k.m65745e(this.f166943w, ((C38787b3) obj).f166943w);
    }

    public final int hashCode() {
        return this.f166943w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Networks(preferred=", this.f166943w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166943w);
    }
}
