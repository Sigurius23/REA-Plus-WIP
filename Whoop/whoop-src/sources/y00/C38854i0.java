package y00;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38854i0 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38854i0> CREATOR = new C38873k(18);

    /* JADX INFO: renamed from: w */
    public final String f167264w;

    /* JADX INFO: renamed from: x */
    public final Boolean f167265x;

    /* JADX INFO: renamed from: y */
    public final Map f167266y;

    /* JADX INFO: renamed from: z */
    public final LinkedHashMap f167267z;

    public C38854i0(String id4, Boolean bool, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        AbstractC22676k.m65750j(id4, "id");
        this.f167264w = id4;
        this.f167265x = bool;
        this.f167266y = linkedHashMap;
        this.f167267z = linkedHashMap2;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = Boolean.TRUE;
        if (AbstractC22676k.m65745e(this.f167265x, bool)) {
            linkedHashMap.put("is_default", bool);
        }
        Map map = this.f167266y;
        if (map != null) {
            Object obj2 = map.get("card");
            Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
            if (map2 != null) {
                Object obj3 = map2.get("exp_month");
                if (obj3 != null) {
                    linkedHashMap.put("exp_month", obj3);
                }
                Object obj4 = map2.get("exp_year");
                if (obj4 != null) {
                    linkedHashMap.put("exp_year", obj4);
                }
                Object obj5 = map2.get("networks");
                Map map3 = obj5 instanceof Map ? (Map) obj5 : null;
                if (map3 != null && (obj = map3.get("preferred")) != null) {
                    linkedHashMap.put("preferred_network", obj);
                }
            }
            C23465k c23465kM124347c = AbstractC38833g.m124347c(map);
            linkedHashMap.put(c23465kM124347c.f92937w, c23465kM124347c.f92938x);
            Object obj6 = map.get("billing_details");
            Map map4 = obj6 instanceof Map ? (Map) obj6 : null;
            Object obj7 = map4 != null ? map4.get(NotificationCompat.CATEGORY_EMAIL) : null;
            String str = obj7 instanceof String ? (String) obj7 : null;
            if (str != null) {
                linkedHashMap.put("billing_email_address", str);
            }
        }
        LinkedHashMap linkedHashMap2 = this.f167267z;
        if (!linkedHashMap2.isEmpty()) {
            linkedHashMap.put("client_attribution_metadata", linkedHashMap2);
        }
        return linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38854i0)) {
            return false;
        }
        C38854i0 c38854i0 = (C38854i0) obj;
        return AbstractC22676k.m65745e(this.f167264w, c38854i0.f167264w) && AbstractC22676k.m65745e(this.f167265x, c38854i0.f167265x) && AbstractC22676k.m65745e(this.f167266y, c38854i0.f167266y) && this.f167267z.equals(c38854i0.f167267z);
    }

    public final int hashCode() {
        int iHashCode = this.f167264w.hashCode() * 31;
        Boolean bool = this.f167265x;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Map map = this.f167266y;
        return this.f167267z.hashCode() + ((iHashCode2 + (map != null ? map.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ConsumerPaymentDetailsUpdateParams(id=" + this.f167264w + ", isDefault=" + this.f167265x + ", cardPaymentMethodCreateParamsMap=" + this.f167266y + ", clientAttributionMetadataParams=" + this.f167267z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167264w);
        Boolean bool = this.f167265x;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
        Map map = this.f167266y;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                dest.writeString((String) entry.getKey());
                dest.writeValue(entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap = this.f167267z;
        dest.writeInt(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            dest.writeString((String) entry2.getKey());
            dest.writeString((String) entry2.getValue());
        }
    }
}
