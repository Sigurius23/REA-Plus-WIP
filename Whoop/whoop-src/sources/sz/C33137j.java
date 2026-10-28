package sz;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sz.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C33137j implements Parcelable {
    public static final Parcelable.Creator<C33137j> CREATOR = new C33133h(0);

    /* JADX INFO: renamed from: w */
    public final boolean f138203w;

    /* JADX INFO: renamed from: x */
    public final EnumC33135i f138204x;

    /* JADX INFO: renamed from: y */
    public final boolean f138205y;

    public C33137j(boolean z4, EnumC33135i format, boolean z13) {
        AbstractC22676k.m65750j(format, "format");
        this.f138203w = z4;
        this.f138204x = format;
        this.f138205y = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33137j)) {
            return false;
        }
        C33137j c33137j = (C33137j) obj;
        return this.f138203w == c33137j.f138203w && this.f138204x == c33137j.f138204x && this.f138205y == c33137j.f138205y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138205y) + ((this.f138204x.hashCode() + (Boolean.hashCode(this.f138203w) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BillingAddressConfig(isRequired=");
        sb4.append(this.f138203w);
        sb4.append(", format=");
        sb4.append(this.f138204x);
        sb4.append(", isPhoneNumberRequired=");
        return AbstractC18489d0.m53372m(sb4, this.f138205y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f138203w ? 1 : 0);
        dest.writeString(this.f138204x.name());
        dest.writeInt(this.f138205y ? 1 : 0);
    }
}
