package p077d0;

import p031b9.AbstractC2875y;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: d0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C11376m implements InterfaceC28670t2 {

    /* JADX INFO: renamed from: E */
    public long f36468E;

    /* JADX INFO: renamed from: F */
    public boolean f36469F;

    /* JADX INFO: renamed from: w */
    public final C11351f2 f36470w;

    /* JADX INFO: renamed from: x */
    public final C28633k1 f36471x;

    /* JADX INFO: renamed from: y */
    public AbstractC11395r f36472y;

    /* JADX INFO: renamed from: z */
    public long f36473z;

    public /* synthetic */ C11376m(C11351f2 c11351f2, Object obj, AbstractC11395r abstractC11395r, int i13) {
        this(c11351f2, obj, (i13 & 4) != 0 ? null : abstractC11395r, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: a */
    public final Object m30606a() {
        return this.f36470w.f36397b.invoke(this.f36472y);
    }

    @Override // p390p1.InterfaceC28670t2
    public final Object getValue() {
        return this.f36471x.getValue();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AnimationState(value=");
        sb4.append(this.f36471x.getValue());
        sb4.append(", velocity=");
        sb4.append(m30606a());
        sb4.append(", isRunning=");
        sb4.append(this.f36469F);
        sb4.append(", lastFrameTimeNanos=");
        sb4.append(this.f36473z);
        sb4.append(", finishedTimeNanos=");
        return AbstractC2875y.m8302o(sb4, this.f36468E, ')');
    }

    public C11376m(C11351f2 c11351f2, Object obj, AbstractC11395r abstractC11395r, long j7, long j13, boolean z4) {
        AbstractC11395r abstractC11395rM30564l;
        this.f36470w = c11351f2;
        this.f36471x = AbstractC28683x.m87272z(obj);
        if (abstractC11395r != null) {
            abstractC11395rM30564l = AbstractC11348f.m30564l(abstractC11395r);
        } else {
            abstractC11395rM30564l = (AbstractC11395r) c11351f2.f36396a.invoke(obj);
            abstractC11395rM30564l.mo30610d();
        }
        this.f36472y = abstractC11395rM30564l;
        this.f36473z = j7;
        this.f36468E = j13;
        this.f36469F = z4;
    }
}
