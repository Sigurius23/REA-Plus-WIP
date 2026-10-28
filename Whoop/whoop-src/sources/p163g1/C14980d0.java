package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import p043c4.C3966j0;
import p132f0.C13821r1;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function3;
import p736sz0.AbstractC33200m1;
import p736sz0.C33182g1;

/* JADX INFO: renamed from: g1.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14980d0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f55987E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f55988F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f55989G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f55990H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f55991I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f55992J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55993w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f55994x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f55995y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f55996z;

    public /* synthetic */ C14980d0(Modifier modifier, Integer num, TextResource textResource, C33182g1 c33182g1, TextResource textResource2, boolean z4, long j7, int i13, int i14) {
        this.f55994x = modifier;
        this.f55989G = num;
        this.f55990H = textResource;
        this.f55991I = c33182g1;
        this.f55992J = textResource2;
        this.f55995y = z4;
        this.f55996z = j7;
        this.f55987E = i13;
        this.f55988F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55993w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC15002f0.m43105a(this.f55995y, (InterfaceC4339a) this.f55989G, this.f55994x, this.f55996z, (C13821r1) this.f55990H, (C3966j0) this.f55991I, (Function3) this.f55992J, (Composer) obj, AbstractC28683x.m87244L(this.f55987E | 1), this.f55988F);
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33200m1.m105253c(this.f55994x, (Integer) this.f55989G, (TextResource) this.f55990H, (C33182g1) this.f55991I, (TextResource) this.f55992J, this.f55995y, this.f55996z, this.f55987E, this.f55988F, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C14980d0(boolean z4, InterfaceC4339a interfaceC4339a, Modifier modifier, long j7, C13821r1 c13821r1, C3966j0 c3966j0, Function3 function3, int i13, int i14) {
        this.f55995y = z4;
        this.f55989G = interfaceC4339a;
        this.f55994x = modifier;
        this.f55996z = j7;
        this.f55990H = c13821r1;
        this.f55991I = c3966j0;
        this.f55992J = function3;
        this.f55987E = i13;
        this.f55988F = i14;
    }
}
