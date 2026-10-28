package p419qb;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import l83.C23467m;
import l83.InterfaceC23457c;
import ma1.C25371a;
import p390p1.AbstractC28669t1;
import p390p1.C28674u2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qb.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC30178a {

    /* JADX INFO: renamed from: a */
    public static final AbstractC28669t1 f123552a;

    static {
        Object objM107888l;
        try {
            ClassLoader classLoader = InterfaceC29049f.class.getClassLoader();
            AbstractC22676k.m65747g(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            AbstractC22676k.m65749i(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC28669t1) {
                        objM107888l = (AbstractC28669t1) objInvoke;
                        break;
                    }
                } else if (!(annotations[i13] instanceof InterfaceC23457c)) {
                    i13++;
                }
                objM107888l = null;
                break;
            }
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        AbstractC28669t1 c28674u2 = (AbstractC28669t1) (objM107888l instanceof C23467m ? null : objM107888l);
        if (c28674u2 == null) {
            c28674u2 = new C28674u2(new C25371a(22));
        }
        f123552a = c28674u2;
    }
}
