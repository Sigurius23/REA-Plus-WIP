package wr0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: wr0.q */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C37548q implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160557w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC25312u f160558x;

    public /* synthetic */ C37548q(int i13, InterfaceC25312u interfaceC25312u) {
        this.f160557w = i13;
        this.f160558x = interfaceC25312u;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f160557w) {
            case 0:
                return AbstractC37552s.m120462o((C37554t) this.f160558x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC37523d0.m120330k((C37525e0) this.f160558x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
