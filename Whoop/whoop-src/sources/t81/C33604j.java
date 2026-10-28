package t81;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import l83.C23465k;
import y11.AbstractC39054g;

/* JADX INFO: renamed from: t81.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33604j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f140211E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f140212F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f140213G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f140214H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140215w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f140216x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f140217y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f140218z;

    public /* synthetic */ C33604j(Modifier modifier, float f13, long j7, boolean z4, C23465k c23465k, int i13, int i14) {
        this.f140213G = modifier;
        this.f140216x = f13;
        this.f140217y = j7;
        this.f140218z = z4;
        this.f140214H = c23465k;
        this.f140211E = i13;
        this.f140212F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f140215w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33606l.m106165p(this.f140218z, (C33612r) this.f140213G, this.f140216x, this.f140211E, this.f140217y, (InterfaceC4352n) this.f140214H, this.f140212F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC39054g.m124502c((Modifier) this.f140213G, this.f140216x, this.f140217y, this.f140218z, (C23465k) this.f140214H, this.f140211E, this.f140212F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C33604j(boolean z4, C33612r c33612r, float f13, int i13, long j7, InterfaceC4352n interfaceC4352n, int i14) {
        this.f140218z = z4;
        this.f140213G = c33612r;
        this.f140216x = f13;
        this.f140211E = i13;
        this.f140217y = j7;
        this.f140214H = interfaceC4352n;
        this.f140212F = i14;
    }
}
