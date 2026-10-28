package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import m83.C25272z;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.c5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38799c5 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38799c5> CREATOR = new C38858i4(17);

    /* JADX INFO: renamed from: w */
    public final String f166977w;

    public C38799c5(String str) {
        this.f166977w = str;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        String str = this.f166977w;
        Map mapM95645u = str != null ? AbstractC31061c.m95645u("vpa", str) : null;
        return mapM95645u == null ? C25272z.f99163w : mapM95645u;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38799c5) && AbstractC22676k.m65745e(this.f166977w, ((C38799c5) obj).f166977w);
    }

    public final int hashCode() {
        String str = this.f166977w;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Upi(vpa=", this.f166977w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166977w);
    }
}
