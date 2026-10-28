package p664yy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: yy.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39854d0 extends AbstractC39856e0 {

    /* JADX INFO: renamed from: b */
    public final Map f172124b;

    /* JADX INFO: renamed from: c */
    public final String f172125c = "Stripe/v1 ".concat("AndroidBindings/22.6.1");

    /* JADX INFO: renamed from: d */
    public final Map f172126d;

    public C39854d0(String str) {
        this.f172124b = AbstractC31061c.m95645u("Cookie", "m=".concat(str));
        EnumC39870l0 enumC39870l0 = EnumC39870l0.Form;
        this.f172126d = AbstractC31061c.m95645u("Content-Type", AbstractC11266d.m30461o("application/json; charset=", AbstractC39856e0.f172127a));
    }

    @Override // p664yy.AbstractC39856e0
    /* JADX INFO: renamed from: c */
    public final Map mo127928c() {
        return this.f172124b;
    }

    @Override // p664yy.AbstractC39856e0
    /* JADX INFO: renamed from: d */
    public final String mo127929d() {
        return this.f172125c;
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
}
