package p668z1;

import p476s1.InterfaceC32057d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z1.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C39969r extends AbstractC39950b0 {

    /* JADX INFO: renamed from: c */
    public InterfaceC32057d f172475c;

    /* JADX INFO: renamed from: d */
    public int f172476d;

    public C39969r(long j7, InterfaceC32057d interfaceC32057d) {
        super(j7);
        this.f172475c = interfaceC32057d;
    }

    @Override // p668z1.AbstractC39950b0
    /* JADX INFO: renamed from: a */
    public final void mo86985a(AbstractC39950b0 abstractC39950b0) {
        AbstractC22676k.m65748h(abstractC39950b0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
        C39969r c39969r = (C39969r) abstractC39950b0;
        synchronized (AbstractC39971t.f172481a) {
            this.f172475c = c39969r.f172475c;
            this.f172476d = c39969r.f172476d;
        }
    }

    @Override // p668z1.AbstractC39950b0
    /* JADX INFO: renamed from: b */
    public final AbstractC39950b0 mo86986b(long j7) {
        return new C39969r(j7, this.f172475c);
    }
}
