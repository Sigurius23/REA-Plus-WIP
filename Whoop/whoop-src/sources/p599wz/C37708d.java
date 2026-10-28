package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import d00.C11433l;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C37708d implements InterfaceC37711e {
    public static final Parcelable.Creator<C37708d> CREATOR = new C37677f(2);

    /* JADX INFO: renamed from: w */
    public final C11433l f161571w;

    /* JADX INFO: renamed from: x */
    public final EnumC37705c f161572x;

    public C37708d(C11433l c11433l, EnumC37705c enumC37705c) {
        this.f161571w = c11433l;
        this.f161572x = enumC37705c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37708d)) {
            return false;
        }
        C37708d c37708d = (C37708d) obj;
        return AbstractC22676k.m65745e(this.f161571w, c37708d.f161571w) && this.f161572x == c37708d.f161572x;
    }

    public final int hashCode() {
        C11433l c11433l = this.f161571w;
        int iHashCode = (c11433l == null ? 0 : c11433l.hashCode()) * 31;
        EnumC37705c enumC37705c = this.f161572x;
        return iHashCode + (enumC37705c != null ? enumC37705c.hashCode() : 0);
    }

    public final String toString() {
        return "Value(account=" + this.f161571w + ", lastUpdateReason=" + this.f161572x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C11433l c11433l = this.f161571w;
        if (c11433l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c11433l.writeToParcel(dest, i13);
        }
        EnumC37705c enumC37705c = this.f161572x;
        if (enumC37705c == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC37705c.name());
        }
    }
}
