package fa3;

import o73.C27648a;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31108b;
import r93.InterfaceC31117e;
import r93.InterfaceC31145n0;
import ya3.InterfaceC39364g;

/* JADX INFO: renamed from: fa3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C14318k implements InterfaceC39364g {
    @Override // ya3.InterfaceC39364g
    /* JADX INFO: renamed from: a */
    public final int mo40920a() {
        return 3;
    }

    @Override // ya3.InterfaceC39364g
    /* JADX INFO: renamed from: b */
    public final int mo40921b(InterfaceC31108b superDescriptor, InterfaceC31108b subDescriptor, InterfaceC31117e interfaceC31117e) {
        AbstractC22676k.m65750j(superDescriptor, "superDescriptor");
        AbstractC22676k.m65750j(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof InterfaceC31145n0) || !(superDescriptor instanceof InterfaceC31145n0)) {
            return 3;
        }
        InterfaceC31145n0 interfaceC31145n0 = (InterfaceC31145n0) subDescriptor;
        InterfaceC31145n0 interfaceC31145n1 = (InterfaceC31145n0) superDescriptor;
        if (!AbstractC22676k.m65745e(interfaceC31145n0.getName(), interfaceC31145n1.getName())) {
            return 3;
        }
        if (C27648a.m83565P(interfaceC31145n0) && C27648a.m83565P(interfaceC31145n1)) {
            return 1;
        }
        return (C27648a.m83565P(interfaceC31145n0) || C27648a.m83565P(interfaceC31145n1)) ? 2 : 3;
    }
}
