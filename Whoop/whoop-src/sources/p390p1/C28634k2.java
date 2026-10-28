package p390p1;

import p668z1.AbstractC39950b0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p1.k2 */
/* JADX INFO: loaded from: classes.dex */
public final class C28634k2 extends AbstractC39950b0 {

    /* JADX INFO: renamed from: c */
    public float f115820c;

    public C28634k2(long j7, float f13) {
        super(j7);
        this.f115820c = f13;
    }

    @Override // p668z1.AbstractC39950b0
    /* JADX INFO: renamed from: a */
    public final void mo86985a(AbstractC39950b0 abstractC39950b0) {
        AbstractC22676k.m65748h(abstractC39950b0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.f115820c = ((C28634k2) abstractC39950b0).f115820c;
    }

    @Override // p668z1.AbstractC39950b0
    /* JADX INFO: renamed from: b */
    public final AbstractC39950b0 mo86986b(long j7) {
        return new C28634k2(j7, this.f115820c);
    }
}
