package ev2;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: ev2.i */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13700i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48539w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function3 f48540x;

    public /* synthetic */ C13700i(int i13, Function3 function3) {
        this.f48539w = i13;
        this.f48540x = function3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f48539w) {
            case 0:
                return AbstractC13705n.m38674C(this.f48540x, (String) obj);
            default:
                return AbstractC13712u.m38838z0(this.f48540x, (String) obj);
        }
    }
}
