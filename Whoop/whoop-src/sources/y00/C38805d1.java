package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.d1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38805d1 implements InterfaceC38815e1 {
    public static final Parcelable.Creator<C38805d1> CREATOR = new C38992x0(5);

    /* JADX INFO: renamed from: w */
    public final String f166995w;

    /* JADX INFO: renamed from: x */
    public final String f166996x;

    public C38805d1(String type, String error) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(error, "error");
        this.f166995w = type;
        this.f166996x = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38805d1)) {
            return false;
        }
        C38805d1 c38805d1 = (C38805d1) obj;
        return AbstractC22676k.m65745e(this.f166995w, c38805d1.f166995w) && AbstractC22676k.m65745e(this.f166996x, c38805d1.f166996x);
    }

    public final int hashCode() {
        return this.f166996x.hashCode() + (this.f166995w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("Unavailable(type=", this.f166995w, ", error=", this.f166996x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166995w);
        dest.writeString(this.f166996x);
    }
}
