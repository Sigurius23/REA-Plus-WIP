package p132f0;

import c93.InterfaceC4339a;
import wm1.AbstractC37389k;

/* JADX INFO: renamed from: f0.p1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C13815p1 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49290w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13821r1 f49291x;

    public /* synthetic */ C13815p1(C13821r1 c13821r1, int i13) {
        this.f49290w = i13;
        this.f49291x = c13821r1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f49290w) {
            case 0:
                C13821r1 c13821r1 = this.f49291x;
                return Boolean.valueOf(c13821r1.f49318a.m87024x() < c13821r1.f49321d.m87024x());
            case 1:
                return Boolean.valueOf(this.f49291x.f49318a.m87024x() > 0);
            case 2:
                return Boolean.valueOf(AbstractC37389k.m119704L(this.f49291x));
            default:
                return AbstractC37389k.m119706N(this.f49291x);
        }
    }
}
