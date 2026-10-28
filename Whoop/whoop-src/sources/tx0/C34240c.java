package tx0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import v41.InterfaceC35689r0;

/* JADX INFO: renamed from: tx0.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C34240c implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f143621w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC35689r0 f143622x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f143623y;

    public /* synthetic */ C34240c(InterfaceC35689r0 interfaceC35689r0, int i13, int i14) {
        this.f143621w = i14;
        this.f143622x = interfaceC35689r0;
        this.f143623y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f143621w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC34241d.m108251C(this.f143622x, this.f143623y, composer, iIntValue);
            default:
                return AbstractC34241d.m108275x(this.f143622x, this.f143623y, composer, iIntValue);
        }
    }
}
