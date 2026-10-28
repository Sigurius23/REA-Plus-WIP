package p473rz;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kz.AbstractC22907d;
import kz.EnumC22912i;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import n83.C26461d;
import n83.C26463f;
import n83.C26464g;
import p212i6.AbstractC18150c;
import p266jz.C22054b;
import p266jz.C22055c;
import p266jz.C22056d;
import p266jz.C22057e;
import p266jz.EnumC22053a;
import p507tx.AbstractC34235f;
import p664yy.AbstractC39877q;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import wb3.AbstractC37056f;
import y00.EnumC38922p2;
import y00.InterfaceC38866j2;
import yb3.AbstractC39414r;
import yv0.C39805h;

/* JADX INFO: renamed from: rz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C31921a {
    /* JADX INFO: renamed from: a */
    public static String m99363a(AbstractC22907d args, String str) {
        LinkedHashMap linkedHashMap;
        C22057e c22057eMo66639f = args.mo66639f();
        C22056d c22056d = c22057eMo66639f != null ? c22057eMo66639f.f85562F : null;
        AbstractC22676k.m65750j(args, "args");
        boolean z4 = AbstractC34235f.m108206N(args) == EnumC22912i.f90462x;
        C22057e c22057eMo66639f2 = args.mo66639f();
        EnumC38922p2 enumC38922p2 = c22057eMo66639f2 != null ? c22057eMo66639f2.f85566y : null;
        C22057e c22057eMo66639f3 = args.mo66639f();
        C22055c c22055c = c22057eMo66639f3 != null ? c22057eMo66639f3.f85561E : null;
        C22057e c22057eMo66639f4 = args.mo66639f();
        InterfaceC38866j2 interfaceC38866j2 = c22057eMo66639f4 != null ? c22057eMo66639f4.f85563G : null;
        C22057e c22057eMo66639f5 = args.mo66639f();
        EnumC22053a enumC22053a = c22057eMo66639f5 != null ? c22057eMo66639f5.f85567z : null;
        if (str == null) {
            return null;
        }
        ArrayList arrayListM118964P = AbstractC37056f.m118964P(str);
        if (z4) {
            arrayListM118964P.add("return_payment_method=true");
            arrayListM118964P.add("expand_payment_method=true");
            AbstractC30007c.m91854x("instantDebitsIncentive=", interfaceC38866j2 != null, arrayListM118964P);
            if (enumC38922p2 != null) {
                arrayListM118964P.add("link_mode=".concat(enumC38922p2.f167549w));
            }
            if (c22055c != null) {
                C22054b c22054b = c22055c.f85557z;
                if (c22054b != null) {
                    C26463f c26463f = new C26463f();
                    String str2 = c22054b.f85550w;
                    if (str2 != null) {
                    }
                    String str3 = c22054b.f85551x;
                    if (str3 != null) {
                    }
                    String str4 = c22054b.f85552y;
                    if (str4 != null) {
                    }
                    String str5 = c22054b.f85553z;
                    if (str5 != null) {
                    }
                    String str6 = c22054b.f85548E;
                    if (str6 != null) {
                    }
                    String str7 = c22054b.f85549F;
                    if (str7 != null) {
                        c26463f.put("country", str7);
                    }
                    C26463f c26463fM78380b = c26463f.m78380b();
                    linkedHashMap = new LinkedHashMap();
                    Object it = ((C26464g) c26463fM78380b.entrySet()).iterator();
                    while (((AbstractC18150c) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C26461d) it).next();
                        if (!AbstractC39414r.m125890i0((String) entry.getValue())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    linkedHashMap = null;
                }
                Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("name", c22055c.f85554w), new C23465k(NotificationCompat.CATEGORY_EMAIL, c22055c.f85556y), new C23465k("phone", c22055c.f85555x), new C23465k("address", linkedHashMap));
                C26463f c26463f2 = new C26463f();
                for (Map.Entry entry2 : mapM73990Y.entrySet()) {
                    Object key = entry2.getKey();
                    Object value = entry2.getValue();
                    if (value != null) {
                        c26463f2.put(key, value);
                    }
                }
                String strM74110N0 = AbstractC25265s.m74110N0(AbstractC39877q.m127950g(null, AbstractC39877q.m127945b(AbstractC25247g0.m73989X(new C23465k("billingDetails", c26463f2.m78380b())))), "&", null, null, new C39805h(10), 30);
                if (strM74110N0 == null) {
                    strM74110N0 = "";
                }
                arrayListM118964P.add(strM74110N0);
            }
            if (interfaceC38866j2 != null) {
                arrayListM118964P.add("incentiveEligibilitySession=" + interfaceC38866j2.getId());
            }
            if (enumC22053a != null) {
                arrayListM118964P.add("allow_redisplay=".concat(enumC22053a.f85547w));
            }
        }
        if (c22056d != null) {
            String str8 = c22056d.f85558w;
            if (str8 != null) {
                arrayListM118964P.add("email=".concat(str8));
            }
            String str9 = c22056d.f85559x;
            if (str9 != null) {
                arrayListM118964P.add("linkMobilePhone=".concat(str9));
            }
            String str10 = c22056d.f85560y;
            if (str10 != null) {
                arrayListM118964P.add("linkMobilePhoneCountry=".concat(str10));
            }
        }
        arrayListM118964P.add("launched_by=android_sdk");
        return AbstractC25265s.m74110N0(arrayListM118964P, "&", null, null, null, 62);
    }
}
