package rm0;

import c93.InterfaceC4339a;
import u82.InterfaceC34640a;

/* JADX INFO: renamed from: rm0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C31584b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130522w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC34640a f130523x;

    public /* synthetic */ C31584b(InterfaceC34640a interfaceC34640a, int i13) {
        this.f130522w = i13;
        this.f130523x = interfaceC34640a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f130522w) {
            case 0:
                return C31585c.m97328N(this.f130523x);
            case 1:
                return C31585c.m97329O(this.f130523x);
            default:
                return C31585c.m97319E(this.f130523x);
        }
    }
}
