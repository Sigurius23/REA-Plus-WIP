package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.C25272z;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.t6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38962t6 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38962t6> CREATOR = new C38943r5(19);

    /* JADX INFO: renamed from: E */
    public final String f167704E;

    /* JADX INFO: renamed from: w */
    public final C38793c f167705w;

    /* JADX INFO: renamed from: x */
    public final String f167706x;

    /* JADX INFO: renamed from: y */
    public final String f167707y;

    /* JADX INFO: renamed from: z */
    public final String f167708z;

    public C38962t6(C38793c address, String str, String str2, String str3, String str4) {
        AbstractC22676k.m65750j(address, "address");
        this.f167705w = address;
        this.f167706x = str;
        this.f167707y = str2;
        this.f167708z = str3;
        this.f167704E = str4;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        Map mapM124385o = AbstractC38963t7.m124385o("address", this.f167705w.mo124325c0());
        String str = this.f167706x;
        Map mapM95645u = str != null ? AbstractC31061c.m95645u("carrier", str) : null;
        Map map = C25272z.f99163w;
        if (mapM95645u == null) {
            mapM95645u = map;
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(mapM124385o, mapM95645u);
        String str2 = this.f167707y;
        Map mapM95645u2 = str2 != null ? AbstractC31061c.m95645u("name", str2) : null;
        if (mapM95645u2 == null) {
            mapM95645u2 = map;
        }
        LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(linkedHashMapM73995d0, mapM95645u2);
        String str3 = this.f167708z;
        Map mapM95645u3 = str3 != null ? AbstractC31061c.m95645u("phone", str3) : null;
        if (mapM95645u3 == null) {
            mapM95645u3 = map;
        }
        LinkedHashMap linkedHashMapM73995d2 = AbstractC25247g0.m73995d0(linkedHashMapM73995d1, mapM95645u3);
        String str4 = this.f167704E;
        Map mapM95645u4 = str4 != null ? AbstractC31061c.m95645u("tracking_number", str4) : null;
        if (mapM95645u4 != null) {
            map = mapM95645u4;
        }
        return AbstractC25247g0.m73995d0(linkedHashMapM73995d2, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38962t6)) {
            return false;
        }
        C38962t6 c38962t6 = (C38962t6) obj;
        return AbstractC22676k.m65745e(this.f167705w, c38962t6.f167705w) && AbstractC22676k.m65745e(this.f167706x, c38962t6.f167706x) && AbstractC22676k.m65745e(this.f167707y, c38962t6.f167707y) && AbstractC22676k.m65745e(this.f167708z, c38962t6.f167708z) && AbstractC22676k.m65745e(this.f167704E, c38962t6.f167704E);
    }

    public final int hashCode() {
        int iHashCode = this.f167705w.hashCode() * 31;
        String str = this.f167706x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167707y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167708z;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167704E;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Shipping(address=");
        sb4.append(this.f167705w);
        sb4.append(", carrier=");
        sb4.append(this.f167706x);
        sb4.append(", name=");
        AbstractC11266d.m30444B(sb4, this.f167707y, ", phone=", this.f167708z, ", trackingNumber=");
        return AbstractC25012a.m73376i(this.f167704E, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f167705w.writeToParcel(dest, i13);
        dest.writeString(this.f167706x);
        dest.writeString(this.f167707y);
        dest.writeString(this.f167708z);
        dest.writeString(this.f167704E);
    }
}
