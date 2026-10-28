package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16026d0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16026d0> CREATOR = new C16040k0(14);

    /* JADX INFO: renamed from: w */
    public final List f60638w;

    public C16026d0(ArrayList arrayList) {
        this.f60638w = arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final JSONArray m45342b() {
        try {
            JSONArray jSONArray = new JSONArray();
            List list = this.f60638w;
            if (list != null) {
                for (int i13 = 0; i13 < list.size(); i13++) {
                    C16028e0 c16028e0 = (C16028e0) list.get(i13);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put((int) c16028e0.f60646y);
                    jSONArray2.put((int) c16028e0.f60645x);
                    jSONArray2.put((int) c16028e0.f60646y);
                    jSONArray.put(i13, jSONArray2);
                }
            }
            return jSONArray;
        } catch (JSONException e5) {
            throw new RuntimeException("Error encoding UvmEntries to JSON object", e5);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16026d0)) {
            return false;
        }
        List list = ((C16026d0) obj).f60638w;
        List list2 = this.f60638w;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        List list = this.f60638w;
        return Arrays.hashCode(new Object[]{list == null ? null : new HashSet(list)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115336q(parcel, 1, this.f60638w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
