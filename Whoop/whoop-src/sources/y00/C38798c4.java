package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.c4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38798c4 extends AbstractC38838g4 {
    public static final Parcelable.Creator<C38798c4> CREATOR = new C38967u2(24);

    /* JADX INFO: renamed from: w */
    public final String f166975w;

    /* JADX INFO: renamed from: x */
    public final String f166976x;

    public C38798c4(String str, String str2) {
        this.f166975w = str;
        this.f166976x = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38798c4)) {
            return false;
        }
        C38798c4 c38798c4 = (C38798c4) obj;
        return AbstractC22676k.m65745e(this.f166975w, c38798c4.f166975w) && AbstractC22676k.m65745e(this.f166976x, c38798c4.f166976x);
    }

    public final int hashCode() {
        String str = this.f166975w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f166976x;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("Ideal(bank=", this.f166975w, ", bankIdentifierCode=", this.f166976x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166975w);
        dest.writeString(this.f166976x);
    }
}
