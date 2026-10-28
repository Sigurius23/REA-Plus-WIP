package x93;

import c93.InterfaceC4339a;
import c93.InterfaceC4340b;
import c93.InterfaceC4341c;
import c93.InterfaceC4342d;
import c93.InterfaceC4343e;
import c93.InterfaceC4344f;
import c93.InterfaceC4345g;
import c93.InterfaceC4346h;
import c93.InterfaceC4347i;
import c93.InterfaceC4348j;
import c93.InterfaceC4349k;
import c93.InterfaceC4350l;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import c93.InterfaceC4353o;
import c93.InterfaceC4354p;
import c93.InterfaceC4355q;
import c93.InterfaceC4356r;
import c93.InterfaceC4357s;
import j93.InterfaceC21461d;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import m83.C25271y;
import p000.AbstractC11266d;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes;
import va3.AbstractC35846d;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import wb3.AbstractC37056f;
import xb3.AbstractC38176k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: x93.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC38109c {

    /* JADX INFO: renamed from: a */
    public static final List f163211a;

    /* JADX INFO: renamed from: b */
    public static final Map f163212b;

    /* JADX INFO: renamed from: c */
    public static final Map f163213c;

    /* JADX INFO: renamed from: d */
    public static final Map f163214d;

    static {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        int i13 = 0;
        List listM118959K = AbstractC37056f.m118959K(c22673i0.getOrCreateKotlinClass(Boolean.TYPE), c22673i0.getOrCreateKotlinClass(Byte.TYPE), c22673i0.getOrCreateKotlinClass(Character.TYPE), c22673i0.getOrCreateKotlinClass(Double.TYPE), c22673i0.getOrCreateKotlinClass(Float.TYPE), c22673i0.getOrCreateKotlinClass(Integer.TYPE), c22673i0.getOrCreateKotlinClass(Long.TYPE), c22673i0.getOrCreateKotlinClass(Short.TYPE));
        f163211a = listM118959K;
        List<InterfaceC21461d> list = listM118959K;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (InterfaceC21461d interfaceC21461d : list) {
            arrayList.add(new C23465k(AbstractC21598x.m60664T(interfaceC21461d), AbstractC21598x.m60665U(interfaceC21461d)));
        }
        f163212b = AbstractC25247g0.m74000i0(arrayList);
        List<InterfaceC21461d> list2 = f163211a;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (InterfaceC21461d interfaceC21461d2 : list2) {
            arrayList2.add(new C23465k(AbstractC21598x.m60665U(interfaceC21461d2), AbstractC21598x.m60664T(interfaceC21461d2)));
        }
        f163213c = AbstractC25247g0.m74000i0(arrayList2);
        List listM118959K2 = AbstractC37056f.m118959K(InterfaceC4339a.class, Function1.class, InterfaceC4351m.class, Function3.class, InterfaceC4352n.class, InterfaceC4353o.class, InterfaceC4354p.class, InterfaceC4355q.class, InterfaceC4356r.class, InterfaceC4357s.class, InterfaceC4340b.class, InterfaceC4341c.class, FunctionWithAllInvokes.class, InterfaceC4342d.class, InterfaceC4343e.class, InterfaceC4344f.class, InterfaceC4345g.class, InterfaceC4346h.class, InterfaceC4347i.class, InterfaceC4348j.class, InterfaceC4349k.class, InterfaceC4350l.class, FunctionWithAllInvokes.class);
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(listM118959K2, 10));
        for (Object obj : listM118959K2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList3.add(new C23465k((Class) obj, Integer.valueOf(i13)));
            i13 = i14;
        }
        f163214d = AbstractC25247g0.m74000i0(arrayList3);
    }

    /* JADX INFO: renamed from: a */
    public static final C35845c m122089a(Class cls) {
        AbstractC22676k.m65750j(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(AbstractC11266d.m30459m(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(AbstractC11266d.m30459m(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            C35847e c35847e = new C35847e(cls.getName());
            return new C35845c(c35847e.m113789b(), AbstractC35846d.m113785j(c35847e.f152613a.m113796g()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return m122089a(declaringClass).m113775d(C35850h.m113814e(cls.getSimpleName()));
        }
        C35847e c35847e2 = new C35847e(cls.getName());
        return new C35845c(c35847e2.m113789b(), c35847e2.f152613a.m113796g());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public static final String m122090b(Class cls) {
        AbstractC22676k.m65750j(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return AbstractC39421y.m125927L(cls.getName(), '.', '/');
            }
            return "L" + AbstractC39421y.m125927L(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException(AbstractC11266d.m30459m(cls, "Unsupported primitive type: "));
    }

    /* JADX INFO: renamed from: c */
    public static final List m122091c(Type type) {
        AbstractC22676k.m65750j(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return C25271y.f99162w;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return AbstractC38176k.m122276E(AbstractC38176k.m122284t(AbstractC38176k.m122288x(type, C38107b.f163206x), C38107b.f163207y));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        AbstractC22676k.m65749i(actualTypeArguments, "getActualTypeArguments(...)");
        return AbstractC25260n.m74049W0(actualTypeArguments);
    }

    /* JADX INFO: renamed from: d */
    public static final ClassLoader m122092d(Class cls) {
        AbstractC22676k.m65750j(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        AbstractC22676k.m65749i(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }
}
