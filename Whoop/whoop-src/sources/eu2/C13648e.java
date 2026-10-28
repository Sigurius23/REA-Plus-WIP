package eu2;

import c93.InterfaceC4351m;
import ln1.AbstractC24533k;
import p668z1.C39967p;
import p711j31.C21273d;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: eu2.e */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13648e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48352w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39967p f48353x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f48354y;

    public /* synthetic */ C13648e(int i13, Function1 function1, C39967p c39967p) {
        this.f48352w = i13;
        this.f48353x = c39967p;
        this.f48354y = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C21273d c21273d = (C21273d) obj;
        C21273d c21273d2 = (C21273d) obj2;
        switch (this.f48352w) {
            case 0:
                return AbstractC13650g.m38465m(this.f48353x, this.f48354y, c21273d, c21273d2);
            default:
                return AbstractC24533k.m71460n(this.f48353x, 1, this.f48354y, c21273d, c21273d2);
        }
    }
}
