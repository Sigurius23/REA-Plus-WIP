package uy;

import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import hc3.AbstractC17182o;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import p499t9.C33623c0;
import s93.AbstractC32309k;
import v03.InterfaceC35517d;

/* JADX INFO: renamed from: uy.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C35373a implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f150673w;

    /* JADX INFO: renamed from: x */
    public final C33623c0 f150674x;

    public /* synthetic */ C35373a(C33623c0 c33623c0, int i13) {
        this.f150673w = i13;
        this.f150674x = c33623c0;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        int i13 = this.f150673w;
        C33623c0 c33623c0 = this.f150674x;
        switch (i13) {
            case 0:
                c33623c0.getClass();
                C22365e c22365e = AbstractC3050q0.f12077a;
                AbstractC3069w1 abstractC3069w1 = AbstractC17182o.f65999a;
                AbstractC32309k.m100574c(abstractC3069w1);
                return abstractC3069w1;
            default:
                c33623c0.getClass();
                C22365e c22365e2 = AbstractC3050q0.f12077a;
                ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                AbstractC32309k.m100574c(executorC22364d);
                return executorC22364d;
        }
    }
}
