package vy0;

import c93.InterfaceC4339a;
import p077d0.C11421z1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: vy0.t */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36592t implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f156749w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f156750x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11421z1 f156751y;

    public /* synthetic */ C36592t(Function1 function1, C11421z1 c11421z1, int i13) {
        this.f156749w = i13;
        this.f156750x = function1;
        this.f156751y = c11421z1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f156749w) {
            case 0:
                return AbstractC36596x.m117533w(this.f156750x, this.f156751y);
            default:
                return AbstractC36596x.m117532v(this.f156750x, this.f156751y);
        }
    }
}
