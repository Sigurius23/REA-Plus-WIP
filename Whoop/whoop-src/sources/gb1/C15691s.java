package gb1;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: gb1.s */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15691s implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58916w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28670t2 f58917x;

    public /* synthetic */ C15691s(InterfaceC28670t2 interfaceC28670t2, int i13) {
        this.f58916w = i13;
        this.f58917x = interfaceC28670t2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f58916w) {
            case 0:
                return Boolean.valueOf(AbstractC15689q.c.m44151h(this.f58917x));
            default:
                return Float.valueOf(AbstractC15695w.m44166i(this.f58917x));
        }
    }
}
