package ab3;

import lb3.AbstractC23811y;
import o93.AbstractC27736h;
import o93.EnumC27738j;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31109b0;

/* JADX INFO: renamed from: ab3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C0711c extends AbstractC0715g {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2693b = 1;

    public /* synthetic */ C0711c(Object obj) {
        super(obj);
    }

    @Override // ab3.AbstractC0715g
    /* JADX INFO: renamed from: a */
    public final AbstractC23811y mo1776a(InterfaceC31109b0 module) {
        switch (this.f2693b) {
            case 0:
                AbstractC22676k.m65750j(module, "module");
                AbstractC27736h abstractC27736hMo78661c = module.mo78661c();
                abstractC27736hMo78661c.getClass();
                return abstractC27736hMo78661c.m83831t(EnumC27738j.BOOLEAN);
            case 1:
                AbstractC22676k.m65750j(module, "module");
                AbstractC27736h abstractC27736hMo78661c2 = module.mo78661c();
                abstractC27736hMo78661c2.getClass();
                return abstractC27736hMo78661c2.m83831t(EnumC27738j.DOUBLE);
            default:
                AbstractC22676k.m65750j(module, "module");
                AbstractC27736h abstractC27736hMo78661c3 = module.mo78661c();
                abstractC27736hMo78661c3.getClass();
                return abstractC27736hMo78661c3.m83831t(EnumC27738j.FLOAT);
        }
    }

    @Override // ab3.AbstractC0715g
    public String toString() {
        switch (this.f2693b) {
            case 1:
                return ((Number) this.f2696a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.f2696a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public C0711c(boolean z4) {
        super(Boolean.valueOf(z4));
    }

    public C0711c(double d3) {
        super(Double.valueOf(d3));
    }

    public C0711c(float f13) {
        super(Float.valueOf(f13));
    }
}
