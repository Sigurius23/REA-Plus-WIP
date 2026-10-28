package y00;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.g1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38835g1 implements InterfaceC38845h1 {
    public static final Parcelable.Creator<C38835g1> CREATOR = new C38992x0(8);

    /* JADX INFO: renamed from: w */
    public final EnumC38885l1 f167155w;

    /* JADX INFO: renamed from: x */
    public final EnumC38894m1 f167156x;

    /* JADX INFO: renamed from: y */
    public final boolean f167157y;

    public C38835g1(EnumC38885l1 paymentMethodRemove, EnumC38894m1 paymentMethodRemoveLast, boolean z4) {
        AbstractC22676k.m65750j(paymentMethodRemove, "paymentMethodRemove");
        AbstractC22676k.m65750j(paymentMethodRemoveLast, "paymentMethodRemoveLast");
        this.f167155w = paymentMethodRemove;
        this.f167156x = paymentMethodRemoveLast;
        this.f167157y = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38835g1)) {
            return false;
        }
        C38835g1 c38835g1 = (C38835g1) obj;
        return this.f167155w == c38835g1.f167155w && this.f167156x == c38835g1.f167156x && this.f167157y == c38835g1.f167157y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167157y) + ((this.f167156x.hashCode() + (this.f167155w.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Enabled(paymentMethodRemove=");
        sb4.append(this.f167155w);
        sb4.append(", paymentMethodRemoveLast=");
        sb4.append(this.f167156x);
        sb4.append(", isPaymentMethodSyncDefaultEnabled=");
        return AbstractC18489d0.m53372m(sb4, this.f167157y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167155w.name());
        dest.writeString(this.f167156x.name());
        dest.writeInt(this.f167157y ? 1 : 0);
    }
}
