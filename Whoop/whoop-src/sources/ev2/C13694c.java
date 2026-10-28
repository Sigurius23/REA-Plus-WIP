package ev2;

import c93.InterfaceC4339a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ev2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13694c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48518w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f48519x;

    public /* synthetic */ C13694c(Function1 function1, int i13) {
        this.f48518w = i13;
        this.f48519x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f48518w) {
            case 0:
                return AbstractC13705n.m38676E(this.f48519x);
            case 1:
                return AbstractC13712u.m38769Z(this.f48519x);
            case 2:
                return AbstractC13712u.m38758T0(this.f48519x);
            case 3:
                return AbstractC13712u.m38722B0(this.f48519x);
            default:
                return AbstractC13712u.m38744M0(this.f48519x);
        }
    }
}
