package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C37741o extends AbstractC37747q {
    public static final Parcelable.Creator<C37741o> CREATOR = new C37677f(5);

    /* JADX INFO: renamed from: w */
    public final Throwable f161701w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC37711e f161702x;

    public C37741o(Throwable error, InterfaceC37711e linkAccountUpdate) {
        AbstractC22676k.m65750j(error, "error");
        AbstractC22676k.m65750j(linkAccountUpdate, "linkAccountUpdate");
        this.f161701w = error;
        this.f161702x = linkAccountUpdate;
    }

    @Override // p599wz.AbstractC37747q
    /* JADX INFO: renamed from: b */
    public final InterfaceC37711e mo121151b() {
        return this.f161702x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37741o)) {
            return false;
        }
        C37741o c37741o = (C37741o) obj;
        return AbstractC22676k.m65745e(this.f161701w, c37741o.f161701w) && AbstractC22676k.m65745e(this.f161702x, c37741o.f161702x);
    }

    public final int hashCode() {
        return this.f161702x.hashCode() + (this.f161701w.hashCode() * 31);
    }

    public final String toString() {
        return "Failed(error=" + this.f161701w + ", linkAccountUpdate=" + this.f161702x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f161701w);
        dest.writeParcelable(this.f161702x, i13);
    }
}
