package mp;

import com.google.android.gms.internal.fido.zzhf;
import g73.C15553a;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: mp.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25813z0 extends AbstractC25755b1 {

    /* JADX INFO: renamed from: w */
    public final int f101563w;

    /* JADX INFO: renamed from: x */
    public final C25798s f101564x;

    public C25813z0(C25798s c25798s) throws zzhf {
        c25798s.getClass();
        this.f101564x = c25798s;
        AbstractC25763e0 abstractC25763e0Mo75982e = c25798s.entrySet().mo75982e();
        int i13 = 0;
        while (abstractC25763e0Mo75982e.hasNext()) {
            Map.Entry entry = (Map.Entry) abstractC25763e0Mo75982e.next();
            int iMo76006b = ((AbstractC25755b1) entry.getKey()).mo76006b();
            i13 = i13 < iMo76006b ? iMo76006b : i13;
            int iMo76006b2 = ((AbstractC25755b1) entry.getValue()).mo76006b();
            if (i13 < iMo76006b2) {
                i13 = iMo76006b2;
            }
        }
        int i14 = i13 + 1;
        this.f101563w = i14;
        if (i14 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // mp.AbstractC25755b1
    /* JADX INFO: renamed from: a */
    public final int mo75988a() {
        return AbstractC25755b1.m76004d((byte) -96);
    }

    @Override // mp.AbstractC25755b1
    /* JADX INFO: renamed from: b */
    public final int mo76006b() {
        return this.f101563w;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        AbstractC25755b1 abstractC25755b1 = (AbstractC25755b1) obj;
        int iMo75988a = abstractC25755b1.mo75988a();
        int iM76004d = AbstractC25755b1.m76004d((byte) -96);
        if (iM76004d != iMo75988a) {
            return iM76004d - abstractC25755b1.mo75988a();
        }
        C25798s c25798s = ((C25813z0) abstractC25755b1).f101564x;
        C25798s c25798s2 = this.f101564x;
        if (c25798s2.f101534z.size() != c25798s.f101534z.size()) {
            return c25798s2.f101534z.size() - c25798s.f101534z.size();
        }
        AbstractC25763e0 abstractC25763e0Mo75982e = c25798s2.entrySet().mo75982e();
        AbstractC25763e0 abstractC25763e0Mo75982e2 = c25798s.entrySet().mo75982e();
        do {
            if (!abstractC25763e0Mo75982e.hasNext() && !abstractC25763e0Mo75982e2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) abstractC25763e0Mo75982e.next();
            Map.Entry entry2 = (Map.Entry) abstractC25763e0Mo75982e2.next();
            int iCompareTo2 = ((AbstractC25755b1) entry.getKey()).compareTo((AbstractC25755b1) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((AbstractC25755b1) entry.getValue()).compareTo((AbstractC25755b1) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C25813z0.class == obj.getClass()) {
            return this.f101564x.equals(((C25813z0) obj).f101564x);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC25755b1.m76004d((byte) -96)), this.f101564x});
    }

    public final String toString() {
        C25798s c25798s = this.f101564x;
        if (c25798s.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC25763e0 abstractC25763e0Mo75982e = c25798s.entrySet().mo75982e();
        while (abstractC25763e0Mo75982e.hasNext()) {
            Map.Entry entry = (Map.Entry) abstractC25763e0Mo75982e.next();
            linkedHashMap.put(((AbstractC25755b1) entry.getKey()).toString().replace("\n", "\n  "), ((AbstractC25755b1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        C15553a c15553a = new C15553a(27);
        StringBuilder sb4 = new StringBuilder("{\n  ");
        try {
            AbstractC25753b.m75995g(sb4, linkedHashMap.entrySet().iterator(), c15553a);
            sb4.append("\n}");
            return sb4.toString();
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }
}
