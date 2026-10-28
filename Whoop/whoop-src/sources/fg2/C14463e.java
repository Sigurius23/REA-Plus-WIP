package fg2;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import yb0.AbstractC39388k;
import zv2.AbstractC41172h;

/* JADX INFO: renamed from: fg2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C14463e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f52798E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f52799F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52800w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f52801x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f52802y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f52803z;

    public /* synthetic */ C14463e(int i13, int i14, int i15, Modifier modifier, InterfaceC4339a interfaceC4339a, String str) {
        this.f52800w = i15;
        this.f52803z = modifier;
        this.f52801x = str;
        this.f52802y = interfaceC4339a;
        this.f52798E = i13;
        this.f52799F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52800w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC14464f.m41228g(this.f52803z, this.f52801x, this.f52802y, this.f52798E, this.f52799F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                Modifier modifier = this.f52803z;
                return AbstractC39388k.m125695a0(this.f52801x, this.f52802y, modifier, this.f52798E, this.f52799F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC41172h.m133819w(this.f52803z, this.f52801x, this.f52802y, this.f52798E, this.f52799F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C14463e(String str, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14) {
        this.f52800w = 1;
        this.f52801x = str;
        this.f52802y = interfaceC4339a;
        this.f52803z = modifier;
        this.f52798E = i13;
        this.f52799F = i14;
    }
}
