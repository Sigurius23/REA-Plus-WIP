package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.f2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38826f2 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38826f2> CREATOR = new C38992x0(20);

    /* JADX INFO: renamed from: w */
    public final String f167083w;

    /* JADX INFO: renamed from: x */
    public final String f167084x;

    public C38826f2(String str, String str2) {
        this.f167083w = str;
        this.f167084x = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38826f2)) {
            return false;
        }
        C38826f2 c38826f2 = (C38826f2) obj;
        return AbstractC22676k.m65745e(this.f167083w, c38826f2.f167083w) && AbstractC22676k.m65745e(this.f167084x, c38826f2.f167084x);
    }

    public final int hashCode() {
        String str = this.f167083w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167084x;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("FinancialConnectionsSession(clientSecret=", this.f167083w, ", id=", this.f167084x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167083w);
        dest.writeString(this.f167084x);
    }
}
