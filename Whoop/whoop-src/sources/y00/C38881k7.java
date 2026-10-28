package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.k7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38881k7 extends AbstractC38792b8 implements InterfaceC38936q7 {
    public static final Parcelable.Creator<C38881k7> CREATOR = new C38821e7(4);

    /* JADX INFO: renamed from: w */
    public final String f167341w;

    public C38881k7(String str) {
        this.f167341w = str;
    }

    @Override // y00.InterfaceC38936q7
    /* JADX INFO: renamed from: b */
    public final String mo124358b() {
        return this.f167341w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38881k7) && AbstractC22676k.m65745e(this.f167341w, ((C38881k7) obj).f167341w);
    }

    public final int hashCode() {
        String str = this.f167341w;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("DisplayBoletoDetails(hostedVoucherUrl=", this.f167341w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167341w);
    }
}
