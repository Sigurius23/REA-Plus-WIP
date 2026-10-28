package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import com.mapbox.maps.MapboxMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p127ev.AbstractC13673n;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.v2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38976v2 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38976v2> CREATOR = new C38967u2(0);

    /* JADX INFO: renamed from: E */
    public final String f167768E;

    /* JADX INFO: renamed from: w */
    public final String f167769w;

    /* JADX INFO: renamed from: x */
    public final EnumC38828f4 f167770x;

    /* JADX INFO: renamed from: y */
    public final Integer f167771y;

    /* JADX INFO: renamed from: z */
    public final String f167772z;

    public C38976v2(String customerId, EnumC38828f4 paymentMethodType, Integer num, String str, String str2) {
        AbstractC22676k.m65750j(customerId, "customerId");
        AbstractC22676k.m65750j(paymentMethodType, "paymentMethodType");
        this.f167769w = customerId;
        this.f167770x = paymentMethodType;
        this.f167771y = num;
        this.f167772z = str;
        this.f167768E = str2;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C25272z c25272z = C25272z.f99163w;
        Map mapM73995d0 = c25272z;
        for (C23465k c23465k : AbstractC37056f.m118959K(new C23465k("customer", this.f167769w), new C23465k("type", this.f167770x.f167132w), new C23465k(MapboxMap.QFE_LIMIT, this.f167771y), new C23465k("ending_before", this.f167772z), new C23465k("starting_after", this.f167768E))) {
            String str = (String) c23465k.f92937w;
            Object obj = c23465k.f92938x;
            Map mapM114689q = obj != null ? AbstractC36095b.m114689q(obj, str) : null;
            if (mapM114689q == null) {
                mapM114689q = c25272z;
            }
            mapM73995d0 = AbstractC25247g0.m73995d0(mapM73995d0, mapM114689q);
        }
        return mapM73995d0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38976v2)) {
            return false;
        }
        C38976v2 c38976v2 = (C38976v2) obj;
        return AbstractC22676k.m65745e(this.f167769w, c38976v2.f167769w) && this.f167770x == c38976v2.f167770x && AbstractC22676k.m65745e(this.f167771y, c38976v2.f167771y) && AbstractC22676k.m65745e(this.f167772z, c38976v2.f167772z) && AbstractC22676k.m65745e(this.f167768E, c38976v2.f167768E);
    }

    public final int hashCode() {
        int iHashCode = (this.f167770x.hashCode() + (this.f167769w.hashCode() * 31)) * 31;
        Integer num = this.f167771y;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f167772z;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167768E;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ListPaymentMethodsParams(customerId=");
        sb4.append(this.f167769w);
        sb4.append(", paymentMethodType=");
        sb4.append(this.f167770x);
        sb4.append(", limit=");
        AbstractC13673n.m38577x(this.f167771y, ", endingBefore=", this.f167772z, ", startingAfter=", sb4);
        return AbstractC25012a.m73376i(this.f167768E, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167769w);
        this.f167770x.writeToParcel(dest, i13);
        Integer num = this.f167771y;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.f167772z);
        dest.writeString(this.f167768E);
    }
}
