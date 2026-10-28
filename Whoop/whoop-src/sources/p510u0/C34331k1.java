package p510u0;

import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import cz.C11194d;
import l83.C23454a0;
import p180h0.AbstractC16434o3;
import p180h0.C16378d3;
import p180h0.C16398h2;
import p238j0.InterfaceC21083i;
import p390p1.InterfaceC28601c1;
import p512u2.InterfaceC34476v;
import q12.C29802c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: u0.k1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34331k1 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC2994c0 f144203w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f144204x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC21083i f144205y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f144206z;

    public C34331k1(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC21083i interfaceC21083i, InterfaceC28601c1 interfaceC28601c2) {
        this.f144203w = interfaceC2994c0;
        this.f144204x = interfaceC28601c1;
        this.f144205y = interfaceC21083i;
        this.f144206z = interfaceC28601c2;
    }

    @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d interfaceC30057d) {
        C34328j1 c34328j1 = new C34328j1(this.f144203w, this.f144204x, this.f144205y, null);
        C29802c c29802c = new C29802c(14, this.f144206z);
        C16378d3 c16378d3 = AbstractC16434o3.f63148a;
        Object objM8719m = AbstractC3006f0.m8719m(new C11194d(interfaceC34476v, c34328j1, c29802c, new C16398h2(interfaceC34476v), null), interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (objM8719m != enumC31071a) {
            objM8719m = c23454a0;
        }
        return objM8719m == enumC31071a ? objM8719m : c23454a0;
    }
}
