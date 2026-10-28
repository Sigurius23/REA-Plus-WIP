package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import n83.C26463f;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38814e0 implements InterfaceC38834g0 {
    public static final Parcelable.Creator<C38814e0> CREATOR = new C38873k(15);

    /* JADX INFO: renamed from: w */
    public final String f167053w;

    /* JADX INFO: renamed from: x */
    public final Map f167054x;

    /* JADX INFO: renamed from: y */
    public final String f167055y;

    /* JADX INFO: renamed from: z */
    public final Map f167056z;

    public C38814e0(String bankAccountId, LinkedHashMap linkedHashMap, String str, Map map) {
        AbstractC22676k.m65750j(bankAccountId, "bankAccountId");
        this.f167053w = bankAccountId;
        this.f167054x = linkedHashMap;
        this.f167055y = str;
        this.f167056z = map;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C26463f c26463f = new C26463f();
        String str = this.f167055y;
        if (str != null) {
            c26463f.put("billing_email_address", str);
        }
        Map map = this.f167054x;
        if (map != null && !map.isEmpty()) {
            c26463f.put("billing_address", map);
        }
        return AbstractC25247g0.m73995d0(AbstractC25247g0.m73995d0(AbstractC25247g0.m73990Y(new C23465k("type", "bank_account"), new C23465k("bank_account", AbstractC31061c.m95645u("account", this.f167053w))), c26463f.m78380b()), this.f167056z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38814e0)) {
            return false;
        }
        C38814e0 c38814e0 = (C38814e0) obj;
        return AbstractC22676k.m65745e(this.f167053w, c38814e0.f167053w) && AbstractC22676k.m65745e(this.f167054x, c38814e0.f167054x) && AbstractC22676k.m65745e(this.f167055y, c38814e0.f167055y) && AbstractC22676k.m65745e(this.f167056z, c38814e0.f167056z);
    }

    public final int hashCode() {
        int iHashCode = this.f167053w.hashCode() * 31;
        Map map = this.f167054x;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f167055y;
        return this.f167056z.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return AbstractC30007c.m91842l(AbstractC36095b.m114686n("BankAccount(bankAccountId=", this.f167053w, ", billingAddress=", ", billingEmailAddress=", this.f167054x), this.f167055y, ", clientAttributionMetadata=", this.f167056z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167053w);
        Map map = this.f167054x;
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
        dest.writeString(this.f167055y);
        Map map2 = this.f167056z;
        dest.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            dest.writeString((String) entry2.getKey());
            dest.writeValue(entry2.getValue());
        }
    }
}
