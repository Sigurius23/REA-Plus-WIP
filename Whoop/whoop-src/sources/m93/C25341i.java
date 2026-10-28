package m93;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.ArrayList;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;

/* JADX INFO: renamed from: m93.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C25341i extends AbstractC25357y {
    /* JADX WARN: Illegal instructions before constructor call */
    public C25341i(Constructor constructor) {
        AbstractC22676k.m65750j(constructor, "constructor");
        Class declaringClass = constructor.getDeclaringClass();
        AbstractC22676k.m65749i(declaringClass, "getDeclaringClass(...)");
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        AbstractC22676k.m65749i(genericParameterTypes, "getGenericParameterTypes(...)");
        super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC25260n.m74072m0(0, genericParameterTypes.length - 1, genericParameterTypes)));
    }

    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        mo74412c(args);
        Constructor constructor = (Constructor) this.f99382a;
        C22677k0 c22677k0 = new C22677k0(2);
        c22677k0.m65764e(args);
        c22677k0.m65760a(null);
        ArrayList arrayList = c22677k0.f89339a;
        return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
    }
}
