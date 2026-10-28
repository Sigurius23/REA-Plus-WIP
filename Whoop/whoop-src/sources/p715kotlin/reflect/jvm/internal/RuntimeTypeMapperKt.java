package p715kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import m83.AbstractC25260n;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x93.AbstractC38109c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"signature", "", "Ljava/lang/reflect/Method;", "getSignature", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "kotlin-reflection"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class RuntimeTypeMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_signature_$lambda$0(Class cls) {
        AbstractC22676k.m65747g(cls);
        return AbstractC38109c.m122090b(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSignature(Method method) {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC22676k.m65749i(parameterTypes, "getParameterTypes(...)");
        sb4.append(AbstractC25260n.m74028D0(parameterTypes, "", "(", ")", new Function1() { // from class: kotlin.reflect.jvm.internal.RuntimeTypeMapperKt$$Lambda$0
            @Override // p715kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return RuntimeTypeMapperKt._get_signature_$lambda$0((Class) obj);
            }
        }, 24));
        Class<?> returnType = method.getReturnType();
        AbstractC22676k.m65749i(returnType, "getReturnType(...)");
        sb4.append(AbstractC38109c.m122090b(returnType));
        return sb4.toString();
    }
}
