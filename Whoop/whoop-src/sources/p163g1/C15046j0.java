package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p208i2.InterfaceC17869a1;
import p291l0.InterfaceC22940b2;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p602x1.C37816b;

/* JADX INFO: renamed from: g1.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15046j0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f56327E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C37816b f56328F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f56329G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f56330H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f56331I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56332w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f56333x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f56334y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ long f56335z;

    public /* synthetic */ C15046j0(long j7, long j13, float f13, InterfaceC22973k1 interfaceC22973k1, InterfaceC22940b2 interfaceC22940b2, Modifier modifier, C37816b c37816b, int i13) {
        this.f56334y = j7;
        this.f56335z = j13;
        this.f56327E = f13;
        this.f56330H = interfaceC22973k1;
        this.f56331I = interfaceC22940b2;
        this.f56333x = modifier;
        this.f56328F = c37816b;
        this.f56329G = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56332w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC15086n0.m43157a(this.f56334y, this.f56335z, this.f56327E, (InterfaceC22973k1) this.f56330H, (InterfaceC22940b2) this.f56331I, this.f56333x, this.f56328F, (Composer) obj, AbstractC28683x.m87244L(this.f56329G | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC15142s6.m43188b(this.f56333x, (InterfaceC4351m) this.f56330H, (InterfaceC17869a1) this.f56331I, this.f56334y, this.f56335z, this.f56327E, this.f56328F, (Composer) obj, AbstractC28683x.m87244L(this.f56329G | 1));
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C15046j0(Modifier modifier, InterfaceC4351m interfaceC4351m, InterfaceC17869a1 interfaceC17869a1, long j7, long j13, float f13, C37816b c37816b, int i13) {
        this.f56333x = modifier;
        this.f56330H = interfaceC4351m;
        this.f56331I = interfaceC17869a1;
        this.f56334y = j7;
        this.f56335z = j13;
        this.f56327E = f13;
        this.f56328F = c37816b;
        this.f56329G = i13;
    }
}
