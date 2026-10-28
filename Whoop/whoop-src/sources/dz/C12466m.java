package dz;

import a30.C0279c;
import a33.C0352d;
import b20.C2326f;
import b20.C2327g;
import bc3.AbstractC3050q0;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p664yy.AbstractC39851c;
import p664yy.C39865j;
import s93.AbstractC32309k;
import v03.InterfaceC35517d;

/* JADX INFO: renamed from: dz.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C12466m implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42542w = 1;

    /* JADX INFO: renamed from: x */
    public final C0279c f42543x;

    /* JADX INFO: renamed from: y */
    public final C2327g f42544y;

    public C12466m(C0279c c0279c, C2327g c2327g) {
        this.f42543x = c0279c;
        this.f42544y = c2327g;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        int i13 = this.f42542w;
        C2327g c2327g = this.f42544y;
        C0279c c0279c = this.f42543x;
        switch (i13) {
            case 0:
                C39865j c39865j = (C39865j) c2327g.get();
                AbstractC39851c abstractC39851c = (AbstractC39851c) c0279c.get();
                C22365e c22365e = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                AbstractC32309k.m100574c(executorC22364d);
                return new C0352d(c39865j, abstractC39851c, executorC22364d);
            default:
                return new C2326f((C39865j) c2327g.get(), (AbstractC39851c) c0279c.get());
        }
    }

    public C12466m(C2327g c2327g, C0279c c0279c) {
        this.f42544y = c2327g;
        this.f42543x = c0279c;
    }
}
