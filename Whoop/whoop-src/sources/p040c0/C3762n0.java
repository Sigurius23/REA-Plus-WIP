package p040c0;

import c93.InterfaceC4339a;
import p077d0.C11421z1;

/* JADX INFO: renamed from: c0.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3762n0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15369w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11421z1 f15370x;

    public /* synthetic */ C3762n0(C11421z1 c11421z1, int i13) {
        this.f15369w = i13;
        this.f15370x = c11421z1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f15369w) {
            case 0:
                return this.f15370x.f36633d.getValue();
            default:
                return this.f15370x.m30664f();
        }
    }
}
