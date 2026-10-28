package mf0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p292l1.InterfaceC23098g1;
import s80.AbstractC32255c;

/* JADX INFO: renamed from: mf0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C25503b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f99862E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f99863w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23098g1 f99864x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f99865y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f99866z;

    public /* synthetic */ C25503b(InterfaceC23098g1 interfaceC23098g1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14) {
        this.f99863w = i14;
        this.f99864x = interfaceC23098g1;
        this.f99865y = interfaceC4339a;
        this.f99866z = interfaceC4339a2;
        this.f99862E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f99863w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC25506e.m74967p0(this.f99864x, this.f99865y, this.f99866z, this.f99862E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC32255c.m100376x(this.f99864x, this.f99865y, this.f99866z, this.f99862E, (Composer) obj, iIntValue2);
        }
    }
}
