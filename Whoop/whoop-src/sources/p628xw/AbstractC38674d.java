package p628xw;

import com.nimbusds.jose.shaded.gson.JsonIOException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p384ow.C28417m;
import p384ow.C28418n;
import p384ow.EnumC28428x;
import p440qw.AbstractC30672g;
import p440qw.C30670e;
import p596ww.C37654b;

/* JADX INFO: renamed from: xw.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC38674d {

    /* JADX INFO: renamed from: a */
    public static final C28417m f166478a;

    static {
        C28418n c28418n = new C28418n();
        c28418n.f114636l = 3;
        c28418n.f114631g = true;
        c28418n.f114638n = EnumC28428x.f114647y;
        c28418n.f114634j = false;
        f166478a = c28418n.m86138a();
    }

    /* JADX INFO: renamed from: a */
    public static C38672b m124051a(String str, Map map) {
        String strM124056f = m124056f(str, map);
        if (strM124056f == null) {
            return null;
        }
        return new C38672b(strM124056f);
    }

    /* JADX INFO: renamed from: b */
    public static Date m124052b(String str, Map map) {
        Number number = (Number) m124053c(map, str, Number.class);
        if (number == null) {
            return null;
        }
        return new Date(number.longValue() * 1000);
    }

    /* JADX INFO: renamed from: c */
    public static Object m124053c(Map map, String str, Class cls) throws ParseException {
        if (map.get(str) == null) {
            return null;
        }
        Object obj = map.get(str);
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        throw new ParseException(AbstractC11895b.m31996o("Unexpected type of JSON object member ", str, ""), 0);
    }

    /* JADX INFO: renamed from: d */
    public static Map m124054d(String str, Map map) {
        Map map2 = (Map) m124053c(map, str, Map.class);
        if (map2 == null) {
            return null;
        }
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                throw new ParseException(AbstractC11895b.m31996o("JSON object member ", str, " not a JSON object"), 0);
            }
        }
        return map2;
    }

    /* JADX INFO: renamed from: e */
    public static long m124055e(String str, Map map) throws ParseException {
        Number number = (Number) m124053c(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException(AbstractC11895b.m31996o("JSON object member ", str, " is missing or null"), 0);
    }

    /* JADX INFO: renamed from: f */
    public static String m124056f(String str, Map map) {
        return (String) m124053c(map, str, String.class);
    }

    /* JADX INFO: renamed from: g */
    public static List m124057g(String str, Map map) {
        String[] strArr;
        List list = (List) m124053c(map, str, List.class);
        if (list == null) {
            strArr = null;
        } else {
            try {
                strArr = (String[]) list.toArray(new String[0]);
            } catch (ArrayStoreException unused) {
                throw new ParseException(AbstractC11895b.m31996o("JSON object member ", str, " is not an array of strings"), 0);
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    /* JADX INFO: renamed from: h */
    public static URI m124058h(String str, Map map) {
        String strM124056f = m124056f(str, map);
        if (strM124056f == null) {
            return null;
        }
        try {
            return new URI(strM124056f);
        } catch (URISyntaxException e5) {
            throw new ParseException(e5.getMessage(), 0);
        }
    }

    /* JADX INFO: renamed from: i */
    public static Map m124059i(int i13, String str) {
        if (str == null) {
            throw new ParseException("The JSON object string must not be null", 0);
        }
        if (str.trim().isEmpty()) {
            throw new ParseException("Invalid JSON object", 0);
        }
        if (i13 >= 0 && str.length() > i13) {
            throw new ParseException(AbstractC2875y.m8296i(i13, "The parsed string is longer than the max accepted size of ", " characters"), 0);
        }
        Type[] typeArr = {String.class, Object.class};
        TypeVariable[] typeParameters = Map.class.getTypeParameters();
        int length = typeParameters.length;
        if (2 != length) {
            throw new IllegalArgumentException(Map.class.getName() + " requires " + length + " type arguments, but got 2");
        }
        if (!Modifier.isStatic(Map.class.getModifiers()) && Map.class.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Raw type " + Map.class.getName() + " is not supported because it requires specifying an owner type");
        }
        for (int i14 = 0; i14 < length; i14++) {
            Type type = typeArr[i14];
            Objects.requireNonNull(type, "Type argument must not be null");
            Class<?> clsM94272h = AbstractC30672g.m94272h(type);
            TypeVariable typeVariable = typeParameters[i14];
            for (Type type2 : typeVariable.getBounds()) {
                if (!AbstractC30672g.m94272h(type2).isAssignableFrom(clsM94272h)) {
                    throw new IllegalArgumentException("Type argument " + type + " does not satisfy bounds for type variable " + typeVariable + " declared by " + Map.class);
                }
            }
        }
        Type typeM94265a = AbstractC30672g.m94265a(new C30670e(null, Map.class, typeArr));
        AbstractC30672g.m94272h(typeM94265a);
        typeM94265a.hashCode();
        try {
            return (Map) f166478a.m86135b(str, typeM94265a);
        } catch (Exception unused) {
            throw new ParseException("Invalid JSON object", 0);
        } catch (StackOverflowError unused2) {
            throw new ParseException("Excessive JSON object and / or array nesting", 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m124060j(Map map) {
        Objects.requireNonNull(map);
        C28417m c28417m = f166478a;
        c28417m.getClass();
        Class<?> cls = map.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            C37654b c37654b = new C37654b(stringWriter);
            c37654b.m121080x(c28417m.f114623h);
            c37654b.f161384I = c28417m.f114622g;
            int i13 = c28417m.f114624i;
            if (i13 == 0) {
                i13 = 2;
            }
            c37654b.m121068J(i13);
            c37654b.f161386K = c28417m.f114621f;
            c28417m.m86137d(map, cls, c37654b);
            return stringWriter.toString();
        } catch (IOException e5) {
            throw new JsonIOException(e5);
        }
    }
}
