package y00;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.r7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38945r7 extends AbstractC38792b8 {
    public static final Parcelable.Creator<C38945r7> CREATOR = new C38821e7(10);

    /* JADX INFO: renamed from: w */
    public final Uri f167641w;

    /* JADX INFO: renamed from: x */
    public final String f167642x;

    public C38945r7(Uri url, String str) {
        AbstractC22676k.m65750j(url, "url");
        this.f167641w = url;
        this.f167642x = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38945r7)) {
            return false;
        }
        C38945r7 c38945r7 = (C38945r7) obj;
        return AbstractC22676k.m65745e(this.f167641w, c38945r7.f167641w) && AbstractC22676k.m65745e(this.f167642x, c38945r7.f167642x);
    }

    public final int hashCode() {
        int iHashCode = this.f167641w.hashCode() * 31;
        String str = this.f167642x;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "RedirectToUrl(url=" + this.f167641w + ", returnUrl=" + this.f167642x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f167641w, i13);
        dest.writeString(this.f167642x);
    }
}
