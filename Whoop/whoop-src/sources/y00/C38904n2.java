package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.n2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38904n2 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38904n2> CREATOR = new C38992x0(26);

    /* JADX INFO: renamed from: w */
    public final C38895m2 f167474w;

    /* JADX INFO: renamed from: x */
    public final String f167475x;

    public C38904n2(C38895m2 incentiveParams, String str) {
        AbstractC22676k.m65750j(incentiveParams, "incentiveParams");
        this.f167474w = incentiveParams;
        this.f167475x = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38904n2)) {
            return false;
        }
        C38904n2 c38904n2 = (C38904n2) obj;
        return AbstractC22676k.m65745e(this.f167474w, c38904n2.f167474w) && AbstractC22676k.m65745e(this.f167475x, c38904n2.f167475x);
    }

    public final int hashCode() {
        int iHashCode = this.f167474w.f167440w.hashCode() * 31;
        String str = this.f167475x;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "LinkConsumerIncentive(incentiveParams=" + this.f167474w + ", incentiveDisplayText=" + this.f167475x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f167474w.writeToParcel(dest, i13);
        dest.writeString(this.f167475x);
    }
}
