package mc3;

import hc3.AbstractC17189v;
import java.util.concurrent.atomic.AtomicReferenceArray;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: mc3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C25445k extends AbstractC17189v {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AtomicReferenceArray f99643E;

    public C25445k(long j7, C25445k c25445k, int i13) {
        super(j7, c25445k, i13);
        this.f99643E = new AtomicReferenceArray(AbstractC25444j.f99642f);
    }

    @Override // hc3.AbstractC17189v
    /* JADX INFO: renamed from: g */
    public final int mo32227g() {
        return AbstractC25444j.f99642f;
    }

    @Override // hc3.AbstractC17189v
    /* JADX INFO: renamed from: h */
    public final void mo32228h(int i13, InterfaceC30063j interfaceC30063j) {
        this.f99643E.set(i13, AbstractC25444j.f99641e);
        m48543i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f66007y + ", hashCode=" + hashCode() + ']';
    }
}
