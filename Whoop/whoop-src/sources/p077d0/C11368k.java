package p077d0;

import c93.InterfaceC4339a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;

/* JADX INFO: renamed from: d0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C11368k {

    /* JADX INFO: renamed from: a */
    public final C11351f2 f36436a;

    /* JADX INFO: renamed from: b */
    public final Object f36437b;

    /* JADX INFO: renamed from: c */
    public final long f36438c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC4339a f36439d;

    /* JADX INFO: renamed from: e */
    public final C28633k1 f36440e;

    /* JADX INFO: renamed from: f */
    public AbstractC11395r f36441f;

    /* JADX INFO: renamed from: g */
    public long f36442g;

    /* JADX INFO: renamed from: h */
    public long f36443h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    public final C28633k1 f36444i = AbstractC28683x.m87272z(Boolean.TRUE);

    public C11368k(Object obj, C11351f2 c11351f2, AbstractC11395r abstractC11395r, long j7, Object obj2, long j13, InterfaceC4339a interfaceC4339a) {
        this.f36436a = c11351f2;
        this.f36437b = obj2;
        this.f36438c = j13;
        this.f36439d = interfaceC4339a;
        this.f36440e = AbstractC28683x.m87272z(obj);
        this.f36441f = AbstractC11348f.m30564l(abstractC11395r);
        this.f36442g = j7;
    }

    /* JADX INFO: renamed from: a */
    public final void m30599a() {
        this.f36444i.setValue(Boolean.FALSE);
        this.f36439d.invoke();
    }

    /* JADX INFO: renamed from: b */
    public final Object m30600b() {
        return this.f36436a.f36397b.invoke(this.f36441f);
    }
}
