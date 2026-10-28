package p702ch0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import hy0.AbstractC17763k2;
import i93.InterfaceC18280f;
import p132f0.C13821r1;
import p715kotlin.jvm.functions.Function1;
import zg0.C40626i;

/* JADX INFO: renamed from: ch0.g */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C4620g implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f18622E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f18623F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f18624G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f18625H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18626w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f18627x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f18628y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f18629z;

    public /* synthetic */ C4620g(Modifier modifier, boolean z4, float f13, Function1 function1, InterfaceC18280f interfaceC18280f, int i13, InterfaceC4339a interfaceC4339a) {
        this.f18627x = modifier;
        this.f18628y = z4;
        this.f18629z = f13;
        this.f18623F = function1;
        this.f18624G = interfaceC18280f;
        this.f18622E = i13;
        this.f18625H = interfaceC4339a;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18626w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4639n.m14478Q((C4656v0) this.f18623F, (C40626i) this.f18624G, this.f18627x, (C13821r1) this.f18625H, this.f18629z, this.f18628y, this.f18622E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC17763k2.m50957e(this.f18627x, this.f18628y, this.f18629z, (Function1) this.f18623F, (InterfaceC18280f) this.f18624G, this.f18622E, (InterfaceC4339a) this.f18625H, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C4620g(C4656v0 c4656v0, C40626i c40626i, Modifier modifier, C13821r1 c13821r1, float f13, boolean z4, int i13) {
        this.f18623F = c4656v0;
        this.f18624G = c40626i;
        this.f18627x = modifier;
        this.f18625H = c13821r1;
        this.f18629z = f13;
        this.f18628y = z4;
        this.f18622E = i13;
    }
}
