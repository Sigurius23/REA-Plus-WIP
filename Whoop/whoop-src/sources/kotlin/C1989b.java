package kotlin;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: at2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C1989b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7868w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f7869x;

    public /* synthetic */ C1989b(InterfaceC4339a interfaceC4339a, int i13) {
        this.f7868w = i13;
        this.f7869x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f7868w) {
            case 0:
                return Function0.m6120l(this.f7869x);
            case 1:
                return Function0.m6121m(this.f7869x);
            case 2:
                return Function0.m6122n(this.f7869x);
            case 3:
                return AbstractC2016m.m6269o0(this.f7869x);
            case 4:
                return AbstractC2016m.m6275r0(this.f7869x);
            default:
                return AbstractC2016m.m6287x0(this.f7869x);
        }
    }
}
