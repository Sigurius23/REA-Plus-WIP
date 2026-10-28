package js1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import h11.C16613h;

/* JADX INFO: renamed from: js1.c */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C21912c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84643w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16613h f84644x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f84645y;

    public /* synthetic */ C21912c(C16613h c16613h, int i13, int i14) {
        this.f84643w = i14;
        this.f84644x = c16613h;
        this.f84645y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f84643w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC21914e.m62349n(this.f84644x, this.f84645y, composer, iIntValue);
            default:
                return AbstractC21914e.m62347l(this.f84644x, this.f84645y, composer, iIntValue);
        }
    }
}
