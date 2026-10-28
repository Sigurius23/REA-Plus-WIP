package p707gt1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ft1.InterfaceC14770c;

/* JADX INFO: renamed from: gt1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16190d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f61493w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC14770c.g f61494x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f61495y;

    public /* synthetic */ C16190d(InterfaceC14770c.g gVar, int i13, int i14) {
        this.f61493w = i14;
        this.f61494x = gVar;
        this.f61495y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f61493w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC16191e.m45764c(this.f61494x, this.f61495y, composer, iIntValue);
            default:
                return AbstractC16192f.m45769e(this.f61494x, this.f61495y, composer, iIntValue);
        }
    }
}
