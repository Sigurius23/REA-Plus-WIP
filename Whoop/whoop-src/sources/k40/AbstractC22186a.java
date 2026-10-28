package k40;

import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: k40.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC22186a {

    /* JADX INFO: renamed from: a */
    public static final Map f86059a = AbstractC25247g0.m73989X(new C23465k(AbstractC25260n.m74059b1(new String[]{"UGX", "AFN", "ALL", "AMD", "COP", "IDR", "ISK", "PKR", "LBP", "MMK", "LAK", "RSD"}), 2));

    /* JADX INFO: renamed from: a */
    public static int m63530a(Currency currency) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : f86059a.entrySet()) {
            Set set = (Set) entry.getKey();
            String currencyCode = currency.getCurrencyCode();
            AbstractC22676k.m65749i(currencyCode, "getCurrencyCode(...)");
            String upperCase = currencyCode.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            if (set.contains(upperCase)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        Integer num = (Integer) AbstractC25265s.m74100H0(arrayList);
        return num != null ? num.intValue() : currency.getDefaultFractionDigits();
    }
}
