package p565vy;

import com.stripe.android.core.model.C5597b;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import p705ea2.C12915l;
import p715kotlin.jvm.internal.AbstractC22676k;
import tx0.C34238a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: vy.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC36561a {

    /* JADX INFO: renamed from: c */
    public static volatile Locale f156564c;

    /* JADX INFO: renamed from: a */
    public static final Set f156562a = AbstractC25260n.m74059b1(new String[]{"AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CV", "CW", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MK", "ML", "MM", "MN", "MO", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SZ", "TA", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VN", "VU", "WF", "WS", "XK", "YE", "YT", "ZA", "ZM", "ZW"});

    /* JADX INFO: renamed from: b */
    public static final Set f156563b = AbstractC25260n.m74059b1(new String[]{"US", "GB", "CA"});

    /* JADX INFO: renamed from: d */
    public static volatile Object f156565d = C25271y.f99162w;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Country m117288a(CountryCode countryCode, Locale currentLocale) {
        Object next;
        AbstractC22676k.m65750j(currentLocale, "currentLocale");
        Iterator it = m117289b(currentLocale).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (AbstractC22676k.m65745e(((Country) next).getCode(), countryCode)) {
                return (Country) next;
            }
        }
        next = null;
        return (Country) next;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public static List m117289b(Locale locale) {
        Object next;
        CountryCode code;
        String country;
        if (AbstractC22676k.m65745e(locale, f156564c)) {
            return f156565d;
        }
        Set<String> set = f156562a;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(set, 10));
        for (String str : set) {
            CountryCode.Companion.getClass();
            CountryCode countryCodeM16833a = C5597b.m16833a(str);
            String displayCountry = new Locale("", str).getDisplayCountry(locale);
            AbstractC22676k.m65749i(displayCountry, "getDisplayCountry(...)");
            arrayList.add(new Country(countryCodeM16833a, displayCountry));
        }
        Collator collator = Collator.getInstance(locale);
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            code = ((Country) next).getCode();
            AbstractC22676k.m65750j(locale, "<this>");
            C5597b c5597b = CountryCode.Companion;
            country = locale.getCountry();
            AbstractC22676k.m65749i(country, "getCountry(...)");
            c5597b.getClass();
        } while (!AbstractC22676k.m65745e(code, C5597b.m16833a(country)));
        List listM118960L = AbstractC37056f.m118960L(next);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            CountryCode code2 = ((Country) obj).getCode();
            AbstractC22676k.m65750j(locale, "<this>");
            C5597b c5597b2 = CountryCode.Companion;
            String country2 = locale.getCountry();
            AbstractC22676k.m65749i(country2, "getCountry(...)");
            c5597b2.getClass();
            if (!AbstractC22676k.m65745e(code2, C5597b.m16833a(country2))) {
                arrayList2.add(obj);
            }
        }
        f156565d = AbstractC25265s.m74129g1(listM118960L, AbstractC25265s.m74152u1(arrayList2, new C12915l(new C34238a(collator, 29), 13)));
        f156564c = locale;
        return f156565d;
    }
}
