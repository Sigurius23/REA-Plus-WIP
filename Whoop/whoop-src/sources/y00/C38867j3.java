package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.j3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38867j3 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38867j3> CREATOR = new C38967u2(9);

    /* JADX INFO: renamed from: E */
    public final String f167303E;

    /* JADX INFO: renamed from: w */
    public final C38793c f167304w;

    /* JADX INFO: renamed from: x */
    public final String f167305x;

    /* JADX INFO: renamed from: y */
    public final String f167306y;

    /* JADX INFO: renamed from: z */
    public final String f167307z;

    public C38867j3(C38793c address, String str, String str2, String str3, String str4) {
        AbstractC22676k.m65750j(address, "address");
        this.f167304w = address;
        this.f167305x = str;
        this.f167306y = str2;
        this.f167307z = str3;
        this.f167303E = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38867j3)) {
            return false;
        }
        C38867j3 c38867j3 = (C38867j3) obj;
        return AbstractC22676k.m65745e(this.f167304w, c38867j3.f167304w) && AbstractC22676k.m65745e(this.f167305x, c38867j3.f167305x) && AbstractC22676k.m65745e(this.f167306y, c38867j3.f167306y) && AbstractC22676k.m65745e(this.f167307z, c38867j3.f167307z) && AbstractC22676k.m65745e(this.f167303E, c38867j3.f167303E);
    }

    public final int hashCode() {
        int iHashCode = this.f167304w.hashCode() * 31;
        String str = this.f167305x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167306y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167307z;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167303E;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Shipping(address=");
        sb4.append(this.f167304w);
        sb4.append(", carrier=");
        sb4.append(this.f167305x);
        sb4.append(", name=");
        AbstractC11266d.m30444B(sb4, this.f167306y, ", phone=", this.f167307z, ", trackingNumber=");
        return AbstractC25012a.m73376i(this.f167303E, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f167304w.writeToParcel(dest, i13);
        dest.writeString(this.f167305x);
        dest.writeString(this.f167306y);
        dest.writeString(this.f167307z);
        dest.writeString(this.f167303E);
    }
}
