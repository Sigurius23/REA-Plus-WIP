package p684zk;

import p474s.C31983m2;
import p526ul.AbstractC35057c;
import p526ul.C35058d;
import p526ul.InterfaceC35056b;
import z40.C40062i;

/* JADX INFO: renamed from: zk.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C40800y implements InterfaceC40801z, InterfaceC35056b {

    /* JADX INFO: renamed from: E */
    public static final C31983m2 f175955E = AbstractC35057c.m110829a(20, new C40062i());

    /* JADX INFO: renamed from: w */
    public final C35058d f175956w = new C35058d();

    /* JADX INFO: renamed from: x */
    public InterfaceC40801z f175957x;

    /* JADX INFO: renamed from: y */
    public boolean f175958y;

    /* JADX INFO: renamed from: z */
    public boolean f175959z;

    @Override // p684zk.InterfaceC40801z
    /* JADX INFO: renamed from: a */
    public final synchronized void mo44996a() {
        this.f175956w.m110831b();
        this.f175959z = true;
        if (!this.f175958y) {
            this.f175957x.mo44996a();
            this.f175957x = null;
            f175955E.mo43683a(this);
        }
    }

    @Override // p526ul.InterfaceC35056b
    /* JADX INFO: renamed from: b */
    public final C35058d mo9724b() {
        return this.f175956w;
    }

    @Override // p684zk.InterfaceC40801z
    /* JADX INFO: renamed from: c */
    public final Class mo44997c() {
        return this.f175957x.mo44997c();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m132307d() {
        this.f175956w.m110831b();
        if (!this.f175958y) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f175958y = false;
        if (this.f175959z) {
            mo44996a();
        }
    }

    @Override // p684zk.InterfaceC40801z
    public final Object get() {
        return this.f175957x.get();
    }

    @Override // p684zk.InterfaceC40801z
    public final int getSize() {
        return this.f175957x.getSize();
    }
}
