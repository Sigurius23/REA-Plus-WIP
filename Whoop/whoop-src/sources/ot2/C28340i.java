package ot2;

import jt2.C21942d;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: ot2.i */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C28340i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114301w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21942d f114302x;

    public /* synthetic */ C28340i(C21942d c21942d, int i13) {
        this.f114301w = i13;
        this.f114302x = c21942d;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zM85927e;
        switch (this.f114301w) {
            case 0:
                zM85927e = C28341j.m85927e(this.f114302x, (InterfaceC25312u) obj);
                break;
            default:
                zM85927e = C28342k.m85936f(this.f114302x, (InterfaceC25312u) obj);
                break;
        }
        return Boolean.valueOf(zM85927e);
    }
}
