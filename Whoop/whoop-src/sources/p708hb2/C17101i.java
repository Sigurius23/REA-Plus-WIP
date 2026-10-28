package p708hb2;

import c93.InterfaceC4339a;
import lf0.AbstractC23899b0;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: hb2.i */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C17101i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65701w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f65702x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f65703y;

    public /* synthetic */ C17101i(InterfaceC28601c1 interfaceC28601c1, int i13, int i14) {
        this.f65701w = i14;
        this.f65702x = i13;
        this.f65703y = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f65701w) {
            case 0:
                return AbstractC42784j.m48339o(this.f65702x, this.f65703y);
            default:
                return AbstractC23899b0.m70231s(this.f65702x, this.f65703y);
        }
    }
}
