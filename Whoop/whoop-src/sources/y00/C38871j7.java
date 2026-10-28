package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.j7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38871j7 extends AbstractC38792b8 {
    public static final Parcelable.Creator<C38871j7> CREATOR = new C38821e7(3);

    /* JADX INFO: renamed from: w */
    public final String f167318w;

    public C38871j7(String mobileAuthUrl) {
        AbstractC22676k.m65750j(mobileAuthUrl, "mobileAuthUrl");
        this.f167318w = mobileAuthUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38871j7) && AbstractC22676k.m65745e(this.f167318w, ((C38871j7) obj).f167318w);
    }

    public final int hashCode() {
        return this.f167318w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("CashAppRedirect(mobileAuthUrl=", this.f167318w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167318w);
    }
}
