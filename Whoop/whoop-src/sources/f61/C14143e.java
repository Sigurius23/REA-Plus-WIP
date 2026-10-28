package f61;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import g61.C15529b;
import h01.AbstractC16549p;
import h01.AbstractC16559z;
import h01.C16534a0;
import h01.C16550q;
import i61.InterfaceC18153b;
import k01.AbstractC22092d;
import k01.C22093e;
import k71.AbstractC22253j;
import k71.C22256m;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p026b2.InterfaceC2302h;
import p163g1.AbstractC14983d3;
import p291l0.AbstractC22953f;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: f61.e */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14143e implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f50922E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f50923F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f50924G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f50925w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f50926x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f50927y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f50928z;

    public /* synthetic */ C14143e(int i13, int i14, int i15, Object obj, Object obj2, InterfaceC23459e interfaceC23459e, boolean z4) {
        this.f50925w = i15;
        this.f50922E = obj;
        this.f50923F = obj2;
        this.f50926x = z4;
        this.f50924G = interfaceC23459e;
        this.f50927y = i13;
        this.f50928z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f50925w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return C14147i.m40310y((C14147i) this.f50922E, (InterfaceC18153b) this.f50923F, (C15529b) this.f50924G, this.f50926x, this.f50927y, this.f50928z, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                AbstractC14983d3.m43104a((InterfaceC4339a) this.f50922E, (Modifier) this.f50923F, this.f50926x, (InterfaceC4351m) this.f50924G, (Composer) obj, AbstractC28683x.m87244L(this.f50927y | 1), this.f50928z);
                return C23454a0.f92919a;
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC16549p.m46759M((Modifier) this.f50922E, (C16550q) this.f50923F, this.f50926x, (Function1) this.f50924G, this.f50927y, this.f50928z, (Composer) obj, iIntValue2);
            case 3:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC16559z.m46877s((Modifier) this.f50922E, (C16534a0) this.f50923F, this.f50926x, (Function1) this.f50924G, this.f50927y, this.f50928z, (Composer) obj, iIntValue3);
            case 4:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC22092d.m63192r((Modifier) this.f50922E, (C22093e) this.f50923F, this.f50926x, (Function1) this.f50924G, this.f50927y, this.f50928z, (Composer) obj, iIntValue4);
            case 5:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC22253j.m63815A((Modifier) this.f50922E, (C22256m) this.f50923F, this.f50926x, (Function1) this.f50924G, this.f50927y, this.f50928z, (Composer) obj, iIntValue5);
            default:
                ((Integer) obj2).getClass();
                AbstractC22953f.m66714a((Modifier) this.f50922E, (InterfaceC2302h) this.f50923F, this.f50926x, (Function3) this.f50924G, (Composer) obj, AbstractC28683x.m87244L(this.f50927y | 1), this.f50928z);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C14143e(C14147i c14147i, InterfaceC18153b interfaceC18153b, C15529b c15529b, boolean z4, int i13, int i14) {
        this.f50925w = 0;
        this.f50922E = c14147i;
        this.f50923F = interfaceC18153b;
        this.f50924G = c15529b;
        this.f50926x = z4;
        this.f50927y = i13;
        this.f50928z = i14;
    }
}
