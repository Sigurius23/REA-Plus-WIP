package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.C25272z;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.a6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38780a6 implements InterfaceC38822e8 {
    public static final Parcelable.Creator<C38780a6> CREATOR = new C38943r5(5);

    /* JADX INFO: renamed from: w */
    public final String f166916w;

    /* JADX INFO: renamed from: x */
    public final C38803d f166917x;

    public C38780a6(String str, C38803d c38803d) {
        this.f166916w = str;
        this.f166917x = c38803d;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        String str = this.f166916w;
        Map mapM95645u = str != null ? AbstractC31061c.m95645u("hcaptcha_token", str) : null;
        Map map = C25272z.f99163w;
        if (mapM95645u == null) {
            mapM95645u = map;
        }
        C38803d c38803d = this.f166917x;
        Map mapM124385o = c38803d != null ? AbstractC38963t7.m124385o("android_verification_object", c38803d.mo124325c0()) : null;
        if (mapM124385o != null) {
            map = mapM124385o;
        }
        return AbstractC25247g0.m73995d0(mapM95645u, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38780a6)) {
            return false;
        }
        C38780a6 c38780a6 = (C38780a6) obj;
        return AbstractC22676k.m65745e(this.f166916w, c38780a6.f166916w) && AbstractC22676k.m65745e(this.f166917x, c38780a6.f166917x);
    }

    public final int hashCode() {
        String str = this.f166916w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C38803d c38803d = this.f166917x;
        return iHashCode + (c38803d != null ? c38803d.hashCode() : 0);
    }

    public final String toString() {
        return "RadarOptions(hCaptchaToken=" + this.f166916w + ", androidVerificationObject=" + this.f166917x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166916w);
        C38803d c38803d = this.f166917x;
        if (c38803d == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38803d.writeToParcel(dest, i13);
        }
    }
}
