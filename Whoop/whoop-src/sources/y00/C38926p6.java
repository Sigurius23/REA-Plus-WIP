package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.p6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38926p6 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38926p6> CREATOR = new C38943r5(16);

    /* JADX INFO: renamed from: E */
    public final String f167555E;

    /* JADX INFO: renamed from: w */
    public final C38793c f167556w;

    /* JADX INFO: renamed from: x */
    public final String f167557x;

    /* JADX INFO: renamed from: y */
    public final String f167558y;

    /* JADX INFO: renamed from: z */
    public final String f167559z;

    public C38926p6(C38793c c38793c, String str, String str2, String str3, String str4) {
        this.f167556w = c38793c;
        this.f167557x = str;
        this.f167558y = str2;
        this.f167559z = str3;
        this.f167555E = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38926p6)) {
            return false;
        }
        C38926p6 c38926p6 = (C38926p6) obj;
        return AbstractC22676k.m65745e(this.f167556w, c38926p6.f167556w) && AbstractC22676k.m65745e(this.f167557x, c38926p6.f167557x) && AbstractC22676k.m65745e(this.f167558y, c38926p6.f167558y) && AbstractC22676k.m65745e(this.f167559z, c38926p6.f167559z) && AbstractC22676k.m65745e(this.f167555E, c38926p6.f167555E);
    }

    public final int hashCode() {
        C38793c c38793c = this.f167556w;
        int iHashCode = (c38793c == null ? 0 : c38793c.hashCode()) * 31;
        String str = this.f167557x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167558y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167559z;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167555E;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Shipping(address=");
        sb4.append(this.f167556w);
        sb4.append(", carrier=");
        sb4.append(this.f167557x);
        sb4.append(", name=");
        AbstractC11266d.m30444B(sb4, this.f167558y, ", phone=", this.f167559z, ", trackingNumber=");
        return AbstractC25012a.m73376i(this.f167555E, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C38793c c38793c = this.f167556w;
        if (c38793c == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38793c.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167557x);
        dest.writeString(this.f167558y);
        dest.writeString(this.f167559z);
        dest.writeString(this.f167555E);
    }
}
