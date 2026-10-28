package p386oy;

import ih0.AbstractC18489d0;
import p236j.AbstractC21065d;
import p236j.InterfaceC21063b;
import p236j.InterfaceC21064c;
import p236j.InterfaceC21072k;
import p267k.AbstractC22081b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oy.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C28466c implements InterfaceC21064c {

    /* JADX INFO: renamed from: w */
    public final String f114770w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC21072k f114771x;

    public C28466c(String key, InterfaceC21072k interfaceC21072k) {
        AbstractC22676k.m65750j(key, "key");
        this.f114770w = key;
        this.f114771x = interfaceC21072k;
    }

    @Override // p236j.InterfaceC21064c
    public final AbstractC21065d registerForActivityResult(AbstractC22081b contract, InterfaceC21063b interfaceC21063b) {
        AbstractC22676k.m65750j(contract, "contract");
        return this.f114771x.getActivityResultRegistry().m58914d(AbstractC18489d0.m53370k(this.f114770w, "_", contract.getClass().getName()), contract, interfaceC21063b);
    }
}
