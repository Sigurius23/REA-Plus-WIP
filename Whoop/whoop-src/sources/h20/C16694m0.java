package h20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.Iterator;
import java.util.List;
import p599wz.C37708d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;

/* JADX INFO: renamed from: h20.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16694m0 extends AbstractC16700n0 {
    public static final Parcelable.Creator<C16694m0> CREATOR = new C16699n(5);

    /* JADX INFO: renamed from: x */
    public final AbstractC29840y f64215x;

    /* JADX INFO: renamed from: y */
    public final C37708d f64216y;

    /* JADX INFO: renamed from: z */
    public final List f64217z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16694m0(AbstractC29840y paymentSelection, C37708d linkAccountInfo, List list) {
        super(-1);
        AbstractC22676k.m65750j(paymentSelection, "paymentSelection");
        AbstractC22676k.m65750j(linkAccountInfo, "linkAccountInfo");
        this.f64215x = paymentSelection;
        this.f64216y = linkAccountInfo;
        this.f64217z = list;
    }

    @Override // h20.AbstractC16700n0
    /* JADX INFO: renamed from: b */
    public final C37708d mo47247b() {
        return this.f64216y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16694m0)) {
            return false;
        }
        C16694m0 c16694m0 = (C16694m0) obj;
        return AbstractC22676k.m65745e(this.f64215x, c16694m0.f64215x) && AbstractC22676k.m65745e(this.f64216y, c16694m0.f64216y) && AbstractC22676k.m65745e(this.f64217z, c16694m0.f64217z);
    }

    @Override // h20.AbstractC16700n0
    /* JADX INFO: renamed from: f */
    public final List mo47248f() {
        return this.f64217z;
    }

    public final int hashCode() {
        int iHashCode = (this.f64216y.hashCode() + (this.f64215x.hashCode() * 31)) * 31;
        List list = this.f64217z;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Succeeded(paymentSelection=");
        sb4.append(this.f64215x);
        sb4.append(", linkAccountInfo=");
        sb4.append(this.f64216y);
        sb4.append(", paymentMethods=");
        return AbstractC3855a.m11829m(sb4, this.f64217z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f64215x, i13);
        this.f64216y.writeToParcel(dest, i13);
        List list = this.f64217z;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable((Parcelable) it.next(), i13);
        }
    }
}
