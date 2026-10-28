package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5141g0 extends AbstractC5144h0 {
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5144h0
    /* JADX INFO: renamed from: a */
    public final void mo16169a(long j7, Object obj) {
        AbstractC5125b abstractC5125b = (AbstractC5125b) ((InterfaceC5123a0) AbstractC5160m1.f21551c.m16249i(j7, obj));
        if (abstractC5125b.f21478w) {
            abstractC5125b.f21478w = false;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5144h0
    /* JADX INFO: renamed from: b */
    public final void mo16170b(long j7, Object obj, Object obj2) {
        AbstractC5157l1 abstractC5157l1 = AbstractC5160m1.f21551c;
        InterfaceC5123a0 interfaceC5123a0Mo16111i = (InterfaceC5123a0) abstractC5157l1.m16249i(j7, obj);
        InterfaceC5123a0 interfaceC5123a0 = (InterfaceC5123a0) abstractC5157l1.m16249i(j7, obj2);
        int size = interfaceC5123a0Mo16111i.size();
        int size2 = interfaceC5123a0.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC5125b) interfaceC5123a0Mo16111i).f21478w) {
                interfaceC5123a0Mo16111i = interfaceC5123a0Mo16111i.mo16111i(size2 + size);
            }
            interfaceC5123a0Mo16111i.addAll(interfaceC5123a0);
        }
        if (size > 0) {
            interfaceC5123a0 = interfaceC5123a0Mo16111i;
        }
        AbstractC5160m1.m16292p(j7, obj, interfaceC5123a0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5144h0
    /* JADX INFO: renamed from: c */
    public final List mo16171c(long j7, Object obj) {
        InterfaceC5123a0 interfaceC5123a0 = (InterfaceC5123a0) AbstractC5160m1.f21551c.m16249i(j7, obj);
        if (((AbstractC5125b) interfaceC5123a0).f21478w) {
            return interfaceC5123a0;
        }
        int size = interfaceC5123a0.size();
        InterfaceC5123a0 interfaceC5123a0Mo16111i = interfaceC5123a0.mo16111i(size == 0 ? 10 : size * 2);
        AbstractC5160m1.m16292p(j7, obj, interfaceC5123a0Mo16111i);
        return interfaceC5123a0Mo16111i;
    }
}
