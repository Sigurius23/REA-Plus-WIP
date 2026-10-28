package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.i1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16671i1 implements Parcelable {
    public static final Parcelable.Creator<C16671i1> CREATOR = new C16699n(16);

    /* JADX INFO: renamed from: w */
    public final C16760x0 f64114w;

    /* JADX INFO: renamed from: x */
    public final String f64115x;

    /* JADX INFO: renamed from: y */
    public final String f64116y;

    /* JADX INFO: renamed from: z */
    public final String f64117z;

    public C16671i1(C16760x0 c16760x0, String str, String str2, String str3) {
        this.f64114w = c16760x0;
        this.f64115x = str;
        this.f64116y = str2;
        this.f64117z = str3;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m47234b() {
        return (this.f64114w == null && this.f64115x == null && this.f64116y == null && this.f64117z == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16671i1)) {
            return false;
        }
        C16671i1 c16671i1 = (C16671i1) obj;
        return AbstractC22676k.m65745e(this.f64114w, c16671i1.f64114w) && AbstractC22676k.m65745e(this.f64115x, c16671i1.f64115x) && AbstractC22676k.m65745e(this.f64116y, c16671i1.f64116y) && AbstractC22676k.m65745e(this.f64117z, c16671i1.f64117z);
    }

    public final int hashCode() {
        C16760x0 c16760x0 = this.f64114w;
        int iHashCode = (c16760x0 == null ? 0 : c16760x0.hashCode()) * 31;
        String str = this.f64115x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64116y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64117z;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BillingDetails(address=");
        sb4.append(this.f64114w);
        sb4.append(", email=");
        sb4.append(this.f64115x);
        sb4.append(", name=");
        return AbstractC11266d.m30464r(sb4, this.f64116y, ", phone=", this.f64117z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C16760x0 c16760x0 = this.f64114w;
        if (c16760x0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16760x0.writeToParcel(dest, i13);
        }
        dest.writeString(this.f64115x);
        dest.writeString(this.f64116y);
        dest.writeString(this.f64117z);
    }
}
