package v03;

/* JADX INFO: renamed from: v03.b */
/* JADX INFO: loaded from: classes11.dex */
public final class C35515b implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public InterfaceC35521h f151132w;

    /* JADX INFO: renamed from: a */
    public static void m112676a(InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2) {
        C35515b c35515b = (C35515b) interfaceC35521h;
        if (c35515b.f151132w != null) {
            throw new IllegalStateException();
        }
        c35515b.f151132w = interfaceC35521h2;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        InterfaceC35521h interfaceC35521h = this.f151132w;
        if (interfaceC35521h != null) {
            return interfaceC35521h.get();
        }
        throw new IllegalStateException();
    }
}
