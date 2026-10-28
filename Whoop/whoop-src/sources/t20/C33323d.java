package t20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38915o4;

/* JADX INFO: renamed from: t20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C33323d implements InterfaceC33325f {
    public static final Parcelable.Creator<C33323d> CREATOR = new C33320a(2);

    /* JADX INFO: renamed from: w */
    public final C38915o4 f139005w;

    public C33323d(C38915o4 paymentMethod) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f139005w = paymentMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33323d) && AbstractC22676k.m65745e(this.f139005w, ((C33323d) obj).f139005w);
    }

    public final int hashCode() {
        return this.f139005w.hashCode();
    }

    public final String toString() {
        return "PaymentMethod(paymentMethod=" + this.f139005w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f139005w, i13);
    }
}
