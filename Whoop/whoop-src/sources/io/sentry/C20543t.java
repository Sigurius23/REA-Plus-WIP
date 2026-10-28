package io.sentry;

/* JADX INFO: renamed from: io.sentry.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C20543t implements InterfaceC20317e1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f76997a = new ThreadLocal();

    @Override // io.sentry.InterfaceC20317e1
    /* JADX INFO: renamed from: a */
    public final InterfaceC20368i1 mo56473a(InterfaceC20308d1 interfaceC20308d1) {
        InterfaceC20308d1 interfaceC20308d2 = get();
        f76997a.set(interfaceC20308d1);
        return new C20535s(interfaceC20308d2, 0);
    }

    @Override // io.sentry.InterfaceC20317e1
    public final void close() {
        f76997a.remove();
    }

    @Override // io.sentry.InterfaceC20317e1
    public final InterfaceC20308d1 get() {
        return (InterfaceC20308d1) f76997a.get();
    }
}
