package uu2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: uu2.i */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C35255i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f149973w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35258j0 f149974x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f149975y;

    public /* synthetic */ C35255i(C35258j0 c35258j0, Function1 function1, int i13) {
        this.f149973w = i13;
        this.f149974x = c35258j0;
        this.f149975y = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f149973w) {
            case 0:
                return AbstractC35261l.m111780Y(this.f149974x, this.f149975y);
            case 1:
                return AbstractC35261l.m111781Z(this.f149974x, this.f149975y);
            case 2:
                return AbstractC35261l.m111783a0(this.f149974x, this.f149975y);
            case 3:
                return AbstractC35272w.m111871F(this.f149974x, this.f149975y);
            case 4:
                return AbstractC35272w.m111872G(this.f149974x, this.f149975y);
            default:
                return AbstractC35272w.m111873H(this.f149974x, this.f149975y);
        }
    }
}
