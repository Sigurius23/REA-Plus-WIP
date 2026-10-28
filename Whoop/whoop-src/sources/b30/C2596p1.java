package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch.C4597r;
import l83.C23454a0;
import p026b2.InterfaceC2302h;
import p097ds.AbstractC12313p;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p635y2.InterfaceC39105k;
import p636y3.C39174f;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: b30.p1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2596p1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f10093E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f10094F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f10095G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f10096H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f10097I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f10098J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10099w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f10100x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f10101y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f10102z;

    public /* synthetic */ C2596p1(InterfaceC4339a interfaceC4339a, String str, Modifier modifier, EnumC2586o enumC2586o, EnumC2594p enumC2594p, C39174f c39174f, float f13, boolean z4, int i13) {
        this.f10095G = interfaceC4339a;
        this.f10101y = str;
        this.f10100x = modifier;
        this.f10096H = enumC2586o;
        this.f10097I = enumC2594p;
        this.f10098J = c39174f;
        this.f10102z = f13;
        this.f10093E = z4;
        this.f10094F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10099w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC37926s0.m121468f((InterfaceC4339a) this.f10095G, this.f10101y, this.f10100x, (EnumC2586o) this.f10096H, (EnumC2594p) this.f10097I, (C39174f) this.f10098J, this.f10102z, this.f10093E, (Composer) obj, AbstractC28683x.m87244L(this.f10094F | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC12313p.m34297o((C4597r) this.f10095G, this.f10100x, (AbstractC26165a) this.f10096H, this.f10101y, (InterfaceC2302h) this.f10097I, (InterfaceC39105k) this.f10098J, this.f10102z, this.f10093E, (Composer) obj, AbstractC28683x.m87244L(this.f10094F | 1));
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C2596p1(C4597r c4597r, Modifier modifier, AbstractC26165a abstractC26165a, String str, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, float f13, boolean z4, int i13) {
        this.f10095G = c4597r;
        this.f10100x = modifier;
        this.f10096H = abstractC26165a;
        this.f10101y = str;
        this.f10097I = interfaceC2302h;
        this.f10098J = interfaceC39105k;
        this.f10102z = f13;
        this.f10093E = z4;
        this.f10094F = i13;
    }
}
