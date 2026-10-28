package ab3;

import lb3.AbstractC23811y;
import o93.AbstractC27736h;
import o93.EnumC27738j;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31109b0;

/* JADX INFO: renamed from: ab3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C0712d extends AbstractC0724p {
    public C0712d(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // ab3.AbstractC0715g
    /* JADX INFO: renamed from: a */
    public final AbstractC23811y mo1776a(InterfaceC31109b0 module) {
        AbstractC22676k.m65750j(module, "module");
        AbstractC27736h abstractC27736hMo78661c = module.mo78661c();
        abstractC27736hMo78661c.getClass();
        return abstractC27736hMo78661c.m83831t(EnumC27738j.BYTE);
    }

    @Override // ab3.AbstractC0715g
    public final String toString() {
        return ((Number) this.f2696a).intValue() + ".toByte()";
    }
}
