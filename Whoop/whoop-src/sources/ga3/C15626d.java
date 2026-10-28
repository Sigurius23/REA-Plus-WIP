package ga3;

import bi.AbstractC3269g;
import lb3.AbstractC23811y;
import nb3.C26555l;
import nb3.EnumC26554k;
import o93.AbstractC27741m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31108b;
import r93.InterfaceC31109b0;
import u93.AbstractC34711x0;

/* JADX INFO: renamed from: ga3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C15626d implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C15626d f58660w = new C15626d();

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC23811y type;
        InterfaceC31109b0 module = (InterfaceC31109b0) obj;
        Object obj2 = AbstractC15627e.f58661a;
        AbstractC22676k.m65750j(module, "module");
        InterfaceC31108b interfaceC31108bM9475C = AbstractC3269g.m9475C(AbstractC15625c.f58657b, module.mo78661c().m83822j(AbstractC27741m.f111869t));
        return (interfaceC31108bM9475C == null || (type = ((AbstractC34711x0) interfaceC31108bM9475C).getType()) == null) ? C26555l.m78682c(EnumC26554k.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
