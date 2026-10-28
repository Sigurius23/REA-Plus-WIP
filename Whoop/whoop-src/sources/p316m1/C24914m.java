package p316m1;

import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import bc3.AbstractC3006f0;
import l83.C23454a0;
import p292l1.C23203x4;
import p512u2.InterfaceC34476v;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: m1.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C24914m implements PointerInputEventHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f97584w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23203x4 f97585x;

    public /* synthetic */ C24914m(C23203x4 c23203x4, int i13) {
        this.f97584w = i13;
        this.f97585x = c23203x4;
    }

    @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d interfaceC30057d) {
        switch (this.f97584w) {
            case 0:
                Object objM8719m = AbstractC3006f0.m8719m(new C24912l(interfaceC34476v, this.f97585x, null, 0), interfaceC30057d);
                return objM8719m == EnumC31071a.f128113w ? objM8719m : C23454a0.f92919a;
            default:
                Object objM8719m2 = AbstractC3006f0.m8719m(new C24912l(interfaceC34476v, this.f97585x, null, 1), interfaceC30057d);
                return objM8719m2 == EnumC31071a.f128113w ? objM8719m2 : C23454a0.f92919a;
        }
    }
}
