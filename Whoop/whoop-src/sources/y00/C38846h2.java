package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.h2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38846h2 implements InterfaceC38866j2 {
    public static final Parcelable.Creator<C38846h2> CREATOR = new C38992x0(22);

    /* JADX INFO: renamed from: w */
    public final String f167217w;

    public C38846h2(String id4) {
        AbstractC22676k.m65750j(id4, "id");
        this.f167217w = id4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38846h2) && AbstractC22676k.m65745e(this.f167217w, ((C38846h2) obj).f167217w);
    }

    @Override // y00.InterfaceC38866j2
    public final String getId() {
        return this.f167217w;
    }

    public final int hashCode() {
        return this.f167217w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("PaymentIntent(id=", this.f167217w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167217w);
    }
}
