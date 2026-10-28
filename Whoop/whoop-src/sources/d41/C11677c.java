package d41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import kd1.AbstractC22403o;
import ny0.AbstractC27271o0;
import p132f0.C13825t;
import p163g1.InterfaceC15156u0;
import p291l0.InterfaceC22973k1;

/* JADX INFO: renamed from: d41.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C11677c implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f37738E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f37739F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f37740G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f37741H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f37742I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f37743J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f37744K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f37745L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object f37746M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Object f37747N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Object f37748O;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37749w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f37750x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f37751y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Integer f37752z;

    public /* synthetic */ C11677c(Modifier modifier, boolean z4, TextResource textResource, C2886a c2886a, InterfaceC15156u0 interfaceC15156u0, C13825t c13825t, Integer num, Modifier modifier2, boolean z13, InterfaceC22973k1 interfaceC22973k1, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        this.f37742I = modifier;
        this.f37750x = z4;
        this.f37751y = textResource;
        this.f37743J = c2886a;
        this.f37744K = interfaceC15156u0;
        this.f37745L = c13825t;
        this.f37752z = num;
        this.f37746M = modifier2;
        this.f37738E = z13;
        this.f37747N = interfaceC22973k1;
        this.f37748O = interfaceC4339a;
        this.f37739F = i13;
        this.f37740G = i14;
        this.f37741H = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37749w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC11679e.m31100F((EnumC11681g) this.f37742I, (AbstractC22403o) this.f37743J, this.f37751y, this.f37752z, (TextResource) this.f37744K, (TextResource) this.f37745L, (TextResource) this.f37746M, (TextResource) this.f37747N, this.f37750x, (AbstractC11684j) this.f37748O, this.f37738E, this.f37739F, this.f37740G, this.f37741H, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC27271o0.m82254c((Modifier) this.f37742I, this.f37750x, this.f37751y, (C2886a) this.f37743J, (InterfaceC15156u0) this.f37744K, (C13825t) this.f37745L, this.f37752z, (Modifier) this.f37746M, this.f37738E, (InterfaceC22973k1) this.f37747N, (InterfaceC4339a) this.f37748O, this.f37739F, this.f37740G, this.f37741H, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C11677c(EnumC11681g enumC11681g, AbstractC22403o abstractC22403o, TextResource textResource, Integer num, TextResource textResource2, TextResource textResource3, TextResource textResource4, TextResource textResource5, boolean z4, AbstractC11684j abstractC11684j, boolean z13, int i13, int i14, int i15) {
        this.f37742I = enumC11681g;
        this.f37743J = abstractC22403o;
        this.f37751y = textResource;
        this.f37752z = num;
        this.f37744K = textResource2;
        this.f37745L = textResource3;
        this.f37746M = textResource4;
        this.f37747N = textResource5;
        this.f37750x = z4;
        this.f37748O = abstractC11684j;
        this.f37738E = z13;
        this.f37739F = i13;
        this.f37740G = i14;
        this.f37741H = i15;
    }
}
