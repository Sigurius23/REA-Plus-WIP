package pg3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ud3.C34807d0;
import ud3.C34818h0;

/* JADX INFO: renamed from: pg3.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29214t0 {

    /* JADX INFO: renamed from: y */
    public static final Pattern f118227y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: z */
    public static final Pattern f118228z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* JADX INFO: renamed from: a */
    public final C29224y0 f118229a;

    /* JADX INFO: renamed from: b */
    public final Class f118230b;

    /* JADX INFO: renamed from: c */
    public final Method f118231c;

    /* JADX INFO: renamed from: d */
    public final Annotation[] f118232d;

    /* JADX INFO: renamed from: e */
    public final Annotation[][] f118233e;

    /* JADX INFO: renamed from: f */
    public final Type[] f118234f;

    /* JADX INFO: renamed from: g */
    public boolean f118235g;

    /* JADX INFO: renamed from: h */
    public boolean f118236h;

    /* JADX INFO: renamed from: i */
    public boolean f118237i;

    /* JADX INFO: renamed from: j */
    public boolean f118238j;

    /* JADX INFO: renamed from: k */
    public boolean f118239k;

    /* JADX INFO: renamed from: l */
    public boolean f118240l;

    /* JADX INFO: renamed from: m */
    public boolean f118241m;

    /* JADX INFO: renamed from: n */
    public boolean f118242n;

    /* JADX INFO: renamed from: o */
    public String f118243o;

    /* JADX INFO: renamed from: p */
    public boolean f118244p;

    /* JADX INFO: renamed from: q */
    public boolean f118245q;

    /* JADX INFO: renamed from: r */
    public boolean f118246r;

    /* JADX INFO: renamed from: s */
    public String f118247s;

    /* JADX INFO: renamed from: t */
    public C34807d0 f118248t;

    /* JADX INFO: renamed from: u */
    public C34818h0 f118249u;

    /* JADX INFO: renamed from: v */
    public LinkedHashSet f118250v;

    /* JADX INFO: renamed from: w */
    public AbstractC29184e1[] f118251w;

    /* JADX INFO: renamed from: x */
    public boolean f118252x;

    public C29214t0(C29224y0 c29224y0, Class cls, Method method) {
        this.f118229a = c29224y0;
        this.f118230b = cls;
        this.f118231c = method;
        this.f118232d = method.getAnnotations();
        this.f118234f = method.getGenericParameterTypes();
        this.f118233e = method.getParameterAnnotations();
    }

    /* JADX INFO: renamed from: a */
    public static Class m88719a(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        return Short.TYPE == cls ? Short.class : cls;
    }

    /* JADX INFO: renamed from: b */
    public final void m88720b(String str, String str2, boolean z4) {
        String str3 = this.f118243o;
        Method method = this.f118231c;
        if (str3 != null) {
            throw AbstractC29184e1.m88691m(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f118243o = str;
        this.f118244p = z4;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f118227y;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw AbstractC29184e1.m88691m(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f118247s = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f118250v = linkedHashSet;
    }

    /* JADX INFO: renamed from: c */
    public final void m88721c(int i13, Type type) {
        if (AbstractC29184e1.m88689k(type)) {
            throw AbstractC29184e1.m88692n(this.f118231c, i13, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
