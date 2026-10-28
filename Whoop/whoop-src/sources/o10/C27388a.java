package o10;

import android.os.Parcel;
import android.os.Parcelable;
import e10.InterfaceC12555l;
import mn.C25704b;
import p599wz.C37718g0;
import p599wz.EnumC37721h0;
import p599wz.InterfaceC37739n0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C27388a implements InterfaceC12555l {
    public static final Parcelable.Creator<C27388a> CREATOR = new C25704b(19);

    /* JADX INFO: renamed from: w */
    public final C37718g0 f110096w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC37739n0 f110097x;

    /* JADX INFO: renamed from: y */
    public final EnumC37721h0 f110098y;

    public C27388a(C37718g0 configuration, InterfaceC37739n0 linkLaunchMode, EnumC37721h0 linkExpressMode) {
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(linkLaunchMode, "linkLaunchMode");
        AbstractC22676k.m65750j(linkExpressMode, "linkExpressMode");
        this.f110096w = configuration;
        this.f110097x = linkLaunchMode;
        this.f110098y = linkExpressMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27388a)) {
            return false;
        }
        C27388a c27388a = (C27388a) obj;
        return AbstractC22676k.m65745e(this.f110096w, c27388a.f110096w) && AbstractC22676k.m65745e(this.f110097x, c27388a.f110097x) && this.f110098y == c27388a.f110098y;
    }

    public final int hashCode() {
        return this.f110098y.hashCode() + ((this.f110097x.hashCode() + (this.f110096w.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LinkConfirmationOption(configuration=" + this.f110096w + ", linkLaunchMode=" + this.f110097x + ", linkExpressMode=" + this.f110098y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f110096w.writeToParcel(dest, i13);
        dest.writeParcelable(this.f110097x, i13);
        dest.writeString(this.f110098y.name());
    }
}
