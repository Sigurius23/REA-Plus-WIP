package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ux.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C35338j implements Parcelable {
    public static final Parcelable.Creator<C35338j> CREATOR = new C35332g(1);

    /* JADX INFO: renamed from: w */
    public final boolean f150548w;

    /* JADX INFO: renamed from: x */
    public final EnumC35336i f150549x;

    /* JADX INFO: renamed from: y */
    public final boolean f150550y;

    public C35338j(boolean z4, EnumC35336i format, boolean z13) {
        AbstractC22676k.m65750j(format, "format");
        this.f150548w = z4;
        this.f150549x = format;
        this.f150550y = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35338j)) {
            return false;
        }
        C35338j c35338j = (C35338j) obj;
        return this.f150548w == c35338j.f150548w && this.f150549x == c35338j.f150549x && this.f150550y == c35338j.f150550y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f150550y) + ((this.f150549x.hashCode() + (Boolean.hashCode(this.f150548w) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BillingAddressParameters(isRequired=");
        sb4.append(this.f150548w);
        sb4.append(", format=");
        sb4.append(this.f150549x);
        sb4.append(", isPhoneNumberRequired=");
        return AbstractC18489d0.m53372m(sb4, this.f150550y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f150548w ? 1 : 0);
        dest.writeString(this.f150549x.name());
        dest.writeInt(this.f150550y ? 1 : 0);
    }
}
