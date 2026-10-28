package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.p7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38927p7 extends AbstractC38792b8 {
    public static final Parcelable.Creator<C38927p7> CREATOR = new C38821e7(9);

    /* JADX INFO: renamed from: w */
    public final String f167560w;

    public C38927p7(String str) {
        this.f167560w = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38927p7) && AbstractC22676k.m65745e(this.f167560w, ((C38927p7) obj).f167560w);
    }

    public final int hashCode() {
        String str = this.f167560w;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("DisplayPromptPayDetails(qrCodeUrl=", this.f167560w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167560w);
    }
}
