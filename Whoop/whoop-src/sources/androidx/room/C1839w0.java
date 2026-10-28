package androidx.room;

import a20.C0162b;
import androidx.compose.p018ui.node.NodeCoordinator;
import bc3.AbstractC3006f0;
import bd3.C3137p;
import c93.InterfaceC4351m;
import d30.C11546l;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p132f0.C13793i0;
import p132f0.C13796j0;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15250v;
import p238j0.C21078d;
import p238j0.C21079e;
import p238j0.InterfaceC21083i;
import p389p0.C28524g0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22672i;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: androidx.room.w0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1839w0 extends C22672i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7202w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1839w0(int i13, Object obj, Class cls, String str, String str2, int i14, int i15) {
        super(i13, i14, cls, obj, str, str2);
        this.f7202w = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        boolean zM43354b;
        C13796j0 c13796j0M39158b1;
        switch (this.f7202w) {
            case 0:
                return AbstractC29125c.m88540q((AbstractC1848z0) this.receiver, (Function1) obj, (InterfaceC30057d) obj2);
            case 1:
                InterfaceC39443g p13 = (InterfaceC39443g) obj;
                int iIntValue = ((Number) obj2).intValue();
                AbstractC22676k.m65750j(p13, "p0");
                C3137p c3137p = (C3137p) this.receiver;
                c3137p.getClass();
                boolean z4 = !p13.isElementOptional(iIntValue) && p13.getElementDescriptor(iIntValue).isNullable();
                c3137p.f12295b = z4;
                return Boolean.valueOf(z4);
            default:
                InterfaceC15250v interfaceC15250v = (InterfaceC15250v) obj;
                InterfaceC15250v interfaceC15250v2 = (InterfaceC15250v) obj2;
                C13793i0 c13793i0 = (C13793i0) this.receiver;
                if (c13793i0.f9141N && (zM43354b = ((EnumC15251w) interfaceC15250v2).m43354b()) != ((EnumC15251w) interfaceC15250v).m43354b()) {
                    Function1 function1 = c13793i0.f49221R;
                    if (function1 != null) {
                        function1.invoke(Boolean.valueOf(zM43354b));
                    }
                    InterfaceC30057d interfaceC30057d = null;
                    if (zM43354b) {
                        AbstractC3006f0.m8732z(c13793i0.m7158L0(), null, null, new C0162b(c13793i0, interfaceC30057d, 16), 3);
                        C22669g0 c22669g0 = new C22669g0();
                        AbstractC0201g.m512l(c13793i0, new C11546l(23, c22669g0, c13793i0));
                        C28524g0 c28524g0 = (C28524g0) c22669g0.f89336w;
                        if (c28524g0 != null) {
                            c28524g0.m86827a();
                        } else {
                            c28524g0 = null;
                        }
                        c13793i0.f49223T = c28524g0;
                        NodeCoordinator nodeCoordinator = c13793i0.f49224U;
                        if (nodeCoordinator != null && nodeCoordinator.mo3533g1().f9141N && (c13796j0M39158b1 = c13793i0.m39158b1()) != null) {
                            c13796j0M39158b1.m39160X0(c13793i0.f49224U);
                        }
                    } else {
                        C28524g0 c28524g1 = c13793i0.f49223T;
                        if (c28524g1 != null) {
                            c28524g1.m86828b();
                        }
                        c13793i0.f49223T = null;
                        C13796j0 c13796j0M39158b2 = c13793i0.m39158b1();
                        if (c13796j0M39158b2 != null) {
                            c13796j0M39158b2.m39160X0(null);
                        }
                    }
                    AbstractC0201g.m510j(c13793i0);
                    InterfaceC21083i interfaceC21083i = c13793i0.f49220Q;
                    if (interfaceC21083i != null) {
                        if (zM43354b) {
                            C21078d c21078d = c13793i0.f49222S;
                            if (c21078d != null) {
                                c13793i0.m39157a1(interfaceC21083i, new C21079e(c21078d));
                                c13793i0.f49222S = null;
                            }
                            C21078d c21078d2 = new C21078d();
                            c13793i0.m39157a1(interfaceC21083i, c21078d2);
                            c13793i0.f49222S = c21078d2;
                        } else {
                            C21078d c21078d3 = c13793i0.f49222S;
                            if (c21078d3 != null) {
                                c13793i0.m39157a1(interfaceC21083i, new C21079e(c21078d3));
                                c13793i0.f49222S = null;
                            }
                        }
                    }
                }
                return C23454a0.f92919a;
        }
    }
}
