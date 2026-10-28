package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p026b2.AbstractC2316v;
import p208i2.C17920x0;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a3.q1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0243q1 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0258v f831E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f832F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ boolean f833G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ float f834H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ NodeCoordinator f835w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC2316v f836x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0193e f837y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f838z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0243q1(NodeCoordinator nodeCoordinator, AbstractC2316v abstractC2316v, C0193e c0193e, long j7, C0258v c0258v, int i13, boolean z4, float f13) {
        super(0);
        this.f835w = nodeCoordinator;
        this.f836x = abstractC2316v;
        this.f837y = c0193e;
        this.f838z = j7;
        this.f831E = c0258v;
        this.f832F = i13;
        this.f833G = z4;
        this.f834H = f13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        AbstractC2316v abstractC2316vM503c = AbstractC0201g.m503c(this.f836x, this.f837y.m476b());
        C17920x0 c17920x0 = NodeCoordinator.f4853k0;
        this.f835w.m3551u1(abstractC2316vM503c, this.f837y, this.f838z, this.f831E, this.f832F, this.f833G, this.f834H, false);
        return C23454a0.f92919a;
    }
}
