package ev2;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import dv2.InterfaceC12394e;
import p163g1.C15199y3;
import p164g2.InterfaceC15237i;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: ev2.m */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13704m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC2994c0 f48560E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C15199y3 f48561F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC28601c1 f48562G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48563w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC12394e.b f48564x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function3 f48565y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC15237i f48566z;

    public /* synthetic */ C13704m(InterfaceC12394e.b bVar, Function3 function3, InterfaceC15237i interfaceC15237i, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, int i13) {
        this.f48563w = i13;
        this.f48564x = bVar;
        this.f48565y = function3;
        this.f48566z = interfaceC15237i;
        this.f48560E = interfaceC2994c0;
        this.f48561F = c15199y3;
        this.f48562G = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48563w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13705n.m38673B(this.f48564x, this.f48565y, this.f48566z, this.f48560E, this.f48561F, this.f48562G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC13712u.m38836y0(this.f48564x, this.f48565y, this.f48566z, this.f48560E, this.f48561F, this.f48562G, (Composer) obj, iIntValue2);
        }
    }
}
