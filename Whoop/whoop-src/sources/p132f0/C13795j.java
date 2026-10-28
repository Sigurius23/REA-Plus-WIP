package p132f0;

import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import b30.C2525g2;
import l83.C23454a0;
import p180h0.AbstractC16444q3;
import p512u2.InterfaceC34476v;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: f0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C13795j implements PointerInputEventHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C13798k f49226w;

    public C13795j(C13798k c13798k) {
        this.f49226w = c13798k;
    }

    @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d interfaceC30057d) {
        Object objM46625g = AbstractC16444q3.m46625g(interfaceC34476v, new C2525g2(this.f49226w, null, 1), interfaceC30057d);
        return objM46625g == EnumC31071a.f128113w ? objM46625g : C23454a0.f92919a;
    }
}
