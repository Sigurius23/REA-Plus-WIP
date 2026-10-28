package h20;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import p599wz.C37708d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;

/* JADX INFO: renamed from: h20.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16688l0 extends AbstractC16700n0 {
    public static final Parcelable.Creator<C16688l0> CREATOR = new C16699n(4);

    /* JADX INFO: renamed from: E */
    public final C37708d f64182E;

    /* JADX INFO: renamed from: x */
    public final Throwable f64183x;

    /* JADX INFO: renamed from: y */
    public final AbstractC29840y f64184y;

    /* JADX INFO: renamed from: z */
    public final List f64185z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16688l0(Throwable th3, AbstractC29840y abstractC29840y, List list, C37708d linkAccountInfo) {
        super(0);
        AbstractC22676k.m65750j(linkAccountInfo, "linkAccountInfo");
        this.f64183x = th3;
        this.f64184y = abstractC29840y;
        this.f64185z = list;
        this.f64182E = linkAccountInfo;
    }

    @Override // h20.AbstractC16700n0
    /* JADX INFO: renamed from: b */
    public final C37708d mo47247b() {
        return this.f64182E;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16688l0)) {
            return false;
        }
        C16688l0 c16688l0 = (C16688l0) obj;
        return AbstractC22676k.m65745e(this.f64183x, c16688l0.f64183x) && AbstractC22676k.m65745e(this.f64184y, c16688l0.f64184y) && AbstractC22676k.m65745e(this.f64185z, c16688l0.f64185z) && AbstractC22676k.m65745e(this.f64182E, c16688l0.f64182E);
    }

    @Override // h20.AbstractC16700n0
    /* JADX INFO: renamed from: f */
    public final List mo47248f() {
        return this.f64185z;
    }

    public final int hashCode() {
        Throwable th3 = this.f64183x;
        int iHashCode = (th3 == null ? 0 : th3.hashCode()) * 31;
        AbstractC29840y abstractC29840y = this.f64184y;
        int iHashCode2 = (iHashCode + (abstractC29840y == null ? 0 : abstractC29840y.hashCode())) * 31;
        List list = this.f64185z;
        return this.f64182E.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Canceled(mostRecentError=" + this.f64183x + ", paymentSelection=" + this.f64184y + ", paymentMethods=" + this.f64185z + ", linkAccountInfo=" + this.f64182E + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f64183x);
        dest.writeParcelable(this.f64184y, i13);
        List list = this.f64185z;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable((Parcelable) it.next(), i13);
            }
        }
        this.f64182E.writeToParcel(dest, i13);
    }
}
