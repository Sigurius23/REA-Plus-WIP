package p715kotlin.jvm.internal;

import b93.C2892a;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.CollectionDescriptorsKt;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p097ds.AbstractC12314q;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: kotlin.jvm.internal.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C22664e implements InterfaceC21461d, InterfaceC22662d {

    /* JADX INFO: renamed from: x */
    public static final Map f89332x;

    /* JADX INFO: renamed from: w */
    public final Class f89333w;

    static {
        List listM118959K = AbstractC37056f.m118959K(InterfaceC4339a.class, Function1.class, InterfaceC4351m.class, Function3.class, InterfaceC4352n.class, InterfaceC4353o.class, InterfaceC4354p.class, InterfaceC4355q.class, InterfaceC4356r.class, InterfaceC4357s.class, InterfaceC4340b.class, InterfaceC4341c.class, FunctionWithAllInvokes.class, InterfaceC4342d.class, InterfaceC4343e.class, InterfaceC4344f.class, InterfaceC4345g.class, InterfaceC4346h.class, InterfaceC4347i.class, InterfaceC4348j.class, InterfaceC4349k.class, InterfaceC4350l.class, FunctionWithAllInvokes.class);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM118959K, 10));
        int i13 = 0;
        for (Object obj : listM118959K) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(new C23465k((Class) obj, Integer.valueOf(i13)));
            i13 = i14;
        }
        f89332x = AbstractC25247g0.m74000i0(arrayList);
    }

    public C22664e(Class jClass) {
        AbstractC22676k.m65750j(jClass, "jClass");
        this.f89333w = jClass;
    }

    /* JADX INFO: renamed from: a */
    public static void m65687a() {
        throw new C2892a();
    }

    @Override // j93.InterfaceC21461d
    public final boolean equals(Object obj) {
        return (obj instanceof C22664e) && AbstractC21598x.m60664T(this).equals(AbstractC21598x.m60664T((InterfaceC21461d) obj));
    }

    @Override // j93.InterfaceC21457b
    public final List getAnnotations() {
        m65687a();
        throw null;
    }

    @Override // j93.InterfaceC21461d
    public final Collection getConstructors() {
        m65687a();
        throw null;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22662d
    public final Class getJClass() {
        return this.f89333w;
    }

    @Override // j93.InterfaceC21461d
    public final Collection getMembers() {
        m65687a();
        throw null;
    }

    @Override // j93.InterfaceC21461d
    public final Object getObjectInstance() {
        m65687a();
        throw null;
    }

    @Override // j93.InterfaceC21461d
    public final String getQualifiedName() {
        String strM34336p;
        Class jClass = this.f89333w;
        AbstractC22676k.m65750j(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        if (!jClass.isArray()) {
            String strM34336p2 = AbstractC12314q.m34336p(jClass.getName());
            return strM34336p2 == null ? jClass.getCanonicalName() : strM34336p2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (strM34336p = AbstractC12314q.m34336p(componentType.getName())) != null) {
            strConcat = strM34336p.concat("Array");
        }
        return strConcat == null ? CollectionDescriptorsKt.ARRAY_NAME : strConcat;
    }

    @Override // j93.InterfaceC21461d
    public final String getSimpleName() {
        String strM34314F;
        Class jClass = this.f89333w;
        AbstractC22676k.m65750j(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                String strM34314F2 = AbstractC12314q.m34314F(jClass.getName());
                return strM34314F2 == null ? jClass.getSimpleName() : strM34314F2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (strM34314F = AbstractC12314q.m34314F(componentType.getName())) != null) {
                strConcat = strM34314F.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC39414r.m125859E0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC39414r.m125858D0('$', simpleName, simpleName);
        }
        return AbstractC39414r.m125859E0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // j93.InterfaceC21461d
    public final List getSupertypes() {
        m65687a();
        throw null;
    }

    @Override // j93.InterfaceC21461d
    public final List getTypeParameters() {
        m65687a();
        throw null;
    }

    @Override // j93.InterfaceC21461d
    public final int hashCode() {
        return AbstractC21598x.m60664T(this).hashCode();
    }

    @Override // j93.InterfaceC21461d
    public final boolean isAbstract() {
        m65687a();
        throw null;
    }

    @Override // j93.InterfaceC21461d
    public final boolean isInner() {
        m65687a();
        throw null;
    }

    @Override // j93.InterfaceC21461d
    public final boolean isInstance(Object obj) {
        Class jClass = this.f89333w;
        AbstractC22676k.m65750j(jClass, "jClass");
        Map map = f89332x;
        AbstractC22676k.m65748h(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return AbstractC22681m0.m65775f(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            jClass = AbstractC21598x.m60664T(AbstractC21598x.m60666V(jClass));
        }
        return jClass.isInstance(obj);
    }

    @Override // j93.InterfaceC21461d
    public final boolean isSealed() {
        m65687a();
        throw null;
    }

    @Override // j93.InterfaceC21461d
    public final boolean isValue() {
        m65687a();
        throw null;
    }

    public final String toString() {
        return this.f89333w.toString() + " (Kotlin reflection is not available)";
    }
}
