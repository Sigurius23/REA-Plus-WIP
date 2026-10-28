package pg3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import ud3.C34810e0;
import ud3.InterfaceC34819i;

/* JADX INFO: renamed from: pg3.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29224y0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f118288a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final InterfaceC34819i f118289b;

    /* JADX INFO: renamed from: c */
    public final C34810e0 f118290c;

    /* JADX INFO: renamed from: d */
    public final List f118291d;

    /* JADX INFO: renamed from: e */
    public final int f118292e;

    /* JADX INFO: renamed from: f */
    public final List f118293f;

    /* JADX INFO: renamed from: g */
    public final int f118294g;

    /* JADX INFO: renamed from: h */
    public final Executor f118295h;

    public C29224y0(InterfaceC34819i interfaceC34819i, C34810e0 c34810e0, List list, int i13, List list2, int i14, Executor executor) {
        this.f118289b = interfaceC34819i;
        this.f118290c = c34810e0;
        this.f118291d = list;
        this.f118292e = i13;
        this.f118293f = list2;
        this.f118294g = i14;
        this.f118295h = executor;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC29187g m88732a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f118293f;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i13 = iIndexOf; i13 < size; i13++) {
            InterfaceC29187g interfaceC29187g = ((AbstractC29185f) list.get(i13)).get(type, annotationArr, this);
            if (interfaceC29187g != null) {
                return interfaceC29187g;
            }
        }
        StringBuilder sb4 = new StringBuilder("Could not locate call adapter for ");
        sb4.append(type);
        sb4.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb4.append("\n   * ");
            sb4.append(((AbstractC29185f) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb4.toString());
    }

    /* JADX INFO: renamed from: b */
    public final Object m88733b(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb4 = new StringBuilder("Type parameters are unsupported on ");
                sb4.append(cls2.getName());
                if (cls2 != cls) {
                    sb4.append(" which is an interface of ");
                    sb4.append(cls.getName());
                }
                throw new IllegalArgumentException(sb4.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C29220w0(this, cls));
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC29201n m88734c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = this.f118291d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i13 = iIndexOf; i13 < size; i13++) {
            InterfaceC29201n interfaceC29201nRequestBodyConverter = ((AbstractC29199m) list.get(i13)).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (interfaceC29201nRequestBodyConverter != null) {
                return interfaceC29201nRequestBodyConverter;
            }
        }
        StringBuilder sb4 = new StringBuilder("Could not locate RequestBody converter for ");
        sb4.append(type);
        sb4.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb4.append("\n   * ");
            sb4.append(((AbstractC29199m) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb4.toString());
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC29201n m88735d(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = this.f118291d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i13 = iIndexOf; i13 < size; i13++) {
            InterfaceC29201n interfaceC29201nResponseBodyConverter = ((AbstractC29199m) list.get(i13)).responseBodyConverter(type, annotationArr, this);
            if (interfaceC29201nResponseBodyConverter != null) {
                return interfaceC29201nResponseBodyConverter;
            }
        }
        StringBuilder sb4 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb4.append(type);
        sb4.append(".\n");
        sb4.append("  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb4.append("\n   * ");
            sb4.append(((AbstractC29199m) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb4.toString());
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC29201n m88736e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = this.f118291d;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC29201n interfaceC29201nStringConverter = ((AbstractC29199m) list.get(i13)).stringConverter(type, annotationArr, this);
            if (interfaceC29201nStringConverter != null) {
                return interfaceC29201nStringConverter;
            }
        }
        return C29173b.f118134y;
    }
}
