package p597wx;

import android.os.Parcel;
import android.os.Parcelable;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35467g0;

/* JADX INFO: renamed from: wx.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C37674c implements InterfaceC37676e {
    public static final Parcelable.Creator<C37674c> CREATOR = new C35467g0(28);

    /* JADX INFO: renamed from: w */
    public final Throwable f161427w;

    public C37674c(Throwable error) {
        AbstractC22676k.m65750j(error, "error");
        this.f161427w = error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37674c) && AbstractC22676k.m65745e(this.f161427w, ((C37674c) obj).f161427w);
    }

    public final int hashCode() {
        return this.f161427w.hashCode();
    }

    public final String toString() {
        return AbstractC36095b.m114681i("Failed(error=", ")", this.f161427w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f161427w);
    }
}
