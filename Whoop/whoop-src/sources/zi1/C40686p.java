package zi1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import yi1.C39575i;

/* JADX INFO: renamed from: zi1.p */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C40686p implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f175596w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39575i f175597x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f175598y;

    public /* synthetic */ C40686p(C39575i c39575i, int i13, int i14) {
        this.f175596w = i14;
        this.f175597x = c39575i;
        this.f175598y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f175596w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC40687q.m132111n(this.f175597x, this.f175598y, composer, iIntValue);
            default:
                return AbstractC40687q.m132113p(this.f175597x, this.f175598y, composer, iIntValue);
        }
    }
}
