package p390p1;

import p668z1.AbstractC39950b0;
import p668z1.AbstractC39963l;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.n2 */
/* JADX INFO: loaded from: classes.dex */
public final class C28646n2 extends AbstractC39950b0 {

    /* JADX INFO: renamed from: c */
    public Object f115859c;

    public C28646n2(long j7, Object obj) {
        super(j7);
        this.f115859c = obj;
    }

    @Override // p668z1.AbstractC39950b0
    /* JADX INFO: renamed from: a */
    public final void mo86985a(AbstractC39950b0 abstractC39950b0) {
        AbstractC22676k.m65748h(abstractC39950b0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
        this.f115859c = ((C28646n2) abstractC39950b0).f115859c;
    }

    @Override // p668z1.AbstractC39950b0
    /* JADX INFO: renamed from: b */
    public final AbstractC39950b0 mo86986b(long j7) {
        return new C28646n2(AbstractC39963l.m128171k().mo128147g(), this.f115859c);
    }
}
