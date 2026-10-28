package p499t9;

/* JADX INFO: renamed from: t9.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C33622c implements InterfaceC33627e0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC33626e f140350a;

    /* JADX INFO: renamed from: b */
    public final long f140351b;

    /* JADX INFO: renamed from: c */
    public final long f140352c;

    /* JADX INFO: renamed from: d */
    public final long f140353d;

    /* JADX INFO: renamed from: e */
    public final long f140354e;

    /* JADX INFO: renamed from: f */
    public final long f140355f;

    public C33622c(InterfaceC33626e interfaceC33626e, long j7, long j13, long j14, long j15, long j16) {
        this.f140350a = interfaceC33626e;
        this.f140351b = j7;
        this.f140352c = j13;
        this.f140353d = j14;
        this.f140354e = j15;
        this.f140355f = j16;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: c */
    public final C33625d0 mo8456c(long j7) {
        C33629f0 c33629f0 = new C33629f0(j7, C33624d.m106247a(this.f140350a.mo79414d(j7), 0L, this.f140352c, this.f140353d, this.f140354e, this.f140355f));
        return new C33625d0(c33629f0, c33629f0);
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: e */
    public final boolean mo8509e() {
        return true;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: f */
    public final long mo8510f() {
        return this.f140351b;
    }
}
