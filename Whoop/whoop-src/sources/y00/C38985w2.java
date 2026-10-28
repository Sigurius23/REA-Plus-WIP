package y00;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.w2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38985w2 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38985w2> CREATOR = new C38967u2(2);

    /* JADX INFO: renamed from: z */
    public static final C38985w2 f167816z = new C38985w2(null, null, true);

    /* JADX INFO: renamed from: w */
    public final String f167817w;

    /* JADX INFO: renamed from: x */
    public final String f167818x;

    /* JADX INFO: renamed from: y */
    public final boolean f167819y;

    public C38985w2(String str, String str2, boolean z4) {
        this.f167817w = str;
        this.f167818x = str2;
        this.f167819y = z4;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        if (this.f167819y) {
            return AbstractC36095b.m114688p(Boolean.TRUE, "infer_from_client");
        }
        String str = this.f167817w;
        if (str == null) {
            str = "";
        }
        C23465k c23465k = new C23465k("ip_address", str);
        String str2 = this.f167818x;
        return AbstractC25247g0.m73990Y(c23465k, new C23465k("user_agent", str2 != null ? str2 : ""));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38985w2)) {
            return false;
        }
        C38985w2 c38985w2 = (C38985w2) obj;
        return AbstractC22676k.m65745e(this.f167817w, c38985w2.f167817w) && AbstractC22676k.m65745e(this.f167818x, c38985w2.f167818x) && this.f167819y == c38985w2.f167819y;
    }

    public final int hashCode() {
        String str = this.f167817w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167818x;
        return Boolean.hashCode(this.f167819y) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("Online(ipAddress=", this.f167817w, ", userAgent=", this.f167818x, ", inferFromClient="), this.f167819y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167817w);
        dest.writeString(this.f167818x);
        dest.writeInt(this.f167819y ? 1 : 0);
    }
}
