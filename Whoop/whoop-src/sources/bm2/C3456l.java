package bm2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import cm2.C4820h;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: bm2.l */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3456l implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13556w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f13557x;

    public /* synthetic */ C3456l(Object obj, int i13) {
        this.f13556w = i13;
        this.f13557x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13556w) {
            case 0:
                return AbstractC3459m.m10144l((C3462n) this.f13557x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC3436e0.m10016t0((InterfaceC28601c1) this.f13557x, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            default:
                return AbstractC3442g0.m10057m((C4820h) this.f13557x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
