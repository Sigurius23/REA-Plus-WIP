package i10;

import android.os.Parcel;
import android.os.Parcelable;
import e10.InterfaceC12555l;
import gp.C16054r0;
import h20.C16767y1;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38977v3;

/* JADX INFO: renamed from: i10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C17852b implements InterfaceC12555l {
    public static final Parcelable.Creator<C17852b> CREATOR = new C16054r0(15);

    /* JADX INFO: renamed from: w */
    public final C16767y1 f69471w;

    /* JADX INFO: renamed from: x */
    public final C38977v3 f69472x;

    public C17852b(C16767y1 customPaymentMethodType, C38977v3 c38977v3) {
        AbstractC22676k.m65750j(customPaymentMethodType, "customPaymentMethodType");
        this.f69471w = customPaymentMethodType;
        this.f69472x = c38977v3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17852b)) {
            return false;
        }
        C17852b c17852b = (C17852b) obj;
        return AbstractC22676k.m65745e(this.f69471w, c17852b.f69471w) && AbstractC22676k.m65745e(this.f69472x, c17852b.f69472x);
    }

    public final int hashCode() {
        int iHashCode = this.f69471w.hashCode() * 31;
        C38977v3 c38977v3 = this.f69472x;
        return iHashCode + (c38977v3 == null ? 0 : c38977v3.hashCode());
    }

    public final String toString() {
        return "CustomPaymentMethodConfirmationOption(customPaymentMethodType=" + this.f69471w + ", billingDetails=" + this.f69472x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f69471w.writeToParcel(dest, i13);
        dest.writeParcelable(this.f69472x, i13);
    }
}
