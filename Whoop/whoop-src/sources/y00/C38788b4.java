package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.b4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38788b4 extends AbstractC38838g4 {
    public static final Parcelable.Creator<C38788b4> CREATOR = new C38967u2(23);

    /* JADX INFO: renamed from: w */
    public final String f166944w;

    /* JADX INFO: renamed from: x */
    public final String f166945x;

    public C38788b4(String str, String str2) {
        this.f166944w = str;
        this.f166945x = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38788b4)) {
            return false;
        }
        C38788b4 c38788b4 = (C38788b4) obj;
        return AbstractC22676k.m65745e(this.f166944w, c38788b4.f166944w) && AbstractC22676k.m65745e(this.f166945x, c38788b4.f166945x);
    }

    public final int hashCode() {
        String str = this.f166944w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f166945x;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("Fpx(bank=", this.f166944w, ", accountHolderType=", this.f166945x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166944w);
        dest.writeString(this.f166945x);
    }
}
