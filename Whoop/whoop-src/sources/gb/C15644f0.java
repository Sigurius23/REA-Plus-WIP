package gb;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p026b2.InterfaceC2302h;
import p114eb.C12985r0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: gb.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15644f0 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC2302h f58709E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f58710F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Function1 f58711G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Function1 f58712H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Function1 f58713I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Function1 f58714J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ int f58715K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int f58716L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58717w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12991u0 f58718x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12985r0 f58719y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Modifier f58720z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15644f0(C12991u0 c12991u0, C12985r0 c12985r0, Modifier modifier, InterfaceC2302h interfaceC2302h, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, int i13, int i14, int i15) {
        super(2);
        this.f58717w = i15;
        this.f58718x = c12991u0;
        this.f58719y = c12985r0;
        this.f58720z = modifier;
        this.f58709E = interfaceC2302h;
        this.f58710F = function1;
        this.f58711G = function2;
        this.f58712H = function3;
        this.f58713I = function4;
        this.f58714J = function5;
        this.f58715K = i13;
        this.f58716L = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58717w) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC17269i.m48884c(this.f58718x, this.f58719y, this.f58720z, this.f58709E, this.f58710F, this.f58711G, this.f58712H, this.f58713I, this.f58714J, (Composer) obj, AbstractC28683x.m87244L(this.f58715K | 1), this.f58716L);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC17269i.m48884c(this.f58718x, this.f58719y, this.f58720z, this.f58709E, this.f58710F, this.f58711G, this.f58712H, this.f58713I, this.f58714J, (Composer) obj, AbstractC28683x.m87244L(this.f58715K | 1), this.f58716L);
                break;
        }
        return C23454a0.f92919a;
    }
}
