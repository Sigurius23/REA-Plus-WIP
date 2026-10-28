package q93;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31135k;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: q93.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C30089m implements Function1 {
    public C30089m(C30092p c30092p) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z4;
        InterfaceC31111c interfaceC31111c = (InterfaceC31111c) obj;
        if (interfaceC31111c.getKind() == 1) {
            InterfaceC31135k interfaceC31135kMo60581g = interfaceC31111c.mo60581g();
            AbstractC22676k.m65748h(interfaceC31135kMo60581g, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            String str = C30080d.f122759a;
            z4 = C30080d.f122768j.containsKey(AbstractC39363f.m125524f((InterfaceC31117e) interfaceC31135kMo60581g));
        }
        return Boolean.valueOf(z4);
    }
}
