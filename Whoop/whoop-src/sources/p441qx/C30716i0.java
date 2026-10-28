package p441qx;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import p471rx.AbstractC31885f;

/* JADX INFO: renamed from: qx.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C30716i0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f126485a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public int f126486b = 0;

    /* JADX WARN: Code duplicated, block: B:101:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX INFO: renamed from: a */
    public final void m94391a(Object obj) {
        ?? r10;
        Class<?> cls;
        ?? r24;
        Object obj2;
        ?? r14;
        String str;
        String str2;
        Class cls2;
        int i13;
        int i14;
        Class cls3;
        AbstractC30705d c30703c;
        AbstractC30705d abstractC30705dM94382a;
        ?? r15;
        ?? r25;
        String str3;
        String str4;
        ?? r26;
        AbstractC30705d c30703c2;
        boolean z4;
        AbstractC30705d abstractC30705dM94382a2;
        boolean z13;
        if (obj == null) {
            throw new IllegalArgumentException("adapter == null");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Class<?> superclass = obj.getClass();
        while (superclass != Object.class) {
            Method[] declaredMethods = superclass.getDeclaredMethods();
            int length = declaredMethods.length;
            int i15 = 0;
            while (i15 < length) {
                ?? r16 = r10[i15];
                boolean zIsAnnotationPresent = r16.isAnnotationPresent(InterfaceC30738t0.class);
                Class<JsonAdapter> cls4 = JsonAdapter.class;
                Class cls5 = Void.TYPE;
                if (zIsAnnotationPresent) {
                    r16.setAccessible(true);
                    Type genericReturnType = r16.getGenericReturnType();
                    Type[] genericParameterTypes = r16.getGenericParameterTypes();
                    Annotation[][] parameterAnnotations = r16.getParameterAnnotations();
                    i13 = 0;
                    if (genericParameterTypes.length >= 2 && genericParameterTypes[0] == AbstractC30704c0.class && genericReturnType == cls5) {
                        int length2 = genericParameterTypes.length;
                        int i16 = 2;
                        ?? r17 = r10;
                        while (true) {
                            if (i16 < length2) {
                                cls = superclass;
                                Type type = genericParameterTypes[i16];
                                r25 = r17;
                                if ((type instanceof ParameterizedType) && ((ParameterizedType) type).getRawType() == cls4) {
                                    i16++;
                                    superclass = cls;
                                    r17 = r25;
                                }
                            } else {
                                cls = superclass;
                                r26 = r17;
                                obj2 = "Nullable";
                                str4 = "\n    ";
                                str3 = "Unexpected signature for ";
                                z4 = true;
                                c30703c2 = new C30701b(genericParameterTypes[1], AbstractC31885f.m99128f(parameterAnnotations[1]), obj, r16, genericParameterTypes.length, 2, true, 0);
                                cls2 = cls5;
                            }
                            abstractC30705dM94382a2 = C30707e.m94382a(arrayList, c30703c2.f126441a, c30703c2.f126442b);
                            if (abstractC30705dM94382a2 == null) {
                                throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + abstractC30705dM94382a2.f126444d + str4 + c30703c2.f126444d);
                            }
                            arrayList.add(c30703c2);
                            str = str4;
                            str2 = str3;
                            r14 = z4;
                            r24 = r26;
                        }
                    } else {
                        r10 = declaredMethods;
                        r10 = declaredMethods;
                        cls = superclass;
                        r25 = r10;
                    }
                    obj2 = "Nullable";
                    str4 = "\n    ";
                    str3 = "Unexpected signature for ";
                    z4 = true;
                    if (genericParameterTypes.length != 1 || genericReturnType == cls5) {
                        throw new IllegalArgumentException(str3 + r16 + ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n");
                    }
                    Set set = AbstractC31885f.f132390a;
                    Set setM99128f = AbstractC31885f.m99128f(r16.getAnnotations());
                    Set setM99128f2 = AbstractC31885f.m99128f(parameterAnnotations[0]);
                    Annotation[] annotationArr = parameterAnnotations[0];
                    int length3 = annotationArr.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length3) {
                            z13 = false;
                            break;
                        } else {
                            if (annotationArr[i17].annotationType().getSimpleName().equals(obj2)) {
                                z13 = true;
                                break;
                            }
                            i17++;
                        }
                    }
                    cls2 = cls5;
                    c30703c2 = new C30703c(genericParameterTypes[0], setM99128f2, obj, r16, genericParameterTypes.length, z13, genericParameterTypes, genericReturnType, setM99128f2, setM99128f, 0);
                    r26 = r25;
                    abstractC30705dM94382a2 = C30707e.m94382a(arrayList, c30703c2.f126441a, c30703c2.f126442b);
                    if (abstractC30705dM94382a2 == null) {
                        throw new IllegalArgumentException("Conflicting @ToJson methods:\n    " + abstractC30705dM94382a2.f126444d + str4 + c30703c2.f126444d);
                    }
                    arrayList.add(c30703c2);
                    str = str4;
                    str2 = str3;
                    r14 = z4;
                    r24 = r26;
                } else {
                    r10 = declaredMethods;
                    cls = superclass;
                    r24 = r10;
                    obj2 = "Nullable";
                    cls4 = cls4;
                    r14 = 1;
                    str = "\n    ";
                    str2 = "Unexpected signature for ";
                    cls2 = cls5;
                    i13 = 0;
                }
                if (r16.isAnnotationPresent(InterfaceC30729p.class)) {
                    r16.setAccessible(r14);
                    String str5 = str;
                    Type genericReturnType2 = r16.getGenericReturnType();
                    Set set2 = AbstractC31885f.f132390a;
                    Set setM99128f3 = AbstractC31885f.m99128f(r16.getAnnotations());
                    Type[] genericParameterTypes2 = r16.getGenericParameterTypes();
                    Annotation[][] parameterAnnotations2 = r16.getParameterAnnotations();
                    if (genericParameterTypes2.length < r14 || genericParameterTypes2[i13] != JsonReader.class) {
                        i14 = length;
                        cls3 = cls2;
                    } else {
                        cls3 = cls2;
                        if (genericReturnType2 != cls3) {
                            int length4 = genericParameterTypes2.length;
                            ?? r18 = r14;
                            while (true) {
                                if (r18 < length4) {
                                    Type type2 = genericParameterTypes2[r18];
                                    i14 = length;
                                    if ((type2 instanceof ParameterizedType) && ((ParameterizedType) type2).getRawType() == cls4) {
                                        length = i14;
                                        r18++;
                                    }
                                } else {
                                    i14 = length;
                                    str5 = str5;
                                    c30703c = new C30701b(genericReturnType2, setM99128f3, obj, r16, genericParameterTypes2.length, 1, true, 1);
                                }
                                abstractC30705dM94382a = C30707e.m94382a(arrayList2, c30703c.f126441a, c30703c.f126442b);
                                if (abstractC30705dM94382a == null) {
                                    throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + abstractC30705dM94382a.f126444d + str5 + c30703c.f126444d);
                                }
                                arrayList2.add(c30703c);
                            }
                        } else {
                            i14 = length;
                        }
                    }
                    if (genericParameterTypes2.length != 1 || genericReturnType2 == cls3) {
                        throw new IllegalArgumentException(str2 + r16 + ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n");
                    }
                    Set setM99128f4 = AbstractC31885f.m99128f(parameterAnnotations2[i13]);
                    Annotation[] annotationArr2 = parameterAnnotations2[i13];
                    int length5 = annotationArr2.length;
                    int i18 = i13;
                    while (true) {
                        if (i18 >= length5) {
                            r15 = i13;
                            break;
                        } else {
                            if (annotationArr2[i18].annotationType().getSimpleName().equals(obj2)) {
                                r15 = 1;
                                break;
                            }
                            i18++;
                        }
                    }
                    c30703c = new C30703c(genericReturnType2, setM99128f3, obj, r16, genericParameterTypes2.length, r15, genericParameterTypes2, genericReturnType2, setM99128f4, setM99128f3, 1);
                    abstractC30705dM94382a = C30707e.m94382a(arrayList2, c30703c.f126441a, c30703c.f126442b);
                    if (abstractC30705dM94382a == null) {
                        throw new IllegalArgumentException("Conflicting @FromJson methods:\n    " + abstractC30705dM94382a.f126444d + str5 + c30703c.f126444d);
                    }
                    arrayList2.add(c30703c);
                } else {
                    i14 = length;
                }
                i15++;
                superclass = cls;
                r10 = r24;
                length = i14;
            }
            r10 = declaredMethods;
            superclass = superclass.getSuperclass();
        }
        int i19 = 0;
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            throw new IllegalArgumentException("Expected at least one @ToJson or @FromJson method on ".concat(obj.getClass().getName()));
        }
        m94393c(new C30707e(i19, arrayList, arrayList2));
    }

    /* JADX INFO: renamed from: b */
    public final void m94392b(Type type, JsonAdapter jsonAdapter) {
        ArrayList arrayList = C30722l0.f126505d;
        m94393c(new C30707e(1, type, jsonAdapter));
    }

    /* JADX INFO: renamed from: c */
    public final void m94393c(InterfaceC30735s interfaceC30735s) {
        if (interfaceC30735s == null) {
            throw new IllegalArgumentException("factory == null");
        }
        int i13 = this.f126486b;
        this.f126486b = i13 + 1;
        this.f126485a.add(i13, interfaceC30735s);
    }
}
