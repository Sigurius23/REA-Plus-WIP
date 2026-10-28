package ev2;

import c93.InterfaceC4339a;
import l83.C23465k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: ev2.h */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13699h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48535w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function3 f48536x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23465k f48537y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f48538z;

    public /* synthetic */ C13699h(Function3 function3, C23465k c23465k, Function1 function1, int i13) {
        this.f48535w = i13;
        this.f48536x = function3;
        this.f48537y = c23465k;
        this.f48538z = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f48535w) {
            case 0:
                return AbstractC13705n.m38679H(this.f48536x, this.f48537y, this.f48538z);
            default:
                return AbstractC13712u.m38728E0(this.f48536x, this.f48537y, this.f48538z);
        }
    }
}
