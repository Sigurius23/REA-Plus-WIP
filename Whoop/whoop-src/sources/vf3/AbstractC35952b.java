package vf3;

import cd3.AbstractC4454f;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.internal.ReferenceArraySerializer;
import kotlinx.serialization.internal.TripleSerializer;
import l83.C23465k;
import l83.C23471q;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p249jc.AbstractC21598x;
import p549vb.AbstractC35862g;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import xc3.AbstractC38195a;
import yb3.AbstractC39414r;
import yc3.AbstractC39442f;
import yc3.AbstractC39447k;
import yc3.C39437a;
import yc3.C39444h;
import yc3.C39448l;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: vf3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35952b {
    /* JADX INFO: renamed from: a */
    public static final long m114193a(float f13, float f14) {
        return (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39443g m114194b(String str, AbstractC39442f abstractC39442f) {
        if (AbstractC39414r.m125890i0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return PrimitivesKt.PrimitiveDescriptorSafe(str, abstractC39442f);
    }

    /* JADX INFO: renamed from: c */
    public static C39444h m114195c(String str, InterfaceC39443g[] interfaceC39443gArr) {
        if (AbstractC39414r.m125890i0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C39437a c39437a = new C39437a(str);
        return new C39444h(str, C39448l.f169713a, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    /* JADX INFO: renamed from: d */
    public static final C39444h m114196d(String serialName, AbstractC39447k abstractC39447k, InterfaceC39443g[] interfaceC39443gArr, Function1 function1) {
        AbstractC22676k.m65750j(serialName, "serialName");
        if (AbstractC39414r.m125890i0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC39447k.equals(C39448l.f169713a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C39437a c39437a = new C39437a(serialName);
        function1.invoke(c39437a);
        return new C39444h(serialName, abstractC39447k, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    /* JADX INFO: renamed from: e */
    public static C39444h m114197e(String serialName, AbstractC39447k abstractC39447k, InterfaceC39443g[] interfaceC39443gArr) {
        AbstractC22676k.m65750j(serialName, "serialName");
        if (AbstractC39414r.m125890i0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (abstractC39447k.equals(C39448l.f169713a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C39437a c39437a = new C39437a(serialName);
        return new C39444h(serialName, abstractC39447k, c39437a.f169680c.size(), AbstractC25260n.m74049W0(interfaceC39443gArr), c39437a);
    }

    /* JADX INFO: renamed from: f */
    public static final C35953c m114198f(String str) {
        return new C35953c(str);
    }

    /* JADX INFO: renamed from: g */
    public static final Class m114199g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            AbstractC22676k.m65749i(rawType, "getRawType(...)");
            return m114199g(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            AbstractC22676k.m65749i(upperBounds, "getUpperBounds(...)");
            Object objM74078s0 = AbstractC25260n.m74078s0(upperBounds);
            AbstractC22676k.m65749i(objM74078s0, "first(...)");
            return m114199g((Type) objM74078s0);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            AbstractC22676k.m65749i(genericComponentType, "getGenericComponentType(...)");
            return m114199g(genericComponentType);
        }
        StringBuilder sb4 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb4.append(type);
        sb4.append(" has type ");
        throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, type.getClass(), sb4));
    }

    /* JADX INFO: renamed from: h */
    public static final String m114200h(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[DfuBaseService.ERROR_REMOTE_MASK];
        int i13 = reader.read(cArr);
        while (i13 >= 0) {
            stringWriter.write(cArr, 0, i13);
            i13 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC37138c m114201i(AbstractC4454f abstractC4454f, Class cls, List list) {
        InterfaceC37138c[] interfaceC37138cArr = (InterfaceC37138c[]) list.toArray(new InterfaceC37138c[0]);
        InterfaceC37138c interfaceC37138cConstructSerializerForGivenTypeArgs = PlatformKt.constructSerializerForGivenTypeArgs(cls, (InterfaceC37138c[]) Arrays.copyOf(interfaceC37138cArr, interfaceC37138cArr.length));
        if (interfaceC37138cConstructSerializerForGivenTypeArgs != null) {
            return interfaceC37138cConstructSerializerForGivenTypeArgs;
        }
        InterfaceC21461d interfaceC21461dM60666V = AbstractC21598x.m60666V(cls);
        InterfaceC37138c interfaceC37138cBuiltinSerializerOrNull = PrimitivesKt.builtinSerializerOrNull(interfaceC21461dM60666V);
        if (interfaceC37138cBuiltinSerializerOrNull != null) {
            return interfaceC37138cBuiltinSerializerOrNull;
        }
        InterfaceC37138c interfaceC37138cMo13924b = abstractC4454f.mo13924b(interfaceC21461dM60666V, list);
        if (interfaceC37138cMo13924b != null) {
            return interfaceC37138cMo13924b;
        }
        if (cls.isInterface()) {
            return new C37140e(AbstractC21598x.m60666V(cls));
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC37138c m114202j(AbstractC4454f abstractC4454f, Type type, boolean z4) {
        ArrayList<InterfaceC37138c> arrayList;
        InterfaceC37138c interfaceC37138cM114202j;
        InterfaceC37138c interfaceC37138cM114202j2;
        InterfaceC21461d interfaceC21461dM60666V;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                AbstractC22676k.m65749i(upperBounds, "getUpperBounds(...)");
                genericComponentType = (Type) AbstractC25260n.m74078s0(upperBounds);
            }
            AbstractC22676k.m65747g(genericComponentType);
            if (z4) {
                interfaceC37138cM114202j2 = AbstractC35862g.m113845h(abstractC4454f, genericComponentType);
            } else {
                AbstractC22676k.m65750j(abstractC4454f, "<this>");
                interfaceC37138cM114202j2 = m114202j(abstractC4454f, genericComponentType, false);
                if (interfaceC37138cM114202j2 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                AbstractC22676k.m65748h(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                interfaceC21461dM60666V = AbstractC21598x.m60666V((Class) rawType);
            } else {
                if (!(genericComponentType instanceof InterfaceC21461d)) {
                    throw new IllegalStateException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, genericComponentType.getClass(), new StringBuilder("unsupported type in GenericArray: ")));
                }
                interfaceC21461dM60666V = (InterfaceC21461d) genericComponentType;
            }
            AbstractC22676k.m65748h(interfaceC21461dM60666V, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return new ReferenceArraySerializer(interfaceC21461dM60666V, interfaceC37138cM114202j2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return m114201i(abstractC4454f, cls, C25271y.f99162w);
            }
            Class<?> componentType = cls.getComponentType();
            AbstractC22676k.m65749i(componentType, "getComponentType(...)");
            if (z4) {
                interfaceC37138cM114202j = AbstractC35862g.m113845h(abstractC4454f, componentType);
            } else {
                AbstractC22676k.m65750j(abstractC4454f, "<this>");
                interfaceC37138cM114202j = m114202j(abstractC4454f, componentType, false);
                if (interfaceC37138cM114202j == null) {
                    return null;
                }
            }
            InterfaceC21461d interfaceC21461dM60666V2 = AbstractC21598x.m60666V(componentType);
            AbstractC22676k.m65748h(interfaceC21461dM60666V2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return new ReferenceArraySerializer(interfaceC21461dM60666V2, interfaceC37138cM114202j);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
                AbstractC22676k.m65749i(upperBounds2, "getUpperBounds(...)");
                Object objM74078s0 = AbstractC25260n.m74078s0(upperBounds2);
                AbstractC22676k.m65749i(objM74078s0, "first(...)");
                return m114202j(abstractC4454f, (Type) objM74078s0, true);
            }
            StringBuilder sb4 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
            sb4.append(type);
            sb4.append(" has type ");
            throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, type.getClass(), sb4));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        AbstractC22676k.m65748h(rawType2, "null cannot be cast to non-null type java.lang.Class<*>");
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC22676k.m65747g(actualTypeArguments);
        if (z4) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                AbstractC22676k.m65747g(type2);
                arrayList.add(AbstractC35862g.m113845h(abstractC4454f, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                AbstractC22676k.m65747g(type3);
                AbstractC22676k.m65750j(abstractC4454f, "<this>");
                InterfaceC37138c interfaceC37138cM114202j3 = m114202j(abstractC4454f, type3, false);
                if (interfaceC37138cM114202j3 == null) {
                    return null;
                }
                arrayList.add(interfaceC37138cM114202j3);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            InterfaceC37138c elementSerializer = (InterfaceC37138c) arrayList.get(0);
            AbstractC22676k.m65750j(elementSerializer, "elementSerializer");
            return new LinkedHashSetSerializer(elementSerializer);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            return AbstractC38195a.m122333a((InterfaceC37138c) arrayList.get(0));
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return AbstractC38195a.m122335c((InterfaceC37138c) arrayList.get(0), (InterfaceC37138c) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            return AbstractC38195a.m122334b((InterfaceC37138c) arrayList.get(0), (InterfaceC37138c) arrayList.get(1));
        }
        if (C23465k.class.isAssignableFrom(cls2)) {
            InterfaceC37138c keySerializer = (InterfaceC37138c) arrayList.get(0);
            InterfaceC37138c valueSerializer = (InterfaceC37138c) arrayList.get(1);
            AbstractC22676k.m65750j(keySerializer, "keySerializer");
            AbstractC22676k.m65750j(valueSerializer, "valueSerializer");
            return new PairSerializer(keySerializer, valueSerializer);
        }
        if (C23471q.class.isAssignableFrom(cls2)) {
            InterfaceC37138c aSerializer = (InterfaceC37138c) arrayList.get(0);
            InterfaceC37138c bSerializer = (InterfaceC37138c) arrayList.get(1);
            InterfaceC37138c cSerializer = (InterfaceC37138c) arrayList.get(2);
            AbstractC22676k.m65750j(aSerializer, "aSerializer");
            AbstractC22676k.m65750j(bSerializer, "bSerializer");
            AbstractC22676k.m65750j(cSerializer, "cSerializer");
            return new TripleSerializer(aSerializer, bSerializer, cSerializer);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        for (InterfaceC37138c interfaceC37138c : arrayList) {
            AbstractC22676k.m65748h(interfaceC37138c, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            arrayList2.add(interfaceC37138c);
        }
        return m114201i(abstractC4454f, cls2, arrayList2);
    }
}
