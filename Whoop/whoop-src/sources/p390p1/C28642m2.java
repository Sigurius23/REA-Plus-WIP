package p390p1;

import p668z1.AbstractC39950b0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C28642m2 extends AbstractC39950b0 {

    /* JADX INFO: renamed from: c */
    public long f115848c;

    public C28642m2(long j7, long j13) {
        super(j7);
        this.f115848c = j13;
    }

    @Override // p668z1.AbstractC39950b0
    /* JADX INFO: renamed from: a */
    public final void mo86985a(AbstractC39950b0 abstractC39950b0) {
        AbstractC22676k.m65748h(abstractC39950b0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.f115848c = ((C28642m2) abstractC39950b0).f115848c;
    }

    @Override // p668z1.AbstractC39950b0
    /* JADX INFO: renamed from: b */
    public final AbstractC39950b0 mo86986b(long j7) {
        return new C28642m2(j7, this.f115848c);
    }
}
