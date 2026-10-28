package sc2;

import bh3.InterfaceC3255b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: sc2.q */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C32378q implements InterfaceC3255b {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f133992w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f133993x;

    public /* synthetic */ C32378q(Function1 function1, int i13) {
        this.f133992w = i13;
        this.f133993x = function1;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        switch (this.f133992w) {
            case 0:
                C32380s.m100839M0((C32381t) this.f133993x, obj);
                break;
            case 1:
                C32380s.m100865a1((C32381t) this.f133993x, obj);
                break;
            default:
                C32380s.m100832I0((C32381t) this.f133993x, obj);
                break;
        }
    }
}
