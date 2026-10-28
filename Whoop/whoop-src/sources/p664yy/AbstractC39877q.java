package p664yy;

import ad3.AbstractC0770m;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.InvalidSerializationException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import l83.C23454a0;
import l83.C23465k;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import org.json.JSONException;
import org.json.JSONObject;
import p012ab.C0684i0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p442qy.C30767f;
import p505ts.AbstractC34132o;
import p565vy.InterfaceC36562b;
import p598wy.C37688a;
import p598wy.InterfaceC37689b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import wb3.AbstractC37056f;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: yy.q */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC39877q {

    /* JADX INFO: renamed from: a */
    public static final C39878r f172194a = new C39878r();

    /* JADX INFO: renamed from: a */
    public static final APIException m127944a(C37688a c37688a, C39874n0 c39874n0) throws APIException {
        JSONObject jSONObjectM127952i = m127952i(c39874n0);
        c37688a.getClass();
        C30767f c30767fM121114b = C37688a.m121114b(jSONObjectM127952i);
        C39858f0 c39858f0 = c39874n0.f172191f;
        return new APIException(c39874n0.f172186a, 24, c39858f0 != null ? c39858f0.f172131a : null, null, null, c30767fM121114b);
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m127945b(Map params) {
        AbstractC22676k.m65750j(params, "params");
        HashMap map = new HashMap(params);
        Iterator it = new HashSet(map.keySet()).iterator();
        AbstractC22676k.m65749i(it, "iterator(...)");
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj instanceof Map) {
                map.put(str, m127945b((Map) obj));
            } else if (obj == null) {
                map.remove(str);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static final APIConnectionException m127946c(AbstractC39872m0 abstractC39872m0, Throwable th3) {
        return new APIConnectionException("Failed to execute " + abstractC39872m0, th3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m127947d(C0684i0 c0684i0, C37688a c37688a, C39859g c39859g, AbstractC32269c abstractC32269c) {
        C39884x c39884x;
        Object objM107888l;
        if (abstractC32269c instanceof C39884x) {
            c39884x = (C39884x) abstractC32269c;
            int i13 = c39884x.f172212z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39884x.f172212z = i13 - Integer.MIN_VALUE;
            } else {
                c39884x = new C39884x(abstractC32269c);
            }
        } else {
            c39884x = new C39884x(abstractC32269c);
        }
        Object objM1727r = c39884x.f172211y;
        Object obj = EnumC31071a.f128113w;
        int i14 = c39884x.f172212z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM1727r);
                c39884x.f172209w = c37688a;
                c39884x.f172210x = c39859g;
                c39884x.f172212z = 1;
                objM1727r = c0684i0.m1727r(c39859g, c39884x);
                if (objM1727r == obj) {
                    return obj;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c39859g = c39884x.f172210x;
                c37688a = c39884x.f172209w;
                AbstractC34132o.m107864I(objM1727r);
            }
            objM107888l = (C39874n0) objM1727r;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            return AbstractC34132o.m107888l(m127946c(c39859g, thM68037a));
        }
        C39874n0 c39874n0 = (C39874n0) objM107888l;
        return c39874n0.f172190e ? AbstractC34132o.m107888l(m127944a(c37688a, c39874n0)) : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m127948e(C0684i0 c0684i0, C37688a c37688a, C39859g c39859g, InterfaceC37689b interfaceC37689b, AbstractC32269c abstractC32269c) throws APIConnectionException, APIException {
        C39885y c39885y;
        Object objM107888l;
        if (abstractC32269c instanceof C39885y) {
            c39885y = (C39885y) abstractC32269c;
            int i13 = c39885y.f172213E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39885y.f172213E = i13 - Integer.MIN_VALUE;
            } else {
                c39885y = new C39885y(abstractC32269c);
            }
        } else {
            c39885y = new C39885y(abstractC32269c);
        }
        Object objM1727r = c39885y.f172217z;
        Object obj = EnumC31071a.f128113w;
        int i14 = c39885y.f172213E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM1727r);
                c39885y.f172214w = c37688a;
                c39885y.f172215x = c39859g;
                c39885y.f172216y = interfaceC37689b;
                c39885y.f172213E = 1;
                objM1727r = c0684i0.m1727r(c39859g, c39885y);
                if (objM1727r == obj) {
                    return obj;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC37689b = c39885y.f172216y;
                c39859g = c39885y.f172215x;
                c37688a = c39885y.f172214w;
                AbstractC34132o.m107864I(objM1727r);
            }
            objM107888l = (C39874n0) objM1727r;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            throw m127946c(c39859g, thM68037a);
        }
        C39874n0 c39874n0 = (C39874n0) objM107888l;
        if (c39874n0.f172190e) {
            throw m127944a(c37688a, c39874n0);
        }
        InterfaceC36562b interfaceC36562bMo8011m = interfaceC37689b.mo8011m(m127952i(c39874n0));
        if (interfaceC36562bMo8011m != null) {
            return interfaceC36562bMo8011m;
        }
        throw new APIException(0, 23, null, interfaceC37689b + " returns null for " + m127952i(c39874n0), null, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m127949f(C0684i0 c0684i0, C37688a c37688a, C39859g c39859g, InterfaceC37689b interfaceC37689b, AbstractC32269c abstractC32269c) throws APIException {
        C39886z c39886z;
        Object objM107888l;
        Object objM107888l2;
        if (abstractC32269c instanceof C39886z) {
            c39886z = (C39886z) abstractC32269c;
            int i13 = c39886z.f172218E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39886z.f172218E = i13 - Integer.MIN_VALUE;
            } else {
                c39886z = new C39886z(abstractC32269c);
            }
        } else {
            c39886z = new C39886z(abstractC32269c);
        }
        Object objM1727r = c39886z.f172222z;
        Object obj = EnumC31071a.f128113w;
        int i14 = c39886z.f172218E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM1727r);
                c39886z.f172219w = c37688a;
                c39886z.f172220x = c39859g;
                c39886z.f172221y = interfaceC37689b;
                c39886z.f172218E = 1;
                objM1727r = c0684i0.m1727r(c39859g, c39886z);
                if (objM1727r == obj) {
                    return obj;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC37689b = c39886z.f172221y;
                c39859g = c39886z.f172220x;
                c37688a = c39886z.f172219w;
                AbstractC34132o.m107864I(objM1727r);
            }
            objM107888l = (C39874n0) objM1727r;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            return AbstractC34132o.m107888l(m127946c(c39859g, thM68037a));
        }
        C39874n0 c39874n0 = (C39874n0) objM107888l;
        if (c39874n0.f172190e) {
            return AbstractC34132o.m107888l(m127944a(c37688a, c39874n0));
        }
        try {
            objM107888l2 = interfaceC37689b.mo8011m(m127952i(c39874n0));
        } catch (Throwable th4) {
            objM107888l2 = AbstractC34132o.m107888l(th4);
        }
        if (objM107888l2 instanceof C23467m) {
            objM107888l2 = null;
        }
        InterfaceC36562b interfaceC36562b = (InterfaceC36562b) objM107888l2;
        if (interfaceC36562b != null) {
            return interfaceC36562b;
        }
        return AbstractC34132o.m107888l(new APIException(0, 23, null, interfaceC37689b + " returns null for " + m127952i(c39874n0), null, null));
    }

    /* JADX INFO: renamed from: g */
    public static List m127950g(String str, Map map) {
        String strM31997p;
        if (map == null) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (str != null && (strM31997p = AbstractC11895b.m31997p(str, "[", str2, "]")) != null) {
                str2 = strM31997p;
            }
            AbstractC25265s.m74141p0(arrayList, m127951h(value, str2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static List m127951h(Object obj, String str) {
        if (obj instanceof Map) {
            return m127950g(str, (Map) obj);
        }
        if (!(obj instanceof List)) {
            return obj == null ? AbstractC37056f.m118958J(new C39883w(str, "")) : AbstractC37056f.m118958J(new C39883w(str, obj.toString()));
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return AbstractC37056f.m118958J(new C39883w(str, ""));
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Object obj2 : list2) {
                if (!(obj2 instanceof String) && !(obj2 instanceof Number) && !(obj2 instanceof Boolean) && !(obj2 instanceof Character)) {
                    ArrayList arrayList = new ArrayList();
                    int i13 = 0;
                    for (Object obj3 : list2) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        AbstractC25265s.m74141p0(arrayList, m127951h(obj3, str + "[" + i13 + "]"));
                        i13 = i14;
                    }
                    return arrayList;
                }
            }
        }
        String strM8299l = AbstractC2875y.m8299l(str, "[]");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList2, m127951h(it.next(), strM8299l));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: i */
    public static final JSONObject m127952i(C39874n0 c39874n0) throws APIException {
        AbstractC22676k.m65750j(c39874n0, "<this>");
        String str = (String) c39874n0.f172187b;
        if (str == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException e5) {
            int i13 = c39874n0.f172186a;
            C39858f0 c39858f0 = c39874n0.f172191f;
            List listM127943a = c39874n0.m127943a("Content-Type");
            throw new APIException(0, 7, null, AbstractC39415s.m125909s("\n                    Exception while parsing response body.\n                      Status code: " + i13 + "\n                      Request-Id: " + c39858f0 + "\n                      Content-Type: " + (listM127943a != null ? (String) AbstractC25265s.m74100H0(listM127943a) : null) + "\n                      Body: \"" + str + "\"\n                "), e5, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final JsonArray m127953j(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : AbstractC25265s.m74092D0(list)) {
            if (obj instanceof Map) {
                arrayList.add(m127954k((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(m127953j((List) obj));
            } else {
                arrayList.add(AbstractC0770m.m1841c(obj.toString()));
            }
        }
        return new JsonArray(arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static final JsonObject m127954k(Map map) {
        Object value;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = key instanceof String ? (String) key : null;
            if (str != null && (value = entry.getValue()) != null) {
                if (value instanceof Map) {
                    linkedHashMap.put(str, m127954k((Map) value));
                } else if (value instanceof List) {
                    linkedHashMap.put(str, m127953j((List) value));
                } else {
                    linkedHashMap.put(str, AbstractC0770m.m1841c(value.toString()));
                }
            }
        }
        return new JsonObject(linkedHashMap);
    }

    /* JADX INFO: renamed from: l */
    public static final Map m127955l(JsonElement jsonElement) throws InvalidSerializationException {
        AbstractC22676k.m65750j(jsonElement, "<this>");
        if (jsonElement instanceof JsonObject) {
            return m127956m((JsonObject) jsonElement);
        }
        throw new InvalidSerializationException(AbstractC11895b.m31996o("Serialization result ", jsonElement.getClass().getSimpleName(), " is not supported"));
    }

    /* JADX INFO: renamed from: m */
    public static final Map m127956m(JsonObject jsonObject) {
        AbstractC22676k.m65750j(jsonObject, "<this>");
        ArrayList arrayList = new ArrayList(jsonObject.size());
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            arrayList.add(new C23465k(entry.getKey(), m127957n(entry.getValue())));
        }
        return AbstractC25247g0.m74000i0(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public static final Object m127957n(JsonElement jsonElement) {
        AbstractC22676k.m65750j(jsonElement, "<this>");
        if (jsonElement.equals(JsonNull.INSTANCE)) {
            return null;
        }
        if (jsonElement instanceof JsonArray) {
            JsonArray jsonArray = (JsonArray) jsonElement;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(jsonArray, 10));
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(m127957n(it.next()));
            }
            return arrayList;
        }
        if (jsonElement instanceof JsonObject) {
            return m127956m((JsonObject) jsonElement);
        }
        if (!(jsonElement instanceof JsonPrimitive)) {
            throw new NoWhenBranchMatchedException();
        }
        String input = ((JsonPrimitive) jsonElement).getContent();
        Pattern patternCompile = Pattern.compile("^\"|\"$");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        AbstractC22676k.m65750j(input, "input");
        String strReplaceAll = patternCompile.matcher(input).replaceAll("");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }
}
