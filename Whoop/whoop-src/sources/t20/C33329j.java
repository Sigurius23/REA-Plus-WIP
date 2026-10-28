package t20;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import s40.AbstractC32145e0;
import xb3.C38173h;
import yb3.C39412p;
import yb3.EnumC39413q;

/* JADX INFO: renamed from: t20.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C33329j {
    /* JADX INFO: renamed from: a */
    public static int m105695a(int i13, String str) {
        if (str == null) {
            return i13;
        }
        EnumC39413q enumC39413q = EnumC39413q.IGNORE_CASE;
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k(new C39412p("Bank of America", 0), "boa"), new C23465k(new C39412p("Capital One", 0), "capitalone"), new C23465k(new C39412p("Citibank", 0), "citibank"), new C23465k(new C39412p("BBVA|COMPASS", 0), "compass"), new C23465k(new C39412p("MORGAN CHASE|JP MORGAN|Chase", 0), "morganchase"), new C23465k(new C39412p("NAVY FEDERAL CREDIT UNION", 0), "nfcu"), new C23465k(new C39412p("PNC\\s?BANK|PNC Bank", 0), "pnc"), new C23465k(new C39412p("SUNTRUST|SunTrust Bank", 0), "suntrust"), new C23465k(new C39412p("Silicon Valley Bank", 0), "svb"), new C23465k(new C39412p("Stripe|TestInstitution|Test Institution", 0), "stripe"), new C23465k(new C39412p("TD Bank", 0), "td"), new C23465k(new C39412p("USAA FEDERAL SAVINGS BANK|USAA Bank", 0), "usaa"), new C23465k(new C39412p("U\\.?S\\. BANK|US Bank", 0), "usbank"), new C23465k(new C39412p("Wells Fargo", 0), "wellsfargo"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM73990Y.entrySet()) {
            if (((C38173h) C39412p.m125847b(str, (C39412p) entry.getKey()).iterator()).hasNext()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        Integer numValueOf = it.hasNext() ? Integer.valueOf(AbstractC32145e0.m100102i(i13, (String) ((Map.Entry) it.next()).getValue())) : null;
        return numValueOf != null ? numValueOf.intValue() : i13;
    }
}
