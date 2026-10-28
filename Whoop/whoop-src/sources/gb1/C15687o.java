package gb1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p329n0.C26068u;
import p734sl0.AbstractC32650o0;

/* JADX INFO: renamed from: gb1.o */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C15687o implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58885w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26068u f58886x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f58887y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f58888z;

    public /* synthetic */ C15687o(C26068u c26068u, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f58885w = i14;
        this.f58886x = c26068u;
        this.f58887y = interfaceC4339a;
        this.f58888z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f58885w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC15689q.m44142j(this.f58886x, this.f58887y, this.f58888z, composer, iIntValue);
            default:
                return AbstractC32650o0.m102060K(this.f58886x, this.f58887y, this.f58888z, composer, iIntValue);
        }
    }
}
