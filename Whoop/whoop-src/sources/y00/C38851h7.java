package y00;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.h7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38851h7 extends AbstractC38792b8 {
    public static final Parcelable.Creator<C38851h7> CREATOR = new C38821e7(1);

    /* JADX INFO: renamed from: w */
    public final String f167229w;

    /* JADX INFO: renamed from: x */
    public final String f167230x;

    /* JADX INFO: renamed from: y */
    public final Uri f167231y;

    /* JADX INFO: renamed from: z */
    public final String f167232z;

    public C38851h7(String data, String str, Uri webViewUrl, String str2) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(webViewUrl, "webViewUrl");
        this.f167229w = data;
        this.f167230x = str;
        this.f167231y = webViewUrl;
        this.f167232z = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38851h7)) {
            return false;
        }
        C38851h7 c38851h7 = (C38851h7) obj;
        return AbstractC22676k.m65745e(this.f167229w, c38851h7.f167229w) && AbstractC22676k.m65745e(this.f167230x, c38851h7.f167230x) && AbstractC22676k.m65745e(this.f167231y, c38851h7.f167231y) && AbstractC22676k.m65745e(this.f167232z, c38851h7.f167232z);
    }

    public final int hashCode() {
        int iHashCode = this.f167229w.hashCode() * 31;
        String str = this.f167230x;
        int iHashCode2 = (this.f167231y.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f167232z;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AlipayRedirect(data=", this.f167229w, ", authCompleteUrl=", this.f167230x, ", webViewUrl=");
        sbM32001t.append(this.f167231y);
        sbM32001t.append(", returnUrl=");
        sbM32001t.append(this.f167232z);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167229w);
        dest.writeString(this.f167230x);
        dest.writeParcelable(this.f167231y, i13);
        dest.writeString(this.f167232z);
    }
}
