package com.squareup.wire;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.C25258m;
import m83.C25271y;
import m83.C25272z;
import ne3.C26616h;
import ne3.C26624l;
import p026b2.C2298d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.squareup.wire.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C5576g extends AbstractC5579j {

    /* JADX INFO: renamed from: d */
    public final Class f22093d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f22094e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f22095f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f22096g;

    public C5576g(Class cls) {
        this.f22100a = C26624l.f105881E;
        this.f22093d = cls;
        int length = cls.getDeclaredFields().length;
        this.f22094e = new LinkedHashMap(length);
        this.f22095f = new LinkedHashMap(length);
        this.f22096g = new LinkedHashMap(length);
    }

    @Override // com.squareup.wire.AbstractC5579j
    /* JADX INFO: renamed from: a */
    public final AbstractC5581l mo16740a() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objM16741b;
        Class cls = this.f22093d;
        Field[] declaredFields = cls.getDeclaredFields();
        AbstractC22676k.m65749i(declaredFields, "declaredFields");
        ArrayList arrayList = new ArrayList();
        int length = declaredFields.length;
        int i13 = 0;
        while (true) {
            C5575f c5575f = null;
            if (i13 >= length) {
                break;
            }
            Field field = declaredFields[i13];
            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
            AbstractC22676k.m65749i(declaredAnnotations, "field.declaredAnnotations");
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation : declaredAnnotations) {
                if (InterfaceC5570a0.class.isInstance(annotation)) {
                    arrayList2.add(annotation);
                }
            }
            if (((InterfaceC5570a0) AbstractC25265s.m74100H0(arrayList2)) != null) {
                AbstractC22676k.m65749i(field.getType(), "field.type");
                c5575f = new C5575f();
            }
            if (c5575f != null) {
                arrayList.add(c5575f);
            }
            i13++;
        }
        List listM74152u1 = AbstractC25265s.m74152u1(arrayList, new C2298d(1));
        C25258m c25258m = new C25258m();
        C25258m c25258m2 = new C25258m();
        Iterator it = listM74152u1.iterator();
        if (it.hasNext()) {
            ((C5575f) it.next()).getClass();
            throw null;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC22676k.m65749i(constructors, "messageType.constructors");
        for (Constructor<?> constructor : constructors) {
            if (constructor.getParameterCount() == listM74152u1.size() + 1) {
                Parameter[] parameters = constructor.getParameters();
                AbstractC22676k.m65749i(parameters, "constructor.parameters");
                ArrayList arrayList3 = new ArrayList(parameters.length);
                int length2 = parameters.length;
                int i14 = 0;
                int i15 = 0;
                while (i14 < length2) {
                    Parameter parameter = parameters[i14];
                    int i16 = i15 + 1;
                    if (AbstractC22676k.m65745e(parameter.getType(), List.class) || AbstractC22676k.m65745e(parameter.getType(), Map.class)) {
                        ((C5575f) c25258m.removeFirst()).getClass();
                        objM16741b = m16741b(null);
                    } else if (i15 == listM74152u1.size()) {
                        C26616h c26616h = this.f22101b;
                        if (c26616h != null) {
                            this.f22100a = c26616h.mo79218m0(c26616h.f105866x);
                            this.f22101b = null;
                            this.f22102c = null;
                        }
                        objM16741b = this.f22100a;
                    } else {
                        ((C5575f) c25258m2.removeFirst()).getClass();
                        objM16741b = m16741b(null);
                    }
                    arrayList3.add(objM16741b);
                    i14++;
                    i15 = i16;
                }
                Object[] array = arrayList3.toArray(new Object[0]);
                Object objNewInstance = constructor.newInstance(Arrays.copyOf(array, array.length));
                AbstractC22676k.m65748h(objNewInstance, "null cannot be cast to non-null type M of com.squareup.wire.KotlinConstructorBuilder");
                return (AbstractC5581l) objNewInstance;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: b */
    public final Object m16741b(InterfaceC5570a0 interfaceC5570a0) {
        List list;
        Map map;
        if (interfaceC5570a0.keyAdapter().length() > 0) {
            C23465k c23465k = (C23465k) this.f22096g.get(Integer.valueOf(interfaceC5570a0.tag()));
            return (c23465k == null || (map = (Map) c23465k.f92938x) == null) ? C25272z.f99163w : map;
        }
        if (interfaceC5570a0.label().m16831a()) {
            C23465k c23465k2 = (C23465k) this.f22095f.get(Integer.valueOf(interfaceC5570a0.tag()));
            return (c23465k2 == null || (list = (List) c23465k2.f92938x) == null) ? C25271y.f99162w : list;
        }
        C23465k c23465k3 = (C23465k) this.f22094e.get(Integer.valueOf(interfaceC5570a0.tag()));
        Object obj = c23465k3 != null ? c23465k3.f92938x : null;
        if (obj != null || interfaceC5570a0.label() != EnumC5595z.f22132F) {
            return obj;
        }
        C5585p c5585p = AbstractC5586q.Companion;
        String adapterString = interfaceC5570a0.adapter();
        c5585p.getClass();
        AbstractC22676k.m65750j(adapterString, "adapterString");
        return C5585p.m16803b(adapterString, AbstractC5586q.class.getClassLoader()).getIdentity();
    }
}
