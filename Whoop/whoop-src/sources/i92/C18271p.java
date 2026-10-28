package i92;

/* JADX INFO: renamed from: i92.p */
/* JADX INFO: loaded from: classes4.dex */
class C18271p extends RuntimeException {

    /* JADX INFO: renamed from: w */
    private boolean f71117w;

    public C18271p() {
        this("Web Exception Tracer");
    }

    /* JADX INFO: renamed from: a */
    public C18271p m52635a(Throwable th3) {
        if (this.f71117w) {
            C18271p c18271p = new C18271p(getMessage());
            c18271p.setStackTrace(getStackTrace());
            return c18271p.m52635a(th3);
        }
        this.f71117w = true;
        initCause(th3);
        return this;
    }

    public C18271p(String str) {
        super(str);
        this.f71117w = false;
    }
}
