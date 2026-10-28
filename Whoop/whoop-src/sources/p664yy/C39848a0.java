package p664yy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25265s;
import m83.C25272z;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: yy.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39848a0 extends AbstractC39856e0 {

    /* JADX INFO: renamed from: b */
    public static final C39848a0 f172096b = new C39848a0();

    /* JADX INFO: renamed from: c */
    public static final String f172097c = "Stripe/v1 ".concat("AndroidBindings/22.6.1");

    /* JADX INFO: renamed from: d */
    public static final C25272z f172098d = C25272z.f99163w;

    @Override // p664yy.AbstractC39856e0
    /* JADX INFO: renamed from: c */
    public final Map mo127928c() {
        return f172098d;
    }

    @Override // p664yy.AbstractC39856e0
    /* JADX INFO: renamed from: d */
    public final String mo127929d() {
        return f172097c;
    }

    @Override // p664yy.AbstractC39856e0
    /* JADX INFO: renamed from: e */
    public final String mo127930e() {
        LinkedHashMap linkedHashMapM127931b = AbstractC39856e0.m127931b();
        ArrayList arrayList = new ArrayList(linkedHashMapM127931b.size());
        for (Map.Entry entry : linkedHashMapM127931b.entrySet()) {
            arrayList.add(AbstractC2875y.m8300m("\"", (String) entry.getKey(), "\":\"", (String) entry.getValue(), "\""));
        }
        return AbstractC11895b.m31996o("{", AbstractC25265s.m74110N0(arrayList, ",", null, null, null, 62), "}");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C39848a0);
    }

    public final int hashCode() {
        return -334358835;
    }

    public final String toString() {
        return "Analytics";
    }
}
