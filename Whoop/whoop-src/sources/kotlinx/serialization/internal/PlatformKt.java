package kotlinx.serialization.internal;

import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import l83.C23472r;
import l83.C23473s;
import l83.C23474t;
import l83.C23475u;
import l83.C23476v;
import l83.C23477w;
import l83.C23479y;
import l83.C23480z;
import n83.C26463f;
import p249jc.AbstractC21598x;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.time.Duration;
import p715kotlin.time.Instant;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37139d;
import wc3.InterfaceC37144i;
import yb3.AbstractC39421y;
import zb3.C40261a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0004\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u0004\u0010\b\u001a#\u0010\u000b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aM\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0000*\u00020\t\"\n\b\u0001\u0010\u0010*\u0004\u0018\u00018\u0000*\u0012\u0012\u0004\u0012\u00028\u00010\u0011j\b\u0012\u0004\u0012\u00028\u0001`\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u0016*\u0006\u0012\u0002\b\u00030\nH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u0016*\u0006\u0012\u0002\b\u00030\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001aO\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\n2\"\u0010\u001c\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aO\u0010\u001d\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u00192\"\u0010\u001c\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001f\u001aO\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u00192\"\u0010\u001c\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0002¢\u0006\u0004\b \u0010\u001f\u001a%\u0010!\u001a\u0004\u0018\u00010\t\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\b!\u0010\"\u001a#\u0010#\u001a\u00020\u0007\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020\u0007\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\b%\u0010$\u001aQ\u0010'\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\u00192\"\u0010\u001c\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0002¢\u0006\u0004\b'\u0010\u001f\u001aM\u0010)\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t2\u0006\u0010(\u001a\u00020\t2\"\u0010\u001c\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\r0\u0001\"\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0002¢\u0006\u0004\b)\u0010*\u001a!\u0010-\u001a\u0004\u0018\u00010\t*\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.\u001a)\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\b/\u00100\u001a+\u00101\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002¢\u0006\u0004\b1\u00100\u001a\u001d\u00103\u001a\u00020\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\nH\u0000¢\u0006\u0004\b3\u0010\f\u001a#\u00105\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r04H\u0000¢\u0006\u0004\b5\u00106\u001a\u001e\u0010:\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0082\b¢\u0006\u0004\b:\u0010;¨\u0006<"}, m65681d2 = {"T", "", "", "index", "getChecked", "([Ljava/lang/Object;I)Ljava/lang/Object;", "", "", "([ZI)Z", "", "Lj93/d;", "isInterface", "(Lj93/d;)Z", "Lwc3/c;", "compiledSerializerImpl", "(Lj93/d;)Lwc3/c;", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "toNativeArrayImpl", "(Ljava/util/ArrayList;Lj93/d;)[Ljava/lang/Object;", "", "platformSpecificSerializerNotRegistered", "(Lj93/d;)Ljava/lang/Void;", "Ljava/lang/Class;", "serializerNotRegistered", "(Ljava/lang/Class;)Ljava/lang/Void;", "args", "constructSerializerForGivenTypeArgs", "(Lj93/d;[Lwc3/c;)Lwc3/c;", "(Ljava/lang/Class;[Lwc3/c;)Lwc3/c;", "findInNamedCompanion", "findNamedCompanionByAnnotation", "(Ljava/lang/Class;)Ljava/lang/Object;", "isNotAnnotated", "(Ljava/lang/Class;)Z", "isPolymorphicSerializer", "jClass", "invokeSerializerOnDefaultCompanion", "companion", "invokeSerializerOnCompanion", "(Ljava/lang/Object;[Lwc3/c;)Lwc3/c;", "", "companionName", "companionOrNull", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "createEnumSerializer", "(Ljava/lang/Class;)Lwc3/c;", "findObjectSerializer", "rootClass", "isReferenceArray", "", "initBuiltins", "()Ljava/util/Map;", "Lkotlin/Function0;", "Ll83/a0;", "block", "loadSafe", "(Lc93/a;)V", "kotlinx-serialization-core"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PlatformKt {
    private static final Object companionOrNull(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T> InterfaceC37138c compiledSerializerImpl(InterfaceC21461d interfaceC21461d) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        return constructSerializerForGivenTypeArgs(interfaceC21461d, new InterfaceC37138c[0]);
    }

    public static final <T> InterfaceC37138c constructSerializerForGivenTypeArgs(InterfaceC21461d interfaceC21461d, InterfaceC37138c... args) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        AbstractC22676k.m65750j(args, "args");
        return constructSerializerForGivenTypeArgs(AbstractC21598x.m60663S(interfaceC21461d), (InterfaceC37138c[]) Arrays.copyOf(args, args.length));
    }

    private static final <T> InterfaceC37138c createEnumSerializer(Class<T> cls) {
        T[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        AbstractC22676k.m65749i(canonicalName, "getCanonicalName(...)");
        AbstractC22676k.m65748h(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(canonicalName, (Enum[]) enumConstants);
    }

    private static final <T> InterfaceC37138c findInNamedCompanion(Class<T> cls, InterfaceC37138c... interfaceC37138cArr) {
        Field field;
        InterfaceC37138c interfaceC37138cInvokeSerializerOnCompanion;
        Object objFindNamedCompanionByAnnotation = findNamedCompanionByAnnotation(cls);
        if (objFindNamedCompanionByAnnotation != null && (interfaceC37138cInvokeSerializerOnCompanion = invokeSerializerOnCompanion(objFindNamedCompanionByAnnotation, (InterfaceC37138c[]) Arrays.copyOf(interfaceC37138cArr, interfaceC37138cArr.length))) != null) {
            return interfaceC37138cInvokeSerializerOnCompanion;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            AbstractC22676k.m65749i(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i13 = 0;
            Class<?> cls2 = null;
            boolean z4 = false;
            while (true) {
                if (i13 >= length) {
                    if (z4) {
                        break;
                    }
                } else {
                    Class<?> cls3 = declaredClasses[i13];
                    if (cls3.getSimpleName().equals("$serializer")) {
                        if (!z4) {
                            z4 = true;
                            cls2 = cls3;
                        }
                    }
                    i13++;
                }
                cls2 = null;
                break;
            }
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof InterfaceC37138c) {
                return (InterfaceC37138c) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    private static final <T> Object findNamedCompanionByAnnotation(Class<T> cls) {
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        AbstractC22676k.m65749i(declaredClasses, "getDeclaredClasses(...)");
        for (Class<?> cls2 : declaredClasses) {
            if (cls2.getAnnotation(NamedCompanion.class) != null) {
                if (cls2 == null) {
                    return null;
                }
                return companionOrNull(cls, cls2.getSimpleName());
            }
        }
        cls2 = null;
        if (cls2 == null) {
            return null;
        }
        return companionOrNull(cls, cls2.getSimpleName());
    }

    private static final <T> InterfaceC37138c findObjectSerializer(Class<T> cls) throws IllegalAccessException, InvocationTargetException {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            int i13 = 0;
            if (!AbstractC39421y.m125930O(canonicalName, "java.", false) && !AbstractC39421y.m125930O(canonicalName, "kotlin.", false)) {
                Field[] declaredFields = cls.getDeclaredFields();
                AbstractC22676k.m65749i(declaredFields, "getDeclaredFields(...)");
                int length = declaredFields.length;
                Field field = null;
                int i14 = 0;
                boolean z4 = false;
                while (true) {
                    if (i14 >= length) {
                        if (!z4) {
                            break;
                        }
                        break;
                    }
                    Field field2 = declaredFields[i14];
                    if (AbstractC22676k.m65745e(field2.getName(), "INSTANCE") && AbstractC22676k.m65745e(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                        if (!z4) {
                            z4 = true;
                            field = field2;
                        }
                    }
                    i14++;
                    field = null;
                    break;
                }
                if (field != null) {
                    Object obj = field.get(null);
                    Method[] methods = cls.getMethods();
                    AbstractC22676k.m65749i(methods, "getMethods(...)");
                    int length2 = methods.length;
                    Method method = null;
                    boolean z13 = false;
                    while (true) {
                        if (i13 >= length2) {
                            if (!z13) {
                                break;
                            }
                            break;
                        }
                        Method method2 = methods[i13];
                        if (AbstractC22676k.m65745e(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            AbstractC22676k.m65749i(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 && AbstractC22676k.m65745e(method2.getReturnType(), InterfaceC37138c.class)) {
                                if (!z13) {
                                    method = method2;
                                    z13 = true;
                                }
                            }
                        }
                        i13++;
                        method = null;
                        break;
                    }
                    if (method != null) {
                        Object objInvoke = method.invoke(obj, null);
                        if (objInvoke instanceof InterfaceC37138c) {
                            return (InterfaceC37138c) objInvoke;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final <T> T getChecked(T[] tArr, int i13) {
        AbstractC22676k.m65750j(tArr, "<this>");
        return tArr[i13];
    }

    public static final Map<InterfaceC21461d, InterfaceC37138c> initBuiltins() {
        C26463f c26463f = new C26463f();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c26463f.put(c22673i0.getOrCreateKotlinClass(String.class), StringSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(Character.TYPE), CharSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(char[].class), CharArraySerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(Double.TYPE), DoubleSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(double[].class), DoubleArraySerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(Float.TYPE), FloatSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(float[].class), FloatArraySerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(Long.TYPE), LongSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(long[].class), LongArraySerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(C23476v.class), ULongSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(Integer.TYPE), IntSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(int[].class), IntArraySerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(C23474t.class), UIntSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(Short.TYPE), ShortSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(short[].class), ShortArraySerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(C23479y.class), UShortSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(Byte.TYPE), ByteSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(byte[].class), ByteArraySerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(C23472r.class), UByteSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(Boolean.TYPE), BooleanSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(boolean[].class), BooleanArraySerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(C23454a0.class), UnitSerializer.INSTANCE);
        c26463f.put(c22673i0.getOrCreateKotlinClass(Void.class), NothingSerializer.INSTANCE);
        try {
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Duration.class);
            AbstractC22676k.m65750j(Duration.INSTANCE, "<this>");
            c26463f.put(orCreateKotlinClass, DurationSerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            c26463f.put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23477w.class), ULongArraySerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            c26463f.put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23475u.class), UIntArraySerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            c26463f.put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23480z.class), UShortArraySerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            c26463f.put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23473s.class), UByteArraySerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            c26463f.put(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40261a.class), UuidSerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            InterfaceC21461d orCreateKotlinClass2 = AbstractC22671h0.f89337a.getOrCreateKotlinClass(Instant.class);
            AbstractC22676k.m65750j(Instant.INSTANCE, "<this>");
            c26463f.put(orCreateKotlinClass2, InstantSerializer.INSTANCE);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        return c26463f.m78380b();
    }

    private static final <T> InterfaceC37138c invokeSerializerOnCompanion(Object obj, InterfaceC37138c... interfaceC37138cArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC37138cArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC37138cArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i13 = 0; i13 < length; i13++) {
                    clsArr2[i13] = InterfaceC37138c.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC37138cArr, interfaceC37138cArr.length));
            if (objInvoke instanceof InterfaceC37138c) {
                return (InterfaceC37138c) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause == null) {
                throw e5;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e5.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final <T> InterfaceC37138c invokeSerializerOnDefaultCompanion(Class<?> cls, InterfaceC37138c... interfaceC37138cArr) {
        Object objCompanionOrNull = companionOrNull(cls, "Companion");
        if (objCompanionOrNull == null) {
            return null;
        }
        return invokeSerializerOnCompanion(objCompanionOrNull, (InterfaceC37138c[]) Arrays.copyOf(interfaceC37138cArr, interfaceC37138cArr.length));
    }

    public static final <T> boolean isInterface(InterfaceC21461d interfaceC21461d) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        return AbstractC21598x.m60663S(interfaceC21461d).isInterface();
    }

    private static final <T> boolean isNotAnnotated(Class<T> cls) {
        return cls.getAnnotation(InterfaceC37144i.class) == null && cls.getAnnotation(InterfaceC37139d.class) == null;
    }

    private static final <T> boolean isPolymorphicSerializer(Class<T> cls) {
        if (cls.getAnnotation(InterfaceC37139d.class) != null) {
            return true;
        }
        InterfaceC37144i interfaceC37144i = (InterfaceC37144i) cls.getAnnotation(InterfaceC37144i.class);
        if (interfaceC37144i == null) {
            return false;
        }
        Class clsWith = interfaceC37144i.with();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return AbstractC22676k.m65745e(c22673i0.getOrCreateKotlinClass(clsWith), c22673i0.getOrCreateKotlinClass(C37140e.class));
    }

    public static final boolean isReferenceArray(InterfaceC21461d rootClass) {
        AbstractC22676k.m65750j(rootClass, "rootClass");
        return AbstractC21598x.m60663S(rootClass).isArray();
    }

    private static final void loadSafe(InterfaceC4339a interfaceC4339a) {
        try {
            interfaceC4339a.invoke();
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
    }

    public static final Void platformSpecificSerializerNotRegistered(InterfaceC21461d interfaceC21461d) {
        AbstractC22676k.m65750j(interfaceC21461d, "<this>");
        Platform_commonKt.serializerNotRegistered(interfaceC21461d);
        throw new KotlinNothingValueException();
    }

    public static final Void serializerNotRegistered(Class<?> cls) {
        AbstractC22676k.m65750j(cls, "<this>");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(AbstractC21598x.m60666V(cls)));
    }

    public static final <T, E extends T> E[] toNativeArrayImpl(ArrayList<E> arrayList, InterfaceC21461d eClass) {
        AbstractC22676k.m65750j(arrayList, "<this>");
        AbstractC22676k.m65750j(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) AbstractC21598x.m60663S(eClass), arrayList.size());
        AbstractC22676k.m65748h(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        AbstractC22676k.m65749i(eArr, "toArray(...)");
        return eArr;
    }

    public static final <T> InterfaceC37138c constructSerializerForGivenTypeArgs(Class<T> cls, InterfaceC37138c... args) {
        AbstractC22676k.m65750j(cls, "<this>");
        AbstractC22676k.m65750j(args, "args");
        if (cls.isEnum() && isNotAnnotated(cls)) {
            return createEnumSerializer(cls);
        }
        InterfaceC37138c interfaceC37138cInvokeSerializerOnDefaultCompanion = invokeSerializerOnDefaultCompanion(cls, (InterfaceC37138c[]) Arrays.copyOf(args, args.length));
        if (interfaceC37138cInvokeSerializerOnDefaultCompanion != null) {
            return interfaceC37138cInvokeSerializerOnDefaultCompanion;
        }
        InterfaceC37138c interfaceC37138cFindObjectSerializer = findObjectSerializer(cls);
        if (interfaceC37138cFindObjectSerializer != null) {
            return interfaceC37138cFindObjectSerializer;
        }
        InterfaceC37138c interfaceC37138cFindInNamedCompanion = findInNamedCompanion(cls, (InterfaceC37138c[]) Arrays.copyOf(args, args.length));
        if (interfaceC37138cFindInNamedCompanion != null) {
            return interfaceC37138cFindInNamedCompanion;
        }
        if (isPolymorphicSerializer(cls)) {
            return new C37140e(AbstractC21598x.m60666V(cls));
        }
        return null;
    }

    public static final boolean getChecked(boolean[] zArr, int i13) {
        AbstractC22676k.m65750j(zArr, "<this>");
        return zArr[i13];
    }
}
