package p167g5;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g5.f */
/* JADX INFO: loaded from: classes.dex */
public final class C15487f extends C15486e {

    /* JADX INFO: renamed from: y */
    public final Object f58144y;

    public C15487f(int i13) {
        super(i13);
        this.f58144y = new Object();
    }

    @Override // p167g5.C15486e, p167g5.InterfaceC15485d
    /* JADX INFO: renamed from: a */
    public final boolean mo43683a(Object instance) {
        boolean zMo43683a;
        AbstractC22676k.m65750j(instance, "instance");
        synchronized (this.f58144y) {
            zMo43683a = super.mo43683a(instance);
        }
        return zMo43683a;
    }

    @Override // p167g5.C15486e, p167g5.InterfaceC15485d
    /* JADX INFO: renamed from: b */
    public final Object mo43684b() {
        Object objMo43684b;
        synchronized (this.f58144y) {
            objMo43684b = super.mo43684b();
        }
        return objMo43684b;
    }
}
