package sz;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sz.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33122b0 implements Parcelable {
    public static final Parcelable.Creator<C33122b0> CREATOR = new C33133h(7);

    /* JADX INFO: renamed from: w */
    public final boolean f138163w;

    /* JADX INFO: renamed from: x */
    public final EnumC33120a0 f138164x;

    /* JADX INFO: renamed from: y */
    public final boolean f138165y;

    public C33122b0(boolean z4, EnumC33120a0 format, boolean z13) {
        AbstractC22676k.m65750j(format, "format");
        this.f138163w = z4;
        this.f138164x = format;
        this.f138165y = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33122b0)) {
            return false;
        }
        C33122b0 c33122b0 = (C33122b0) obj;
        return this.f138163w == c33122b0.f138163w && this.f138164x == c33122b0.f138164x && this.f138165y == c33122b0.f138165y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138165y) + ((this.f138164x.hashCode() + (Boolean.hashCode(this.f138163w) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BillingAddressConfig(isRequired=");
        sb4.append(this.f138163w);
        sb4.append(", format=");
        sb4.append(this.f138164x);
        sb4.append(", isPhoneNumberRequired=");
        return AbstractC18489d0.m53372m(sb4, this.f138165y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f138163w ? 1 : 0);
        dest.writeString(this.f138164x.name());
        dest.writeInt(this.f138165y ? 1 : 0);
    }
}
