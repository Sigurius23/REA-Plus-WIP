package p024b0;

import j93.InterfaceC21461d;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import p218ic.AbstractC18360h;
import p218ic.C18358g;
import p298l8.C23421d;
import p298l8.C23423f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: b0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2178b {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f8660a;

    public C2178b(int i13) {
        switch (i13) {
            case 1:
                this.f8660a = new LinkedHashMap();
                break;
            case 2:
                this.f8660a = new LinkedHashMap();
                break;
            default:
                this.f8660a = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m6855a(InterfaceC21461d clazz, Function1 function1) {
        AbstractC22676k.m65750j(clazz, "clazz");
        LinkedHashMap linkedHashMap = this.f8660a;
        if (!linkedHashMap.containsKey(clazz)) {
            linkedHashMap.put(clazz, new C23423f(clazz, function1));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + clazz.getQualifiedName() + '.').toString());
    }

    /* JADX INFO: renamed from: b */
    public C18358g m6856b() {
        C18358g c18358g = new C18358g(this.f8660a);
        AbstractC29125c.m88515X(c18358g);
        return c18358g;
    }

    /* JADX INFO: renamed from: c */
    public C23421d m6857c() {
        Collection initializers = this.f8660a.values();
        AbstractC22676k.m65750j(initializers, "initializers");
        C23423f[] c23423fArr = (C23423f[]) initializers.toArray(new C23423f[0]);
        return new C23421d((C23423f[]) Arrays.copyOf(c23423fArr, c23423fArr.length));
    }

    /* JADX INFO: renamed from: d */
    public void m6858d(Object obj, String key) {
        AbstractC22676k.m65750j(key, "key");
        if (obj == null) {
            obj = null;
        } else {
            Class<?> cls = obj.getClass();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(cls);
            if (!AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte.TYPE)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean[].class)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte[].class)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer[].class)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long[].class)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float[].class)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double[].class)) && !AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String[].class))) {
                if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(boolean[].class))) {
                    obj = AbstractC18360h.m52862a((boolean[]) obj);
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(byte[].class))) {
                    obj = AbstractC18360h.m52863b((byte[]) obj);
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(int[].class))) {
                    obj = AbstractC18360h.m52866e((int[]) obj);
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(long[].class))) {
                    obj = AbstractC18360h.m52867f((long[]) obj);
                } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(float[].class))) {
                    obj = AbstractC18360h.m52865d((float[]) obj);
                } else {
                    if (!AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(double[].class))) {
                        throw new IllegalArgumentException("Key " + key + " has invalid type " + orCreateKotlinClass);
                    }
                    obj = AbstractC18360h.m52864c((double[]) obj);
                }
            }
        }
        this.f8660a.put(key, obj);
    }

    /* JADX INFO: renamed from: e */
    public void m6859e(Map values) {
        AbstractC22676k.m65750j(values, "values");
        for (Map.Entry entry : values.entrySet()) {
            m6858d(entry.getValue(), (String) entry.getKey());
        }
    }
}
