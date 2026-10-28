package y00;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import va3.AbstractC35846d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: y00.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC38833g {
    /* JADX INFO: renamed from: a */
    public static C38806d2 m124345a(String input) {
        AbstractC22676k.m65750j(input, "input");
        for (int i13 = 0; i13 < input.length(); i13++) {
            char cCharAt = input.charAt(i13);
            if (!Character.isDigit(cCharAt) && !AbstractC35846d.m113784i(cCharAt) && cCharAt != '/') {
                return C38806d2.f166997f;
            }
        }
        StringBuilder sb4 = new StringBuilder();
        int length = input.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt2 = input.charAt(i14);
            if (Character.isDigit(cCharAt2)) {
                sb4.append(cCharAt2);
            }
        }
        String string = sb4.toString();
        return new C38806d2(AbstractC39414r.m125866L0(2, string), AbstractC39414r.m125878W(2, string));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ EnumC38853i m124346b(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -993787207:
                    if (str.equals("Diners Club")) {
                        return EnumC38853i.DinersClub;
                    }
                    break;
                case -298759312:
                    if (str.equals("American Express")) {
                        return EnumC38853i.AmericanExpress;
                    }
                    break;
                case -231891079:
                    if (str.equals("UnionPay")) {
                        return EnumC38853i.UnionPay;
                    }
                    break;
                case -46205774:
                    if (str.equals("MasterCard")) {
                        return EnumC38853i.MasterCard;
                    }
                    break;
                case 73257:
                    if (str.equals("JCB")) {
                        return EnumC38853i.JCB;
                    }
                    break;
                case 2666593:
                    if (str.equals("Visa")) {
                        return EnumC38853i.Visa;
                    }
                    break;
                case 337828873:
                    if (str.equals("Discover")) {
                        return EnumC38853i.Discover;
                    }
                    break;
            }
        }
        return EnumC38853i.Unknown;
    }

    /* JADX INFO: renamed from: c */
    public static final C23465k m124347c(Map cardPaymentMethodCreateParams) {
        AbstractC22676k.m65750j(cardPaymentMethodCreateParams, "cardPaymentMethodCreateParams");
        Object obj = cardPaymentMethodCreateParams.get("billing_details");
        Map map = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map != null ? map.get("address") : null;
        Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
        if (map2 == null) {
            return new C23465k("billing_address", AbstractC31061c.m95645u("country_code", Locale.getDefault().getCountry()));
        }
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("country_code", map2.get("country")), new C23465k("postal_code", map2.get("postal_code")), new C23465k("line_1", map2.get("line1")), new C23465k("line_2", map2.get("line2")), new C23465k("locality", map2.get("city")), new C23465k("administrative_area", map2.get("state")), new C23465k("name", map.get("name")));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM73990Y.entrySet()) {
            Object value = entry.getValue();
            if (value != null && value.toString().length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new C23465k("billing_address", linkedHashMap);
    }

    /* JADX INFO: renamed from: d */
    public static final EnumC38910o m124348d(AbstractC38970u5 abstractC38970u5) {
        AbstractC22676k.m65750j(abstractC38970u5, "<this>");
        if (abstractC38970u5 instanceof C38879k5) {
            return ((C38879k5) abstractC38970u5).f167328y;
        }
        if (abstractC38970u5 instanceof C38889l5) {
            return ((C38889l5) abstractC38970u5).f167406z;
        }
        if (abstractC38970u5 instanceof C38916o5) {
            return ((C38916o5) abstractC38970u5).f167531x;
        }
        if (abstractC38970u5 instanceof C38898m5) {
            return ((C38898m5) abstractC38970u5).f167447y;
        }
        if (abstractC38970u5 instanceof C38907n5) {
            return ((C38907n5) abstractC38970u5).f167478x;
        }
        if (abstractC38970u5 instanceof C38934q5) {
            return ((C38934q5) abstractC38970u5).f167603x;
        }
        if (abstractC38970u5 instanceof C38952s5) {
            return ((C38952s5) abstractC38970u5).f167666y;
        }
        if (abstractC38970u5 instanceof C38961t5) {
            return ((C38961t5) abstractC38970u5).f167703x;
        }
        if (abstractC38970u5 instanceof C38925p5) {
            return ((C38925p5) abstractC38970u5).f167554y;
        }
        throw new NoWhenBranchMatchedException();
    }
}
