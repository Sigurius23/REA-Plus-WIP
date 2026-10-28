package fa3;

import ha3.C17062e;
import java.util.List;
import jh3.AbstractC21702c;
import ka3.C22314f;
import ka3.C22316h;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p027b3.C2365d3;
import p108e4.AbstractC12682p;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31108b;
import r93.InterfaceC31117e;
import r93.InterfaceC31151q0;
import u93.AbstractC34670d;
import u93.C34697q0;
import wb3.AbstractC37056f;
import xa0.C38136a;
import xb3.AbstractC38176k;
import xb3.C38170e;
import xb3.C38172g;
import xb3.C38184s;
import xb3.InterfaceC38174i;
import ya3.C39370m;
import ya3.C39371n;
import ya3.InterfaceC39364g;

/* JADX INFO: renamed from: fa3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C14316i implements InterfaceC39364g {
    @Override // ya3.InterfaceC39364g
    /* JADX INFO: renamed from: a */
    public final int mo40920a() {
        return 2;
    }

    @Override // ya3.InterfaceC39364g
    /* JADX INFO: renamed from: b */
    public final int mo40921b(InterfaceC31108b superDescriptor, InterfaceC31108b subDescriptor, InterfaceC31117e interfaceC31117e) {
        AbstractC22676k.m65750j(superDescriptor, "superDescriptor");
        AbstractC22676k.m65750j(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof C17062e) {
            C17062e c17062e = (C17062e) subDescriptor;
            if (c17062e.getTypeParameters().isEmpty()) {
                C39370m c39370mM125556i = C39371n.m125556i(superDescriptor, subDescriptor);
                if ((c39370mM125556i != null ? c39370mM125556i.m125549b() : 0) == 0) {
                    List listMo78676v = c17062e.mo78676v();
                    AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
                    C38184s c38184sM122272A = AbstractC38176k.m122272A(AbstractC25265s.m74145r0(listMo78676v), C14307d.f52238E);
                    AbstractC23811y abstractC23811y = c17062e.f146194H;
                    AbstractC22676k.m65747g(abstractC23811y);
                    C38172g c38172gM122286v = AbstractC38176k.m122286v(AbstractC25260n.m74050X(new InterfaceC38174i[]{c38184sM122272A, new C2365d3(abstractC23811y, 3)}), new C38136a(3));
                    InterfaceC31151q0 interfaceC31151q0 = c17062e.f146196J;
                    C38170e c38170e = new C38170e(AbstractC38176k.m122286v(AbstractC25260n.m74050X(new InterfaceC38174i[]{c38172gM122286v, AbstractC25265s.m74145r0(AbstractC37056f.m118960L(interfaceC31151q0 != null ? ((AbstractC34670d) interfaceC31151q0).getType() : null))}), new C38136a(3)));
                    while (c38170e.hasNext()) {
                        AbstractC23811y abstractC23811y2 = (AbstractC23811y) c38170e.next();
                        if (abstractC23811y2.mo69842X().isEmpty() || (abstractC23811y2.mo69863p0() instanceof C22316h)) {
                        }
                    }
                    InterfaceC31108b interfaceC31108bBuild = (InterfaceC31108b) superDescriptor.mo60593d(new C23758a1(new C22314f()));
                    if (interfaceC31108bBuild != null) {
                        if (interfaceC31108bBuild instanceof C34697q0) {
                            C34697q0 c34697q0 = (C34697q0) interfaceC31108bBuild;
                            if (!c34697q0.getTypeParameters().isEmpty()) {
                                interfaceC31108bBuild = c34697q0.mo78657l0().mo68175i().build();
                                AbstractC22676k.m65747g(interfaceC31108bBuild);
                            }
                        }
                        int iM125549b = C39371n.f169420c.m125568n(interfaceC31108bBuild, subDescriptor, false).m125549b();
                        AbstractC21702c.m61142m(iM125549b, "getResult(...)");
                        if (AbstractC14315h.f52272a[AbstractC12682p.m35485e(iM125549b)] == 1) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 3;
    }
}
