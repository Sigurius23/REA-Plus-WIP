package z10;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38821e7;
import y00.C38915o4;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: z10.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C39985h implements InterfaceC39987j {
    public static final Parcelable.Creator<C39985h> CREATOR = new C38821e7(27);

    /* JADX INFO: renamed from: E */
    public final boolean f172552E;

    /* JADX INFO: renamed from: w */
    public final InterfaceC38802c8 f172553w;

    /* JADX INFO: renamed from: x */
    public final C38915o4 f172554x;

    /* JADX INFO: renamed from: y */
    public final String f172555y;

    /* JADX INFO: renamed from: z */
    public final String f172556z;

    public C39985h(InterfaceC38802c8 interfaceC38802c8, C38915o4 paymentMethod, String str, String str2, boolean z4) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f172553w = interfaceC38802c8;
        this.f172554x = paymentMethod;
        this.f172555y = str;
        this.f172556z = str2;
        this.f172552E = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39985h)) {
            return false;
        }
        C39985h c39985h = (C39985h) obj;
        return AbstractC22676k.m65745e(this.f172553w, c39985h.f172553w) && AbstractC22676k.m65745e(this.f172554x, c39985h.f172554x) && AbstractC22676k.m65745e(this.f172555y, c39985h.f172555y) && AbstractC22676k.m65745e(this.f172556z, c39985h.f172556z) && this.f172552E == c39985h.f172552E;
    }

    public final int hashCode() {
        InterfaceC38802c8 interfaceC38802c8 = this.f172553w;
        int iHashCode = (this.f172554x.hashCode() + ((interfaceC38802c8 == null ? 0 : interfaceC38802c8.hashCode()) * 31)) * 31;
        String str = this.f172555y;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f172556z;
        return Boolean.hashCode(this.f172552E) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Completed(intent=");
        sb4.append(this.f172553w);
        sb4.append(", paymentMethod=");
        sb4.append(this.f172554x);
        sb4.append(", last4=");
        AbstractC11266d.m30444B(sb4, this.f172555y, ", bankName=", this.f172556z, ", eligibleForIncentive=");
        return AbstractC18489d0.m53372m(sb4, this.f172552E, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f172553w, i13);
        this.f172554x.writeToParcel(dest, i13);
        dest.writeString(this.f172555y);
        dest.writeString(this.f172556z);
        dest.writeInt(this.f172552E ? 1 : 0);
    }
}
