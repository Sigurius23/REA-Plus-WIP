package p163g1;

import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import az1.C2161b;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p180h0.AbstractC16434o3;
import p180h0.C16416l0;
import p512u2.InterfaceC34476v;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: g1.l2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15068l2 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56421w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f56422x;

    public /* synthetic */ C15068l2(InterfaceC4339a interfaceC4339a, int i13) {
        this.f56421w = i13;
        this.f56422x = interfaceC4339a;
    }

    @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d interfaceC30057d) {
        switch (this.f56421w) {
            case 0:
                Object objM46605e = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C2161b(this.f56422x, 27), interfaceC30057d, 7);
                return objM46605e == EnumC31071a.f128113w ? objM46605e : C23454a0.f92919a;
            case 1:
                Object objM46605e2 = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C2161b(this.f56422x, 28), interfaceC30057d, 7);
                return objM46605e2 == EnumC31071a.f128113w ? objM46605e2 : C23454a0.f92919a;
            default:
                Object objM46605e3 = AbstractC16434o3.m46605e(interfaceC34476v, null, null, null, new C16416l0(this.f56422x, 14), interfaceC30057d, 7);
                return objM46605e3 == EnumC31071a.f128113w ? objM46605e3 : C23454a0.f92919a;
        }
    }
}
