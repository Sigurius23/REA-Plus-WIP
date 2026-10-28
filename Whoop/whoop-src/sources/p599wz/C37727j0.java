package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: wz.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37727j0 implements InterfaceC37739n0 {
    public static final Parcelable.Creator<C37727j0> CREATOR = new C37677f(15);

    /* JADX INFO: renamed from: w */
    public final String f161667w;

    public C37727j0(String linkAuthIntentId) {
        AbstractC22676k.m65750j(linkAuthIntentId, "linkAuthIntentId");
        this.f161667w = linkAuthIntentId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37727j0) && AbstractC22676k.m65745e(this.f161667w, ((C37727j0) obj).f161667w);
    }

    public final int hashCode() {
        return this.f161667w.hashCode();
    }

    @Override // p599wz.InterfaceC37739n0
    /* JADX INFO: renamed from: n0 */
    public final AbstractC38794c0 mo121146n0() {
        return AbstractC37740n1.m121156e(this);
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Authorization(linkAuthIntentId=", this.f161667w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f161667w);
    }
}
