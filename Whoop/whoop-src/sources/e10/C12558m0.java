package e10;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p096dq.C12280x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e10.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12558m0 implements Parcelable {
    public static final Parcelable.Creator<C12558m0> CREATOR = new C12280x(20);

    /* JADX INFO: renamed from: w */
    public final String f42888w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC12555l f42889x;

    /* JADX INFO: renamed from: y */
    public final boolean f42890y;

    public C12558m0(String key, InterfaceC12555l confirmationOption, boolean z4) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
        this.f42888w = key;
        this.f42889x = confirmationOption;
        this.f42890y = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12558m0)) {
            return false;
        }
        C12558m0 c12558m0 = (C12558m0) obj;
        return AbstractC22676k.m65745e(this.f42888w, c12558m0.f42888w) && AbstractC22676k.m65745e(this.f42889x, c12558m0.f42889x) && this.f42890y == c12558m0.f42890y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42890y) + ((this.f42889x.hashCode() + (this.f42888w.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AwaitingConfirmationResultData(key=");
        sb4.append(this.f42888w);
        sb4.append(", confirmationOption=");
        sb4.append(this.f42889x);
        sb4.append(", receivesResultInProcess=");
        return AbstractC18489d0.m53372m(sb4, this.f42890y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f42888w);
        dest.writeParcelable(this.f42889x, i13);
        dest.writeInt(this.f42890y ? 1 : 0);
    }
}
