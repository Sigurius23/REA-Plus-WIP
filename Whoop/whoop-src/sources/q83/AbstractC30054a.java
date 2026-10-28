package q83;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q83.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC30054a implements InterfaceC30061h {
    private final InterfaceC30062i key;

    public AbstractC30054a(InterfaceC30062i key) {
        AbstractC22676k.m65750j(key, "key");
        this.key = key;
    }

    @Override // q83.InterfaceC30063j
    public /* bridge */ <R> R fold(R r10, InterfaceC4351m interfaceC4351m) {
        return (R) AbstractC12889b.m36236B(this, r10, interfaceC4351m);
    }

    @Override // q83.InterfaceC30063j
    public /* bridge */ <E extends InterfaceC30061h> E get(InterfaceC30062i interfaceC30062i) {
        return (E) AbstractC12889b.m36238D(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30061h
    public InterfaceC30062i getKey() {
        return this.key;
    }

    @Override // q83.InterfaceC30063j
    public /* bridge */ InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return AbstractC12889b.m36251Q(this, interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public /* bridge */ InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return AbstractC12889b.m36254T(this, interfaceC30063j);
    }
}
