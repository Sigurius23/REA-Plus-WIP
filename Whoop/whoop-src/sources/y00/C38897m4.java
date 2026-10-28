package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.m4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38897m4 extends AbstractC38838g4 {
    public static final Parcelable.Creator<C38897m4> CREATOR = new C38858i4(2);

    /* JADX INFO: renamed from: w */
    public final String f167445w;

    public C38897m4(String str) {
        this.f167445w = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38897m4) && AbstractC22676k.m65745e(this.f167445w, ((C38897m4) obj).f167445w);
    }

    public final int hashCode() {
        String str = this.f167445w;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Upi(vpa=", this.f167445w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167445w);
    }
}
