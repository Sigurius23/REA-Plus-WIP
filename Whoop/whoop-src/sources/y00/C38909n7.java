package y00;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.n7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38909n7 extends AbstractC38792b8 implements InterfaceC38936q7 {
    public static final Parcelable.Creator<C38909n7> CREATOR = new C38821e7(7);

    /* JADX INFO: renamed from: w */
    public final int f167483w;

    /* JADX INFO: renamed from: x */
    public final String f167484x;

    /* JADX INFO: renamed from: y */
    public final String f167485y;

    public C38909n7(int i13, String str, String str2) {
        this.f167483w = i13;
        this.f167484x = str;
        this.f167485y = str2;
    }

    @Override // y00.InterfaceC38936q7
    /* JADX INFO: renamed from: b */
    public final String mo124358b() {
        return this.f167485y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38909n7)) {
            return false;
        }
        C38909n7 c38909n7 = (C38909n7) obj;
        return this.f167483w == c38909n7.f167483w && AbstractC22676k.m65745e(this.f167484x, c38909n7.f167484x) && AbstractC22676k.m65745e(this.f167485y, c38909n7.f167485y);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f167483w) * 31;
        String str = this.f167484x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167485y;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f167485y, ")", AbstractC18489d0.m53373n(this.f167483w, "DisplayOxxoDetails(expiresAfter=", ", number=", this.f167484x, ", hostedVoucherUrl="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f167483w);
        dest.writeString(this.f167484x);
        dest.writeString(this.f167485y);
    }
}
