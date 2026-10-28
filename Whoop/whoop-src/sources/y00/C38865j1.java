package y00;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.j1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38865j1 implements InterfaceC38875k1 {
    public static final Parcelable.Creator<C38865j1> CREATOR = new C38992x0(10);

    /* JADX INFO: renamed from: E */
    public final boolean f167298E;

    /* JADX INFO: renamed from: w */
    public final boolean f167299w;

    /* JADX INFO: renamed from: x */
    public final EnumC38885l1 f167300x;

    /* JADX INFO: renamed from: y */
    public final EnumC38894m1 f167301y;

    /* JADX INFO: renamed from: z */
    public final EnumC38941r3 f167302z;

    public C38865j1(boolean z4, EnumC38885l1 paymentMethodRemove, EnumC38894m1 paymentMethodRemoveLast, EnumC38941r3 enumC38941r3, boolean z13) {
        AbstractC22676k.m65750j(paymentMethodRemove, "paymentMethodRemove");
        AbstractC22676k.m65750j(paymentMethodRemoveLast, "paymentMethodRemoveLast");
        this.f167299w = z4;
        this.f167300x = paymentMethodRemove;
        this.f167301y = paymentMethodRemoveLast;
        this.f167302z = enumC38941r3;
        this.f167298E = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38865j1)) {
            return false;
        }
        C38865j1 c38865j1 = (C38865j1) obj;
        return this.f167299w == c38865j1.f167299w && this.f167300x == c38865j1.f167300x && this.f167301y == c38865j1.f167301y && this.f167302z == c38865j1.f167302z && this.f167298E == c38865j1.f167298E;
    }

    public final int hashCode() {
        int iHashCode = (this.f167301y.hashCode() + ((this.f167300x.hashCode() + (Boolean.hashCode(this.f167299w) * 31)) * 31)) * 31;
        EnumC38941r3 enumC38941r3 = this.f167302z;
        return Boolean.hashCode(this.f167298E) + ((iHashCode + (enumC38941r3 == null ? 0 : enumC38941r3.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Enabled(isPaymentMethodSaveEnabled=");
        sb4.append(this.f167299w);
        sb4.append(", paymentMethodRemove=");
        sb4.append(this.f167300x);
        sb4.append(", paymentMethodRemoveLast=");
        sb4.append(this.f167301y);
        sb4.append(", allowRedisplayOverride=");
        sb4.append(this.f167302z);
        sb4.append(", isPaymentMethodSetAsDefaultEnabled=");
        return AbstractC18489d0.m53372m(sb4, this.f167298E, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f167299w ? 1 : 0);
        dest.writeString(this.f167300x.name());
        dest.writeString(this.f167301y.name());
        EnumC38941r3 enumC38941r3 = this.f167302z;
        if (enumC38941r3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            enumC38941r3.writeToParcel(dest, i13);
        }
        dest.writeInt(this.f167298E ? 1 : 0);
    }
}
