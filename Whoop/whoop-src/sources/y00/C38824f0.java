package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38824f0 implements InterfaceC38834g0 {
    public static final Parcelable.Creator<C38824f0> CREATOR = new C38873k(16);

    /* JADX INFO: renamed from: w */
    public final LinkedHashMap f167080w;

    /* JADX INFO: renamed from: x */
    public final String f167081x;

    public C38824f0(LinkedHashMap linkedHashMap, String email) {
        AbstractC22676k.m65750j(email, "email");
        this.f167080w = linkedHashMap;
        this.f167081x = email;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("type", "card"), new C23465k("active", Boolean.TRUE), new C23465k("billing_email_address", this.f167081x));
        LinkedHashMap linkedHashMap = this.f167080w;
        C23465k c23465kM124347c = AbstractC38833g.m124347c(linkedHashMap);
        linkedHashMapM73993b0.put(c23465kM124347c.f92937w, c23465kM124347c.f92938x);
        Object obj = linkedHashMap.get("client_attribution_metadata");
        if (obj != null) {
            linkedHashMapM73993b0.putAll(AbstractC25247g0.m73989X(new C23465k("client_attribution_metadata", obj)));
        }
        Object obj2 = linkedHashMap.get("card");
        Map map = obj2 instanceof Map ? (Map) obj2 : null;
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (AbstractC25265s.m74155w0(AbstractC25260n.m74059b1(new String[]{"number", "exp_month", "exp_year"}), entry.getKey())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(linkedHashMap2);
            Object obj3 = map.get("networks");
            Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
            Object obj4 = map2 != null ? map2.get("preferred") : null;
            String str = obj4 instanceof String ? (String) obj4 : null;
            if (str != null) {
                linkedHashMapM74003l0.put("preferred_network", str);
            }
            linkedHashMapM73993b0.put("card", AbstractC25247g0.m74001j0(linkedHashMapM74003l0));
        }
        return linkedHashMapM73993b0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38824f0)) {
            return false;
        }
        C38824f0 c38824f0 = (C38824f0) obj;
        return this.f167080w.equals(c38824f0.f167080w) && AbstractC22676k.m65745e(this.f167081x, c38824f0.f167081x);
    }

    public final int hashCode() {
        return this.f167081x.hashCode() + (this.f167080w.hashCode() * 31);
    }

    public final String toString() {
        return "Card(cardPaymentMethodCreateParamsMap=" + this.f167080w + ", email=" + this.f167081x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        LinkedHashMap linkedHashMap = this.f167080w;
        dest.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeValue(entry.getValue());
        }
        dest.writeString(this.f167081x);
    }
}
