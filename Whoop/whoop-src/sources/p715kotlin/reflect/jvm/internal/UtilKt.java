package p715kotlin.reflect.jvm.internal;

import ab3.AbstractC0715g;
import ab3.AbstractC0727s;
import ab3.C0709a;
import ab3.C0710b;
import ab3.C0714f;
import ab3.C0717i;
import ab3.C0718j;
import ab3.C0725q;
import ab3.C0726r;
import ab3.C0728t;
import ab3.C0730v;
import ab3.C0733y;
import c93.InterfaceC4351m;
import cb3.AbstractC4393e;
import hb3.C17119i;
import hb3.C17122k;
import hb3.C17135x;
import j93.EnumC21466f0;
import j93.InterfaceC21456a0;
import j93.InterfaceC21459c;
import j93.InterfaceC21463e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import o93.EnumC27738j;
import oa3.C27774q;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22657a0;
import p715kotlin.jvm.internal.AbstractC22660c;
import p715kotlin.jvm.internal.AbstractC22670h;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22675j0;
import p93.C29028g;
import p93.C29031j;
import q93.C30080d;
import qa3.C30122c0;
import qa3.C30146k0;
import r93.AbstractC31150q;
import r93.AbstractC31152r;
import r93.InterfaceC31108b;
import r93.InterfaceC31109b0;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31135k;
import r93.InterfaceC31151q0;
import r93.InterfaceC31155s0;
import s93.InterfaceC32299a;
import s93.InterfaceC32300b;
import s93.InterfaceC32307i;
import sa3.AbstractC32327a;
import sa3.C32334h;
import sa3.C32336j;
import sa3.InterfaceC32332f;
import se.AbstractC32411b;
import va3.AbstractC35846d;
import va3.C35845c;
import va3.C35847e;
import va3.C35848f;
import va3.C35850h;
import w93.C36968a;
import w93.C36972e;
import w93.C36973f;
import wa3.InterfaceC37019v;
import wb3.AbstractC37056f;
import x93.AbstractC38109c;
import x93.AbstractC38126r;
import x93.C38111d;
import x93.C38122n;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0018*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010\"\u001a\u0004\u0018\u00010!*\u0006\u0012\u0002\b\u00030 2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u001d\u0010%\u001a\u0004\u0018\u00010!*\u00020$2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&\u001a\u0017\u0010(\u001a\u0004\u0018\u00010'*\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b(\u0010)\u001a\u001b\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010**\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b+\u0010,\u001a\u001b\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010-*\u0004\u0018\u00010!H\u0000¢\u0006\u0004\b.\u0010/\u001a\u0019\u00102\u001a\u0004\u0018\u00010!2\u0006\u00101\u001a\u000200H\u0000¢\u0006\u0004\b2\u00103\u001a=\u00108\u001a\u0004\u0018\u000107*\u0006\u0012\u0002\b\u00030\u00012\u0006\u00104\u001a\u00020\f2\u001a\u00106\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000105\"\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b8\u00109\u001a!\u0010;\u001a\u0004\u0018\u00010:*\u0006\u0012\u0002\b\u00030\u00012\u0006\u00104\u001a\u00020\fH\u0000¢\u0006\u0004\b;\u0010<\u001a'\u0010@\u001a\u00028\u0000\"\u0004\b\u0000\u0010=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0080\bø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001ai\u0010Q\u001a\u00028\u0001\"\b\b\u0000\u0010C*\u00020B\"\b\b\u0001\u0010E*\u00020D2\n\u0010F\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010G\u001a\u00028\u00002\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020L2\u0018\u0010P\u001a\u0014\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010NH\u0000¢\u0006\u0004\bQ\u0010R\"\u001a\u0010T\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0014\u0010X\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010Y\"\u0018\u0010\\\u001a\u00020[*\u00020Z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]\"\u0018\u0010_\u001a\u00020[*\u00020Z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010]\"\u001a\u0010c\u001a\u0004\u0018\u00010`*\u00020D8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\ba\u0010b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006d"}, m65681d2 = {"Lr93/e;", "Ljava/lang/Class;", "toJavaClass", "(Lr93/e;)Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "Lva3/c;", "kotlinClassId", "", "arrayDimensions", "loadClass", "(Ljava/lang/ClassLoader;Lva3/c;I)Ljava/lang/Class;", "classLoader", "", "packageName", "className", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Class;", "createArrayType", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lr93/r;", "Lj93/f0;", "toKVisibility", "(Lr93/r;)Lj93/f0;", "Ls93/a;", "", "", "computeAnnotations", "(Ls93/a;)Ljava/util/List;", "unwrapRepeatableAnnotations", "(Ljava/util/List;)Ljava/util/List;", "Ls93/b;", "toAnnotationInstance", "(Ls93/b;)Ljava/lang/annotation/Annotation;", "Lab3/g;", "", "toRuntimeValue", "(Lab3/g;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lab3/b;", "arrayToRuntimeValue", "(Lab3/b;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/ReflectKFunction;", "asReflectFunction", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/ReflectKFunction;", "Lkotlin/reflect/jvm/internal/ReflectKProperty;", "asReflectProperty", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/ReflectKProperty;", "Lkotlin/reflect/jvm/internal/ReflectKCallable;", "asReflectCallable", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/ReflectKCallable;", "Ljava/lang/reflect/Type;", "type", "defaultPrimitiveValue", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "name", "", "parameterTypes", "Ljava/lang/reflect/Method;", "getDeclaredMethodOrNull", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Field;", "getDeclaredFieldOrNull", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lc93/a;)Ljava/lang/Object;", "Lwa3/v;", "M", "Lr93/b;", "D", "moduleAnchor", "proto", "Lsa3/f;", "nameResolver", "Lsa3/h;", "typeTable", "Lsa3/a;", "metadataVersion", "Lkotlin/Function2;", "Lhb3/x;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lc93/m;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "Lva3/e;", "JVM_STATIC", "Lva3/e;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "SUSPEND_FUNCTION_PREFIX", "Ljava/lang/String;", "Lj93/a0;", "", "isInlineClassType", "(Lj93/a0;)Z", "getNeedsMultiFieldValueClassFlattening", "needsMultiFieldValueClassFlattening", "Lr93/q0;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class UtilKt {
    private static final C35847e JVM_STATIC = new C35847e("kotlin.jvm.JvmStatic");
    private static final String SUSPEND_FUNCTION_PREFIX;

    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC27738j.values().length];
            try {
                iArr[EnumC27738j.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27738j.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27738j.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC27738j.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC27738j.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC27738j.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC27738j.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC27738j.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        StringBuilder sb4 = new StringBuilder();
        C29031j c29031j = C29031j.f117501c;
        sb4.append(c29031j.f117502a.f152613a.f152616a);
        sb4.append('.');
        sb4.append(c29031j.f117503b);
        SUSPEND_FUNCTION_PREFIX = sb4.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Object arrayToRuntimeValue(C0710b c0710b, ClassLoader classLoader) {
        AbstractC23811y abstractC23811y;
        Class clsLoadClass$default;
        C0733y c0733y = c0710b instanceof C0733y ? (C0733y) c0710b : null;
        if (c0733y != null && (abstractC23811y = c0733y.f2706c) != null) {
            Object obj = c0710b.f2696a;
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(toRuntimeValue((AbstractC0715g) it.next(), classLoader));
            }
            C35850h c35850h = AbstractC27736h.f111789e;
            InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
            EnumC27738j enumC27738jM83811s = interfaceC31126hMo1784d == null ? null : AbstractC27736h.m83811s(interfaceC31126hMo1784d);
            int i13 = 0;
            switch (enumC27738jM83811s == null ? -1 : WhenMappings.$EnumSwitchMapping$0[enumC27738jM83811s.ordinal()]) {
                case -1:
                    if (!AbstractC27736h.m83814z(abstractC23811y)) {
                        throw new IllegalStateException(("Not an array type: " + abstractC23811y).toString());
                    }
                    AbstractC23811y abstractC23811yMo69868b = ((AbstractC23804u0) AbstractC25265s.m74142p1(abstractC23811y.mo69842X())).mo69868b();
                    AbstractC22676k.m65749i(abstractC23811yMo69868b, "getType(...)");
                    InterfaceC31126h interfaceC31126hMo1784d2 = abstractC23811yMo69868b.mo69844i0().mo1784d();
                    InterfaceC31117e interfaceC31117e = interfaceC31126hMo1784d2 instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31126hMo1784d2 : null;
                    if (interfaceC31117e == null) {
                        throw new IllegalStateException(("Not a class type: " + abstractC23811yMo69868b).toString());
                    }
                    if (AbstractC27736h.m83806H(abstractC23811yMo69868b)) {
                        int size = ((List) obj).size();
                        String[] strArr = new String[size];
                        while (i13 < size) {
                            Object obj2 = arrayList.get(i13);
                            AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.String");
                            strArr[i13] = obj2;
                            i13++;
                        }
                        return strArr;
                    }
                    if (AbstractC27736h.m83810b(interfaceC31117e, AbstractC27741m.f111833Q)) {
                        int size2 = ((List) obj).size();
                        Class[] clsArr = new Class[size2];
                        while (i13 < size2) {
                            Object obj3 = arrayList.get(i13);
                            AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                            clsArr[i13] = obj3;
                            i13++;
                        }
                        return clsArr;
                    }
                    C35845c c35845cM13808f = AbstractC4393e.m13808f(interfaceC31117e);
                    if (c35845cM13808f != null && (clsLoadClass$default = loadClass$default(classLoader, c35845cM13808f, 0, 2, null)) != null) {
                        Object objNewInstance = Array.newInstance((Class<?>) clsLoadClass$default, ((List) obj).size());
                        AbstractC22676k.m65748h(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                        Object[] objArr = (Object[]) objNewInstance;
                        int size3 = arrayList.size();
                        while (i13 < size3) {
                            objArr[i13] = arrayList.get(i13);
                            i13++;
                        }
                        return objArr;
                    }
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    int size4 = ((List) obj).size();
                    boolean[] zArr = new boolean[size4];
                    while (i13 < size4) {
                        Object obj4 = arrayList.get(i13);
                        AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                        zArr[i13] = ((Boolean) obj4).booleanValue();
                        i13++;
                    }
                    return zArr;
                case 2:
                    int size5 = ((List) obj).size();
                    char[] cArr = new char[size5];
                    while (i13 < size5) {
                        Object obj5 = arrayList.get(i13);
                        AbstractC22676k.m65748h(obj5, "null cannot be cast to non-null type kotlin.Char");
                        cArr[i13] = ((Character) obj5).charValue();
                        i13++;
                    }
                    return cArr;
                case 3:
                    int size6 = ((List) obj).size();
                    byte[] bArr = new byte[size6];
                    while (i13 < size6) {
                        Object obj6 = arrayList.get(i13);
                        AbstractC22676k.m65748h(obj6, "null cannot be cast to non-null type kotlin.Byte");
                        bArr[i13] = ((Byte) obj6).byteValue();
                        i13++;
                    }
                    return bArr;
                case 4:
                    int size7 = ((List) obj).size();
                    short[] sArr = new short[size7];
                    while (i13 < size7) {
                        Object obj7 = arrayList.get(i13);
                        AbstractC22676k.m65748h(obj7, "null cannot be cast to non-null type kotlin.Short");
                        sArr[i13] = ((Short) obj7).shortValue();
                        i13++;
                    }
                    return sArr;
                case 5:
                    int size8 = ((List) obj).size();
                    int[] iArr = new int[size8];
                    while (i13 < size8) {
                        Object obj8 = arrayList.get(i13);
                        AbstractC22676k.m65748h(obj8, "null cannot be cast to non-null type kotlin.Int");
                        iArr[i13] = ((Integer) obj8).intValue();
                        i13++;
                    }
                    return iArr;
                case 6:
                    int size9 = ((List) obj).size();
                    float[] fArr = new float[size9];
                    while (i13 < size9) {
                        Object obj9 = arrayList.get(i13);
                        AbstractC22676k.m65748h(obj9, "null cannot be cast to non-null type kotlin.Float");
                        fArr[i13] = ((Float) obj9).floatValue();
                        i13++;
                    }
                    return fArr;
                case 7:
                    int size10 = ((List) obj).size();
                    long[] jArr = new long[size10];
                    while (i13 < size10) {
                        Object obj10 = arrayList.get(i13);
                        AbstractC22676k.m65748h(obj10, "null cannot be cast to non-null type kotlin.Long");
                        jArr[i13] = ((Long) obj10).longValue();
                        i13++;
                    }
                    return jArr;
                case 8:
                    int size11 = ((List) obj).size();
                    double[] dArr = new double[size11];
                    while (i13 < size11) {
                        Object obj11 = arrayList.get(i13);
                        AbstractC22676k.m65748h(obj11, "null cannot be cast to non-null type kotlin.Double");
                        dArr[i13] = ((Double) obj11).doubleValue();
                        i13++;
                    }
                    return dArr;
            }
        }
        return null;
    }

    public static final ReflectKCallable<?> asReflectCallable(Object obj) {
        if (obj instanceof ReflectKCallable) {
            return (ReflectKCallable) obj;
        }
        if (obj instanceof AbstractC22660c) {
            InterfaceC21459c interfaceC21459cCompute = ((AbstractC22660c) obj).compute();
            if (interfaceC21459cCompute instanceof ReflectKCallable) {
                return (ReflectKCallable) interfaceC21459cCompute;
            }
        }
        return null;
    }

    public static final ReflectKFunction asReflectFunction(Object obj) {
        if (obj instanceof ReflectKFunction) {
            return (ReflectKFunction) obj;
        }
        if (obj instanceof AbstractC22670h) {
            InterfaceC21459c interfaceC21459cCompute = ((AbstractC22670h) obj).compute();
            if (interfaceC21459cCompute instanceof ReflectKFunction) {
                return (ReflectKFunction) interfaceC21459cCompute;
            }
        }
        return null;
    }

    public static final ReflectKProperty<?> asReflectProperty(Object obj) {
        if (obj instanceof ReflectKProperty) {
            return (ReflectKProperty) obj;
        }
        if (obj instanceof AbstractC22657a0) {
            InterfaceC21459c interfaceC21459cCompute = ((AbstractC22657a0) obj).compute();
            if (interfaceC21459cCompute instanceof ReflectKProperty) {
                return (ReflectKProperty) interfaceC21459cCompute;
            }
        }
        return null;
    }

    public static final List<Annotation> computeAnnotations(InterfaceC32299a interfaceC32299a) {
        Annotation annotationInstance;
        AbstractC22676k.m65750j(interfaceC32299a, "<this>");
        InterfaceC32307i<InterfaceC32300b> annotations = interfaceC32299a.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC32300b interfaceC32300b : annotations) {
            InterfaceC31155s0 source = interfaceC32300b.getSource();
            if (source instanceof C36968a) {
                annotationInstance = ((C36968a) source).f158226w;
            } else if (source instanceof C36973f) {
                AbstractC38126r abstractC38126r = ((C36973f) source).f158234w;
                C38111d c38111d = abstractC38126r instanceof C38111d ? (C38111d) abstractC38126r : null;
                annotationInstance = c38111d != null ? c38111d.f163219a : null;
            } else {
                annotationInstance = toAnnotationInstance(interfaceC32300b);
            }
            if (annotationInstance != null) {
                arrayList.add(annotationInstance);
            }
        }
        return unwrapRepeatableAnnotations(arrayList);
    }

    public static final Class<?> createArrayType(Class<?> cls) {
        AbstractC22676k.m65750j(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final Object defaultPrimitiveValue(Type type) {
        AbstractC22676k.m65750j(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (cls.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (cls.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (cls.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (cls.equals(Integer.TYPE)) {
            return 0;
        }
        if (cls.equals(Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (cls.equals(Long.TYPE)) {
            return 0L;
        }
        if (cls.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (cls.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final <M extends InterfaceC37019v, D extends InterfaceC31108b> D deserializeToDescriptor(Class<?> moduleAnchor, M proto, InterfaceC32332f nameResolver, C32334h typeTable, AbstractC32327a metadataVersion, InterfaceC4351m createDescriptor) {
        List list;
        AbstractC22676k.m65750j(moduleAnchor, "moduleAnchor");
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        AbstractC22676k.m65750j(typeTable, "typeTable");
        AbstractC22676k.m65750j(metadataVersion, "metadataVersion");
        AbstractC22676k.m65750j(createDescriptor, "createDescriptor");
        C36972e orCreateModule = ModuleByClassLoaderKt.getOrCreateModule(moduleAnchor);
        if (proto instanceof C30122c0) {
            list = ((C30122c0) proto).f123040I;
        } else {
            if (!(proto instanceof C30146k0)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            list = ((C30146k0) proto).f123308I;
        }
        List list2 = list;
        C17119i c17119i = orCreateModule.f158232a;
        InterfaceC31109b0 interfaceC31109b0 = c17119i.f65736b;
        C32336j c32336j = C32336j.f133837b;
        C32336j c32336j2 = C32336j.f133837b;
        AbstractC22676k.m65747g(list2);
        return (D) createDescriptor.invoke(new C17135x(new C17122k(c17119i, nameResolver, interfaceC31109b0, typeTable, c32336j2, metadataVersion, null, null, list2)), proto);
    }

    public static final Field getDeclaredFieldOrNull(Class<?> cls, String name) {
        AbstractC22676k.m65750j(cls, "<this>");
        AbstractC22676k.m65750j(name, "name");
        try {
            return cls.getDeclaredField(name);
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static final Method getDeclaredMethodOrNull(Class<?> cls, String name, Class<?>... parameterTypes) {
        AbstractC22676k.m65750j(cls, "<this>");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(parameterTypes, "parameterTypes");
        try {
            return cls.getDeclaredMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final InterfaceC31151q0 getInstanceReceiverParameter(InterfaceC31108b interfaceC31108b) {
        AbstractC22676k.m65750j(interfaceC31108b, "<this>");
        if (interfaceC31108b.mo78677y() == null) {
            return null;
        }
        InterfaceC31135k interfaceC31135kMo60581g = interfaceC31108b.mo60581g();
        AbstractC22676k.m65748h(interfaceC31135kMo60581g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((InterfaceC31117e) interfaceC31135kMo60581g).mo95864q0();
    }

    public static final C35847e getJVM_STATIC() {
        return JVM_STATIC;
    }

    public static final boolean getNeedsMultiFieldValueClassFlattening(InterfaceC21456a0 interfaceC21456a0) {
        AbstractC22676k.m65750j(interfaceC21456a0, "<this>");
        InterfaceC21463e classifier = interfaceC21456a0.getClassifier();
        KClassImpl kClassImpl = classifier instanceof KClassImpl ? (KClassImpl) classifier : null;
        return (kClassImpl == null || !kClassImpl.isValue() || kClassImpl.isInline$kotlin_reflection()) ? false : true;
    }

    public static final boolean isInlineClassType(InterfaceC21456a0 interfaceC21456a0) {
        AbstractC22676k.m65750j(interfaceC21456a0, "<this>");
        InterfaceC21463e classifier = interfaceC21456a0.getClassifier();
        KClassImpl kClassImpl = classifier instanceof KClassImpl ? (KClassImpl) classifier : null;
        return kClassImpl != null && kClassImpl.isInline$kotlin_reflection();
    }

    public static final Class<?> loadClass(ClassLoader classLoader, C35845c kotlinClassId, int i13) {
        AbstractC22676k.m65750j(classLoader, "<this>");
        AbstractC22676k.m65750j(kotlinClassId, "kotlinClassId");
        C35848f c35848f = kotlinClassId.m113773a().f152613a;
        String str = c35848f.f152616a;
        Integer numM125932Q = AbstractC39421y.m125932Q(AbstractC39414r.m125859E0(str, SUSPEND_FUNCTION_PREFIX, str));
        if (numM125932Q != null) {
            int iIntValue = numM125932Q.intValue();
            C29028g c29028g = C29028g.f117498c;
            return loadClass(classLoader, new C35845c(c29028g.f117502a, c29028g.m88263a(iIntValue + 1)), i13);
        }
        String str2 = C30080d.f122759a;
        C35845c c35845cM92211g = C30080d.m92211g(c35848f);
        if (c35845cM92211g == null) {
            c35845cM92211g = kotlinClassId;
        }
        if (!c35845cM92211g.equals(kotlinClassId)) {
            classLoader = AbstractC38109c.m122092d(C23454a0.class);
        }
        return loadClass(classLoader, c35845cM92211g.f152609a.f152613a.f152616a, c35845cM92211g.f152610b.f152613a.f152616a, i13);
    }

    public static /* synthetic */ Class loadClass$default(ClassLoader classLoader, C35845c c35845c, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        return loadClass(classLoader, c35845c, i13);
    }

    private static final Annotation toAnnotationInstance(InterfaceC32300b interfaceC32300b) {
        InterfaceC31117e interfaceC31117eM13806d = AbstractC4393e.m13806d(interfaceC32300b);
        Class<?> javaClass = interfaceC31117eM13806d != null ? toJavaClass(interfaceC31117eM13806d) : null;
        if (javaClass == null) {
            javaClass = null;
        }
        if (javaClass == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = interfaceC32300b.mo43952a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            C35850h c35850h = (C35850h) entry.getKey();
            AbstractC0715g abstractC0715g = (AbstractC0715g) entry.getValue();
            ClassLoader classLoader = javaClass.getClassLoader();
            AbstractC22676k.m65749i(classLoader, "getClassLoader(...)");
            Object runtimeValue = toRuntimeValue(abstractC0715g, classLoader);
            C23465k c23465k = runtimeValue != null ? new C23465k(c35850h.m113817b(), runtimeValue) : null;
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
        }
        return (Annotation) AbstractC32411b.m101113y(javaClass, AbstractC25247g0.m74000i0(arrayList));
    }

    public static final Class<?> toJavaClass(InterfaceC31117e interfaceC31117e) {
        AbstractC22676k.m65750j(interfaceC31117e, "<this>");
        InterfaceC31155s0 source = interfaceC31117e.getSource();
        AbstractC22676k.m65749i(source, "getSource(...)");
        if (source instanceof C27774q) {
            return ((C27774q) source).f111971w.f158227a;
        }
        if (source instanceof C36973f) {
            AbstractC38126r abstractC38126r = ((C36973f) source).f158234w;
            AbstractC22676k.m65748h(abstractC38126r, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((C38122n) abstractC38126r).f163232a;
        }
        C35845c c35845cM13808f = AbstractC4393e.m13808f(interfaceC31117e);
        if (c35845cM13808f == null) {
            return null;
        }
        return loadClass$default(AbstractC38109c.m122092d(interfaceC31117e.getClass()), c35845cM13808f, 0, 2, null);
    }

    public static final EnumC21466f0 toKVisibility(AbstractC31152r abstractC31152r) {
        AbstractC22676k.m65750j(abstractC31152r, "<this>");
        if (abstractC31152r.equals(AbstractC31150q.f128353e)) {
            return EnumC21466f0.f82431w;
        }
        if (abstractC31152r.equals(AbstractC31150q.f128351c)) {
            return EnumC21466f0.f82432x;
        }
        if (abstractC31152r.equals(AbstractC31150q.f128352d)) {
            return EnumC21466f0.f82433y;
        }
        if (abstractC31152r.equals(AbstractC31150q.f128349a) || abstractC31152r.equals(AbstractC31150q.f128350b)) {
            return EnumC21466f0.f82434z;
        }
        return null;
    }

    private static final Object toRuntimeValue(AbstractC0715g abstractC0715g, ClassLoader classLoader) {
        if (abstractC0715g instanceof C0709a) {
            return toAnnotationInstance((InterfaceC32300b) ((C0709a) abstractC0715g).f2696a);
        }
        if (abstractC0715g instanceof C0710b) {
            return arrayToRuntimeValue((C0710b) abstractC0715g, classLoader);
        }
        if (abstractC0715g instanceof C0717i) {
            C23465k c23465k = (C23465k) ((C0717i) abstractC0715g).f2696a;
            C35845c c35845c = (C35845c) c23465k.f92937w;
            C35850h c35850h = (C35850h) c23465k.f92938x;
            Class clsLoadClass$default = loadClass$default(classLoader, c35845c, 0, 2, null);
            if (clsLoadClass$default != null) {
                return Util.getEnumConstantByName(clsLoadClass$default, c35850h.m113817b());
            }
        } else {
            if (!(abstractC0715g instanceof C0728t)) {
                if ((abstractC0715g instanceof C0718j) || (abstractC0715g instanceof C0730v)) {
                    return null;
                }
                return abstractC0715g.mo1777b();
            }
            AbstractC0727s abstractC0727s = (AbstractC0727s) ((C0728t) abstractC0715g).f2696a;
            if (abstractC0727s instanceof C0726r) {
                C0714f c0714f = ((C0726r) abstractC0727s).f2705a;
                return loadClass(classLoader, c0714f.f2694a, c0714f.f2695b);
            }
            if (!(abstractC0727s instanceof C0725q)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC31126h interfaceC31126hMo1784d = ((C0725q) abstractC0727s).f2704a.mo69844i0().mo1784d();
            InterfaceC31117e interfaceC31117e = interfaceC31126hMo1784d instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31126hMo1784d : null;
            if (interfaceC31117e != null) {
                return toJavaClass(interfaceC31117e);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List<? extends java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List<java.lang.annotation.Annotation>] */
    public static final List<Annotation> unwrapRepeatableAnnotations(List<? extends Annotation> list) throws IllegalAccessException, InvocationTargetException {
        List listM118958J;
        AbstractC22676k.m65750j(list, "<this>");
        Iterable<Annotation> iterable = (Iterable) list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (AbstractC21598x.m60663S(AbstractC21598x.m60655K((Annotation) it.next())).getSimpleName().equals("Container")) {
                    list = new ArrayList<>();
                    for (Annotation annotation : iterable) {
                        Class clsM60663S = AbstractC21598x.m60663S(AbstractC21598x.m60655K(annotation));
                        if (!clsM60663S.getSimpleName().equals("Container") || clsM60663S.getAnnotation(InterfaceC22675j0.class) == null) {
                            listM118958J = AbstractC37056f.m118958J(annotation);
                        } else {
                            Object objInvoke = clsM60663S.getDeclaredMethod("value", null).invoke(annotation, null);
                            AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listM118958J = AbstractC25260n.m74048W((Annotation[]) objInvoke);
                        }
                        AbstractC25265s.m74141p0(list, listM118958J);
                    }
                    break;
                }
            }
        }
        return list;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final Class<?> loadClass(ClassLoader classLoader, String str, String str2, int i13) {
        if (AbstractC22676k.m65745e(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb4 = new StringBuilder();
        if (i13 > 0) {
            for (int i14 = 0; i14 < i13; i14++) {
                sb4.append("[");
            }
            sb4.append("L");
        }
        if (str.length() > 0) {
            sb4.append(str.concat("."));
        }
        sb4.append(AbstractC39421y.m125927L(str2, '.', '$'));
        if (i13 > 0) {
            sb4.append(";");
        }
        return AbstractC35846d.m113786k(classLoader, sb4.toString());
    }
}
