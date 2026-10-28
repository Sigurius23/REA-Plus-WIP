package m93;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;

/* JADX INFO: renamed from: m93.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C25353u extends AbstractC25356x implements InterfaceC25338f {

    /* JADX INFO: renamed from: f */
    public final boolean f99377f;

    /* JADX INFO: renamed from: g */
    public final Object f99378g;

    /* JADX WARN: Illegal instructions before constructor call */
    public C25353u(Method method, boolean z4, Object obj) {
        AbstractC22676k.m65750j(method, "method");
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        AbstractC22676k.m65749i(genericParameterTypes, "getGenericParameterTypes(...)");
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : AbstractC25260n.m74072m0(1, genericParameterTypes.length, genericParameterTypes)));
        this.f99377f = z4;
        this.f99378g = obj;
    }

    @Override // m93.InterfaceC25339g
    public final Object call(Object[] args) {
        AbstractC22676k.m65750j(args, "args");
        mo74412c(args);
        C22677k0 c22677k0 = new C22677k0(2);
        c22677k0.m65760a(this.f99378g);
        c22677k0.m65764e(args);
        ArrayList arrayList = c22677k0.f89339a;
        return m74413e(arrayList.toArray(new Object[arrayList.size()]), null);
    }
}
