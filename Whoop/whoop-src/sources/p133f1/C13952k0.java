package p133f1;

import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import bc3.AbstractC3006f0;
import bc3.C3054r1;
import e10.C12554k0;
import l83.C23454a0;
import p000.C11327d0;
import p005a3.AbstractC0201g;
import p012ab.C0682h0;
import p180h0.AbstractC16434o3;
import p180h0.AbstractC16444q3;
import p180h0.C16489z3;
import p390p1.InterfaceC28601c1;
import p40.C28827b;
import p510u0.InterfaceC34310d1;
import p512u2.C34462h0;
import p512u2.InterfaceC34476v;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: f1.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13952k0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49734w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f49735x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f49736y;

    public /* synthetic */ C13952k0(int i13, Object obj, Object obj2) {
        this.f49734w = i13;
        this.f49735x = obj;
        this.f49736y = obj2;
    }

    @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d interfaceC30057d) {
        switch (this.f49734w) {
            case 0:
                C34462h0 c34462h0 = (C34462h0) interfaceC34476v;
                c34462h0.getClass();
                Object objM46625g = AbstractC16444q3.m46625g(interfaceC34476v, new C3054r1((InterfaceC13948j) this.f49735x, new C0682h0(AbstractC0201g.m516p(c34462h0).f778Z), (InterfaceC34310d1) this.f49736y, null, 2), interfaceC30057d);
                return objM46625g == EnumC31071a.f128113w ? objM46625g : C23454a0.f92919a;
            case 1:
                Object objM46625g2 = AbstractC16444q3.m46625g(interfaceC34476v, new C13985v0((C13988w0) this.f49735x, (C13931d0) this.f49736y, null, 0), interfaceC30057d);
                return objM46625g2 == EnumC31071a.f128113w ? objM46625g2 : C23454a0.f92919a;
            case 2:
                C34462h0 c34462h1 = (C34462h0) interfaceC34476v;
                Object objM108934X0 = c34462h1.m108934X0(new C3054r1(interfaceC30057d.getContext(), (C12554k0) this.f49736y, ((C16489z3) this.f49735x).f63377U, null, 3), interfaceC30057d);
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (objM108934X0 != enumC31071a) {
                    objM108934X0 = c23454a0;
                }
                return objM108934X0 == enumC31071a ? objM108934X0 : c23454a0;
            case 3:
                Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C28827b((InterfaceC28601c1) this.f49735x, (Function1) this.f49736y, 8), interfaceC30057d, 7);
                return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
            default:
                Object objM8719m = AbstractC3006f0.m8719m(new C11327d0(interfaceC34476v, (InterfaceC34310d1) this.f49736y, (C13977s1) this.f49735x, null, 8), interfaceC30057d);
                return objM8719m == EnumC31071a.f128113w ? objM8719m : C23454a0.f92919a;
        }
    }

    public C13952k0(InterfaceC34310d1 interfaceC34310d1, C13977s1 c13977s1) {
        this.f49734w = 4;
        this.f49736y = interfaceC34310d1;
        this.f49735x = c13977s1;
    }
}
