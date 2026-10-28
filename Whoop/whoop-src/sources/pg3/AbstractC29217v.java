package pg3;

import androidx.room.AbstractC1772c1;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import l83.C23454a0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.C22677k0;
import q83.InterfaceC30057d;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34818h0;
import ud3.C34820i0;
import ud3.C34850x0;
import ud3.InterfaceC34819i;
import wb3.AbstractC37056f;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37272c;
import wg3.InterfaceC37273d;
import wg3.InterfaceC37274e;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37276g;
import wg3.InterfaceC37277h;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37279j;
import wg3.InterfaceC37280k;
import wg3.InterfaceC37281l;
import wg3.InterfaceC37282m;
import wg3.InterfaceC37283n;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37286q;
import wg3.InterfaceC37287r;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;
import wg3.InterfaceC37290u;
import wg3.InterfaceC37291v;
import wg3.InterfaceC37293x;
import wg3.InterfaceC37294y;
import yb3.C39412p;

/* JADX INFO: renamed from: pg3.v */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC29217v {

    /* JADX INFO: renamed from: a */
    public final C29216u0 f118266a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC34819i f118267b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29201n f118268c;

    public AbstractC29217v(C29216u0 c29216u0, InterfaceC34819i interfaceC34819i, InterfaceC29201n interfaceC29201n) {
        this.f118266a = c29216u0;
        this.f118267b = interfaceC34819i;
        this.f118268c = interfaceC29201n;
    }

    /* JADX WARN: Code duplicated, block: B:389:0x0937 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:390:0x0939  */
    /* JADX WARN: Code duplicated, block: B:590:0x0953 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:0x093b A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public static AbstractC29217v m88722b(C29224y0 c29224y0, Class cls, Method method) {
        Type genericReturnType;
        boolean z4;
        boolean z13;
        Type typeM88686h;
        AbstractC29184e1 abstractC29184e1;
        int i13;
        Annotation[][] annotationArr;
        int i14;
        int i15;
        String str;
        int i16;
        Method method2;
        AbstractC29184e1 c29202n0;
        C29177c0 c29177c0;
        AbstractC29184e1 c29183e0;
        AbstractC29184e1 c29198l0;
        Method method3 = method;
        C29214t0 c29214t0 = new C29214t0(c29224y0, cls, method3);
        Annotation[] annotationArr2 = c29214t0.f118232d;
        int length = annotationArr2.length;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            String str2 = "HEAD";
            boolean z14 = true;
            AbstractC29184e1 abstractC29184e2 = null;
            if (i18 >= length) {
                if (c29214t0.f118243o == null) {
                    throw AbstractC29184e1.m88691m(method3, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!c29214t0.f118244p) {
                    if (c29214t0.f118246r) {
                        throw AbstractC29184e1.m88691m(method3, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (c29214t0.f118245q) {
                        throw AbstractC29184e1.m88691m(method3, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr3 = c29214t0.f118233e;
                int length2 = annotationArr3.length;
                c29214t0.f118251w = new AbstractC29184e1[length2];
                int i19 = length2 - 1;
                int i24 = 0;
                while (i24 < length2) {
                    AbstractC29184e1[] abstractC29184e1Arr = c29214t0.f118251w;
                    Type type = c29214t0.f118234f[i24];
                    Annotation[] annotationArr4 = annotationArr3[i24];
                    int i25 = i24 == i19 ? 1 : i17;
                    if (annotationArr4 != null) {
                        int length3 = annotationArr4.length;
                        int i26 = i17;
                        abstractC29184e1 = abstractC29184e2;
                        while (i26 < length3) {
                            Annotation annotation = annotationArr4[i26];
                            AbstractC29184e1[] abstractC29184e1Arr2 = abstractC29184e1Arr;
                            int i27 = length3;
                            if (annotation instanceof InterfaceC37294y) {
                                c29214t0.m88721c(i24, type);
                                if (c29214t0.f118242n) {
                                    throw AbstractC29184e1.m88692n(method3, i24, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (c29214t0.f118238j) {
                                    throw AbstractC29184e1.m88692n(method3, i24, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (c29214t0.f118239k) {
                                    throw AbstractC29184e1.m88692n(method3, i24, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (c29214t0.f118240l) {
                                    throw AbstractC29184e1.m88692n(method3, i24, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (c29214t0.f118241m) {
                                    throw AbstractC29184e1.m88692n(method3, i24, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (c29214t0.f118247s != null) {
                                    throw AbstractC29184e1.m88692n(method3, i24, "@Url cannot be used with @%s URL", c29214t0.f118243o);
                                }
                                c29214t0.f118242n = true;
                                if (type != C34810e0.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw AbstractC29184e1.m88692n(method3, i24, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                c29202n0 = new C29192i0(method3, i24, 1);
                                str = str2;
                                annotationArr = annotationArr3;
                                i14 = length2;
                                i15 = i19;
                                i13 = i26;
                                type = type;
                            } else {
                                boolean z15 = annotation instanceof InterfaceC37288s;
                                C29224y0 c29224y1 = c29214t0.f118229a;
                                if (z15) {
                                    c29214t0.m88721c(i24, type);
                                    if (c29214t0.f118239k) {
                                        throw AbstractC29184e1.m88692n(method3, i24, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (c29214t0.f118240l) {
                                        throw AbstractC29184e1.m88692n(method3, i24, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (c29214t0.f118241m) {
                                        throw AbstractC29184e1.m88692n(method3, i24, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (c29214t0.f118242n) {
                                        throw AbstractC29184e1.m88692n(method3, i24, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (c29214t0.f118247s == null) {
                                        throw AbstractC29184e1.m88692n(method3, i24, "@Path can only be used with relative url on @%s", c29214t0.f118243o);
                                    }
                                    c29214t0.f118238j = true;
                                    InterfaceC37288s interfaceC37288s = (InterfaceC37288s) annotation;
                                    String strValue = interfaceC37288s.value();
                                    if (!C29214t0.f118228z.matcher(strValue).matches()) {
                                        throw AbstractC29184e1.m88692n(method3, i24, "@Path parameter name must match %s. Found: %s", C29214t0.f118227y.pattern(), strValue);
                                    }
                                    if (!c29214t0.f118250v.contains(strValue)) {
                                        throw AbstractC29184e1.m88692n(method3, i24, "URL \"%s\" does not contain \"{%s}\".", c29214t0.f118247s, strValue);
                                    }
                                    int i28 = i24;
                                    i13 = i26;
                                    method2 = method3;
                                    str = str2;
                                    i14 = length2;
                                    i15 = i19;
                                    c29202n0 = new C29196k0(c29214t0.f118231c, i28, strValue, c29224y1.m88736e(type, annotationArr4), interfaceC37288s.encoded());
                                    type = type;
                                    annotationArr4 = annotationArr4;
                                    i16 = i28;
                                    annotationArr = annotationArr3;
                                } else {
                                    i13 = i26;
                                    annotationArr = annotationArr3;
                                    if (annotation instanceof InterfaceC37289t) {
                                        c29214t0.m88721c(i24, type);
                                        InterfaceC37289t interfaceC37289t = (InterfaceC37289t) annotation;
                                        String strValue2 = interfaceC37289t.value();
                                        boolean zEncoded = interfaceC37289t.encoded();
                                        i14 = length2;
                                        Class clsM88687i = AbstractC29184e1.m88687i(type);
                                        i15 = i19;
                                        c29214t0.f118239k = true;
                                        if (Iterable.class.isAssignableFrom(clsM88687i)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw AbstractC29184e1.m88692n(method3, i24, clsM88687i.getSimpleName() + " must include generic type (e.g., " + clsM88687i.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            c29202n0 = new C29177c0(new C29188g0(strValue2, c29224y1.m88736e(AbstractC29184e1.m88686h(0, (ParameterizedType) type), annotationArr4), zEncoded, 1), 0);
                                        } else if (clsM88687i.isArray()) {
                                            c29202n0 = new C29177c0(new C29188g0(strValue2, c29224y1.m88736e(C29214t0.m88719a(clsM88687i.getComponentType()), annotationArr4), zEncoded, 1), 1);
                                        } else {
                                            c29198l0 = new C29188g0(strValue2, c29224y1.m88736e(type, annotationArr4), zEncoded, 1);
                                            c29202n0 = c29198l0;
                                            str = str2;
                                            i16 = i24;
                                            annotationArr4 = annotationArr4;
                                            method2 = method3;
                                        }
                                        str = str2;
                                        i16 = i24;
                                        annotationArr4 = annotationArr4;
                                        method2 = method3;
                                    } else {
                                        i14 = length2;
                                        i15 = i19;
                                        if (annotation instanceof InterfaceC37291v) {
                                            c29214t0.m88721c(i24, type);
                                            boolean zEncoded2 = ((InterfaceC37291v) annotation).encoded();
                                            Class clsM88687i2 = AbstractC29184e1.m88687i(type);
                                            c29214t0.f118240l = true;
                                            if (Iterable.class.isAssignableFrom(clsM88687i2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw AbstractC29184e1.m88692n(method3, i24, clsM88687i2.getSimpleName() + " must include generic type (e.g., " + clsM88687i2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                c29202n0 = new C29177c0(new C29198l0(c29224y1.m88736e(AbstractC29184e1.m88686h(0, (ParameterizedType) type), annotationArr4), zEncoded2), 0);
                                            } else if (clsM88687i2.isArray()) {
                                                c29202n0 = new C29177c0(new C29198l0(c29224y1.m88736e(C29214t0.m88719a(clsM88687i2.getComponentType()), annotationArr4), zEncoded2), 1);
                                            } else {
                                                c29198l0 = new C29198l0(c29224y1.m88736e(type, annotationArr4), zEncoded2);
                                                c29202n0 = c29198l0;
                                                str = str2;
                                                i16 = i24;
                                                annotationArr4 = annotationArr4;
                                                method2 = method3;
                                            }
                                            str = str2;
                                            i16 = i24;
                                            annotationArr4 = annotationArr4;
                                            method2 = method3;
                                        } else if (annotation instanceof InterfaceC37290u) {
                                            c29214t0.m88721c(i24, type);
                                            Class clsM88687i3 = AbstractC29184e1.m88687i(type);
                                            c29214t0.f118241m = true;
                                            if (!Map.class.isAssignableFrom(clsM88687i3)) {
                                                throw AbstractC29184e1.m88692n(method, i24, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeM88688j = AbstractC29184e1.m88688j(type, clsM88687i3);
                                            if (!(typeM88688j instanceof ParameterizedType)) {
                                                throw AbstractC29184e1.m88692n(method, i24, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeM88688j;
                                            Type typeM88686h2 = AbstractC29184e1.m88686h(0, parameterizedType);
                                            if (String.class != typeM88686h2) {
                                                throw AbstractC29184e1.m88692n(method, i24, "@QueryMap keys must be of type String: " + typeM88686h2, new Object[0]);
                                            }
                                            Type type2 = type;
                                            method3 = method;
                                            c29202n0 = new C29186f0(method3, i24, c29224y1.m88736e(AbstractC29184e1.m88686h(1, parameterizedType), annotationArr4), ((InterfaceC37290u) annotation).encoded(), 1);
                                            i16 = i24;
                                            type = type2;
                                            str = str2;
                                            annotationArr4 = annotationArr4;
                                            method2 = method3;
                                        } else {
                                            type = type;
                                            str = str2;
                                            i16 = i24;
                                            method2 = method;
                                            if (annotation instanceof InterfaceC37278i) {
                                                c29214t0.m88721c(i16, type);
                                                InterfaceC37278i interfaceC37278i = (InterfaceC37278i) annotation;
                                                String strValue3 = interfaceC37278i.value();
                                                Class clsM88687i4 = AbstractC29184e1.m88687i(type);
                                                if (Iterable.class.isAssignableFrom(clsM88687i4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw AbstractC29184e1.m88692n(method2, i16, clsM88687i4.getSimpleName() + " must include generic type (e.g., " + clsM88687i4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c29202n0 = new C29177c0(new C29188g0(strValue3, c29224y1.m88736e(AbstractC29184e1.m88686h(0, (ParameterizedType) type), annotationArr4), interfaceC37278i.allowUnsafeNonAsciiValues(), 0), 0);
                                                } else if (clsM88687i4.isArray()) {
                                                    c29202n0 = new C29177c0(new C29188g0(strValue3, c29224y1.m88736e(C29214t0.m88719a(clsM88687i4.getComponentType()), annotationArr4), interfaceC37278i.allowUnsafeNonAsciiValues(), 0), 1);
                                                } else {
                                                    annotationArr4 = annotationArr4;
                                                    c29202n0 = new C29188g0(strValue3, c29224y1.m88736e(type, annotationArr4), interfaceC37278i.allowUnsafeNonAsciiValues(), 0);
                                                }
                                                annotationArr4 = annotationArr4;
                                            } else {
                                                if (!(annotation instanceof InterfaceC37279j)) {
                                                    if (annotation instanceof InterfaceC37272c) {
                                                        c29214t0.m88721c(i16, type);
                                                        if (!c29214t0.f118245q) {
                                                            throw AbstractC29184e1.m88692n(method2, i16, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                        }
                                                        InterfaceC37272c interfaceC37272c = (InterfaceC37272c) annotation;
                                                        String strValue4 = interfaceC37272c.value();
                                                        boolean zEncoded3 = interfaceC37272c.encoded();
                                                        c29214t0.f118235g = true;
                                                        Class clsM88687i5 = AbstractC29184e1.m88687i(type);
                                                        if (Iterable.class.isAssignableFrom(clsM88687i5)) {
                                                            if (!(type instanceof ParameterizedType)) {
                                                                throw AbstractC29184e1.m88692n(method2, i16, clsM88687i5.getSimpleName() + " must include generic type (e.g., " + clsM88687i5.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                            c29202n0 = new C29177c0(new C29183e0(strValue4, c29224y1.m88736e(AbstractC29184e1.m88686h(0, (ParameterizedType) type), annotationArr4), zEncoded3), 0);
                                                        } else if (clsM88687i5.isArray()) {
                                                            c29202n0 = new C29177c0(new C29183e0(strValue4, c29224y1.m88736e(C29214t0.m88719a(clsM88687i5.getComponentType()), annotationArr4), zEncoded3), 1);
                                                        } else {
                                                            c29183e0 = new C29183e0(strValue4, c29224y1.m88736e(type, annotationArr4), zEncoded3);
                                                            annotationArr4 = annotationArr4;
                                                        }
                                                    } else if (annotation instanceof InterfaceC37273d) {
                                                        c29214t0.m88721c(i16, type);
                                                        if (!c29214t0.f118245q) {
                                                            throw AbstractC29184e1.m88692n(method2, i16, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                        }
                                                        Class clsM88687i6 = AbstractC29184e1.m88687i(type);
                                                        if (!Map.class.isAssignableFrom(clsM88687i6)) {
                                                            throw AbstractC29184e1.m88692n(method2, i16, "@FieldMap parameter type must be Map.", new Object[0]);
                                                        }
                                                        Type typeM88688j2 = AbstractC29184e1.m88688j(type, clsM88687i6);
                                                        if (!(typeM88688j2 instanceof ParameterizedType)) {
                                                            throw AbstractC29184e1.m88692n(method2, i16, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                        ParameterizedType parameterizedType2 = (ParameterizedType) typeM88688j2;
                                                        Type typeM88686h3 = AbstractC29184e1.m88686h(0, parameterizedType2);
                                                        if (String.class != typeM88686h3) {
                                                            throw AbstractC29184e1.m88692n(method2, i16, "@FieldMap keys must be of type String: " + typeM88686h3, new Object[0]);
                                                        }
                                                        InterfaceC29201n interfaceC29201nM88736e = c29224y1.m88736e(AbstractC29184e1.m88686h(1, parameterizedType2), annotationArr4);
                                                        c29214t0.f118235g = true;
                                                        i24 = i16;
                                                        method3 = method;
                                                        c29202n0 = new C29186f0(method3, i24, interfaceC29201nM88736e, ((InterfaceC37273d) annotation).encoded(), 0);
                                                    } else {
                                                        annotationArr4 = annotationArr4;
                                                        if (annotation instanceof InterfaceC37286q) {
                                                            c29214t0.m88721c(i16, type);
                                                            if (!c29214t0.f118246r) {
                                                                throw AbstractC29184e1.m88692n(method2, i16, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                            }
                                                            InterfaceC37286q interfaceC37286q = (InterfaceC37286q) annotation;
                                                            c29214t0.f118236h = true;
                                                            String strValue5 = interfaceC37286q.value();
                                                            Class clsM88687i7 = AbstractC29184e1.m88687i(type);
                                                            if (strValue5.isEmpty()) {
                                                                boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsM88687i7);
                                                                c29183e0 = C29200m0.f118196c;
                                                                if (zIsAssignableFrom) {
                                                                    if (!(type instanceof ParameterizedType)) {
                                                                        throw AbstractC29184e1.m88692n(method2, i16, clsM88687i7.getSimpleName() + " must include generic type (e.g., " + clsM88687i7.getSimpleName() + "<String>)", new Object[0]);
                                                                    }
                                                                    if (!C34820i0.class.isAssignableFrom(AbstractC29184e1.m88687i(AbstractC29184e1.m88686h(0, (ParameterizedType) type)))) {
                                                                        throw AbstractC29184e1.m88692n(method2, i16, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                    }
                                                                    c29202n0 = new C29177c0(c29183e0, 0);
                                                                } else if (clsM88687i7.isArray()) {
                                                                    if (!C34820i0.class.isAssignableFrom(clsM88687i7.getComponentType())) {
                                                                        throw AbstractC29184e1.m88692n(method2, i16, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                    }
                                                                    c29202n0 = new C29177c0(c29183e0, 1);
                                                                } else if (!C34820i0.class.isAssignableFrom(clsM88687i7)) {
                                                                    throw AbstractC29184e1.m88692n(method2, i16, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                }
                                                            } else {
                                                                String[] strArr = {"Content-Disposition", AbstractC11895b.m31996o("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", interfaceC37286q.encoding()};
                                                                C34807d0 c34807d0 = C34807d0.f146547x;
                                                                C34807d0 c34807d0M118965R = AbstractC37056f.m118965R(strArr);
                                                                if (Iterable.class.isAssignableFrom(clsM88687i7)) {
                                                                    if (!(type instanceof ParameterizedType)) {
                                                                        throw AbstractC29184e1.m88692n(method2, i16, clsM88687i7.getSimpleName() + " must include generic type (e.g., " + clsM88687i7.getSimpleName() + "<String>)", new Object[0]);
                                                                    }
                                                                    Type typeM88686h4 = AbstractC29184e1.m88686h(0, (ParameterizedType) type);
                                                                    if (C34820i0.class.isAssignableFrom(AbstractC29184e1.m88687i(typeM88686h4))) {
                                                                        throw AbstractC29184e1.m88692n(method2, i16, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                    }
                                                                    c29177c0 = new C29177c0(new C29194j0(method2, i16, c34807d0M118965R, c29224y1.m88734c(typeM88686h4, annotationArr4, annotationArr2)), 0);
                                                                } else if (clsM88687i7.isArray()) {
                                                                    Class clsM88719a = C29214t0.m88719a(clsM88687i7.getComponentType());
                                                                    if (C34820i0.class.isAssignableFrom(clsM88719a)) {
                                                                        throw AbstractC29184e1.m88692n(method2, i16, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                    }
                                                                    c29177c0 = new C29177c0(new C29194j0(method2, i16, c34807d0M118965R, c29224y1.m88734c(clsM88719a, annotationArr4, annotationArr2)), 1);
                                                                } else {
                                                                    if (C34820i0.class.isAssignableFrom(clsM88687i7)) {
                                                                        throw AbstractC29184e1.m88692n(method2, i16, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                    }
                                                                    c29202n0 = new C29194j0(method2, i16, c34807d0M118965R, c29224y1.m88734c(type, annotationArr4, annotationArr2));
                                                                }
                                                                c29202n0 = c29177c0;
                                                            }
                                                        } else if (annotation instanceof InterfaceC37287r) {
                                                            c29214t0.m88721c(i16, type);
                                                            if (!c29214t0.f118246r) {
                                                                throw AbstractC29184e1.m88692n(method2, i16, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                            }
                                                            c29214t0.f118236h = true;
                                                            Class clsM88687i8 = AbstractC29184e1.m88687i(type);
                                                            if (!Map.class.isAssignableFrom(clsM88687i8)) {
                                                                throw AbstractC29184e1.m88692n(method2, i16, "@PartMap parameter type must be Map.", new Object[0]);
                                                            }
                                                            Type typeM88688j3 = AbstractC29184e1.m88688j(type, clsM88687i8);
                                                            if (!(typeM88688j3 instanceof ParameterizedType)) {
                                                                throw AbstractC29184e1.m88692n(method2, i16, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                            }
                                                            ParameterizedType parameterizedType3 = (ParameterizedType) typeM88688j3;
                                                            Type typeM88686h5 = AbstractC29184e1.m88686h(0, parameterizedType3);
                                                            if (String.class != typeM88686h5) {
                                                                throw AbstractC29184e1.m88692n(method2, i16, "@PartMap keys must be of type String: " + typeM88686h5, new Object[0]);
                                                            }
                                                            Type typeM88686h6 = AbstractC29184e1.m88686h(1, parameterizedType3);
                                                            if (C34820i0.class.isAssignableFrom(AbstractC29184e1.m88687i(typeM88686h6))) {
                                                                throw AbstractC29184e1.m88692n(method2, i16, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                            }
                                                            c29202n0 = new C29194j0(method2, i16, c29224y1.m88734c(typeM88686h6, annotationArr4, annotationArr2), ((InterfaceC37287r) annotation).encoding());
                                                        } else if (annotation instanceof InterfaceC37270a) {
                                                            c29214t0.m88721c(i16, type);
                                                            if (c29214t0.f118245q || c29214t0.f118246r) {
                                                                throw AbstractC29184e1.m88692n(method2, i16, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                            }
                                                            if (c29214t0.f118237i) {
                                                                throw AbstractC29184e1.m88692n(method2, i16, "Multiple @Body method annotations found.", new Object[0]);
                                                            }
                                                            try {
                                                                InterfaceC29201n interfaceC29201nM88734c = c29224y1.m88734c(type, annotationArr4, annotationArr2);
                                                                c29214t0.f118237i = true;
                                                                c29202n0 = new C29180d0(method2, i16, interfaceC29201nM88734c);
                                                            } catch (RuntimeException e5) {
                                                                throw AbstractC29184e1.m88693o(method2, e5, i16, "Unable to create @Body converter for %s", type);
                                                            }
                                                        } else if (annotation instanceof InterfaceC37293x) {
                                                            c29214t0.m88721c(i16, type);
                                                            Class clsM88687i9 = AbstractC29184e1.m88687i(type);
                                                            for (int i29 = i16 - 1; i29 >= 0; i29--) {
                                                                AbstractC29184e1 abstractC29184e3 = c29214t0.f118251w[i29];
                                                                if ((abstractC29184e3 instanceof C29202n0) && ((C29202n0) abstractC29184e3).f118197c.equals(clsM88687i9)) {
                                                                    StringBuilder sb4 = new StringBuilder("@Tag type ");
                                                                    AbstractC11266d.m30443A(clsM88687i9, sb4, " is duplicate of ");
                                                                    sb4.append(AbstractC29204o0.f118201b.mo88669c(method2, i29));
                                                                    sb4.append(" and would always overwrite its value.");
                                                                    throw AbstractC29184e1.m88692n(method2, i16, sb4.toString(), new Object[0]);
                                                                }
                                                            }
                                                            c29202n0 = new C29202n0(clsM88687i9);
                                                        } else {
                                                            c29202n0 = null;
                                                        }
                                                    }
                                                    c29202n0 = c29183e0;
                                                } else if (type == C34807d0.class) {
                                                    c29202n0 = new C29192i0(method2, i16, 0);
                                                } else {
                                                    c29214t0.m88721c(i16, type);
                                                    Class clsM88687i10 = AbstractC29184e1.m88687i(type);
                                                    if (!Map.class.isAssignableFrom(clsM88687i10)) {
                                                        throw AbstractC29184e1.m88692n(method2, i16, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeM88688j4 = AbstractC29184e1.m88688j(type, clsM88687i10);
                                                    if (!(typeM88688j4 instanceof ParameterizedType)) {
                                                        throw AbstractC29184e1.m88692n(method2, i16, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType4 = (ParameterizedType) typeM88688j4;
                                                    Type typeM88686h7 = AbstractC29184e1.m88686h(0, parameterizedType4);
                                                    if (String.class != typeM88686h7) {
                                                        throw AbstractC29184e1.m88692n(method2, i16, "@HeaderMap keys must be of type String: " + typeM88686h7, new Object[0]);
                                                    }
                                                    c29202n0 = new C29190h0(method2, i16, c29224y1.m88736e(AbstractC29184e1.m88686h(1, parameterizedType4), annotationArr4), ((InterfaceC37279j) annotation).allowUnsafeNonAsciiValues());
                                                }
                                                annotationArr4 = annotationArr4;
                                            }
                                        }
                                    }
                                }
                                if (c29202n0 != null) {
                                    if (abstractC29184e1 == null) {
                                        throw AbstractC29184e1.m88692n(method2, i16, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    abstractC29184e1 = c29202n0;
                                }
                                i26 = i13 + 1;
                                method3 = method2;
                                i24 = i16;
                                annotationArr4 = annotationArr4;
                                type = type;
                                length2 = i14;
                                annotationArr3 = annotationArr;
                                i19 = i15;
                                str2 = str;
                                abstractC29184e1Arr = abstractC29184e1Arr2;
                                length3 = i27;
                            }
                            i16 = i24;
                            method2 = method3;
                            if (c29202n0 != null) {
                                if (abstractC29184e1 == null) {
                                    throw AbstractC29184e1.m88692n(method2, i16, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                abstractC29184e1 = c29202n0;
                            }
                            i26 = i13 + 1;
                            method3 = method2;
                            i24 = i16;
                            annotationArr4 = annotationArr4;
                            type = type;
                            length2 = i14;
                            annotationArr3 = annotationArr;
                            i19 = i15;
                            str2 = str;
                            abstractC29184e1Arr = abstractC29184e1Arr2;
                            length3 = i27;
                        }
                    } else {
                        abstractC29184e1 = null;
                    }
                    AbstractC29184e1[] abstractC29184e1Arr3 = abstractC29184e1Arr;
                    String str3 = str2;
                    Annotation[][] annotationArr5 = annotationArr3;
                    int i34 = length2;
                    int i35 = i19;
                    Type type3 = type;
                    int i36 = i24;
                    Method method4 = method3;
                    if (abstractC29184e1 == null) {
                        if (i25 != 0) {
                            try {
                                if (AbstractC29184e1.m88687i(type3) == InterfaceC30057d.class) {
                                    c29214t0.f118252x = true;
                                    abstractC29184e1 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw AbstractC29184e1.m88692n(method4, i36, "No Retrofit annotation found.", new Object[0]);
                    }
                    abstractC29184e1Arr3[i36] = abstractC29184e1;
                    method3 = method4;
                    length2 = i34;
                    annotationArr3 = annotationArr5;
                    i19 = i35;
                    str2 = str3;
                    i17 = 0;
                    abstractC29184e2 = null;
                    i24 = i36 + 1;
                }
                Method method5 = method3;
                String str4 = str2;
                if (c29214t0.f118247s == null && !c29214t0.f118242n) {
                    throw AbstractC29184e1.m88691m(method5, null, "Missing either @%s URL or @Url parameter.", c29214t0.f118243o);
                }
                boolean z16 = c29214t0.f118245q;
                if (!z16 && !c29214t0.f118246r && !c29214t0.f118244p && c29214t0.f118237i) {
                    throw AbstractC29184e1.m88691m(method5, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z16 && !c29214t0.f118235g) {
                    throw AbstractC29184e1.m88691m(method5, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (c29214t0.f118246r && !c29214t0.f118236h) {
                    throw AbstractC29184e1.m88691m(method5, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                C29216u0 c29216u0 = new C29216u0(c29214t0);
                Type genericReturnType2 = method5.getGenericReturnType();
                if (AbstractC29184e1.m88689k(genericReturnType2)) {
                    throw AbstractC29184e1.m88691m(method5, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw AbstractC29184e1.m88691m(method5, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method5.getAnnotations();
                boolean z17 = c29216u0.f118265l;
                if (z17) {
                    Type[] genericParameterTypes = method5.getGenericParameterTypes();
                    Type type4 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (type4 instanceof WildcardType) {
                        type4 = ((WildcardType) type4).getLowerBounds()[0];
                    }
                    if (AbstractC29184e1.m88687i(type4) == C29218v0.class && (type4 instanceof ParameterizedType)) {
                        typeM88686h = AbstractC29184e1.m88686h(0, (ParameterizedType) type4);
                        z4 = true;
                        z13 = false;
                    } else {
                        if (AbstractC29184e1.m88687i(type4) == InterfaceC29182e.class) {
                            throw AbstractC29184e1.m88691m(method5, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", AbstractC29184e1.m88686h(0, (ParameterizedType) type4));
                        }
                        z13 = AbstractC29184e1.f118162b && type4 == C23454a0.class;
                        typeM88686h = type4;
                        z4 = false;
                    }
                    genericReturnType = new C29178c1(null, InterfaceC29182e.class, typeM88686h);
                    if (!AbstractC29184e1.m88690l(annotations, InterfaceC29226z0.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = C29172a1.f118132a;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                } else {
                    genericReturnType = method5.getGenericReturnType();
                    z4 = false;
                    z13 = false;
                }
                try {
                    InterfaceC29187g interfaceC29187gM88732a = c29224y0.m88732a(genericReturnType, annotations);
                    Type responseType = interfaceC29187gM88732a.getResponseType();
                    if (responseType == C34850x0.class) {
                        throw AbstractC29184e1.m88691m(method5, null, "'" + AbstractC29184e1.m88687i(responseType).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (responseType == C29218v0.class) {
                        throw AbstractC29184e1.m88691m(method5, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (c29216u0.f118257d.equals(str4) && !Void.class.equals(responseType) && (!AbstractC29184e1.f118162b || responseType != C23454a0.class)) {
                        throw AbstractC29184e1.m88691m(method5, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        InterfaceC29201n interfaceC29201nM88735d = c29224y0.m88735d(responseType, method5.getAnnotations());
                        InterfaceC34819i interfaceC34819i = c29224y0.f118289b;
                        if (z17) {
                            return z4 ? new C29215u(c29216u0, interfaceC34819i, interfaceC29201nM88735d, interfaceC29187gM88732a) : new C29213t(c29216u0, interfaceC34819i, interfaceC29201nM88735d, interfaceC29187gM88732a, z13);
                        }
                        return new C29211s(c29216u0, interfaceC34819i, interfaceC29201nM88735d, interfaceC29187gM88732a);
                    } catch (RuntimeException e13) {
                        throw AbstractC29184e1.m88691m(method5, e13, "Unable to create converter for %s", responseType);
                    }
                } catch (RuntimeException e14) {
                    throw AbstractC29184e1.m88691m(method5, e14, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr2[i18];
            if (annotation2 instanceof InterfaceC37271b) {
                c29214t0.m88720b("DELETE", ((InterfaceC37271b) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC37275f) {
                c29214t0.m88720b("GET", ((InterfaceC37275f) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC37276g) {
                c29214t0.m88720b("HEAD", ((InterfaceC37276g) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC37283n) {
                c29214t0.m88720b("PATCH", ((InterfaceC37283n) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC37284o) {
                c29214t0.m88720b("POST", ((InterfaceC37284o) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC37285p) {
                c29214t0.m88720b("PUT", ((InterfaceC37285p) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC37282m) {
                c29214t0.m88720b("OPTIONS", ((InterfaceC37282m) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC37277h) {
                InterfaceC37277h interfaceC37277h = (InterfaceC37277h) annotation2;
                c29214t0.m88720b(interfaceC37277h.method(), interfaceC37277h.path(), interfaceC37277h.hasBody());
            } else if (annotation2 instanceof InterfaceC37280k) {
                InterfaceC37280k interfaceC37280k = (InterfaceC37280k) annotation2;
                String[] strArrValue = interfaceC37280k.value();
                if (strArrValue.length == 0) {
                    throw AbstractC29184e1.m88691m(method3, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = interfaceC37280k.allowUnsafeNonAsciiValues();
                C22677k0 c22677k0 = new C22677k0(2, false);
                int length4 = strArrValue.length;
                int i37 = 0;
                while (i37 < length4) {
                    String str5 = strArrValue[i37];
                    int iIndexOf = str5.indexOf(58);
                    boolean z18 = z14;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str5.length() - 1) {
                        throw AbstractC29184e1.m88691m(method3, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str5);
                    }
                    String strSubstring = str5.substring(0, iIndexOf);
                    String strTrim = str5.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            C39412p c39412p = C34818h0.f146589e;
                            c29214t0.f118249u = AbstractC1772c1.m5403u(strTrim);
                        } catch (IllegalArgumentException e15) {
                            throw AbstractC29184e1.m88691m(method3, e15, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        c22677k0.m65765f(strSubstring, strTrim);
                    } else {
                        c22677k0.m65761b(strSubstring, strTrim);
                    }
                    i37++;
                    z14 = z18;
                }
                c29214t0.f118248t = c22677k0.m65766g();
            } else if (annotation2 instanceof InterfaceC37281l) {
                if (c29214t0.f118245q) {
                    throw AbstractC29184e1.m88691m(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                c29214t0.f118246r = true;
            } else if (!(annotation2 instanceof InterfaceC37274e)) {
                continue;
            } else {
                if (c29214t0.f118246r) {
                    throw AbstractC29184e1.m88691m(method3, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                c29214t0.f118245q = true;
            }
            i18++;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo88716a(C29174b0 c29174b0, Object[] objArr);
}
