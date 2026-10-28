package p668z1;

import p491t1.AbstractC33272c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C39974w extends AbstractC39950b0 {

    /* JADX INFO: renamed from: c */
    public AbstractC33272c f172504c;

    /* JADX INFO: renamed from: d */
    public int f172505d;

    /* JADX INFO: renamed from: e */
    public int f172506e;

    public C39974w(long j7, AbstractC33272c abstractC33272c) {
        super(j7);
        this.f172504c = abstractC33272c;
    }

    @Override // p668z1.AbstractC39950b0
    /* JADX INFO: renamed from: a */
    public final void mo86985a(AbstractC39950b0 abstractC39950b0) {
        synchronized (AbstractC39968q.f172474a) {
            AbstractC22676k.m65748h(abstractC39950b0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            this.f172504c = ((C39974w) abstractC39950b0).f172504c;
            this.f172505d = ((C39974w) abstractC39950b0).f172505d;
            this.f172506e = ((C39974w) abstractC39950b0).f172506e;
        }
    }

    @Override // p668z1.AbstractC39950b0
    /* JADX INFO: renamed from: b */
    public final AbstractC39950b0 mo86986b(long j7) {
        return new C39974w(j7, this.f172504c);
    }
}
