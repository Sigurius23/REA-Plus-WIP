package kotlin;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p719m22.AbstractC42788s;
import p719m22.AbstractC42789u;
import p719m22.Function0;

/* JADX INFO: renamed from: at2.c */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C1992c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f7878E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f7879F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7880w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f7881x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f7882y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f7883z;

    public /* synthetic */ C1992c(InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, int i13, int i14, int i15) {
        this.f7880w = i15;
        this.f7881x = interfaceC4339a;
        this.f7882y = interfaceC4339a2;
        this.f7883z = interfaceC4339a3;
        this.f7878E = i13;
        this.f7879F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7880w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return Function0.m6123o(this.f7881x, this.f7882y, this.f7883z, this.f7878E, this.f7879F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return Function0.m73152o(this.f7881x, this.f7882y, this.f7883z, this.f7878E, this.f7879F, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC42788s.m73253y(this.f7881x, this.f7882y, this.f7883z, this.f7878E, this.f7879F, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC42789u.m73261A(this.f7881x, this.f7882y, this.f7883z, this.f7878E, this.f7879F, (Composer) obj, iIntValue4);
        }
    }
}
