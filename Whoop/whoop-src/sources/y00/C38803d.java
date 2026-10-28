package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import m83.C25272z;
import p088dc.AbstractC11895b;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C38803d implements InterfaceC38822e8 {
    public static final Parcelable.Creator<C38803d> CREATOR = new C37677f(26);

    /* JADX INFO: renamed from: w */
    public final String f166993w;

    public C38803d(String str) {
        this.f166993w = str;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        String str = this.f166993w;
        Map mapM95645u = str != null ? AbstractC31061c.m95645u("android_verification_token", str) : null;
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
        return (obj instanceof C38803d) && AbstractC22676k.m65745e(this.f166993w, ((C38803d) obj).f166993w);
    }

    public final int hashCode() {
        String str = this.f166993w;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("AndroidVerificationObject(androidVerificationToken=", this.f166993w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166993w);
    }
}
