package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.s6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38953s6 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38953s6> CREATOR = new C38943r5(18);

    /* JADX INFO: renamed from: E */
    public final String f167667E;

    /* JADX INFO: renamed from: F */
    public final Integer f167668F;

    /* JADX INFO: renamed from: w */
    public final EnumC38944r6 f167669w;

    /* JADX INFO: renamed from: x */
    public final Integer f167670x;

    /* JADX INFO: renamed from: y */
    public final String f167671y;

    /* JADX INFO: renamed from: z */
    public final String f167672z;

    public C38953s6(EnumC38944r6 enumC38944r6, Integer num, String str, String str2, String str3, Integer num2) {
        this.f167669w = enumC38944r6;
        this.f167670x = num;
        this.f167671y = str;
        this.f167672z = str2;
        this.f167667E = str3;
        this.f167668F = num2;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        Integer num = this.f167670x;
        Map mapM73989X = num != null ? AbstractC25247g0.m73989X(new C23465k("amount", Integer.valueOf(num.intValue()))) : null;
        Map map = C25272z.f99163w;
        if (mapM73989X == null) {
            mapM73989X = map;
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(map, mapM73989X);
        String str = this.f167671y;
        Map mapM95645u = str != null ? AbstractC31061c.m95645u("currency", str) : null;
        if (mapM95645u == null) {
            mapM95645u = map;
        }
        LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(linkedHashMapM73995d0, mapM95645u);
        String str2 = this.f167672z;
        Map mapM95645u2 = str2 != null ? AbstractC31061c.m95645u("description", str2) : null;
        if (mapM95645u2 == null) {
            mapM95645u2 = map;
        }
        LinkedHashMap linkedHashMapM73995d2 = AbstractC25247g0.m73995d0(linkedHashMapM73995d1, mapM95645u2);
        String str3 = this.f167667E;
        Map mapM95645u3 = str3 != null ? AbstractC31061c.m95645u("parent", str3) : null;
        if (mapM95645u3 == null) {
            mapM95645u3 = map;
        }
        LinkedHashMap linkedHashMapM73995d3 = AbstractC25247g0.m73995d0(linkedHashMapM73995d2, mapM95645u3);
        Integer num2 = this.f167668F;
        Map mapM73989X2 = num2 != null ? AbstractC25247g0.m73989X(new C23465k("quantity", Integer.valueOf(num2.intValue()))) : null;
        if (mapM73989X2 == null) {
            mapM73989X2 = map;
        }
        LinkedHashMap linkedHashMapM73995d4 = AbstractC25247g0.m73995d0(linkedHashMapM73995d3, mapM73989X2);
        EnumC38944r6 enumC38944r6 = this.f167669w;
        Map mapM95645u4 = enumC38944r6 != null ? AbstractC31061c.m95645u("type", enumC38944r6.f167640w) : null;
        if (mapM95645u4 != null) {
            map = mapM95645u4;
        }
        return AbstractC25247g0.m73995d0(linkedHashMapM73995d4, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38953s6)) {
            return false;
        }
        C38953s6 c38953s6 = (C38953s6) obj;
        return this.f167669w == c38953s6.f167669w && AbstractC22676k.m65745e(this.f167670x, c38953s6.f167670x) && AbstractC22676k.m65745e(this.f167671y, c38953s6.f167671y) && AbstractC22676k.m65745e(this.f167672z, c38953s6.f167672z) && AbstractC22676k.m65745e(this.f167667E, c38953s6.f167667E) && AbstractC22676k.m65745e(this.f167668F, c38953s6.f167668F);
    }

    public final int hashCode() {
        EnumC38944r6 enumC38944r6 = this.f167669w;
        int iHashCode = (enumC38944r6 == null ? 0 : enumC38944r6.hashCode()) * 31;
        Integer num = this.f167670x;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f167671y;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167672z;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167667E;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f167668F;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Item(type=");
        sb4.append(this.f167669w);
        sb4.append(", amount=");
        sb4.append(this.f167670x);
        sb4.append(", currency=");
        AbstractC11266d.m30444B(sb4, this.f167671y, ", description=", this.f167672z, ", parent=");
        sb4.append(this.f167667E);
        sb4.append(", quantity=");
        sb4.append(this.f167668F);
        sb4.append(")");
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        EnumC38944r6 enumC38944r6 = this.f167669w;
        if (enumC38944r6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38944r6.name());
        }
        Integer num = this.f167670x;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.f167671y);
        dest.writeString(this.f167672z);
        dest.writeString(this.f167667E);
        Integer num2 = this.f167668F;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
    }
}
