package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25272z;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.u6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38971u6 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38971u6> CREATOR = new C38943r5(17);

    /* JADX INFO: renamed from: w */
    public final ArrayList f167743w;

    /* JADX INFO: renamed from: x */
    public final C38962t6 f167744x;

    public C38971u6(ArrayList arrayList, C38962t6 c38962t6) {
        this.f167743w = arrayList;
        this.f167744x = c38962t6;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        ArrayList arrayList = this.f167743w;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C38953s6) it.next()).mo124325c0());
        }
        Map mapM73989X = AbstractC25247g0.m73989X(new C23465k("items", arrayList2));
        Map map = C25272z.f99163w;
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(map, mapM73989X);
        C38962t6 c38962t6 = this.f167744x;
        Map mapM124385o = c38962t6 != null ? AbstractC38963t7.m124385o("shipping", c38962t6.mo124325c0()) : null;
        if (mapM124385o != null) {
            map = mapM124385o;
        }
        return AbstractC25247g0.m73995d0(linkedHashMapM73995d0, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38971u6)) {
            return false;
        }
        C38971u6 c38971u6 = (C38971u6) obj;
        return this.f167743w.equals(c38971u6.f167743w) && AbstractC22676k.m65745e(this.f167744x, c38971u6.f167744x);
    }

    public final int hashCode() {
        int iHashCode = this.f167743w.hashCode() * 31;
        C38962t6 c38962t6 = this.f167744x;
        return iHashCode + (c38962t6 == null ? 0 : c38962t6.hashCode());
    }

    public final String toString() {
        return "SourceOrderParams(items=" + this.f167743w + ", shipping=" + this.f167744x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        ArrayList arrayList = this.f167743w;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C38953s6) it.next()).writeToParcel(dest, i13);
        }
        C38962t6 c38962t6 = this.f167744x;
        if (c38962t6 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38962t6.writeToParcel(dest, i13);
        }
    }
}
