package androidx.health.platform.client.proto;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.s0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1524s0 implements Cloneable {

    /* JADX INFO: renamed from: w */
    public final AbstractC1534u0 f6113w;

    /* JADX INFO: renamed from: x */
    public AbstractC1534u0 f6114x;

    public AbstractC1524s0(AbstractC1534u0 abstractC1534u0) {
        this.f6113w = abstractC1534u0;
        if (abstractC1534u0.m4871i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f6114x = abstractC1534u0.m4873l();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1534u0 m4813a() {
        AbstractC1534u0 abstractC1534u0M4814b = m4814b();
        abstractC1534u0M4814b.getClass();
        if (AbstractC1534u0.m4866h(abstractC1534u0M4814b, true)) {
            return abstractC1534u0M4814b;
        }
        throw new UninitializedMessageException();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1534u0 m4814b() {
        if (!this.f6114x.m4871i()) {
            return this.f6114x;
        }
        AbstractC1534u0 abstractC1534u0 = this.f6114x;
        abstractC1534u0.getClass();
        C1554y1 c1554y1 = C1554y1.f6164c;
        c1554y1.getClass();
        c1554y1.m4946a(abstractC1534u0.getClass()).mo4765b(abstractC1534u0);
        abstractC1534u0.m4872j();
        return this.f6114x;
    }

    /* JADX INFO: renamed from: c */
    public final void m4815c() {
        if (this.f6114x.m4871i()) {
            return;
        }
        AbstractC1534u0 abstractC1534u0M4873l = this.f6113w.m4873l();
        AbstractC1534u0 abstractC1534u0 = this.f6114x;
        C1554y1 c1554y1 = C1554y1.f6164c;
        c1554y1.getClass();
        c1554y1.m4946a(abstractC1534u0M4873l.getClass()).mo4764a(abstractC1534u0M4873l, abstractC1534u0);
        this.f6114x = abstractC1534u0M4873l;
    }

    public final Object clone() {
        AbstractC1524s0 abstractC1524s0 = (AbstractC1524s0) this.f6113w.mo4573e(5);
        abstractC1524s0.f6114x = m4814b();
        return abstractC1524s0;
    }
}
