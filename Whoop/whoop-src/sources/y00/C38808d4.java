package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.d4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38808d4 extends AbstractC38838g4 {
    public static final Parcelable.Creator<C38808d4> CREATOR = new C38967u2(25);

    /* JADX INFO: renamed from: w */
    public final String f167007w;

    public C38808d4(String str) {
        this.f167007w = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38808d4) && AbstractC22676k.m65745e(this.f167007w, ((C38808d4) obj).f167007w);
    }

    public final int hashCode() {
        String str = this.f167007w;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Netbanking(bank=", this.f167007w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167007w);
    }
}
