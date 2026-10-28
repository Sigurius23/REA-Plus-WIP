package m93;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m93.x */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC25356x extends AbstractC25357y {

    /* JADX INFO: renamed from: e */
    public final boolean f99381e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AbstractC25356x(Method method, boolean z4, int i13) {
        z4 = (i13 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z4;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC22676k.m65749i(genericParameterTypes, "getGenericParameterTypes(...)");
        this(method, z4, genericParameterTypes);
    }

    /* JADX INFO: renamed from: e */
    public final Object m74413e(Object[] args, Object obj) {
        AbstractC22676k.m65750j(args, "args");
        return this.f99381e ? C23454a0.f92919a : ((Method) this.f99382a).invoke(obj, Arrays.copyOf(args, args.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC25356x(Method method, boolean z4, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        AbstractC22676k.m65749i(genericReturnType, "getGenericReturnType(...)");
        super(method, genericReturnType, z4 ? method.getDeclaringClass() : null, typeArr);
        this.f99381e = genericReturnType.equals(Void.TYPE);
    }
}
