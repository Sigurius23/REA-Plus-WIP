package be1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import or2.C28205u0;
import p715kotlin.jvm.functions.Function1;
import zd1.InterfaceC40549d;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: be1.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3170d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC41070a f12397E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f12398F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f12399G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12400w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f12401x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC40549d.a f12402y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C28205u0 f12403z;

    public /* synthetic */ C3170d(Function1 function1, InterfaceC40549d.a aVar, C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, Function1 function2, int i13) {
        this.f12401x = function1;
        this.f12402y = aVar;
        this.f12403z = c28205u0;
        this.f12397E = interfaceC41070a;
        this.f12398F = function2;
        this.f12399G = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12400w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                Function1 function1 = this.f12401x;
                InterfaceC40549d.a aVar = this.f12402y;
                C28205u0 c28205u0 = this.f12403z;
                InterfaceC41070a interfaceC41070a = this.f12397E;
                return AbstractC3173g.m9081N(aVar, function1, this.f12398F, c28205u0, interfaceC41070a, this.f12399G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC3173g.m9089V(this.f12401x, this.f12402y, this.f12403z, this.f12397E, this.f12398F, this.f12399G, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C3170d(InterfaceC40549d.a aVar, Function1 function1, Function1 function2, C28205u0 c28205u0, InterfaceC41070a interfaceC41070a, int i13) {
        this.f12402y = aVar;
        this.f12401x = function1;
        this.f12398F = function2;
        this.f12403z = c28205u0;
        this.f12397E = interfaceC41070a;
        this.f12399G = i13;
    }
}
