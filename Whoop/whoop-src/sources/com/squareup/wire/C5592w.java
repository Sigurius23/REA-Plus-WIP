package com.squareup.wire;

import j93.InterfaceC21461d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.squareup.wire.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C5592w extends AbstractC5572c {

    /* JADX INFO: renamed from: a */
    public final Class f22125a;

    /* JADX INFO: renamed from: b */
    public Method f22126b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5592w(Class cls) {
        InterfaceC21461d interfaceC21461dM60666V = AbstractC21598x.m60666V(cls);
        Object[] enumConstants = cls.getEnumConstants();
        AbstractC22676k.m65749i(enumConstants, "enumConstants");
        for (Object obj : enumConstants) {
            InterfaceC5594y interfaceC5594y = (InterfaceC5594y) obj;
            AbstractC22676k.m65748h(interfaceC5594y, "null cannot be cast to non-null type com.squareup.wire.WireEnum");
            if (interfaceC5594y.getValue() == 0) {
                super(interfaceC21461dM60666V, EnumC5593x.PROTO_2, (InterfaceC5594y) obj);
                this.f22125a = cls;
            }
        }
        obj = null;
        super(interfaceC21461dM60666V, EnumC5593x.PROTO_2, (InterfaceC5594y) obj);
        this.f22125a = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C5592w) && AbstractC22676k.m65745e(((C5592w) obj).getType(), getType());
    }

    @Override // com.squareup.wire.AbstractC5572c
    public final InterfaceC5594y fromValue(int i13) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Method method = this.f22126b;
        if (method == null) {
            method = this.f22125a.getMethod("fromValue", Integer.TYPE);
            this.f22126b = method;
            AbstractC22676k.m65749i(method, "javaType.getMethod(\"from…romValueMethod = it\n    }");
        }
        Object objInvoke = method.invoke(null, Integer.valueOf(i13));
        AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type E of com.squareup.wire.RuntimeEnumAdapter");
        return (InterfaceC5594y) objInvoke;
    }

    public final int hashCode() {
        InterfaceC21461d type = getType();
        if (type != null) {
            return type.hashCode();
        }
        return 0;
    }
}
