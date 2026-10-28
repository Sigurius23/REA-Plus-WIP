package v00;

import android.os.Parcel;
import android.os.Parcelable;
import my.EnumC26028b;
import p031b9.AbstractC2875y;
import p537ux.C35332g;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v00.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C35482o implements Parcelable {
    public static final Parcelable.Creator<C35482o> CREATOR = new C35332g(18);

    /* JADX INFO: renamed from: w */
    public final EnumC26028b f151054w;

    /* JADX INFO: renamed from: x */
    public final boolean f151055x;

    /* JADX INFO: renamed from: y */
    public final boolean f151056y;

    /* JADX INFO: renamed from: z */
    public final boolean f151057z;

    public C35482o(EnumC26028b removePaymentMethod, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(removePaymentMethod, "removePaymentMethod");
        this.f151054w = removePaymentMethod;
        this.f151055x = z4;
        this.f151056y = z13;
        this.f151057z = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35482o)) {
            return false;
        }
        C35482o c35482o = (C35482o) obj;
        return this.f151054w == c35482o.f151054w && this.f151055x == c35482o.f151055x && this.f151056y == c35482o.f151056y && this.f151057z == c35482o.f151057z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f151057z) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.f151054w.hashCode() * 31, 31, this.f151055x), 31, this.f151056y);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Permissions(removePaymentMethod=");
        sb4.append(this.f151054w);
        sb4.append(", canRemoveLastPaymentMethod=");
        sb4.append(this.f151055x);
        sb4.append(", canRemoveDuplicates=");
        return AbstractC36095b.m114682j(sb4, this.f151056y, ", canUpdateFullPaymentMethodDetails=", this.f151057z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f151054w.name());
        dest.writeInt(this.f151055x ? 1 : 0);
        dest.writeInt(this.f151056y ? 1 : 0);
        dest.writeInt(this.f151057z ? 1 : 0);
    }
}
