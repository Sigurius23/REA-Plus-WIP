package q81;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: q81.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C30046d implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122639w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ EnumC30051i f122640x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f122641y;

    public /* synthetic */ C30046d(EnumC30051i enumC30051i, int i13, int i14) {
        this.f122639w = i14;
        this.f122640x = enumC30051i;
        this.f122641y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f122639w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC30049g.m92051t(this.f122640x, this.f122641y, composer, iIntValue);
            default:
                return AbstractC30049g.m92057z(this.f122640x, this.f122641y, composer, iIntValue);
        }
    }
}
