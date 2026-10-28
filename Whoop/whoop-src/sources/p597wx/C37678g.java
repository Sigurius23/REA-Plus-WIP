package p597wx;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wx.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C37678g implements Parcelable {
    public static final Parcelable.Creator<C37678g> CREATOR = new C37677f(0);

    /* JADX INFO: renamed from: w */
    public final String f161430w;

    /* JADX INFO: renamed from: x */
    public final List f161431x;

    public C37678g(String publishableKey, List productUsage) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        this.f161430w = publishableKey;
        this.f161431x = productUsage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37678g)) {
            return false;
        }
        C37678g c37678g = (C37678g) obj;
        return AbstractC22676k.m65745e(this.f161430w, c37678g.f161430w) && AbstractC22676k.m65745e(this.f161431x, c37678g.f161431x);
    }

    public final int hashCode() {
        return this.f161431x.hashCode() + (this.f161430w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC36095b.m114679g("AttestationArgs(publishableKey=", this.f161430w, ", productUsage=", ")", this.f161431x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f161430w);
        dest.writeStringList(this.f161431x);
    }
}
