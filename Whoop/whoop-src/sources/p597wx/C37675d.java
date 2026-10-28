package p597wx;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35467g0;

/* JADX INFO: renamed from: wx.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C37675d implements InterfaceC37676e {
    public static final Parcelable.Creator<C37675d> CREATOR = new C35467g0(29);

    /* JADX INFO: renamed from: w */
    public final String f161428w;

    public C37675d(String token) {
        AbstractC22676k.m65750j(token, "token");
        this.f161428w = token;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37675d) && AbstractC22676k.m65745e(this.f161428w, ((C37675d) obj).f161428w);
    }

    public final int hashCode() {
        return this.f161428w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Success(token=", this.f161428w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f161428w);
    }
}
