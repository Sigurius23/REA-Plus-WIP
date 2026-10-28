package h20;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: h20.g3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16661g3 implements Parcelable {
    public static final Parcelable.Creator<C16661g3> CREATOR = new C16654f2(15);

    /* JADX INFO: renamed from: E */
    public final List f64067E;

    /* JADX INFO: renamed from: F */
    public final ArrayList f64068F;

    /* JADX INFO: renamed from: G */
    public final ArrayList f64069G;

    /* JADX INFO: renamed from: w */
    public final String f64070w;

    /* JADX INFO: renamed from: x */
    public final boolean f64071x;

    /* JADX INFO: renamed from: y */
    public final boolean f64072y;

    /* JADX INFO: renamed from: z */
    public final boolean f64073z;

    public C16661g3(String shopId, boolean z4, boolean z13, boolean z14, ArrayList allowedShippingCountries, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC22676k.m65750j(shopId, "shopId");
        AbstractC22676k.m65750j(allowedShippingCountries, "allowedShippingCountries");
        this.f64070w = shopId;
        this.f64071x = z4;
        this.f64072y = z13;
        this.f64073z = z14;
        this.f64067E = allowedShippingCountries;
        this.f64068F = arrayList;
        this.f64069G = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16661g3)) {
            return false;
        }
        C16661g3 c16661g3 = (C16661g3) obj;
        return AbstractC22676k.m65745e(this.f64070w, c16661g3.f64070w) && this.f64071x == c16661g3.f64071x && this.f64072y == c16661g3.f64072y && this.f64073z == c16661g3.f64073z && AbstractC22676k.m65745e(this.f64067E, c16661g3.f64067E) && this.f64068F.equals(c16661g3.f64068F) && this.f64069G.equals(c16661g3.f64069G);
    }

    public final int hashCode() {
        return this.f64069G.hashCode() + ((this.f64068F.hashCode() + AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.f64070w.hashCode() * 31, 31, this.f64071x), 31, this.f64072y), 31, this.f64073z), 31, this.f64067E)) * 31);
    }

    public final String toString() {
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ShopPayConfiguration(shopId=", this.f64070w, ", billingAddressRequired=", ", emailRequired=", this.f64071x);
        AbstractC38963t7.m124392v(sbM73379l, this.f64072y, ", shippingAddressRequired=", this.f64073z, ", allowedShippingCountries=");
        sbM73379l.append(this.f64067E);
        sbM73379l.append(", lineItems=");
        sbM73379l.append(this.f64068F);
        sbM73379l.append(", shippingRates=");
        sbM73379l.append(this.f64069G);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f64070w);
        dest.writeInt(this.f64071x ? 1 : 0);
        dest.writeInt(this.f64072y ? 1 : 0);
        dest.writeInt(this.f64073z ? 1 : 0);
        dest.writeStringList(this.f64067E);
        ArrayList arrayList = this.f64068F;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C16649e3) it.next()).writeToParcel(dest, i13);
        }
        ArrayList arrayList2 = this.f64069G;
        dest.writeInt(arrayList2.size());
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ((C16655f3) it3.next()).writeToParcel(dest, i13);
        }
    }
}
