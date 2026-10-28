package p734sl0;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: sl0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32589c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135042w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC32647n2 f135043x;

    public /* synthetic */ C32589c(InterfaceC32647n2 interfaceC32647n2, int i13) {
        this.f135042w = i13;
        this.f135043x = interfaceC32647n2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f135042w) {
            case 0:
                return AbstractC32619i.m101809A(this.f135043x);
            case 1:
                return AbstractC32597d2.m101677F(this.f135043x);
            default:
                return AbstractC32597d2.m101679H(this.f135043x);
        }
    }
}
