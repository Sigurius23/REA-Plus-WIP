package p239j1;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: j1.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21185c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80728w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C21194l f80729x;

    public /* synthetic */ C21185c(C21194l c21194l, int i13) {
        this.f80728w = i13;
        this.f80729x = c21194l;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f80728w) {
            case 0:
                C21194l c21194l = this.f80729x;
                return Float.valueOf(c21194l.m59426a() / c21194l.f80762g.m87022x() < 1.0f ? 0.3f : 1.0f);
            default:
                return Float.valueOf(this.f80729x.f80761f.m87022x() * 0.5f);
        }
    }
}
