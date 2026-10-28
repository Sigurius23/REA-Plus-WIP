package zd3;

/* JADX INFO: renamed from: zd3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C40565i implements InterfaceC40578v {

    /* JADX INFO: renamed from: a */
    public final C40577u f174691a;

    public C40565i(Throwable th3) {
        this.f174691a = new C40577u(this, null, th3, 2);
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: a */
    public final C40572p mo131522a() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: b */
    public final boolean mo131523b() {
        return false;
    }

    @Override // zd3.InterfaceC40578v, ae3.InterfaceC0798f
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: d */
    public final C40577u mo131524d() {
        return this.f174691a;
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: f */
    public final InterfaceC40578v mo131525f() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: g */
    public final C40577u mo131526g() {
        return this.f174691a;
    }
}
