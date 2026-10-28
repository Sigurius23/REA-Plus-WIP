package p077d0;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d0.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11390p1 implements InterfaceC11356h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11355g2 f36520a;

    /* JADX INFO: renamed from: b */
    public final C11351f2 f36521b;

    /* JADX INFO: renamed from: c */
    public Object f36522c;

    /* JADX INFO: renamed from: d */
    public Object f36523d;

    /* JADX INFO: renamed from: e */
    public AbstractC11395r f36524e;

    /* JADX INFO: renamed from: f */
    public AbstractC11395r f36525f;

    /* JADX INFO: renamed from: g */
    public final AbstractC11395r f36526g;

    /* JADX INFO: renamed from: h */
    public long f36527h;

    /* JADX INFO: renamed from: i */
    public AbstractC11395r f36528i;

    public C11390p1(InterfaceC11372l interfaceC11372l, C11351f2 c11351f2, Object obj, Object obj2, AbstractC11395r abstractC11395r) {
        this.f36520a = interfaceC11372l.mo30534a(c11351f2);
        this.f36521b = c11351f2;
        this.f36522c = obj2;
        this.f36523d = obj;
        this.f36524e = (AbstractC11395r) c11351f2.f36396a.invoke(obj);
        Function1 function1 = c11351f2.f36396a;
        this.f36525f = (AbstractC11395r) function1.invoke(obj2);
        this.f36526g = abstractC11395r != null ? AbstractC11348f.m30564l(abstractC11395r) : ((AbstractC11395r) function1.invoke(obj)).mo30609c();
        this.f36527h = -1L;
    }

    @Override // p077d0.InterfaceC11356h
    /* JADX INFO: renamed from: a */
    public final boolean mo30591a() {
        return this.f36520a.mo2317a();
    }

    @Override // p077d0.InterfaceC11356h
    /* JADX INFO: renamed from: b */
    public final AbstractC11395r mo30592b(long j7) {
        if (!m30593c(j7)) {
            return this.f36520a.mo2205m(j7, this.f36524e, this.f36525f, this.f36526g);
        }
        AbstractC11395r abstractC11395r = this.f36528i;
        if (abstractC11395r != null) {
            return abstractC11395r;
        }
        AbstractC11395r abstractC11395rMo2322f = this.f36520a.mo2322f(this.f36524e, this.f36525f, this.f36526g);
        this.f36528i = abstractC11395rMo2322f;
        return abstractC11395rMo2322f;
    }

    @Override // p077d0.InterfaceC11356h
    /* JADX INFO: renamed from: d */
    public final long mo30594d() {
        if (this.f36527h < 0) {
            this.f36527h = this.f36520a.mo2197c(this.f36524e, this.f36525f, this.f36526g);
        }
        return this.f36527h;
    }

    @Override // p077d0.InterfaceC11356h
    /* JADX INFO: renamed from: e */
    public final C11351f2 mo30595e() {
        return this.f36521b;
    }

    @Override // p077d0.InterfaceC11356h
    /* JADX INFO: renamed from: f */
    public final Object mo30596f(long j7) {
        if (m30593c(j7)) {
            return this.f36522c;
        }
        AbstractC11395r abstractC11395rMo2202h = this.f36520a.mo2202h(j7, this.f36524e, this.f36525f, this.f36526g);
        int iMo30608b = abstractC11395rMo2202h.mo30608b();
        for (int i13 = 0; i13 < iMo30608b; i13++) {
            if (Float.isNaN(abstractC11395rMo2202h.mo30607a(i13))) {
                AbstractC11405u0.m30639b("AnimationVector cannot contain a NaN. " + abstractC11395rMo2202h + ". Animation: " + this + ", playTimeNanos: " + j7);
            }
        }
        return this.f36521b.f36397b.invoke(abstractC11395rMo2202h);
    }

    @Override // p077d0.InterfaceC11356h
    /* JADX INFO: renamed from: g */
    public final Object mo30597g() {
        return this.f36522c;
    }

    /* JADX INFO: renamed from: h */
    public final void m30625h(Object obj) {
        if (AbstractC22676k.m65745e(obj, this.f36523d)) {
            return;
        }
        this.f36523d = obj;
        this.f36524e = (AbstractC11395r) this.f36521b.f36396a.invoke(obj);
        this.f36528i = null;
        this.f36527h = -1L;
    }

    /* JADX INFO: renamed from: i */
    public final void m30626i(Object obj) {
        if (AbstractC22676k.m65745e(this.f36522c, obj)) {
            return;
        }
        this.f36522c = obj;
        this.f36525f = (AbstractC11395r) this.f36521b.f36396a.invoke(obj);
        this.f36528i = null;
        this.f36527h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.f36523d + " -> " + this.f36522c + ",initial velocity: " + this.f36526g + ", duration: " + (mo30594d() / 1000000) + " ms,animationSpec: " + this.f36520a;
    }
}
