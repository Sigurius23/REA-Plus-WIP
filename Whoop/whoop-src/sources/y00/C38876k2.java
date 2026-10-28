package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.k2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38876k2 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38876k2> CREATOR = new C38992x0(24);

    /* JADX INFO: renamed from: w */
    public final String f167322w;

    /* JADX INFO: renamed from: x */
    public final String f167323x;

    public C38876k2(String id4, String clientSecret) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(clientSecret, "clientSecret");
        this.f167322w = id4;
        this.f167323x = clientSecret;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38876k2)) {
            return false;
        }
        C38876k2 c38876k2 = (C38876k2) obj;
        return AbstractC22676k.m65745e(this.f167322w, c38876k2.f167322w) && AbstractC22676k.m65745e(this.f167323x, c38876k2.f167323x);
    }

    public final int hashCode() {
        return this.f167323x.hashCode() + (this.f167322w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("LinkAccountSession(id=", this.f167322w, ", clientSecret=", this.f167323x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167322w);
        dest.writeString(this.f167323x);
    }
}
