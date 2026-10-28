package x93;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import m83.AbstractC25260n;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35850h;

/* JADX INFO: renamed from: x93.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C38107b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f163209w;

    /* JADX INFO: renamed from: x */
    public static final C38107b f163206x = new C38107b(0);

    /* JADX INFO: renamed from: y */
    public static final C38107b f163207y = new C38107b(1);

    /* JADX INFO: renamed from: z */
    public static final C38107b f163208z = new C38107b(2);

    /* JADX INFO: renamed from: E */
    public static final C38107b f163205E = new C38107b(3);

    public /* synthetic */ C38107b(int i13) {
        this.f163209w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f163209w) {
            case 0:
                ParameterizedType it = (ParameterizedType) obj;
                List list = AbstractC38109c.f163211a;
                AbstractC22676k.m65750j(it, "it");
                Type ownerType = it.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 1:
                ParameterizedType it3 = (ParameterizedType) obj;
                List list2 = AbstractC38109c.f163211a;
                AbstractC22676k.m65750j(it3, "it");
                Type[] actualTypeArguments = it3.getActualTypeArguments();
                AbstractC22676k.m65749i(actualTypeArguments, "getActualTypeArguments(...)");
                return AbstractC25260n.m74050X(actualTypeArguments);
            case 2:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            default:
                String simpleName = ((Class) obj).getSimpleName();
                if (!C35850h.m113815f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return C35850h.m113814e(simpleName);
                }
                return null;
        }
    }
}
