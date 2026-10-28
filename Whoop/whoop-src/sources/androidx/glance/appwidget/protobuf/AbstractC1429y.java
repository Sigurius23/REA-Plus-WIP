package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1429y implements Cloneable {

    /* JADX INFO: renamed from: w */
    public final AbstractC1368a0 f5991w;

    /* JADX INFO: renamed from: x */
    public AbstractC1368a0 f5992x;

    public AbstractC1429y(AbstractC1368a0 abstractC1368a0) {
        this.f5991w = abstractC1368a0;
        if (abstractC1368a0.m4276h()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5992x = abstractC1368a0.m4278j();
    }

    /* JADX INFO: renamed from: d */
    public static void m4551d(Object obj, Object obj2) {
        C1430y0 c1430y0 = C1430y0.f5993c;
        c1430y0.getClass();
        c1430y0.m4555a(obj.getClass()).mo4287a(obj, obj2);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1368a0 m4552a() {
        AbstractC1368a0 abstractC1368a0M4553b = m4553b();
        abstractC1368a0M4553b.getClass();
        if (AbstractC1368a0.m4272g(abstractC1368a0M4553b, true)) {
            return abstractC1368a0M4553b;
        }
        throw new UninitializedMessageException();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1368a0 m4553b() {
        if (!this.f5992x.m4276h()) {
            return this.f5992x;
        }
        AbstractC1368a0 abstractC1368a0 = this.f5992x;
        abstractC1368a0.getClass();
        C1430y0 c1430y0 = C1430y0.f5993c;
        c1430y0.getClass();
        c1430y0.m4555a(abstractC1368a0.getClass()).mo4288b(abstractC1368a0);
        abstractC1368a0.m4277i();
        return this.f5992x;
    }

    /* JADX INFO: renamed from: c */
    public final void m4554c() {
        if (this.f5992x.m4276h()) {
            return;
        }
        AbstractC1368a0 abstractC1368a0M4278j = this.f5991w.m4278j();
        m4551d(abstractC1368a0M4278j, this.f5992x);
        this.f5992x = abstractC1368a0M4278j;
    }

    public final Object clone() {
        AbstractC1429y abstractC1429y = (AbstractC1429y) this.f5991w.mo4275d(5);
        abstractC1429y.f5992x = m4553b();
        return abstractC1429y;
    }
}
