package rq2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: rq2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31717c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131401w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31713a f131402x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f131403y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f131404z;

    public /* synthetic */ C31717c(C31713a c31713a, boolean z4, int i13, int i14) {
        this.f131401w = i14;
        this.f131402x = c31713a;
        this.f131403y = z4;
        this.f131404z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f131401w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC31719d.m98426h(this.f131402x, this.f131403y, this.f131404z, composer, iIntValue);
            default:
                return AbstractC31721e.m98436f(this.f131402x, this.f131403y, this.f131404z, composer, iIntValue);
        }
    }
}
