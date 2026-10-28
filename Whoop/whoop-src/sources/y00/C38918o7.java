package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.o7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38918o7 extends AbstractC38792b8 {
    public static final Parcelable.Creator<C38918o7> CREATOR = new C38821e7(8);

    /* JADX INFO: renamed from: w */
    public final String f167537w;

    public C38918o7(String str) {
        this.f167537w = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38918o7) && AbstractC22676k.m65745e(this.f167537w, ((C38918o7) obj).f167537w);
    }

    public final int hashCode() {
        String str = this.f167537w;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("DisplayPayNowDetails(qrCodeUrl=", this.f167537w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167537w);
    }
}
