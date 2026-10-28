package p512u2;

import androidx.compose.p018ui.input.pointer.PointerInputEventHandler;
import c93.InterfaceC4351m;
import l83.InterfaceC23459e;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: u2.b0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C34450b0 implements PointerInputEventHandler, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC4351m f144743w;

    public C34450b0(InterfaceC4351m interfaceC4351m) {
        this.f144743w = interfaceC4351m;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.f144743w;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.p018ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(InterfaceC34476v interfaceC34476v, InterfaceC30057d interfaceC30057d) {
        return this.f144743w.invoke(interfaceC34476v, interfaceC30057d);
    }
}
