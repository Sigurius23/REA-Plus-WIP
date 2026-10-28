package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1265x implements Cloneable {

    /* JADX INFO: renamed from: w */
    public final AbstractC1269z f5505w;

    /* JADX INFO: renamed from: x */
    public AbstractC1269z f5506x;

    public AbstractC1265x(AbstractC1269z abstractC1269z) {
        this.f5505w = abstractC1269z;
        if (abstractC1269z.m4025g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5506x = abstractC1269z.m4027i();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1269z m4013a() {
        AbstractC1269z abstractC1269zM4014b = m4014b();
        abstractC1269zM4014b.getClass();
        if (AbstractC1269z.m4022f(abstractC1269zM4014b, true)) {
            return abstractC1269zM4014b;
        }
        throw new UninitializedMessageException();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1269z m4014b() {
        if (!this.f5506x.m4025g()) {
            return this.f5506x;
        }
        AbstractC1269z abstractC1269z = this.f5506x;
        abstractC1269z.getClass();
        C1264w0 c1264w0 = C1264w0.f5502c;
        c1264w0.getClass();
        c1264w0.m4012a(abstractC1269z.getClass()).mo3989b(abstractC1269z);
        abstractC1269z.m4026h();
        return this.f5506x;
    }

    /* JADX INFO: renamed from: c */
    public final void m4015c() {
        if (this.f5506x.m4025g()) {
            return;
        }
        AbstractC1269z abstractC1269zM4027i = this.f5505w.m4027i();
        AbstractC1269z abstractC1269z = this.f5506x;
        C1264w0 c1264w0 = C1264w0.f5502c;
        c1264w0.getClass();
        c1264w0.m4012a(abstractC1269zM4027i.getClass()).mo3988a(abstractC1269zM4027i, abstractC1269z);
        this.f5506x = abstractC1269zM4027i;
    }

    public final Object clone() {
        AbstractC1265x abstractC1265x = (AbstractC1265x) this.f5505w.mo4024c(5);
        abstractC1265x.f5506x = m4014b();
        return abstractC1265x;
    }
}
