package p003a1;

import a01.C0084d;
import a30.C0319q;
import a30.C0323s;
import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import bc3.AbstractC3006f0;
import bc3.C3054r1;
import c93.InterfaceC4339a;
import dc3.C11923h;
import ep1.C13412g;
import g20.C15270p;
import l83.C23454a0;
import n20.C26175j;
import p000.C22931l;
import p005a3.AbstractC0201g;
import p027b3.AbstractC2453v1;
import p041c1.C3816a;
import p132f0.C13772b0;
import p132f0.C13775c0;
import p133f1.C13958m0;
import p180h0.AbstractC16387f1;
import p180h0.AbstractC16434o3;
import p180h0.AbstractC16444q3;
import p180h0.C16378d3;
import p180h0.C16489z3;
import p409q0.AbstractC29701y;
import p411q2.InterfaceC29805a;
import p512u2.C34462h0;
import p512u2.InterfaceC34476v;
import p541v2.C35560c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22667f0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: a1.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C0107f implements PointerInputEventHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f333w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f334x;

    public /* synthetic */ C0107f(Object obj, int i13) {
        this.f333w = i13;
        this.f334x = obj;
    }

    @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d interfaceC30057d) {
        Object objM8719m;
        int i13 = this.f333w;
        final int i14 = 0;
        final int i15 = 1;
        InterfaceC30057d interfaceC30057d2 = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f334x;
        switch (i13) {
            case 0:
                Object objM46625g = AbstractC16444q3.m46625g(interfaceC34476v, new C13958m0(i15, new C0106e(1, (C0110i) obj, C0110i.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0), interfaceC30057d2), interfaceC30057d);
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (objM46625g != enumC31071a) {
                    objM46625g = c23454a0;
                }
                return objM46625g == enumC31071a ? objM46625g : c23454a0;
            case 1:
                Object objM46625g2 = AbstractC16444q3.m46625g(interfaceC34476v, new C3054r1((C3816a) obj, interfaceC30057d2, i15), interfaceC30057d);
                return objM46625g2 == EnumC31071a.f128113w ? objM46625g2 : c23454a0;
            case 2:
                final C13775c0 c13775c0 = (C13775c0) obj;
                Object obj2 = null;
                Function1 function1 = (!c13775c0.f49201V || c13775c0.f49145k0 == null) ? null : new Function1() { // from class: f0.a0
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i14) {
                            case 0:
                                C13775c0 c13775c1 = c13775c0;
                                InterfaceC4339a interfaceC4339a = c13775c1.f49145k0;
                                if (interfaceC4339a != null) {
                                    interfaceC4339a.invoke();
                                }
                                if (c13775c1.f49146l0) {
                                    ((InterfaceC29805a) AbstractC0201g.m506f(c13775c1, AbstractC2453v1.f9573l)).mo7428a(0);
                                }
                                break;
                            default:
                                C13775c0 c13775c2 = c13775c0;
                                if (c13775c2.f49201V) {
                                    c13775c2.f49202W.invoke();
                                }
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
                C13772b0 c13772b0 = new C13772b0(c13775c0, null);
                Function1 function2 = new Function1() { // from class: f0.a0
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i15) {
                            case 0:
                                C13775c0 c13775c1 = c13775c0;
                                InterfaceC4339a interfaceC4339a = c13775c1.f49145k0;
                                if (interfaceC4339a != null) {
                                    interfaceC4339a.invoke();
                                }
                                if (c13775c1.f49146l0) {
                                    ((InterfaceC29805a) AbstractC0201g.m506f(c13775c1, AbstractC2453v1.f9573l)).mo7428a(0);
                                }
                                break;
                            default:
                                C13775c0 c13775c2 = c13775c0;
                                if (c13775c2.f49201V) {
                                    c13775c2.f49202W.invoke();
                                }
                                break;
                        }
                        return C23454a0.f92919a;
                    }
                };
                C16378d3 c16378d3 = AbstractC16434o3.f63148a;
                Object objM8719m2 = AbstractC3006f0.m8719m(new C0323s(interfaceC34476v, c13772b0, function1, obj2, function2, null, 2), interfaceC30057d);
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                if (objM8719m2 != enumC31071a2) {
                    objM8719m2 = c23454a0;
                }
                return objM8719m2 == enumC31071a2 ? objM8719m2 : c23454a0;
            case 3:
                Object objM108934X0 = ((C34462h0) interfaceC34476v).m108934X0(new C13958m0(i14, (Function1) obj, interfaceC30057d2), interfaceC30057d);
                return objM108934X0 == EnumC31071a.f128113w ? objM108934X0 : c23454a0;
            case 4:
                C35560c c35560c = new C35560c();
                C22667f0 c22667f0 = new C22667f0();
                final AbstractC16387f1 abstractC16387f1 = (AbstractC16387f1) obj;
                c22667f0.f89335w = AbstractC0201g.m515o(abstractC16387f1).mo3516S(0L);
                Object objM8719m3 = AbstractC3006f0.m8719m(new C0319q(interfaceC34476v, abstractC16387f1, new C22931l(26, abstractC16387f1, c35560c), new C13412g(c35560c, interfaceC34476v, abstractC16387f1, 19), new InterfaceC4339a() { // from class: h0.a1
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                C11923h c11923h = abstractC16387f1.f63010U;
                                if (c11923h != null) {
                                    c11923h.mo32218s(C16391g0.f63025a);
                                }
                                return C23454a0.f92919a;
                            default:
                                return Boolean.valueOf(!abstractC16387f1.mo46584h1());
                        }
                    }
                }, new InterfaceC4339a() { // from class: h0.a1
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                C11923h c11923h = abstractC16387f1.f63010U;
                                if (c11923h != null) {
                                    c11923h.mo32218s(C16391g0.f63025a);
                                }
                                return C23454a0.f92919a;
                            default:
                                return Boolean.valueOf(!abstractC16387f1.mo46584h1());
                        }
                    }
                }, new C0084d(abstractC16387f1, c22667f0, c35560c, 18), (InterfaceC30057d) null, 2), interfaceC30057d);
                return objM8719m3 == EnumC31071a.f128113w ? objM8719m3 : c23454a0;
            case 5:
                C16489z3 c16489z3 = (C16489z3) obj;
                return (c16489z3.f63375S && (objM8719m = AbstractC3006f0.m8719m(new C15270p(interfaceC34476v, c16489z3, interfaceC30057d2, 13), interfaceC30057d)) == EnumC31071a.f128113w) ? objM8719m : c23454a0;
            default:
                Object objM8719m4 = AbstractC3006f0.m8719m(new C26175j(interfaceC34476v, (AbstractC29701y) obj, interfaceC30057d2, 16), interfaceC30057d);
                return objM8719m4 == EnumC31071a.f128113w ? objM8719m4 : c23454a0;
        }
    }
}
