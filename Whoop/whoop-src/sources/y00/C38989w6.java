package y00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.C25272z;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.w6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38989w6 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38989w6> CREATOR = new C38943r5(22);

    /* JADX INFO: renamed from: w */
    public C38793c f167827w;

    /* JADX INFO: renamed from: x */
    public String f167828x;

    /* JADX INFO: renamed from: y */
    public String f167829y;

    /* JADX INFO: renamed from: z */
    public String f167830z;

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C38793c c38793c = this.f167827w;
        Map mapM124385o = c38793c != null ? AbstractC38963t7.m124385o("address", c38793c.mo124325c0()) : null;
        Map map = C25272z.f99163w;
        if (mapM124385o == null) {
            mapM124385o = map;
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(map, mapM124385o);
        String str = this.f167828x;
        Map mapM95645u = str != null ? AbstractC31061c.m95645u(NotificationCompat.CATEGORY_EMAIL, str) : null;
        if (mapM95645u == null) {
            mapM95645u = map;
        }
        LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(linkedHashMapM73995d0, mapM95645u);
        String str2 = this.f167829y;
        Map mapM95645u2 = str2 != null ? AbstractC31061c.m95645u("name", str2) : null;
        if (mapM95645u2 == null) {
            mapM95645u2 = map;
        }
        LinkedHashMap linkedHashMapM73995d2 = AbstractC25247g0.m73995d0(linkedHashMapM73995d1, mapM95645u2);
        String str3 = this.f167830z;
        Map mapM95645u3 = str3 != null ? AbstractC31061c.m95645u("phone", str3) : null;
        if (mapM95645u3 != null) {
            map = mapM95645u3;
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
        if (!(obj instanceof C38989w6)) {
            return false;
        }
        C38989w6 c38989w6 = (C38989w6) obj;
        return AbstractC22676k.m65745e(this.f167827w, c38989w6.f167827w) && AbstractC22676k.m65745e(this.f167828x, c38989w6.f167828x) && AbstractC22676k.m65745e(this.f167829y, c38989w6.f167829y) && AbstractC22676k.m65745e(this.f167830z, c38989w6.f167830z);
    }

    public final int hashCode() {
        C38793c c38793c = this.f167827w;
        int iHashCode = (c38793c == null ? 0 : c38793c.hashCode()) * 31;
        String str = this.f167828x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167829y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167830z;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        C38793c c38793c = this.f167827w;
        String str = this.f167828x;
        String str2 = this.f167829y;
        String str3 = this.f167830z;
        StringBuilder sb4 = new StringBuilder("OwnerParams(address=");
        sb4.append(c38793c);
        sb4.append(", email=");
        sb4.append(str);
        sb4.append(", name=");
        return AbstractC11266d.m30464r(sb4, str2, ", phone=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C38793c c38793c = this.f167827w;
        if (c38793c == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38793c.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167828x);
        dest.writeString(this.f167829y);
        dest.writeString(this.f167830z);
    }
}
