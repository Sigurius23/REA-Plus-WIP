package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.i2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38856i2 implements InterfaceC38866j2 {
    public static final Parcelable.Creator<C38856i2> CREATOR = new C38992x0(23);

    /* JADX INFO: renamed from: w */
    public final String f167269w;

    public C38856i2(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        this.f167269w = id4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38856i2) && AbstractC22676k.m65745e(this.f167269w, ((C38856i2) obj).f167269w);
    }

    @Override // y00.InterfaceC38866j2
    public final String getId() {
        return this.f167269w;
    }

    public final int hashCode() {
        return this.f167269w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("SetupIntent(id=", this.f167269w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167269w);
    }
}
