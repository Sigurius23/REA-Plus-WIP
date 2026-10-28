package p133f1;

import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import l83.C23454a0;
import p510u0.AbstractC34339n0;
import p510u0.InterfaceC34310d1;
import p512u2.InterfaceC34476v;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: f1.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13934e0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49676w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC34310d1 f49677x;

    public /* synthetic */ C13934e0(InterfaceC34310d1 interfaceC34310d1, int i13) {
        this.f49676w = i13;
        this.f49677x = interfaceC34310d1;
    }

    @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d interfaceC30057d) {
        switch (this.f49676w) {
            case 0:
                Object objM108633k = AbstractC34339n0.m108633k(interfaceC34476v, this.f49677x, interfaceC30057d);
                return objM108633k == EnumC31071a.f128113w ? objM108633k : C23454a0.f92919a;
            default:
                Object objM108633k2 = AbstractC34339n0.m108633k(interfaceC34476v, this.f49677x, interfaceC30057d);
                return objM108633k2 == EnumC31071a.f128113w ? objM108633k2 : C23454a0.f92919a;
        }
    }
}
