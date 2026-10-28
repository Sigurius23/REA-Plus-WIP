package p004a2;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import java.util.List;
import p390p1.C28655q;
import p410q1.InterfaceC29773k0;
import p437qt.C30582e;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: a2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0154c implements InterfaceC29773k0, InterfaceC30061h {

    /* JADX INFO: renamed from: x */
    public static final C30582e f477x = new C30582e(1);

    /* JADX INFO: renamed from: w */
    public final C28655q f478w;

    public C0154c(C28655q c28655q) {
        this.f478w = c28655q;
    }

    @Override // p410q1.InterfaceC29773k0
    /* JADX INFO: renamed from: f */
    public final List mo402f(Integer num) {
        return this.f478w.m87126K();
    }

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
        return f477x;
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
