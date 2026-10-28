package fa3;

import ha3.InterfaceC17060c;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import o93.AbstractC27736h;
import p249jc.AbstractC21598x;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31108b;
import r93.InterfaceC31111c;
import r93.InterfaceC31117e;
import r93.InterfaceC31162w;
import se.AbstractC32416g;
import u93.AbstractC34690n;
import va3.C35850h;
import ya3.InterfaceC39364g;

/* JADX INFO: renamed from: fa3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C14324q implements InterfaceC39364g {
    @Override // ya3.InterfaceC39364g
    /* JADX INFO: renamed from: a */
    public final int mo40920a() {
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ad A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ya3.InterfaceC39364g
    /* JADX INFO: renamed from: b */
    public final int mo40921b(InterfaceC31108b superDescriptor, InterfaceC31108b subDescriptor, InterfaceC31117e interfaceC31117e) {
        boolean z4;
        InterfaceC31162w interfaceC31162w;
        AbstractC22676k.m65750j(superDescriptor, "superDescriptor");
        AbstractC22676k.m65750j(subDescriptor, "subDescriptor");
        if ((superDescriptor instanceof InterfaceC31111c) && (subDescriptor instanceof InterfaceC31162w) && !AbstractC27736h.m83799A(subDescriptor)) {
            int i13 = AbstractC14309e.f52250l;
            InterfaceC31162w interfaceC31162w2 = (InterfaceC31162w) subDescriptor;
            AbstractC34690n abstractC34690n = (AbstractC34690n) interfaceC31162w2;
            C35850h name = abstractC34690n.getName();
            AbstractC22676k.m65749i(name, "getName(...)");
            if (AbstractC14309e.m40919b(name)) {
                InterfaceC31111c interfaceC31111cM101133B = AbstractC32416g.m101133B((InterfaceC31111c) superDescriptor);
                z4 = superDescriptor instanceof InterfaceC31162w;
                if (z4) {
                    interfaceC31162w = (InterfaceC31162w) superDescriptor;
                } else {
                    interfaceC31162w = null;
                }
                if (interfaceC31162w == null) {
                    if (interfaceC31117e instanceof InterfaceC17060c) {
                        if (AbstractC21598x.m60647D(superDescriptor, subDescriptor)) {
                            return 3;
                        }
                    } else if (AbstractC21598x.m60647D(superDescriptor, subDescriptor)) {
                        return 3;
                    }
                } else if (interfaceC31117e instanceof InterfaceC17060c) {
                    if (AbstractC21598x.m60647D(superDescriptor, subDescriptor)) {
                        return 3;
                    }
                } else if (AbstractC21598x.m60647D(superDescriptor, subDescriptor)) {
                    return 3;
                }
            } else {
                ArrayList arrayList = AbstractC14314g0.f52261a;
                C35850h name2 = abstractC34690n.getName();
                AbstractC22676k.m65749i(name2, "getName(...)");
                if (AbstractC14314g0.f52270j.contains(name2)) {
                    InterfaceC31111c interfaceC31111cM101133B2 = AbstractC32416g.m101133B((InterfaceC31111c) superDescriptor);
                    z4 = superDescriptor instanceof InterfaceC31162w;
                    if (z4) {
                        interfaceC31162w = (InterfaceC31162w) superDescriptor;
                    } else {
                        interfaceC31162w = null;
                    }
                    if ((interfaceC31162w == null && interfaceC31162w2.mo95881f0() == interfaceC31162w.mo95881f0()) || (interfaceC31111cM101133B2 != null && interfaceC31162w2.mo95881f0())) {
                        if ((interfaceC31117e instanceof InterfaceC17060c) || interfaceC31162w2.mo95880Z() != null || interfaceC31111cM101133B2 == null || AbstractC32416g.m101135D(interfaceC31117e, interfaceC31111cM101133B2)) {
                            if (AbstractC21598x.m60647D(superDescriptor, subDescriptor)) {
                                return 3;
                            }
                        } else if ((interfaceC31111cM101133B2 instanceof InterfaceC31162w) && z4 && AbstractC14309e.m40918a((InterfaceC31162w) interfaceC31111cM101133B2) != null) {
                            String strM56347o = AbstractC20301a.m56347o(interfaceC31162w2, 2);
                            InterfaceC31162w interfaceC31162wMo78660a = ((InterfaceC31162w) superDescriptor).mo78660a();
                            AbstractC22676k.m65749i(interfaceC31162wMo78660a, "getOriginal(...)");
                            if (AbstractC22676k.m65745e(strM56347o, AbstractC20301a.m56347o(interfaceC31162wMo78660a, 2))) {
                                if (AbstractC21598x.m60647D(superDescriptor, subDescriptor)) {
                                    return 3;
                                }
                            }
                        }
                    }
                } else if (AbstractC21598x.m60647D(superDescriptor, subDescriptor)) {
                    return 3;
                }
            }
        } else if (AbstractC21598x.m60647D(superDescriptor, subDescriptor)) {
            return 3;
        }
        return 2;
    }
}
