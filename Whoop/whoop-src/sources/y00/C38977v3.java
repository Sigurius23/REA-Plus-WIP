package y00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import m83.C25272z;
import p000.AbstractC11266d;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.v3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38977v3 implements InterfaceC36562b, InterfaceC38822e8 {
    public static final Parcelable.Creator<C38977v3> CREATOR = new C38967u2(16);

    /* JADX INFO: renamed from: w */
    public final C38793c f167773w;

    /* JADX INFO: renamed from: x */
    public final String f167774x;

    /* JADX INFO: renamed from: y */
    public final String f167775y;

    /* JADX INFO: renamed from: z */
    public final String f167776z;

    public /* synthetic */ C38977v3(String str, String str2, int i13) {
        this(null, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, null);
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C38793c c38793c = this.f167773w;
        Map mapM124385o = c38793c != null ? AbstractC38963t7.m124385o("address", c38793c.mo124325c0()) : null;
        Map map = C25272z.f99163w;
        if (mapM124385o == null) {
            mapM124385o = map;
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(map, mapM124385o);
        String str = this.f167774x;
        Map mapM95645u = str != null ? AbstractC31061c.m95645u(NotificationCompat.CATEGORY_EMAIL, str) : null;
        if (mapM95645u == null) {
            mapM95645u = map;
        }
        LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(linkedHashMapM73995d0, mapM95645u);
        String str2 = this.f167775y;
        Map mapM95645u2 = str2 != null ? AbstractC31061c.m95645u("name", str2) : null;
        if (mapM95645u2 == null) {
            mapM95645u2 = map;
        }
        LinkedHashMap linkedHashMapM73995d2 = AbstractC25247g0.m73995d0(linkedHashMapM73995d1, mapM95645u2);
        String str3 = this.f167776z;
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
        if (!(obj instanceof C38977v3)) {
            return false;
        }
        C38977v3 c38977v3 = (C38977v3) obj;
        return AbstractC22676k.m65745e(this.f167773w, c38977v3.f167773w) && AbstractC22676k.m65745e(this.f167774x, c38977v3.f167774x) && AbstractC22676k.m65745e(this.f167775y, c38977v3.f167775y) && AbstractC22676k.m65745e(this.f167776z, c38977v3.f167776z);
    }

    public final int hashCode() {
        C38793c c38793c = this.f167773w;
        int iHashCode = (c38793c == null ? 0 : c38793c.hashCode()) * 31;
        String str = this.f167774x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167775y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167776z;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("BillingDetails(address=");
        sb4.append(this.f167773w);
        sb4.append(", email=");
        sb4.append(this.f167774x);
        sb4.append(", name=");
        return AbstractC11266d.m30464r(sb4, this.f167775y, ", phone=", this.f167776z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C38793c c38793c = this.f167773w;
        if (c38793c == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38793c.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167774x);
        dest.writeString(this.f167775y);
        dest.writeString(this.f167776z);
    }

    public C38977v3(C38793c c38793c, String str, String str2, String str3) {
        this.f167773w = c38793c;
        this.f167774x = str;
        this.f167775y = str2;
        this.f167776z = str3;
    }
}
