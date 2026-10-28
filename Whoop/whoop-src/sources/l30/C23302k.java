package l30;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p30.C28789a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l30.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C23302k extends AbstractC23304m {

    /* JADX INFO: renamed from: b */
    public static final C23306o f92346b = new C23306o("SW02", "The integrity of the SDK has been tampered.", EnumC23305n.f92350x);

    @Override // l30.AbstractC23304m
    /* JADX INFO: renamed from: a */
    public final boolean mo67390a() {
        Field[] declaredFields = C28789a.class.getDeclaredFields();
        AbstractC22676k.m65749i(declaredFields, "getDeclaredFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (!field.isSynthetic()) {
                arrayList.add(field);
            }
        }
        if (arrayList.size() != 8) {
            return true;
        }
        Method[] declaredMethods = C28789a.class.getDeclaredMethods();
        AbstractC22676k.m65749i(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Method method : declaredMethods) {
            if (!method.isSynthetic()) {
                arrayList2.add(method);
            }
        }
        return arrayList2.size() != 5;
    }
}
