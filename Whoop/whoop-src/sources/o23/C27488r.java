package o23;

import ac3.C0746b;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import java.util.LinkedHashMap;
import p249jc.C21567b;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: o23.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C27488r implements InterfaceC30061h {

    /* JADX INFO: renamed from: x */
    public static final C21567b f110725x = new C21567b(13);

    /* JADX INFO: renamed from: w */
    public final C0746b f110726w = new C0746b(new LinkedHashMap());

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return interfaceC4351m.invoke(obj, this);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36238D(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30061h
    public final InterfaceC30062i getKey() {
        return f110725x;
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36251Q(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return AbstractC12889b.m36254T(this, interfaceC30063j);
    }
}
