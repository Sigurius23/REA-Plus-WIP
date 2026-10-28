package u01;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;

/* JADX INFO: renamed from: u01.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C34381c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144477w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C34384f f144478x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f144479y;

    public /* synthetic */ C34381c(C34384f c34384f, int i13, int i14) {
        this.f144477w = i14;
        this.f144478x = c34384f;
        this.f144479y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f144477w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC34382d.m108704u(this.f144478x, this.f144479y, composer, iIntValue);
            default:
                return AbstractC34382d.m108706w(this.f144478x, this.f144479y, composer, iIntValue);
        }
    }
}
