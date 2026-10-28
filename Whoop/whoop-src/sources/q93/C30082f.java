package q93;

import ib3.C18344c;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25265s;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import r93.InterfaceC31109b0;
import r93.InterfaceC31135k;
import u93.C34665a0;

/* JADX INFO: renamed from: q93.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C30082f implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C30082f f122774w = new C30082f();

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC31109b0 module = (InterfaceC31109b0) obj;
        C30081e c30081e = C30083g.f122775d;
        AbstractC22676k.m65750j(module, "module");
        List list = (List) AbstractC29125c.m88494C(((C34665a0) module.mo78658F(C30083g.f122777f)).f146029F, C34665a0.f146027I[0]);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C18344c) {
                arrayList.add(obj2);
            }
        }
        return (InterfaceC31135k) AbstractC25265s.m74096F0(arrayList);
    }
}
