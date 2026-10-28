package zd3;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zd3.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C40575s implements InterfaceC40578v {

    /* JADX INFO: renamed from: a */
    public final C40572p f174763a;

    public C40575s(C40572p connection) {
        AbstractC22676k.m65750j(connection, "connection");
        this.f174763a = connection;
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: a */
    public final C40572p mo131522a() {
        return this.f174763a;
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: b */
    public final boolean mo131523b() {
        return true;
    }

    @Override // zd3.InterfaceC40578v, ae3.InterfaceC0798f
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: d */
    public final C40577u mo131524d() {
        throw new IllegalStateException("already connected");
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: f */
    public final InterfaceC40578v mo131525f() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // zd3.InterfaceC40578v
    /* JADX INFO: renamed from: g */
    public final C40577u mo131526g() {
        throw new IllegalStateException("already connected");
    }
}
