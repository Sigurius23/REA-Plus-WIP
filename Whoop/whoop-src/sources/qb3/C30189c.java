package qb3;

import lb3.AbstractC23800s0;
import lb3.AbstractC23804u0;
import lb3.C23806v0;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import p715kotlin.jvm.internal.AbstractC22676k;
import za3.InterfaceC40247b;

/* JADX INFO: renamed from: qb3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C30189c extends AbstractC23800s0 {
    @Override // lb3.AbstractC23800s0
    /* JADX INFO: renamed from: g */
    public final AbstractC23804u0 mo69873g(InterfaceC23796q0 key) {
        AbstractC22676k.m65750j(key, "key");
        InterfaceC40247b interfaceC40247b = key instanceof InterfaceC40247b ? (InterfaceC40247b) key : null;
        if (interfaceC40247b == null) {
            return null;
        }
        if (interfaceC40247b.mo74523b().mo69869c()) {
            return new C23806v0(interfaceC40247b.mo74523b().mo69868b(), EnumC23776g1.OUT_VARIANCE);
        }
        return interfaceC40247b.mo74523b();
    }
}
