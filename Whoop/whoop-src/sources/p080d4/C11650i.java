package p080d4;

/* JADX INFO: renamed from: d4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C11650i {

    /* JADX INFO: renamed from: a */
    public Object f37628a;

    /* JADX INFO: renamed from: b */
    public C11653l f37629b;

    /* JADX INFO: renamed from: c */
    public C11655n f37630c;

    /* JADX INFO: renamed from: d */
    public boolean f37631d;

    /* JADX INFO: renamed from: a */
    public final void m31068a(Object obj) {
        this.f37631d = true;
        C11653l c11653l = this.f37629b;
        if (c11653l == null || !c11653l.f37634x.m31066j(obj)) {
            return;
        }
        this.f37628a = null;
        this.f37629b = null;
        this.f37630c = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m31069b(Throwable th3) {
        this.f37631d = true;
        C11653l c11653l = this.f37629b;
        if (c11653l == null || !c11653l.f37634x.mo31067k(th3)) {
            return;
        }
        this.f37628a = null;
        this.f37629b = null;
        this.f37630c = null;
    }

    public final void finalize() {
        C11655n c11655n;
        C11653l c11653l = this.f37629b;
        if (c11653l != null) {
            C11652k c11652k = c11653l.f37634x;
            if (!c11652k.isDone()) {
                c11652k.mo31067k(new C11643b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f37628a, 1));
            }
        }
        if (this.f37631d || (c11655n = this.f37630c) == null) {
            return;
        }
        c11655n.m31066j(null);
    }
}
