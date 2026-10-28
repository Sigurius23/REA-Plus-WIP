package ny0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import p132f0.C13825t;
import p163g1.InterfaceC15156u0;

/* JADX INFO: renamed from: ny0.b0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C27241b0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC15156u0 f109027E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C13825t f109028F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Integer f109029G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4339a f109030H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f109031I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f109032J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f109033w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f109034x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f109035y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ TextResource f109036z;

    public /* synthetic */ C27241b0(Modifier modifier, boolean z4, TextResource textResource, InterfaceC15156u0 interfaceC15156u0, C13825t c13825t, Integer num, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f109034x = modifier;
        this.f109035y = z4;
        this.f109036z = textResource;
        this.f109027E = interfaceC15156u0;
        this.f109028F = c13825t;
        this.f109029G = num;
        this.f109030H = interfaceC4339a;
        this.f109031I = i13;
        this.f109032J = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f109033w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                Modifier modifier = this.f109034x;
                boolean z4 = this.f109035y;
                TextResource textResource = this.f109036z;
                InterfaceC15156u0 interfaceC15156u0 = this.f109027E;
                C13825t c13825t = this.f109028F;
                return AbstractC27244c0.m82099c(modifier, z4, this.f109029G, textResource, interfaceC15156u0, c13825t, this.f109030H, this.f109031I, this.f109032J, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC27275q0.m82279c(this.f109034x, this.f109035y, this.f109036z, this.f109027E, this.f109028F, this.f109029G, this.f109030H, this.f109031I, this.f109032J, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C27241b0(Modifier modifier, boolean z4, Integer num, TextResource textResource, InterfaceC15156u0 interfaceC15156u0, C13825t c13825t, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f109034x = modifier;
        this.f109035y = z4;
        this.f109029G = num;
        this.f109036z = textResource;
        this.f109027E = interfaceC15156u0;
        this.f109028F = c13825t;
        this.f109030H = interfaceC4339a;
        this.f109031I = i13;
        this.f109032J = i14;
    }
}
