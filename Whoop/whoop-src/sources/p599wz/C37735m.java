package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C37735m extends AbstractC37747q {
    public static final Parcelable.Creator<C37735m> CREATOR = new C37677f(3);

    /* JADX INFO: renamed from: w */
    public final EnumC37732l f161688w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC37711e f161689x;

    public C37735m(EnumC37732l reason, InterfaceC37711e linkAccountUpdate) {
        AbstractC22676k.m65750j(reason, "reason");
        AbstractC22676k.m65750j(linkAccountUpdate, "linkAccountUpdate");
        this.f161688w = reason;
        this.f161689x = linkAccountUpdate;
    }

    @Override // p599wz.AbstractC37747q
    /* JADX INFO: renamed from: b */
    public final InterfaceC37711e mo121151b() {
        return this.f161689x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37735m)) {
            return false;
        }
        C37735m c37735m = (C37735m) obj;
        return this.f161688w == c37735m.f161688w && AbstractC22676k.m65745e(this.f161689x, c37735m.f161689x);
    }

    public final int hashCode() {
        return this.f161689x.hashCode() + (this.f161688w.hashCode() * 31);
    }

    public final String toString() {
        return "Canceled(reason=" + this.f161688w + ", linkAccountUpdate=" + this.f161689x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f161688w.name());
        dest.writeParcelable(this.f161689x, i13);
    }

    public /* synthetic */ C37735m(InterfaceC37711e interfaceC37711e) {
        this(EnumC37732l.f161680w, interfaceC37711e);
    }
}
