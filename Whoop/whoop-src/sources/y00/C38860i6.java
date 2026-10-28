package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.i6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38860i6 implements InterfaceC36562b, InterfaceC38822e8 {
    public static final Parcelable.Creator<C38860i6> CREATOR = new C38943r5(10);

    /* JADX INFO: renamed from: w */
    public final C38793c f167280w;

    /* JADX INFO: renamed from: x */
    public final String f167281x;

    /* JADX INFO: renamed from: y */
    public final String f167282y;

    public C38860i6(C38793c c38793c, String str, String str2) {
        this.f167280w = c38793c;
        this.f167281x = str;
        this.f167282y = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38860i6)) {
            return false;
        }
        C38860i6 c38860i6 = (C38860i6) obj;
        return AbstractC22676k.m65745e(this.f167280w, c38860i6.f167280w) && AbstractC22676k.m65745e(this.f167281x, c38860i6.f167281x) && AbstractC22676k.m65745e(this.f167282y, c38860i6.f167282y);
    }

    public final int hashCode() {
        C38793c c38793c = this.f167280w;
        int iHashCode = (c38793c == null ? 0 : c38793c.hashCode()) * 31;
        String str = this.f167281x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167282y;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ShippingInformation(address=");
        sb4.append(this.f167280w);
        sb4.append(", name=");
        sb4.append(this.f167281x);
        sb4.append(", phone=");
        return AbstractC25012a.m73376i(this.f167282y, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C38793c c38793c = this.f167280w;
        if (c38793c == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38793c.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167281x);
        dest.writeString(this.f167282y);
    }
}
