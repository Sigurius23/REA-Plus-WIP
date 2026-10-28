package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.c3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38797c3 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38797c3> CREATOR = new C38967u2(6);

    /* JADX INFO: renamed from: w */
    public final String f166973w;

    /* JADX INFO: renamed from: x */
    public final String f166974x;

    public C38797c3(String siteKey, String str) {
        AbstractC22676k.m65750j(siteKey, "siteKey");
        this.f166973w = siteKey;
        this.f166974x = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38797c3)) {
            return false;
        }
        C38797c3 c38797c3 = (C38797c3) obj;
        return AbstractC22676k.m65745e(this.f166973w, c38797c3.f166973w) && AbstractC22676k.m65745e(this.f166974x, c38797c3.f166974x);
    }

    public final int hashCode() {
        int iHashCode = this.f166973w.hashCode() * 31;
        String str = this.f166974x;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC2875y.m8300m("PassiveCaptchaParams(siteKey=", this.f166973w, ", rqData=", this.f166974x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166973w);
        dest.writeString(this.f166974x);
    }
}
