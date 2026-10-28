package js1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import h11.C16613h;

/* JADX INFO: renamed from: js1.b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21911b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f84640w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16613h f84641x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f84642y;

    public /* synthetic */ C21911b(C16613h c16613h, int i13, int i14) {
        this.f84640w = i14;
        this.f84641x = c16613h;
        this.f84642y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f84640w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC21914e.m62353r(this.f84641x, this.f84642y, composer, iIntValue);
            default:
                return AbstractC21914e.m62345j(this.f84641x, this.f84642y, composer, iIntValue);
        }
    }
}
